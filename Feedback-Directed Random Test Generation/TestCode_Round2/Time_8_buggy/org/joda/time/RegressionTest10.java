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
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        int int3 = dateTimeZone1.getStandardOffset((-30299968L));
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long8 = dateTimeZone4.getMillisKeepLocal(dateTimeZone6, (long) 'a');
        int int10 = dateTimeZone6.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone11 = dateTimeZone6.toTimeZone();
        int int13 = dateTimeZone6.getOffset((long) (short) 1);
        boolean boolean15 = dateTimeZone6.isStandardOffset((long) 1);
        long long17 = dateTimeZone6.convertUTCToLocal((long) ' ');
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, 25199999L);
        java.lang.String str20 = dateTimeZone6.getID();
        int int22 = dateTimeZone6.getOffset(3599953L);
        int int24 = dateTimeZone6.getStandardOffset(5700036L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25199999L + "'", long19 == 25199999L);
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.toString();
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone9.getOffset(readableInstant11);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (long) 0);
        long long18 = dateTimeZone9.convertLocalToUTC((-25199948L), false, (long) (byte) 0);
        java.lang.String str19 = dateTimeZone9.toString();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 0);
        int int24 = dateTimeZone22.getOffset((-50399947L));
        boolean boolean25 = dateTimeZone9.equals((java.lang.Object) (-50399947L));
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone9.getShortName((-35999901L), locale27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        long long34 = dateTimeZone30.getMillisKeepLocal(dateTimeZone32, (long) 'a');
        boolean boolean35 = dateTimeZone30.isFixed();
        java.lang.String str36 = dateTimeZone30.toString();
        java.lang.Object obj37 = dateTimeZone30.writeReplace();
        long long39 = dateTimeZone30.nextTransition((-25199947L));
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone30.getShortName((-32460000L), locale41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        int int44 = dateTimeZone30.getOffset(readableInstant43);
        long long46 = dateTimeZone9.getMillisKeepLocal(dateTimeZone30, (-34500000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "2) test5003(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "2) test5003(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "2) test5003(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky "2) test5003(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
// flaky "2) test5003(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky "2) test5003(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-25199948L) + "'", long18 == (-25199948L));
// flaky "2) test5003(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "2) test5003(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 97L + "'", long34 == 97L);
// flaky "1) test5003(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
// flaky "1) test5003(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-25199947L) + "'", long39 == (-25199947L));
// flaky "1) test5003(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
// flaky "1) test5003(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-34500000L) + "'", long46 == (-34500000L));
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.lang.String str12 = dateTimeZone3.toString();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone3.getName((long) 1, locale14);
        java.lang.String str16 = dateTimeZone3.toString();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long21 = dateTimeZone18.convertLocalToUTC((-1570084924001L), false);
        long long23 = dateTimeZone18.nextTransition((-25199900L));
        java.lang.String str25 = dateTimeZone18.getShortName((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long30 = dateTimeZone28.previousTransition((long) 3660000);
        long long32 = dateTimeZone18.getMillisKeepLocal(dateTimeZone28, (-25199989L));
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone18.getOffset(readableInstant33);
        java.lang.String str35 = dateTimeZone18.getID();
        long long37 = dateTimeZone3.getMillisKeepLocal(dateTimeZone18, 5700101L);
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone3.getShortName(30420001L, locale39);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "3) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "3) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "3) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
// flaky "3) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
// flaky "3) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
// flaky "3) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1570084924000L) + "'", long21 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-25199900L) + "'", long23 == (-25199900L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3660000L + "'", long30 == 3660000L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-25199991L) + "'", long32 == (-25199991L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-00:00:00.001" + "'", str35, "-00:00:00.001");
// flaky "3) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 5700102L + "'", long37 == 5700102L);
// flaky "3) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider1 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        java.lang.Class<?> wildcardClass4 = nameProvider1.getClass();
        boolean boolean5 = dateTimeZone0.equals((java.lang.Object) nameProvider1);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) 'a');
        int int10 = dateTimeZone0.getOffset((-50399848L));
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone0.getOffset(readableInstant11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long16 = dateTimeZone14.previousTransition((long) (short) 100);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        long long22 = dateTimeZone18.getMillisKeepLocal(dateTimeZone20, (long) 'a');
        boolean boolean24 = dateTimeZone18.isStandardOffset((-25200000L));
        java.lang.String str25 = dateTimeZone18.toString();
        long long27 = dateTimeZone14.getMillisKeepLocal(dateTimeZone18, (-25199900L));
        java.util.TimeZone timeZone28 = dateTimeZone14.toTimeZone();
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone14.getShortName(99L, locale30);
        java.lang.String str33 = dateTimeZone14.getNameKey(3600010L);
        java.lang.String str34 = dateTimeZone14.getID();
        java.lang.String str35 = dateTimeZone14.toString();
        long long37 = dateTimeZone0.getMillisKeepLocal(dateTimeZone14, (-25199991L));
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = dateTimeZone14.getOffset(readableInstant38);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(nameProvider1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-25199899L) + "'", long27 == (-25199899L));
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-25199991L) + "'", long37 == (-25199991L));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        long long3 = dateTimeZone1.convertUTCToLocal((-25199989L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 0L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long11 = dateTimeZone9.previousTransition((long) (short) 100);
        int int13 = dateTimeZone9.getOffsetFromLocal((long) 25200000);
        java.util.TimeZone timeZone14 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) dateTimeZone15);
        long long18 = dateTimeZone1.convertUTCToLocal((-66899999L));
        java.lang.String str20 = dateTimeZone1.getShortName(19500101L);
        long long22 = dateTimeZone1.previousTransition(30900009L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-25199989L) + "'", long3 == (-25199989L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-100L) + "'", long7 == (-100L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-66899999L) + "'", long18 == (-66899999L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 30900009L + "'", long22 == 30900009L);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        boolean boolean10 = dateTimeZone9.isFixed();
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        int int13 = dateTimeZone1.getOffset((long) 25200000);
        java.lang.String str14 = dateTimeZone1.toString();
        long long17 = dateTimeZone1.adjustOffset((-45299846L), true);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName(39600032L, locale19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11L + "'", long7 == 11L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-45299846L) + "'", long17 == (-45299846L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
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
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        long long20 = dateTimeZone16.getMillisKeepLocal(dateTimeZone18, (long) 'a');
        int int22 = dateTimeZone18.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone23 = dateTimeZone18.toTimeZone();
        int int25 = dateTimeZone18.getOffset((long) (short) 1);
        java.lang.String str27 = dateTimeZone18.getShortName(53L);
        java.lang.String str29 = dateTimeZone18.getNameKey(1L);
        long long31 = dateTimeZone3.getMillisKeepLocal(dateTimeZone18, (-61199947L));
        long long34 = dateTimeZone18.convertLocalToUTC((long) '4', true);
        java.lang.String str35 = dateTimeZone18.getID();
        int int37 = dateTimeZone18.getStandardOffset(50L);
        java.util.TimeZone timeZone38 = dateTimeZone18.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-61199947L) + "'", long31 == (-61199947L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 53L + "'", long34 == 53L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-00:00:00.001" + "'", str35, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        long long6 = dateTimeZone1.nextTransition((-25199900L));
        long long10 = dateTimeZone1.convertLocalToUTC(28800099L, false, (-21599947L));
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199900L) + "'", long6 == (-25199900L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 28800100L + "'", long10 == 28800100L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(6720000, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long4 = dateTimeZone1.convertLocalToUTC((-57599990L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-57600000L) + "'", long4 == (-57600000L));
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
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) '4', locale8);
        long long13 = dateTimeZone1.convertLocalToUTC((-21599989L), true, (-1570084924002L));
        java.lang.String str15 = dateTimeZone1.getShortName(25200102L);
        long long19 = dateTimeZone1.convertLocalToUTC((-148L), false, 3600100L);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone1.isLocalDateTimeGap(localDateTime20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone1.getShortName((-9299998L), locale23);
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone1.isLocalDateTimeGap(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-21599988L) + "'", long13 == (-21599988L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-147L) + "'", long19 == (-147L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
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
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.toString();
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        boolean boolean9 = dateTimeZone1.isFixed();
        long long11 = dateTimeZone1.nextTransition(0L);
        java.lang.String str12 = dateTimeZone1.getID();
        long long14 = dateTimeZone1.nextTransition((-3599949L));
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        boolean boolean16 = dateTimeZone1.isFixed();
        java.lang.String str18 = dateTimeZone1.getNameKey((-8699949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3599949L) + "'", long14 == (-3599949L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1920000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long3 = dateTimeZone1.previousTransition((long) 3660000);
        long long5 = dateTimeZone1.previousTransition(5699999L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long8 = dateTimeZone1.nextTransition(19500000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3660000L + "'", long3 == 3660000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5699999L + "'", long5 == 5699999L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 19500000L + "'", long8 == 19500000L);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
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
        java.lang.String str17 = dateTimeZone3.getName((long) (short) -1);
        int int19 = dateTimeZone3.getStandardOffset(10L);
        java.lang.Object obj20 = dateTimeZone3.writeReplace();
        java.lang.String str22 = dateTimeZone3.getNameKey((long) (short) -1);
        java.lang.String str23 = dateTimeZone3.getID();
        int int25 = dateTimeZone3.getOffsetFromLocal((-63780000L));
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone3.isLocalDateTimeGap(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.001" + "'", str23, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 35);
        int int4 = dateTimeZone2.getOffsetFromLocal((-1570060800001L));
        long long8 = dateTimeZone2.convertLocalToUTC(0L, true, (-5699903L));
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone2.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone2.nextTransition((-7679998L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5700000 + "'", int4 == 5700000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5700000L) + "'", long8 == (-5700000L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-7679998L) + "'", long12 == (-7679998L));
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone3.getOffset(readableInstant12);
        long long16 = dateTimeZone3.convertLocalToUTC(5700033L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone3.getName((-20099846L), locale19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5700032L + "'", long16 == 5700032L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getName((long) 10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone13.getMillisKeepLocal(dateTimeZone15, (long) 'a');
        int int19 = dateTimeZone15.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone20 = dateTimeZone15.toTimeZone();
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone15.getShortName((long) (byte) 100, locale22);
        java.lang.String str24 = dateTimeZone15.toString();
        long long26 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, 0L);
        long long28 = dateTimeZone1.nextTransition(11L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int31 = dateTimeZone1.getOffsetFromLocal((-102900000L));
        java.lang.String str32 = dateTimeZone1.toString();
        long long34 = dateTimeZone1.convertUTCToLocal(28319903L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.001" + "'", str23, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 11L + "'", long28 == 11L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.001" + "'", str32, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 28319904L + "'", long34 == 28319904L);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long7 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, (-25199948L));
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str11 = dateTimeZone10.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        java.lang.String str14 = dateTimeZone10.getShortName((long) (-1));
        int int16 = dateTimeZone10.getStandardOffset((long) (short) -1);
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, 35999952L);
        java.lang.String str20 = dateTimeZone1.getName(53L);
        int int22 = dateTimeZone1.getOffset((-5699904L));
        boolean boolean23 = dateTimeZone1.isFixed();
        int int25 = dateTimeZone1.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35999950L + "'", long18 == 35999950L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
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
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.lang.Object obj10 = dateTimeZone3.writeReplace();
        long long12 = dateTimeZone3.nextTransition((-44L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-44L) + "'", long12 == (-44L));
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long12 = dateTimeZone1.adjustOffset((long) (short) 10, true);
        java.lang.Object obj13 = dateTimeZone1.writeReplace();
        int int15 = dateTimeZone1.getStandardOffset((long) (-1));
        int int17 = dateTimeZone1.getStandardOffset((-1570084924000L));
        long long19 = dateTimeZone1.nextTransition(25200010L);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone1.getName((long) (short) 100, locale21);
        java.lang.String str23 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone25.getOffset(readableInstant26);
        int int29 = dateTimeZone25.getOffset((-25199899L));
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone25.isLocalDateTimeGap(localDateTime30);
        java.lang.String str32 = dateTimeZone25.getID();
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone25.getName(36000033L, locale34);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        long long41 = dateTimeZone37.getMillisKeepLocal(dateTimeZone39, (long) 'a');
        java.util.Locale locale43 = null;
        java.lang.String str44 = dateTimeZone37.getName((long) (short) 1, locale43);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone37);
        java.lang.String str47 = dateTimeZone37.getName((long) 10);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        java.util.TimeZone timeZone50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        long long53 = dateTimeZone49.getMillisKeepLocal(dateTimeZone51, (long) 'a');
        int int55 = dateTimeZone51.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone56 = dateTimeZone51.toTimeZone();
        java.util.Locale locale58 = null;
        java.lang.String str59 = dateTimeZone51.getShortName((long) (byte) 100, locale58);
        java.lang.String str60 = dateTimeZone51.toString();
        long long62 = dateTimeZone37.getMillisKeepLocal(dateTimeZone51, 0L);
        boolean boolean63 = dateTimeZone25.equals((java.lang.Object) 0L);
        boolean boolean64 = dateTimeZone1.equals((java.lang.Object) 0L);
        long long66 = dateTimeZone1.nextTransition((-45299846L));
        long long68 = dateTimeZone1.convertUTCToLocal(4200036L);
        long long71 = dateTimeZone1.adjustOffset((-32399999L), false);
        java.util.Locale locale73 = null;
        java.lang.String str74 = dateTimeZone1.getName(10800009L, locale73);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25200010L + "'", long19 == 25200010L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.001" + "'", str23, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-00:00:00.001" + "'", str35, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 97L + "'", long41 == 97L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00:00.001" + "'", str44, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00:00.001" + "'", str47, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 97L + "'", long53 == 97L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(timeZone56);
        org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+00:00:00.001" + "'", str59, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+00:00:00.001" + "'", str60, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-45299846L) + "'", long66 == (-45299846L));
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 4200037L + "'", long68 == 4200037L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-32399999L) + "'", long71 == (-32399999L));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "+00:00:00.001" + "'", str74, "+00:00:00.001");
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
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
        java.lang.String str17 = dateTimeZone3.getName((long) (short) -1);
        int int19 = dateTimeZone3.getStandardOffset(10L);
        java.lang.Object obj20 = dateTimeZone3.writeReplace();
        java.lang.String str22 = dateTimeZone3.getNameKey((long) (short) -1);
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone3.getOffset(readableInstant23);
        boolean boolean25 = dateTimeZone3.isFixed();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = dateTimeZone27.isLocalDateTimeGap(localDateTime28);
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        java.lang.String str32 = dateTimeZone31.getID();
        long long34 = dateTimeZone31.previousTransition((-1L));
        long long37 = dateTimeZone31.convertLocalToUTC((long) 10, true);
        java.lang.String str39 = dateTimeZone31.getName((-25200000L));
        java.lang.String str41 = dateTimeZone31.getNameKey((-50399948L));
        long long43 = dateTimeZone27.getMillisKeepLocal(dateTimeZone31, (-50399948L));
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone27.getName(35999952L, locale45);
        long long49 = dateTimeZone27.adjustOffset((-61199947L), false);
        java.util.TimeZone timeZone50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        long long53 = dateTimeZone51.nextTransition((long) (short) 100);
        long long56 = dateTimeZone51.adjustOffset((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant57 = null;
        int int58 = dateTimeZone51.getOffset(readableInstant57);
        org.joda.time.ReadableInstant readableInstant59 = null;
        int int60 = dateTimeZone51.getOffset(readableInstant59);
        long long62 = dateTimeZone27.getMillisKeepLocal(dateTimeZone51, 5700011L);
        long long64 = dateTimeZone3.getMillisKeepLocal(dateTimeZone51, (-14399947L));
        java.lang.String str65 = dateTimeZone3.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.001" + "'", str32, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 9L + "'", long37 == 9L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.001" + "'", str39, "+00:00:00.001");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-50399849L) + "'", long43 == (-50399849L));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.100" + "'", str46, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-61199947L) + "'", long49 == (-61199947L));
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 100L + "'", long53 == 100L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1L) + "'", long56 == (-1L));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 5700110L + "'", long62 == 5700110L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-14399947L) + "'", long64 == (-14399947L));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "+00:00:00.001" + "'", str65, "+00:00:00.001");
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        int int7 = dateTimeZone1.getOffset((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((-5700001L), locale11);
        long long14 = dateTimeZone1.previousTransition(3600037L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3600037L + "'", long14 == 3600037L);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getName((long) 10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone13.getMillisKeepLocal(dateTimeZone15, (long) 'a');
        int int19 = dateTimeZone15.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone20 = dateTimeZone15.toTimeZone();
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone15.getShortName((long) (byte) 100, locale22);
        java.lang.String str24 = dateTimeZone15.toString();
        long long26 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, 0L);
        long long28 = dateTimeZone1.nextTransition(11L);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone1.getName(36000100L, locale30);
        int int33 = dateTimeZone1.getStandardOffset(11875999L);
        int int35 = dateTimeZone1.getOffset(5699938L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.001" + "'", str23, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 11L + "'", long28 == 11L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.001" + "'", str31, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 35);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        boolean boolean8 = dateTimeZone3.isFixed();
        int int10 = dateTimeZone3.getOffsetFromLocal((long) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        int int14 = dateTimeZone12.getOffsetFromLocal((-25199989L));
        boolean boolean16 = dateTimeZone12.isStandardOffset(36000010L);
        boolean boolean17 = dateTimeZone3.equals((java.lang.Object) dateTimeZone12);
        java.lang.String str18 = dateTimeZone12.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3600000 + "'", int14 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+01:00" + "'", str18, "+01:00");
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getOffset(25200001L);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone0.isLocalDateTimeGap(localDateTime3);
        long long6 = dateTimeZone0.convertUTCToLocal((-22080000L));
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        int int14 = dateTimeZone10.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone15 = dateTimeZone10.toTimeZone();
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone10.getShortName((long) (byte) 100, locale17);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone10.getShortName((long) (short) 0, locale20);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        long long27 = dateTimeZone23.getMillisKeepLocal(dateTimeZone25, (long) 'a');
        int int29 = dateTimeZone25.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone30 = dateTimeZone25.toTimeZone();
        java.util.TimeZone timeZone31 = dateTimeZone25.toTimeZone();
        long long33 = dateTimeZone10.getMillisKeepLocal(dateTimeZone25, (long) (short) 10);
        boolean boolean35 = dateTimeZone10.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long39 = dateTimeZone10.getMillisKeepLocal(dateTimeZone37, 52L);
        long long41 = dateTimeZone37.nextTransition((-50399846L));
        long long44 = dateTimeZone37.convertLocalToUTC((-25199898L), false);
        long long46 = dateTimeZone37.previousTransition(5700010L);
        long long48 = dateTimeZone37.previousTransition(36000033L);
        java.lang.String str49 = dateTimeZone37.toString();
        java.lang.String str50 = dateTimeZone37.getID();
        java.lang.String str52 = dateTimeZone37.getNameKey((-1570087023999L));
        long long54 = dateTimeZone0.getMillisKeepLocal(dateTimeZone37, 5700111L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-22079999L) + "'", long6 == (-22079999L));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.001" + "'", str21, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-47L) + "'", long39 == (-47L));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-50399846L) + "'", long41 == (-50399846L));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-25199998L) + "'", long44 == (-25199998L));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 5700010L + "'", long46 == 5700010L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 36000033L + "'", long48 == 36000033L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00:00.100" + "'", str49, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00:00.100" + "'", str50, "+00:00:00.100");
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 5700012L + "'", long54 == 5700012L);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long7 = dateTimeZone4.convertLocalToUTC((-1570084924001L), false);
        int int9 = dateTimeZone4.getOffsetFromLocal((-1570084924000L));
        java.lang.String str11 = dateTimeZone4.getShortName((long) (short) 1);
        int int13 = dateTimeZone4.getOffsetFromLocal((long) (byte) 100);
        int int15 = dateTimeZone4.getOffset((long) (-1));
        long long17 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (-25199900L));
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone2.getName((long) 100, locale19);
        java.util.TimeZone timeZone21 = dateTimeZone2.toTimeZone();
        boolean boolean22 = dateTimeZone2.isFixed();
        long long24 = dateTimeZone2.nextTransition((-32999900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570084924000L) + "'", long7 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-21599899L) + "'", long17 == (-21599899L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+01:00" + "'", str20, "+01:00");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-32999900L) + "'", long24 == (-32999900L));
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 35);
        java.lang.String str4 = dateTimeZone2.getNameKey((-3599949L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long8 = dateTimeZone2.convertLocalToUTC((-3659903L), false);
        java.lang.Object obj9 = dateTimeZone2.writeReplace();
        long long11 = dateTimeZone2.previousTransition(5700036L);
        java.lang.Object obj12 = dateTimeZone2.writeReplace();
        java.lang.String str13 = dateTimeZone2.toString();
        java.lang.String str14 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-9359903L) + "'", long8 == (-9359903L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5700036L + "'", long11 == 5700036L);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:35" + "'", str13, "+01:35");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:35" + "'", str14, "+01:35");
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long3 = dateTimeZone1.previousTransition((long) (short) 100);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone5.getMillisKeepLocal(dateTimeZone7, (long) 'a');
        boolean boolean11 = dateTimeZone5.isStandardOffset((-25200000L));
        java.lang.String str12 = dateTimeZone5.toString();
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-25199900L));
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getShortName(99L, locale17);
        java.util.TimeZone timeZone19 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.lang.String str22 = dateTimeZone20.getNameKey((-50399950L));
        boolean boolean24 = dateTimeZone20.equals((java.lang.Object) 5700032L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:35" + "'", str12, "+01:35");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30899900L) + "'", long14 == (-30899900L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.lang.String str8 = dateTimeZone3.toString();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long12 = dateTimeZone10.previousTransition((long) 3660000);
        int int14 = dateTimeZone10.getOffset((-50399950L));
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) dateTimeZone10);
        long long17 = dateTimeZone3.previousTransition((-52L));
        long long21 = dateTimeZone3.convertLocalToUTC((-14400002L), false, 13L);
        long long23 = dateTimeZone3.convertUTCToLocal(4200035L);
        int int25 = dateTimeZone3.getOffset((-14400001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3660000L + "'", long12 == 3660000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-52L) + "'", long17 == (-52L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-20100002L) + "'", long21 == (-20100002L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9900035L + "'", long23 == 9900035L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5700000 + "'", int25 == 5700000);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 35);
        long long4 = dateTimeZone2.convertUTCToLocal(9L);
        long long6 = dateTimeZone2.previousTransition(5699999L);
        java.lang.Class<?> wildcardClass7 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5700009L + "'", long4 == 5700009L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5699999L + "'", long6 == 5699999L);
        org.junit.Assert.assertNotNull(wildcardClass7);
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long11 = dateTimeZone1.convertUTCToLocal((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName(25200002L, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getShortName((-75599848L), locale16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider19 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider19);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider19);
        java.lang.Class<?> wildcardClass22 = nameProvider19.getClass();
        boolean boolean23 = dateTimeZone18.equals((java.lang.Object) nameProvider19);
        java.lang.Object obj24 = dateTimeZone18.writeReplace();
        java.lang.String str25 = dateTimeZone18.toString();
        int int27 = dateTimeZone18.getOffsetFromLocal((-2L));
        long long30 = dateTimeZone18.adjustOffset(6720011L, true);
        long long32 = dateTimeZone1.getMillisKeepLocal(dateTimeZone18, (long) 52);
        boolean boolean34 = dateTimeZone18.isStandardOffset(3600001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5700001L + "'", long11 == 5700001L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:35" + "'", str14, "+01:35");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+01:35" + "'", str17, "+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(nameProvider19);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 6720011L + "'", long30 == 6720011L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5700052L + "'", long32 == 5700052L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
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
        boolean boolean17 = dateTimeZone3.equals((java.lang.Object) 100.0d);
        long long21 = dateTimeZone3.convertLocalToUTC((-35999903L), true, 59999L);
        long long24 = dateTimeZone3.adjustOffset((-25199999L), false);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        long long28 = dateTimeZone26.nextTransition((long) (short) 100);
        java.lang.String str29 = dateTimeZone26.toString();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        boolean boolean32 = dateTimeZone31.isFixed();
        boolean boolean33 = dateTimeZone26.equals((java.lang.Object) boolean32);
        java.util.TimeZone timeZone34 = dateTimeZone26.toTimeZone();
        boolean boolean36 = dateTimeZone26.isStandardOffset(0L);
        java.lang.String str38 = dateTimeZone26.getNameKey((long) (byte) 1);
        java.lang.Object obj39 = dateTimeZone26.writeReplace();
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone26.getName(36000101L, locale41);
        boolean boolean43 = dateTimeZone3.equals((java.lang.Object) dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:35" + "'", str11, "+01:35");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:35" + "'", str14, "+01:35");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+01:35" + "'", str15, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-41699903L) + "'", long21 == (-41699903L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-25199999L) + "'", long24 == (-25199999L));
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+01:35" + "'", str29, "+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+01:35" + "'", str42, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        boolean boolean10 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5699990L) + "'", long7 == (-5699990L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5700000 + "'", int14 == 5700000);
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getName((long) 10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone13.getMillisKeepLocal(dateTimeZone15, (long) 'a');
        int int19 = dateTimeZone15.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone20 = dateTimeZone15.toTimeZone();
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone15.getShortName((long) (byte) 100, locale22);
        java.lang.String str24 = dateTimeZone15.toString();
        long long26 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, 0L);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long32 = dateTimeZone28.getMillisKeepLocal(dateTimeZone30, (long) 'a');
        boolean boolean33 = dateTimeZone28.isFixed();
        java.lang.String str34 = dateTimeZone28.toString();
        boolean boolean35 = dateTimeZone1.equals((java.lang.Object) str34);
        long long38 = dateTimeZone1.convertLocalToUTC((long) 3600000, false);
        java.lang.String str40 = dateTimeZone1.getShortName(36000100L);
        long long43 = dateTimeZone1.adjustOffset((-25199900L), true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale46 = null;
        java.lang.String str47 = dateTimeZone1.getShortName((-25259899L), locale46);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:35" + "'", str11, "+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5700000 + "'", int19 == 5700000);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+01:35" + "'", str23, "+01:35");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+01:35" + "'", str24, "+01:35");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+01:35" + "'", str34, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-2100000L) + "'", long38 == (-2100000L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+01:35" + "'", str40, "+01:35");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-25199900L) + "'", long43 == (-25199900L));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+01:35" + "'", str47, "+01:35");
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        boolean boolean6 = dateTimeZone1.isStandardOffset((-25199990L));
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        java.lang.String str10 = dateTimeZone1.getShortName((-7199950L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone3.getOffset(readableInstant12);
        java.lang.String str15 = dateTimeZone3.getShortName((long) (byte) 10);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone3.getShortName(24124000L, locale17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:35" + "'", str11, "+01:35");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5700000 + "'", int13 == 5700000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+01:35" + "'", str15, "+01:35");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+01:35" + "'", str18, "+01:35");
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.toString();
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        boolean boolean9 = dateTimeZone1.isFixed();
        java.lang.String str11 = dateTimeZone1.getShortName(36000032L);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        java.lang.String str14 = dateTimeZone1.getID();
        long long17 = dateTimeZone1.adjustOffset(0L, true);
        long long19 = dateTimeZone1.nextTransition(3600011L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:35" + "'", str7, "+01:35");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:35" + "'", str11, "+01:35");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5700000 + "'", int13 == 5700000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:35" + "'", str14, "+01:35");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3600011L + "'", long19 == 3600011L);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) '4', locale8);
        java.lang.String str10 = dateTimeZone1.toString();
        java.lang.String str12 = dateTimeZone1.getName((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long17 = dateTimeZone14.adjustOffset((long) '4', true);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone14.isLocalDateTimeGap(localDateTime18);
        boolean boolean20 = dateTimeZone1.equals((java.lang.Object) boolean19);
        long long22 = dateTimeZone1.previousTransition((-90L));
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        long long28 = dateTimeZone24.getMillisKeepLocal(dateTimeZone26, (long) 'a');
        int int30 = dateTimeZone26.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone31 = dateTimeZone26.toTimeZone();
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone26.getShortName((long) (byte) 100, locale33);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone26.getShortName((long) (short) 0, locale36);
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        long long43 = dateTimeZone39.getMillisKeepLocal(dateTimeZone41, (long) 'a');
        int int45 = dateTimeZone41.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone46 = dateTimeZone41.toTimeZone();
        java.util.TimeZone timeZone47 = dateTimeZone41.toTimeZone();
        long long49 = dateTimeZone26.getMillisKeepLocal(dateTimeZone41, (long) (short) 10);
        boolean boolean51 = dateTimeZone26.isStandardOffset((long) (byte) 0);
        long long53 = dateTimeZone26.nextTransition(10L);
        java.lang.Object obj54 = dateTimeZone26.writeReplace();
        java.lang.String str56 = dateTimeZone26.getShortName((long) (byte) 100);
        java.lang.Object obj57 = dateTimeZone26.writeReplace();
        long long59 = dateTimeZone1.getMillisKeepLocal(dateTimeZone26, (-5699948L));
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider61 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider61);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider61);
        java.lang.Class<?> wildcardClass64 = nameProvider61.getClass();
        boolean boolean65 = dateTimeZone60.equals((java.lang.Object) nameProvider61);
        java.lang.Object obj66 = dateTimeZone60.writeReplace();
        java.lang.String str67 = dateTimeZone60.toString();
        long long70 = dateTimeZone60.adjustOffset(11L, false);
        boolean boolean71 = dateTimeZone1.equals((java.lang.Object) long70);
        java.lang.String str72 = dateTimeZone1.getID();
        int int74 = dateTimeZone1.getStandardOffset(21600002L);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long78 = dateTimeZone76.previousTransition((long) (short) 100);
        long long80 = dateTimeZone76.convertUTCToLocal(32L);
        java.lang.String str82 = dateTimeZone76.getShortName((long) 'a');
        java.util.TimeZone timeZone83 = dateTimeZone76.toTimeZone();
        java.lang.Object obj84 = dateTimeZone76.writeReplace();
        long long86 = dateTimeZone1.getMillisKeepLocal(dateTimeZone76, 28800000L);
        java.lang.String str88 = dateTimeZone1.getName(5700096L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+01:35" + "'", str9, "+01:35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:35" + "'", str10, "+01:35");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:35" + "'", str12, "+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-90L) + "'", long22 == (-90L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 97L + "'", long28 == 97L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5700000 + "'", int30 == 5700000);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+01:35" + "'", str34, "+01:35");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+01:35" + "'", str37, "+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 97L + "'", long43 == 97L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5700000 + "'", int45 == 5700000);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 10L + "'", long49 == 10L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 10L + "'", long53 == 10L);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+01:35" + "'", str56, "+01:35");
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-5699948L) + "'", long59 == (-5699948L));
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(nameProvider61);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "UTC" + "'", str67, "UTC");
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 11L + "'", long70 == 11L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "+01:35" + "'", str72, "+01:35");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 5700000 + "'", int74 == 5700000);
        org.junit.Assert.assertNotNull(dateTimeZone76);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 100L + "'", long78 == 100L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 32L + "'", long80 == 32L);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "+00:00" + "'", str82, "+00:00");
        org.junit.Assert.assertNotNull(timeZone83);
        org.junit.Assert.assertEquals(timeZone83.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 34500000L + "'", long86 == 34500000L);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "+01:35" + "'", str88, "+01:35");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean1 = dateTimeZone0.isFixed();
        long long4 = dateTimeZone0.adjustOffset((-50399948L), true);
        java.lang.String str6 = dateTimeZone0.getShortName((-3659903L));
        long long8 = dateTimeZone0.convertUTCToLocal((-57599989L));
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-50399948L) + "'", long4 == (-50399948L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+01:35" + "'", str6, "+01:35");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-51899989L) + "'", long8 == (-51899989L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+01:35");
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName(161L, locale6);
        long long9 = dateTimeZone1.previousTransition(29400000L);
        boolean boolean11 = dateTimeZone1.isStandardOffset(13L);
        java.lang.String str13 = dateTimeZone1.getShortName((-3540100L));
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 29400000L + "'", long9 == 29400000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        java.lang.String str12 = dateTimeZone3.getShortName(53L);
        long long15 = dateTimeZone3.convertLocalToUTC((long) 25200000, false);
        long long18 = dateTimeZone3.adjustOffset((long) 100, false);
        long long20 = dateTimeZone3.previousTransition(53L);
        java.lang.String str21 = dateTimeZone3.getID();
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone3.isLocalDateTimeGap(localDateTime22);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.lang.String str26 = dateTimeZone25.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        java.lang.String str29 = dateTimeZone25.getShortName((long) (-1));
        int int31 = dateTimeZone25.getStandardOffset((long) (short) -1);
        int int33 = dateTimeZone25.getOffsetFromLocal((-25199898L));
        java.lang.String str35 = dateTimeZone25.getNameKey(0L);
        java.lang.Object obj36 = dateTimeZone25.writeReplace();
        boolean boolean37 = dateTimeZone3.equals((java.lang.Object) dateTimeZone25);
        java.util.TimeZone timeZone38 = dateTimeZone25.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5700000 + "'", int10 == 5700000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:35" + "'", str12, "+01:35");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 19500000L + "'", long15 == 19500000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 53L + "'", long20 == 53L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+01:35" + "'", str21, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+01:35" + "'", str26, "+01:35");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+01:35" + "'", str29, "+01:35");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5700000 + "'", int31 == 5700000);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5700000 + "'", int33 == 5700000);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT+01:35");
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+07:00");
        int int3 = dateTimeZone1.getOffset((-56099849L));
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        long long9 = dateTimeZone1.convertLocalToUTC((-25199999L), true, 5700034L);
        long long12 = dateTimeZone1.adjustOffset((-58079946L), false);
        int int14 = dateTimeZone1.getOffsetFromLocal(5699999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25200000 + "'", int3 == 25200000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-50399999L) + "'", long9 == (-50399999L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-58079946L) + "'", long12 == (-58079946L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25200000 + "'", int14 == 25200000);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.toString();
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        boolean boolean9 = dateTimeZone1.isFixed();
        long long11 = dateTimeZone1.nextTransition(0L);
        java.lang.String str12 = dateTimeZone1.getID();
        long long16 = dateTimeZone1.convertLocalToUTC((-25199947L), false, (-1570060800001L));
        long long18 = dateTimeZone1.nextTransition((long) 36000000);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str22 = dateTimeZone20.getNameKey(1L);
        java.util.TimeZone timeZone23 = dateTimeZone20.toTimeZone();
        long long26 = dateTimeZone20.adjustOffset((long) (short) 10, true);
        long long28 = dateTimeZone20.previousTransition((-49L));
        java.lang.Object obj29 = dateTimeZone20.writeReplace();
        long long31 = dateTimeZone1.getMillisKeepLocal(dateTimeZone20, 25200001L);
        int int33 = dateTimeZone20.getOffset(36060000L);
        java.lang.String str34 = dateTimeZone20.toString();
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        long long40 = dateTimeZone36.getMillisKeepLocal(dateTimeZone38, (long) 'a');
        boolean boolean41 = dateTimeZone36.isFixed();
        java.lang.String str42 = dateTimeZone36.toString();
        java.lang.Object obj43 = dateTimeZone36.writeReplace();
        boolean boolean44 = dateTimeZone36.isFixed();
        long long46 = dateTimeZone36.nextTransition(0L);
        java.lang.String str47 = dateTimeZone36.getID();
        int int49 = dateTimeZone36.getStandardOffset(10L);
        long long51 = dateTimeZone36.previousTransition(25199999L);
        long long53 = dateTimeZone20.getMillisKeepLocal(dateTimeZone36, (-9299903L));
        org.joda.time.LocalDateTime localDateTime54 = null;
        boolean boolean55 = dateTimeZone36.isLocalDateTimeGap(localDateTime54);
        int int57 = dateTimeZone36.getOffset((-56099847L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:35" + "'", str7, "+01:35");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:35" + "'", str12, "+01:35");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-30899947L) + "'", long16 == (-30899947L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 36000000L + "'", long18 == 36000000L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-49L) + "'", long28 == (-49L));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 30900002L + "'", long31 == 30900002L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-00:00:00.001" + "'", str34, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 97L + "'", long40 == 97L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+01:35" + "'", str42, "+01:35");
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+01:35" + "'", str47, "+01:35");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5700000 + "'", int49 == 5700000);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 25199999L + "'", long51 == 25199999L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-14999904L) + "'", long53 == (-14999904L));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 5700000 + "'", int57 == 5700000);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getOffset((-25199899L));
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.lang.String str8 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        java.lang.String str12 = dateTimeZone1.getNameKey((-540000L));
        int int14 = dateTimeZone1.getOffsetFromLocal((-27779999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
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
        java.lang.String str17 = dateTimeZone3.getName((long) (short) -1);
        long long20 = dateTimeZone3.convertLocalToUTC(25200001L, false);
        long long23 = dateTimeZone3.adjustOffset(3600031L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:35" + "'", str11, "+01:35");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:35" + "'", str14, "+01:35");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+01:35" + "'", str15, "+01:35");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+01:35" + "'", str17, "+01:35");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 19500001L + "'", long20 == 19500001L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3600031L + "'", long23 == 3600031L);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long3 = dateTimeZone1.previousTransition((long) (short) 100);
        long long5 = dateTimeZone1.convertUTCToLocal(32L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long10 = dateTimeZone7.convertLocalToUTC((-1570084924001L), false);
        long long12 = dateTimeZone7.nextTransition((-25199900L));
        java.lang.String str14 = dateTimeZone7.getShortName((long) (short) 0);
        int int16 = dateTimeZone7.getStandardOffset(25199999L);
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-50399847L));
        long long21 = dateTimeZone7.convertLocalToUTC((-2L), false);
        java.lang.String str22 = dateTimeZone7.getID();
        boolean boolean24 = dateTimeZone7.isStandardOffset((-25200089L));
        int int26 = dateTimeZone7.getStandardOffset(41700036L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924000L) + "'", long10 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-25199900L) + "'", long12 == (-25199900L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-50399846L) + "'", long18 == (-50399846L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getOffset(9L);
        boolean boolean10 = dateTimeZone1.isStandardOffset(96L);
        boolean boolean12 = dateTimeZone1.equals((java.lang.Object) (-50399950L));
        long long16 = dateTimeZone1.convertLocalToUTC((-35999948L), false, (-97199947L));
        long long18 = dateTimeZone1.convertUTCToLocal(29400000L);
        java.lang.String str20 = dateTimeZone1.getNameKey((-49919950L));
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone1.getOffset(readableInstant21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5700000 + "'", int8 == 5700000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-41699948L) + "'", long16 == (-41699948L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35100000L + "'", long18 == 35100000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5700000 + "'", int22 == 5700000);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36600000, 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 36600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        java.lang.String str9 = dateTimeZone1.getName((-25200000L));
        long long11 = dateTimeZone1.convertUTCToLocal((-61199948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5699990L) + "'", long7 == (-5699990L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+01:35" + "'", str9, "+01:35");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-55499948L) + "'", long11 == (-55499948L));
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((-25199990L));
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) (byte) 0, locale5);
        boolean boolean8 = dateTimeZone1.isStandardOffset(5700032L);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-98L));
        boolean boolean12 = dateTimeZone1.isStandardOffset((-1L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName(0L, locale14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-25199990L) + "'", long3 == (-25199990L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+01:00" + "'", str6, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+01:00" + "'", str15, "+01:00");
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long7 = dateTimeZone4.convertLocalToUTC((-1570084924001L), false);
        int int9 = dateTimeZone4.getOffsetFromLocal((-1570084924000L));
        java.lang.String str11 = dateTimeZone4.getShortName((long) (short) 1);
        int int13 = dateTimeZone4.getOffsetFromLocal((long) (byte) 100);
        int int15 = dateTimeZone4.getOffset((long) (-1));
        long long17 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (-25199900L));
        java.lang.String str19 = dateTimeZone4.getShortName(2L);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long25 = dateTimeZone21.getMillisKeepLocal(dateTimeZone23, (long) 'a');
        int int27 = dateTimeZone23.getStandardOffset((long) (short) 100);
        boolean boolean28 = dateTimeZone23.isFixed();
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone23.getName((-1L), locale30);
        java.lang.String str32 = dateTimeZone23.toString();
        boolean boolean33 = dateTimeZone4.equals((java.lang.Object) str32);
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone4.isLocalDateTimeGap(localDateTime34);
        java.util.TimeZone timeZone36 = dateTimeZone4.toTimeZone();
        int int38 = dateTimeZone4.getOffset((-50399848L));
        org.joda.time.ReadableInstant readableInstant39 = null;
        int int40 = dateTimeZone4.getOffset(readableInstant39);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570084924000L) + "'", long7 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-21599899L) + "'", long17 == (-21599899L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5700000 + "'", int27 == 5700000);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+01:35" + "'", str31, "+01:35");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+01:35" + "'", str32, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((-25199946L), true, 99L);
        java.lang.Object obj5 = dateTimeZone0.writeReplace();
        java.lang.String str6 = dateTimeZone0.toString();
        java.util.TimeZone timeZone7 = dateTimeZone0.toTimeZone();
        java.lang.String str8 = dateTimeZone0.getID();
        java.lang.String str9 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-25199946L) + "'", long4 == (-25199946L));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider1 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        java.lang.Class<?> wildcardClass4 = nameProvider1.getClass();
        boolean boolean5 = dateTimeZone0.equals((java.lang.Object) nameProvider1);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        java.lang.String str7 = dateTimeZone0.toString();
        int int9 = dateTimeZone0.getOffsetFromLocal((-2L));
        boolean boolean10 = dateTimeZone0.isFixed();
        java.lang.String str11 = dateTimeZone0.toString();
        java.lang.String str12 = dateTimeZone0.toString();
        long long14 = dateTimeZone0.nextTransition(36000030L);
        java.lang.String str16 = dateTimeZone0.getNameKey((-3599964L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(nameProvider1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 36000030L + "'", long14 == 36000030L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-25199945L));
        java.lang.String str4 = dateTimeZone1.toString();
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        long long8 = dateTimeZone1.adjustOffset(133L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.032" + "'", str4, "+00:00:00.032");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 133L + "'", long8 == 133L);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (short) 1);
        boolean boolean8 = dateTimeZone1.isStandardOffset((-35999990L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:35" + "'", str4, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.toString();
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        boolean boolean9 = dateTimeZone1.isFixed();
        java.lang.String str11 = dateTimeZone1.getNameKey((-32879964L));
        java.lang.String str13 = dateTimeZone1.getName((-3600048L));
        java.lang.String str14 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:35" + "'", str7, "+01:35");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:35" + "'", str13, "+01:35");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:35" + "'", str14, "+01:35");
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long3 = dateTimeZone1.convertUTCToLocal(2L);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getName((long) 10);
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        long long16 = dateTimeZone1.convertLocalToUTC((-1L), false, 2L);
        java.lang.Object obj17 = dateTimeZone1.writeReplace();
        boolean boolean19 = dateTimeZone1.isStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:35" + "'", str11, "+01:35");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-5700001L) + "'", long16 == (-5700001L));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getOffsetFromLocal((-30299900L));
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) (byte) 1);
        long long10 = dateTimeZone1.convertUTCToLocal((-9359903L));
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName((-3119989L), locale12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5700000 + "'", int5 == 5700000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3659903L) + "'", long10 == (-3659903L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:35" + "'", str13, "+01:35");
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 100);
        long long5 = dateTimeZone1.convertLocalToUTC((-3540052L), true, (-21599899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3540152L) + "'", long5 == (-3540152L));
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        java.lang.String str4 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        boolean boolean7 = dateTimeZone6.isFixed();
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) boolean7);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        boolean boolean11 = dateTimeZone1.isStandardOffset(0L);
        long long13 = dateTimeZone1.convertUTCToLocal((-5700000L));
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone1.isLocalDateTimeGap(localDateTime16);
        long long20 = dateTimeZone1.convertLocalToUTC(31919898L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:35" + "'", str4, "+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 26219898L + "'", long20 == 26219898L);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.lang.Object obj9 = dateTimeZone3.writeReplace();
        java.lang.String str11 = dateTimeZone3.getNameKey(25200000L);
        boolean boolean12 = dateTimeZone3.isFixed();
        long long15 = dateTimeZone3.convertLocalToUTC((-66900000L), true);
        java.util.TimeZone timeZone16 = dateTimeZone3.toTimeZone();
        long long18 = dateTimeZone3.previousTransition(0L);
        java.lang.String str19 = dateTimeZone3.toString();
        long long21 = dateTimeZone3.nextTransition(10800003L);
        int int23 = dateTimeZone3.getStandardOffset((-45L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-72600000L) + "'", long15 == (-72600000L));
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+01:35" + "'", str19, "+01:35");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10800003L + "'", long21 == 10800003L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5700000 + "'", int23 == 5700000);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.lang.String str5 = dateTimeZone1.getShortName((-61260000L));
        long long8 = dateTimeZone1.adjustOffset((-5700048L), false);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forID("Asia/Bangkok");
        long long12 = dateTimeZone10.nextTransition((long) 25200000);
        java.util.TimeZone timeZone13 = dateTimeZone10.toTimeZone();
        int int15 = dateTimeZone10.getStandardOffset((-50399848L));
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, 36L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName((-50399900L), locale19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5700048L) + "'", long8 == (-5700048L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 25200000L + "'", long12 == 25200000L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25200000 + "'", int15 == 25200000);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-25199964L) + "'", long17 == (-25199964L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName((-21599990L));
        long long6 = dateTimeZone1.nextTransition(39599947L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:35" + "'", str4, "+01:35");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 39599947L + "'", long6 == 39599947L);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        boolean boolean4 = dateTimeZone2.isStandardOffset((-36000048L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        long long10 = dateTimeZone1.convertUTCToLocal((-25199990L));
        long long13 = dateTimeZone1.adjustOffset((long) (byte) 100, false);
        boolean boolean14 = dateTimeZone1.isFixed();
        java.lang.String str15 = dateTimeZone1.toString();
        long long18 = dateTimeZone1.adjustOffset((-3119965L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5700000 + "'", int5 == 5700000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5700000 + "'", int8 == 5700000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-19499990L) + "'", long10 == (-19499990L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+01:35" + "'", str15, "+01:35");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3119965L) + "'", long18 == (-3119965L));
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        boolean boolean8 = dateTimeZone3.isFixed();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getName((-1L), locale10);
        java.lang.String str12 = dateTimeZone3.getID();
        int int14 = dateTimeZone3.getStandardOffset(100L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone3.getName(53L, locale16);
        java.lang.String str19 = dateTimeZone3.getShortName(60000L);
        int int21 = dateTimeZone3.getStandardOffset(98L);
        java.lang.String str23 = dateTimeZone3.getNameKey((-97199999L));
        long long25 = dateTimeZone3.previousTransition((-35999942L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:35" + "'", str11, "+01:35");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:35" + "'", str12, "+01:35");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5700000 + "'", int14 == 5700000);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+01:35" + "'", str17, "+01:35");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+01:35" + "'", str19, "+01:35");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5700000 + "'", int21 == 5700000);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-35999942L) + "'", long25 == (-35999942L));
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider1 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        java.lang.Class<?> wildcardClass4 = nameProvider1.getClass();
        boolean boolean5 = dateTimeZone0.equals((java.lang.Object) nameProvider1);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        java.lang.String str7 = dateTimeZone0.toString();
        long long10 = dateTimeZone0.adjustOffset(11L, false);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getShortName(60000L, locale12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long16 = dateTimeZone0.convertUTCToLocal((-3600001L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(nameProvider1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11L + "'", long10 == 11L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3600001L) + "'", long16 == (-3600001L));
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean7 = dateTimeZone1.isStandardOffset((-25200000L));
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((-50399947L), locale10);
        long long13 = dateTimeZone1.convertUTCToLocal((-46L));
        java.lang.String str15 = dateTimeZone1.getShortName((-3599989L));
        int int17 = dateTimeZone1.getStandardOffset((-3599901L));
        int int19 = dateTimeZone1.getOffset((-1570064400000L));
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.String str23 = dateTimeZone21.getNameKey((long) 10);
        long long25 = dateTimeZone1.getMillisKeepLocal(dateTimeZone21, (long) 36060000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-46L) + "'", long13 == (-46L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 36059965L + "'", long25 == 36059965L);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long3 = dateTimeZone1.previousTransition((long) (short) 100);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        long long8 = dateTimeZone1.convertLocalToUTC(100L, true, (long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long12 = dateTimeZone10.previousTransition((long) (short) 100);
        java.util.TimeZone timeZone13 = dateTimeZone10.toTimeZone();
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (-30900001L));
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone10.getName((-74160000L), locale17);
        int int20 = dateTimeZone10.getOffset((long) 'a');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-30900001L) + "'", long15 == (-30900001L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.lang.Object obj9 = dateTimeZone3.writeReplace();
        java.lang.String str11 = dateTimeZone3.getNameKey(25200000L);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone3.isLocalDateTimeGap(localDateTime12);
        java.lang.String str15 = dateTimeZone3.getShortName((-92099847L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), 1);
        long long6 = dateTimeZone2.convertLocalToUTC(71999848L, false, 1020000L);
        java.lang.String str8 = dateTimeZone2.getNameKey(4200000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 75659848L + "'", long6 == 75659848L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.lang.String str6 = dateTimeZone1.getName(35999950L);
        long long8 = dateTimeZone1.nextTransition((-3600000L));
        long long10 = dateTimeZone1.previousTransition(61199848L);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3600000L) + "'", long8 == (-3600000L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 61199848L + "'", long10 == 61199848L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        boolean boolean12 = dateTimeZone3.isStandardOffset((long) 1);
        long long15 = dateTimeZone3.convertLocalToUTC((-35400048L), false);
        boolean boolean17 = dateTimeZone3.isStandardOffset(3659999L);
        boolean boolean19 = dateTimeZone3.isStandardOffset((-21600099L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-35400048L) + "'", long15 == (-35400048L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.lang.String str8 = dateTimeZone3.toString();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long12 = dateTimeZone10.previousTransition((long) 3660000);
        int int14 = dateTimeZone10.getOffset((-50399950L));
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        long long23 = dateTimeZone19.getMillisKeepLocal(dateTimeZone21, (long) 'a');
        int int25 = dateTimeZone21.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone26 = dateTimeZone21.toTimeZone();
        int int28 = dateTimeZone21.getOffset((long) (short) 1);
        java.lang.String str30 = dateTimeZone21.getShortName(53L);
        long long32 = dateTimeZone21.previousTransition((long) '#');
        long long34 = dateTimeZone21.convertUTCToLocal((-3599948L));
        long long37 = dateTimeZone21.convertLocalToUTC(35L, true);
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        java.lang.String str40 = dateTimeZone39.getID();
        long long42 = dateTimeZone39.previousTransition((-1L));
        long long45 = dateTimeZone39.convertLocalToUTC((long) 10, true);
        org.joda.time.ReadableInstant readableInstant46 = null;
        int int47 = dateTimeZone39.getOffset(readableInstant46);
        int int49 = dateTimeZone39.getOffset(5699999L);
        long long51 = dateTimeZone21.getMillisKeepLocal(dateTimeZone39, (long) 36000000);
        int int53 = dateTimeZone21.getOffsetFromLocal((long) (byte) -1);
        boolean boolean54 = dateTimeZone17.equals((java.lang.Object) dateTimeZone21);
        java.lang.String str56 = dateTimeZone17.getNameKey((-46799949L));
        java.lang.String str58 = dateTimeZone17.getName(3600054L);
        long long60 = dateTimeZone10.getMillisKeepLocal(dateTimeZone17, (-1L));
        java.lang.String str61 = dateTimeZone17.toString();
        java.lang.String str63 = dateTimeZone17.getName((-50399844L));
        java.lang.String str65 = dateTimeZone17.getNameKey((long) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3660000L + "'", long12 == 3660000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 35L + "'", long32 == 35L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-3599948L) + "'", long34 == (-3599948L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 35L + "'", long37 == 35L);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UTC" + "'", str40, "UTC");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 36000000L + "'", long51 == 36000000L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+01:00" + "'", str58, "+01:00");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-3600000L) + "'", long60 == (-3600000L));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "+01:00" + "'", str61, "+01:00");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "+01:00" + "'", str63, "+01:00");
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition(97L);
        long long6 = dateTimeZone1.convertUTCToLocal(32L);
        java.lang.String str7 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(6720000);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        long long12 = dateTimeZone9.getMillisKeepLocal(dateTimeZone10, (long) (short) 10);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, 3120001L);
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 6720010L + "'", long12 == 6720010L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3120001L + "'", long14 == 3120001L);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        long long6 = dateTimeZone1.nextTransition((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 10L);
        java.lang.String str12 = dateTimeZone1.getShortName((long) ' ');
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getShortName((-25199988L), locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getShortName((-5699965L), locale19);
        int int22 = dateTimeZone1.getOffsetFromLocal((long) 6720000);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone1.isLocalDateTimeGap(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
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
        java.util.TimeZone timeZone24 = dateTimeZone18.toTimeZone();
        long long26 = dateTimeZone3.getMillisKeepLocal(dateTimeZone18, (long) (short) 10);
        long long29 = dateTimeZone18.adjustOffset(36000033L, false);
        long long32 = dateTimeZone18.adjustOffset(1020001L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 36000033L + "'", long29 == 36000033L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1020001L + "'", long32 == 1020001L);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        boolean boolean8 = dateTimeZone3.isFixed();
        int int10 = dateTimeZone3.getOffsetFromLocal((long) 100);
        java.lang.String str12 = dateTimeZone3.getName((long) 1);
        java.lang.String str14 = dateTimeZone3.getNameKey(0L);
        long long16 = dateTimeZone3.nextTransition((-61199948L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        long long20 = dateTimeZone3.convertLocalToUTC((-61199899L), true);
        long long22 = dateTimeZone3.previousTransition((-32879964L));
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long27 = dateTimeZone24.adjustOffset((long) (short) 1, false);
        long long31 = dateTimeZone24.convertLocalToUTC((long) '#', false, (-25200000L));
        long long35 = dateTimeZone24.convertLocalToUTC((long) (short) -1, true, 25200000L);
        int int37 = dateTimeZone24.getOffsetFromLocal((-1L));
        java.lang.String str38 = dateTimeZone24.toString();
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone24.getName(197L, locale40);
        long long43 = dateTimeZone3.getMillisKeepLocal(dateTimeZone24, (-3119999L));
        java.lang.String str45 = dateTimeZone3.getNameKey((-3599903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-61199948L) + "'", long16 == (-61199948L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-61199899L) + "'", long20 == (-61199899L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-32879964L) + "'", long22 == (-32879964L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 34L + "'", long31 == 34L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-2L) + "'", long35 == (-2L));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.001" + "'", str38, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.001" + "'", str41, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-3120000L) + "'", long43 == (-3120000L));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UTC" + "'", str45, "UTC");
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        int int3 = dateTimeZone1.getOffsetFromLocal((-25199989L));
        int int5 = dateTimeZone1.getOffset((long) (short) 1);
        boolean boolean7 = dateTimeZone1.isStandardOffset((-32399999L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600000 + "'", int3 == 3600000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+01:00");
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        long long5 = dateTimeZone1.previousTransition(25200100L);
        java.lang.String str7 = dateTimeZone1.getName((long) '#');
        java.lang.String str8 = dateTimeZone1.toString();
        long long11 = dateTimeZone1.convertLocalToUTC((-25199899L), true);
        int int13 = dateTimeZone1.getOffsetFromLocal(36000100L);
        java.lang.String str15 = dateTimeZone1.getNameKey((-5700148L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25200100L + "'", long5 == 25200100L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-25199898L) + "'", long11 == (-25199898L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        long long6 = dateTimeZone1.nextTransition((-25199900L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 0);
        int int10 = dateTimeZone1.getOffset(34L);
        long long12 = dateTimeZone1.previousTransition(39600033L);
        boolean boolean14 = dateTimeZone1.isStandardOffset((-21600041L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199900L) + "'", long6 == (-25199900L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 39600033L + "'", long12 == 39600033L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
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
        java.lang.String str17 = dateTimeZone3.getName(1L, locale16);
        boolean boolean19 = dateTimeZone3.equals((java.lang.Object) "hi!");
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone3.getShortName(25200010L, locale21);
        int int24 = dateTimeZone3.getOffset((long) 25200000);
        java.lang.String str25 = dateTimeZone3.toString();
        boolean boolean27 = dateTimeZone3.isStandardOffset(3120036L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:00" + "'", str11, "+01:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:00" + "'", str14, "+01:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+01:00" + "'", str17, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+01:00" + "'", str22, "+01:00");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3600000 + "'", int24 == 3600000);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+01:00" + "'", str25, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
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
        int int16 = dateTimeZone3.getOffset(16440100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:00" + "'", str11, "+01:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:00" + "'", str14, "+01:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3600000 + "'", int16 == 3600000);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        long long6 = dateTimeZone1.nextTransition((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 10L);
        java.lang.String str12 = dateTimeZone1.getName(2L);
        java.lang.String str13 = dateTimeZone1.toString();
        int int15 = dateTimeZone1.getOffsetFromLocal((-35999899L));
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone1.isLocalDateTimeGap(localDateTime16);
        int int19 = dateTimeZone1.getOffsetFromLocal(35999951L);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone1.getOffset(readableInstant20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:00" + "'", str2, "+01:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3600000 + "'", int4 == 3600000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600010L + "'", long10 == 3600010L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:00" + "'", str12, "+01:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:00" + "'", str13, "+01:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3600000 + "'", int15 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3600000 + "'", int19 == 3600000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3600000 + "'", int21 == 3600000);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal(62L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName(97L, locale5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean8 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3600000) + "'", int3 == (-3600000));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        boolean boolean4 = dateTimeZone1.isFixed();
        int int6 = dateTimeZone1.getStandardOffset((long) (-1));
        java.lang.String str8 = dateTimeZone1.getNameKey((-61199998L));
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, (long) 'a');
        boolean boolean15 = dateTimeZone10.isFixed();
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone10.getShortName((long) '4', locale17);
        java.lang.String str19 = dateTimeZone10.toString();
        java.lang.String str21 = dateTimeZone10.getName((long) (byte) -1);
        int int23 = dateTimeZone10.getStandardOffset((long) (-1));
        boolean boolean25 = dateTimeZone10.isStandardOffset((-1570084924001L));
        java.lang.String str26 = dateTimeZone10.toString();
        boolean boolean27 = dateTimeZone10.isFixed();
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, 3600061L);
        long long31 = dateTimeZone10.nextTransition((-3599989L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-01:00" + "'", str18, "-01:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-01:00" + "'", str19, "-01:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-01:00" + "'", str21, "-01:00");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-3600000) + "'", int23 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-01:00" + "'", str26, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 7200060L + "'", long29 == 7200060L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-3599989L) + "'", long31 == (-3599989L));
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long5 = dateTimeZone1.nextTransition((-50399948L));
        int int7 = dateTimeZone1.getOffsetFromLocal(52L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-50399847L), locale9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long14 = dateTimeZone1.adjustOffset((-35999948L), true);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long19 = dateTimeZone16.adjustOffset((long) (short) 1, false);
        long long23 = dateTimeZone16.convertLocalToUTC((long) '#', false, (-25200000L));
        long long27 = dateTimeZone16.convertLocalToUTC((long) (short) -1, true, 25200000L);
        int int29 = dateTimeZone16.getOffsetFromLocal((-1L));
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone16.getOffset(readableInstant30);
        long long33 = dateTimeZone16.nextTransition(25199900L);
        java.lang.Object obj34 = dateTimeZone16.writeReplace();
        long long36 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, (-25200097L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-50399948L) + "'", long5 == (-50399948L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999948L) + "'", long14 == (-35999948L));
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 34L + "'", long23 == 34L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-2L) + "'", long27 == (-2L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 25199900L + "'", long33 == 25199900L);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-25200099L) + "'", long36 == (-25200099L));
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long3 = dateTimeZone1.previousTransition((long) 3660000);
        java.lang.String str5 = dateTimeZone1.getName((-31799864L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3660000L + "'", long3 == 3660000L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) -1, locale8);
        java.lang.String str11 = dateTimeZone1.getName(9L);
        int int13 = dateTimeZone1.getStandardOffset((-11400046L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        int int3 = dateTimeZone1.getOffset(32460053L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getOffset((-25199899L));
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.lang.String str8 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        java.lang.String str12 = dateTimeZone1.getNameKey((-540000L));
        java.lang.String str13 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long7 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, (-25199948L));
        long long9 = dateTimeZone1.convertUTCToLocal(50L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 49L + "'", long9 == 49L);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.adjustOffset((long) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(60000L);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long11 = dateTimeZone8.convertLocalToUTC((-1570084924001L), false);
        long long13 = dateTimeZone8.nextTransition((-25199900L));
        java.lang.String str15 = dateTimeZone8.getShortName((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long20 = dateTimeZone18.previousTransition((long) 3660000);
        long long22 = dateTimeZone8.getMillisKeepLocal(dateTimeZone18, (-25199989L));
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone8.getOffset(readableInstant23);
        boolean boolean25 = dateTimeZone1.equals((java.lang.Object) dateTimeZone8);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone1.getOffset(readableInstant26);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924000L) + "'", long11 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-25199900L) + "'", long13 == (-25199900L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3660000L + "'", long20 == 3660000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-25199991L) + "'", long22 == (-25199991L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), 35);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT-01:35");
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-5700000), (-5700000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -5700000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        long long8 = dateTimeZone1.convertLocalToUTC((long) '#', false, (-25200000L));
        long long12 = dateTimeZone1.convertLocalToUTC((long) (short) -1, true, 25200000L);
        int int14 = dateTimeZone1.getOffsetFromLocal((-1L));
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        java.lang.String str17 = dateTimeZone1.toString();
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName((-25199991L), locale19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        long long26 = dateTimeZone22.getMillisKeepLocal(dateTimeZone24, (long) 'a');
        boolean boolean27 = dateTimeZone22.isFixed();
        java.lang.String str28 = dateTimeZone22.toString();
        java.lang.Object obj29 = dateTimeZone22.writeReplace();
        boolean boolean30 = dateTimeZone22.isFixed();
        long long32 = dateTimeZone22.nextTransition(0L);
        java.lang.String str33 = dateTimeZone22.getID();
        int int35 = dateTimeZone22.getStandardOffset(10L);
        long long37 = dateTimeZone22.convertUTCToLocal(5700036L);
        long long39 = dateTimeZone22.previousTransition(35999950L);
        long long41 = dateTimeZone1.getMillisKeepLocal(dateTimeZone22, (-47279949L));
        java.lang.String str43 = dateTimeZone1.getNameKey((-61199948L));
        int int45 = dateTimeZone1.getOffsetFromLocal(28319999L);
        org.joda.time.ReadableInstant readableInstant46 = null;
        int int47 = dateTimeZone1.getOffset(readableInstant46);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 34L + "'", long8 == 34L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-2L) + "'", long12 == (-2L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-00:00:00.001" + "'", str33, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 5700035L + "'", long37 == 5700035L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 35999950L + "'", long39 == 35999950L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-47279947L) + "'", long41 == (-47279947L));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        java.lang.String str12 = dateTimeZone3.getShortName(53L);
        long long14 = dateTimeZone3.previousTransition((long) '#');
        long long16 = dateTimeZone3.convertUTCToLocal((-3599948L));
        long long19 = dateTimeZone3.convertLocalToUTC(35L, true);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.lang.String str22 = dateTimeZone21.getID();
        long long24 = dateTimeZone21.previousTransition((-1L));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 10, true);
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = dateTimeZone21.getOffset(readableInstant28);
        int int31 = dateTimeZone21.getOffset(5699999L);
        long long33 = dateTimeZone3.getMillisKeepLocal(dateTimeZone21, (long) 36000000);
        long long36 = dateTimeZone3.adjustOffset((-75599900L), false);
        boolean boolean38 = dateTimeZone3.isStandardOffset(39599848L);
        long long40 = dateTimeZone3.convertUTCToLocal((-7140101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599949L) + "'", long16 == (-3599949L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 36L + "'", long19 == 36L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 11L + "'", long27 == 11L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 36000000L + "'", long33 == 36000000L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-75599900L) + "'", long36 == (-75599900L));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-7140102L) + "'", long40 == (-7140102L));
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((-25199990L));
        long long5 = dateTimeZone1.previousTransition((-3599948L));
        int int7 = dateTimeZone1.getOffset((-30900001L));
        long long9 = dateTimeZone1.convertUTCToLocal((-35999941L));
        long long12 = dateTimeZone1.convertLocalToUTC((-24180000L), true);
        java.lang.Object obj13 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-25199990L) + "'", long3 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3599948L) + "'", long5 == (-3599948L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-32399941L) + "'", long9 == (-32399941L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-27780000L) + "'", long12 == (-27780000L));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
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
        java.lang.String str17 = dateTimeZone3.getName(1L, locale16);
        java.lang.String str18 = dateTimeZone3.toString();
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        long long24 = dateTimeZone20.getMillisKeepLocal(dateTimeZone22, (long) 'a');
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone20.getName((long) (short) 1, locale26);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        java.lang.String str30 = dateTimeZone20.getName((long) 10);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        long long36 = dateTimeZone32.getMillisKeepLocal(dateTimeZone34, (long) 'a');
        int int38 = dateTimeZone34.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone39 = dateTimeZone34.toTimeZone();
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone34.getShortName((long) (byte) 100, locale41);
        java.lang.String str43 = dateTimeZone34.toString();
        long long45 = dateTimeZone20.getMillisKeepLocal(dateTimeZone34, 0L);
        java.util.TimeZone timeZone46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        long long51 = dateTimeZone47.getMillisKeepLocal(dateTimeZone49, (long) 'a');
        boolean boolean52 = dateTimeZone47.isFixed();
        java.lang.String str53 = dateTimeZone47.toString();
        boolean boolean54 = dateTimeZone20.equals((java.lang.Object) str53);
        org.joda.time.ReadableInstant readableInstant55 = null;
        int int56 = dateTimeZone20.getOffset(readableInstant55);
        java.util.TimeZone timeZone57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        long long61 = dateTimeZone58.adjustOffset((long) 1, false);
        long long63 = dateTimeZone20.getMillisKeepLocal(dateTimeZone58, 33L);
        long long65 = dateTimeZone20.previousTransition(5700032L);
        long long67 = dateTimeZone3.getMillisKeepLocal(dateTimeZone20, 36000001L);
        org.joda.time.ReadableInstant readableInstant68 = null;
        int int69 = dateTimeZone20.getOffset(readableInstant68);
        long long71 = dateTimeZone20.previousTransition(0L);
        java.lang.String str73 = dateTimeZone20.getShortName((-32399947L));
        int int75 = dateTimeZone20.getStandardOffset((-50399948L));
        boolean boolean77 = dateTimeZone20.equals((java.lang.Object) (-21600089L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-00:00:00.001" + "'", str30, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 97L + "'", long36 == 97L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-00:00:00.001" + "'", str42, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-00:00:00.001" + "'", str43, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 97L + "'", long51 == 97L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "-00:00:00.001" + "'", str53, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 33L + "'", long63 == 33L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 5700032L + "'", long65 == 5700032L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 36000001L + "'", long67 == 36000001L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "-00:00:00.001" + "'", str73, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        long long3 = dateTimeZone1.convertUTCToLocal((-25199989L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 0L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone5.getName((-30299901L), locale9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone5.isLocalDateTimeGap(localDateTime11);
        java.lang.Object obj13 = dateTimeZone5.writeReplace();
        long long15 = dateTimeZone5.nextTransition(30300000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-25199989L) + "'", long3 == (-25199989L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-100L) + "'", long7 == (-100L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 30300000L + "'", long15 == 30300000L);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 24124000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone3.getMillisKeepLocal(dateTimeZone5, (long) 'a');
        boolean boolean8 = dateTimeZone3.isFixed();
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 11L);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 12L + "'", long10 == 12L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getOffset((-25199899L));
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        long long9 = dateTimeZone1.previousTransition(39660000L);
        java.lang.String str10 = dateTimeZone1.getID();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-59699847L), locale12);
        long long15 = dateTimeZone1.previousTransition((-2039999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 39660000L + "'", long9 == 39660000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-2039999L) + "'", long15 == (-2039999L));
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str5 = dateTimeZone1.getShortName((long) (-1));
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int9 = dateTimeZone1.getOffsetFromLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone11.getOffset(readableInstant12);
        int int15 = dateTimeZone11.getOffset((-25199899L));
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone11.isLocalDateTimeGap(localDateTime16);
        java.lang.String str18 = dateTimeZone11.getID();
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone11.getName(36000033L, locale20);
        long long24 = dateTimeZone11.adjustOffset((-25199947L), true);
        boolean boolean25 = dateTimeZone1.equals((java.lang.Object) true);
        boolean boolean27 = dateTimeZone1.equals((java.lang.Object) (-5700000L));
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = dateTimeZone1.getOffset(readableInstant28);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone1.getShortName(2100050L, locale31);
        boolean boolean34 = dateTimeZone1.isStandardOffset((-1570079224001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-25199947L) + "'", long24 == (-25199947L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getName(33L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        boolean boolean11 = dateTimeZone1.isFixed();
        boolean boolean12 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        int int5 = dateTimeZone1.getOffset((-25200000L));
        java.lang.String str7 = dateTimeZone1.getNameKey((-35999965L));
        int int9 = dateTimeZone1.getOffsetFromLocal((-24599963L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+07:00");
        long long3 = dateTimeZone1.nextTransition(36000032L);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 36000032L + "'", long3 == 36000032L);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+07:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) '4', locale8);
        java.lang.String str10 = dateTimeZone1.toString();
        boolean boolean11 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (long) 3660000);
        boolean boolean17 = dateTimeZone13.isStandardOffset((long) (byte) 10);
        java.lang.Object obj18 = dateTimeZone13.writeReplace();
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 59999L + "'", long15 == 59999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+01:00");
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.toString();
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone9.getOffset(readableInstant11);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (long) 0);
        long long18 = dateTimeZone9.convertLocalToUTC((-25199948L), false, (long) (byte) 0);
        java.lang.String str19 = dateTimeZone9.toString();
        int int21 = dateTimeZone9.getOffset(52L);
        int int23 = dateTimeZone9.getOffsetFromLocal((long) '#');
        long long25 = dateTimeZone9.convertUTCToLocal(11L);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider27 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider27);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider27);
        java.lang.Class<?> wildcardClass30 = nameProvider27.getClass();
        boolean boolean31 = dateTimeZone26.equals((java.lang.Object) nameProvider27);
        java.lang.Object obj32 = dateTimeZone26.writeReplace();
        java.lang.String str33 = dateTimeZone26.toString();
        int int35 = dateTimeZone26.getOffsetFromLocal((-2L));
        boolean boolean36 = dateTimeZone26.isFixed();
        java.lang.String str37 = dateTimeZone26.toString();
        long long39 = dateTimeZone26.convertUTCToLocal(60001L);
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone26.getShortName(35999902L, locale41);
        long long44 = dateTimeZone9.getMillisKeepLocal(dateTimeZone26, 16440099L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11L + "'", long7 == 11L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-25199947L) + "'", long18 == (-25199947L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(nameProvider27);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 60001L + "'", long39 == 60001L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 16440098L + "'", long44 == 16440098L);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        long long4 = dateTimeZone1.convertUTCToLocal((long) (-1));
        java.lang.Object obj5 = dateTimeZone1.writeReplace();
        long long7 = dateTimeZone1.convertUTCToLocal((-30299900L));
        boolean boolean8 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-2L) + "'", long4 == (-2L));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-30299901L) + "'", long7 == (-30299901L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean7 = dateTimeZone1.isStandardOffset((-25200000L));
        java.lang.String str9 = dateTimeZone1.getName(97L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        long long13 = dateTimeZone1.convertUTCToLocal((-56099848L));
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        java.lang.String str16 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-56099849L) + "'", long13 == (-56099849L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        long long10 = dateTimeZone1.previousTransition((-1570084924000L));
        long long12 = dateTimeZone1.previousTransition((-25199947L));
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        java.lang.String str16 = dateTimeZone1.getName((-2L));
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone1.getShortName((-25199947L), locale18);
        long long22 = dateTimeZone1.adjustOffset(3600000L, true);
        java.lang.String str23 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924000L) + "'", long10 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-25199947L) + "'", long12 == (-25199947L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3600000L + "'", long22 == 3600000L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        java.lang.Class<?> wildcardClass7 = nameProvider4.getClass();
        boolean boolean8 = dateTimeZone3.equals((java.lang.Object) nameProvider4);
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (byte) 100);
        java.lang.String str11 = dateTimeZone3.getID();
        java.lang.String str12 = dateTimeZone3.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
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
        java.lang.String str17 = dateTimeZone3.getName(1L, locale16);
        boolean boolean19 = dateTimeZone3.equals((java.lang.Object) "hi!");
        java.util.TimeZone timeZone20 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone21 = dateTimeZone3.toTimeZone();
        java.lang.String str22 = dateTimeZone3.getID();
        int int24 = dateTimeZone3.getOffsetFromLocal((-35999952L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone3.getName((long) (short) 0, locale12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone3.getOffset(readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone3.getOffset(readableInstant16);
        java.util.TimeZone timeZone18 = dateTimeZone3.toTimeZone();
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone3.getOffset(readableInstant19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        int int7 = dateTimeZone1.getOffset((long) (short) 100);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) (byte) 10);
        int int11 = dateTimeZone1.getOffset(32L);
        long long13 = dateTimeZone1.convertUTCToLocal(0L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName((-81299847L), locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider1 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        java.lang.Class<?> wildcardClass4 = nameProvider1.getClass();
        boolean boolean5 = dateTimeZone0.equals((java.lang.Object) nameProvider1);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) 'a');
        long long10 = dateTimeZone0.previousTransition((-35940001L));
        long long14 = dateTimeZone0.convertLocalToUTC(25200101L, true, (-14399949L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(nameProvider1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-35940001L) + "'", long10 == (-35940001L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 25200101L + "'", long14 == 25200101L);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
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
        int int25 = dateTimeZone18.getOffset((long) (short) 1);
        java.lang.String str27 = dateTimeZone18.getShortName(53L);
        java.lang.String str29 = dateTimeZone18.getNameKey(1L);
        long long31 = dateTimeZone3.getMillisKeepLocal(dateTimeZone18, (-61199947L));
        java.lang.String str32 = dateTimeZone18.getID();
        java.util.TimeZone timeZone33 = dateTimeZone18.toTimeZone();
        boolean boolean34 = dateTimeZone18.isFixed();
        org.joda.time.ReadableInstant readableInstant35 = null;
        int int36 = dateTimeZone18.getOffset(readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        int int38 = dateTimeZone18.getOffset(readableInstant37);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long43 = dateTimeZone40.adjustOffset((long) (short) 1, false);
        long long47 = dateTimeZone40.convertLocalToUTC((long) '#', false, (-25200000L));
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        java.util.TimeZone timeZone50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        long long53 = dateTimeZone49.getMillisKeepLocal(dateTimeZone51, (long) 'a');
        java.util.Locale locale55 = null;
        java.lang.String str56 = dateTimeZone49.getName((long) (short) 1, locale55);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone49);
        long long60 = dateTimeZone49.adjustOffset((long) (short) 10, true);
        java.lang.Object obj61 = dateTimeZone49.writeReplace();
        int int63 = dateTimeZone49.getStandardOffset((long) (-1));
        int int65 = dateTimeZone49.getStandardOffset((-1570084924000L));
        long long69 = dateTimeZone49.convertLocalToUTC(0L, false, (long) 10);
        boolean boolean71 = dateTimeZone49.equals((java.lang.Object) (byte) -1);
        boolean boolean72 = dateTimeZone49.isFixed();
        long long75 = dateTimeZone49.adjustOffset(34L, true);
        long long77 = dateTimeZone40.getMillisKeepLocal(dateTimeZone49, (-1570060800001L));
        long long79 = dateTimeZone18.getMillisKeepLocal(dateTimeZone49, (-25199947L));
        int int81 = dateTimeZone18.getOffset((-1570064399998L));
        java.util.Locale locale83 = null;
        java.lang.String str84 = dateTimeZone18.getShortName((-23159898L), locale83);
        long long88 = dateTimeZone18.convertLocalToUTC((-52L), true, 5699932L);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-61199947L) + "'", long31 == (-61199947L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 34L + "'", long47 == 34L);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 97L + "'", long53 == 97L);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "-00:00:00.001" + "'", str56, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 10L + "'", long60 == 10L);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 34L + "'", long75 == 34L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-1570060799999L) + "'", long77 == (-1570060799999L));
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-25199947L) + "'", long79 == (-25199947L));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "-00:00:00.001" + "'", str84, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + (-51L) + "'", long88 == (-51L));
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((long) '4', true);
        long long8 = dateTimeZone1.convertLocalToUTC(25200100L, false, 0L);
        long long10 = dateTimeZone1.nextTransition((long) 'a');
        long long13 = dateTimeZone1.convertLocalToUTC((-47L), false);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        java.util.TimeZone timeZone16 = dateTimeZone1.toTimeZone();
        int int18 = dateTimeZone1.getOffsetFromLocal(2100035L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25200100L + "'", long8 == 25200100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-47L) + "'", long13 == (-47L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long5 = dateTimeZone1.nextTransition((-50399948L));
        int int7 = dateTimeZone1.getOffsetFromLocal(52L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-50399847L), locale9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName((-35999948L), locale12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long17 = dateTimeZone15.previousTransition((long) (short) 100);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        long long23 = dateTimeZone19.getMillisKeepLocal(dateTimeZone21, (long) 'a');
        boolean boolean25 = dateTimeZone19.isStandardOffset((-25200000L));
        java.lang.String str26 = dateTimeZone19.toString();
        long long28 = dateTimeZone15.getMillisKeepLocal(dateTimeZone19, (-25199900L));
        boolean boolean29 = dateTimeZone15.isFixed();
        long long32 = dateTimeZone15.convertLocalToUTC((-49L), true);
        java.util.TimeZone timeZone33 = dateTimeZone15.toTimeZone();
        long long35 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, (-61259899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-50399948L) + "'", long5 == (-50399948L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-00:00:00.001" + "'", str26, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-25199899L) + "'", long28 == (-25199899L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-49L) + "'", long32 == (-49L));
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-61259900L) + "'", long35 == (-61259900L));
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-36599898L), locale4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        java.lang.String str3 = dateTimeZone1.getShortName((-49L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int6 = dateTimeZone1.getOffsetFromLocal((-25199899L));
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        long long10 = dateTimeZone1.nextTransition((-61199895L));
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        long long14 = dateTimeZone1.convertUTCToLocal((-3540001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:00" + "'", str3, "+10:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36000000 + "'", int6 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-61199895L) + "'", long10 == (-61199895L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36000000 + "'", int12 == 36000000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32459999L + "'", long14 == 32459999L);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) '4', locale8);
        java.lang.String str10 = dateTimeZone1.toString();
        java.lang.String str12 = dateTimeZone1.getShortName(25200100L);
        boolean boolean14 = dateTimeZone1.isStandardOffset((long) (byte) -1);
        long long17 = dateTimeZone1.convertLocalToUTC((-25199999L), false);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone1.getOffset(readableInstant18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:00" + "'", str10, "+10:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-61199999L) + "'", long17 == (-61199999L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36000000 + "'", int19 == 36000000);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getName((long) 10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone13.getMillisKeepLocal(dateTimeZone15, (long) 'a');
        int int19 = dateTimeZone15.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone20 = dateTimeZone15.toTimeZone();
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone15.getShortName((long) (byte) 100, locale22);
        java.lang.String str24 = dateTimeZone15.toString();
        long long26 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, 0L);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone1.getName((long) 25200000, locale28);
        java.lang.String str30 = dateTimeZone1.toString();
        long long34 = dateTimeZone1.convertLocalToUTC(5700035L, false, 9L);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str38 = dateTimeZone36.getNameKey(1L);
        java.lang.String str40 = dateTimeZone36.getNameKey(35L);
        long long42 = dateTimeZone1.getMillisKeepLocal(dateTimeZone36, 36000032L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone36);
        java.lang.String str45 = dateTimeZone36.getNameKey((-25199946L));
        java.lang.String str46 = dateTimeZone36.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36000000 + "'", int19 == 36000000);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+10:00" + "'", str23, "+10:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+10:00" + "'", str24, "+10:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+10:00" + "'", str29, "+10:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+10:00" + "'", str30, "+10:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-30299965L) + "'", long34 == (-30299965L));
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 72000033L + "'", long42 == 72000033L);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "-00:00:00.001" + "'", str46, "-00:00:00.001");
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long6 = dateTimeZone4.previousTransition((long) (short) 100);
        java.util.TimeZone timeZone7 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        boolean boolean9 = dateTimeZone2.equals((java.lang.Object) dateTimeZone8);
        java.lang.String str11 = dateTimeZone2.getName(35999999L);
        java.lang.Object obj12 = dateTimeZone2.writeReplace();
        java.lang.String str14 = dateTimeZone2.getShortName((-84899847L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider1 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        java.lang.Class<?> wildcardClass4 = nameProvider1.getClass();
        boolean boolean5 = dateTimeZone0.equals((java.lang.Object) nameProvider1);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        java.lang.String str8 = dateTimeZone0.getNameKey((-35999965L));
        long long10 = dateTimeZone0.previousTransition((-25199990L));
        long long13 = dateTimeZone0.convertLocalToUTC(0L, false);
        java.lang.String str15 = dateTimeZone0.getShortName((-3599947L));
        boolean boolean16 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(nameProvider1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-25199990L) + "'", long10 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }
}
