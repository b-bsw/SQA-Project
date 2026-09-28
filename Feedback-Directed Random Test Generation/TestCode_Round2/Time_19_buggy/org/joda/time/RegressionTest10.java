package org.joda.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.lang.Object obj17 = dateTimeZone3.writeReplace();
        java.util.TimeZone timeZone18 = dateTimeZone3.toTimeZone();
        long long20 = dateTimeZone3.convertUTCToLocal(90059998L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "1) test5001(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "1) test5001(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "1) test5001(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
// flaky "1) test5001(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
// flaky "1) test5001(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "1) test5001(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "1) test5001(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 90059998L + "'", long20 == 90059998L);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        java.lang.String str8 = dateTimeZone1.getName((-1570084924101L));
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        int int12 = dateTimeZone1.getStandardOffset((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        java.lang.String str16 = dateTimeZone1.getName(1560000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset(0L);
        long long6 = dateTimeZone1.convertUTCToLocal((long) 36000000);
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        long long10 = dateTimeZone1.adjustOffset(119400051L, false);
        long long13 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 36000001L + "'", long6 == 36000001L);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 119400051L + "'", long10 == 119400051L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        long long6 = dateTimeZone4.nextTransition((long) (short) 100);
        long long9 = dateTimeZone4.convertLocalToUTC((long) (short) -1, false);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (-59905L));
        long long14 = dateTimeZone4.convertLocalToUTC((-115740000L), false);
        boolean boolean15 = dateTimeZone4.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
// flaky "2) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
// flaky "2) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 125940095L + "'", long11 == 125940095L);
// flaky "2) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115740000L) + "'", long14 == (-115740000L));
// flaky "2) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
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
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone3.getName(90059998L, locale19);
        java.lang.String str22 = dateTimeZone3.getName((-1570123024300L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "3) test5005(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "3) test5005(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "3) test5005(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
// flaky "3) test5005(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
// flaky "2) test5005(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky "2) test5005(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
// flaky "2) test5005(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        boolean boolean7 = dateTimeZone1.isFixed();
        java.lang.String str9 = dateTimeZone1.getName((long) 35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "4) test5006(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "4) test5006(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "4) test5006(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        long long54 = dateTimeZone50.getMillisKeepLocal(dateTimeZone52, (long) 'a');
        int int56 = dateTimeZone52.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        java.lang.String str59 = dateTimeZone58.getID();
        java.lang.String str60 = dateTimeZone58.toString();
        long long62 = dateTimeZone52.getMillisKeepLocal(dateTimeZone58, (-25740000L));
        java.lang.String str63 = dateTimeZone52.toString();
        org.joda.time.LocalDateTime localDateTime64 = null;
        boolean boolean65 = dateTimeZone52.isLocalDateTimeGap(localDateTime64);
        long long67 = dateTimeZone1.getMillisKeepLocal(dateTimeZone52, 59L);
        int int69 = dateTimeZone52.getOffsetFromLocal(2099899L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
// flaky "5) test5007(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
// flaky "5) test5007(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
// flaky "5) test5007(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-25200001L) + "'", long25 == (-25200001L));
// flaky "4) test5007(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 96L + "'", long27 == 96L);
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
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 97L + "'", long54 == 97L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "-00:00:00.001" + "'", str59, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "-00:00:00.001" + "'", str60, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-25740000L) + "'", long62 == (-25740000L));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "-00:00:00.001" + "'", str63, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 59L + "'", long67 == 59L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
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
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        long long20 = dateTimeZone3.getMillisKeepLocal(dateTimeZone18, (long) (short) 100);
        boolean boolean21 = dateTimeZone3.isFixed();
        java.lang.Object obj22 = dateTimeZone3.writeReplace();
        long long26 = dateTimeZone3.convertLocalToUTC(230519957L, true, (-1570128664002L));
        boolean boolean27 = dateTimeZone3.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 230519958L + "'", long26 == 230519958L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187200000, 126060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 126060000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        long long10 = dateTimeZone1.nextTransition(97L);
        java.lang.String str11 = dateTimeZone1.getID();
        java.lang.String str12 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3600000 + "'", int4 == 3600000);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+01:00");
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getOffset((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.getID();
        long long15 = dateTimeZone12.previousTransition((-1L));
        long long19 = dateTimeZone12.convertLocalToUTC(25200000L, true, 100L);
        long long21 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, 100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        boolean boolean23 = dateTimeZone10.isFixed();
        int int25 = dateTimeZone10.getOffsetFromLocal(35L);
        int int27 = dateTimeZone10.getStandardOffset(103L);
        long long29 = dateTimeZone10.nextTransition((-126600000L));
        boolean boolean30 = dateTimeZone1.equals((java.lang.Object) dateTimeZone10);
        java.lang.String str32 = dateTimeZone10.getNameKey((-1570214044099L));
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone10.getName((-1570200184100L), locale34);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25200001L + "'", long19 == 25200001L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 102L + "'", long21 == 102L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-126600000L) + "'", long29 == (-126600000L));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.001" + "'", str35, "+00:00:00.001");
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
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
        java.lang.Object obj17 = dateTimeZone3.writeReplace();
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone3.getShortName((long) 126000000, locale19);
        long long23 = dateTimeZone3.convertLocalToUTC(3600111L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3600110L + "'", long23 == 3600110L);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
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
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone6.getOffset(readableInstant25);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-335400000L) + "'", long17 == (-335400000L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 4139998L + "'", long24 == 4139998L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 10);
        int int4 = dateTimeZone2.getStandardOffset((-99L));
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName((long) (short) 1, locale12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        long long17 = dateTimeZone6.convertLocalToUTC((-1570084924100L), true);
        long long21 = dateTimeZone6.convertLocalToUTC((long) (byte) 1, false, (long) (short) 1);
        java.util.TimeZone timeZone22 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long26 = dateTimeZone23.adjustOffset(89520002L, false);
        long long28 = dateTimeZone2.getMillisKeepLocal(dateTimeZone23, (long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570084924101L) + "'", long17 == (-1570084924101L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 89520002L + "'", long26 == 89520002L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 115800032L + "'", long28 == 115800032L);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        java.lang.String str12 = dateTimeZone1.getName(115799900L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str15 = dateTimeZone1.toString();
        java.lang.String str16 = dateTimeZone1.getID();
        long long19 = dateTimeZone1.adjustOffset((-126599964L), false);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone1.getOffset(readableInstant20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-126599964L) + "'", long19 == (-126599964L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        boolean boolean5 = dateTimeZone1.isFixed();
        long long8 = dateTimeZone1.adjustOffset((-360600112L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-360600112L) + "'", long8 == (-360600112L));
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        long long7 = dateTimeZone3.convertLocalToUTC(100L, false, (-99L));
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) false);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((-2099904L), locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName(115260001L, locale13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.Class<?> wildcardClass5 = timeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
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
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone18.getShortName(115739899L, locale38);
        boolean boolean41 = dateTimeZone18.equals((java.lang.Object) 89460000L);
        java.util.TimeZone timeZone42 = dateTimeZone18.toTimeZone();
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 11L + "'", long34 == 11L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-00:00:00.001" + "'", str39, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-1570084924101L), locale8);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName(299340000L, locale15);
        long long18 = dateTimeZone1.nextTransition(115859999L);
        java.lang.Class<?> wildcardClass19 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 115859999L + "'", long18 == 115859999L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
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
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.junit.Assert.assertNotNull(provider0);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
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
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long31 = dateTimeZone28.convertLocalToUTC((-1570084924001L), false);
        int int33 = dateTimeZone28.getOffsetFromLocal((-1570084924000L));
        java.lang.String str34 = dateTimeZone28.getID();
        boolean boolean36 = dateTimeZone28.isStandardOffset((long) '4');
        long long38 = dateTimeZone28.previousTransition((-2L));
        long long40 = dateTimeZone28.nextTransition(103L);
        java.lang.String str42 = dateTimeZone28.getNameKey((-35939969L));
        java.lang.String str44 = dateTimeZone28.getNameKey((-162000000L));
        long long46 = dateTimeZone26.getMillisKeepLocal(dateTimeZone28, (-1569969124201L));
        java.util.Locale locale48 = null;
        java.lang.String str49 = dateTimeZone28.getName((-3660000L), locale48);
        org.joda.time.LocalDateTime localDateTime50 = null;
        boolean boolean51 = dateTimeZone28.isLocalDateTimeGap(localDateTime50);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200001L + "'", long10 == 25200001L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 102L + "'", long12 == 102L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1570084924000L) + "'", long31 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-00:00:00.001" + "'", str34, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-2L) + "'", long38 == (-2L));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 103L + "'", long40 == 103L);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1569969124200L) + "'", long46 == (-1569969124200L));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "-00:00:00.001" + "'", str49, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
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
        java.lang.String str22 = dateTimeZone3.toString();
        long long24 = dateTimeZone3.convertUTCToLocal(25199951L);
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone3.isLocalDateTimeGap(localDateTime25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone3.getOffset(readableInstant27);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-101L) + "'", long19 == (-101L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 25199950L + "'", long24 == 25199950L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        int int8 = dateTimeZone1.getOffsetFromLocal(25200052L);
        java.lang.String str9 = dateTimeZone1.toString();
        int int11 = dateTimeZone1.getStandardOffset((-324000000L));
        boolean boolean13 = dateTimeZone1.isStandardOffset((-1570200664101L));
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        boolean boolean17 = dateTimeZone1.equals((java.lang.Object) (-10860001L));
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName((-61199947L), locale19);
        long long24 = dateTimeZone1.convertLocalToUTC((-36000000L), true, 228960001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-35999999L) + "'", long24 == (-35999999L));
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
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
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (short) 0);
        long long40 = dateTimeZone37.convertLocalToUTC((long) 0, false);
        java.util.TimeZone timeZone41 = dateTimeZone37.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        int int44 = dateTimeZone42.getOffset((long) '#');
        boolean boolean45 = dateTimeZone1.equals((java.lang.Object) dateTimeZone42);
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
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-349200000L) + "'", long40 == (-349200000L));
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) 25200001L);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        java.lang.String str12 = dateTimeZone6.getName((long) (byte) 10);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone6, (long) '4');
        long long17 = dateTimeZone2.convertLocalToUTC(25140003L, false);
        java.lang.String str18 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115260053L + "'", long14 == 115260053L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-90119997L) + "'", long17 == (-90119997L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:01" + "'", str18, "+32:01");
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        long long3 = dateTimeZone1.convertUTCToLocal(0L);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.lang.String str6 = dateTimeZone5.getID();
        long long8 = dateTimeZone5.previousTransition((-1L));
        boolean boolean10 = dateTimeZone5.equals((java.lang.Object) (-1.0f));
        int int12 = dateTimeZone5.getOffsetFromLocal(25200052L);
        java.lang.String str13 = dateTimeZone5.toString();
        java.lang.String str15 = dateTimeZone5.getShortName((long) (-3660000));
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 401699999L);
        long long19 = dateTimeZone1.convertUTCToLocal(115739999L);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long25 = dateTimeZone21.getMillisKeepLocal(dateTimeZone23, (long) 'a');
        int int27 = dateTimeZone23.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone28 = dateTimeZone23.toTimeZone();
        java.util.TimeZone timeZone29 = dateTimeZone23.toTimeZone();
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone23.getName((long) (short) 10, locale31);
        boolean boolean34 = dateTimeZone23.equals((java.lang.Object) (byte) 0);
        long long38 = dateTimeZone23.convertLocalToUTC((long) 10, true, (-35999991L));
        java.lang.String str40 = dateTimeZone23.getNameKey((-25200000L));
        java.util.TimeZone timeZone41 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        boolean boolean43 = dateTimeZone1.equals((java.lang.Object) timeZone41);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 401700097L + "'", long17 == 401700097L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115740096L + "'", long19 == 115740096L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 11L + "'", long38 == 11L);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTimeZone44);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(126060000, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
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
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        long long20 = dateTimeZone16.getMillisKeepLocal(dateTimeZone18, (long) 'a');
        int int22 = dateTimeZone18.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone23 = dateTimeZone18.toTimeZone();
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone18.getShortName((long) (byte) 100, locale25);
        java.lang.String str28 = dateTimeZone18.getNameKey((long) 10);
        boolean boolean29 = dateTimeZone3.equals((java.lang.Object) dateTimeZone18);
        java.lang.String str30 = dateTimeZone3.getID();
        boolean boolean32 = dateTimeZone3.isStandardOffset((-1570517524001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-00:00:00.001" + "'", str26, "-00:00:00.001");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-00:00:00.001" + "'", str30, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
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
        boolean boolean22 = dateTimeZone6.equals((java.lang.Object) 255719956L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-335400000L) + "'", long17 == (-335400000L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        long long6 = dateTimeZone1.previousTransition((long) ' ');
        java.lang.String str8 = dateTimeZone1.getShortName((long) 10);
        java.lang.String str9 = dateTimeZone1.getID();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(112139999L, locale11);
        java.lang.String str14 = dateTimeZone1.getNameKey(132L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getName((-1570048863901L), locale16);
        long long19 = dateTimeZone1.previousTransition(360000011L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 360000011L + "'", long19 == 360000011L);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 0);
        java.lang.String str3 = dateTimeZone2.getID();
        int int5 = dateTimeZone2.getOffsetFromLocal(10799998L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
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
        java.lang.String str26 = dateTimeZone22.getNameKey((-1569969664099L));
        int int28 = dateTimeZone22.getOffsetFromLocal((-1569969124103L));
        long long30 = dateTimeZone22.previousTransition(25200000L);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone22.getName((-206400000L), locale32);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 25200000L + "'", long30 == 25200000L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        java.lang.String str8 = dateTimeZone1.getNameKey((-1570084924201L));
        long long10 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long13 = dateTimeZone1.adjustOffset((long) 187260000, true);
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 187260000L + "'", long13 == 187260000L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(25200000);
        java.lang.String str3 = dateTimeZone1.getNameKey(59999L);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.lang.String str6 = dateTimeZone1.getNameKey(187259900L);
        java.lang.String str8 = dateTimeZone1.getName((-1570084864100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+07:00" + "'", str8, "+07:00");
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
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
        int int15 = dateTimeZone3.getOffset(4140000L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone3.getName(33L, locale17);
        boolean boolean20 = dateTimeZone3.isStandardOffset(364200000L);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone3.isLocalDateTimeGap(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-25740000L) + "'", long13 == (-25740000L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.lang.String str7 = dateTimeZone3.getName(231480087L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone3.getOffset(readableInstant8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getShortName(60052L, locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
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
        int int21 = dateTimeZone1.getOffsetFromLocal(2100001L);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone1.getShortName((-23100002L), locale23);
        java.util.TimeZone timeZone25 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924099L) + "'", long10 == (-1570084924099L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-36000001L) + "'", long12 == (-36000001L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-35999999L) + "'", long17 == (-35999999L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-360600001L) + "'", long19 == (-360600001L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
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
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str20 = dateTimeZone18.getShortName((long) 25200000);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        long long26 = dateTimeZone22.getMillisKeepLocal(dateTimeZone24, (long) 'a');
        int int28 = dateTimeZone24.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone29 = dateTimeZone24.toTimeZone();
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone24.getShortName((long) (byte) 100, locale31);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone24.getShortName((long) (short) 0, locale34);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone24.getName((long) (short) 100, locale37);
        java.lang.String str40 = dateTimeZone24.getName((long) (-1));
        boolean boolean42 = dateTimeZone24.isStandardOffset((long) (short) -1);
        boolean boolean43 = dateTimeZone18.equals((java.lang.Object) dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        long long47 = dateTimeZone18.getMillisKeepLocal(dateTimeZone45, (long) 60000);
        long long50 = dateTimeZone45.convertLocalToUTC(36000095L, true);
        java.util.Locale locale52 = null;
        java.lang.String str53 = dateTimeZone45.getName(231480001L, locale52);
        int int55 = dateTimeZone45.getOffset((-124499965L));
        boolean boolean56 = dateTimeZone14.equals((java.lang.Object) dateTimeZone45);
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
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-00:00:00.001" + "'", str35, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-00:00:00.001" + "'", str38, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-00:00:00.001" + "'", str40, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-187140000L) + "'", long47 == (-187140000L));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-151199905L) + "'", long50 == (-151199905L));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+52:00" + "'", str53, "+52:00");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 187200000 + "'", int55 == 187200000);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-101L));
        long long9 = dateTimeZone1.adjustOffset((long) 3600000, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
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
        int int17 = dateTimeZone1.getStandardOffset(0L);
        long long19 = dateTimeZone1.convertUTCToLocal(79260153L);
        int int21 = dateTimeZone1.getOffsetFromLocal((-1570447024101L));
        java.lang.Class<?> wildcardClass22 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 79260152L + "'", long19 == 79260152L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        java.lang.String str5 = dateTimeZone1.toString();
        long long7 = dateTimeZone1.nextTransition((-1569688324001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1569688324001L) + "'", long7 == (-1569688324001L));
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getOffsetFromLocal(98L);
        long long7 = dateTimeZone1.convertUTCToLocal(35999900L);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        long long13 = dateTimeZone9.convertUTCToLocal((long) 'a');
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone9.isLocalDateTimeGap(localDateTime14);
        java.lang.String str16 = dateTimeZone9.toString();
        boolean boolean17 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35999899L + "'", long7 == 35999899L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 96L + "'", long13 == 96L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
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
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        long long31 = dateTimeZone27.getMillisKeepLocal(dateTimeZone29, (long) 'a');
        java.lang.String str33 = dateTimeZone27.getNameKey(25200000L);
        java.lang.String str34 = dateTimeZone27.toString();
        java.lang.Object obj35 = dateTimeZone27.writeReplace();
        long long37 = dateTimeZone15.getMillisKeepLocal(dateTimeZone27, 244200049L);
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone15.getName((-115259899L), locale39);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
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
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 97L + "'", long31 == 97L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-00:00:00.001" + "'", str34, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 244200050L + "'", long37 == 244200050L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        long long5 = dateTimeZone1.adjustOffset(36000000L, true);
        java.lang.String str7 = dateTimeZone1.getNameKey((-1570200724001L));
        int int9 = dateTimeZone1.getOffset(36000000L);
        long long11 = dateTimeZone1.previousTransition((-1570084923999L));
        java.lang.String str12 = dateTimeZone1.getID();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.String str15 = dateTimeZone14.getID();
        java.lang.String str16 = dateTimeZone14.toString();
        java.lang.String str18 = dateTimeZone14.getName(11L);
        java.lang.String str20 = dateTimeZone14.getShortName((-1570084924001L));
        long long24 = dateTimeZone14.convertLocalToUTC((-1569861724098L), true, (-231599899L));
        boolean boolean25 = dateTimeZone1.equals((java.lang.Object) long24);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 36000000L + "'", long5 == 36000000L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084923999L) + "'", long11 == (-1570084923999L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.035" + "'", str12, "+00:00:00.035");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1569861724097L) + "'", long24 == (-1569861724097L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
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
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = dateTimeZone8.isLocalDateTimeGap(localDateTime29);
        long long33 = dateTimeZone8.convertLocalToUTC((-1570120924101L), true);
        long long36 = dateTimeZone8.adjustOffset(115800002L, true);
        java.lang.String str38 = dateTimeZone8.getShortName((-1570012924100L));
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        long long42 = dateTimeZone40.nextTransition((long) (short) 100);
        int int44 = dateTimeZone40.getOffsetFromLocal(100L);
        java.util.Locale locale46 = null;
        java.lang.String str47 = dateTimeZone40.getName((-99L), locale46);
        int int49 = dateTimeZone40.getStandardOffset(36000001L);
        org.joda.time.ReadableInstant readableInstant50 = null;
        int int51 = dateTimeZone40.getOffset(readableInstant50);
        boolean boolean52 = dateTimeZone8.equals((java.lang.Object) dateTimeZone40);
        long long56 = dateTimeZone8.convertLocalToUTC((-206400000L), true, 53520000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115800000 + "'", int6 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 101L + "'", long19 == 101L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-00:00:00.001" + "'", str26, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1570048924001L) + "'", long28 == (-1570048924001L));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1570120924100L) + "'", long33 == (-1570120924100L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 115800002L + "'", long36 == 115800002L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-00:00:00.001" + "'", str38, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-00:00:00.001" + "'", str47, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-206399999L) + "'", long56 == (-206399999L));
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        java.lang.String str9 = dateTimeZone1.toString();
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        long long14 = dateTimeZone1.adjustOffset((long) (-1), false);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getName((long) 3600000, locale16);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone1.isLocalDateTimeGap(localDateTime18);
        boolean boolean20 = dateTimeZone1.isFixed();
        boolean boolean21 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        int int8 = dateTimeZone1.getOffset(25199951L);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, (long) 'a');
        int int16 = dateTimeZone12.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone17 = dateTimeZone12.toTimeZone();
        java.util.TimeZone timeZone18 = dateTimeZone12.toTimeZone();
        long long20 = dateTimeZone12.convertUTCToLocal(0L);
        boolean boolean22 = dateTimeZone12.equals((java.lang.Object) 100);
        long long24 = dateTimeZone12.convertUTCToLocal(25199900L);
        boolean boolean25 = dateTimeZone1.equals((java.lang.Object) dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 25199899L + "'", long24 == 25199899L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        int int13 = dateTimeZone11.getOffset(244200047L);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        long long19 = dateTimeZone15.getMillisKeepLocal(dateTimeZone17, (long) 'a');
        int int21 = dateTimeZone17.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone22 = dateTimeZone17.toTimeZone();
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone17.getShortName((long) (byte) 100, locale24);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone17.getShortName((long) (short) 0, locale27);
        java.lang.String str29 = dateTimeZone17.getID();
        java.lang.String str31 = dateTimeZone17.getNameKey((long) (byte) -1);
        long long34 = dateTimeZone17.convertLocalToUTC((-90600000L), false);
        long long37 = dateTimeZone17.adjustOffset(36000032L, false);
        java.lang.Object obj38 = dateTimeZone17.writeReplace();
        long long40 = dateTimeZone17.previousTransition(93120100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        java.util.TimeZone timeZone42 = dateTimeZone17.toTimeZone();
        boolean boolean43 = dateTimeZone11.equals((java.lang.Object) dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-00:00:00.001" + "'", str29, "-00:00:00.001");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-90599999L) + "'", long34 == (-90599999L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 36000032L + "'", long37 == 36000032L);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 93120100L + "'", long40 == 93120100L);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-35999901L));
        long long12 = dateTimeZone1.previousTransition((long) (short) 1);
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
        long long27 = dateTimeZone14.adjustOffset((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = dateTimeZone14.isLocalDateTimeGap(localDateTime29);
        long long32 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, (-1570128664001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1570128664001L) + "'", long32 == (-1570128664001L));
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long5 = dateTimeZone1.convertUTCToLocal((long) 'a');
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long11 = dateTimeZone1.convertLocalToUTC(115680102L, false);
        java.lang.String str13 = dateTimeZone1.getName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 96L + "'", long5 == 96L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115680103L + "'", long11 == 115680103L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
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
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        long long24 = dateTimeZone20.getMillisKeepLocal(dateTimeZone22, (long) 'a');
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone20.getName((long) (short) 1, locale26);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        long long31 = dateTimeZone20.convertLocalToUTC((-1570084924100L), true);
        int int33 = dateTimeZone20.getOffset(36000001L);
        boolean boolean34 = dateTimeZone1.equals((java.lang.Object) dateTimeZone20);
        long long37 = dateTimeZone20.adjustOffset(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570120924200L) + "'", long13 == (-1570120924200L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570517524001L) + "'", long18 == (-1570517524001L));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1570084924099L) + "'", long31 == (-1570084924099L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
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
        java.lang.Object obj17 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25200001L + "'", long8 == 25200001L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570200184000L) + "'", long13 == (-1570200184000L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str7 = dateTimeZone1.getID();
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) '4');
        long long11 = dateTimeZone1.previousTransition((-2L));
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        int int14 = dateTimeZone1.getOffsetFromLocal(90059998L);
        java.lang.String str15 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-2L) + "'", long11 == (-2L));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-00:00:00.001");
        java.lang.String str3 = dateTimeZone1.getName((-1570200724101L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
    }
}
