package org.joda.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
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
        boolean boolean15 = dateTimeZone3.isStandardOffset(101L);
        long long18 = dateTimeZone3.convertLocalToUTC((-1570084924000L), false);
        long long21 = dateTimeZone3.adjustOffset(3659900L, false);
        long long23 = dateTimeZone3.convertUTCToLocal(36059979L);
        long long26 = dateTimeZone3.adjustOffset((-1570434124100L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "1) test4501(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115800000 + "'", int7 == 115800000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "1) test4501(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
// flaky "1) test4501(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115800000 + "'", int10 == 115800000);
// flaky "1) test4501(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:10" + "'", str13, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "1) test4501(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570200724000L) + "'", long18 == (-1570200724000L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3659900L + "'", long21 == 3659900L);
// flaky "1) test4501(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 151859979L + "'", long23 == 151859979L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570434124100L) + "'", long26 == (-1570434124100L));
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 35);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        long long7 = dateTimeZone1.previousTransition((-1570084984201L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "2) test4502(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115800000 + "'", int3 == 115800000);
// flaky "2) test4502(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115800000 + "'", int5 == 115800000);
// flaky "2) test4502(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570084984201L) + "'", long7 == (-1570084984201L));
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        int int8 = dateTimeZone1.getOffset(25199951L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky "3) test4503(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
// flaky "3) test4503(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115800000 + "'", int8 == 115800000);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        java.lang.String str4 = dateTimeZone2.getNameKey(1L);
        int int6 = dateTimeZone2.getStandardOffset(36000002L);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone8.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone8.getOffset(readableInstant11);
        java.lang.Object obj13 = dateTimeZone8.writeReplace();
        long long15 = dateTimeZone8.previousTransition(97L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone8.getShortName((long) 35, locale17);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone8.getShortName((-1570200724100L), locale20);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str25 = dateTimeZone23.getNameKey((long) 115800000);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone23.getShortName((-1570084924001L), locale27);
        long long30 = dateTimeZone8.getMillisKeepLocal(dateTimeZone23, (long) (short) 1);
        long long32 = dateTimeZone2.getMillisKeepLocal(dateTimeZone23, 0L);
        java.lang.String str34 = dateTimeZone2.getNameKey((-324600000L));
        long long37 = dateTimeZone2.adjustOffset(110L, true);
        long long39 = dateTimeZone2.previousTransition((-3600002L));
        org.joda.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = dateTimeZone2.isLocalDateTimeGap(localDateTime40);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2100000 + "'", int6 == 2100000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
// flaky "4) test4504(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115800000 + "'", int12 == 115800000);
        org.junit.Assert.assertNotNull(obj13);
// flaky "4) test4504(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "3) test4504(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:10" + "'", str18, "+32:10");
// flaky "2) test4504(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:10" + "'", str21, "+32:10");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
// flaky "2) test4504(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 115800002L + "'", long30 == 115800002L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 2100001L + "'", long32 == 2100001L);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 110L + "'", long37 == 110L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-3600002L) + "'", long39 == (-3600002L));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
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
        java.lang.Object obj25 = dateTimeZone1.writeReplace();
        java.lang.String str26 = dateTimeZone1.getID();
        java.lang.String str27 = dateTimeZone1.toString();
        java.util.TimeZone timeZone28 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "5) test4505(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:10" + "'", str4, "+32:10");
// flaky "5) test4505(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "4) test4505(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-90600000L) + "'", long10 == (-90600000L));
// flaky "3) test4505(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-115799899L) + "'", long12 == (-115799899L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 98L + "'", long22 == 98L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 101L + "'", long24 == 101L);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.001" + "'", str26, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.001" + "'", str27, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
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
        int int24 = dateTimeZone22.getOffsetFromLocal((-115799899L));
        java.lang.String str25 = dateTimeZone22.toString();
        long long29 = dateTimeZone22.convertLocalToUTC(0L, true, (-3600002L));
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
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        int int8 = dateTimeZone1.getOffsetFromLocal(25200052L);
        long long10 = dateTimeZone1.nextTransition(115260050L);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115260050L + "'", long10 == 115260050L);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 10);
        boolean boolean4 = dateTimeZone2.isStandardOffset(36000100L);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+:0:10");
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
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
        java.lang.String str15 = dateTimeZone3.getShortName((-1569969663900L), locale14);
        int int17 = dateTimeZone3.getOffset((-35999989L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
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
        java.lang.String str48 = dateTimeZone1.getNameKey(25200052L);
        java.util.Locale locale50 = null;
        java.lang.String str51 = dateTimeZone1.getName(90059947L, locale50);
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
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "-00:00:00.001" + "'", str51, "-00:00:00.001");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
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
        long long16 = dateTimeZone3.convertLocalToUTC(119400000L, false, (long) 52);
        long long18 = dateTimeZone3.convertUTCToLocal((-91L));
        long long20 = dateTimeZone3.previousTransition((-61199969L));
        long long22 = dateTimeZone3.nextTransition((-1570084924003L));
        long long24 = dateTimeZone3.nextTransition((-360719904L));
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 119399999L + "'", long16 == 119399999L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-90L) + "'", long18 == (-90L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-61199969L) + "'", long20 == (-61199969L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1570084924003L) + "'", long22 == (-1570084924003L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-360719904L) + "'", long24 == (-360719904L));
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        long long5 = dateTimeZone0.adjustOffset((-1570200724100L), true);
        long long7 = dateTimeZone0.nextTransition((-61199901L));
        java.lang.String str9 = dateTimeZone0.getNameKey((-1570084984101L));
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone0.isLocalDateTimeGap(localDateTime10);
        java.util.TimeZone timeZone12 = dateTimeZone0.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570200724100L) + "'", long5 == (-1570200724100L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-61199901L) + "'", long7 == (-61199901L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
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
        long long15 = dateTimeZone1.previousTransition((-99L));
        java.lang.String str17 = dateTimeZone1.getNameKey((long) '4');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName(25200002L, locale19);
        java.lang.String str22 = dateTimeZone1.getShortName(115800004L);
        long long24 = dateTimeZone1.previousTransition((-90060000L));
        java.lang.String str26 = dateTimeZone1.getNameKey((-25200101L));
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone1.getOffset(readableInstant27);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone1.getName((-59900L), locale30);
        boolean boolean33 = dateTimeZone1.isStandardOffset((-1570081264101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-99L) + "'", long15 == (-99L));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-90060000L) + "'", long24 == (-90060000L));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.001" + "'", str31, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
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
        long long14 = dateTimeZone11.convertLocalToUTC(60032L, false);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        int int17 = dateTimeZone15.getStandardOffset((-59904L));
        long long19 = dateTimeZone11.getMillisKeepLocal(dateTimeZone15, (-35939900L));
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone15.getShortName(35940032L, locale21);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone15.getShortName((long) 2100000, locale24);
        java.lang.String str27 = dateTimeZone15.getNameKey(119399996L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60032L + "'", long14 == 60032L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-35939900L) + "'", long19 == (-35939900L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '#');
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT-01:35");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 0);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        int int6 = dateTimeZone4.getOffset((-35999901L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj16 = dateTimeZone15.writeReplace();
        java.lang.String str17 = dateTimeZone15.getID();
        long long19 = dateTimeZone15.previousTransition(25200000L);
        long long21 = dateTimeZone15.nextTransition((-1570048923999L));
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, 2099909L);
        java.lang.String str25 = dateTimeZone15.getName((-540098L));
        boolean boolean27 = dateTimeZone15.isStandardOffset(115800032L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25200000L + "'", long19 == 25200000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1570048923999L) + "'", long21 == (-1570048923999L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2099910L + "'", long23 == 2099910L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 1, false, 97L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 52);
        java.lang.String str3 = dateTimeZone2.getID();
        int int5 = dateTimeZone2.getOffset((-1570164664001L));
        java.lang.String str6 = dateTimeZone2.getID();
        java.lang.String str7 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+100:52" + "'", str3, "+100:52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 363120000 + "'", int5 == 363120000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+100:52" + "'", str6, "+100:52");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:52" + "'", str7, "+100:52");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:01");
        java.lang.String str3 = dateTimeZone1.getNameKey(101L);
        long long5 = dateTimeZone1.nextTransition(83400000L);
        java.lang.String str6 = dateTimeZone1.getID();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName(140459900L, locale8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 83400000L + "'", long5 == 83400000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:01" + "'", str6, "-01:01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-01:01" + "'", str9, "-01:01");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
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
        boolean boolean13 = dateTimeZone10.isFixed();
        int int15 = dateTimeZone10.getStandardOffset(0L);
        java.lang.String str16 = dateTimeZone10.toString();
        java.util.TimeZone timeZone17 = dateTimeZone10.toTimeZone();
        java.lang.String str19 = dateTimeZone10.getShortName(0L);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone10.getName(28860001L, locale21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        long long11 = dateTimeZone1.convertLocalToUTC(115799900L, false);
        java.lang.String str13 = dateTimeZone1.getNameKey((-35999899L));
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        java.lang.String str16 = dateTimeZone1.getNameKey((-92L));
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj19 = dateTimeZone18.writeReplace();
        java.lang.String str20 = dateTimeZone18.getID();
        long long23 = dateTimeZone18.convertLocalToUTC((long) 'a', true);
        int int25 = dateTimeZone18.getStandardOffset(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        long long28 = dateTimeZone1.getMillisKeepLocal(dateTimeZone18, 79260152L);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 100);
        java.lang.Object obj31 = dateTimeZone30.writeReplace();
        int int33 = dateTimeZone30.getOffset(115800050L);
        java.lang.String str34 = dateTimeZone30.getID();
        long long36 = dateTimeZone1.getMillisKeepLocal(dateTimeZone30, (-360599952L));
        long long38 = dateTimeZone1.convertUTCToLocal((-2099900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25200000L + "'", long8 == 25200000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115799900L + "'", long11 == 115799900L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 98L + "'", long23 == 98L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 79260153L + "'", long28 == 79260153L);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.100" + "'", str34, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-360600052L) + "'", long36 == (-360600052L));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-2099900L) + "'", long38 == (-2099900L));
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
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
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        long long34 = dateTimeZone30.getMillisKeepLocal(dateTimeZone32, (long) 'a');
        int int36 = dateTimeZone32.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone37 = dateTimeZone32.toTimeZone();
        java.util.TimeZone timeZone38 = dateTimeZone32.toTimeZone();
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone32.getName((long) (short) 10, locale40);
        boolean boolean43 = dateTimeZone32.equals((java.lang.Object) (byte) 0);
        java.lang.String str45 = dateTimeZone32.getName(115799900L);
        org.joda.time.LocalDateTime localDateTime46 = null;
        boolean boolean47 = dateTimeZone32.isLocalDateTimeGap(localDateTime46);
        long long49 = dateTimeZone32.previousTransition((-1570214044099L));
        boolean boolean50 = dateTimeZone28.equals((java.lang.Object) dateTimeZone32);
        long long52 = dateTimeZone28.previousTransition((-35999905L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 97L + "'", long34 == 97L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-00:00:00.001" + "'", str41, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-00:00:00.001" + "'", str45, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1570214044099L) + "'", long49 == (-1570214044099L));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-35999905L) + "'", long52 == (-35999905L));
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
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
        int int53 = dateTimeZone1.getOffsetFromLocal((-1570084923903L));
        java.util.Locale locale55 = null;
        java.lang.String str56 = dateTimeZone1.getName(125999957L, locale55);
        java.lang.Class<?> wildcardClass57 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570084924000L) + "'", long26 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-00:00:00.001" + "'", str31, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 115800000 + "'", int36 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 97L + "'", long42 == 97L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-00:00:00.001" + "'", str45, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "-00:00:00.001" + "'", str56, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str11 = dateTimeZone10.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        long long16 = dateTimeZone14.nextTransition((long) (short) 100);
        int int18 = dateTimeZone14.getOffsetFromLocal(100L);
        long long20 = dateTimeZone10.getMillisKeepLocal(dateTimeZone14, (long) 115800000);
        java.lang.String str22 = dateTimeZone14.getNameKey((long) 115800000);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long29 = dateTimeZone26.convertLocalToUTC((long) 1, true);
        long long31 = dateTimeZone24.getMillisKeepLocal(dateTimeZone26, 32L);
        long long33 = dateTimeZone14.getMillisKeepLocal(dateTimeZone26, 0L);
        long long35 = dateTimeZone3.getMillisKeepLocal(dateTimeZone14, (long) 35);
        int int37 = dateTimeZone3.getStandardOffset(115740002L);
        boolean boolean39 = dateTimeZone3.isStandardOffset((-1569724324000L));
        long long42 = dateTimeZone3.adjustOffset((-271140100L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 115800000L + "'", long20 == 115800000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-99L) + "'", long29 == (-99L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 35999932L + "'", long31 == 35999932L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-101L) + "'", long33 == (-101L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 35L + "'", long35 == 35L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-271140100L) + "'", long42 == (-271140100L));
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj4 = dateTimeZone3.writeReplace();
        java.lang.String str5 = dateTimeZone3.getID();
        long long8 = dateTimeZone3.convertLocalToUTC((long) 'a', true);
        int int10 = dateTimeZone3.getStandardOffset(0L);
        long long14 = dateTimeZone3.convertLocalToUTC(102L, false, 2L);
        long long18 = dateTimeZone3.convertLocalToUTC((long) (byte) 1, false, (-25740001L));
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 119400001L);
        long long23 = dateTimeZone1.convertLocalToUTC((-59899L), true);
        java.lang.Object obj24 = dateTimeZone1.writeReplace();
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone1.getName((-1570086964046L), locale26);
        java.lang.String str28 = dateTimeZone1.toString();
        long long31 = dateTimeZone1.adjustOffset(0L, false);
        java.lang.String str32 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 103L + "'", long14 == 103L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 155400002L + "'", long20 == 155400002L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-36059899L) + "'", long23 == (-36059899L));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+10:00" + "'", str27, "+10:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+10:00" + "'", str28, "+10:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+10:00" + "'", str32, "+10:00");
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 10);
        int int4 = dateTimeZone2.getStandardOffset((-99L));
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str9 = dateTimeZone8.getID();
        long long11 = dateTimeZone8.previousTransition((-1L));
        long long15 = dateTimeZone8.convertLocalToUTC(25200000L, true, 100L);
        long long17 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, 100L);
        long long19 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, (-1570084924101L));
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        long long22 = dateTimeZone2.getMillisKeepLocal(dateTimeZone20, (-1570200184100L));
        long long26 = dateTimeZone2.convertLocalToUTC((-25200101L), false, 25199948L);
        long long28 = dateTimeZone2.nextTransition(231480001L);
        long long32 = dateTimeZone2.convertLocalToUTC((-59990L), true, 115259968L);
        long long35 = dateTimeZone2.adjustOffset((-1570084924135L), false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25200001L + "'", long15 == 25200001L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 102L + "'", long17 == 102L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1569969124100L) + "'", long19 == (-1569969124100L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1570084384099L) + "'", long22 == (-1570084384099L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-141000101L) + "'", long26 == (-141000101L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 231480001L + "'", long28 == 231480001L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-115859990L) + "'", long32 == (-115859990L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1570084924135L) + "'", long35 == (-1570084924135L));
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        boolean boolean7 = dateTimeZone1.isFixed();
        long long11 = dateTimeZone1.convertLocalToUTC(115260050L, true, (-1570084924102L));
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        long long15 = dateTimeZone1.convertLocalToUTC((-1570084864002L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115260051L + "'", long11 == 115260051L);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084864001L) + "'", long15 == (-1570084864001L));
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
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
        java.lang.String str19 = dateTimeZone2.getNameKey(3600111L);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone2.getShortName(115740032L, locale21);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:10" + "'", str22, "+32:10");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset(0L);
        int int7 = dateTimeZone1.getStandardOffset((-1570084924201L));
        boolean boolean9 = dateTimeZone1.isStandardOffset(99L);
        int int11 = dateTimeZone1.getOffsetFromLocal(200L);
        boolean boolean12 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        java.lang.String str8 = dateTimeZone1.getShortName(25200052L);
        long long11 = dateTimeZone1.adjustOffset(0L, false);
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        long long14 = dateTimeZone1.nextTransition((-129119929L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-129119929L) + "'", long14 == (-129119929L));
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        long long3 = dateTimeZone1.previousTransition(115800002L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-25740001L), locale5);
        int int8 = dateTimeZone1.getOffset(0L);
        long long11 = dateTimeZone1.convertLocalToUTC(44L, false);
        long long13 = dateTimeZone1.convertUTCToLocal((-1570516924101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115800002L + "'", long3 == 115800002L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+100:00" + "'", str6, "+100:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 360000000 + "'", int8 == 360000000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-359999956L) + "'", long11 == (-359999956L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570156924101L) + "'", long13 == (-1570156924101L));
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone1.getNameKey((-1570084924047L));
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        boolean boolean9 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        int int17 = dateTimeZone13.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone18 = dateTimeZone13.toTimeZone();
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone13.getName((long) (short) 10, locale21);
        java.lang.String str24 = dateTimeZone13.getName(0L);
        long long26 = dateTimeZone13.previousTransition(25200052L);
        boolean boolean28 = dateTimeZone13.isStandardOffset((-35999901L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone13.isLocalDateTimeGap(localDateTime30);
        long long33 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, 2100000L);
        java.util.TimeZone timeZone34 = dateTimeZone1.toTimeZone();
        long long36 = dateTimeZone1.nextTransition((-61199969L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 25200052L + "'", long26 == 25200052L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 2100000L + "'", long33 == 2100000L);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-61199969L) + "'", long36 == (-61199969L));
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        java.lang.String str8 = dateTimeZone1.getShortName(25200052L);
        long long12 = dateTimeZone1.convertLocalToUTC(89519901L, true, (-1570084384200L));
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone14.getName((-25740000L), locale16);
        int int19 = dateTimeZone14.getStandardOffset((long) 126060000);
        long long22 = dateTimeZone14.adjustOffset((-79799988L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 89519902L + "'", long12 == 89519902L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-79799988L) + "'", long22 == (-79799988L));
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        long long5 = dateTimeZone1.adjustOffset(36000000L, true);
        java.lang.String str7 = dateTimeZone1.getNameKey((-1570200724001L));
        int int9 = dateTimeZone1.getOffsetFromLocal(0L);
        java.lang.String str10 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 36000000L + "'", long5 == 36000000L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.035" + "'", str10, "+00:00:00.035");
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360600000);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 52);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName(9L, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+:0:10\" is malformed at \":0:10\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+100:10" + "'", str6, "+100:10");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+:0:10");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
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
        long long19 = dateTimeZone1.convertLocalToUTC((-1570012923999L), false, (-1570084984001L));
        java.lang.String str21 = dateTimeZone1.getName(115740100L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long28 = dateTimeZone25.convertLocalToUTC((long) 1, true);
        long long30 = dateTimeZone23.getMillisKeepLocal(dateTimeZone25, 32L);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone23.getName((long) 60000, locale32);
        long long35 = dateTimeZone1.getMillisKeepLocal(dateTimeZone23, 60002L);
        long long38 = dateTimeZone23.convertLocalToUTC(25140003L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1570012923998L) + "'", long19 == (-1570012923998L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-99L) + "'", long28 == (-99L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 35999932L + "'", long30 == 35999932L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+10:00" + "'", str33, "+10:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-35939999L) + "'", long35 == (-35939999L));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-10859997L) + "'", long38 == (-10859997L));
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
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
        java.lang.String str33 = dateTimeZone18.getName(115799965L);
        java.lang.String str35 = dateTimeZone18.getNameKey((long) 115260000);
        long long37 = dateTimeZone18.nextTransition(151200100L);
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone18.getName(3660000L, locale39);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-00:00:00.001" + "'", str26, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-00:00:00.001" + "'", str29, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-115800099L) + "'", long31 == (-115800099L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-00:00:00.001" + "'", str33, "-00:00:00.001");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 151200100L + "'", long37 == 151200100L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-00:00:00.001" + "'", str40, "-00:00:00.001");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj4 = dateTimeZone3.writeReplace();
        java.lang.String str5 = dateTimeZone3.getID();
        long long8 = dateTimeZone3.convertLocalToUTC((long) 'a', true);
        int int10 = dateTimeZone3.getStandardOffset(0L);
        long long14 = dateTimeZone3.convertLocalToUTC(102L, false, 2L);
        long long18 = dateTimeZone3.convertLocalToUTC((long) (byte) 1, false, (-25740001L));
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 119400001L);
        long long22 = dateTimeZone1.previousTransition(35999999L);
        long long25 = dateTimeZone1.adjustOffset(709200100L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 103L + "'", long14 == 103L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 155400002L + "'", long20 == 155400002L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35999999L + "'", long22 == 35999999L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 709200100L + "'", long25 == 709200100L);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, 126000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 126000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        int int12 = dateTimeZone1.getOffset((long) '#');
        long long14 = dateTimeZone1.nextTransition((-2L));
        java.lang.String str16 = dateTimeZone1.getShortName(1L);
        int int18 = dateTimeZone1.getStandardOffset(36000036L);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(25200000);
        java.lang.String str22 = dateTimeZone20.getNameKey(59999L);
        boolean boolean23 = dateTimeZone1.equals((java.lang.Object) 59999L);
        long long27 = dateTimeZone1.convertLocalToUTC(187200000L, false, (-97199901L));
        long long30 = dateTimeZone1.convertLocalToUTC(115800000L, false);
        java.lang.String str32 = dateTimeZone1.getNameKey((-2099900L));
        long long34 = dateTimeZone1.convertUTCToLocal((-1570084924098L));
        long long36 = dateTimeZone1.previousTransition(115799950L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2L) + "'", long14 == (-2L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 187200001L + "'", long27 == 187200001L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 115800001L + "'", long30 == 115800001L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1570084924099L) + "'", long34 == (-1570084924099L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 115799950L + "'", long36 == 115799950L);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
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
        java.lang.String str16 = dateTimeZone1.getShortName(115260011L);
        long long19 = dateTimeZone1.convertLocalToUTC((-90L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-89L) + "'", long19 == (-89L));
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
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
        long long49 = dateTimeZone30.previousTransition((-1570308124201L));
        org.joda.time.LocalDateTime localDateTime50 = null;
        boolean boolean51 = dateTimeZone30.isLocalDateTimeGap(localDateTime50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        long long54 = dateTimeZone30.getMillisKeepLocal(dateTimeZone52, 25200002L);
        long long57 = dateTimeZone30.adjustOffset((-1570120924002L), false);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570084924000L) + "'", long26 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 97L + "'", long34 == 97L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-35999901L) + "'", long43 == (-35999901L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 25200001L + "'", long47 == 25200001L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1570308124201L) + "'", long49 == (-1570308124201L));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 25200002L + "'", long54 == 25200002L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1570120924002L) + "'", long57 == (-1570120924002L));
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
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
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone1.getOffset(readableInstant18);
        java.lang.Object obj20 = dateTimeZone1.writeReplace();
        java.lang.String str22 = dateTimeZone1.getNameKey((-1570120923999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        java.lang.String str10 = dateTimeZone1.getName((-25200001L));
        long long13 = dateTimeZone1.adjustOffset((long) 25200000, true);
        java.lang.String str15 = dateTimeZone1.getNameKey(25199899L);
        long long18 = dateTimeZone1.convertLocalToUTC(0L, false);
        long long22 = dateTimeZone1.convertLocalToUTC((-1569688324000L), false, (-1570084923903L));
        int int24 = dateTimeZone1.getStandardOffset((-231600033L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 25200000L + "'", long13 == 25200000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1569688323999L) + "'", long22 == (-1569688323999L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
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
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getShortName((long) 35, locale17);
        java.lang.String str19 = dateTimeZone1.getID();
        java.lang.String str20 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset(0L);
        int int7 = dateTimeZone1.getStandardOffset((-1570084924201L));
        boolean boolean9 = dateTimeZone1.isStandardOffset(99L);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-99L), locale12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone15.isLocalDateTimeGap(localDateTime16);
        long long19 = dateTimeZone15.nextTransition(115799900L);
        int int21 = dateTimeZone15.getOffsetFromLocal(2100000L);
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) dateTimeZone15);
        boolean boolean23 = dateTimeZone15.isFixed();
        java.lang.String str25 = dateTimeZone15.getShortName((-115739964L));
        java.lang.String str26 = dateTimeZone15.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115799900L + "'", long19 == 115799900L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.001" + "'", str25, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.001" + "'", str26, "+00:00:00.001");
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
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
        java.lang.String str23 = dateTimeZone6.getNameKey((-1570164724002L));
        java.lang.String str25 = dateTimeZone6.getShortName((-119460001L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
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
        long long15 = dateTimeZone1.previousTransition((-99L));
        java.lang.String str17 = dateTimeZone1.getNameKey((long) '4');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName(25200002L, locale19);
        java.lang.String str22 = dateTimeZone1.getShortName(115800004L);
        long long24 = dateTimeZone1.previousTransition((-90060000L));
        java.lang.String str26 = dateTimeZone1.getNameKey((-25200101L));
        int int28 = dateTimeZone1.getOffsetFromLocal(60200L);
        java.util.TimeZone timeZone29 = dateTimeZone1.toTimeZone();
        long long31 = dateTimeZone1.nextTransition((-3599998L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-99L) + "'", long15 == (-99L));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-90060000L) + "'", long24 == (-90060000L));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-3599998L) + "'", long31 == (-3599998L));
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.lang.String str3 = dateTimeZone1.getShortName((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC(115739848L, false, (-151200001L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.052" + "'", str3, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 115739796L + "'", long7 == 115739796L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str6 = dateTimeZone1.getShortName(2L);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        long long9 = dateTimeZone1.previousTransition(2040000L);
        int int11 = dateTimeZone1.getOffset(115260002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2040000L + "'", long9 == 2040000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360600000, 126000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 126000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+07:00");
        long long3 = dateTimeZone1.previousTransition(83400000L);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 83400000L + "'", long3 == 83400000L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        boolean boolean5 = dateTimeZone1.equals((java.lang.Object) dateTimeZone4);
        java.lang.String str6 = dateTimeZone4.toString();
        long long8 = dateTimeZone4.nextTransition(115260052L);
        long long10 = dateTimeZone4.convertUTCToLocal((-173399999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:35" + "'", str6, "+00:35");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115260052L + "'", long8 == 115260052L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-171299999L) + "'", long10 == (-171299999L));
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        java.lang.String str2 = dateTimeZone1.toString();
        int int4 = dateTimeZone1.getOffset((-288600100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
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
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        long long23 = dateTimeZone19.getMillisKeepLocal(dateTimeZone21, (long) 'a');
        int int25 = dateTimeZone19.getOffset(115799900L);
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone19, (-1569969124102L));
        java.lang.String str29 = dateTimeZone1.getShortName(115260002L);
        int int31 = dateTimeZone1.getStandardOffset(71399965L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "6) test4557(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 187200000 + "'", int5 == 187200000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25200001L) + "'", long16 == (-25200001L));
        org.junit.Assert.assertNotNull(timeZone17);
// flaky "6) test4557(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
// flaky "5) test4557(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 187200000 + "'", int25 == 187200000);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1569969124102L) + "'", long27 == (-1569969124102L));
// flaky "4) test4557(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+52:00" + "'", str29, "+52:00");
// flaky "3) test4557(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 187200000 + "'", int31 == 187200000);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
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
        int int25 = dateTimeZone14.getStandardOffset(0L);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone14.getShortName((-39659999L), locale27);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone14.getName((-1569688923901L), locale30);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "7) test4558(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "7) test4558(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
// flaky "6) test4558(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 187200000 + "'", int10 == 187200000);
// flaky "5) test4558(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 187200000 + "'", int12 == 187200000);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
// flaky "4) test4558(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 187200002L + "'", long23 == 187200002L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-00:00:00.001" + "'", str31, "-00:00:00.001");
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.035");
        java.lang.String str3 = dateTimeZone1.getNameKey(115260054L);
        java.lang.String str4 = dateTimeZone1.getID();
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-3660036L));
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 52);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.035" + "'", str4, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        java.lang.String str10 = dateTimeZone1.getName((long) '#');
        int int12 = dateTimeZone1.getOffset(36000032L);
        java.lang.String str14 = dateTimeZone1.getNameKey(0L);
        java.lang.String str16 = dateTimeZone1.getShortName((-349199899L));
        long long18 = dateTimeZone1.previousTransition((-34L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "8) test4560(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+52:00" + "'", str8, "+52:00");
// flaky "8) test4560(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+52:00" + "'", str10, "+52:00");
// flaky "7) test4560(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 187200000 + "'", int12 == 187200000);
        org.junit.Assert.assertNull(str14);
// flaky "6) test4560(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+52:00" + "'", str16, "+52:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-34L) + "'", long18 == (-34L));
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str7 = dateTimeZone1.getID();
        java.lang.String str9 = dateTimeZone1.getName(396600000L);
        long long12 = dateTimeZone1.adjustOffset(115259949L, true);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115259949L + "'", long12 == 115259949L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((-35999901L));
        java.lang.String str6 = dateTimeZone1.getID();
        int int8 = dateTimeZone1.getOffsetFromLocal(324600001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "9) test4562(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "9) test4562(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+52:00" + "'", str6, "+52:00");
// flaky "8) test4562(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
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
        long long19 = dateTimeZone3.convertUTCToLocal((-100L));
        java.lang.String str21 = dateTimeZone3.getName(49L);
        boolean boolean22 = dateTimeZone3.isFixed();
        long long25 = dateTimeZone3.adjustOffset((-1570120924200L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "10) test4564(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "10) test4564(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
// flaky "9) test4564(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+52:00" + "'", str11, "+52:00");
// flaky "7) test4564(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+52:00" + "'", str14, "+52:00");
// flaky "5) test4564(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+52:00" + "'", str17, "+52:00");
// flaky "2) test4564(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 187199900L + "'", long19 == 187199900L);
// flaky "1) test4564(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+52:00" + "'", str21, "+52:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1570120924200L) + "'", long25 == (-1570120924200L));
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long10 = dateTimeZone1.convertUTCToLocal(25200000L);
        boolean boolean11 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199999L + "'", long10 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str5 = dateTimeZone2.getShortName((-1570200724100L));
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.String str8 = dateTimeZone7.getID();
        long long10 = dateTimeZone7.previousTransition((-1L));
        boolean boolean12 = dateTimeZone7.equals((java.lang.Object) 1.0f);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone7.getName((-1570084924101L), locale14);
        java.lang.String str17 = dateTimeZone7.getNameKey((-36000000L));
        java.lang.String str18 = dateTimeZone7.toString();
        long long21 = dateTimeZone7.adjustOffset(115799965L, true);
        long long23 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, 112079800L);
        boolean boolean25 = dateTimeZone2.isStandardOffset(3660200L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 115799965L + "'", long21 == 115799965L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 112079800L + "'", long23 == 112079800L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        java.lang.String str10 = dateTimeZone1.getName((-25200001L));
        java.lang.String str12 = dateTimeZone1.getName(115799901L);
        long long14 = dateTimeZone1.nextTransition((-271080101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-271080101L) + "'", long14 == (-271080101L));
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
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
        boolean boolean13 = dateTimeZone10.isFixed();
        int int15 = dateTimeZone10.getStandardOffset(0L);
        int int17 = dateTimeZone10.getOffsetFromLocal((-1570081264101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        java.lang.String str9 = dateTimeZone1.getShortName(100L);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName(79800002L, locale11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        java.lang.String str15 = dateTimeZone1.getID();
        java.lang.Object obj16 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.convertUTCToLocal(100L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.lang.String str8 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.Object obj11 = dateTimeZone10.writeReplace();
        long long14 = dateTimeZone10.adjustOffset(36000000L, true);
        java.lang.Object obj15 = dateTimeZone10.writeReplace();
        boolean boolean16 = dateTimeZone1.equals(obj15);
        java.lang.String str18 = dateTimeZone1.getName((-187199905L));
        boolean boolean20 = dateTimeZone1.isStandardOffset((-1570200663901L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 36000000L + "'", long14 == 36000000L);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 126000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 126000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(102L, false, 2L);
        java.lang.String str13 = dateTimeZone1.toString();
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.Class<?> wildcardClass18 = timeZone14.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 103L + "'", long12 == 103L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (int) (short) 1);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str7 = dateTimeZone5.getNameKey(115800002L);
        boolean boolean9 = dateTimeZone5.isStandardOffset((-242819865L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT-01:01");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
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
        long long16 = dateTimeZone3.nextTransition(25200002L);
        java.lang.String str17 = dateTimeZone3.getID();
        java.lang.Object obj18 = dateTimeZone3.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200002L + "'", long16 == 25200002L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        boolean boolean9 = dateTimeZone3.equals((java.lang.Object) (byte) 0);
        long long12 = dateTimeZone3.adjustOffset((-1570156924001L), true);
        long long16 = dateTimeZone3.convertLocalToUTC((-1570084384200L), false, 4140052L);
        java.util.TimeZone timeZone17 = dateTimeZone3.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570156924001L) + "'", long12 == (-1570156924001L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570084444200L) + "'", long16 == (-1570084444200L));
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(101L, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924200L));
        int int8 = dateTimeZone1.getOffset(115259952L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.052" + "'", str4, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.052" + "'", str6, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
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
        long long14 = dateTimeZone11.convertLocalToUTC(60032L, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        java.lang.Object obj16 = dateTimeZone11.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        boolean boolean19 = dateTimeZone18.isFixed();
        java.util.TimeZone timeZone20 = dateTimeZone18.toTimeZone();
        java.lang.String str22 = dateTimeZone18.getName(115800000L);
        java.lang.Object obj23 = dateTimeZone18.writeReplace();
        boolean boolean24 = dateTimeZone11.equals((java.lang.Object) dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        long long13 = dateTimeZone1.nextTransition((-115260000L));
        java.lang.String str15 = dateTimeZone1.getNameKey((-1570196524001L));
        int int17 = dateTimeZone1.getOffsetFromLocal((-421799999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115260000L) + "'", long13 == (-115260000L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str4 = dateTimeZone1.getNameKey(187260051L);
        java.lang.String str6 = dateTimeZone1.getNameKey(360599999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long12 = dateTimeZone1.convertLocalToUTC((-1570084924100L), true);
        int int14 = dateTimeZone1.getOffset(36000001L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long18 = dateTimeZone1.convertLocalToUTC((-1570156924001L), true);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone21, (-35999965L));
        int int26 = dateTimeZone1.getStandardOffset(302940000L);
        boolean boolean27 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = dateTimeZone1.isLocalDateTimeGap(localDateTime28);
        long long32 = dateTimeZone1.adjustOffset((-54L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570084984100L) + "'", long12 == (-1570084984100L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570156984001L) + "'", long18 == (-1570156984001L));
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-35999965L) + "'", long24 == (-35999965L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60000 + "'", int26 == 60000);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-54L) + "'", long32 == (-54L));
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.junit.Assert.assertNotNull(provider0);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        int int12 = dateTimeZone1.getOffset((long) '#');
        long long14 = dateTimeZone1.nextTransition((-2L));
        java.lang.String str16 = dateTimeZone1.getShortName(1L);
        int int18 = dateTimeZone1.getStandardOffset(25199999L);
        java.lang.String str19 = dateTimeZone1.getID();
        int int21 = dateTimeZone1.getStandardOffset((-1570012923999L));
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone1.getShortName((-25200002L), locale23);
        java.util.TimeZone timeZone25 = dateTimeZone1.toTimeZone();
        java.lang.Object obj26 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2L) + "'", long14 == (-2L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60000 + "'", int21 == 60000);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(25200000);
        java.lang.String str3 = dateTimeZone1.getNameKey(59999L);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.lang.String str6 = dateTimeZone1.getNameKey(187259900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
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
        long long34 = dateTimeZone18.convertLocalToUTC((long) 10, true);
        int int36 = dateTimeZone18.getOffset((-39659900L));
        java.lang.Object obj37 = dateTimeZone18.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60000 + "'", int22 == 60000);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:01" + "'", str26, "+00:01");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:01" + "'", str29, "+00:01");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-115800099L) + "'", long31 == (-115800099L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-59990L) + "'", long34 == (-59990L));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60000 + "'", int36 == 60000);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((-25200001L));
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        long long5 = dateTimeZone0.previousTransition((-115799899L));
        int int7 = dateTimeZone0.getOffset((long) 25200000);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int12 = dateTimeZone10.getStandardOffset((long) 10);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        long long18 = dateTimeZone14.getMillisKeepLocal(dateTimeZone16, (long) 'a');
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone14.getName((long) (short) 1, locale20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean23 = dateTimeZone10.equals((java.lang.Object) dateTimeZone14);
        java.lang.String str24 = dateTimeZone14.toString();
        java.lang.String str25 = dateTimeZone14.getID();
        int int27 = dateTimeZone14.getStandardOffset((-115799999L));
        int int29 = dateTimeZone14.getOffsetFromLocal((-115799899L));
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj32 = dateTimeZone31.writeReplace();
        boolean boolean33 = dateTimeZone31.isFixed();
        boolean boolean34 = dateTimeZone14.equals((java.lang.Object) boolean33);
        long long36 = dateTimeZone14.previousTransition(200L);
        boolean boolean37 = dateTimeZone0.equals((java.lang.Object) long36);
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone0.getShortName((-1570120924103L), locale39);
        int int42 = dateTimeZone0.getOffset(231480035L);
        java.lang.String str43 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-115799899L) + "'", long5 == (-115799899L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115800000 + "'", int12 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60000 + "'", int27 == 60000);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 60000 + "'", int29 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 200L + "'", long36 == 200L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTC" + "'", str43, "UTC");
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
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
        boolean boolean35 = dateTimeZone10.isFixed();
        java.lang.String str36 = dateTimeZone10.toString();
        org.joda.time.LocalDateTime localDateTime37 = null;
        boolean boolean38 = dateTimeZone10.isLocalDateTimeGap(localDateTime37);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-25200001L) + "'", long25 == (-25200001L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-59904L) + "'", long27 == (-59904L));
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 3659900L + "'", long34 == 3659900L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:01" + "'", str36, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.toString();
        java.lang.String str5 = dateTimeZone1.getName(11L);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isStandardOffset(94L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.lang.String str12 = dateTimeZone10.getNameKey((-90600100L));
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (-1570164664001L));
        java.lang.String str15 = dateTimeZone10.toString();
        long long18 = dateTimeZone10.adjustOffset(187200012L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1570161004001L) + "'", long14 == (-1570161004001L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-01:00" + "'", str15, "-01:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 187200012L + "'", long18 == 187200012L);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
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
        int int19 = dateTimeZone1.getOffset((-90600000L));
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone1.getOffset(readableInstant20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25200001L) + "'", long16 == (-25200001L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60000 + "'", int19 == 60000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60000 + "'", int21 == 60000);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:01");
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getNameKey(3600001L);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.toString();
        long long7 = dateTimeZone1.convertLocalToUTC((-59904L), false, 89520002L);
        boolean boolean8 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-119904L) + "'", long7 == (-119904L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(349260000, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
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
        long long24 = dateTimeZone3.convertLocalToUTC((long) 100, false);
        java.lang.String str26 = dateTimeZone3.getNameKey((-39660000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60032L + "'", long20 == 60032L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-59900L) + "'", long24 == (-59900L));
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
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
        long long20 = dateTimeZone2.adjustOffset((-206400000L), true);
        java.lang.String str22 = dateTimeZone2.getName(23100000L);
        boolean boolean23 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-206400000L) + "'", long20 == (-206400000L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:10" + "'", str22, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((-25200001L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(302459967L, locale5);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset(115739900L);
        int int12 = dateTimeZone3.getOffset((-91L));
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone3.isLocalDateTimeGap(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.toString();
        java.lang.String str5 = dateTimeZone1.getName(11L);
        java.lang.String str7 = dateTimeZone1.getShortName((-1570084924001L));
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
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
        java.lang.String str20 = dateTimeZone1.getNameKey(709200100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25200001L) + "'", long16 == (-25200001L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Asia/Bangkok");
        boolean boolean3 = dateTimeZone1.isStandardOffset((-115799904L));
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        int int12 = dateTimeZone8.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone13 = dateTimeZone8.toTimeZone();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone8.getShortName((long) (byte) 100, locale15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone8.getShortName((long) (short) 0, locale18);
        java.lang.String str20 = dateTimeZone8.getID();
        java.lang.String str22 = dateTimeZone8.getNameKey(100L);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone8.isLocalDateTimeGap(localDateTime23);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        boolean boolean26 = dateTimeZone1.equals((java.lang.Object) dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone8.isLocalDateTimeGap(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
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
        long long18 = dateTimeZone3.nextTransition(119400000L);
        long long20 = dateTimeZone3.convertUTCToLocal((long) 360600000);
        boolean boolean22 = dateTimeZone3.isStandardOffset((-324600000L));
        boolean boolean24 = dateTimeZone3.isStandardOffset((-360599900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 119400000L + "'", long18 == 119400000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 360600000L + "'", long20 == 360600000L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getStandardOffset((long) (short) 0);
        int int7 = dateTimeZone1.getOffsetFromLocal(10L);
        long long10 = dateTimeZone1.adjustOffset(115740100L, true);
        long long14 = dateTimeZone1.convertLocalToUTC((-1570128664001L), false, 72000000L);
        java.lang.String str16 = dateTimeZone1.getShortName((-3660005L));
        java.lang.String str17 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115740100L + "'", long10 == 115740100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1570128664001L) + "'", long14 == (-1570128664001L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str6 = dateTimeZone1.getShortName(2L);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str10 = dateTimeZone8.getNameKey((-1570012924100L));
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone8.getName(7L, locale12);
        long long16 = dateTimeZone8.adjustOffset((-1569969664000L), true);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone8.getShortName(46L, locale18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1569969664000L) + "'", long16 == (-1569969664000L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
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
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone1.isLocalDateTimeGap(localDateTime22);
        boolean boolean25 = dateTimeZone1.isStandardOffset(360599900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9L + "'", long21 == 9L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str9 = dateTimeZone1.getName(36000000L);
        java.lang.String str11 = dateTimeZone1.getNameKey(233340101L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName(3600101L, locale13);
        int int16 = dateTimeZone1.getOffsetFromLocal(65L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.lang.Object obj5 = dateTimeZone2.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long8 = dateTimeZone2.nextTransition(89520001L);
        int int10 = dateTimeZone2.getOffset((-90060052L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 89520001L + "'", long8 == 89520001L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(126060000, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 60000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        int int12 = dateTimeZone1.getOffset((long) '#');
        long long14 = dateTimeZone1.nextTransition((-2L));
        java.lang.String str16 = dateTimeZone1.getShortName(1L);
        int int18 = dateTimeZone1.getStandardOffset(36000036L);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(25200000);
        java.lang.String str22 = dateTimeZone20.getNameKey(59999L);
        boolean boolean23 = dateTimeZone1.equals((java.lang.Object) 59999L);
        long long27 = dateTimeZone1.convertLocalToUTC(187200000L, false, (-97199901L));
        long long30 = dateTimeZone1.convertLocalToUTC(115800000L, false);
        java.lang.String str31 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36000000 + "'", int12 == 36000000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2L) + "'", long14 == (-2L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36000000 + "'", int18 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 151200000L + "'", long27 == 151200000L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 79800000L + "'", long30 == 79800000L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+10:00" + "'", str31, "+10:00");
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
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
        java.lang.String str17 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25200001L) + "'", long16 == (-25200001L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115800000);
        java.lang.String str3 = dateTimeZone1.getNameKey(0L);
        long long5 = dateTimeZone1.nextTransition((-1569969664099L));
        boolean boolean7 = dateTimeZone1.isStandardOffset(71999999L);
        long long11 = dateTimeZone1.convertLocalToUTC((-1570153324000L), true, (-75659900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1569969664099L) + "'", long5 == (-1569969664099L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570269124000L) + "'", long11 == (-1570269124000L));
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
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
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str16 = dateTimeZone15.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone19.nextTransition((long) (short) 100);
        int int23 = dateTimeZone19.getOffsetFromLocal(100L);
        long long25 = dateTimeZone15.getMillisKeepLocal(dateTimeZone19, (long) 115800000);
        long long27 = dateTimeZone19.nextTransition(9L);
        long long30 = dateTimeZone19.convertLocalToUTC((long) ' ', true);
        long long32 = dateTimeZone9.getMillisKeepLocal(dateTimeZone19, (-187200000L));
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone19.getName(3659999L, locale34);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:00" + "'", str10, "+10:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-25740000L) + "'", long13 == (-25740000L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 36000000 + "'", int23 == 36000000);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 115800000L + "'", long25 == 115800000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9L + "'", long27 == 9L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-35999968L) + "'", long30 == (-35999968L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-187200000L) + "'", long32 == (-187200000L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+10:00" + "'", str35, "+10:00");
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115800000, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.lang.Object obj5 = dateTimeZone2.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getName((long) 'a');
        java.lang.String str10 = dateTimeZone2.getNameKey((-306540000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(35, 52);
        long long5 = dateTimeZone2.adjustOffset((-2099999L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-2099999L) + "'", long5 == (-2099999L));
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long10 = dateTimeZone7.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        java.lang.String str13 = dateTimeZone7.getNameKey(36000100L);
        java.lang.String str14 = dateTimeZone7.getID();
        boolean boolean15 = dateTimeZone1.equals((java.lang.Object) str14);
        java.lang.String str17 = dateTimeZone1.getShortName(302940001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-99L) + "'", long10 == (-99L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
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
        int int21 = dateTimeZone1.getOffsetFromLocal((-4L));
        java.util.TimeZone timeZone22 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        int int27 = dateTimeZone25.getOffset((-26280099L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11L + "'", long10 == 11L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1570200724001L) + "'", long19 == (-1570200724001L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:01");
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.convertUTCToLocal(100L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.lang.String str8 = dateTimeZone1.toString();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long13 = dateTimeZone1.convertLocalToUTC((-360599964L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-360599963L) + "'", long13 == (-360599963L));
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
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
        long long16 = dateTimeZone3.convertLocalToUTC(119400000L, false, (long) 52);
        long long18 = dateTimeZone3.convertUTCToLocal((-91L));
        long long21 = dateTimeZone3.adjustOffset(61200002L, false);
        int int23 = dateTimeZone3.getStandardOffset(115260051L);
        int int25 = dateTimeZone3.getOffset((-115800000L));
        long long27 = dateTimeZone3.nextTransition((-187199999L));
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = dateTimeZone3.getOffset(readableInstant28);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 119340000L + "'", long16 == 119340000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 59909L + "'", long18 == 59909L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 61200002L + "'", long21 == 61200002L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60000 + "'", int23 == 60000);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60000 + "'", int25 == 60000);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-187199999L) + "'", long27 == (-187199999L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 60000 + "'", int29 == 60000);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getShortName((-1570012924100L), locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-115799900L), locale7);
        long long12 = dateTimeZone1.convertLocalToUTC(115800000L, true, (-35999991L));
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        long long16 = dateTimeZone14.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone14.getOffset(readableInstant17);
        java.lang.Object obj19 = dateTimeZone14.writeReplace();
        int int21 = dateTimeZone14.getOffset((long) 1);
        java.lang.String str22 = dateTimeZone14.toString();
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone14.isLocalDateTimeGap(localDateTime23);
        long long26 = dateTimeZone14.previousTransition(101L);
        long long28 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, (-115799900L));
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone14.getName((-1570200724101L), locale30);
        java.lang.String str33 = dateTimeZone14.getNameKey((-1570084984100L));
        boolean boolean35 = dateTimeZone14.isStandardOffset((-1570081264198L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.035" + "'", str5, "+00:00:00.035");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.035" + "'", str8, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115799965L + "'", long12 == 115799965L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60000 + "'", int21 == 60000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 101L + "'", long26 == 101L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-115859865L) + "'", long28 == (-115859865L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
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
        java.lang.String str19 = dateTimeZone2.getShortName(25200001L);
        java.lang.String str21 = dateTimeZone2.getNameKey((-1570081264101L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:10" + "'", str17, "+32:10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:10" + "'", str19, "+32:10");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+07:00");
        long long3 = dateTimeZone1.previousTransition(83400000L);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 83400000L + "'", long3 == 83400000L);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+07:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
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
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone3.getShortName((-1570084924201L), locale16);
        long long19 = dateTimeZone3.convertUTCToLocal(97L);
        long long21 = dateTimeZone3.convertUTCToLocal((-1569969064200L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60097L + "'", long19 == 60097L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1569969004200L) + "'", long21 == (-1569969004200L));
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) 25200001L);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        java.lang.String str12 = dateTimeZone6.getName((long) (byte) 10);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone6, (long) '4');
        java.lang.String str16 = dateTimeZone6.getNameKey((long) 25200000);
        boolean boolean18 = dateTimeZone6.isStandardOffset((long) 52);
        java.lang.String str19 = dateTimeZone6.getID();
        long long21 = dateTimeZone6.nextTransition((-61199901L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115200052L + "'", long14 == 115200052L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-61199901L) + "'", long21 == (-61199901L));
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        int int3 = dateTimeZone1.getOffset((long) (-1));
        boolean boolean5 = dateTimeZone1.isStandardOffset(10L);
        java.lang.String str6 = dateTimeZone1.getID();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.035" + "'", str6, "+00:00:00.035");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        java.lang.String str8 = dateTimeZone1.getName((-1570084924101L));
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone13.isLocalDateTimeGap(localDateTime14);
        long long19 = dateTimeZone13.convertLocalToUTC((-25140001L), false, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-25140001L) + "'", long19 == (-25140001L));
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone2.getName((-79799988L), locale5);
        boolean boolean8 = dateTimeZone2.isStandardOffset((-129119929L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
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
        long long32 = dateTimeZone27.convertLocalToUTC(36000095L, true);
        java.lang.String str33 = dateTimeZone27.toString();
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone27.getOffset(readableInstant34);
        long long38 = dateTimeZone27.convertLocalToUTC(39660002L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:01" + "'", str20, "+00:01");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-187140000L) + "'", long29 == (-187140000L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-151199905L) + "'", long32 == (-151199905L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+52:00" + "'", str33, "+52:00");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 187200000 + "'", int35 == 187200000);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-147539998L) + "'", long38 == (-147539998L));
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        long long8 = dateTimeZone1.nextTransition((-151800000L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-151800000L) + "'", long8 == (-151800000L));
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        java.lang.String str10 = dateTimeZone1.getName((long) '#');
        int int12 = dateTimeZone1.getOffset(36000032L);
        java.lang.String str14 = dateTimeZone1.getNameKey(0L);
        long long17 = dateTimeZone1.adjustOffset((-1570084924044L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570084924044L) + "'", long17 == (-1570084924044L));
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((-25200001L));
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        long long5 = dateTimeZone0.previousTransition((-115799899L));
        long long8 = dateTimeZone0.adjustOffset((long) 360000000, true);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getShortName((-90060000L), locale10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str14 = dateTimeZone12.getShortName((long) 25200000);
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
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone18.getName((long) (short) 100, locale31);
        java.lang.String str34 = dateTimeZone18.getName((long) (-1));
        boolean boolean36 = dateTimeZone18.isStandardOffset((long) (short) -1);
        boolean boolean37 = dateTimeZone12.equals((java.lang.Object) dateTimeZone18);
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone12.getShortName(100L, locale39);
        java.util.TimeZone timeZone41 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        java.util.TimeZone timeZone43 = dateTimeZone42.toTimeZone();
        long long47 = dateTimeZone42.convertLocalToUTC(151740000L, false, (-25740000L));
        long long49 = dateTimeZone0.getMillisKeepLocal(dateTimeZone42, (-1570084924145L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-115799899L) + "'", long5 == (-115799899L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 360000000L + "'", long8 == 360000000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60000 + "'", int22 == 60000);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:01" + "'", str26, "+00:01");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:01" + "'", str29, "+00:01");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:01" + "'", str32, "+00:01");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:01" + "'", str34, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 151740000L + "'", long47 == 151740000L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1570084924145L) + "'", long49 == (-1570084924145L));
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
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
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        int int17 = dateTimeZone15.getOffsetFromLocal((long) 35);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, 25199999L);
        boolean boolean20 = dateTimeZone15.isFixed();
        java.lang.Object obj21 = dateTimeZone15.writeReplace();
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone15.isLocalDateTimeGap(localDateTime22);
        java.lang.String str24 = dateTimeZone15.getID();
        java.lang.String str26 = dateTimeZone15.getShortName((-115799899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25199999L + "'", long19 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:01" + "'", str26, "+00:01");
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) '4', locale8);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str13 = dateTimeZone1.getID();
        java.lang.String str14 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
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
        long long50 = dateTimeZone30.adjustOffset((-1569969124101L), false);
        long long53 = dateTimeZone30.convertLocalToUTC((-35939999L), false);
        org.joda.time.LocalDateTime localDateTime54 = null;
        boolean boolean55 = dateTimeZone30.isLocalDateTimeGap(localDateTime54);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 60000L + "'", long21 == 60000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570084984001L) + "'", long26 == (-1570084984001L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:01" + "'", str28, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 97L + "'", long34 == 97L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 60000 + "'", int37 == 60000);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60000 + "'", int39 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-35939900L) + "'", long43 == (-35939900L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 60000 + "'", int45 == 60000);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 25200001L + "'", long47 == 25200001L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1569969124101L) + "'", long50 == (-1569969124101L));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-35999999L) + "'", long53 == (-35999999L));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        java.lang.String str4 = dateTimeZone2.getNameKey((-148139800L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        java.lang.String str3 = dateTimeZone1.getNameKey((-173340000L));
        long long5 = dateTimeZone1.nextTransition((-25800001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-25800001L) + "'", long5 == (-25800001L));
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (short) 0, true);
        long long7 = dateTimeZone1.nextTransition(1L);
        long long11 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, (-90600100L));
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getID();
        java.lang.String str18 = dateTimeZone13.getShortName((-1570200724101L));
        long long20 = dateTimeZone13.nextTransition((-1570084924045L));
        int int22 = dateTimeZone13.getOffset(25200051L);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (-231599899L));
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone13.getName(3659999L, locale26);
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = dateTimeZone13.isLocalDateTimeGap(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-2L) + "'", long11 == (-2L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570084924045L) + "'", long20 == (-1570084924045L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60000 + "'", int22 == 60000);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-231659898L) + "'", long24 == (-231659898L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:01" + "'", str27, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
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
        long long20 = dateTimeZone1.adjustOffset((-1570084924199L), true);
        long long23 = dateTimeZone1.convertLocalToUTC((-1570084384101L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570084924199L) + "'", long20 == (-1570084924199L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1570084444101L) + "'", long23 == (-1570084444101L));
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360600000);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 52);
        long long6 = dateTimeZone1.convertLocalToUTC((long) '4', false);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        long long10 = dateTimeZone1.convertUTCToLocal((-1570048924000L));
        boolean boolean11 = dateTimeZone1.isFixed();
        long long13 = dateTimeZone1.previousTransition((-1570329724101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-360599948L) + "'", long6 == (-360599948L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1569688324000L) + "'", long10 == (-1569688324000L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570329724101L) + "'", long13 == (-1570329724101L));
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        boolean boolean3 = dateTimeZone1.isFixed();
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((-59904L));
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        int int10 = dateTimeZone1.getOffsetFromLocal((-1570048924199L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-59903L) + "'", long6 == (-59903L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long10 = dateTimeZone1.convertLocalToUTC((-1L), false, (long) '#');
        java.lang.String str11 = dateTimeZone1.getID();
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((-206400000L), locale14);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getShortName((-1569969664099L), locale17);
        java.lang.Object obj19 = dateTimeZone1.writeReplace();
        boolean boolean21 = dateTimeZone1.isStandardOffset(3660010L);
        long long23 = dateTimeZone1.previousTransition(35999900L);
        java.lang.String str24 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35999900L + "'", long23 == 35999900L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(35);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((-1570081324000L), true);
        long long7 = dateTimeZone1.previousTransition(119400099L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570081324000L) + "'", long5 == (-1570081324000L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 119400099L + "'", long7 == 119400099L);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.lang.String str5 = dateTimeZone1.toString();
        int int7 = dateTimeZone1.getStandardOffset((-26280099L));
        long long11 = dateTimeZone1.convertLocalToUTC((-206399999L), true, (-1570434124100L));
        int int13 = dateTimeZone1.getStandardOffset((-35999999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-206459999L) + "'", long11 == (-206459999L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
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
        java.lang.String str17 = dateTimeZone1.getName((long) 25200000);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone1.getOffset(readableInstant18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60000L + "'", long15 == 60000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60000 + "'", int19 == 60000);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        java.lang.String str9 = dateTimeZone1.getShortName(100L);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName(79800002L, locale11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        long long16 = dateTimeZone14.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone14.getOffset(readableInstant17);
        java.lang.Object obj19 = dateTimeZone14.writeReplace();
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone14.getName((long) '#', locale21);
        java.lang.String str23 = dateTimeZone14.getID();
        boolean boolean24 = dateTimeZone1.equals((java.lang.Object) dateTimeZone14);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone1.getOffset(readableInstant25);
        java.lang.String str27 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60000 + "'", int26 == 60000);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:01" + "'", str27, "+00:01");
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.previousTransition(25200000L);
        java.lang.String str6 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int9 = dateTimeZone1.getOffset((-97199901L));
        long long11 = dateTimeZone1.previousTransition((-1570513324100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25200000L + "'", long5 == 25200000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570513324100L) + "'", long11 == (-1570513324100L));
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        boolean boolean3 = dateTimeZone1.isFixed();
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((-59904L));
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.String str9 = dateTimeZone1.toString();
        long long12 = dateTimeZone1.adjustOffset((-206400000L), false);
        java.lang.String str14 = dateTimeZone1.getShortName(115739999L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getShortName((-231059900L), locale17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-59903L) + "'", long6 == (-59903L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-206400000L) + "'", long12 == (-206400000L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
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
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        boolean boolean14 = dateTimeZone12.isStandardOffset((-349200100L));
        boolean boolean16 = dateTimeZone12.isStandardOffset(2100011L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
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
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName(102L, locale19);
        boolean boolean22 = dateTimeZone1.isStandardOffset((long) 187260000);
        int int24 = dateTimeZone1.getOffsetFromLocal((-36000033L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        long long14 = dateTimeZone3.convertLocalToUTC((long) 115800000, true, (-1570084924000L));
        boolean boolean15 = dateTimeZone3.isFixed();
        java.lang.String str16 = dateTimeZone3.toString();
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone3.getOffset(readableInstant17);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115799999L + "'", long14 == 115799999L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
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
        int int25 = dateTimeZone13.getStandardOffset((long) 10);
        java.util.TimeZone timeZone26 = dateTimeZone13.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-00:00:00.001");
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
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
        long long15 = dateTimeZone1.nextTransition(25199999L);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str18 = dateTimeZone17.toString();
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone17.getOffset(readableInstant19);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone17, (-1569969663999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25199999L + "'", long15 == 25199999L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1569969663999L) + "'", long22 == (-1569969663999L));
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        int int12 = dateTimeZone1.getOffset((long) '#');
        long long14 = dateTimeZone1.nextTransition((-2L));
        long long16 = dateTimeZone1.nextTransition((-1569688324000L));
        int int18 = dateTimeZone1.getOffsetFromLocal((-1570084923946L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2L) + "'", long14 == (-2L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1569688324000L) + "'", long16 == (-1569688324000L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getNameKey(101L);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone13.getMillisKeepLocal(dateTimeZone15, (long) 'a');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone13.getName((long) (short) 1, locale19);
        int int22 = dateTimeZone13.getOffset((long) 1);
        java.lang.Object obj23 = dateTimeZone13.writeReplace();
        int int25 = dateTimeZone13.getOffset((-99L));
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone13.isLocalDateTimeGap(localDateTime26);
        java.lang.String str28 = dateTimeZone13.getID();
        boolean boolean29 = dateTimeZone1.equals((java.lang.Object) str28);
        java.lang.String str30 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.001" + "'", str28, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.001" + "'", str30, "+00:00:00.001");
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        java.lang.String str9 = dateTimeZone1.getID();
        long long13 = dateTimeZone1.convertLocalToUTC((-1570200184001L), true, (-36059903L));
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        java.lang.String str16 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25199999L + "'", long8 == 25199999L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570200184002L) + "'", long13 == (-1570200184002L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getStandardOffset((long) (short) 0);
        int int7 = dateTimeZone1.getOffsetFromLocal(10L);
        long long10 = dateTimeZone1.convertLocalToUTC((-1570084924045L), false);
        long long12 = dateTimeZone1.previousTransition(36000032L);
        long long15 = dateTimeZone1.convertLocalToUTC(244200048L, false);
        java.lang.Object obj16 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone17 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone20.getOffset(readableInstant21);
        java.lang.Object obj23 = dateTimeZone20.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int28 = dateTimeZone26.getStandardOffset((long) 10);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        long long34 = dateTimeZone30.getMillisKeepLocal(dateTimeZone32, (long) 'a');
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone30.getName((long) (short) 1, locale36);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone30);
        boolean boolean39 = dateTimeZone26.equals((java.lang.Object) dateTimeZone30);
        long long42 = dateTimeZone30.adjustOffset((long) (short) -1, false);
        boolean boolean44 = dateTimeZone30.isStandardOffset(112139999L);
        long long46 = dateTimeZone20.getMillisKeepLocal(dateTimeZone30, 0L);
        java.lang.String str48 = dateTimeZone20.getShortName(3600001L);
        java.lang.String str49 = dateTimeZone20.toString();
        boolean boolean50 = dateTimeZone1.equals((java.lang.Object) str49);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924046L) + "'", long10 == (-1570084924046L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36000032L + "'", long12 == 36000032L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 244200047L + "'", long15 == 244200047L);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36000000 + "'", int22 == 36000000);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 115800000 + "'", int28 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 97L + "'", long34 == 97L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.001" + "'", str37, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 35999999L + "'", long46 == 35999999L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+10:00" + "'", str48, "+10:00");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+10:00" + "'", str49, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
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
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
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
        long long28 = dateTimeZone1.adjustOffset((long) ' ', true);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone1.getShortName(89519900L, locale30);
        java.lang.String str33 = dateTimeZone1.getName(360599900L);
        boolean boolean35 = dateTimeZone1.isStandardOffset(244200046L);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.001" + "'", str31, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.001" + "'", str33, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
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
        int int22 = dateTimeZone12.getOffset((-206400000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999899L) + "'", long14 == (-35999899L));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36000000 + "'", int22 == 36000000);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(52);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(151200011L, locale3);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        java.lang.String str7 = dateTimeZone1.getName((-360660052L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.052" + "'", str4, "+00:00:00.052");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.052" + "'", str7, "+00:00:00.052");
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.junit.Assert.assertNotNull(nameProvider0);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
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
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone3.getOffset(readableInstant21);
        java.lang.String str24 = dateTimeZone3.getName((-1570197064001L));
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone3.getName((-324600000L), locale26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str31 = dateTimeZone29.getNameKey((long) 115800000);
        java.lang.String str32 = dateTimeZone29.getID();
        boolean boolean34 = dateTimeZone29.equals((java.lang.Object) 96L);
        boolean boolean36 = dateTimeZone29.isStandardOffset(0L);
        boolean boolean37 = dateTimeZone3.equals((java.lang.Object) dateTimeZone29);
        java.lang.String str38 = dateTimeZone3.toString();
        java.lang.String str39 = dateTimeZone3.toString();
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone3.getName((-1569969004200L), locale41);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-35999990L) + "'", long18 == (-35999990L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+10:00" + "'", str20, "+10:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36000000 + "'", int22 == 36000000);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+10:00" + "'", str24, "+10:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+10:00" + "'", str27, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+10:00" + "'", str38, "+10:00");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+10:00" + "'", str39, "+10:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+10:00" + "'", str42, "+10:00");
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
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
        java.lang.String str18 = dateTimeZone1.getShortName((long) (short) 10);
        java.lang.String str20 = dateTimeZone1.getNameKey(25200000L);
        int int22 = dateTimeZone1.getOffset((-1570084924045L));
        boolean boolean24 = dateTimeZone1.isStandardOffset((-36000001L));
        java.lang.Object obj25 = dateTimeZone1.writeReplace();
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone1.isLocalDateTimeGap(localDateTime26);
        java.lang.String str28 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570120924100L) + "'", long12 == (-1570120924100L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-35999999L) + "'", long16 == (-35999999L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:00" + "'", str18, "+10:00");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36000000 + "'", int22 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+10:00" + "'", str28, "+10:00");
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
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
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName(102L, locale19);
        java.lang.String str21 = dateTimeZone1.getID();
        long long23 = dateTimeZone1.previousTransition(54060001L);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone1.isLocalDateTimeGap(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36000000 + "'", int9 == 36000000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+10:00" + "'", str20, "+10:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+10:00" + "'", str21, "+10:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 54060001L + "'", long23 == 54060001L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
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
        java.lang.String str19 = dateTimeZone1.getNameKey((-115259991L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36000000 + "'", int8 == 36000000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36000000 + "'", int16 == 36000000);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long6 = dateTimeZone2.convertLocalToUTC((-90600002L), true);
        boolean boolean8 = dateTimeZone2.isStandardOffset(36000011L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone2.getOffset(readableInstant9);
        java.lang.String str11 = dateTimeZone2.getID();
        java.lang.Object obj12 = dateTimeZone2.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-205860002L) + "'", long6 == (-205860002L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115260000 + "'", int10 == 115260000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:01" + "'", str11, "+32:01");
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        int int12 = dateTimeZone1.getOffset((long) '#');
        java.lang.String str14 = dateTimeZone1.getNameKey((long) '4');
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getShortName((long) (byte) -1, locale16);
        java.util.TimeZone timeZone18 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:01" + "'", str8, "+32:01");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115260000 + "'", int10 == 115260000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115260000 + "'", int12 == 115260000);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:01" + "'", str17, "+32:01");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(25200000L, locale4);
        boolean boolean6 = dateTimeZone2.isFixed();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        long long12 = dateTimeZone8.adjustOffset((long) (byte) 1, false);
        long long14 = dateTimeZone8.previousTransition(0L);
        java.util.TimeZone timeZone15 = dateTimeZone8.toTimeZone();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone8.getOffset(readableInstant16);
        java.lang.String str19 = dateTimeZone8.getName(102L);
        long long21 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, (-35999968L));
        long long23 = dateTimeZone2.convertUTCToLocal(0L);
        long long26 = dateTimeZone2.convertLocalToUTC((long) 36000000, false);
        java.util.TimeZone timeZone27 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-35939969L) + "'", long21 == (-35939969L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 60000L + "'", long23 == 60000L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 35940000L + "'", long26 == 35940000L);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        long long5 = dateTimeZone0.adjustOffset((-1570200724100L), true);
        long long7 = dateTimeZone0.nextTransition((-61199901L));
        int int9 = dateTimeZone0.getOffsetFromLocal(115740002L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570200724100L) + "'", long5 == (-1570200724100L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-61199901L) + "'", long7 == (-61199901L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) '4');
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(35999900L, locale4);
        java.lang.String str6 = dateTimeZone2.toString();
        boolean boolean8 = dateTimeZone2.isStandardOffset((-35999999L));
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, (long) 'a');
        int int16 = dateTimeZone12.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.getID();
        java.lang.String str20 = dateTimeZone18.toString();
        long long22 = dateTimeZone12.getMillisKeepLocal(dateTimeZone18, (-25740000L));
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone18.getOffset(readableInstant23);
        long long26 = dateTimeZone2.getMillisKeepLocal(dateTimeZone18, 9L);
        java.util.TimeZone timeZone27 = dateTimeZone18.toTimeZone();
        long long29 = dateTimeZone18.previousTransition((-1570084924101L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+35:52" + "'", str5, "+35:52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+35:52" + "'", str6, "+35:52");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115260000 + "'", int16 == 115260000);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:01" + "'", str19, "+32:01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:01" + "'", str20, "+32:01");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-25740000L) + "'", long22 == (-25740000L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 115260000 + "'", int24 == 115260000);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 13860009L + "'", long26 == 13860009L);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1570084924101L) + "'", long29 == (-1570084924101L));
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        int int13 = dateTimeZone1.getOffset((-99L));
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        long long17 = dateTimeZone1.previousTransition(6L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:01" + "'", str8, "+32:01");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115260000 + "'", int10 == 115260000);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115260000 + "'", int13 == 115260000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 6L + "'", long17 == 6L);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 10);
        boolean boolean4 = dateTimeZone2.isStandardOffset(36000100L);
        int int6 = dateTimeZone2.getOffset(72000000L);
        long long8 = dateTimeZone2.convertUTCToLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 360600000 + "'", int6 == 360600000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 360600000L + "'", long8 == 360600000L);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset(115739900L);
        long long13 = dateTimeZone3.adjustOffset(89519999L, false);
        long long16 = dateTimeZone3.adjustOffset((-1570048924001L), true);
        int int18 = dateTimeZone3.getOffset(244200045L);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone3.getName((-2099904L), locale20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115260000 + "'", int7 == 115260000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115260000 + "'", int10 == 115260000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 89519999L + "'", long13 == 89519999L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570048924001L) + "'", long16 == (-1570048924001L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115260000 + "'", int18 == 115260000);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:01" + "'", str21, "+32:01");
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        long long13 = dateTimeZone1.convertLocalToUTC((-35999897L), false);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName(115799999L, locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115260000 + "'", int8 == 115260000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115260000 + "'", int10 == 115260000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-151259897L) + "'", long13 == (-151259897L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:01" + "'", str16, "+32:01");
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long10 = dateTimeZone1.convertUTCToLocal(25200000L);
        java.lang.String str12 = dateTimeZone1.getNameKey(43800000L);
        java.lang.String str13 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199999L + "'", long10 == 25199999L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.035");
        java.lang.String str3 = dateTimeZone1.getNameKey(115260054L);
        java.lang.String str4 = dateTimeZone1.toString();
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((-90660000L), locale6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.035" + "'", str4, "+00:00:00.035");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.035" + "'", str7, "+00:00:00.035");
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-35999901L));
        long long12 = dateTimeZone1.previousTransition((long) (short) 1);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        long long15 = dateTimeZone1.nextTransition(115260002L);
        java.lang.String str17 = dateTimeZone1.getNameKey(2100011L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115260000 + "'", int5 == 115260000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115260000 + "'", int8 == 115260000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115260002L + "'", long15 == 115260002L);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:35");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((-35999899L), locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((-1570192924001L), locale6);
        java.lang.String str8 = dateTimeZone1.toString();
        java.lang.String str9 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        long long15 = dateTimeZone11.adjustOffset((long) (short) 0, true);
        long long17 = dateTimeZone11.nextTransition(1L);
        java.util.TimeZone timeZone18 = dateTimeZone11.toTimeZone();
        long long20 = dateTimeZone11.nextTransition(100L);
        long long22 = dateTimeZone11.nextTransition(32L);
        long long25 = dateTimeZone11.adjustOffset((long) (short) 10, true);
        int int27 = dateTimeZone11.getOffsetFromLocal((-241260010L));
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (-1570516924049L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:35" + "'", str4, "+00:35");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:35" + "'", str7, "+00:35");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:35" + "'", str8, "+00:35");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:35" + "'", str9, "+00:35");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1570514824050L) + "'", long29 == (-1570514824050L));
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        int int12 = dateTimeZone1.getOffset((long) '#');
        java.lang.String str14 = dateTimeZone1.getNameKey((long) '4');
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getShortName((long) (byte) -1, locale16);
        long long21 = dateTimeZone1.convertLocalToUTC(0L, false, 117300000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:01" + "'", str8, "+32:01");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115260000 + "'", int10 == 115260000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115260000 + "'", int12 == 115260000);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:01" + "'", str17, "+32:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-115260000L) + "'", long21 == (-115260000L));
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
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
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone1.getOffset(readableInstant18);
        java.lang.String str20 = dateTimeZone1.toString();
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone1.getShortName((-1570048924002L), locale22);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115260000 + "'", int5 == 115260000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:01" + "'", str6, "+32:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115260000 + "'", int12 == 115260000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115260000 + "'", int14 == 115260000);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115260000 + "'", int19 == 115260000);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:01" + "'", str20, "+32:01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:01" + "'", str23, "+32:01");
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset(0L);
        long long6 = dateTimeZone1.convertUTCToLocal((long) (byte) 10);
        long long8 = dateTimeZone1.convertUTCToLocal((-25200002L));
        int int10 = dateTimeZone1.getOffset((-1570048923849L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11L + "'", long6 == 11L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-25200001L) + "'", long8 == (-25200001L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
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
        org.joda.time.ReadableInstant readableInstant45 = null;
        int int46 = dateTimeZone28.getOffset(readableInstant45);
        boolean boolean47 = dateTimeZone28.isFixed();
        java.util.Locale locale49 = null;
        java.lang.String str50 = dateTimeZone28.getShortName((-59999L), locale49);
        boolean boolean52 = dateTimeZone28.isStandardOffset(119399900L);
        boolean boolean53 = dateTimeZone28.isFixed();
        java.util.TimeZone timeZone54 = dateTimeZone28.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115260000 + "'", int12 == 115260000);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:01" + "'", str17, "+32:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:01" + "'", str19, "+32:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 25200052L + "'", long21 == 25200052L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:01" + "'", str24, "+32:01");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-25200001L) + "'", long26 == (-25200001L));
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+32:01" + "'", str35, "+32:01");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+32:01" + "'", str39, "+32:01");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 115260000 + "'", int42 == 115260000);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-25740000L) + "'", long44 == (-25740000L));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 115260000 + "'", int46 == 115260000);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+32:01" + "'", str50, "+32:01");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) '#', locale8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        long long13 = dateTimeZone1.nextTransition(35999900L);
        long long16 = dateTimeZone1.convertLocalToUTC((-61199968L), true);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        long long22 = dateTimeZone18.getMillisKeepLocal(dateTimeZone20, (long) 'a');
        java.lang.String str24 = dateTimeZone18.getNameKey(25200000L);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone18.getOffset(readableInstant25);
        java.util.TimeZone timeZone27 = dateTimeZone18.toTimeZone();
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone18, 33L);
        java.lang.String str30 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115260000 + "'", int5 == 115260000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:01" + "'", str9, "+32:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115260000 + "'", int11 == 115260000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35999900L + "'", long13 == 35999900L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-176459968L) + "'", long16 == (-176459968L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 115260000 + "'", int26 == 115260000);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 33L + "'", long29 == 33L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:01" + "'", str30, "+32:01");
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        int int12 = dateTimeZone1.getOffset((long) '#');
        java.lang.String str14 = dateTimeZone1.getNameKey((long) '4');
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getShortName((long) (byte) -1, locale16);
        int int19 = dateTimeZone1.getOffsetFromLocal((-1569969124201L));
        long long21 = dateTimeZone1.convertUTCToLocal((-25200002L));
        java.lang.String str23 = dateTimeZone1.getName((-231059999L));
        long long27 = dateTimeZone1.convertLocalToUTC((-1569966004200L), true, (-53L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:01" + "'", str8, "+32:01");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115260000 + "'", int10 == 115260000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115260000 + "'", int12 == 115260000);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:01" + "'", str17, "+32:01");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115260000 + "'", int19 == 115260000);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 90059998L + "'", long21 == 90059998L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:01" + "'", str23, "+32:01");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1570081264200L) + "'", long27 == (-1570081264200L));
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
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
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        long long25 = dateTimeZone21.convertLocalToUTC(0L, true, 125999957L);
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
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) 360600001L);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:01" + "'", str2, "+32:01");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115260000 + "'", int13 == 115260000);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
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
        long long28 = dateTimeZone1.adjustOffset((long) ' ', true);
        long long30 = dateTimeZone1.convertUTCToLocal((-540050L));
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        long long33 = dateTimeZone1.getMillisKeepLocal(dateTimeZone31, (-3660001L));
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-540049L) + "'", long30 == (-540049L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-118920000L) + "'", long33 == (-118920000L));
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long10 = dateTimeZone1.convertLocalToUTC((-1L), false, (long) '#');
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        java.lang.String str12 = dateTimeZone1.getID();
        long long14 = dateTimeZone1.previousTransition(36059979L);
        java.lang.Object obj15 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 36059979L + "'", long14 == 36059979L);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
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
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone3.getOffset(readableInstant17);
        java.lang.String str19 = dateTimeZone3.toString();
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone3.isLocalDateTimeGap(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115260000 + "'", int7 == 115260000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:01" + "'", str11, "+32:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:01" + "'", str14, "+32:01");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115260000 + "'", int18 == 115260000);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:01" + "'", str19, "+32:01");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
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
        java.lang.String str18 = dateTimeZone1.getShortName((long) (short) 10);
        java.lang.String str20 = dateTimeZone1.getNameKey(25200000L);
        int int22 = dateTimeZone1.getOffset((-1570084924045L));
        boolean boolean24 = dateTimeZone1.isStandardOffset((-36000001L));
        long long27 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, true);
        long long30 = dateTimeZone1.adjustOffset((-227999898L), false);
        java.lang.Class<?> wildcardClass31 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:01" + "'", str8, "+32:01");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570200184100L) + "'", long12 == (-1570200184100L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115259999L) + "'", long16 == (-115259999L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:01" + "'", str18, "+32:01");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115260000 + "'", int22 == 115260000);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-115259900L) + "'", long27 == (-115259900L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-227999898L) + "'", long30 == (-227999898L));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        long long10 = dateTimeZone1.previousTransition((-1570084924099L));
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-36000090L), locale12);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName((-1570084924000L), locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:01" + "'", str2, "+32:01");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115260000 + "'", int8 == 115260000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924099L) + "'", long10 == (-1570084924099L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:01" + "'", str13, "+32:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:01" + "'", str16, "+32:01");
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName((-1570200724101L));
        long long8 = dateTimeZone1.nextTransition((-1570084924045L));
        int int10 = dateTimeZone1.getOffset(25200051L);
        long long12 = dateTimeZone1.nextTransition((-360599948L));
        long long14 = dateTimeZone1.convertUTCToLocal((-223199902L));
        int int16 = dateTimeZone1.getOffsetFromLocal((-35940100L));
        long long19 = dateTimeZone1.convertLocalToUTC((long) 3660000, false);
        long long22 = dateTimeZone1.convertLocalToUTC((-35999888L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:01" + "'", str2, "+32:01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:01" + "'", str4, "+32:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:01" + "'", str6, "+32:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1570084924045L) + "'", long8 == (-1570084924045L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115260000 + "'", int10 == 115260000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599948L) + "'", long12 == (-360599948L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-107939902L) + "'", long14 == (-107939902L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115260000 + "'", int16 == 115260000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-111600000L) + "'", long19 == (-111600000L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-151259888L) + "'", long22 == (-151259888L));
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        long long8 = dateTimeZone1.previousTransition((-115799904L));
        java.lang.String str10 = dateTimeZone1.getName((long) 100);
        java.lang.String str12 = dateTimeZone1.getName((-323999999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:01" + "'", str2, "+32:01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:01" + "'", str4, "+32:01");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115260000 + "'", int6 == 115260000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115799904L) + "'", long8 == (-115799904L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:01" + "'", str10, "+32:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:01" + "'", str12, "+32:01");
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115800000);
        java.lang.String str3 = dateTimeZone1.getNameKey(0L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone1.getNameKey(36000031L);
        long long11 = dateTimeZone1.convertLocalToUTC((-151799899L), true, 71999948L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115800000 + "'", int5 == 115800000);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-267599899L) + "'", long11 == (-267599899L));
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
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
        java.lang.String str21 = dateTimeZone3.toString();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj24 = dateTimeZone23.writeReplace();
        java.lang.String str25 = dateTimeZone23.getID();
        long long27 = dateTimeZone23.convertUTCToLocal(100L);
        boolean boolean28 = dateTimeZone23.isFixed();
        long long30 = dateTimeZone23.previousTransition(231059997L);
        long long32 = dateTimeZone3.getMillisKeepLocal(dateTimeZone23, (-1570084924047L));
        int int34 = dateTimeZone3.getOffset((-10800101L));
        java.util.TimeZone timeZone35 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115260000 + "'", int7 == 115260000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:01" + "'", str12, "+32:01");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-115259990L) + "'", long18 == (-115259990L));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:01" + "'", str21, "+32:01");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 99L + "'", long27 == 99L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 231059997L + "'", long30 == 231059997L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1569969664046L) + "'", long32 == (-1569969664046L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 115260000 + "'", int34 == 115260000);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone36);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
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
        boolean boolean13 = dateTimeZone10.isFixed();
        int int15 = dateTimeZone10.getStandardOffset(0L);
        java.lang.String str16 = dateTimeZone10.toString();
        java.util.TimeZone timeZone17 = dateTimeZone10.toTimeZone();
        java.lang.Object obj18 = dateTimeZone10.writeReplace();
        java.lang.String str20 = dateTimeZone10.getNameKey((-126600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115260000 + "'", int7 == 115260000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC((-115799899L), true, 36000100L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        long long15 = dateTimeZone1.convertLocalToUTC((-1569969663899L), true, (-1570120923936L));
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        long long19 = dateTimeZone17.nextTransition((long) (short) 100);
        int int21 = dateTimeZone17.getOffsetFromLocal(100L);
        long long23 = dateTimeZone17.previousTransition(10L);
        java.lang.String str25 = dateTimeZone17.getShortName(100L);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone17.getShortName(79800002L, locale27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long32 = dateTimeZone30.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone30.getOffset(readableInstant33);
        java.lang.Object obj35 = dateTimeZone30.writeReplace();
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone30.getName((long) '#', locale37);
        java.lang.String str39 = dateTimeZone30.getID();
        boolean boolean40 = dateTimeZone17.equals((java.lang.Object) dateTimeZone30);
        long long42 = dateTimeZone1.getMillisKeepLocal(dateTimeZone17, 3600001L);
        boolean boolean43 = dateTimeZone17.isFixed();
        int int45 = dateTimeZone17.getOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:01" + "'", str2, "+32:01");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-231059899L) + "'", long8 == (-231059899L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084923899L) + "'", long15 == (-1570084923899L));
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 115260000 + "'", int21 == 115260000);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:01" + "'", str25, "+32:01");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:01" + "'", str28, "+32:01");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 115260000 + "'", int34 == 115260000);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+32:01" + "'", str38, "+32:01");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+32:01" + "'", str39, "+32:01");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 3600001L + "'", long42 == 3600001L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 115260000 + "'", int45 == 115260000);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
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
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        int int19 = dateTimeZone17.getOffset((long) (-1));
        long long21 = dateTimeZone3.getMillisKeepLocal(dateTimeZone17, 115260002L);
        long long23 = dateTimeZone17.previousTransition(51L);
        boolean boolean24 = dateTimeZone17.isFixed();
        int int26 = dateTimeZone17.getOffsetFromLocal((-115799864L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115260000 + "'", int7 == 115260000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:01" + "'", str12, "+32:01");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 230519967L + "'", long21 == 230519967L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 51L + "'", long23 == 51L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Asia/Bangkok");
        boolean boolean3 = dateTimeZone1.isStandardOffset((-115799904L));
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        boolean boolean5 = dateTimeZone1.isFixed();
        long long7 = dateTimeZone1.nextTransition((-206459999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-206459999L) + "'", long7 == (-206459999L));
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360600000);
        java.lang.String str3 = dateTimeZone1.getName((long) 60000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+100:10" + "'", str3, "+100:10");
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.toString();
        java.lang.String str5 = dateTimeZone1.getName(11L);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isStandardOffset(94L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.lang.String str12 = dateTimeZone10.getNameKey((-90600100L));
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (-1570164664001L));
        java.lang.String str15 = dateTimeZone10.toString();
        long long17 = dateTimeZone10.nextTransition(60002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:01" + "'", str2, "+32:01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:01" + "'", str3, "+32:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:01" + "'", str5, "+32:01");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1570045804001L) + "'", long14 == (-1570045804001L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-01:00" + "'", str15, "-01:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 60002L + "'", long17 == 60002L);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
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
        java.lang.String str41 = dateTimeZone13.toString();
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        long long45 = dateTimeZone43.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant46 = null;
        int int47 = dateTimeZone43.getOffset(readableInstant46);
        java.lang.String str49 = dateTimeZone43.getNameKey((-1570084924047L));
        org.joda.time.ReadableInstant readableInstant50 = null;
        int int51 = dateTimeZone43.getOffset(readableInstant50);
        int int53 = dateTimeZone43.getStandardOffset((-115799866L));
        java.lang.String str54 = dateTimeZone43.getID();
        java.lang.String str56 = dateTimeZone43.getShortName(115260051L);
        java.lang.Object obj57 = dateTimeZone43.writeReplace();
        long long59 = dateTimeZone13.getMillisKeepLocal(dateTimeZone43, (-1570434124100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115260000 + "'", int7 == 115260000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115260000 + "'", int23 == 115260000);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:01" + "'", str27, "+32:01");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:01" + "'", str30, "+32:01");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+32:01" + "'", str33, "+32:01");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+32:01" + "'", str35, "+32:01");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1570005664101L) + "'", long40 == (-1570005664101L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTC" + "'", str41, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 100L + "'", long45 == 100L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 115260000 + "'", int47 == 115260000);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 115260000 + "'", int51 == 115260000);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 115260000 + "'", int53 == 115260000);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+32:01" + "'", str54, "+32:01");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+32:01" + "'", str56, "+32:01");
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1570549384100L) + "'", long59 == (-1570549384100L));
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:35");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((-35999899L), locale3);
        int int6 = dateTimeZone1.getOffset((-59990L));
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone8.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone8.getOffset(readableInstant11);
        java.lang.Object obj13 = dateTimeZone8.writeReplace();
        java.lang.Object obj14 = dateTimeZone8.writeReplace();
        boolean boolean15 = dateTimeZone8.isFixed();
        long long17 = dateTimeZone8.nextTransition(11L);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone8.isLocalDateTimeGap(localDateTime18);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, (-25740000L));
        java.lang.Class<?> wildcardClass23 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:35" + "'", str4, "+00:35");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2100000 + "'", int6 == 2100000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115260000 + "'", int12 == 115260000);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 11L + "'", long17 == 11L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-138900000L) + "'", long22 == (-138900000L));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        long long7 = dateTimeZone1.previousTransition(0L);
        long long9 = dateTimeZone1.nextTransition((long) '#');
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((long) 115800000, locale11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((long) 'a', locale14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone1.getOffset(readableInstant16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
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
        java.lang.String str19 = dateTimeZone3.getShortName(0L, locale18);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        long long24 = dateTimeZone3.convertLocalToUTC(36000031L, true, 79800002L);
        int int26 = dateTimeZone3.getStandardOffset((-23640000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115260000 + "'", int7 == 115260000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:01" + "'", str12, "+32:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:01" + "'", str14, "+32:01");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:01" + "'", str15, "+32:01");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:01" + "'", str19, "+32:01");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-79259969L) + "'", long24 == (-79259969L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 115260000 + "'", int26 == 115260000);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isFixed();
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        java.lang.String str11 = dateTimeZone1.getShortName((-115800100L));
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        java.lang.String str13 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115260000 + "'", int5 == 115260000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:01" + "'", str11, "+32:01");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:01" + "'", str13, "+32:01");
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long15 = dateTimeZone12.convertLocalToUTC((-1570084924001L), false);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) long15);
        java.lang.String str18 = dateTimeZone1.getName(54059999L);
        java.lang.String str20 = dateTimeZone1.getShortName(115739899L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924000L) + "'", long15 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
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
        java.lang.String str16 = dateTimeZone3.getNameKey(0L);
        long long18 = dateTimeZone3.previousTransition((-35939934L));
        java.lang.String str19 = dateTimeZone3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115260000 + "'", int7 == 115260000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:01" + "'", str11, "+32:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:01" + "'", str14, "+32:01");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-35939934L) + "'", long18 == (-35939934L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:01" + "'", str19, "+32:01");
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        int int8 = dateTimeZone1.getOffsetFromLocal(25200052L);
        long long10 = dateTimeZone1.nextTransition(115260050L);
        long long12 = dateTimeZone1.previousTransition(200L);
        int int14 = dateTimeZone1.getOffsetFromLocal((long) 2100000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:01" + "'", str2, "+32:01");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115260000 + "'", int8 == 115260000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115260050L + "'", long10 == 115260050L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 200L + "'", long12 == 200L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115260000 + "'", int14 == 115260000);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        java.lang.String str4 = dateTimeZone2.getNameKey(1L);
        int int6 = dateTimeZone2.getStandardOffset(36000002L);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone8.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone8.getOffset(readableInstant11);
        java.lang.Object obj13 = dateTimeZone8.writeReplace();
        long long15 = dateTimeZone8.previousTransition(97L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone8.getShortName((long) 35, locale17);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone8.getShortName((-1570200724100L), locale20);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str25 = dateTimeZone23.getNameKey((long) 115800000);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone23.getShortName((-1570084924001L), locale27);
        long long30 = dateTimeZone8.getMillisKeepLocal(dateTimeZone23, (long) (short) 1);
        long long32 = dateTimeZone2.getMillisKeepLocal(dateTimeZone23, 0L);
        int int34 = dateTimeZone2.getOffset(115800197L);
        org.joda.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = dateTimeZone2.isLocalDateTimeGap(localDateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2100000 + "'", int6 == 2100000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115260000 + "'", int12 == 115260000);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:01" + "'", str18, "+32:01");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:01" + "'", str21, "+32:01");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 115260002L + "'", long30 == 115260002L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 2100001L + "'", long32 == 2100001L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2100000 + "'", int34 == 2100000);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
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
        java.lang.String str37 = dateTimeZone10.getID();
        java.lang.String str39 = dateTimeZone10.getNameKey((-3599990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115260000 + "'", int14 == 115260000);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-25200001L) + "'", long25 == (-25200001L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-115259904L) + "'", long27 == (-115259904L));
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 115259998L + "'", long33 == 115259998L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+32:01" + "'", str36, "+32:01");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+32:01" + "'", str37, "+32:01");
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
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
        boolean boolean19 = dateTimeZone1.isFixed();
        int int21 = dateTimeZone1.getOffsetFromLocal(0L);
        int int23 = dateTimeZone1.getOffsetFromLocal((-59905L));
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone1.getShortName(36000000L, locale25);
        java.lang.String str27 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115260000 + "'", int5 == 115260000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25200001L) + "'", long16 == (-25200001L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:01" + "'", str17, "+32:01");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 115260000 + "'", int21 == 115260000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115260000 + "'", int23 == 115260000);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:01" + "'", str26, "+32:01");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:01" + "'", str27, "+32:01");
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
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
        java.lang.String str33 = dateTimeZone18.getName(115799965L);
        boolean boolean35 = dateTimeZone18.isStandardOffset((-1570084924098L));
        java.lang.Object obj36 = dateTimeZone18.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115260000 + "'", int7 == 115260000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:01" + "'", str11, "+32:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:01" + "'", str14, "+32:01");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115260000 + "'", int22 == 115260000);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:01" + "'", str26, "+32:01");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:01" + "'", str29, "+32:01");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-115800099L) + "'", long31 == (-115800099L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+32:01" + "'", str33, "+32:01");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((-25200001L));
        java.lang.String str3 = dateTimeZone0.getID();
        long long7 = dateTimeZone0.convertLocalToUTC((-1570012923999L), false, 103L);
        long long10 = dateTimeZone0.convertLocalToUTC(115320084L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570012923999L) + "'", long7 == (-1570012923999L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115320084L + "'", long10 == 115320084L);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        int int8 = dateTimeZone1.getOffsetFromLocal(25200052L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName(11L, locale10);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:01" + "'", str2, "+32:01");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115260000 + "'", int8 == 115260000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:01" + "'", str11, "+32:01");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
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
        java.lang.String str23 = dateTimeZone3.getShortName((-34439999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115260000 + "'", int7 == 115260000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:01" + "'", str12, "+32:01");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:01" + "'", str16, "+32:01");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115260000 + "'", int18 == 115260000);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 115260032L + "'", long20 == 115260032L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:01" + "'", str23, "+32:01");
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
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
        long long17 = dateTimeZone12.convertUTCToLocal((-1570192924001L));
        int int19 = dateTimeZone12.getOffsetFromLocal((-71459998L));
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj24 = dateTimeZone23.writeReplace();
        java.lang.String str25 = dateTimeZone23.getID();
        long long28 = dateTimeZone23.convertLocalToUTC((long) 'a', true);
        int int30 = dateTimeZone23.getStandardOffset(0L);
        long long34 = dateTimeZone23.convertLocalToUTC(102L, false, 2L);
        long long38 = dateTimeZone23.convertLocalToUTC((long) (byte) 1, false, (-25740001L));
        long long40 = dateTimeZone21.getMillisKeepLocal(dateTimeZone23, 119400001L);
        long long43 = dateTimeZone21.convertLocalToUTC((-59899L), true);
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone21.getShortName((-190320068L), locale45);
        long long49 = dateTimeZone21.adjustOffset(443399901L, true);
        java.lang.Object obj50 = dateTimeZone21.writeReplace();
        boolean boolean51 = dateTimeZone12.equals(obj50);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115260000 + "'", int8 == 115260000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115260000 + "'", int10 == 115260000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 79260100L + "'", long14 == 79260100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570156924001L) + "'", long17 == (-1570156924001L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36000000 + "'", int19 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 98L + "'", long28 == 98L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 103L + "'", long34 == 103L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 2L + "'", long38 == 2L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 155400002L + "'", long40 == 155400002L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-36059899L) + "'", long43 == (-36059899L));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+10:00" + "'", str46, "+10:00");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 443399901L + "'", long49 == 443399901L);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        long long36 = dateTimeZone32.getMillisKeepLocal(dateTimeZone34, (long) 'a');
        int int38 = dateTimeZone34.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone39 = dateTimeZone34.toTimeZone();
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone34.getShortName((long) (byte) 100, locale41);
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone34.getShortName((long) (short) 0, locale44);
        java.lang.String str46 = dateTimeZone34.getID();
        long long48 = dateTimeZone27.getMillisKeepLocal(dateTimeZone34, (-35999849L));
        boolean boolean49 = dateTimeZone34.isFixed();
        java.lang.String str51 = dateTimeZone34.getName(72059979L);
        java.util.TimeZone timeZone52 = dateTimeZone34.toTimeZone();
        boolean boolean53 = dateTimeZone34.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+10:00" + "'", str20, "+10:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+10:00" + "'", str22, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-187140000L) + "'", long29 == (-187140000L));
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 97L + "'", long36 == 97L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 187200000 + "'", int38 == 187200000);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+52:00" + "'", str42, "+52:00");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+52:00" + "'", str45, "+52:00");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+52:00" + "'", str46, "+52:00");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-35999849L) + "'", long48 == (-35999849L));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+52:00" + "'", str51, "+52:00");
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
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
        long long16 = dateTimeZone1.convertLocalToUTC(115259967L, true, 0L);
        boolean boolean17 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 187200000 + "'", int5 == 187200000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+52:00" + "'", str12, "+52:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-71940033L) + "'", long16 == (-71940033L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
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
        long long18 = dateTimeZone3.nextTransition(119400000L);
        java.lang.Object obj19 = dateTimeZone3.writeReplace();
        long long21 = dateTimeZone3.previousTransition(3L);
        int int23 = dateTimeZone3.getOffset(151259967L);
        java.lang.String str25 = dateTimeZone3.getName(115259952L);
        java.util.TimeZone timeZone26 = dateTimeZone3.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+52:00" + "'", str12, "+52:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+52:00" + "'", str16, "+52:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 119400000L + "'", long18 == 119400000L);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3L + "'", long21 == 3L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 187200000 + "'", int23 == 187200000);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+52:00" + "'", str25, "+52:00");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
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
        java.lang.String str28 = dateTimeZone3.getNameKey(25200000L);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long32 = dateTimeZone30.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone30.getOffset(readableInstant33);
        java.lang.String str35 = dateTimeZone30.toString();
        org.joda.time.ReadableInstant readableInstant36 = null;
        int int37 = dateTimeZone30.getOffset(readableInstant36);
        java.lang.String str39 = dateTimeZone30.getShortName(1L);
        long long41 = dateTimeZone30.nextTransition((long) 10);
        long long43 = dateTimeZone30.convertUTCToLocal(115799999L);
        java.lang.String str45 = dateTimeZone30.getShortName((-1570084923900L));
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forID("Asia/Bangkok");
        long long49 = dateTimeZone30.getMillisKeepLocal(dateTimeZone47, (-36000001L));
        long long51 = dateTimeZone3.getMillisKeepLocal(dateTimeZone30, (-39660000L));
        int int53 = dateTimeZone3.getOffset((-1570086964046L));
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str56 = dateTimeZone54.getShortName((-25200001L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone54);
        long long59 = dateTimeZone3.getMillisKeepLocal(dateTimeZone54, 119399948L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+52:00" + "'", str11, "+52:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+52:00" + "'", str14, "+52:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 187200000 + "'", int17 == 187200000);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+52:00" + "'", str19, "+52:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+52:00" + "'", str21, "+52:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+52:00" + "'", str24, "+52:00");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 187200000 + "'", int34 == 187200000);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+52:00" + "'", str35, "+52:00");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 187200000 + "'", int37 == 187200000);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+52:00" + "'", str39, "+52:00");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 302999999L + "'", long43 == 302999999L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+52:00" + "'", str45, "+52:00");
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 125999999L + "'", long49 == 125999999L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-39660000L) + "'", long51 == (-39660000L));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 187200000 + "'", int53 == 187200000);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00" + "'", str56, "+00:00");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 306599948L + "'", long59 == 306599948L);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
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
        long long33 = dateTimeZone1.previousTransition(23100051L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-25200001L) + "'", long25 == (-25200001L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 96L + "'", long27 == 96L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-25740000L) + "'", long31 == (-25740000L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 23100051L + "'", long33 == 23100051L);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        int int3 = dateTimeZone1.getStandardOffset(234659999L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
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
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone12.isLocalDateTimeGap(localDateTime19);
        java.lang.String str22 = dateTimeZone12.getShortName(36000036L);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone12.getShortName((long) 129120000, locale24);
        java.lang.Object obj26 = dateTimeZone12.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999900L) + "'", long14 == (-35999900L));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+10:00" + "'", str22, "+10:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+10:00" + "'", str25, "+10:00");
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 10);
        boolean boolean4 = dateTimeZone2.isStandardOffset(36000100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str7 = dateTimeZone2.getName((-60100L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:10" + "'", str7, "+100:10");
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
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
        int int18 = dateTimeZone3.getStandardOffset((-392340000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 360600000 + "'", int7 == 360600000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+:0:10");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+:0:10");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 360600000 + "'", int13 == 360600000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+100:10" + "'", str14, "+100:10");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570048924000L) + "'", long16 == (-1570048924000L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 360600000 + "'", int18 == 360600000);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
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
        int int22 = dateTimeZone1.getOffset((-1570084923946L));
        long long25 = dateTimeZone1.adjustOffset((-1570012924033L), false);
        boolean boolean26 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+100:10" + "'", str8, "+100:10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+100:10" + "'", str12, "+100:10");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 360600000 + "'", int14 == 360600000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 360600000 + "'", int16 == 360600000);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-335399948L) + "'", long20 == (-335399948L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 360600000 + "'", int22 == 360600000);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1570012924033L) + "'", long25 == (-1570012924033L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
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
        boolean boolean16 = dateTimeZone12.isStandardOffset((-60000L));
        boolean boolean18 = dateTimeZone12.isStandardOffset((-1570120924201L));
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        long long22 = dateTimeZone20.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone20.getOffset(readableInstant23);
        java.lang.String str25 = dateTimeZone20.toString();
        long long27 = dateTimeZone20.previousTransition((long) (short) 1);
        java.lang.String str28 = dateTimeZone20.getID();
        boolean boolean30 = dateTimeZone20.isStandardOffset((-1570048924000L));
        boolean boolean31 = dateTimeZone12.equals((java.lang.Object) (-1570048924000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 360600000 + "'", int8 == 360600000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 360600000 + "'", int10 == 360600000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 324600100L + "'", long14 == 324600100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 360600000 + "'", int24 == 360600000);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+100:10" + "'", str25, "+100:10");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+100:10" + "'", str28, "+100:10");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
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
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        long long28 = dateTimeZone24.getMillisKeepLocal(dateTimeZone26, (long) 'a');
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone24.getName((long) (short) 1, locale30);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        long long34 = dateTimeZone24.nextTransition((long) ' ');
        long long36 = dateTimeZone1.getMillisKeepLocal(dateTimeZone24, (-1570048924100L));
        java.lang.String str38 = dateTimeZone1.getNameKey((-115260000L));
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj41 = dateTimeZone40.writeReplace();
        long long43 = dateTimeZone1.getMillisKeepLocal(dateTimeZone40, 3599999L);
        java.lang.String str45 = dateTimeZone40.getNameKey(36000095L);
        org.joda.time.ReadableInstant readableInstant46 = null;
        int int47 = dateTimeZone40.getOffset(readableInstant46);
        java.util.Locale locale49 = null;
        java.lang.String str50 = dateTimeZone40.getName(28859948L, locale49);
        java.lang.String str52 = dateTimeZone40.getShortName((-1570084864100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 97L + "'", long28 == 97L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+100:10" + "'", str31, "+100:10");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1570409524099L) + "'", long36 == (-1570409524099L));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 3600001L + "'", long43 == 3600001L);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "-00:00:00.001" + "'", str50, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "-00:00:00.001" + "'", str52, "-00:00:00.001");
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        java.lang.String str8 = dateTimeZone1.getName((-1570084924101L));
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.Object obj14 = dateTimeZone13.writeReplace();
        int int16 = dateTimeZone13.getOffsetFromLocal(42L);
        java.lang.String str17 = dateTimeZone13.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
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
        long long26 = dateTimeZone1.convertUTCToLocal((-1570048924100L));
        boolean boolean27 = dateTimeZone1.isFixed();
        long long30 = dateTimeZone1.convertLocalToUTC(93179901L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+100:10" + "'", str8, "+100:10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 360600000 + "'", int10 == 360600000);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 360600000 + "'", int18 == 360600000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 360600000 + "'", int20 == 360600000);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+:0:10");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-396599990L) + "'", long24 == (-396599990L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1569688324100L) + "'", long26 == (-1569688324100L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-267420099L) + "'", long30 == (-267420099L));
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
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
        java.lang.String str14 = dateTimeZone3.toString();
        java.util.TimeZone timeZone15 = dateTimeZone3.toTimeZone();
        boolean boolean17 = dateTimeZone3.isStandardOffset((-10800101L));
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj20 = dateTimeZone19.writeReplace();
        java.lang.String str21 = dateTimeZone19.getID();
        long long23 = dateTimeZone19.previousTransition(25200000L);
        boolean boolean24 = dateTimeZone3.equals((java.lang.Object) long23);
        int int26 = dateTimeZone3.getOffsetFromLocal(360000000L);
        long long28 = dateTimeZone3.previousTransition((-1570123024299L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 360600000 + "'", int7 == 360600000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+:0:10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 360600000 + "'", int10 == 360600000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+100:10" + "'", str14, "+100:10");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+:0:10");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 25200000L + "'", long23 == 25200000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 360600000 + "'", int26 == 360600000);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1570123024299L) + "'", long28 == (-1570123024299L));
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC((-115799899L), true, 36000100L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        long long15 = dateTimeZone1.convertLocalToUTC((-1569969663899L), true, (-1570120923936L));
        long long17 = dateTimeZone1.nextTransition(59958L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName((-1569722824000L), locale19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+100:10" + "'", str2, "+100:10");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-476399899L) + "'", long8 == (-476399899L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+:0:10");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570330263899L) + "'", long15 == (-1570330263899L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 59958L + "'", long17 == 59958L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+100:10" + "'", str20, "+100:10");
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        int int14 = dateTimeZone12.getOffset((-126600052L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long3 = dateTimeZone1.convertUTCToLocal((long) 25200000);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) ' ');
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25200052L + "'", long3 == 25200052L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360600000);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+100:10" + "'", str3, "+100:10");
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
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
        long long20 = dateTimeZone1.convertUTCToLocal(32L);
        java.lang.String str22 = dateTimeZone1.getName((-1570084924045L));
        long long25 = dateTimeZone1.adjustOffset(0L, true);
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone1.isLocalDateTimeGap(localDateTime26);
        long long31 = dateTimeZone1.convertLocalToUTC((-1570084923901L), true, 4L);
        long long34 = dateTimeZone1.adjustOffset((-61140001L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 360600000 + "'", int5 == 360600000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25200001L) + "'", long16 == (-25200001L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+100:10" + "'", str17, "+100:10");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+:0:10");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 360600032L + "'", long20 == 360600032L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+100:10" + "'", str22, "+100:10");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1570445523901L) + "'", long31 == (-1570445523901L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-61140001L) + "'", long34 == (-61140001L));
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long10 = dateTimeZone1.convertLocalToUTC((-1L), false, (long) '#');
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        java.lang.String str19 = dateTimeZone16.getNameKey((-48L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 10);
        long long6 = dateTimeZone2.convertLocalToUTC((-1569969664099L), true, 101L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone2.getName(99L, locale8);
        long long11 = dateTimeZone2.previousTransition(43800000L);
        long long14 = dateTimeZone2.adjustOffset(475860000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1570085464099L) + "'", long6 == (-1570085464099L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:10" + "'", str9, "+32:10");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 43800000L + "'", long11 == 43800000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 475860000L + "'", long14 == 475860000L);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
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
        java.util.TimeZone timeZone27 = dateTimeZone1.toTimeZone();
        long long31 = dateTimeZone1.convertLocalToUTC((-34440000L), true, (long) (short) 10);
        long long34 = dateTimeZone1.adjustOffset(25199965L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570084924001L) + "'", long26 == (-1570084924001L));
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-34440000L) + "'", long31 == (-34440000L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 25199965L + "'", long34 == 25199965L);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(362100000);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str4 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 362100000 + "'", int3 == 362100000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:35" + "'", str4, "+100:35");
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
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
        boolean boolean13 = dateTimeZone3.isFixed();
        long long15 = dateTimeZone3.previousTransition((-1570120924112L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570120924112L) + "'", long15 == (-1570120924112L));
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
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
        long long15 = dateTimeZone5.nextTransition((-1570084923999L));
        java.lang.String str17 = dateTimeZone5.getName(79800000L);
        int int19 = dateTimeZone5.getStandardOffset((-1570012923999L));
        long long21 = dateTimeZone5.convertUTCToLocal((-126599965L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084923999L) + "'", long15 == (-1570084923999L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-126599965L) + "'", long21 == (-126599965L));
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        long long15 = dateTimeZone1.convertLocalToUTC((-1570048924001L), false, 35L);
        int int17 = dateTimeZone1.getOffsetFromLocal((-115259999L));
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone1.getOffset(readableInstant18);
        long long21 = dateTimeZone1.previousTransition((-1570048923849L));
        long long24 = dateTimeZone1.adjustOffset(231480001L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570048924000L) + "'", long15 == (-1570048924000L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1570048923849L) + "'", long21 == (-1570048923849L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 231480001L + "'", long24 == 231480001L);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
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
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone3.getShortName((-231599899L), locale18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone3.getOffset(readableInstant20);
        java.lang.String str23 = dateTimeZone3.getName(129120008L);
        long long26 = dateTimeZone3.convertLocalToUTC((-115799904L), true);
        java.lang.String str27 = dateTimeZone3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-115799904L) + "'", long26 == (-115799904L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        int int6 = dateTimeZone2.getOffset(115860097L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 349200000 + "'", int4 == 349200000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
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
        boolean boolean17 = dateTimeZone3.isFixed();
        long long19 = dateTimeZone3.nextTransition(231480135L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200052L + "'", long16 == 25200052L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 231480135L + "'", long19 == 231480135L);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
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
        long long28 = dateTimeZone1.adjustOffset((long) ' ', true);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone1.getShortName(89519900L, locale30);
        java.lang.Object obj32 = dateTimeZone1.writeReplace();
        long long34 = dateTimeZone1.convertUTCToLocal(35999909L);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.001" + "'", str31, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 35999910L + "'", long34 == 35999910L);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(102L, false, 2L);
        boolean boolean13 = dateTimeZone1.isFixed();
        int int15 = dateTimeZone1.getOffset((-1570200183902L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 103L + "'", long12 == 103L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int5 = dateTimeZone1.getOffset(4140001L);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long8 = dateTimeZone1.previousTransition((-176459968L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-176459968L) + "'", long8 == (-176459968L));
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
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
        int int14 = dateTimeZone10.getOffsetFromLocal((-1570120924000L));
        java.util.TimeZone timeZone15 = dateTimeZone10.toTimeZone();
        java.lang.Object obj16 = dateTimeZone10.writeReplace();
        java.lang.String str18 = dateTimeZone10.getNameKey(119400101L);
        int int20 = dateTimeZone10.getOffset(3659900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36000000L + "'", long12 == 36000000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
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
        java.lang.String str15 = dateTimeZone1.getShortName((-4L));
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone1.getOffset(readableInstant16);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Object obj19 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getOffset(60199L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3600000) + "'", int3 == (-3600000));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3600000) + "'", int5 == (-3600000));
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long4 = dateTimeZone1.nextTransition((-99L));
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName(0L, locale6);
        int int9 = dateTimeZone1.getOffsetFromLocal((-1570084923899L));
        long long11 = dateTimeZone1.previousTransition((-126600052L));
        long long13 = dateTimeZone1.nextTransition((-1570200664101L));
        int int15 = dateTimeZone1.getOffsetFromLocal(115800009L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-126600052L) + "'", long11 == (-126600052L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570200664101L) + "'", long13 == (-1570200664101L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isFixed();
        long long10 = dateTimeZone1.nextTransition(11L);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str16 = dateTimeZone15.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        boolean boolean18 = dateTimeZone15.isFixed();
        java.lang.String str19 = dateTimeZone15.toString();
        int int21 = dateTimeZone15.getStandardOffset((-26280099L));
        java.lang.String str22 = dateTimeZone15.getID();
        boolean boolean23 = dateTimeZone1.equals((java.lang.Object) dateTimeZone15);
        java.lang.Class<?> wildcardClass24 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11L + "'", long10 == 11L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        long long4 = dateTimeZone1.convertLocalToUTC((-59903L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone6.getName(101L, locale8);
        java.lang.String str11 = dateTimeZone6.getShortName((-1570084924200L));
        java.lang.Object obj12 = dateTimeZone6.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        long long18 = dateTimeZone14.adjustOffset((long) (short) 0, true);
        long long20 = dateTimeZone6.getMillisKeepLocal(dateTimeZone14, 187260000L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 3599999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-36059903L) + "'", long4 == (-36059903L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.052" + "'", str9, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.052" + "'", str11, "+00:00:00.052");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 187260051L + "'", long20 == 187260051L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 39599998L + "'", long22 == 39599998L);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115800000);
        java.lang.String str3 = dateTimeZone1.getNameKey(0L);
        long long5 = dateTimeZone1.nextTransition((-1569969664099L));
        long long8 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, true);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-360599899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1569969664099L) + "'", long5 == (-1569969664099L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115799990L) + "'", long8 == (-115799990L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-35999901L));
        long long12 = dateTimeZone1.previousTransition((long) (short) 1);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long18 = dateTimeZone15.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        int int21 = dateTimeZone15.getOffsetFromLocal(115800051L);
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, (long) (short) 0);
        java.lang.Object obj24 = dateTimeZone15.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-99L) + "'", long18 == (-99L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-100L) + "'", long23 == (-100L));
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str6 = dateTimeZone1.getShortName(2L);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone8.convertUTCToLocal((-59989L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-59989L) + "'", long10 == (-59989L));
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        int int13 = dateTimeZone10.getOffset((-36000000L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone10.getShortName(79200153L, locale15);
        long long18 = dateTimeZone10.convertUTCToLocal((-36059990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "11) test4767(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-36059990L) + "'", long18 == (-36059990L));
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        java.lang.String str6 = dateTimeZone1.getName(25200052L);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        int int14 = dateTimeZone10.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone15 = dateTimeZone10.toTimeZone();
        java.util.TimeZone timeZone16 = dateTimeZone10.toTimeZone();
        long long18 = dateTimeZone10.nextTransition((long) 1);
        int int20 = dateTimeZone10.getOffset((long) (-1));
        java.lang.String str21 = dateTimeZone10.getID();
        long long23 = dateTimeZone10.convertUTCToLocal((-1570084924000L));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long27 = dateTimeZone10.getMillisKeepLocal(dateTimeZone25, (long) (byte) 10);
        java.lang.String str29 = dateTimeZone10.getShortName(36000000L);
        long long31 = dateTimeZone10.convertUTCToLocal(52L);
        boolean boolean32 = dateTimeZone1.equals((java.lang.Object) dateTimeZone10);
        long long34 = dateTimeZone10.convertUTCToLocal((-35999948L));
        java.lang.Object obj35 = dateTimeZone10.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
// flaky "12) test4768(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
// flaky "11) test4768(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
// flaky "10) test4768(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.001" + "'", str21, "+00:00:00.001");
// flaky "8) test4768(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1570084923999L) + "'", long23 == (-1570084923999L));
        org.junit.Assert.assertNotNull(dateTimeZone25);
// flaky "6) test4768(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 12L + "'", long27 == 12L);
// flaky "3) test4768(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.001" + "'", str29, "+00:00:00.001");
// flaky "2) test4768(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 53L + "'", long31 == 53L);
// flaky "1) test4768(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky "1) test4768(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-35999947L) + "'", long34 == (-35999947L));
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getStandardOffset((long) (short) 0);
        long long7 = dateTimeZone1.previousTransition((long) '#');
        int int9 = dateTimeZone1.getOffsetFromLocal(115799900L);
        long long11 = dateTimeZone1.convertUTCToLocal((-36000000L));
        java.lang.String str12 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "13) test4769(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
// flaky "12) test4769(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
// flaky "11) test4769(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-35999999L) + "'", long11 == (-35999999L));
// flaky "9) test4769(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
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
        long long16 = dateTimeZone3.convertLocalToUTC(119400000L, false, (long) 52);
        long long18 = dateTimeZone3.convertUTCToLocal((-91L));
        long long20 = dateTimeZone3.previousTransition(32340032L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "14) test4770(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "13) test4770(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 119399999L + "'", long16 == 119399999L);
// flaky "12) test4770(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-90L) + "'", long18 == (-90L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32340032L + "'", long20 == 32340032L);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
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
        long long27 = dateTimeZone3.convertUTCToLocal((-65L));
        long long29 = dateTimeZone3.convertUTCToLocal(0L);
        int int31 = dateTimeZone3.getOffset(89519999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "15) test4771(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "14) test4771(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
// flaky "13) test4771(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
// flaky "10) test4771(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
// flaky "7) test4771(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
// flaky "4) test4771(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
// flaky "3) test4771(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
// flaky "2) test4771(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-64L) + "'", long27 == (-64L));
// flaky "2) test4771(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
// flaky "1) test4771(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long8 = dateTimeZone4.convertLocalToUTC((-1570200724001L), false, 0L);
        boolean boolean9 = dateTimeZone4.isFixed();
        java.util.TimeZone timeZone10 = dateTimeZone4.toTimeZone();
        java.lang.String str11 = dateTimeZone4.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1570200724001L) + "'", long8 == (-1570200724001L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        long long4 = dateTimeZone2.convertUTCToLocal((-1570084924099L));
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
        boolean boolean19 = dateTimeZone8.equals((java.lang.Object) (byte) 0);
        java.lang.String str21 = dateTimeZone8.getName(115799900L);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone8.isLocalDateTimeGap(localDateTime22);
        long long25 = dateTimeZone8.previousTransition((-1570214044099L));
        boolean boolean26 = dateTimeZone2.equals((java.lang.Object) long25);
        java.lang.String str28 = dateTimeZone2.getShortName((-1569853863900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1569969664099L) + "'", long4 == (-1569969664099L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "16) test4773(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
// flaky "15) test4773(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky "14) test4773(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.001" + "'", str21, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1570214044099L) + "'", long25 == (-1570214044099L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:01" + "'", str28, "+32:01");
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long8 = dateTimeZone4.convertLocalToUTC((-1570200724001L), false, 0L);
        boolean boolean9 = dateTimeZone4.isFixed();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone4.getOffset(readableInstant10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long16 = dateTimeZone13.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str18 = dateTimeZone13.getShortName(2L);
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        long long24 = dateTimeZone20.convertLocalToUTC((-151259900L), false, (-90600100L));
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone20.getName((long) (-3660000), locale26);
        java.util.TimeZone timeZone28 = dateTimeZone20.toTimeZone();
        boolean boolean29 = dateTimeZone4.equals((java.lang.Object) timeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1570200724001L) + "'", long8 == (-1570200724001L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570084924000L) + "'", long16 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-151259900L) + "'", long24 == (-151259900L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        long long8 = dateTimeZone1.nextTransition((-231599899L));
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        java.lang.String str11 = dateTimeZone1.getNameKey((-115199900L));
        long long14 = dateTimeZone1.adjustOffset(187200000L, true);
        java.lang.String str16 = dateTimeZone1.getName((-349200052L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "17) test4775(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-231599899L) + "'", long8 == (-231599899L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 187200000L + "'", long14 == 187200000L);
// flaky "16) test4775(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str8 = dateTimeZone1.getShortName(115800002L);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-1570084924047L));
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.String str15 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        java.lang.String str17 = dateTimeZone14.getID();
        int int19 = dateTimeZone14.getOffsetFromLocal((long) (byte) 100);
        java.util.TimeZone timeZone20 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.util.TimeZone timeZone22 = dateTimeZone21.toTimeZone();
        boolean boolean23 = dateTimeZone12.equals((java.lang.Object) timeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "18) test4776(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "17) test4776(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky "15) test4776(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
// flaky "11) test4776(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
// flaky "8) test4776(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        long long9 = dateTimeZone1.nextTransition((-115799999L));
        int int11 = dateTimeZone1.getOffset((long) (byte) -1);
        java.lang.String str12 = dateTimeZone1.toString();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((-115799899L), locale14);
        java.lang.String str17 = dateTimeZone1.getShortName((-35999900L));
        int int19 = dateTimeZone1.getOffsetFromLocal(231059997L);
        int int21 = dateTimeZone1.getOffsetFromLocal(0L);
        java.lang.String str22 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone24.getName((-540049L), locale26);
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone24, (-1570081324002L));
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone1.getOffset(readableInstant30);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "19) test4777(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115799999L) + "'", long9 == (-115799999L));
// flaky "18) test4777(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "16) test4777(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
// flaky "12) test4777(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
// flaky "9) test4777(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
// flaky "5) test4777(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
// flaky "4) test4777(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
// flaky "3) test4777(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:01" + "'", str27, "+00:01");
// flaky "3) test4777(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1570081384001L) + "'", long29 == (-1570081384001L));
// flaky "2) test4777(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
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
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone10.isLocalDateTimeGap(localDateTime17);
        java.lang.Object obj19 = dateTimeZone10.writeReplace();
        boolean boolean20 = dateTimeZone10.isFixed();
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone10.getName(244200048L, locale22);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone10.isLocalDateTimeGap(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "20) test4778(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25200001L) + "'", long16 == (-25200001L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "19) test4778(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.001" + "'", str23, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        long long5 = dateTimeZone1.nextTransition(111L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str12 = dateTimeZone11.getID();
        long long14 = dateTimeZone11.previousTransition((-1L));
        long long18 = dateTimeZone11.convertLocalToUTC(25200000L, true, 100L);
        long long20 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, 100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        boolean boolean22 = dateTimeZone9.isFixed();
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone9.getName(0L, locale24);
        boolean boolean26 = dateTimeZone1.equals((java.lang.Object) str25);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 111L + "'", long5 == 111L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky "21) test4779(org.joda.time.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
// flaky "20) test4779(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25199999L + "'", long18 == 25199999L);
// flaky "17) test4779(org.joda.time.RegressionTest9)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.001" + "'", str25, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
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
        java.lang.String str16 = dateTimeZone3.getNameKey(0L);
        java.lang.String str17 = dateTimeZone3.toString();
        long long20 = dateTimeZone3.adjustOffset((-1570048923900L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570048923900L) + "'", long20 == (-1570048923900L));
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 363120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 363120000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
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
        long long15 = dateTimeZone1.previousTransition((-99L));
        java.lang.String str17 = dateTimeZone1.getNameKey((long) '4');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName(25200002L, locale19);
        long long23 = dateTimeZone1.convertLocalToUTC((-39659900L), true);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone1.getShortName(151200011L, locale25);
        boolean boolean27 = dateTimeZone1.isFixed();
        java.lang.String str28 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-99L) + "'", long15 == (-99L));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-39659901L) + "'", long23 == (-39659901L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.001" + "'", str26, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.001" + "'", str28, "+00:00:00.001");
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
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
        java.lang.String str18 = dateTimeZone1.getShortName((long) (short) 10);
        java.lang.String str20 = dateTimeZone1.getNameKey(25200000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570084924101L) + "'", long12 == (-1570084924101L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isFixed();
        long long10 = dateTimeZone1.nextTransition(11L);
        int int12 = dateTimeZone1.getOffset(100L);
        java.lang.Object obj13 = dateTimeZone1.writeReplace();
        long long17 = dateTimeZone1.convertLocalToUTC((-52L), false, (-1570200184100L));
        java.lang.String str19 = dateTimeZone1.getNameKey((long) 349260000);
        boolean boolean20 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11L + "'", long10 == 11L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-53L) + "'", long17 == (-53L));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3600000);
        long long4 = dateTimeZone1.convertLocalToUTC(149L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599851L) + "'", long4 == (-3599851L));
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
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
        long long20 = dateTimeZone2.adjustOffset((-206400000L), true);
        java.util.TimeZone timeZone21 = dateTimeZone2.toTimeZone();
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone2.isLocalDateTimeGap(localDateTime22);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str26 = dateTimeZone2.getName((-87000000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-206400000L) + "'", long20 == (-206400000L));
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:10" + "'", str26, "+32:10");
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 35);
        int int5 = dateTimeZone1.getOffsetFromLocal(3660000L);
        boolean boolean7 = dateTimeZone1.isStandardOffset((-52L));
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        long long11 = dateTimeZone9.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone9.getOffset(readableInstant12);
        java.lang.Object obj14 = dateTimeZone9.writeReplace();
        int int16 = dateTimeZone9.getOffset((long) 1);
        java.lang.String str17 = dateTimeZone9.toString();
        boolean boolean18 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115800000 + "'", int3 == 115800000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115800000 + "'", int5 == 115800000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115800000 + "'", int13 == 115800000);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115800000 + "'", int16 == 115800000);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:10" + "'", str17, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        java.lang.String str10 = dateTimeZone1.getName((long) '#');
        java.lang.String str12 = dateTimeZone1.getName(0L);
        long long14 = dateTimeZone1.convertUTCToLocal(35999979L);
        int int16 = dateTimeZone1.getStandardOffset(79800000L);
        java.lang.String str17 = dateTimeZone1.toString();
        java.lang.String str19 = dateTimeZone1.getShortName((-1570084864001L));
        boolean boolean21 = dateTimeZone1.isStandardOffset(33900101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:10" + "'", str8, "+32:10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:10" + "'", str10, "+32:10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:10" + "'", str12, "+32:10");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 151799979L + "'", long14 == 151799979L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115800000 + "'", int16 == 115800000);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:10" + "'", str17, "+32:10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:10" + "'", str19, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(101L, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName((-1570048923900L), locale6);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone13.getMillisKeepLocal(dateTimeZone15, (long) 'a');
        int int19 = dateTimeZone15.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone20 = dateTimeZone15.toTimeZone();
        java.util.TimeZone timeZone21 = dateTimeZone15.toTimeZone();
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone15.getName((long) (short) 10, locale23);
        boolean boolean25 = dateTimeZone15.isFixed();
        java.util.TimeZone timeZone26 = dateTimeZone15.toTimeZone();
        int int28 = dateTimeZone15.getOffset((long) (byte) 10);
        long long30 = dateTimeZone15.nextTransition((-1570517524000L));
        long long32 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, (-59868L));
        boolean boolean33 = dateTimeZone1.isFixed();
        long long37 = dateTimeZone1.convertLocalToUTC(115800096L, true, (-1570161064002L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.052" + "'", str4, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.052" + "'", str7, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115800000 + "'", int19 == 115800000);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:10" + "'", str24, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 115800000 + "'", int28 == 115800000);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1570517524000L) + "'", long30 == (-1570517524000L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-115859816L) + "'", long32 == (-115859816L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 115800044L + "'", long37 == 115800044L);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360600000);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 52);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        int int7 = dateTimeZone1.getOffset((-2099964L));
        java.lang.String str8 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 360600000 + "'", int7 == 360600000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+100:10" + "'", str8, "+100:10");
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
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
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        long long28 = dateTimeZone24.getMillisKeepLocal(dateTimeZone26, (long) 'a');
        int int30 = dateTimeZone26.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone31 = dateTimeZone26.toTimeZone();
        java.util.TimeZone timeZone32 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        java.lang.String str36 = dateTimeZone35.toString();
        boolean boolean37 = dateTimeZone35.isFixed();
        boolean boolean38 = dateTimeZone22.equals((java.lang.Object) dateTimeZone35);
        int int40 = dateTimeZone22.getOffset((-1570117323999L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:10" + "'", str13, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:10" + "'", str16, "+32:10");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:10" + "'", str17, "+32:10");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115800000 + "'", int19 == 115800000);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 97L + "'", long28 == 97L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 115800000 + "'", int30 == 115800000);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-35999901L));
        long long12 = dateTimeZone1.previousTransition((long) (short) 1);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(362100000);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone15.getOffset(readableInstant16);
        boolean boolean18 = dateTimeZone1.equals((java.lang.Object) dateTimeZone15);
        java.lang.String str20 = dateTimeZone15.getName((-1570200724100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115800000 + "'", int5 == 115800000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115800000 + "'", int8 == 115800000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 362100000 + "'", int17 == 362100000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+100:35" + "'", str20, "+100:35");
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        long long8 = dateTimeZone1.previousTransition((-115799904L));
        boolean boolean9 = dateTimeZone1.isFixed();
        java.lang.String str10 = dateTimeZone1.getID();
        boolean boolean12 = dateTimeZone1.isStandardOffset(324600001L);
        long long15 = dateTimeZone1.adjustOffset(96L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:10" + "'", str2, "+32:10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:10" + "'", str4, "+32:10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115800000 + "'", int6 == 115800000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115799904L) + "'", long8 == (-115799904L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:10" + "'", str10, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 96L + "'", long15 == 96L);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str6 = dateTimeZone1.toString();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-1570085464099L), locale8);
        boolean boolean10 = dateTimeZone1.isFixed();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName(36000001L, locale12);
        long long17 = dateTimeZone1.convertLocalToUTC((-360659904L), false, (-1569969124201L));
        java.lang.String str18 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115800000 + "'", int5 == 115800000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:10" + "'", str6, "+32:10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:10" + "'", str9, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:10" + "'", str13, "+32:10");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-476459904L) + "'", long17 == (-476459904L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:10" + "'", str18, "+32:10");
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360600000);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 52);
        long long6 = dateTimeZone1.convertLocalToUTC((long) '4', false);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        long long10 = dateTimeZone1.convertUTCToLocal((-1570048924000L));
        long long13 = dateTimeZone1.adjustOffset((long) 25200000, true);
        java.lang.String str15 = dateTimeZone1.getName(360599949L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-360599948L) + "'", long6 == (-360599948L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1569688324000L) + "'", long10 == (-1569688324000L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 25200000L + "'", long13 == 25200000L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+100:10" + "'", str15, "+100:10");
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
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
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone3.getName((-115260068L), locale17);
        long long21 = dateTimeZone3.convertLocalToUTC((-23640000L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115800000 + "'", int7 == 115800000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115800000 + "'", int10 == 115800000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-90600000L) + "'", long15 == (-90600000L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:10" + "'", str18, "+32:10");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-139440000L) + "'", long21 == (-139440000L));
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        long long8 = dateTimeZone1.nextTransition((-231599899L));
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(3660101L, locale11);
        long long15 = dateTimeZone1.adjustOffset((long) (-3660000), true);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getShortName(71999948L, locale17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115800000 + "'", int5 == 115800000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-231599899L) + "'", long8 == (-231599899L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:10" + "'", str12, "+32:10");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3660000L) + "'", long15 == (-3660000L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:10" + "'", str18, "+32:10");
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
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
        long long26 = dateTimeZone3.convertLocalToUTC((-115800000L), false);
        boolean boolean28 = dateTimeZone3.isStandardOffset((-1569969124102L));
        java.lang.String str30 = dateTimeZone3.getName(79260100L);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone3.getName((-79259900L), locale32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115800000 + "'", int7 == 115800000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115800000 + "'", int10 == 115800000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115800000 + "'", int12 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 115800002L + "'", long23 == 115800002L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-231600000L) + "'", long26 == (-231600000L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:10" + "'", str30, "+32:10");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+32:10" + "'", str33, "+32:10");
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long13 = dateTimeZone1.convertLocalToUTC(36000096L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115800000 + "'", int5 == 115800000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:10" + "'", str8, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-79799904L) + "'", long13 == (-79799904L));
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.convertUTCToLocal(100L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.lang.String str8 = dateTimeZone1.toString();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        int int14 = dateTimeZone1.getOffset((-129119898L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
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
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone3.getOffset(readableInstant15);
        long long18 = dateTimeZone3.nextTransition(151799999L);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone3.getName((long) (short) 1, locale20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115800000 + "'", int7 == 115800000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:10" + "'", str11, "+32:10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:10" + "'", str14, "+32:10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115800000 + "'", int16 == 115800000);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 151799999L + "'", long18 == 151799999L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:10" + "'", str21, "+32:10");
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset(115739900L);
        java.util.TimeZone timeZone11 = dateTimeZone3.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115800000 + "'", int7 == 115800000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115800000 + "'", int10 == 115800000);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        int int3 = dateTimeZone1.getOffset((long) '4');
        java.lang.String str5 = dateTimeZone1.getNameKey((long) 115800000);
        long long8 = dateTimeZone1.convertLocalToUTC(60002L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60003L + "'", long8 == 60003L);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        long long9 = dateTimeZone1.nextTransition((-115799999L));
        int int11 = dateTimeZone1.getOffset((long) (byte) -1);
        java.lang.String str12 = dateTimeZone1.toString();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((-115799899L), locale14);
        java.lang.String str17 = dateTimeZone1.getShortName((-35999900L));
        int int19 = dateTimeZone1.getOffsetFromLocal(231059997L);
        int int21 = dateTimeZone1.getOffsetFromLocal(0L);
        java.lang.String str22 = dateTimeZone1.getID();
        long long26 = dateTimeZone1.convertLocalToUTC((long) (-3600000), true, 25199899L);
        int int28 = dateTimeZone1.getOffsetFromLocal(299340000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115800000 + "'", int5 == 115800000);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115799999L) + "'", long9 == (-115799999L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115800000 + "'", int11 == 115800000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:10" + "'", str12, "+32:10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:10" + "'", str15, "+32:10");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:10" + "'", str17, "+32:10");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115800000 + "'", int19 == 115800000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 115800000 + "'", int21 == 115800000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:10" + "'", str22, "+32:10");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-119400000L) + "'", long26 == (-119400000L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 115800000 + "'", int28 == 115800000);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        int int2 = dateTimeZone0.getStandardOffset((-59904L));
        long long5 = dateTimeZone0.convertLocalToUTC((-1570081324045L), false);
        java.lang.String str6 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570081324045L) + "'", long5 == (-1570081324045L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = dateTimeZone10.getNameKey((-65L));
        long long16 = dateTimeZone10.convertLocalToUTC((-1570084924100L), true, 3L);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        long long22 = dateTimeZone18.getMillisKeepLocal(dateTimeZone20, (long) 'a');
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone18.getName((long) (short) 1, locale24);
        int int27 = dateTimeZone18.getOffset((long) 1);
        java.lang.Object obj28 = dateTimeZone18.writeReplace();
        java.lang.String str30 = dateTimeZone18.getShortName((-1570084924001L));
        long long32 = dateTimeZone18.previousTransition((-99L));
        java.lang.String str34 = dateTimeZone18.getNameKey((long) '4');
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone18.getName(25200002L, locale36);
        long long39 = dateTimeZone10.getMillisKeepLocal(dateTimeZone18, (-349200052L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115800000 + "'", int7 == 115800000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570084924100L) + "'", long16 == (-1570084924100L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:10" + "'", str25, "+32:10");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 115800000 + "'", int27 == 115800000);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:10" + "'", str30, "+32:10");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-99L) + "'", long32 == (-99L));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+32:10" + "'", str37, "+32:10");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-465000052L) + "'", long39 == (-465000052L));
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
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
        long long32 = dateTimeZone27.convertLocalToUTC(36000095L, true);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (byte) 1);
        boolean boolean36 = dateTimeZone27.equals((java.lang.Object) dateTimeZone35);
        java.lang.String str38 = dateTimeZone35.getName(230519957L);
        java.lang.String str39 = dateTimeZone35.getID();
        int int41 = dateTimeZone35.getOffsetFromLocal(36000095L);
        int int43 = dateTimeZone35.getStandardOffset((long) 126060000);
        org.joda.time.ReadableInstant readableInstant44 = null;
        int int45 = dateTimeZone35.getOffset(readableInstant44);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115800000 + "'", int10 == 115800000);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:10" + "'", str14, "+32:10");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:10" + "'", str17, "+32:10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:10" + "'", str20, "+32:10");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:10" + "'", str22, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-187140000L) + "'", long29 == (-187140000L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-151199905L) + "'", long32 == (-151199905L));
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+100:01" + "'", str38, "+100:01");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+100:01" + "'", str39, "+100:01");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 360060000 + "'", int41 == 360060000);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 360060000 + "'", int43 == 360060000);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 360060000 + "'", int45 == 360060000);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long3 = dateTimeZone1.convertUTCToLocal((long) 25200000);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) ' ');
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        long long10 = dateTimeZone1.adjustOffset(0L, true);
        int int12 = dateTimeZone1.getOffsetFromLocal((-59905L));
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25200052L + "'", long3 == 25200052L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 10);
        long long5 = dateTimeZone2.adjustOffset(59909L, true);
        long long9 = dateTimeZone2.convertLocalToUTC(0L, false, (-126600000L));
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone15.nextTransition((long) (short) 100);
        int int19 = dateTimeZone15.getOffsetFromLocal(100L);
        long long21 = dateTimeZone11.getMillisKeepLocal(dateTimeZone15, (long) 115800000);
        java.lang.String str23 = dateTimeZone15.getShortName((long) 'a');
        java.util.TimeZone timeZone24 = dateTimeZone15.toTimeZone();
        java.lang.String str26 = dateTimeZone15.getNameKey((-1570200724101L));
        long long30 = dateTimeZone15.convertLocalToUTC((-2100000L), false, 119400101L);
        boolean boolean31 = dateTimeZone2.equals((java.lang.Object) long30);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.Object obj34 = dateTimeZone33.writeReplace();
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone33.getName((long) ' ', locale36);
        java.lang.Object obj38 = dateTimeZone33.writeReplace();
        long long41 = dateTimeZone33.convertLocalToUTC((-190319968L), true);
        boolean boolean42 = dateTimeZone2.equals((java.lang.Object) long41);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 59909L + "'", long5 == 59909L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-360600000L) + "'", long9 == (-360600000L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:10" + "'", str12, "+32:10");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115800000 + "'", int19 == 115800000);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 115800000L + "'", long21 == 115800000L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:10" + "'", str23, "+32:10");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-117900000L) + "'", long30 == (-117900000L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.100" + "'", str37, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-190320068L) + "'", long41 == (-190320068L));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
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
        java.lang.String str17 = dateTimeZone1.getNameKey(125999957L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115800000 + "'", int5 == 115800000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:10" + "'", str8, "+32:10");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 39600000L + "'", long11 == 39600000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115800000 + "'", int13 == 115800000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-99L) + "'", long15 == (-99L));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((-25200001L));
        java.lang.String str3 = dateTimeZone0.getID();
        java.util.TimeZone timeZone4 = dateTimeZone0.toTimeZone();
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
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
        java.lang.Object obj27 = dateTimeZone6.writeReplace();
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone6.getShortName((-2100000L), locale29);
        java.lang.String str32 = dateTimeZone6.getShortName((-151740099L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:10" + "'", str13, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:10" + "'", str16, "+32:10");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:10" + "'", str17, "+32:10");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115800000 + "'", int19 == 115800000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 115800000 + "'", int21 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:10" + "'", str30, "+32:10");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:10" + "'", str32, "+32:10");
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = dateTimeZone1.isFixed();
        java.lang.String str9 = dateTimeZone1.getName(115800002L);
        int int11 = dateTimeZone1.getOffsetFromLocal((long) 126000000);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 'a');
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone17.getName((long) (short) 1, locale23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        long long30 = dateTimeZone26.adjustOffset((long) (short) 0, true);
        long long32 = dateTimeZone26.nextTransition(1L);
        java.util.TimeZone timeZone33 = dateTimeZone26.toTimeZone();
        boolean boolean34 = dateTimeZone17.equals((java.lang.Object) timeZone33);
        long long36 = dateTimeZone1.getMillisKeepLocal(dateTimeZone17, 125940096L);
        boolean boolean37 = dateTimeZone17.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:10" + "'", str2, "+32:10");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:10" + "'", str9, "+32:10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115800000 + "'", int11 == 115800000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115800000 + "'", int15 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:10" + "'", str24, "+32:10");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 125940096L + "'", long36 == 125940096L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115800000);
        java.lang.String str3 = dateTimeZone1.getNameKey(0L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone1.getNameKey(36000031L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str12 = dateTimeZone11.getID();
        long long14 = dateTimeZone11.previousTransition((-1L));
        long long18 = dateTimeZone11.convertLocalToUTC(25200000L, true, 100L);
        long long20 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, 100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        boolean boolean22 = dateTimeZone9.isFixed();
        int int24 = dateTimeZone9.getOffsetFromLocal(35L);
        int int26 = dateTimeZone9.getStandardOffset(103L);
        long long28 = dateTimeZone9.nextTransition((-126600000L));
        long long30 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, 89520051L);
        int int32 = dateTimeZone1.getStandardOffset(4200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115800000 + "'", int5 == 115800000);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:10" + "'", str12, "+32:10");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-90600000L) + "'", long18 == (-90600000L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-115799899L) + "'", long20 == (-115799899L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-126600000L) + "'", long28 == (-126600000L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 205320050L + "'", long30 == 205320050L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 115800000 + "'", int32 == 115800000);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.convertUTCToLocal(72000000L);
        long long10 = dateTimeZone1.nextTransition((long) (-1));
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        boolean boolean14 = dateTimeZone1.isStandardOffset((-35999968L));
        java.lang.Object obj15 = dateTimeZone1.writeReplace();
        long long18 = dateTimeZone1.convertLocalToUTC((-111120001L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 71999999L + "'", long8 == 71999999L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-111120000L) + "'", long18 == (-111120000L));
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
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
        int int21 = dateTimeZone1.getOffsetFromLocal((-4L));
        java.util.TimeZone timeZone22 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone25.previousTransition((-360599991L));
        int int29 = dateTimeZone25.getOffsetFromLocal((long) (short) 10);
        long long31 = dateTimeZone25.nextTransition(115800096L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11L + "'", long10 == 11L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1570200724001L) + "'", long19 == (-1570200724001L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-360599991L) + "'", long27 == (-360599991L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 115800096L + "'", long31 == 115800096L);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(129120000, 115260000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115260000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(36000000);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(115800097L, locale3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.Object obj7 = dateTimeZone6.writeReplace();
        long long10 = dateTimeZone6.adjustOffset(36000000L, true);
        java.lang.String str12 = dateTimeZone6.getNameKey((-1570200724001L));
        java.lang.String str13 = dateTimeZone6.toString();
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) str13);
        java.lang.Class<?> wildcardClass15 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 36000000L + "'", long10 == 36000000L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.035" + "'", str13, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
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
        int int23 = dateTimeZone6.getOffset(59L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone6.getOffset(readableInstant24);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone6.getShortName(90060000L, locale27);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.001" + "'", str28, "+00:00:00.001");
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
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
        boolean boolean22 = dateTimeZone3.isFixed();
        java.lang.String str23 = dateTimeZone3.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.001" + "'", str23, "+00:00:00.001");
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-1570084924101L), locale8);
        java.lang.String str11 = dateTimeZone1.getNameKey((-36000000L));
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone13.getMillisKeepLocal(dateTimeZone15, (long) 'a');
        int int19 = dateTimeZone15.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone20 = dateTimeZone15.toTimeZone();
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone15.getShortName((long) (byte) 100, locale22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone15.getShortName((long) (short) 0, locale25);
        java.lang.String str27 = dateTimeZone15.getID();
        java.lang.String str29 = dateTimeZone15.getNameKey((long) (byte) -1);
        java.lang.String str30 = dateTimeZone15.toString();
        boolean boolean32 = dateTimeZone15.isStandardOffset(60001L);
        long long34 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, (-2099899L));
        int int36 = dateTimeZone1.getStandardOffset((-1570120984101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.001" + "'", str23, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.001" + "'", str26, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.001" + "'", str27, "+00:00:00.001");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.001" + "'", str30, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-2099899L) + "'", long34 == (-2099899L));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
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
        boolean boolean32 = dateTimeZone15.isFixed();
        org.joda.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = dateTimeZone15.isLocalDateTimeGap(localDateTime33);
        long long37 = dateTimeZone15.adjustOffset(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 119399999L + "'", long28 == 119399999L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.001" + "'", str30, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 52);
        java.lang.String str6 = dateTimeZone5.toString();
        boolean boolean7 = dateTimeZone1.equals((java.lang.Object) str6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+01:52" + "'", str6, "+01:52");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        long long5 = dateTimeZone0.adjustOffset((-1570200724100L), true);
        java.lang.String str7 = dateTimeZone0.getShortName((-115799951L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570200724100L) + "'", long5 == (-1570200724100L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 35);
        long long5 = dateTimeZone2.adjustOffset(35999979L, false);
        java.lang.String str6 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35999979L + "'", long5 == 35999979L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+01:35" + "'", str6, "+01:35");
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        java.lang.String str9 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean11 = dateTimeZone1.isFixed();
        long long13 = dateTimeZone1.nextTransition(4140000L);
        boolean boolean14 = dateTimeZone1.isFixed();
        int int16 = dateTimeZone1.getStandardOffset(3599899L);
        java.lang.String str18 = dateTimeZone1.getShortName((-349199952L));
        java.lang.Object obj19 = dateTimeZone1.writeReplace();
        int int21 = dateTimeZone1.getOffset((long) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 4140000L + "'", long13 == 4140000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
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
        java.lang.String str28 = dateTimeZone1.getShortName((long) (short) 1);
        java.util.TimeZone timeZone29 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        boolean boolean33 = dateTimeZone31.isStandardOffset(0L);
        int int35 = dateTimeZone31.getOffsetFromLocal(115740097L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570084924002L) + "'", long26 == (-1570084924002L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.001" + "'", str28, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        long long12 = dateTimeZone1.nextTransition((-99L));
        java.lang.Object obj13 = dateTimeZone1.writeReplace();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName((-1570269124000L), locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-99L) + "'", long12 == (-99L));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        java.lang.String str14 = dateTimeZone1.getNameKey(115799900L);
        long long16 = dateTimeZone1.convertUTCToLocal((-1570048923802L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199999L + "'", long10 == 25199999L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570048923801L) + "'", long16 == (-1570048923801L));
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
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
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        int int17 = dateTimeZone15.getOffsetFromLocal((long) 35);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, 25199999L);
        long long21 = dateTimeZone1.convertUTCToLocal(119399999L);
        java.util.TimeZone timeZone22 = dateTimeZone1.toTimeZone();
        java.lang.String str23 = dateTimeZone1.toString();
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        long long29 = dateTimeZone25.getMillisKeepLocal(dateTimeZone27, (long) 'a');
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone25.getName((long) (short) 1, locale31);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone25.getName(100L, locale35);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        int int39 = dateTimeZone25.getOffsetFromLocal(100L);
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone25.getName((-39659900L), locale41);
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        long long48 = dateTimeZone44.getMillisKeepLocal(dateTimeZone46, (long) 'a');
        int int50 = dateTimeZone46.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone51 = dateTimeZone46.toTimeZone();
        java.util.TimeZone timeZone52 = dateTimeZone46.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        java.lang.String str56 = dateTimeZone54.getName(0L);
        int int58 = dateTimeZone54.getOffsetFromLocal(89519900L);
        long long60 = dateTimeZone25.getMillisKeepLocal(dateTimeZone54, (-90600035L));
        long long62 = dateTimeZone25.previousTransition(115799865L);
        long long64 = dateTimeZone1.getMillisKeepLocal(dateTimeZone25, (-119400100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25199999L + "'", long19 == 25199999L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 119400000L + "'", long21 == 119400000L);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.001" + "'", str23, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.001" + "'", str32, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.001" + "'", str36, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.001" + "'", str42, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 97L + "'", long48 == 97L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00" + "'", str56, "+00:00");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-90600034L) + "'", long60 == (-90600034L));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 115799865L + "'", long62 == 115799865L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-119400100L) + "'", long64 == (-119400100L));
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
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
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone12.isLocalDateTimeGap(localDateTime19);
        java.lang.String str22 = dateTimeZone12.getNameKey(3599899L);
        long long25 = dateTimeZone12.convertLocalToUTC((-61199901L), true);
        long long28 = dateTimeZone12.adjustOffset((-360599964L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999899L) + "'", long14 == (-35999899L));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-97199901L) + "'", long25 == (-97199901L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-360599964L) + "'", long28 == (-360599964L));
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getOffsetFromLocal(98L);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long8 = dateTimeZone1.convertUTCToLocal(60032L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:00" + "'", str3, "+10:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 36060032L + "'", long8 == 36060032L);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str6 = dateTimeZone1.getShortName(2L);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
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
        java.lang.String str16 = dateTimeZone6.getID();
        boolean boolean18 = dateTimeZone6.isStandardOffset(115740100L);
        java.lang.Object obj19 = dateTimeZone6.writeReplace();
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone6.getShortName(0L, locale21);
        boolean boolean24 = dateTimeZone6.isStandardOffset((-323519999L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+10:00" + "'", str22, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
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
        java.lang.String str17 = dateTimeZone3.getNameKey((long) (byte) -1);
        long long21 = dateTimeZone3.convertLocalToUTC((long) 10, true, 1L);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        long long27 = dateTimeZone23.getMillisKeepLocal(dateTimeZone25, (long) 'a');
        int int29 = dateTimeZone25.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone30 = dateTimeZone25.toTimeZone();
        java.util.TimeZone timeZone31 = dateTimeZone25.toTimeZone();
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone25.getName((long) (short) 10, locale33);
        boolean boolean36 = dateTimeZone25.equals((java.lang.Object) (byte) 0);
        java.lang.String str38 = dateTimeZone25.getName(115799900L);
        long long40 = dateTimeZone3.getMillisKeepLocal(dateTimeZone25, (-1570084924098L));
        java.lang.String str41 = dateTimeZone25.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+10:00" + "'", str15, "+10:00");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-35999990L) + "'", long21 == (-35999990L));
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 36000000 + "'", int29 == 36000000);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+10:00" + "'", str34, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+10:00" + "'", str38, "+10:00");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1570084924098L) + "'", long40 == (-1570084924098L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+10:00" + "'", str41, "+10:00");
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        java.lang.String str16 = dateTimeZone14.getNameKey((-79799989L));
        boolean boolean17 = dateTimeZone1.equals((java.lang.Object) (-79799989L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
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
        java.lang.String str18 = dateTimeZone3.getShortName((long) 60000);
        boolean boolean20 = dateTimeZone3.isStandardOffset(103L);
        long long23 = dateTimeZone3.adjustOffset((-118859800L), false);
        java.lang.String str25 = dateTimeZone3.getShortName(71400099L);
        java.lang.Object obj26 = dateTimeZone3.writeReplace();
        java.util.TimeZone timeZone27 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36000000 + "'", int13 == 36000000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570048924000L) + "'", long16 == (-1570048924000L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:00" + "'", str18, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-118859800L) + "'", long23 == (-118859800L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+10:00" + "'", str25, "+10:00");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
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
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone15.isLocalDateTimeGap(localDateTime16);
        boolean boolean18 = dateTimeZone3.equals((java.lang.Object) boolean17);
        java.lang.String str20 = dateTimeZone3.getShortName((-1570120923901L));
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone3.getOffset(readableInstant21);
        java.lang.String str23 = dateTimeZone3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+10:00" + "'", str20, "+10:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36000000 + "'", int22 == 36000000);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+10:00" + "'", str23, "+10:00");
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long4 = dateTimeZone1.nextTransition(93120100L);
        java.lang.Object obj5 = dateTimeZone1.writeReplace();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName(39660002L, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 93120100L + "'", long4 == 93120100L);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-01:00" + "'", str8, "-01:00");
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        int int13 = dateTimeZone1.getOffset((-99L));
        java.lang.String str14 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long18 = dateTimeZone1.adjustOffset(54L, true);
        long long20 = dateTimeZone1.previousTransition(2100011L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-01:00" + "'", str8, "-01:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-3600000) + "'", int10 == (-3600000));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3600000) + "'", int13 == (-3600000));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-01:00" + "'", str14, "-01:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 54L + "'", long18 == 54L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2100011L + "'", long20 == 2100011L);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.lang.String str7 = dateTimeZone1.getName((long) (byte) 10);
        java.lang.String str9 = dateTimeZone1.getShortName((-1570048863901L));
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-01:00" + "'", str7, "-01:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-01:00" + "'", str9, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3600000) + "'", int13 == (-3600000));
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName(25200052L, locale8);
        java.lang.String str11 = dateTimeZone1.getShortName((long) (short) -1);
        long long14 = dateTimeZone1.adjustOffset((-1570084924003L), true);
        int int16 = dateTimeZone1.getStandardOffset((-1570196524001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-01:00" + "'", str2, "-01:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-01:00" + "'", str9, "-01:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-01:00" + "'", str11, "-01:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1570084924003L) + "'", long14 == (-1570084924003L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3600000) + "'", int16 == (-3600000));
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) ' ', locale4);
        java.lang.String str6 = dateTimeZone1.getID();
        int int8 = dateTimeZone1.getOffset(25199952L);
        boolean boolean9 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str6 = dateTimeZone1.getShortName(2L);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        int int10 = dateTimeZone8.getOffset((-35999991L));
        boolean boolean12 = dateTimeZone8.isStandardOffset((-35999999L));
        java.lang.String str14 = dateTimeZone8.getName(3600096L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (short) 0);
        long long5 = dateTimeZone2.convertLocalToUTC((long) 0, false);
        java.util.TimeZone timeZone6 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffset((long) '#');
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-349200000L) + "'", long5 == (-349200000L));
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
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
        boolean boolean30 = dateTimeZone1.isFixed();
        long long32 = dateTimeZone1.convertUTCToLocal(118860000L);
        java.lang.Class<?> wildcardClass33 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3600000) + "'", int14 == (-3600000));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-25200001L) + "'", long25 == (-25200001L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 3600096L + "'", long27 == 3600096L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 118859999L + "'", long32 == 118859999L);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
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
        long long15 = dateTimeZone5.nextTransition((-1570084923999L));
        java.lang.String str17 = dateTimeZone5.getName(79800000L);
        int int19 = dateTimeZone5.getStandardOffset((-1570012923999L));
        long long21 = dateTimeZone5.convertUTCToLocal((-126599965L));
        boolean boolean22 = dateTimeZone5.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-01:00" + "'", str2, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3600000) + "'", int9 == (-3600000));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084923999L) + "'", long15 == (-1570084923999L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-01:00" + "'", str17, "-01:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-3600000) + "'", int19 == (-3600000));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-130199965L) + "'", long21 == (-130199965L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        long long8 = dateTimeZone1.convertLocalToUTC(119399996L, true, (-360599897L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 119399997L + "'", long8 == 119399997L);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360000000);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 115799900L);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        long long11 = dateTimeZone7.getMillisKeepLocal(dateTimeZone9, (long) 'a');
        int int13 = dateTimeZone9.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone14 = dateTimeZone9.toTimeZone();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone9.getShortName((long) (byte) 100, locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone9.getShortName((long) (short) 0, locale19);
        long long23 = dateTimeZone9.convertLocalToUTC(115739900L, false);
        long long26 = dateTimeZone9.adjustOffset((long) (byte) 100, false);
        boolean boolean27 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        int int29 = dateTimeZone9.getStandardOffset((-1569688323999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 479399900L + "'", long5 == 479399900L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3600000) + "'", int13 == (-3600000));
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-01:00" + "'", str17, "-01:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-01:00" + "'", str20, "-01:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 119339900L + "'", long23 == 119339900L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-3600000) + "'", int29 == (-3600000));
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str7 = dateTimeZone1.getNameKey(36000100L);
        java.lang.String str8 = dateTimeZone1.getID();
        long long11 = dateTimeZone1.adjustOffset(97L, false);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        int int15 = dateTimeZone1.getOffsetFromLocal((-187199904L));
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.Object obj18 = dateTimeZone17.writeReplace();
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone17.getShortName((-1570012924100L), locale20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone17.getName((-115799900L), locale23);
        long long28 = dateTimeZone17.convertLocalToUTC(115800000L, true, (-35999991L));
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long32 = dateTimeZone30.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone30.getOffset(readableInstant33);
        java.lang.Object obj35 = dateTimeZone30.writeReplace();
        int int37 = dateTimeZone30.getOffset((long) 1);
        java.lang.String str38 = dateTimeZone30.toString();
        org.joda.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = dateTimeZone30.isLocalDateTimeGap(localDateTime39);
        long long42 = dateTimeZone30.previousTransition(101L);
        long long44 = dateTimeZone17.getMillisKeepLocal(dateTimeZone30, (-115799900L));
        java.util.Locale locale46 = null;
        java.lang.String str47 = dateTimeZone30.getName(0L, locale46);
        int int49 = dateTimeZone30.getOffsetFromLocal(118860000L);
        long long51 = dateTimeZone1.getMillisKeepLocal(dateTimeZone30, (-1570120924154L));
        long long53 = dateTimeZone30.convertUTCToLocal(93120064L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.035" + "'", str21, "+00:00:00.035");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.035" + "'", str24, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 115799965L + "'", long28 == 115799965L);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.100" + "'", str38, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 101L + "'", long42 == 101L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-115799965L) + "'", long44 == (-115799965L));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00:00.100" + "'", str47, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1570120924154L) + "'", long51 == (-1570120924154L));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 93120164L + "'", long53 == 93120164L);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
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
        java.lang.String str21 = dateTimeZone3.toString();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj24 = dateTimeZone23.writeReplace();
        java.lang.String str25 = dateTimeZone23.getID();
        long long27 = dateTimeZone23.convertUTCToLocal(100L);
        boolean boolean28 = dateTimeZone23.isFixed();
        long long30 = dateTimeZone23.previousTransition(231059997L);
        long long32 = dateTimeZone3.getMillisKeepLocal(dateTimeZone23, (-1570084924047L));
        org.joda.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = dateTimeZone23.isLocalDateTimeGap(localDateTime33);
        org.joda.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = dateTimeZone23.isLocalDateTimeGap(localDateTime35);
        java.lang.String str38 = dateTimeZone23.getName((-35999990L));
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj41 = dateTimeZone40.writeReplace();
        org.joda.time.ReadableInstant readableInstant42 = null;
        int int43 = dateTimeZone40.getOffset(readableInstant42);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        java.util.TimeZone timeZone45 = dateTimeZone40.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        long long48 = dateTimeZone46.previousTransition(0L);
        boolean boolean49 = dateTimeZone23.equals((java.lang.Object) long48);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-90L) + "'", long18 == (-90L));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 99L + "'", long27 == 99L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 231059997L + "'", long30 == 231059997L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1570084923946L) + "'", long32 == (-1570084923946L));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-00:00:00.001" + "'", str38, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
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
        long long18 = dateTimeZone3.nextTransition((-35939969L));
        java.lang.Object obj19 = dateTimeZone3.writeReplace();
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone3.isLocalDateTimeGap(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-35939969L) + "'", long18 == (-35939969L));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115260000);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((-90600052L), locale3);
        java.lang.String str6 = dateTimeZone1.getNameKey(44L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:01" + "'", str4, "+32:01");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
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
        long long16 = dateTimeZone1.convertUTCToLocal(1L);
        java.lang.Object obj17 = dateTimeZone1.writeReplace();
        long long20 = dateTimeZone1.adjustOffset(0L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long5 = dateTimeZone1.convertLocalToUTC((-1570120924101L), false, (-35999990L));
        long long7 = dateTimeZone1.previousTransition(0L);
        java.lang.String str9 = dateTimeZone1.getShortName(63L);
        int int11 = dateTimeZone1.getOffset(61200001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570120924111L) + "'", long5 == (-1570120924111L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.010" + "'", str9, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
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
        java.lang.String str28 = dateTimeZone2.getNameKey((-349200100L));
        boolean boolean29 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 25200052L + "'", long21 == 25200052L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 90060000L + "'", long26 == 90060000L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.convertUTCToLocal(100L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        long long9 = dateTimeZone1.previousTransition((-1569969184145L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1569969184145L) + "'", long9 == (-1569969184145L));
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 10, true);
        long long7 = dateTimeZone1.convertLocalToUTC(51L, true);
        java.lang.String str8 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 50L + "'", long7 == 50L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        java.lang.String str8 = dateTimeZone1.getNameKey((-1570084924201L));
        long long10 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long13 = dateTimeZone1.adjustOffset((long) 187260000, true);
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        long long17 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 187260000L + "'", long13 == 187260000L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
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
        java.lang.String str21 = dateTimeZone3.toString();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj24 = dateTimeZone23.writeReplace();
        java.lang.String str25 = dateTimeZone23.getID();
        long long27 = dateTimeZone23.convertUTCToLocal(100L);
        boolean boolean28 = dateTimeZone23.isFixed();
        long long30 = dateTimeZone23.previousTransition(231059997L);
        long long32 = dateTimeZone3.getMillisKeepLocal(dateTimeZone23, (-1570084924047L));
        long long35 = dateTimeZone23.adjustOffset(0L, true);
        java.lang.String str36 = dateTimeZone23.toString();
        int int38 = dateTimeZone23.getOffsetFromLocal((-115800097L));
        org.joda.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = dateTimeZone23.isLocalDateTimeGap(localDateTime39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        int int42 = dateTimeZone23.getOffset(readableInstant41);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 99L + "'", long27 == 99L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 231059997L + "'", long30 == 231059997L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1570084924047L) + "'", long32 == (-1570084924047L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-00:00:00.001" + "'", str36, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getStandardOffset((long) (short) 0);
        int int7 = dateTimeZone1.getOffsetFromLocal(10L);
        long long10 = dateTimeZone1.adjustOffset(115740100L, true);
        long long14 = dateTimeZone1.convertLocalToUTC((-1570128664001L), false, 72000000L);
        long long18 = dateTimeZone1.convertLocalToUTC(90059898L, false, (long) 187260000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115740100L + "'", long10 == 115740100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1570128664000L) + "'", long14 == (-1570128664000L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 90059899L + "'", long18 == 90059899L);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        java.lang.String str8 = dateTimeZone1.getName((-1570084924101L));
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.String str11 = dateTimeZone1.getID();
        java.lang.String str12 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        long long5 = dateTimeZone1.adjustOffset(36000000L, true);
        long long7 = dateTimeZone1.previousTransition((-35999991L));
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long13 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, (long) 'a');
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone9.getName((long) (short) 1, locale15);
        int int18 = dateTimeZone9.getOffset((long) 1);
        int int20 = dateTimeZone9.getOffset((long) '#');
        long long22 = dateTimeZone9.nextTransition((-2L));
        java.lang.String str24 = dateTimeZone9.getShortName(1L);
        int int26 = dateTimeZone9.getStandardOffset(25199999L);
        boolean boolean27 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        long long31 = dateTimeZone9.convertLocalToUTC(35999932L, false, 119399999L);
        long long35 = dateTimeZone9.convertLocalToUTC(244200039L, true, (-1570084384100L));
        java.lang.String str37 = dateTimeZone9.getName(360599935L);
        java.util.TimeZone timeZone38 = dateTimeZone9.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 36000000L + "'", long5 == 36000000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-35999991L) + "'", long7 == (-35999991L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-2L) + "'", long22 == (-2L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 35999933L + "'", long31 == 35999933L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 244200040L + "'", long35 == 244200040L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-00:00:00.001" + "'", str37, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
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
        java.lang.String str17 = dateTimeZone3.getNameKey((long) (byte) -1);
        long long20 = dateTimeZone3.convertLocalToUTC((-90600000L), false);
        long long23 = dateTimeZone3.adjustOffset(36000032L, false);
        java.lang.Object obj24 = dateTimeZone3.writeReplace();
        long long26 = dateTimeZone3.previousTransition(93120100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        int int29 = dateTimeZone3.getStandardOffset(32400099L);
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone3.getOffset(readableInstant30);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-90599999L) + "'", long20 == (-90599999L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 36000032L + "'", long23 == 36000032L);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 93120100L + "'", long26 == 93120100L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        java.lang.String str9 = dateTimeZone1.getShortName(100L);
        boolean boolean11 = dateTimeZone1.isStandardOffset((-115799999L));
        java.lang.String str12 = dateTimeZone1.toString();
        boolean boolean14 = dateTimeZone1.isStandardOffset((-1570084384199L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean14 = dateTimeZone1.isFixed();
        java.lang.String str16 = dateTimeZone1.getName(35940032L);
        java.lang.String str18 = dateTimeZone1.getShortName((-35999899L));
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone1.isLocalDateTimeGap(localDateTime19);
        java.lang.String str22 = dateTimeZone1.getShortName((-244260001L));
        boolean boolean24 = dateTimeZone1.isStandardOffset(35999939L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200001L + "'", long10 == 25200001L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 102L + "'", long12 == 102L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        long long9 = dateTimeZone1.nextTransition((-115799999L));
        int int11 = dateTimeZone1.getOffset((long) (byte) -1);
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115799999L) + "'", long9 == (-115799999L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long15 = dateTimeZone12.convertLocalToUTC((-1570084924001L), false);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) long15);
        java.lang.String str17 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924000L) + "'", long15 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        long long8 = dateTimeZone1.nextTransition((-231599899L));
        long long10 = dateTimeZone1.convertUTCToLocal(115799998L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-231599899L) + "'", long8 == (-231599899L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115799999L + "'", long10 == 115799999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:35");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((-35999899L), locale3);
        boolean boolean5 = dateTimeZone1.isFixed();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-71459998L), locale7);
        long long11 = dateTimeZone1.convertLocalToUTC((-39600034L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:35" + "'", str4, "+00:35");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:35" + "'", str8, "+00:35");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-41700034L) + "'", long11 == (-41700034L));
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
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
        long long19 = dateTimeZone1.nextTransition(115799998L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115799998L + "'", long19 == 115799998L);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) false);
        java.lang.String str12 = dateTimeZone1.getName((-35999990L));
        long long15 = dateTimeZone1.convertLocalToUTC((-1570084923901L), false);
        int int17 = dateTimeZone1.getOffsetFromLocal((long) 360000000);
        java.lang.String str19 = dateTimeZone1.getNameKey(115260011L);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone1.isLocalDateTimeGap(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084923902L) + "'", long15 == (-1570084923902L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
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
        java.lang.String str22 = dateTimeZone3.getShortName(36000000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.lang.String str25 = dateTimeZone3.getShortName(71999999L);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.lang.String str28 = dateTimeZone27.toString();
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone27.getOffset(readableInstant29);
        java.lang.String str32 = dateTimeZone27.getShortName((long) (byte) 10);
        boolean boolean33 = dateTimeZone27.isFixed();
        boolean boolean34 = dateTimeZone3.equals((java.lang.Object) boolean33);
        long long38 = dateTimeZone3.convertLocalToUTC(255719957L, false, 71999948L);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570084923999L) + "'", long16 == (-1570084923999L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 12L + "'", long20 == 12L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.001" + "'", str25, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.001" + "'", str28, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.001" + "'", str32, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 255719956L + "'", long38 == 255719956L);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(35, 1);
        java.lang.Object obj3 = dateTimeZone2.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:01");
        long long3 = dateTimeZone1.previousTransition((long) 363120000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570272124001L), locale5);
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) (-1570120923836L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 363120000L + "'", long3 == 363120000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
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
        boolean boolean13 = dateTimeZone10.isFixed();
        int int15 = dateTimeZone10.getStandardOffset(0L);
        java.lang.String str16 = dateTimeZone10.toString();
        java.util.TimeZone timeZone17 = dateTimeZone10.toTimeZone();
        java.lang.String str19 = dateTimeZone10.getShortName(0L);
        java.util.TimeZone timeZone20 = dateTimeZone10.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone4.getShortName(0L, locale27);
        boolean boolean29 = dateTimeZone4.isFixed();
        java.util.TimeZone timeZone30 = dateTimeZone4.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115800000 + "'", int9 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 99L + "'", long22 == 99L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 231059997L + "'", long24 == 231059997L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360000000);
        int int3 = dateTimeZone1.getStandardOffset(115260095L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 360000000 + "'", int3 == 360000000);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(97L);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        int int16 = dateTimeZone1.getOffset((-1570084923936L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
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
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone2.getName(244200048L, locale19);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:10" + "'", str17, "+32:10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:10" + "'", str20, "+32:10");
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str12 = dateTimeZone11.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-1570084924101L), locale8);
        java.lang.String str11 = dateTimeZone1.getNameKey((-36000000L));
        java.lang.String str12 = dateTimeZone1.toString();
        long long15 = dateTimeZone1.adjustOffset(115799965L, true);
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone1.isLocalDateTimeGap(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115799965L + "'", long15 == 115799965L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        java.lang.String str9 = dateTimeZone1.getShortName(100L);
        boolean boolean11 = dateTimeZone1.isStandardOffset((-115799999L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName((-35940062L), locale13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        int int5 = dateTimeZone1.getOffset((-115800001L));
        boolean boolean7 = dateTimeZone1.isStandardOffset((-115799999L));
        long long9 = dateTimeZone1.convertUTCToLocal((-306540000L));
        boolean boolean10 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-306539999L) + "'", long9 == (-306539999L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
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
        long long16 = dateTimeZone1.adjustOffset(28800000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 28800000L + "'", long16 == 28800000L);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
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
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str13 = dateTimeZone12.toString();
        long long16 = dateTimeZone12.convertLocalToUTC(3L, true);
        long long18 = dateTimeZone12.previousTransition(3660001L);
        int int20 = dateTimeZone12.getOffset(479399900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3660001L + "'", long18 == 3660001L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        java.lang.String str10 = dateTimeZone1.getName((long) '#');
        int int12 = dateTimeZone1.getOffset(36000032L);
        long long16 = dateTimeZone1.convertLocalToUTC((-61200000L), false, (-3660000L));
        java.lang.String str18 = dateTimeZone1.getName(25199902L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-61200100L) + "'", long16 == (-61200100L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int11 = dateTimeZone1.getOffset((-25200001L));
        boolean boolean12 = dateTimeZone1.isFixed();
        java.lang.String str13 = dateTimeZone1.toString();
        java.lang.String str14 = dateTimeZone1.toString();
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.previousTransition(25200000L);
        long long7 = dateTimeZone1.nextTransition((-1570048923999L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        int int11 = dateTimeZone1.getOffset(0L);
        java.lang.String str13 = dateTimeZone1.getNameKey(36000097L);
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long18 = dateTimeZone15.convertLocalToUTC(302459967L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25200000L + "'", long5 == 25200000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570048923999L) + "'", long7 == (-1570048923999L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 302459967L + "'", long18 == 302459967L);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
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
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone3.isLocalDateTimeGap(localDateTime15);
        java.lang.String str17 = dateTimeZone3.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str7 = dateTimeZone1.getID();
        long long9 = dateTimeZone1.convertUTCToLocal(59909L);
        boolean boolean10 = dateTimeZone1.isFixed();
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        int int13 = dateTimeZone1.getOffsetFromLocal(71999998L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 59908L + "'", long9 == 59908L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone1.getOffset(115799900L);
        java.lang.String str9 = dateTimeZone1.getShortName(115260053L);
        long long13 = dateTimeZone1.convertLocalToUTC(115740001L, false, (-90599999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 115739901L + "'", long13 == 115739901L);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long5 = dateTimeZone1.nextTransition((long) 3600000);
        java.lang.String str7 = dateTimeZone1.getShortName((-59901L));
        long long11 = dateTimeZone1.convertLocalToUTC((-1570084924097L), true, (-288600100L));
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600000L + "'", long5 == 3600000L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924097L) + "'", long11 == (-1570084924097L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(349200000, 363120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 363120000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
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
        java.lang.String str17 = dateTimeZone3.getNameKey((long) (byte) -1);
        long long20 = dateTimeZone3.convertLocalToUTC((-90600000L), false);
        long long23 = dateTimeZone3.adjustOffset(36000032L, false);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long28 = dateTimeZone25.convertLocalToUTC((-1570084924001L), false);
        int int30 = dateTimeZone25.getOffsetFromLocal((-1570084924000L));
        java.lang.String str32 = dateTimeZone25.getShortName((long) (short) 1);
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        long long36 = dateTimeZone34.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant37 = null;
        int int38 = dateTimeZone34.getOffset(readableInstant37);
        java.lang.Object obj39 = dateTimeZone34.writeReplace();
        java.lang.Object obj40 = dateTimeZone34.writeReplace();
        boolean boolean41 = dateTimeZone34.isFixed();
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        long long45 = dateTimeZone43.nextTransition((long) (short) 100);
        java.lang.String str47 = dateTimeZone43.getNameKey(1L);
        long long49 = dateTimeZone34.getMillisKeepLocal(dateTimeZone43, (-25200001L));
        long long51 = dateTimeZone25.getMillisKeepLocal(dateTimeZone34, (long) 'a');
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.Object obj54 = dateTimeZone53.writeReplace();
        boolean boolean55 = dateTimeZone34.equals(obj54);
        long long57 = dateTimeZone34.convertUTCToLocal((-2L));
        java.util.Locale locale59 = null;
        java.lang.String str60 = dateTimeZone34.getName((long) 3600000, locale59);
        long long64 = dateTimeZone34.convertLocalToUTC((-3660000L), false, (-3660000L));
        java.util.Locale locale66 = null;
        java.lang.String str67 = dateTimeZone34.getShortName((-35999800L), locale66);
        long long69 = dateTimeZone3.getMillisKeepLocal(dateTimeZone34, 0L);
        java.lang.String str70 = dateTimeZone34.getID();
        java.util.Locale locale72 = null;
        java.lang.String str73 = dateTimeZone34.getName((-35940100L), locale72);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-90600000L) + "'", long20 == (-90600000L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 36000032L + "'", long23 == 36000032L);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1570084924000L) + "'", long28 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 100L + "'", long45 == 100L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "UTC" + "'", str47, "UTC");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-25200001L) + "'", long49 == (-25200001L));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 96L + "'", long51 == 96L);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-2L) + "'", long57 == (-2L));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+00:00" + "'", str60, "+00:00");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-3660000L) + "'", long64 == (-3660000L));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+00:00" + "'", str67, "+00:00");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "UTC" + "'", str70, "UTC");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "+00:00" + "'", str73, "+00:00");
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
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
        long long22 = dateTimeZone14.previousTransition((-233400101L));
        boolean boolean24 = dateTimeZone14.isStandardOffset(28800001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924099L) + "'", long10 == (-1570084924099L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-36000001L) + "'", long12 == (-36000001L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-35999999L) + "'", long17 == (-35999999L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-360600000L) + "'", long19 == (-360600000L));
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+:0:10");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-233400101L) + "'", long22 == (-233400101L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
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
        int int27 = dateTimeZone1.getStandardOffset((-1570164664001L));
        long long30 = dateTimeZone1.convertLocalToUTC((-25L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200000L + "'", long10 == 25200000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 101L + "'", long12 == 101L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-26L) + "'", long30 == (-26L));
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long11 = dateTimeZone1.nextTransition((long) ' ');
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone13.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone13.getOffset(readableInstant16);
        java.lang.String str18 = dateTimeZone13.toString();
        long long20 = dateTimeZone13.previousTransition((long) (short) 1);
        java.lang.String str22 = dateTimeZone13.getNameKey((-99L));
        int int24 = dateTimeZone13.getOffsetFromLocal((long) 115800000);
        boolean boolean25 = dateTimeZone1.equals((java.lang.Object) int24);
        java.lang.String str27 = dateTimeZone1.getNameKey((-25740000L));
        long long29 = dateTimeZone1.previousTransition((-1570156924101L));
        int int31 = dateTimeZone1.getStandardOffset((-1570120924113L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1570156924101L) + "'", long29 == (-1570156924101L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
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
        java.util.TimeZone timeZone20 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj23 = dateTimeZone22.writeReplace();
        java.lang.String str24 = dateTimeZone22.getID();
        long long26 = dateTimeZone22.previousTransition(25200000L);
        long long28 = dateTimeZone22.nextTransition((-1570048923999L));
        int int30 = dateTimeZone22.getOffsetFromLocal((long) '4');
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int35 = dateTimeZone33.getStandardOffset((long) 10);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        long long41 = dateTimeZone37.getMillisKeepLocal(dateTimeZone39, (long) 'a');
        java.util.Locale locale43 = null;
        java.lang.String str44 = dateTimeZone37.getName((long) (short) 1, locale43);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone37);
        boolean boolean46 = dateTimeZone33.equals((java.lang.Object) dateTimeZone37);
        org.joda.time.ReadableInstant readableInstant47 = null;
        int int48 = dateTimeZone33.getOffset(readableInstant47);
        boolean boolean49 = dateTimeZone22.equals((java.lang.Object) int48);
        long long51 = dateTimeZone3.getMillisKeepLocal(dateTimeZone22, (-36059990L));
        long long53 = dateTimeZone22.nextTransition((-1570084384199L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 25200000L + "'", long26 == 25200000L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1570048923999L) + "'", long28 == (-1570048923999L));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 115800000 + "'", int35 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 97L + "'", long41 == 97L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00" + "'", str44, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 115800000 + "'", int48 == 115800000);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-36059989L) + "'", long51 == (-36059989L));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1570084384199L) + "'", long53 == (-1570084384199L));
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long6 = dateTimeZone3.convertLocalToUTC((long) 1, true);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 32L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.Object obj11 = dateTimeZone10.writeReplace();
        long long14 = dateTimeZone10.adjustOffset(36000000L, true);
        java.lang.String str16 = dateTimeZone10.getNameKey((-1570200724001L));
        boolean boolean17 = dateTimeZone3.equals((java.lang.Object) str16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str21 = dateTimeZone19.getNameKey((long) 115800000);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone19.getShortName((-1570084924001L), locale23);
        long long26 = dateTimeZone19.nextTransition(98L);
        long long28 = dateTimeZone19.nextTransition((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long33 = dateTimeZone30.convertLocalToUTC((-1570084924001L), false);
        boolean boolean34 = dateTimeZone19.equals((java.lang.Object) long33);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone19.getShortName((-35999901L), locale36);
        java.lang.String str38 = dateTimeZone19.toString();
        long long41 = dateTimeZone19.convertLocalToUTC((-1570214044100L), false);
        long long43 = dateTimeZone3.getMillisKeepLocal(dateTimeZone19, 115259949L);
        java.util.TimeZone timeZone44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        java.util.TimeZone timeZone46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        long long49 = dateTimeZone45.getMillisKeepLocal(dateTimeZone47, (long) 'a');
        int int51 = dateTimeZone47.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone52 = dateTimeZone47.toTimeZone();
        java.util.TimeZone timeZone53 = dateTimeZone47.toTimeZone();
        java.util.Locale locale55 = null;
        java.lang.String str56 = dateTimeZone47.getName((long) (short) 10, locale55);
        boolean boolean58 = dateTimeZone47.equals((java.lang.Object) (byte) 0);
        long long62 = dateTimeZone47.convertLocalToUTC((long) 10, true, (-35999991L));
        java.lang.String str64 = dateTimeZone47.getNameKey((-25200000L));
        long long66 = dateTimeZone47.nextTransition((-1570517524000L));
        int int68 = dateTimeZone47.getOffsetFromLocal(35940032L);
        long long70 = dateTimeZone19.getMillisKeepLocal(dateTimeZone47, (-271080099L));
        long long74 = dateTimeZone19.convertLocalToUTC(0L, false, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-99L) + "'", long6 == (-99L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35999932L + "'", long8 == 35999932L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 36000000L + "'", long14 == 36000000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 98L + "'", long26 == 98L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1570084924000L) + "'", long33 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-00:00:00.001" + "'", str37, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-00:00:00.001" + "'", str38, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1570214044099L) + "'", long41 == (-1570214044099L));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 115260050L + "'", long43 == 115260050L);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 97L + "'", long49 == 97L);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00" + "'", str56, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 10L + "'", long62 == 10L);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "UTC" + "'", str64, "UTC");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1570517524000L) + "'", long66 == (-1570517524000L));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-271080100L) + "'", long70 == (-271080100L));
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1L + "'", long74 == 1L);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 10);
        boolean boolean4 = dateTimeZone2.isStandardOffset(36000100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getShortName((-48L), locale7);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+100:10" + "'", str8, "+100:10");
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName((-1570200724101L));
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.Object obj9 = dateTimeZone8.writeReplace();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone8.getName((long) ' ', locale11);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, (-1570084924000L));
        int int16 = dateTimeZone8.getOffsetFromLocal(3L);
        java.lang.String str17 = dateTimeZone8.getID();
        long long19 = dateTimeZone8.previousTransition((-1569688324001L));
        long long22 = dateTimeZone8.adjustOffset((-1570120924202L), true);
        java.lang.Object obj23 = dateTimeZone8.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+100:10" + "'", str2, "+100:10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:10" + "'", str4, "+100:10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+100:10" + "'", str6, "+100:10");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1569724324100L) + "'", long14 == (-1569724324100L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1569688324001L) + "'", long19 == (-1569688324001L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1570120924202L) + "'", long22 == (-1570120924202L));
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        long long3 = dateTimeZone1.previousTransition(115800002L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-25740001L), locale5);
        java.lang.String str8 = dateTimeZone1.getNameKey(100L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName(25199900L, locale10);
        int int13 = dateTimeZone1.getOffsetFromLocal((-35939934L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115800002L + "'", long3 == 115800002L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+100:00" + "'", str6, "+100:00");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+100:00" + "'", str11, "+100:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 360000000 + "'", int13 == 360000000);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
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
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone15.getOffset(readableInstant27);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:10" + "'", str4, "+100:10");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-335400000L) + "'", long10 == (-335400000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599899L) + "'", long12 == (-360599899L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 98L + "'", long22 == 98L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 101L + "'", long24 == 101L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570012923999L) + "'", long26 == (-1570012923999L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        java.lang.String str13 = dateTimeZone1.getShortName(96L);
        long long16 = dateTimeZone1.adjustOffset(102L, false);
        java.util.TimeZone timeZone17 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 102L + "'", long16 == 102L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
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
        int int15 = dateTimeZone3.getOffset((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone3.getOffset(readableInstant16);
        java.util.TimeZone timeZone18 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(101L, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924200L));
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str10 = dateTimeZone1.getName((-1570308124201L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.052" + "'", str4, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.052" + "'", str6, "+00:00:00.052");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.052" + "'", str10, "+00:00:00.052");
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115800000);
        java.lang.String str3 = dateTimeZone1.getNameKey(0L);
        long long5 = dateTimeZone1.nextTransition((-1569969664099L));
        long long7 = dateTimeZone1.previousTransition(35940032L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1569969664099L) + "'", long5 == (-1569969664099L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35940032L + "'", long7 == 35940032L);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        long long5 = dateTimeZone1.convertLocalToUTC(100L, false, (-99L));
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName(4139947L, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
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
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone0.getShortName(100L, locale27);
        long long31 = dateTimeZone0.adjustOffset((-52L), true);
        boolean boolean33 = dateTimeZone0.equals((java.lang.Object) (-1570161064002L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.052" + "'", str14, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.052" + "'", str17, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.052" + "'", str20, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.052" + "'", str22, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-52L) + "'", long31 == (-52L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-35999901L));
        long long12 = dateTimeZone1.previousTransition((long) (short) 1);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        java.lang.String str15 = dateTimeZone1.getShortName((-90L));
        int int17 = dateTimeZone1.getOffsetFromLocal(90059999L);
        long long21 = dateTimeZone1.convertLocalToUTC((-1570308123900L), true, (-124499966L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.052" + "'", str15, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1570308123952L) + "'", long21 == (-1570308123952L));
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(101L, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getShortName(36000101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.052" + "'", str4, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.052" + "'", str8, "+00:00:00.052");
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (short) 0);
        long long5 = dateTimeZone2.convertLocalToUTC((long) 0, false);
        java.util.TimeZone timeZone6 = dateTimeZone2.toTimeZone();
        int int8 = dateTimeZone2.getStandardOffset((-1570012924035L));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forID("-01:01");
        java.lang.String str12 = dateTimeZone10.getNameKey(101L);
        long long14 = dateTimeZone10.nextTransition(83400000L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj17 = dateTimeZone16.writeReplace();
        java.lang.String str18 = dateTimeZone16.getID();
        long long20 = dateTimeZone16.convertUTCToLocal(100L);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone16.isLocalDateTimeGap(localDateTime21);
        long long24 = dateTimeZone10.getMillisKeepLocal(dateTimeZone16, 119400001L);
        long long26 = dateTimeZone16.convertUTCToLocal(125999957L);
        boolean boolean27 = dateTimeZone16.isFixed();
        boolean boolean28 = dateTimeZone2.equals((java.lang.Object) boolean27);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-349200000L) + "'", long5 == (-349200000L));
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 83400000L + "'", long14 == 83400000L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 99L + "'", long20 == 99L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 115740002L + "'", long24 == 115740002L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 125999956L + "'", long26 == 125999956L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
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
        java.util.TimeZone timeZone59 = dateTimeZone46.toTimeZone();
        java.lang.String str61 = dateTimeZone46.getShortName((-115259968L));
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj64 = dateTimeZone63.writeReplace();
        java.lang.Object obj65 = dateTimeZone63.writeReplace();
        int int67 = dateTimeZone63.getOffset((-115800001L));
        java.util.TimeZone timeZone68 = dateTimeZone63.toTimeZone();
        org.joda.time.LocalDateTime localDateTime69 = null;
        boolean boolean70 = dateTimeZone63.isLocalDateTimeGap(localDateTime69);
        long long72 = dateTimeZone46.getMillisKeepLocal(dateTimeZone63, 36000100L);
        long long76 = dateTimeZone46.convertLocalToUTC(71400064L, true, (-306539999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.052" + "'", str27, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.052" + "'", str30, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.052" + "'", str33, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.052" + "'", str35, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1570120924049L) + "'", long40 == (-1570120924049L));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 97L + "'", long48 == 97L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 52 + "'", int50 == 52);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00:00.052" + "'", str55, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1569688324052L) + "'", long58 == (-1569688324052L));
        org.junit.Assert.assertNotNull(timeZone59);
        org.junit.Assert.assertEquals(timeZone59.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "+00:00:00.052" + "'", str61, "+00:00:00.052");
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(timeZone68);
        org.junit.Assert.assertEquals(timeZone68.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 36000151L + "'", long72 == 36000151L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 71400012L + "'", long76 == 71400012L);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (short) 0, true);
        long long7 = dateTimeZone1.nextTransition(1L);
        long long11 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, (-90600100L));
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getID();
        java.lang.String str18 = dateTimeZone13.getShortName((-1570200724101L));
        long long20 = dateTimeZone13.nextTransition((-1570084924045L));
        int int22 = dateTimeZone13.getOffset(25200051L);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (-231599899L));
        int int26 = dateTimeZone1.getOffset(79800000L);
        boolean boolean28 = dateTimeZone1.isStandardOffset(115860097L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-2L) + "'", long11 == (-2L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.052" + "'", str14, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.052" + "'", str16, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.052" + "'", str18, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570084924045L) + "'", long20 == (-1570084924045L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-231599950L) + "'", long24 == (-231599950L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long3 = dateTimeZone1.previousTransition((long) '4');
        int int5 = dateTimeZone1.getOffset(89520000L);
        boolean boolean7 = dateTimeZone1.isStandardOffset((-129119999L));
        int int9 = dateTimeZone1.getStandardOffset((-1570120924000L));
        int int11 = dateTimeZone1.getOffsetFromLocal((-151799901L));
        long long14 = dateTimeZone1.adjustOffset((-1570081264001L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1570081264001L) + "'", long14 == (-1570081264001L));
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.previousTransition(90059998L);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (-25200000L));
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        long long17 = dateTimeZone1.convertLocalToUTC((-2099964L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.052" + "'", str2, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 90059998L + "'", long9 == 90059998L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-25200000L) + "'", long12 == (-25200000L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-2100016L) + "'", long17 == (-2100016L));
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.097");
        java.lang.String str2 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.097" + "'", str2, "+00:00:00.097");
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        long long10 = dateTimeZone1.nextTransition(97L);
        java.lang.String str11 = dateTimeZone1.getID();
        long long13 = dateTimeZone1.previousTransition(115260054L);
        boolean boolean14 = dateTimeZone1.isFixed();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getShortName((-10800047L), locale16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.052" + "'", str8, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.052" + "'", str11, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 115260054L + "'", long13 == 115260054L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.052" + "'", str17, "+00:00:00.052");
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
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
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone9.getOffset(readableInstant14);
        boolean boolean16 = dateTimeZone9.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.052" + "'", str10, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.052" + "'", str11, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-25740000L) + "'", long13 == (-25740000L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        java.lang.String str9 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean11 = dateTimeZone1.isFixed();
        long long13 = dateTimeZone1.nextTransition(4140000L);
        boolean boolean14 = dateTimeZone1.isFixed();
        int int16 = dateTimeZone1.getStandardOffset(3599899L);
        java.lang.String str18 = dateTimeZone1.getShortName((-349199952L));
        long long20 = dateTimeZone1.convertUTCToLocal(60031L);
        long long22 = dateTimeZone1.nextTransition((-115739999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.052" + "'", str9, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 4140000L + "'", long13 == 4140000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.052" + "'", str18, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60083L + "'", long20 == 60083L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-115739999L) + "'", long22 == (-115739999L));
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str6 = dateTimeZone1.getShortName(2L);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str10 = dateTimeZone8.getNameKey((-1570012924100L));
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone8.getName(7L, locale12);
        java.lang.Class<?> wildcardClass14 = dateTimeZone8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:01");
        long long4 = dateTimeZone1.adjustOffset((long) 'a', true);
        int int6 = dateTimeZone1.getStandardOffset((-1570084923898L));
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
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
        int int20 = dateTimeZone3.getOffsetFromLocal(3600111L);
        int int22 = dateTimeZone3.getOffsetFromLocal(119400099L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.052" + "'", str12, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.052" + "'", str14, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200052L + "'", long16 == 25200052L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.052" + "'", str17, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
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
        long long17 = dateTimeZone6.previousTransition((-335400000L));
        java.lang.String str19 = dateTimeZone6.getShortName((-1570084984045L));
        java.util.TimeZone timeZone20 = dateTimeZone6.toTimeZone();
        long long24 = dateTimeZone6.convertLocalToUTC(4139999L, true, 119340000L);
        java.lang.String str26 = dateTimeZone6.getName(118860052L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.052" + "'", str13, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-335400000L) + "'", long17 == (-335400000L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.052" + "'", str19, "+00:00:00.052");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 4139947L + "'", long24 == 4139947L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.052" + "'", str26, "+00:00:00.052");
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
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
        long long21 = dateTimeZone1.convertUTCToLocal((long) 36000000);
        long long23 = dateTimeZone1.previousTransition(4139947L);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone1.getShortName(0L, locale25);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone1.isLocalDateTimeGap(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115800000 + "'", int6 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.052" + "'", str15, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 48L + "'", long19 == 48L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 36000100L + "'", long21 == 36000100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 4139947L + "'", long23 == 4139947L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
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
        java.lang.String str16 = dateTimeZone3.getNameKey(0L);
        long long18 = dateTimeZone3.previousTransition(98L);
        java.lang.String str20 = dateTimeZone3.getNameKey(94L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.052" + "'", str11, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.052" + "'", str14, "+00:00:00.052");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 98L + "'", long18 == 98L);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (short) 0, true);
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getOffsetFromLocal((-1570120924101L));
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone1.convertUTCToLocal(43800000L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj15 = dateTimeZone14.writeReplace();
        java.lang.String str16 = dateTimeZone14.getID();
        int int18 = dateTimeZone14.getStandardOffset(0L);
        int int20 = dateTimeZone14.getStandardOffset((-1570084924201L));
        boolean boolean22 = dateTimeZone14.isStandardOffset(99L);
        java.util.TimeZone timeZone23 = dateTimeZone14.toTimeZone();
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        long long27 = dateTimeZone25.nextTransition((long) (short) 100);
        int int29 = dateTimeZone25.getOffsetFromLocal(100L);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone25.getName((-99L), locale31);
        long long34 = dateTimeZone14.getMillisKeepLocal(dateTimeZone25, 112139999L);
        boolean boolean35 = dateTimeZone1.equals((java.lang.Object) dateTimeZone25);
        long long38 = dateTimeZone25.convertLocalToUTC((-115740000L), true);
        java.util.TimeZone timeZone39 = dateTimeZone25.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 43800001L + "'", long12 == 43800001L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.052" + "'", str32, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 112139946L + "'", long34 == 112139946L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-115740052L) + "'", long38 == (-115740052L));
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        int int3 = dateTimeZone1.getOffset((long) (-1));
        boolean boolean5 = dateTimeZone1.isStandardOffset(10L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long10 = dateTimeZone1.adjustOffset((-1570120924110L), false);
        java.lang.String str12 = dateTimeZone1.getName(93179902L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.035" + "'", str6, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570120924110L) + "'", long10 == (-1570120924110L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.035" + "'", str12, "+00:00:00.035");
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
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
        long long19 = dateTimeZone1.convertLocalToUTC((long) 0, true, (-115799899L));
        java.lang.String str21 = dateTimeZone1.getShortName((-90600100L));
        java.lang.String str23 = dateTimeZone1.getNameKey((long) 0);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        long long29 = dateTimeZone25.getMillisKeepLocal(dateTimeZone27, (long) 'a');
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone25.getName((long) (short) 1, locale31);
        int int34 = dateTimeZone25.getOffset((long) 1);
        java.lang.Object obj35 = dateTimeZone25.writeReplace();
        java.lang.String str37 = dateTimeZone25.getShortName(96L);
        long long40 = dateTimeZone25.adjustOffset(102L, false);
        java.util.TimeZone timeZone41 = dateTimeZone25.toTimeZone();
        boolean boolean42 = dateTimeZone25.isFixed();
        java.lang.String str43 = dateTimeZone25.getID();
        long long46 = dateTimeZone25.convertLocalToUTC(0L, false);
        long long49 = dateTimeZone25.convertLocalToUTC(4140100L, false);
        long long51 = dateTimeZone1.getMillisKeepLocal(dateTimeZone25, (-1570197064200L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.035" + "'", str8, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-35L) + "'", long19 == (-35L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.035" + "'", str21, "+00:00:00.035");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.035" + "'", str32, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.035" + "'", str37, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 102L + "'", long40 == 102L);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.035" + "'", str43, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-35L) + "'", long46 == (-35L));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 4140065L + "'", long49 == 4140065L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1570197064200L) + "'", long51 == (-1570197064200L));
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) (-1), locale8);
        long long13 = dateTimeZone1.convertLocalToUTC((-1570120924201L), true, (-115800099L));
        boolean boolean15 = dateTimeZone1.isStandardOffset((-115800100L));
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, (-1570517524001L));
        java.lang.String str20 = dateTimeZone1.getName(125999957L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.035" + "'", str6, "+00:00:00.035");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.035" + "'", str9, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570120924236L) + "'", long13 == (-1570120924236L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570517524001L) + "'", long18 == (-1570517524001L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.035" + "'", str20, "+00:00:00.035");
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-1570084924101L), locale8);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((-115259968L), locale13);
        java.lang.String str15 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.035" + "'", str2, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.035" + "'", str9, "+00:00:00.035");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.035" + "'", str14, "+00:00:00.035");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.035" + "'", str15, "+00:00:00.035");
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
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
        boolean boolean49 = dateTimeZone27.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        java.lang.String str52 = dateTimeZone27.getName((-35999968L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.035" + "'", str4, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199965L + "'", long10 == 25199965L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66L + "'", long12 == 66L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 115800000 + "'", int32 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 97L + "'", long38 == 97L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.035" + "'", str41, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:00" + "'", str52, "+00:00");
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.convertUTCToLocal(72000000L);
        long long10 = dateTimeZone1.nextTransition((long) (-1));
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        boolean boolean14 = dateTimeZone1.isStandardOffset((-35999968L));
        java.lang.String str16 = dateTimeZone1.getShortName(60097L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 71999999L + "'", long8 == 71999999L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getStandardOffset((long) (short) 0);
        int int7 = dateTimeZone1.getOffsetFromLocal(10L);
        long long10 = dateTimeZone1.adjustOffset(115740100L, true);
        boolean boolean11 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115740100L + "'", long10 == 115740100L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.String str3 = dateTimeZone1.getShortName((-1570084924100L));
        long long6 = dateTimeZone1.adjustOffset((long) 36000000, false);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        long long10 = dateTimeZone1.convertUTCToLocal(200L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.035" + "'", str3, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 36000000L + "'", long6 == 36000000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 235L + "'", long10 == 235L);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.035");
        long long3 = dateTimeZone1.convertUTCToLocal(231480001L);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone5.getMillisKeepLocal(dateTimeZone7, (long) 'a');
        java.lang.String str11 = dateTimeZone5.getNameKey(25200000L);
        java.lang.String str12 = dateTimeZone5.toString();
        java.lang.Object obj13 = dateTimeZone5.writeReplace();
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.lang.String str15 = dateTimeZone5.toString();
        long long17 = dateTimeZone5.nextTransition((-59956L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 231480036L + "'", long3 == 231480036L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-59956L) + "'", long17 == (-59956L));
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        java.lang.Class<?> wildcardClass12 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.String str8 = dateTimeZone1.getNameKey((long) 36000000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 0);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName(96L, locale5);
        long long8 = dateTimeZone1.nextTransition(52L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) ' ', locale4);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) 187200000, locale8);
        int int11 = dateTimeZone1.getStandardOffset((-151199905L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long3 = dateTimeZone1.convertUTCToLocal((long) 25200000);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) ' ');
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        int int9 = dateTimeZone1.getOffsetFromLocal(63L);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        boolean boolean16 = dateTimeZone11.isFixed();
        int int18 = dateTimeZone11.getStandardOffset((-1L));
        int int20 = dateTimeZone11.getOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        long long24 = dateTimeZone11.getMillisKeepLocal(dateTimeZone22, 100L);
        boolean boolean25 = dateTimeZone11.isFixed();
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone11.getShortName((-1570164664001L), locale27);
        long long31 = dateTimeZone11.convertLocalToUTC((-90600000L), true);
        long long33 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 23100000L);
        long long37 = dateTimeZone11.convertLocalToUTC((-36000033L), true, (-1570048924001L));
        long long39 = dateTimeZone11.previousTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25200052L + "'", long3 == 25200052L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-35999899L) + "'", long24 == (-35999899L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.001" + "'", str28, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-90600001L) + "'", long31 == (-90600001L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 23100051L + "'", long33 == 23100051L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-36000034L) + "'", long37 == (-36000034L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
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
        java.util.Locale locale54 = null;
        java.lang.String str55 = dateTimeZone6.getShortName((-323999999L), locale54);
        org.joda.time.LocalDateTime localDateTime56 = null;
        boolean boolean57 = dateTimeZone6.isLocalDateTimeGap(localDateTime56);
        int int59 = dateTimeZone6.getStandardOffset((-359999994L));
        long long61 = dateTimeZone6.nextTransition((-64L));
        java.util.TimeZone timeZone62 = dateTimeZone6.toTimeZone();
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 3L + "'", long32 == 3L);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 115800000 + "'", int37 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 97L + "'", long43 == 97L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.001" + "'", str46, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1570084924098L) + "'", long50 == (-1570084924098L));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 36000000L + "'", long52 == 36000000L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00:00.001" + "'", str55, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-64L) + "'", long61 == (-64L));
        org.junit.Assert.assertNotNull(timeZone62);
        org.junit.Assert.assertEquals(timeZone62.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
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
        boolean boolean13 = dateTimeZone10.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone10.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-1570084924101L), locale8);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((-115259968L), locale13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long19 = dateTimeZone1.convertLocalToUTC(115799865L, true, 79260154L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115799865L + "'", long19 == 115799865L);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
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
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone3.getShortName((-1570084924201L), locale16);
        java.util.TimeZone timeZone18 = dateTimeZone3.toTimeZone();
        long long20 = dateTimeZone3.convertUTCToLocal((-1570200724101L));
        boolean boolean22 = dateTimeZone3.isStandardOffset(112139999L);
        java.lang.String str24 = dateTimeZone3.getShortName((-1570117323900L));
        java.lang.String str26 = dateTimeZone3.getNameKey((-1570048923801L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570200724101L) + "'", long20 == (-1570200724101L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        int int3 = dateTimeZone1.getOffset(79260100L);
        long long5 = dateTimeZone1.convertUTCToLocal((-1570084924201L));
        boolean boolean6 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570084924149L) + "'", long5 == (-1570084924149L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long8 = dateTimeZone1.previousTransition((long) (byte) 1);
        java.lang.String str10 = dateTimeZone1.getName(0L);
        int int12 = dateTimeZone1.getStandardOffset((-205860002L));
        java.lang.String str14 = dateTimeZone1.getNameKey(2100001L);
        java.lang.String str16 = dateTimeZone1.getName((-1570214044100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.String str10 = dateTimeZone1.getName((-115799866L));
        java.lang.String str11 = dateTimeZone1.toString();
        java.lang.String str13 = dateTimeZone1.getName((long) 129120000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }
}
