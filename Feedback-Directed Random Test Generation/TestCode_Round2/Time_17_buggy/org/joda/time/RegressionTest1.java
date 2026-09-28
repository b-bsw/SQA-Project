package org.joda.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(60000, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        boolean boolean39 = false; // flaky "1) test0503(org.joda.time.RegressionTest1)": dateTimeZone37.isLocalDateTimeGap(localDateTime38);
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
// flaky "1) test0503(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
// flaky "1) test0503(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky "1) test0503(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "1) test0503(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone24);
// flaky "1) test0503(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "1) test0503(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky "1) test0503(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
// flaky "1) test0503(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky "1) test0503(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
// flaky "1) test0503(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 35L + "'", long43 == 35L);
// flaky "1) test0503(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
// flaky "1) test0503(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-36000000L) + "'", long47 == (-36000000L));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 3660035L + "'", long52 == 3660035L);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
// flaky "2) test0504(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
// flaky "2) test0504(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
// flaky "2) test0504(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
// flaky "2) test0504(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
// flaky "2) test0504(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(timeZone21);
// flaky "2) test0504(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "2) test0504(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-35999990L) + "'", long24 == (-35999990L));
// flaky "2) test0504(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 89520001L + "'", long26 == 89520001L);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
// flaky "3) test0505(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "3) test0505(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "3) test0505(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "3) test0505(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
// flaky "3) test0505(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
// flaky "3) test0505(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200052L + "'", long16 == 25200052L);
        org.junit.Assert.assertNotNull(obj17);
// flaky "3) test0505(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
// flaky "3) test0505(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
// flaky "4) test0507(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "4) test0507(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "4) test0507(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "4) test0507(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "4) test0507(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
// flaky "5) test0508(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// flaky "5) test0508(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35999999L + "'", long28 == 35999999L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+10:00" + "'", str30, "+10:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-90L) + "'", long32 == (-90L));
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        int int3 = dateTimeZone1.getOffset((long) '4');
        java.lang.String str5 = dateTimeZone1.getName(60001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+100:10");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+100:10\" is malformed at \"0:10\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
// flaky "6) test0512(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
// flaky "6) test0512(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "5) test0512(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199999L + "'", long10 == 25199999L);
// flaky "5) test0512(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky "5) test0512(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "4) test0512(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone24);
// flaky "4) test0512(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeZone26);
// flaky "4) test0512(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
// flaky "2) test0512(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
// flaky "7) test0513(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "7) test0513(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 39600000L + "'", long11 == 39600000L);
// flaky "6) test0513(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky "6) test0513(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-99L) + "'", long15 == (-99L));
// flaky "6) test0513(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC((-115799899L), true, 36000100L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "8) test0514(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
// flaky "8) test0514(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "7) test0514(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115799900L) + "'", long8 == (-115799900L));
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "7) test0514(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        long long7 = dateTimeZone1.convertLocalToUTC((long) ' ', false, (-25740001L));
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 33L + "'", long7 == 33L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
// flaky "9) test0521(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11L + "'", long10 == 11L);
// flaky "9) test0521(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky "8) test0521(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
// flaky "8) test0521(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
// flaky "10) test0522(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "10) test0522(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
// flaky "9) test0522(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
// flaky "11) test0523(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "11) test0523(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj10);
// flaky "10) test0523(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
// flaky "9) test0523(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570120924112L) + "'", long17 == (-1570120924112L));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 115800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
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
// flaky "12) test0526(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-3660001L) + "'", long21 == (-3660001L));
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        java.lang.String str26 = dateTimeZone3.getNameKey((-35999848L));
        long long28 = dateTimeZone3.previousTransition(25199900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "13) test0527(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "12) test0527(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "11) test0527(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
// flaky "10) test0527(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
// flaky "7) test0527(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 33L + "'", long20 == 33L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky "5) test0527(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 99L + "'", long24 == 99L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 25199900L + "'", long28 == 25199900L);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        long long19 = dateTimeZone3.adjustOffset(36000001L, false);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone3.isLocalDateTimeGap(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "14) test0528(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "13) test0528(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 36000001L + "'", long19 == 36000001L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        int int6 = dateTimeZone1.getOffset((long) 115800000);
        int int8 = dateTimeZone1.getStandardOffset((-35999968L));
        long long10 = dateTimeZone1.nextTransition(479399901L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 479399901L + "'", long10 == 479399901L);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        int int32 = dateTimeZone6.getOffsetFromLocal((-1570120984201L));
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone6.getName(2100002L, locale34);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
// flaky "15) test0531(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
// flaky "14) test0531(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
// flaky "12) test0531(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
// flaky "11) test0531(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
// flaky "8) test0531(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115799900L + "'", long27 == 115799900L);
// flaky "6) test0531(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
// flaky "5) test0531(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
// flaky "5) test0531(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.001" + "'", str35, "+00:00:00.001");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.previousTransition((long) (short) 1);
        java.lang.String str10 = dateTimeZone1.getNameKey((-99L));
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115800000);
        java.lang.String str13 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "16) test0532(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "15) test0532(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str10);
// flaky "13) test0532(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky "12) test0532(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str8 = dateTimeZone1.getShortName(115800002L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        long long11 = dateTimeZone1.previousTransition((-1L));
        long long14 = dateTimeZone1.adjustOffset(3660010L, true);
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "17) test0533(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "16) test0533(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3660010L + "'", long14 == 3660010L);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str3 = dateTimeZone1.getShortName(83400000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:00" + "'", str3, "+32:00");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        int int23 = dateTimeZone1.getOffsetFromLocal((long) 0);
        java.lang.Class<?> wildcardClass24 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "18) test0535(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "17) test0535(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
// flaky "14) test0535(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
// flaky "13) test0535(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.001" + "'", str21, "+00:00:00.001");
// flaky "9) test0535(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        java.lang.String str9 = dateTimeZone1.getShortName(100L);
        boolean boolean11 = dateTimeZone1.isStandardOffset((-115799999L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "19) test0536(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky "18) test0536(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.previousTransition(25200000L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25200000L + "'", long5 == 25200000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) 360600001L);
        int int11 = dateTimeZone1.getOffsetFromLocal(63L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "20) test0538(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "19) test0538(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        boolean boolean7 = dateTimeZone1.isFixed();
        boolean boolean8 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        boolean boolean11 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "21) test0539(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
// flaky "20) test0539(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
// flaky "15) test0539(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        boolean boolean22 = dateTimeZone1.isStandardOffset(3599899L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "22) test0540(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
// flaky "21) test0540(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570084924101L) + "'", long12 == (-1570084924101L));
// flaky "16) test0540(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
// flaky "14) test0540(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str18 = dateTimeZone1.getNameKey(200L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "23) test0541(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
// flaky "22) test0541(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
// flaky "17) test0541(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) ' ', locale4);
        boolean boolean7 = dateTimeZone1.isStandardOffset(36000001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360600000);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 52);
        long long7 = dateTimeZone1.convertLocalToUTC((long) 25200000, true, (-1570012924001L));
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-335400000L) + "'", long7 == (-335400000L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 360600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 10);
        boolean boolean4 = dateTimeZone2.isStandardOffset(36000100L);
        long long6 = dateTimeZone2.nextTransition(39599999L);
        int int8 = dateTimeZone2.getStandardOffset((-25200101L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 39599999L + "'", long6 == 39599999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 360600000 + "'", int8 == 360600000);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long7 = dateTimeZone4.convertLocalToUTC((-1570012924100L), true);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone4.getShortName((-151200005L), locale9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570012924100L) + "'", long7 == (-1570012924100L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.convertUTCToLocal(72000000L);
        long long10 = dateTimeZone1.nextTransition((long) (-1));
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        java.lang.String str14 = dateTimeZone1.getName(60032L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 71999999L + "'", long8 == 71999999L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        long long18 = dateTimeZone6.adjustOffset((long) (short) -1, false);
        long long21 = dateTimeZone6.adjustOffset(61200002L, true);
        java.lang.Class<?> wildcardClass22 = dateTimeZone6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "24) test0550(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+52:00" + "'", str13, "+52:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 61200002L + "'", long21 == 61200002L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str26 = dateTimeZone24.getShortName((-25200001L));
        java.lang.Object obj27 = dateTimeZone24.writeReplace();
        boolean boolean28 = dateTimeZone14.equals((java.lang.Object) dateTimeZone24);
        long long30 = dateTimeZone24.nextTransition(3599899L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "25) test0551(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "23) test0551(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
// flaky "18) test0551(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 187200000 + "'", int10 == 187200000);
// flaky "15) test0551(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 187200000 + "'", int12 == 187200000);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
// flaky "10) test0551(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 187200002L + "'", long23 == 187200002L);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3599899L + "'", long30 == 3599899L);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str11 = dateTimeZone10.getID();
        int int13 = dateTimeZone10.getStandardOffset((-35999999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "26) test0552(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "24) test0552(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "19) test0552(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        long long10 = dateTimeZone1.nextTransition(97L);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "27) test0553(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 187200000 + "'", int5 == 187200000);
// flaky "25) test0553(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+52:00" + "'", str8, "+52:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        long long8 = dateTimeZone1.previousTransition(97L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((long) 35, locale10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long16 = dateTimeZone13.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone13.getOffset(readableInstant18);
        long long21 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, 100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "28) test0554(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 187200000 + "'", int5 == 187200000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
// flaky "26) test0554(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+52:00" + "'", str11, "+52:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-99L) + "'", long16 == (-99L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
// flaky "20) test0554(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 187200000L + "'", long21 == 187200000L);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long10 = dateTimeZone1.convertLocalToUTC((-1L), false, (long) '#');
        java.lang.String str11 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        java.lang.String str14 = dateTimeZone1.getID();
        boolean boolean16 = dateTimeZone1.isStandardOffset(3599899L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (-1570197064001L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570200663901L) + "'", long11 == (-1570200663901L));
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, 0);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName((-1570200724101L));
        long long8 = dateTimeZone1.nextTransition((-1570084924045L));
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName(90060000L, locale10);
        boolean boolean13 = dateTimeZone1.isStandardOffset((-10800101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1570084924045L) + "'", long8 == (-1570084924045L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.lang.Object obj5 = dateTimeZone2.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long8 = dateTimeZone2.nextTransition(89520001L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 89520001L + "'", long8 == 89520001L);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+32:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+32:00\" is malformed at \"32:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        long long13 = dateTimeZone1.adjustOffset(2L, true);
        java.lang.String str14 = dateTimeZone1.toString();
        java.lang.String str16 = dateTimeZone1.getShortName(132L);
        long long19 = dateTimeZone1.adjustOffset((-1570084984101L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1570084984101L) + "'", long19 == (-1570084984101L));
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        java.util.TimeZone timeZone25 = dateTimeZone3.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "29) test0562(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "27) test0562(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "21) test0562(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "16) test0562(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "11) test0562(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
// flaky "7) test0562(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
// flaky "6) test0562(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky "6) test0562(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertNotNull(timeZone25);
// flaky "3) test0562(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        long long13 = dateTimeZone1.adjustOffset(2L, true);
        java.lang.String str14 = dateTimeZone1.toString();
        int int16 = dateTimeZone1.getOffset(79260052L);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone1.isLocalDateTimeGap(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        long long11 = dateTimeZone1.convertLocalToUTC((-1570084924101L), true);
        int int13 = dateTimeZone1.getOffsetFromLocal((-25200001L));
        long long15 = dateTimeZone1.convertUTCToLocal((-1570084924000L));
        boolean boolean16 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "30) test0564(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
// flaky "28) test0564(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924101L) + "'", long11 == (-1570084924101L));
// flaky "22) test0564(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "17) test0564(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924000L) + "'", long15 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        boolean boolean20 = dateTimeZone18.isStandardOffset(110L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "31) test0565(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
// flaky "29) test0565(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25200001L) + "'", long16 == (-25200001L));
        org.junit.Assert.assertNotNull(timeZone17);
// flaky "23) test0565(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        java.lang.String str10 = dateTimeZone1.getName(96L);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 10);
        long long5 = dateTimeZone2.adjustOffset((-1569969124103L), false);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getShortName(3660101L, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1569969124103L) + "'", long5 == (-1569969124103L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:10" + "'", str8, "+32:10");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, 349200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 349200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        long long8 = dateTimeZone1.previousTransition(97L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((long) 35, locale10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long16 = dateTimeZone13.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone13.getOffset(readableInstant18);
        long long21 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, 100L);
        long long25 = dateTimeZone13.convertLocalToUTC((-115259968L), true, (long) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "32) test0569(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
// flaky "30) test0569(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-99L) + "'", long16 == (-99L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
// flaky "24) test0569(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-115260068L) + "'", long25 == (-115260068L));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getOffset((long) (short) 100);
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long3 = dateTimeZone1.convertUTCToLocal((long) 25200000);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) ' ');
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25200052L + "'", long3 == 25200052L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        java.lang.String str34 = dateTimeZone1.getShortName((long) '4');
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.100" + "'", str34, "+00:00:00.100");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((-1570084924200L), locale8);
        int int11 = dateTimeZone1.getStandardOffset(112139999L);
        long long14 = dateTimeZone1.adjustOffset((-1570164724101L), false);
        java.lang.String str16 = dateTimeZone1.getShortName(187200001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1570164724101L) + "'", long14 == (-1570164724101L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        java.lang.Class<?> wildcardClass21 = dateTimeZone3.getClass();
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-90600100L) + "'", long20 == (-90600100L));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone1.getShortName(115260050L, locale21);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-100L) + "'", long19 == (-100L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.lang.Object obj5 = dateTimeZone2.writeReplace();
        java.lang.String str7 = dateTimeZone2.getName((-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+10:00" + "'", str7, "+10:00");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        int int3 = dateTimeZone1.getStandardOffset(119400101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-1570084924101L), locale8);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int13 = dateTimeZone1.getStandardOffset((-1570192924001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        java.lang.String str34 = dateTimeZone1.getShortName(115800197L);
        java.lang.Class<?> wildcardClass35 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570084924101L) + "'", long26 == (-1570084924101L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.100" + "'", str34, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        long long22 = dateTimeZone3.previousTransition((-1570120864101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "33) test0581(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "31) test0581(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 98L + "'", long17 == 98L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1570120864101L) + "'", long22 == (-1570120864101L));
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        java.lang.String str8 = dateTimeZone1.getName((-1570084924101L));
        long long10 = dateTimeZone1.previousTransition((long) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        long long34 = dateTimeZone1.adjustOffset(115260002L, false);
        java.util.TimeZone timeZone35 = dateTimeZone1.toTimeZone();
        int int37 = dateTimeZone1.getStandardOffset((long) 360600000);
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 115260002L + "'", long34 == 115260002L);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        long long17 = dateTimeZone10.adjustOffset(155400002L, false);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone10.getShortName((long) 2100000, locale19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 155400002L + "'", long17 == 155400002L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        long long22 = dateTimeZone3.convertLocalToUTC((-1570084924201L), false, 25200000L);
        long long25 = dateTimeZone3.convertLocalToUTC(0L, true);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 119400000L + "'", long18 == 119400000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1570084924200L) + "'", long22 == (-1570084924200L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(363120000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 10);
        long long6 = dateTimeZone2.convertLocalToUTC((-1569969664099L), true, 101L);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        int int14 = dateTimeZone10.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone15 = dateTimeZone10.toTimeZone();
        int int17 = dateTimeZone10.getOffset((long) (short) 1);
        long long21 = dateTimeZone10.convertLocalToUTC((long) 115800000, true, (-1570084924000L));
        long long23 = dateTimeZone2.getMillisKeepLocal(dateTimeZone10, (-1570084984045L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1570085464099L) + "'", long6 == (-1570085464099L));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
// flaky "34) test0588(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
// flaky "32) test0588(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
// flaky "25) test0588(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 115799900L + "'", long21 == 115799900L);
// flaky "18) test0588(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1569969184145L) + "'", long23 == (-1569969184145L));
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 0);
        long long4 = dateTimeZone2.nextTransition(83400000L);
        java.lang.Class<?> wildcardClass5 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 83400000L + "'", long4 == 83400000L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        java.lang.String str13 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "35) test0590(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
// flaky "33) test0590(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
// flaky "26) test0590(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
// flaky "19) test0590(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long4 = dateTimeZone1.nextTransition((-99L));
        boolean boolean5 = dateTimeZone1.isFixed();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName(115859999L, locale7);
        java.lang.String str10 = dateTimeZone1.getNameKey((-323999999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        int int15 = dateTimeZone3.getOffsetFromLocal((-1569969124101L));
        java.lang.String str16 = dateTimeZone3.toString();
        java.lang.String str18 = dateTimeZone3.getName((-1570156924001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "36) test0592(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "34) test0592(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertNull(str13);
// flaky "27) test0592(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
// flaky "20) test0592(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
// flaky "12) test0592(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        int int3 = dateTimeZone1.getOffset((long) (-1));
        boolean boolean5 = dateTimeZone1.isStandardOffset(10L);
        java.lang.String str6 = dateTimeZone1.getID();
        long long8 = dateTimeZone1.previousTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.035" + "'", str6, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        java.lang.Class<?> wildcardClass17 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long4 = dateTimeZone1.convertUTCToLocal((-126600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-126599965L) + "'", long4 == (-126599965L));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        int int8 = dateTimeZone1.getOffsetFromLocal(25200052L);
        java.lang.String str9 = dateTimeZone1.toString();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName((-1570200724100L), locale11);
        long long15 = dateTimeZone1.convertLocalToUTC((-61199901L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "37) test0596(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "35) test0596(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
// flaky "28) test0596(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
// flaky "21) test0596(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
// flaky "13) test0596(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-61200001L) + "'", long15 == (-61200001L));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        long long11 = dateTimeZone1.convertLocalToUTC((-1570084924101L), true);
        int int13 = dateTimeZone1.getOffsetFromLocal((-25200001L));
        long long15 = dateTimeZone1.convertUTCToLocal((-1570084924000L));
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getShortName((-35939969L), locale17);
        long long20 = dateTimeZone1.previousTransition(35999932L);
        java.lang.String str21 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "38) test0597(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
// flaky "36) test0597(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924201L) + "'", long11 == (-1570084924201L));
// flaky "29) test0597(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
// flaky "22) test0597(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084923900L) + "'", long15 == (-1570084923900L));
// flaky "14) test0597(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35999932L + "'", long20 == 35999932L);
// flaky "8) test0597(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        int int17 = dateTimeZone1.getOffsetFromLocal(115799900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "39) test0598(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
// flaky "37) test0598(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
// flaky "30) test0598(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
// flaky "23) test0598(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getStandardOffset((long) (short) 0);
        long long7 = dateTimeZone1.previousTransition((long) '#');
        int int9 = dateTimeZone1.getOffsetFromLocal(115799900L);
        long long11 = dateTimeZone1.convertUTCToLocal((-36000000L));
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "40) test0599(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
// flaky "38) test0599(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
// flaky "31) test0599(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-35999900L) + "'", long11 == (-35999900L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        boolean boolean14 = dateTimeZone12.isFixed();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone12.getName(360000000L, locale16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "41) test0600(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        java.lang.String str27 = dateTimeZone0.getNameKey((-1570156924001L));
        long long29 = dateTimeZone0.previousTransition(115859999L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
// flaky "42) test0601(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
// flaky "39) test0601(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
// flaky "32) test0601(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
// flaky "24) test0601(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
// flaky "15) test0601(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 115859999L + "'", long29 == 115859999L);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long15 = dateTimeZone12.convertLocalToUTC((-1570084924001L), false);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) long15);
        long long18 = dateTimeZone1.previousTransition((-91L));
        java.lang.String str20 = dateTimeZone1.getName((-1569969124201L));
        boolean boolean21 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924000L) + "'", long15 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-91L) + "'", long18 == (-91L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        long long8 = dateTimeZone1.previousTransition((-115799904L));
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "43) test0603(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
// flaky "40) test0603(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
// flaky "33) test0603(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115799904L) + "'", long8 == (-115799904L));
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        long long7 = dateTimeZone1.adjustOffset((long) 36000000, true);
        long long9 = dateTimeZone1.convertUTCToLocal((-1570517524001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "44) test0604(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
// flaky "41) test0604(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 36000000L + "'", long7 == 36000000L);
// flaky "34) test0604(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1570517523901L) + "'", long9 == (-1570517523901L));
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        long long13 = dateTimeZone1.adjustOffset(2L, true);
        java.lang.String str14 = dateTimeZone1.toString();
        int int16 = dateTimeZone1.getOffset(79260052L);
        int int18 = dateTimeZone1.getOffset(36000032L);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone1.getOffset(readableInstant19);
        java.lang.Class<?> wildcardClass21 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        java.lang.String str16 = dateTimeZone3.getName(60002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "45) test0606(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "42) test0606(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
// flaky "35) test0606(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
// flaky "25) test0606(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 'a');
        int int23 = dateTimeZone19.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone24 = dateTimeZone19.toTimeZone();
        java.util.TimeZone timeZone25 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        long long28 = dateTimeZone26.convertUTCToLocal((long) 36000000);
        long long31 = dateTimeZone26.adjustOffset((long) 35, false);
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = dateTimeZone26.getOffset(readableInstant32);
        boolean boolean34 = dateTimeZone1.equals((java.lang.Object) readableInstant32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "46) test0607(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
// flaky "43) test0607(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky "36) test0607(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999800L) + "'", long14 == (-35999800L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
// flaky "26) test0607(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 36000000L + "'", long28 == 36000000L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 35L + "'", long31 == 35L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        java.lang.String str16 = dateTimeZone3.getShortName(115800002L);
        int int18 = dateTimeZone3.getOffset((-1570517524101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "47) test0608(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "44) test0608(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "37) test0608(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
// flaky "27) test0608(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(35, 126060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 126060000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        long long26 = dateTimeZone1.adjustOffset((-223199802L), false);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-223199802L) + "'", long26 == (-223199802L));
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        java.lang.String str23 = dateTimeZone15.getNameKey((-35999898L));
        boolean boolean24 = dateTimeZone15.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "48) test0611(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
// flaky "45) test0611(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(obj11);
// flaky "38) test0611(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky "28) test0611(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25199999L + "'", long19 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.Class<?> wildcardClass3 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.nextTransition(25200052L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25200052L + "'", long5 == 25200052L);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-3660000));
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str4 = dateTimeZone1.getNameKey(71999999L);
        int int6 = dateTimeZone1.getOffsetFromLocal((-59904L));
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT-01:01");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3660000) + "'", int6 == (-3660000));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName(25200052L, locale8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((long) (byte) 0, locale11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "49) test0615(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "46) test0615(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
// flaky "39) test0615(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
// flaky "29) test0615(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long15 = dateTimeZone12.convertLocalToUTC((-1570084924001L), false);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) long15);
        long long18 = dateTimeZone1.previousTransition((-91L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone20 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924000L) + "'", long15 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-91L) + "'", long18 == (-91L));
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset(0L);
        int int7 = dateTimeZone1.getStandardOffset((-1570084924201L));
        boolean boolean9 = dateTimeZone1.isStandardOffset(99L);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        long long12 = dateTimeZone1.previousTransition(72000000L);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.String str15 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean17 = dateTimeZone14.isFixed();
        java.lang.String str18 = dateTimeZone14.toString();
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        long long24 = dateTimeZone20.getMillisKeepLocal(dateTimeZone22, (long) 'a');
        int int26 = dateTimeZone22.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone27 = dateTimeZone22.toTimeZone();
        java.util.TimeZone timeZone28 = dateTimeZone22.toTimeZone();
        long long30 = dateTimeZone22.nextTransition((long) 1);
        boolean boolean31 = dateTimeZone22.isFixed();
        long long35 = dateTimeZone22.convertLocalToUTC(119400000L, false, (long) 52);
        long long37 = dateTimeZone22.convertUTCToLocal((-91L));
        java.lang.String str39 = dateTimeZone22.getShortName(89519999L);
        boolean boolean40 = dateTimeZone14.equals((java.lang.Object) 89519999L);
        boolean boolean41 = dateTimeZone1.equals((java.lang.Object) dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 72000000L + "'", long12 == 72000000L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 119400001L + "'", long35 == 119400001L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-92L) + "'", long37 == (-92L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-00:00:00.001" + "'", str39, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getStandardOffset((long) (short) 0);
        long long7 = dateTimeZone1.previousTransition((long) '#');
        int int9 = dateTimeZone1.getOffsetFromLocal(115799900L);
        long long11 = dateTimeZone1.convertUTCToLocal((-36000000L));
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-36000001L) + "'", long11 == (-36000001L));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone3.isLocalDateTimeGap(localDateTime19);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        int int8 = dateTimeZone1.getOffsetFromLocal(25200052L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName(11L, locale10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone13.getMillisKeepLocal(dateTimeZone15, (long) 'a');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone13.getName((long) (short) 1, locale19);
        int int22 = dateTimeZone13.getOffset((long) 1);
        java.lang.Object obj23 = dateTimeZone13.writeReplace();
        java.lang.String str25 = dateTimeZone13.getShortName((-1570084924001L));
        long long28 = dateTimeZone13.adjustOffset((long) '#', false);
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone13.getOffset(readableInstant29);
        long long32 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, 35999899L);
        java.lang.String str33 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 35999899L + "'", long32 == 35999899L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-00:00:00.001" + "'", str33, "-00:00:00.001");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 0);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName((-1570084924053L), locale4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 10);
        long long6 = dateTimeZone2.convertLocalToUTC((-1569969664099L), true, 101L);
        int int8 = dateTimeZone2.getOffsetFromLocal((-1570084924101L));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        boolean boolean12 = dateTimeZone2.equals((java.lang.Object) timeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1570085464099L) + "'", long6 == (-1570085464099L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115800000 + "'", int8 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+10:00");
        long long3 = dateTimeZone1.nextTransition(97L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName(115799999L, locale5);
        java.lang.String str8 = dateTimeZone1.getShortName((-1570012924000L));
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "50) test0624(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
// flaky "47) test0624(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570084924101L) + "'", long12 == (-1570084924101L));
// flaky "40) test0624(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
// flaky "30) test0624(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertNull(str20);
// flaky "16) test0624(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.String str8 = dateTimeZone1.getShortName((long) (byte) 100);
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "51) test0625(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), 35);
        java.lang.Class<?> wildcardClass3 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long15 = dateTimeZone12.convertLocalToUTC((-1570084924001L), false);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) long15);
        long long18 = dateTimeZone1.previousTransition((-91L));
        java.lang.String str20 = dateTimeZone1.getName((-1569969124201L));
        java.lang.String str21 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924000L) + "'", long15 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-91L) + "'", long18 == (-91L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        boolean boolean5 = dateTimeZone1.equals((java.lang.Object) dateTimeZone4);
        java.lang.String str6 = dateTimeZone4.toString();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone4.getShortName(102L, locale8);
        long long11 = dateTimeZone4.convertUTCToLocal((-2100002L));
        java.lang.Class<?> wildcardClass12 = dateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:35" + "'", str6, "+00:35");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:35" + "'", str9, "+00:35");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-2L) + "'", long11 == (-2L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        long long26 = dateTimeZone15.convertLocalToUTC(25199952L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "52) test0629(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
// flaky "48) test0629(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj11);
// flaky "41) test0629(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky "31) test0629(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25199999L + "'", long19 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky "17) test0629(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 25199951L + "'", long26 == 25199951L);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone7.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone7.getOffset(readableInstant10);
        java.lang.Object obj12 = dateTimeZone7.writeReplace();
        int int14 = dateTimeZone7.getOffset((long) 1);
        boolean boolean15 = dateTimeZone7.isFixed();
        int int17 = dateTimeZone7.getStandardOffset((-1570012923999L));
        boolean boolean18 = dateTimeZone1.equals((java.lang.Object) int17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
// flaky "53) test0630(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
// flaky "49) test0630(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "42) test0630(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-1570084924101L), locale8);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        long long13 = dateTimeZone1.adjustOffset((-1570048924001L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "54) test0631(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "50) test0631(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570048924001L) + "'", long13 == (-1570048924001L));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-1570084924101L), locale8);
        java.lang.String str11 = dateTimeZone1.getNameKey((-36000000L));
        java.lang.String str12 = dateTimeZone1.toString();
        long long14 = dateTimeZone1.convertUTCToLocal(102L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "55) test0633(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "51) test0633(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertNull(str11);
// flaky "43) test0633(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
// flaky "32) test0633(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 103L + "'", long14 == 103L);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.lang.String str7 = dateTimeZone1.getID();
        java.lang.String str9 = dateTimeZone1.getShortName((long) 100);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        java.lang.String str12 = dateTimeZone1.getNameKey((-90059948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "56) test0634(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "52) test0634(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
// flaky "44) test0634(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((-1570084924200L), locale8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "57) test0635(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "53) test0635(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        java.lang.String str15 = dateTimeZone3.toString();
        boolean boolean17 = dateTimeZone3.isStandardOffset((-1570120923936L));
        java.lang.String str19 = dateTimeZone3.getNameKey((-1570048924046L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "58) test0636(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky "54) test0636(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky "45) test0636(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
// flaky "33) test0636(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        boolean boolean5 = dateTimeZone1.equals((java.lang.Object) dateTimeZone4);
        java.lang.String str6 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        long long15 = dateTimeZone1.previousTransition(3660101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "59) test0638(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "55) test0638(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
// flaky "46) test0638(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky "34) test0638(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "18) test0638(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3660101L + "'", long15 == 3660101L);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
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
        long long32 = dateTimeZone1.previousTransition(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "60) test0639(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
// flaky "56) test0639(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
// flaky "47) test0639(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky "35) test0639(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
// flaky "19) test0639(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115800000L + "'", long27 == 115800000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        long long59 = dateTimeZone6.nextTransition((-61140001L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
// flaky "61) test0640(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
// flaky "57) test0640(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
// flaky "48) test0640(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
// flaky "36) test0640(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
// flaky "20) test0640(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115799900L + "'", long27 == 115799900L);
// flaky "9) test0640(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
// flaky "7) test0640(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 3L + "'", long32 == 3L);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 115800000 + "'", int37 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 97L + "'", long43 == 97L);
// flaky "7) test0640(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.001" + "'", str46, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
// flaky "4) test0640(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1570084924098L) + "'", long50 == (-1570084924098L));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 36000000L + "'", long52 == 36000000L);
// flaky "2) test0640(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00:00.001" + "'", str55, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-61140001L) + "'", long59 == (-61140001L));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        java.lang.Class<?> wildcardClass39 = dateTimeZone1.getClass();
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
// flaky "62) test0641(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.001" + "'", str31, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
// flaky "58) test0641(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1570048924100L) + "'", long36 == (-1570048924100L));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone1.getShortName((-1570081264200L), locale20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "63) test0642(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
// flaky "59) test0642(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky "49) test0642(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2L) + "'", long14 == (-2L));
// flaky "37) test0642(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
// flaky "21) test0642(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
// flaky "10) test0642(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.001" + "'", str21, "+00:00:00.001");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        long long5 = dateTimeZone2.adjustOffset(103L, true);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-35999990L));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone2.isLocalDateTimeGap(localDateTime8);
        java.lang.String str11 = dateTimeZone2.getShortName(115260000L);
        java.lang.String str12 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 103L + "'", long5 == 103L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:35" + "'", str11, "+00:35");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:35" + "'", str12, "+00:35");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        long long5 = dateTimeZone0.adjustOffset((-1570200724100L), true);
        long long7 = dateTimeZone0.nextTransition((-61199901L));
        long long9 = dateTimeZone0.convertUTCToLocal((long) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570200724100L) + "'", long5 == (-1570200724100L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-61199901L) + "'", long7 == (-61199901L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(36000000);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(115800097L, locale3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.Object obj7 = dateTimeZone6.writeReplace();
        long long10 = dateTimeZone6.adjustOffset(36000000L, true);
        java.lang.String str12 = dateTimeZone6.getNameKey((-1570200724001L));
        java.lang.String str13 = dateTimeZone6.toString();
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) str13);
        int int16 = dateTimeZone1.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 36000000L + "'", long10 == 36000000L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.035" + "'", str13, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36000000 + "'", int16 == 36000000);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(35);
        long long4 = dateTimeZone1.adjustOffset((-1570200724001L), false);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName(35999932L, locale6);
        java.lang.String str8 = dateTimeZone1.getID();
        java.lang.String str10 = dateTimeZone1.getName(115320084L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570200724001L) + "'", long4 == (-1570200724001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+35:00" + "'", str7, "+35:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+35:00" + "'", str8, "+35:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+35:00" + "'", str10, "+35:00");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        long long18 = dateTimeZone6.adjustOffset((long) (short) -1, false);
        boolean boolean20 = dateTimeZone6.isStandardOffset(112139999L);
        java.lang.Class<?> wildcardClass21 = dateTimeZone6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "64) test0648(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        long long11 = dateTimeZone1.convertLocalToUTC((-1570048924002L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "65) test0649(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:10" + "'", str8, "+32:10");
// flaky "60) test0649(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570164724002L) + "'", long11 == (-1570164724002L));
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:01");
        long long4 = dateTimeZone1.adjustOffset((long) 'a', true);
        boolean boolean6 = dateTimeZone1.isStandardOffset((-51L));
        long long8 = dateTimeZone1.convertUTCToLocal((-115259900L));
        long long10 = dateTimeZone1.nextTransition(31L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115199900L) + "'", long8 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 31L + "'", long10 == 31L);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        int int3 = dateTimeZone1.getOffsetFromLocal((-1570084924101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3600000) + "'", int3 == (-3600000));
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str6 = dateTimeZone1.getShortName(2L);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str10 = dateTimeZone8.getNameKey((-1570012924100L));
        int int12 = dateTimeZone8.getOffset(1L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(35, 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str6 = dateTimeZone1.toString();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-1570085464099L), locale8);
        boolean boolean10 = dateTimeZone1.isFixed();
        boolean boolean11 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "66) test0654(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115800000 + "'", int5 == 115800000);
// flaky "61) test0654(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:10" + "'", str6, "+32:10");
// flaky "50) test0654(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:10" + "'", str9, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName(35999900L, locale15);
        boolean boolean17 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "67) test0655(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:10" + "'", str4, "+32:10");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "62) test0655(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-90600000L) + "'", long10 == (-90600000L));
// flaky "51) test0655(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-115799899L) + "'", long12 == (-115799899L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187200000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 35);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        long long7 = dateTimeZone1.convertUTCToLocal((-35999999L));
        boolean boolean8 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-35999998L) + "'", long7 == (-35999998L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        long long14 = dateTimeZone3.convertLocalToUTC((long) 115800000, true, (-1570084924000L));
        long long17 = dateTimeZone3.adjustOffset(60032L, false);
        long long19 = dateTimeZone3.convertUTCToLocal((-1570048923902L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115799999L + "'", long14 == 115799999L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 60032L + "'", long17 == 60032L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1570048923901L) + "'", long19 == (-1570048923901L));
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        java.lang.String str14 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        boolean boolean73 = dateTimeZone28.isStandardOffset((-90059948L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "68) test0662(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky "63) test0662(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone14);
// flaky "52) test0662(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "38) test0662(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
// flaky "22) test0662(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 25200052L + "'", long21 == 25200052L);
// flaky "11) test0662(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
// flaky "8) test0662(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 90059999L + "'", long26 == 90059999L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
// flaky "8) test0662(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
// flaky "5) test0662(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00" + "'", str39, "+00:00");
// flaky "3) test0662(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
// flaky "2) test0662(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 89520000L + "'", long44 == 89520000L);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 97L + "'", long50 == 97L);
// flaky "2) test0662(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(timeZone53);
// flaky "2) test0662(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone54);
// flaky "1) test0662(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "1) test0662(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:00" + "'", str57, "+00:00");
// flaky "1) test0662(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+00:00" + "'", str59, "+00:00");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 25200052L + "'", long61 == 25200052L);
// flaky "1) test0662(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "+00:00" + "'", str64, "+00:00");
// flaky "1) test0662(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+00:00" + "'", str67, "+00:00");
// flaky "1) test0662(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "+00:00" + "'", str70, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        long long11 = dateTimeZone1.convertLocalToUTC((-1570084924101L), true);
        int int13 = dateTimeZone1.getOffsetFromLocal((-25200001L));
        long long15 = dateTimeZone1.convertUTCToLocal((-1570084924000L));
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getShortName((-35939969L), locale17);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone1.getShortName((-1570012923999L), locale20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "69) test0663(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
// flaky "64) test0663(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924101L) + "'", long11 == (-1570084924101L));
// flaky "53) test0663(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "39) test0663(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924000L) + "'", long15 == (-1570084924000L));
// flaky "23) test0663(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
// flaky "12) test0663(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        long long14 = dateTimeZone1.convertLocalToUTC(2100001L, true);
        java.lang.String str16 = dateTimeZone1.getName((-1570517524001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "70) test0664(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
// flaky "65) test0664(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "54) test0664(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "40) test0664(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2100001L + "'", long14 == 2100001L);
// flaky "24) test0664(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.lang.String str6 = dateTimeZone1.getNameKey(0L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((-115259999L), locale8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "71) test0665(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "66) test0665(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
// flaky "55) test0665(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        long long6 = dateTimeZone1.previousTransition((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((-25200001L));
        java.lang.String str3 = dateTimeZone0.getID();
        long long7 = dateTimeZone0.convertLocalToUTC((-1570012923999L), false, 103L);
        java.lang.String str9 = dateTimeZone0.getShortName((-1569969124100L));
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getShortName(89520051L, locale11);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570012923999L) + "'", long7 == (-1570012923999L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long3 = dateTimeZone1.convertUTCToLocal((long) 25200000);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) ' ');
        long long7 = dateTimeZone1.convertUTCToLocal((-1570084924099L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((-35999849L), locale10);
        int int13 = dateTimeZone1.getStandardOffset((-1570048924099L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName(2L, locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25200052L + "'", long3 == 25200052L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570084924047L) + "'", long7 == (-1570084924047L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.052" + "'", str11, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.052" + "'", str16, "+00:00:00.052");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        java.lang.String str8 = dateTimeZone1.getName((-1570084924101L));
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.Object obj11 = dateTimeZone10.writeReplace();
        int int13 = dateTimeZone10.getStandardOffset(324600001L);
        java.lang.Object obj14 = dateTimeZone10.writeReplace();
        java.lang.Class<?> wildcardClass15 = dateTimeZone10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getNameKey(101L);
        int int13 = dateTimeZone1.getStandardOffset(53520000L);
        java.lang.String str15 = dateTimeZone1.getName(25200002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.052" + "'", str15, "+00:00:00.052");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        java.lang.String str32 = dateTimeZone19.getID();
        long long35 = dateTimeZone19.convertLocalToUTC((-349199899L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.052" + "'", str8, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.052" + "'", str28, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.052" + "'", str32, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-349199951L) + "'", long35 == (-349199951L));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        java.lang.String str3 = dateTimeZone1.getShortName((-1569969663899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+01:00" + "'", str3, "+01:00");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        long long28 = dateTimeZone2.convertUTCToLocal((-115799866L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.052" + "'", str17, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.052" + "'", str19, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 25200052L + "'", long21 == 25200052L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.052" + "'", str24, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 90059947L + "'", long26 == 90059947L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-539866L) + "'", long28 == (-539866L));
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        long long14 = dateTimeZone3.convertLocalToUTC((long) 115800000, true, (-1570084924000L));
        java.lang.Object obj15 = dateTimeZone3.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115799948L + "'", long14 == 115799948L);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (short) 0, true);
        long long7 = dateTimeZone1.nextTransition(1L);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        java.lang.String str10 = dateTimeZone1.getNameKey(2100001L);
        boolean boolean11 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        long long27 = dateTimeZone18.convertLocalToUTC(25200000L, true, (-1570192924001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.052" + "'", str14, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570084923948L) + "'", long16 == (-1570084923948L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 63L + "'", long20 == 63L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 25200001L + "'", long27 == 25200001L);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((-35999901L));
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.Class<?> wildcardClass7 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getName(71999999L, locale16);
        long long21 = dateTimeZone1.convertLocalToUTC(36000031L, true, (long) 10);
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone1.getOffset(readableInstant22);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 36000032L + "'", long21 == 36000032L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        long long22 = dateTimeZone5.convertLocalToUTC((-39659900L), true);
        int int24 = dateTimeZone5.getStandardOffset(233340101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084923999L) + "'", long15 == (-1570084923999L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-39659899L) + "'", long22 == (-39659899L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        java.lang.String str4 = dateTimeZone2.getNameKey(1L);
        int int6 = dateTimeZone2.getStandardOffset(36000002L);
        java.util.TimeZone timeZone7 = dateTimeZone2.toTimeZone();
        int int9 = dateTimeZone2.getOffsetFromLocal(36059979L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2100000 + "'", int6 == 2100000);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:35");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2100000 + "'", int9 == 2100000);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 0L);
        java.lang.String str11 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3599999L + "'", long10 == 3599999L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        boolean boolean5 = dateTimeZone1.equals((java.lang.Object) dateTimeZone4);
        long long7 = dateTimeZone1.nextTransition((-39659900L));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        long long13 = dateTimeZone1.convertLocalToUTC(115320084L, false, (-1570084923900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-39659900L) + "'", long7 == (-39659900L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 115320084L + "'", long13 == 115320084L);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone1.getOffset(readableInstant16);
        long long19 = dateTimeZone1.nextTransition(25200002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 39600000L + "'", long11 == 39600000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-99L) + "'", long15 == (-99L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25200002L + "'", long19 == 25200002L);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        java.lang.String str10 = dateTimeZone1.getName((-25200001L));
        boolean boolean11 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.convertUTCToLocal(100L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.lang.String str9 = dateTimeZone1.getNameKey((-91L));
        java.lang.String str11 = dateTimeZone1.getName((-59990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        java.lang.String str27 = dateTimeZone1.getName(119399900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200001L + "'", long10 == 25200001L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 102L + "'", long12 == 102L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 98L + "'", long22 == 98L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 101L + "'", long24 == 101L);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.001" + "'", str27, "+00:00:00.001");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset(0L);
        int int7 = dateTimeZone1.getStandardOffset((-1570084924201L));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        int int11 = dateTimeZone1.getOffset(90060000L);
        long long13 = dateTimeZone1.nextTransition(89520051L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 89520051L + "'", long13 == 89520051L);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        java.lang.String str25 = dateTimeZone8.getName(0L);
        java.lang.String str27 = dateTimeZone8.getShortName(360599900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115800000 + "'", int6 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
// flaky "72) test0690(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "67) test0690(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 101L + "'", long19 == 101L);
// flaky "56) test0690(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
// flaky "41) test0690(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
// flaky "25) test0690(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long25 = dateTimeZone21.getMillisKeepLocal(dateTimeZone23, (long) 'a');
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone21.getName((long) (short) 1, locale27);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone21.getName(100L, locale31);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        int int35 = dateTimeZone21.getOffsetFromLocal(100L);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone21.getName((-39659900L), locale37);
        boolean boolean39 = dateTimeZone3.equals((java.lang.Object) str38);
        java.lang.String str41 = dateTimeZone3.getName((-1570084924046L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "73) test0691(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "68) test0691(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "57) test0691(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "42) test0691(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky "26) test0691(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
// flaky "13) test0691(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
// flaky "9) test0691(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
// flaky "9) test0691(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
// flaky "6) test0691(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-00:00:00.001" + "'", str38, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky "4) test0691(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-00:00:00.001" + "'", str41, "-00:00:00.001");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        java.lang.Object obj15 = dateTimeZone3.writeReplace();
        long long17 = dateTimeZone3.nextTransition(60001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "74) test0692(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky "69) test0692(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky "58) test0692(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 60001L + "'", long17 == 60001L);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115800000);
        java.lang.String str3 = dateTimeZone1.getNameKey(0L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115800000 + "'", int5 == 115800000);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924000L) + "'", long15 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        long long19 = dateTimeZone11.adjustOffset((-1570120924001L), false);
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
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1570120924001L) + "'", long19 == (-1570120924001L));
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        java.util.TimeZone timeZone34 = dateTimeZone8.toTimeZone();
        java.lang.String str36 = dateTimeZone8.getShortName((-1570120924200L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115800000 + "'", int6 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1570048924000L) + "'", long28 == (-1570048924000L));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1570120924101L) + "'", long33 == (-1570120924101L));
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+10:00");
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        java.lang.String str34 = dateTimeZone23.getName((-1570048923902L));
        java.lang.String str35 = dateTimeZone23.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2100000 + "'", int6 == 2100000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2L + "'", long30 == 2L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 2100001L + "'", long32 == 2100001L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-00:00:00.001" + "'", str34, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-00:00:00.001" + "'", str35, "-00:00:00.001");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str6 = dateTimeZone1.getShortName(2L);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        int int10 = dateTimeZone8.getOffset((-35999991L));
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone8.getOffset(readableInstant11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        boolean boolean3 = dateTimeZone2.isFixed();
        java.lang.String str5 = dateTimeZone2.getShortName((-223199802L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:35" + "'", str5, "+00:35");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        java.lang.String str21 = dateTimeZone3.getShortName((-32339965L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "75) test0701(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "70) test0701(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "59) test0701(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+10:00");
// flaky "43) test0701(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
// flaky "27) test0701(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
// flaky "14) test0701(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+10:00" + "'", str15, "+10:00");
        org.junit.Assert.assertNotNull(timeZone16);
// flaky "10) test0701(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+10:00");
// flaky "10) test0701(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+10:00" + "'", str19, "+10:00");
// flaky "7) test0701(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+10:00" + "'", str21, "+10:00");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        boolean boolean16 = dateTimeZone10.isFixed();
        java.lang.String str18 = dateTimeZone10.getName((-223199902L));
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone10.isLocalDateTimeGap(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "76) test0702(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "71) test0702(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "60) test0702(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
// flaky "44) test0702(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-10800000L) + "'", long15 == (-10800000L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky "28) test0702(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:00" + "'", str18, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
        boolean boolean39 = dateTimeZone1.isStandardOffset((-115800100L));
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.Object obj42 = dateTimeZone41.writeReplace();
        java.lang.Object obj43 = dateTimeZone41.writeReplace();
        long long45 = dateTimeZone1.getMillisKeepLocal(dateTimeZone41, 25139999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "77) test0703(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
// flaky "72) test0703(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
// flaky "61) test0703(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36000000 + "'", int8 == 36000000);
// flaky "45) test0703(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:00" + "'", str10, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
// flaky "29) test0703(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36000000 + "'", int18 == 36000000);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky "15) test0703(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+10:00");
// flaky "11) test0703(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+10:00" + "'", str22, "+10:00");
// flaky "11) test0703(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+10:00" + "'", str25, "+10:00");
// flaky "8) test0703(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+10:00" + "'", str26, "+10:00");
// flaky "5) test0703(org.joda.time.RegressionTest1)":         org.junit.Assert.assertNull(str28);
// flaky "3) test0703(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-126600000L) + "'", long31 == (-126600000L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 36000032L + "'", long34 == 36000032L);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 4140000L + "'", long37 == 4140000L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj43);
// flaky "3) test0703(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 61139899L + "'", long45 == 61139899L);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getShortName((-1570164664001L), locale17);
        int int20 = dateTimeZone1.getStandardOffset(119400001L);
        java.lang.String str22 = dateTimeZone1.getShortName((-115800001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "78) test0704(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky "73) test0704(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky "62) test0704(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999901L) + "'", long14 == (-35999901L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "46) test0704(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
// flaky "30) test0704(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
// flaky "16) test0704(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        long long13 = dateTimeZone1.adjustOffset(2L, true);
        int int15 = dateTimeZone1.getOffsetFromLocal(25200052L);
        java.util.TimeZone timeZone16 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, 187260000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187260000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) false);
        long long12 = dateTimeZone1.previousTransition(97L);
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "79) test0707(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-01:00" + "'", str8, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        long long10 = dateTimeZone1.previousTransition((-1570084924099L));
        long long12 = dateTimeZone1.previousTransition((-36000001L));
        java.lang.String str13 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "80) test0708(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-01:00" + "'", str2, "-01:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "74) test0708(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924099L) + "'", long10 == (-1570084924099L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-36000001L) + "'", long12 == (-36000001L));
// flaky "63) test0708(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-01:00" + "'", str13, "-01:00");
// flaky "47) test0708(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3600000) + "'", int15 == (-3600000));
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        long long6 = dateTimeZone1.convertLocalToUTC((-115800000L), false);
        boolean boolean7 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-115800001L) + "'", long6 == (-115800001L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        java.lang.Class<?> wildcardClass12 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "81) test0711(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3600000) + "'", int7 == (-3600000));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "75) test0711(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((-1570084924000L), locale6);
        java.lang.String str9 = dateTimeZone1.getShortName((-35999899L));
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        int int13 = dateTimeZone1.getOffsetFromLocal(187200002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        java.lang.String str16 = dateTimeZone3.getShortName(115800002L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone3.getName((-90L), locale18);
        long long22 = dateTimeZone3.convertLocalToUTC(111L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "82) test0713(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3600000) + "'", int7 == (-3600000));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "76) test0713(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "64) test0713(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT-01:00");
// flaky "48) test0713(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "31) test0713(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-01:00" + "'", str16, "-01:00");
// flaky "17) test0713(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-01:00" + "'", str19, "-01:00");
// flaky "12) test0713(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3600111L + "'", long22 == 3600111L);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long5 = dateTimeZone1.convertUTCToLocal((long) 'a');
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long13 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, (long) 'a');
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone9.getName((long) (short) 1, locale15);
        int int18 = dateTimeZone9.getOffset((long) 1);
        java.lang.Object obj19 = dateTimeZone9.writeReplace();
        java.lang.String str21 = dateTimeZone9.getShortName(96L);
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        long long24 = dateTimeZone9.convertUTCToLocal((-1570272124001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "83) test0714(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-01:00" + "'", str2, "-01:00");
// flaky "77) test0714(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3599903L) + "'", long5 == (-3599903L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
// flaky "65) test0714(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-01:00" + "'", str16, "-01:00");
// flaky "49) test0714(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3600000) + "'", int18 == (-3600000));
        org.junit.Assert.assertNotNull(obj19);
// flaky "32) test0714(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-01:00" + "'", str21, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "18) test0714(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1570275724001L) + "'", long24 == (-1570275724001L));
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        boolean boolean15 = dateTimeZone10.isFixed();
        boolean boolean17 = dateTimeZone10.isStandardOffset((-3599903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "84) test0715(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3600000) + "'", int7 == (-3600000));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "78) test0715(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "66) test0715(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "50) test0715(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32400000L + "'", long12 == 32400000L);
// flaky "33) test0715(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3600000) + "'", int14 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset(0L);
        int int7 = dateTimeZone1.getStandardOffset((-1570084924201L));
        boolean boolean9 = dateTimeZone1.isStandardOffset(99L);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        java.lang.String str13 = dateTimeZone1.getName(25200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) (-1), locale8);
        java.lang.String str10 = dateTimeZone1.toString();
        boolean boolean11 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "85) test0717(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3600000) + "'", int5 == (-3600000));
// flaky "79) test0717(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
// flaky "67) test0717(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-01:00" + "'", str9, "-01:00");
// flaky "51) test0717(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-01:00" + "'", str10, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(363120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName((long) (short) 10, locale14);
        int int17 = dateTimeZone1.getOffsetFromLocal((-35999800L));
        int int19 = dateTimeZone1.getStandardOffset((-35999848L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "86) test0719(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "80) test0719(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 28800000L + "'", long10 == 28800000L);
// flaky "68) test0719(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3600101L + "'", long12 == 3600101L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.lang.String str10 = dateTimeZone3.getNameKey((long) 10);
        long long12 = dateTimeZone3.convertUTCToLocal((-115259800L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "87) test0720(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3600000) + "'", int7 == (-3600000));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "81) test0720(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT-01:00");
// flaky "69) test0720(org.joda.time.RegressionTest1)":         org.junit.Assert.assertNull(str10);
// flaky "52) test0720(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-118859800L) + "'", long12 == (-118859800L));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long21 = dateTimeZone1.convertLocalToUTC(3600100L, true, 36L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "88) test0721(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
// flaky "82) test0721(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-3600000) + "'", int10 == (-3600000));
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky "70) test0721(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-39599900L) + "'", long14 == (-39599900L));
// flaky "53) test0721(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3600000) + "'", int16 == (-3600000));
// flaky "34) test0721(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 7200100L + "'", long21 == 7200100L);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (int) (short) 1);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        long long8 = dateTimeZone2.convertLocalToUTC((-1570084924200L), false, 0L);
        java.lang.String str10 = dateTimeZone2.getName((-97199901L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1570081264200L) + "'", long8 == (-1570081264200L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-01:01" + "'", str10, "-01:01");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        boolean boolean9 = dateTimeZone1.isFixed();
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        long long16 = dateTimeZone12.getMillisKeepLocal(dateTimeZone14, (long) 'a');
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone12.getName((long) (short) 1, locale18);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        long long22 = dateTimeZone12.nextTransition((long) ' ');
        boolean boolean24 = dateTimeZone12.isStandardOffset((long) (short) 1);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone12.getShortName(0L, locale26);
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, (-1570084924003L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "89) test0723(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
// flaky "83) test0723(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
// flaky "71) test0723(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky "54) test0723(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.001" + "'", str27, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1570084924003L) + "'", long29 == (-1570084924003L));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.lang.String str7 = dateTimeZone1.getNameKey(25200000L);
        java.lang.String str8 = dateTimeZone1.toString();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((-1569969124100L), locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "90) test0724(org.joda.time.RegressionTest1)":         org.junit.Assert.assertNull(str7);
// flaky "84) test0724(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
// flaky "72) test0724(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 0L);
        long long12 = dateTimeZone8.nextTransition((long) (byte) 0);
        long long14 = dateTimeZone8.nextTransition((-1L));
        java.lang.Class<?> wildcardClass15 = dateTimeZone8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "91) test0725(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
// flaky "85) test0725(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
// flaky "73) test0725(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky "55) test0725(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600001L + "'", long10 == 3600001L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(25200000);
        java.lang.String str3 = dateTimeZone1.getNameKey(59999L);
        java.lang.String str5 = dateTimeZone1.getNameKey((-1570084923946L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.previousTransition((long) (short) 1);
        java.lang.String str9 = dateTimeZone1.getID();
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        long long12 = dateTimeZone1.previousTransition((-32339965L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "92) test0727(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "86) test0727(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
// flaky "74) test0727(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-32339965L) + "'", long12 == (-32339965L));
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        java.lang.String str10 = dateTimeZone1.getName((-25200001L));
        java.lang.String str12 = dateTimeZone1.getNameKey((-1569969664099L));
        long long14 = dateTimeZone1.convertUTCToLocal(115740002L);
        long long17 = dateTimeZone1.adjustOffset((-1569969663899L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "93) test0728(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
// flaky "87) test0728(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky "75) test0728(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
// flaky "56) test0728(org.joda.time.RegressionTest1)":         org.junit.Assert.assertNull(str12);
// flaky "35) test0728(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115740003L + "'", long14 == 115740003L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1569969663899L) + "'", long17 == (-1569969663899L));
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (short) 0, true);
        long long7 = dateTimeZone1.nextTransition(1L);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        long long10 = dateTimeZone1.nextTransition(100L);
        long long12 = dateTimeZone1.nextTransition(32L);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        long long24 = dateTimeZone3.convertUTCToLocal((-115799901L));
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone3.getShortName((-1570120923836L), locale26);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "94) test0730(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "88) test0730(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "76) test0730(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
// flaky "57) test0730(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj16);
// flaky "36) test0730(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
// flaky "19) test0730(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-35999849L) + "'", long22 == (-35999849L));
// flaky "13) test0730(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-115799900L) + "'", long24 == (-115799900L));
// flaky "12) test0730(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.001" + "'", str27, "+00:00:00.001");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        java.lang.String str15 = dateTimeZone1.getShortName((long) 35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "95) test0731(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "89) test0731(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj10);
// flaky "77) test0731(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
// flaky "58) test0731(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        java.lang.String str19 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone1.isLocalDateTimeGap(localDateTime20);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        long long27 = dateTimeZone23.getMillisKeepLocal(dateTimeZone25, (long) 'a');
        int int29 = dateTimeZone25.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone30 = dateTimeZone25.toTimeZone();
        java.util.TimeZone timeZone31 = dateTimeZone25.toTimeZone();
        long long33 = dateTimeZone25.nextTransition((long) 1);
        boolean boolean34 = dateTimeZone25.isFixed();
        long long38 = dateTimeZone25.convertLocalToUTC(119400000L, false, (long) 52);
        long long40 = dateTimeZone25.convertUTCToLocal((-91L));
        long long43 = dateTimeZone25.adjustOffset(61200002L, false);
        int int45 = dateTimeZone25.getStandardOffset(115260051L);
        java.util.Locale locale47 = null;
        java.lang.String str48 = dateTimeZone25.getShortName((long) '4', locale47);
        boolean boolean49 = dateTimeZone1.equals((java.lang.Object) locale47);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "96) test0732(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
// flaky "90) test0732(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570084924101L) + "'", long12 == (-1570084924101L));
// flaky "78) test0732(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570084924201L) + "'", long18 == (-1570084924201L));
// flaky "59) test0732(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
// flaky "37) test0732(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(timeZone30);
// flaky "20) test0732(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone31);
// flaky "14) test0732(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
// flaky "13) test0732(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 119399999L + "'", long38 == 119399999L);
// flaky "9) test0732(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-90L) + "'", long40 == (-90L));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 61200002L + "'", long43 == 61200002L);
// flaky "6) test0732(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
// flaky "4) test0732(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00:00.001" + "'", str48, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        java.lang.Class<?> wildcardClass14 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "97) test0733(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "91) test0733(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "79) test0733(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-10800000L) + "'", long13 == (-10800000L));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        java.lang.String str9 = dateTimeZone1.getID();
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        int int12 = dateTimeZone1.getStandardOffset((-1570084924200L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "98) test0734(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "92) test0734(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25199999L + "'", long8 == 25199999L);
// flaky "80) test0734(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj10);
// flaky "60) test0734(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        java.lang.String str21 = dateTimeZone3.getNameKey((-36059848L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "99) test0735(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "93) test0735(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "81) test0735(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
// flaky "61) test0735(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
// flaky "38) test0735(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky "21) test0735(org.joda.time.RegressionTest1)":         org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getShortName((-1570012924100L), locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-115799900L), locale7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-3660000L));
        java.lang.String str12 = dateTimeZone1.getNameKey((-231059899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.035" + "'", str5, "+00:00:00.035");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.035" + "'", str8, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.Class<?> wildcardClass4 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        java.lang.Object obj22 = dateTimeZone3.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "100) test0738(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "94) test0738(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "82) test0738(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
// flaky "62) test0738(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
// flaky "39) test0738(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
// flaky "22) test0738(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        int int6 = dateTimeZone1.getOffset((long) 115800000);
        java.lang.String str8 = dateTimeZone1.getName((-35999900L));
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, (long) 'a');
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone10.getName((long) (short) 1, locale16);
        boolean boolean19 = dateTimeZone10.equals((java.lang.Object) false);
        boolean boolean20 = dateTimeZone1.equals((java.lang.Object) dateTimeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
// flaky "101) test0740(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long6 = dateTimeZone3.convertLocalToUTC((long) 1, true);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 32L);
        int int10 = dateTimeZone1.getStandardOffset(187200002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-99L) + "'", long6 == (-99L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35999932L + "'", long8 == 35999932L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        int int32 = dateTimeZone27.getStandardOffset((-1570048924099L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
// flaky "102) test0742(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky "95) test0742(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "83) test0742(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
// flaky "63) test0742(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
// flaky "40) test0742(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
// flaky "23) test0742(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky "15) test0742(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-187140000L) + "'", long29 == (-187140000L));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 187200000 + "'", int32 == 187200000);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long4 = dateTimeZone1.nextTransition((-99L));
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        long long12 = dateTimeZone1.convertLocalToUTC((long) (short) 0, true, 102L);
        java.lang.String str13 = dateTimeZone1.getID();
        java.lang.String str14 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+52:00" + "'", str8, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+52:00" + "'", str13, "+52:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+52:00" + "'", str14, "+52:00");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 10);
        long long6 = dateTimeZone2.convertLocalToUTC((-1569969664099L), true, 101L);
        int int8 = dateTimeZone2.getOffsetFromLocal((-1570084924101L));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        boolean boolean12 = dateTimeZone2.equals((java.lang.Object) timeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long16 = dateTimeZone13.convertLocalToUTC((-1L), true);
        java.lang.Class<?> wildcardClass17 = dateTimeZone13.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1570085464099L) + "'", long6 == (-1570085464099L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115800000 + "'", int8 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        int int6 = dateTimeZone1.getOffset((long) 115800000);
        boolean boolean7 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        long long13 = dateTimeZone10.adjustOffset(103L, true);
        boolean boolean15 = dateTimeZone10.isStandardOffset((-35999990L));
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) dateTimeZone10);
        long long18 = dateTimeZone1.convertUTCToLocal((-1570084924002L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 103L + "'", long13 == 103L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570084923902L) + "'", long18 == (-1570084923902L));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
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
        boolean boolean18 = dateTimeZone3.equals((java.lang.Object) 72000000L);
        java.lang.String str20 = dateTimeZone3.getNameKey(89520002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+52:00" + "'", str12, "+52:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+52:00" + "'", str14, "+52:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+52:00" + "'", str15, "+52:00");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        boolean boolean7 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.previousTransition((-1569969124103L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1569969124103L) + "'", long9 == (-1569969124103L));
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+52:00" + "'", str11, "+52:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+52:00" + "'", str14, "+52:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+52:00" + "'", str17, "+52:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+52:00" + "'", str19, "+52:00");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean4 = dateTimeZone1.isStandardOffset(98L);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        long long8 = dateTimeZone1.nextTransition(79800002L);
        long long12 = dateTimeZone1.convertLocalToUTC((long) 'a', false, (-1570048924046L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 79800002L + "'", long8 == 79800002L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187199903L) + "'", long12 == (-187199903L));
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        java.lang.String str16 = dateTimeZone1.getID();
        long long18 = dateTimeZone1.convertUTCToLocal((-349199951L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+52:00" + "'", str8, "+52:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 187200000 + "'", int10 == 187200000);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 187200000 + "'", int13 == 187200000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+52:00" + "'", str16, "+52:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-161999951L) + "'", long18 == (-161999951L));
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
        java.lang.String str26 = dateTimeZone1.getID();
        int int28 = dateTimeZone1.getOffsetFromLocal((-115800098L));
        long long32 = dateTimeZone1.convertLocalToUTC(72000000L, false, (-1570200184100L));
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.001" + "'", str26, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 71999999L + "'", long32 == 71999999L);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        long long7 = dateTimeZone3.convertLocalToUTC(100L, false, (-99L));
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) false);
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
        java.util.TimeZone timeZone23 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        boolean boolean25 = dateTimeZone1.equals((java.lang.Object) timeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 187200000 + "'", int16 == 187200000);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 187200000L + "'", long20 == 187200000L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int6 = dateTimeZone1.getOffsetFromLocal((-187199899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.convertUTCToLocal(100L);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.getID();
        boolean boolean9 = dateTimeZone1.isStandardOffset((-36000000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone1.getShortName(25139999L, locale21);
        java.lang.String str23 = dateTimeZone1.toString();
        java.lang.String str25 = dateTimeZone1.getShortName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.001" + "'", str23, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.001" + "'", str25, "+00:00:00.001");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj4 = dateTimeZone3.writeReplace();
        java.lang.String str5 = dateTimeZone3.getID();
        long long8 = dateTimeZone3.convertLocalToUTC((long) 'a', true);
        int int10 = dateTimeZone3.getStandardOffset(0L);
        long long14 = dateTimeZone3.convertLocalToUTC(102L, false, 2L);
        long long18 = dateTimeZone3.convertLocalToUTC((long) (byte) 1, false, (-25740001L));
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 119400001L);
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
        long long37 = dateTimeZone24.previousTransition(2100000L);
        boolean boolean38 = dateTimeZone1.equals((java.lang.Object) long37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        int int40 = dateTimeZone1.getOffset(readableInstant39);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 103L + "'", long14 == 103L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 155400002L + "'", long20 == 155400002L);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-00:00:00.001" + "'", str35, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 2100000L + "'", long37 == 2100000L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 36000000 + "'", int40 == 36000000);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone6.isLocalDateTimeGap(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "103) test0758(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        java.lang.String str21 = dateTimeZone3.getID();
        long long23 = dateTimeZone3.convertUTCToLocal(115260054L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "104) test0759(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "96) test0759(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "84) test0759(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky "64) test0759(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "41) test0759(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
// flaky "24) test0759(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570084924000L) + "'", long16 == (-1570084924000L));
// flaky "16) test0759(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "14) test0759(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
// flaky "10) test0759(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 115260054L + "'", long23 == 115260054L);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((-25200001L));
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((-36000001L));
        long long7 = dateTimeZone0.previousTransition(54L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 54L + "'", long7 == 54L);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        java.lang.String str16 = dateTimeZone10.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "105) test0761(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "97) test0761(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "85) test0761(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36000000L + "'", long12 == 36000000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        boolean boolean16 = dateTimeZone10.isFixed();
        java.util.TimeZone timeZone17 = dateTimeZone10.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "106) test0762(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "98) test0762(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25200000L + "'", long15 == 25200000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC((-115799899L), true, 36000100L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        int int13 = dateTimeZone10.getOffset((-1570012924051L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone10.getShortName(115259967L, locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "107) test0763(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "99) test0763(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115799899L) + "'", long8 == (-115799899L));
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "86) test0763(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long25 = dateTimeZone21.getMillisKeepLocal(dateTimeZone23, (long) 'a');
        int int27 = dateTimeZone23.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone28 = dateTimeZone23.toTimeZone();
        java.util.TimeZone timeZone29 = dateTimeZone23.toTimeZone();
        long long31 = dateTimeZone23.nextTransition((long) 1);
        boolean boolean32 = dateTimeZone23.isFixed();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str35 = dateTimeZone33.getShortName((long) 25200000);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        long long41 = dateTimeZone37.getMillisKeepLocal(dateTimeZone39, (long) 'a');
        int int43 = dateTimeZone39.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone44 = dateTimeZone39.toTimeZone();
        java.util.Locale locale46 = null;
        java.lang.String str47 = dateTimeZone39.getShortName((long) (byte) 100, locale46);
        java.util.Locale locale49 = null;
        java.lang.String str50 = dateTimeZone39.getShortName((long) (short) 0, locale49);
        java.util.Locale locale52 = null;
        java.lang.String str53 = dateTimeZone39.getName((long) (short) 100, locale52);
        java.lang.String str55 = dateTimeZone39.getName((long) (-1));
        boolean boolean57 = dateTimeZone39.isStandardOffset((long) (short) -1);
        boolean boolean58 = dateTimeZone33.equals((java.lang.Object) dateTimeZone39);
        long long60 = dateTimeZone23.getMillisKeepLocal(dateTimeZone33, (-1570120924101L));
        long long63 = dateTimeZone23.convertLocalToUTC(89520001L, true);
        org.joda.time.LocalDateTime localDateTime64 = null;
        boolean boolean65 = dateTimeZone23.isLocalDateTimeGap(localDateTime64);
        boolean boolean66 = dateTimeZone14.equals((java.lang.Object) localDateTime64);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "108) test0764(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "100) test0764(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924099L) + "'", long10 == (-1570084924099L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-36000001L) + "'", long12 == (-36000001L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-35999999L) + "'", long17 == (-35999999L));
// flaky "87) test0764(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-360600000L) + "'", long19 == (-360600000L));
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
// flaky "65) test0764(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky "42) test0764(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone29);
// flaky "25) test0764(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 97L + "'", long41 == 97L);
// flaky "17) test0764(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(timeZone44);
// flaky "15) test0764(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "11) test0764(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00" + "'", str47, "+00:00");
// flaky "7) test0764(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00" + "'", str50, "+00:00");
// flaky "5) test0764(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+00:00" + "'", str53, "+00:00");
// flaky "4) test0764(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00" + "'", str55, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
// flaky "3) test0764(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
// flaky "2) test0764(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1570120924101L) + "'", long60 == (-1570120924101L));
// flaky "2) test0764(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long63 + "' != '" + 89520001L + "'", long63 == 89520001L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long10 = dateTimeZone1.convertLocalToUTC((-1L), false, (long) '#');
        java.lang.String str11 = dateTimeZone1.getID();
        long long13 = dateTimeZone1.nextTransition(115799901L);
        long long16 = dateTimeZone1.convertLocalToUTC(151740001L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 115799901L + "'", long13 == 115799901L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 151740000L + "'", long16 == 151740000L);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:35");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        long long10 = dateTimeZone1.nextTransition(97L);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        java.lang.String str12 = dateTimeZone1.toString();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        long long18 = dateTimeZone14.getMillisKeepLocal(dateTimeZone16, (long) 'a');
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone14.getName((long) (short) 1, locale20);
        int int23 = dateTimeZone14.getOffset((long) 1);
        int int25 = dateTimeZone14.getOffset((long) '#');
        long long27 = dateTimeZone14.nextTransition((-2L));
        java.lang.String str29 = dateTimeZone14.getShortName(1L);
        int int31 = dateTimeZone14.getStandardOffset(25199999L);
        java.lang.String str32 = dateTimeZone14.getID();
        int int34 = dateTimeZone14.getStandardOffset((-1570012923999L));
        long long36 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, (-35939900L));
        java.lang.String str38 = dateTimeZone14.getShortName((-1570120924101L));
        int int40 = dateTimeZone14.getOffset(0L);
        java.lang.Object obj41 = dateTimeZone14.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "109) test0767(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "101) test0767(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertNotNull(obj11);
// flaky "88) test0767(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
// flaky "66) test0767(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
// flaky "43) test0767(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky "26) test0767(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-2L) + "'", long27 == (-2L));
// flaky "18) test0767(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
// flaky "16) test0767(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
// flaky "12) test0767(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
// flaky "8) test0767(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-35939900L) + "'", long36 == (-35939900L));
// flaky "6) test0767(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
// flaky "5) test0767(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long10 = dateTimeZone1.convertLocalToUTC((-1L), false, (long) '#');
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.String str17 = dateTimeZone15.getNameKey(59900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        long long31 = dateTimeZone27.getMillisKeepLocal(dateTimeZone29, (long) 'a');
        int int33 = dateTimeZone29.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone34 = dateTimeZone29.toTimeZone();
        java.util.TimeZone timeZone35 = dateTimeZone29.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        java.lang.String str39 = dateTimeZone38.toString();
        boolean boolean40 = dateTimeZone0.equals((java.lang.Object) dateTimeZone38);
        boolean boolean41 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
// flaky "110) test0769(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky "102) test0769(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "89) test0769(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
// flaky "67) test0769(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
// flaky "44) test0769(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
// flaky "27) test0769(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky "19) test0769(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 97L + "'", long31 == 97L);
// flaky "17) test0769(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(timeZone34);
// flaky "13) test0769(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone35);
// flaky "9) test0769(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UTC" + "'", str39, "UTC");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
        long long54 = dateTimeZone39.convertUTCToLocal(0L);
        long long57 = dateTimeZone39.adjustOffset(60002L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
// flaky "111) test0770(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky "103) test0770(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "90) test0770(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
// flaky "68) test0770(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
// flaky "45) test0770(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
// flaky "28) test0770(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky "20) test0770(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115799900L + "'", long27 == 115799900L);
// flaky "18) test0770(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
// flaky "14) test0770(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 2L + "'", long32 == 2L);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 115800000 + "'", int37 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 97L + "'", long43 == 97L);
// flaky "10) test0770(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
// flaky "7) test0770(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1570084924099L) + "'", long50 == (-1570084924099L));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 36000000L + "'", long52 == 36000000L);
// flaky "6) test0770(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 60002L + "'", long57 == 60002L);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj4 = dateTimeZone3.writeReplace();
        java.lang.String str5 = dateTimeZone3.getID();
        long long8 = dateTimeZone3.convertLocalToUTC((long) 'a', true);
        int int10 = dateTimeZone3.getStandardOffset(0L);
        long long14 = dateTimeZone3.convertLocalToUTC(102L, false, 2L);
        long long18 = dateTimeZone3.convertLocalToUTC((long) (byte) 1, false, (-25740001L));
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 119400001L);
        boolean boolean22 = dateTimeZone3.isStandardOffset((-115799889L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 103L + "'", long14 == 103L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 155400002L + "'", long20 == 155400002L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        int int26 = dateTimeZone3.getStandardOffset((-1570120864101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "112) test0772(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "104) test0772(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "91) test0772(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
// flaky "69) test0772(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
// flaky "46) test0772(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
// flaky "29) test0772(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
// flaky "21) test0772(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky "19) test0772(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.052");
        java.lang.String str3 = dateTimeZone1.getNameKey((-115800098L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(126060000, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "113) test0776(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
// flaky "105) test0776(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
// flaky "92) test0776(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky "70) test0776(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25199999L + "'", long19 == 25199999L);
// flaky "47) test0776(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 119399999L + "'", long21 == 119399999L);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky "30) test0776(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 35);
        java.lang.String str3 = dateTimeZone2.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:35" + "'", str3, "+00:35");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        long long21 = dateTimeZone3.adjustOffset((-36000090L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2100000 + "'", int7 == 2100000);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:35" + "'", str10, "+00:35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:35" + "'", str11, "+00:35");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-25740000L) + "'", long13 == (-25740000L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2100000 + "'", int15 == 2100000);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:35" + "'", str18, "+00:35");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-36000090L) + "'", long21 == (-36000090L));
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone3.getShortName(71999999L, locale20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone3.getOffset(readableInstant22);
        boolean boolean25 = dateTimeZone3.isStandardOffset((-1569969124101L));
        long long27 = dateTimeZone3.previousTransition(115740052L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2100000 + "'", int7 == 2100000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:35" + "'", str11, "+00:35");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:35" + "'", str14, "+00:35");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2100000 + "'", int18 == 2100000);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:35" + "'", str21, "+00:35");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2100000 + "'", int23 == 2100000);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115740052L + "'", long27 == 115740052L);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        long long29 = dateTimeZone8.adjustOffset(12L, false);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone8.getName((-115800100L), locale31);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2100000 + "'", int12 == 2100000);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:35");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:35");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:35" + "'", str17, "+00:35");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:35" + "'", str19, "+00:35");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 25200052L + "'", long21 == 25200052L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:35" + "'", str24, "+00:35");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 87959999L + "'", long26 == 87959999L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 12L + "'", long29 == 12L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:35" + "'", str32, "+00:35");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        java.lang.Object obj41 = dateTimeZone3.writeReplace();
        java.lang.Class<?> wildcardClass42 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2100000 + "'", int7 == 2100000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:35");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:35");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2100000 + "'", int23 == 2100000);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:35");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:35" + "'", str27, "+00:35");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:35" + "'", str30, "+00:35");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:35" + "'", str33, "+00:35");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:35" + "'", str35, "+00:35");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1570118824101L) + "'", long40 == (-1570118824101L));
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        int int23 = dateTimeZone1.getStandardOffset(79800002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2100000 + "'", int5 == 2100000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25200001L) + "'", long16 == (-25200001L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:35" + "'", str17, "+00:35");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:35");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2100000 + "'", int21 == 2100000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2100000 + "'", int23 == 2100000);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        long long8 = dateTimeZone1.previousTransition(97L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((long) 35, locale10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone13.getMillisKeepLocal(dateTimeZone15, (long) 'a');
        boolean boolean18 = dateTimeZone13.isFixed();
        int int20 = dateTimeZone13.getStandardOffset((-1L));
        int int22 = dateTimeZone13.getOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        long long26 = dateTimeZone13.getMillisKeepLocal(dateTimeZone24, 100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        java.lang.String str29 = dateTimeZone24.getNameKey(231059997L);
        boolean boolean30 = dateTimeZone24.isFixed();
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = dateTimeZone24.isLocalDateTimeGap(localDateTime31);
        java.lang.String str34 = dateTimeZone24.getNameKey(3599899L);
        boolean boolean35 = dateTimeZone1.equals((java.lang.Object) 3599899L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2100000 + "'", int5 == 2100000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:35" + "'", str11, "+00:35");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2100000 + "'", int20 == 2100000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2100000 + "'", int22 == 2100000);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-33899900L) + "'", long26 == (-33899900L));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3660000), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115260000, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        java.lang.String str17 = dateTimeZone3.getNameKey(100L);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone3.isLocalDateTimeGap(localDateTime18);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone3.isLocalDateTimeGap(localDateTime20);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone12.isLocalDateTimeGap(localDateTime19);
        boolean boolean22 = dateTimeZone12.isStandardOffset(360600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36000000 + "'", int8 == 36000000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        long long13 = dateTimeZone9.adjustOffset(115799965L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 115799965L + "'", long13 == 115799965L);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360600000);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 52);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
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
        java.lang.String str21 = dateTimeZone9.getID();
        java.lang.String str22 = dateTimeZone9.getID();
        java.lang.String str23 = dateTimeZone9.toString();
        boolean boolean25 = dateTimeZone9.isStandardOffset((long) (-1));
        java.util.TimeZone timeZone26 = dateTimeZone9.toTimeZone();
        boolean boolean27 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.Object obj30 = dateTimeZone29.writeReplace();
        long long33 = dateTimeZone29.adjustOffset(36000000L, true);
        java.lang.Object obj34 = dateTimeZone29.writeReplace();
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        long long38 = dateTimeZone36.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant39 = null;
        int int40 = dateTimeZone36.getOffset(readableInstant39);
        java.lang.String str41 = dateTimeZone36.toString();
        long long43 = dateTimeZone36.previousTransition((long) (short) 1);
        boolean boolean45 = dateTimeZone36.isStandardOffset((-1570085464099L));
        long long47 = dateTimeZone29.getMillisKeepLocal(dateTimeZone36, 0L);
        int int49 = dateTimeZone36.getOffsetFromLocal(84L);
        boolean boolean50 = dateTimeZone1.equals((java.lang.Object) 84L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36000000 + "'", int13 == 36000000);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+10:00" + "'", str20, "+10:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+10:00" + "'", str21, "+10:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+10:00" + "'", str22, "+10:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+10:00" + "'", str23, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 36000000L + "'", long33 == 36000000L);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 36000000 + "'", int40 == 36000000);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+10:00" + "'", str41, "+10:00");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-35999965L) + "'", long47 == (-35999965L));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 36000000 + "'", int49 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Object obj18 = dateTimeZone1.writeReplace();
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone1.isLocalDateTimeGap(localDateTime19);
        long long22 = dateTimeZone1.convertUTCToLocal(36059979L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36000000 + "'", int8 == 36000000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36000000 + "'", int16 == 36000000);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 72059979L + "'", long22 == 72059979L);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long10 = dateTimeZone1.convertLocalToUTC((-1L), false, (long) '#');
        boolean boolean12 = dateTimeZone1.equals((java.lang.Object) (short) -1);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone17.isLocalDateTimeGap(localDateTime22);
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
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 115259968L + "'", long21 == 115259968L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        java.lang.Object obj22 = dateTimeZone1.writeReplace();
        long long24 = dateTimeZone1.convertUTCToLocal(25199900L);
        int int26 = dateTimeZone1.getOffset((-1570084924102L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "114) test0795(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115260000 + "'", int8 == 115260000);
// flaky "106) test0795(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115260000 + "'", int10 == 115260000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky "93) test0795(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 79260100L + "'", long14 == 79260100L);
// flaky "71) test0795(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115260000 + "'", int16 == 115260000);
// flaky "48) test0795(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:01" + "'", str17, "+32:01");
// flaky "31) test0795(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:01" + "'", str20, "+32:01");
// flaky "22) test0795(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:01" + "'", str21, "+32:01");
        org.junit.Assert.assertNotNull(obj22);
// flaky "20) test0795(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 140459900L + "'", long24 == 140459900L);
// flaky "15) test0795(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 115260000 + "'", int26 == 115260000);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone10.getShortName(11L, locale32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "115) test0796(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115260000 + "'", int8 == 115260000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky "107) test0796(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:01" + "'", str13, "+32:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
// flaky "94) test0796(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-90060000L) + "'", long19 == (-90060000L));
// flaky "72) test0796(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-115259899L) + "'", long21 == (-115259899L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-126600000L) + "'", long29 == (-126600000L));
// flaky "49) test0796(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.001" + "'", str33, "+00:00:00.001");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        long long12 = dateTimeZone1.convertLocalToUTC((long) (short) 0, true, 102L);
        java.lang.String str13 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str7 = dateTimeZone1.getID();
        long long10 = dateTimeZone1.convertLocalToUTC((-90600002L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-90600001L) + "'", long10 == (-90600001L));
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        long long18 = dateTimeZone3.previousTransition(89520001L);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570048924000L) + "'", long16 == (-1570048924000L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 89520001L + "'", long18 == 89520001L);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
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
        java.lang.String str15 = dateTimeZone10.getName((long) (-3660000));
        int int17 = dateTimeZone10.getStandardOffset((-35939934L));
        long long20 = dateTimeZone10.convertLocalToUTC((-1570084923999L), true);
        java.lang.String str22 = dateTimeZone10.getNameKey((-3599903L));
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570084923999L) + "'", long20 == (-1570084923999L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        long long3 = dateTimeZone1.previousTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        boolean boolean18 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone19 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int25 = dateTimeZone18.getStandardOffset(2100001L);
        java.lang.String str27 = dateTimeZone18.getNameKey(3660035L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "116) test0803(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky "108) test0803(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky "95) test0803(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "73) test0803(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570084924001L) + "'", long16 == (-1570084924001L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky "50) test0803(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        java.lang.Class<?> wildcardClass27 = dateTimeZone15.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200001L + "'", long10 == 25200001L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 102L + "'", long12 == 102L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 98L + "'", long22 == 98L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 101L + "'", long24 == 101L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570012923999L) + "'", long26 == (-1570012923999L));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        java.lang.String str50 = dateTimeZone1.getShortName((-1570048923901L));
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.001" + "'", str31, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 115800000 + "'", int36 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 97L + "'", long42 == 97L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00:00.001" + "'", str45, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00:00.001" + "'", str50, "+00:00:00.001");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3600000);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (short) 0);
        long long5 = dateTimeZone2.convertLocalToUTC((long) 0, false);
        java.lang.Object obj6 = dateTimeZone2.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        long long12 = dateTimeZone8.adjustOffset((long) (byte) 1, false);
        java.lang.Object obj13 = dateTimeZone8.writeReplace();
        java.lang.String str15 = dateTimeZone8.getNameKey((long) 36000000);
        boolean boolean17 = dateTimeZone8.isStandardOffset((-35999991L));
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        long long23 = dateTimeZone19.getMillisKeepLocal(dateTimeZone21, (long) 'a');
        int int25 = dateTimeZone21.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone26 = dateTimeZone21.toTimeZone();
        java.util.TimeZone timeZone27 = dateTimeZone21.toTimeZone();
        long long29 = dateTimeZone21.nextTransition((long) 1);
        boolean boolean30 = dateTimeZone21.isFixed();
        long long34 = dateTimeZone21.convertLocalToUTC(119400000L, false, (long) 52);
        long long36 = dateTimeZone21.convertUTCToLocal((-91L));
        long long38 = dateTimeZone8.getMillisKeepLocal(dateTimeZone21, (long) '#');
        long long40 = dateTimeZone2.getMillisKeepLocal(dateTimeZone21, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-349200000L) + "'", long5 == (-349200000L));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 119399999L + "'", long34 == 119399999L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-90L) + "'", long36 == (-90L));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 35L + "'", long38 == 35L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 349199999L + "'", long40 == 349199999L);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        java.lang.String str9 = dateTimeZone1.getID();
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        boolean boolean11 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25199999L + "'", long8 == 25199999L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187200000, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) '4');
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(35999900L, locale4);
        java.lang.String str6 = dateTimeZone2.toString();
        boolean boolean8 = dateTimeZone2.isStandardOffset((-35999999L));
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone2.getShortName((-3L), locale10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+35:52" + "'", str5, "+35:52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+35:52" + "'", str6, "+35:52");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+35:52" + "'", str11, "+35:52");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:01");
        long long4 = dateTimeZone1.adjustOffset((long) 'a', true);
        boolean boolean6 = dateTimeZone1.isStandardOffset((-51L));
        long long8 = dateTimeZone1.convertUTCToLocal((-115259900L));
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName(0L, locale10);
        boolean boolean12 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115199900L) + "'", long8 == (-115199900L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        long long4 = dateTimeZone2.convertUTCToLocal((-1570192924001L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1569843724001L) + "'", long4 == (-1569843724001L));
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        long long49 = dateTimeZone1.nextTransition(115259967L);
        java.lang.Class<?> wildcardClass50 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 97L + "'", long34 == 97L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-35999899L) + "'", long43 == (-35999899L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 25200001L + "'", long47 == 25200001L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 115259967L + "'", long49 == 115259967L);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        java.lang.Object obj28 = dateTimeZone3.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-64L) + "'", long27 == (-64L));
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        java.lang.String str3 = dateTimeZone1.getNameKey(115260002L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName((-231599865L), locale5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        java.lang.String str13 = dateTimeZone1.getNameKey(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        long long15 = dateTimeZone10.adjustOffset((long) 35, false);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone10.getOffset(readableInstant16);
        java.lang.String str19 = dateTimeZone10.getName(0L);
        long long22 = dateTimeZone10.adjustOffset((-115800097L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36000000L + "'", long12 == 36000000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-115800097L) + "'", long22 == (-115800097L));
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        boolean boolean29 = dateTimeZone1.isFixed();
        java.lang.String str30 = dateTimeZone1.getID();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.001" + "'", str30, "+00:00:00.001");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (short) 0);
        long long4 = dateTimeZone2.nextTransition(0L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((-360600000L), locale6);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+10:00" + "'", str7, "+10:00");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long5 = dateTimeZone1.convertLocalToUTC((-1570120924101L), false, (-35999990L));
        long long7 = dateTimeZone1.previousTransition(25199948L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570120924111L) + "'", long5 == (-1570120924111L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 25199948L + "'", long7 == 25199948L);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        boolean boolean16 = dateTimeZone10.isFixed();
        java.lang.String str18 = dateTimeZone10.getName((-223199902L));
        long long22 = dateTimeZone10.convertLocalToUTC(112L, false, (long) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 112L + "'", long22 == 112L);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        int int35 = dateTimeZone18.getOffsetFromLocal((-115799901L));
        int int37 = dateTimeZone18.getStandardOffset((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.001" + "'", str26, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.001" + "'", str29, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-115800099L) + "'", long31 == (-115800099L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.001" + "'", str33, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long3 = dateTimeZone1.convertUTCToLocal((long) 25200000);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) ' ');
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        long long13 = dateTimeZone9.convertLocalToUTC((long) (byte) 1, false, 97L);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (-1570048924098L));
        int int17 = dateTimeZone9.getStandardOffset((-1570120984201L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25200052L + "'", long3 == 25200052L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570048924047L) + "'", long15 == (-1570048924047L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int19 = dateTimeZone1.getStandardOffset(39600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999899L) + "'", long14 == (-35999899L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        java.lang.String str44 = dateTimeZone13.getNameKey(100L);
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
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.001" + "'", str27, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.001" + "'", str30, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.001" + "'", str33, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.001" + "'", str35, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1570120924100L) + "'", long40 == (-1570120924100L));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(187260000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        int int10 = dateTimeZone1.getOffset(97L);
        boolean boolean11 = dateTimeZone1.isFixed();
        java.lang.String str13 = dateTimeZone1.getName(115800099L);
        java.lang.String str14 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj4 = dateTimeZone3.writeReplace();
        java.lang.String str5 = dateTimeZone3.getID();
        long long8 = dateTimeZone3.convertLocalToUTC((long) 'a', true);
        int int10 = dateTimeZone3.getStandardOffset(0L);
        long long14 = dateTimeZone3.convertLocalToUTC(102L, false, 2L);
        long long18 = dateTimeZone3.convertLocalToUTC((long) (byte) 1, false, (-25740001L));
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 119400001L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone3.getName(25199900L, locale22);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 103L + "'", long14 == 103L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 155400002L + "'", long20 == 155400002L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 115260000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115260000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (short) 0, true);
        long long7 = dateTimeZone1.nextTransition(1L);
        boolean boolean9 = dateTimeZone1.isStandardOffset(115800000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long11 = dateTimeZone9.nextTransition(36000000L);
        java.lang.String str13 = dateTimeZone9.getShortName(102L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "117) test0834(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.052" + "'", str2, "+00:00:00.052");
// flaky "109) test0834(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.052" + "'", str4, "+00:00:00.052");
// flaky "96) test0834(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 36000000L + "'", long11 == 36000000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        long long26 = dateTimeZone22.getMillisKeepLocal(dateTimeZone24, (long) 'a');
        int int28 = dateTimeZone24.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone29 = dateTimeZone24.toTimeZone();
        java.util.TimeZone timeZone30 = dateTimeZone24.toTimeZone();
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone24.getName((long) (short) 10, locale32);
        java.lang.String str35 = dateTimeZone24.getName(0L);
        long long37 = dateTimeZone1.getMillisKeepLocal(dateTimeZone24, (long) ' ');
        java.lang.Object obj38 = dateTimeZone24.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "118) test0835(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.052" + "'", str8, "+00:00:00.052");
// flaky "110) test0835(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.052" + "'", str12, "+00:00:00.052");
// flaky "97) test0835(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
// flaky "74) test0835(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
// flaky "51) test0835(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200000L + "'", long20 == 25200000L);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
// flaky "32) test0835(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
// flaky "23) test0835(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.052" + "'", str33, "+00:00:00.052");
// flaky "21) test0835(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.052" + "'", str35, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 32L + "'", long37 == 32L);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        java.lang.String str18 = dateTimeZone3.getName(25200051L);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone3.isLocalDateTimeGap(localDateTime19);
        long long23 = dateTimeZone3.adjustOffset((-90600001L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "119) test0836(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "111) test0836(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 119399948L + "'", long16 == 119399948L);
// flaky "98) test0836(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.052" + "'", str18, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-90600001L) + "'", long23 == (-90600001L));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long23 = dateTimeZone20.adjustOffset((long) (short) 1, false);
        java.lang.String str25 = dateTimeZone20.getShortName(0L);
        long long29 = dateTimeZone20.convertLocalToUTC((-1L), false, (long) '#');
        int int31 = dateTimeZone20.getStandardOffset((-1570048924001L));
        long long34 = dateTimeZone20.adjustOffset((-1570084923900L), true);
        long long36 = dateTimeZone1.getMillisKeepLocal(dateTimeZone20, (-4L));
        java.lang.String str38 = dateTimeZone1.getName((-1570120923936L));
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
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.001" + "'", str25, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-2L) + "'", long29 == (-2L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1570084923900L) + "'", long34 == (-1570084923900L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-3660005L) + "'", long36 == (-3660005L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-01:01" + "'", str38, "-01:01");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.lang.Object obj5 = dateTimeZone2.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isFixed();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        long long11 = dateTimeZone9.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone9.getOffset(readableInstant12);
        java.lang.String str14 = dateTimeZone9.toString();
        long long16 = dateTimeZone9.previousTransition((long) (short) 1);
        boolean boolean18 = dateTimeZone9.isStandardOffset((-1570085464099L));
        long long21 = dateTimeZone9.convertLocalToUTC((-32339965L), true);
        boolean boolean22 = dateTimeZone2.equals((java.lang.Object) true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36000000 + "'", int13 == 36000000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-68339965L) + "'", long21 == (-68339965L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        boolean boolean21 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36000000 + "'", int8 == 36000000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:00" + "'", str10, "+10:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 151799999L + "'", long14 == 151799999L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-25200001L) + "'", long20 == (-25200001L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.convertUTCToLocal(100L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.lang.String str9 = dateTimeZone1.getNameKey((-91L));
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        int int29 = dateTimeZone1.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 36000000L + "'", long5 == 36000000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-35999991L) + "'", long7 == (-35999991L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36000000 + "'", int18 == 36000000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 36000000 + "'", int20 == 36000000);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-2L) + "'", long22 == (-2L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+10:00" + "'", str24, "+10:00");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 36000000 + "'", int26 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 0L);
        java.lang.String str12 = dateTimeZone1.getName(155400002L);
        long long15 = dateTimeZone1.convertLocalToUTC((-35999965L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36000000 + "'", int6 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 39600000L + "'", long10 == 39600000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-71999965L) + "'", long15 == (-71999965L));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        java.lang.String str17 = dateTimeZone5.getShortName((-3660001L));
        java.lang.Class<?> wildcardClass18 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36000000 + "'", int9 == 36000000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084923999L) + "'", long15 == (-1570084923999L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        long long23 = dateTimeZone1.adjustOffset((-1570081264200L), false);
        int int25 = dateTimeZone1.getOffsetFromLocal((-1570517524101L));
        boolean boolean26 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36000000 + "'", int8 == 36000000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:00" + "'", str10, "+10:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 151799999L + "'", long14 == 151799999L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-25200001L) + "'", long20 == (-25200001L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1570081264200L) + "'", long23 == (-1570081264200L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 36000000 + "'", int25 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(102L, false, 2L);
        java.lang.String str13 = dateTimeZone1.toString();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName(0L, locale15);
        java.lang.String str18 = dateTimeZone1.getName((-126600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 103L + "'", long12 == 103L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        long long23 = dateTimeZone2.adjustOffset((-115259968L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-206400000L) + "'", long20 == (-206400000L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-115259968L) + "'", long23 == (-115259968L));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-101L));
        long long9 = dateTimeZone1.adjustOffset((long) 3600000, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getName((-90059948L), locale17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 71999999L + "'", long8 == 71999999L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((-1570120924201L), locale6);
        long long10 = dateTimeZone2.adjustOffset(0L, true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:01" + "'", str7, "+32:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.convertUTCToLocal(100L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((-280800000L), locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        java.lang.String str10 = dateTimeZone1.getName((-25200001L));
        long long13 = dateTimeZone1.adjustOffset((long) 25200000, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long16 = dateTimeZone1.previousTransition((-1570012924051L));
        java.lang.Class<?> wildcardClass17 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "120) test0853(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
// flaky "112) test0853(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky "99) test0853(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 25200000L + "'", long13 == 25200000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570012924051L) + "'", long16 == (-1570012924051L));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getShortName((-1570164664001L), locale17);
        int int20 = dateTimeZone1.getStandardOffset((-1570200724101L));
        java.lang.Object obj21 = dateTimeZone1.writeReplace();
        boolean boolean23 = dateTimeZone1.isStandardOffset((-1570081264200L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "121) test0854(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky "113) test0854(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky "100) test0854(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999899L) + "'", long14 == (-35999899L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "75) test0854(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
// flaky "52) test0854(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        java.lang.String str12 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "122) test0855(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "114) test0855(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        long long27 = dateTimeZone12.nextTransition((long) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "123) test0856(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky "115) test0856(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky "101) test0856(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999899L) + "'", long14 == (-35999899L));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-97199901L) + "'", long25 == (-97199901L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        boolean boolean5 = dateTimeZone1.equals((java.lang.Object) dateTimeZone4);
        java.lang.String str6 = dateTimeZone4.toString();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone4.getShortName(102L, locale8);
        long long11 = dateTimeZone4.convertUTCToLocal((-2100002L));
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        long long17 = dateTimeZone13.convertLocalToUTC(100L, false, (-99L));
        long long19 = dateTimeZone4.getMillisKeepLocal(dateTimeZone13, (-244919865L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:35" + "'", str6, "+00:35");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:35" + "'", str9, "+00:35");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-2L) + "'", long11 == (-2L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-242819865L) + "'", long19 == (-242819865L));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str7 = dateTimeZone1.getID();
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) '4');
        long long11 = dateTimeZone1.previousTransition((-2L));
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        int int14 = dateTimeZone1.getOffsetFromLocal(90059998L);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-2L) + "'", long11 == (-2L));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        long long16 = dateTimeZone3.nextTransition((long) 52);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        java.lang.String str8 = dateTimeZone1.getName((-1570084924101L));
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        java.lang.String str16 = dateTimeZone11.getID();
        java.lang.String str18 = dateTimeZone11.getShortName(115799999L);
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 8L);
        java.lang.Class<?> wildcardClass21 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:00" + "'", str18, "+10:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-35999993L) + "'", long20 == (-35999993L));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.previousTransition(25200000L);
        long long7 = dateTimeZone1.nextTransition((-1570048923999L));
        java.lang.String str8 = dateTimeZone1.getID();
        long long10 = dateTimeZone1.nextTransition((-1570084984001L));
        long long14 = dateTimeZone1.convertLocalToUTC((-3599903L), false, (-1570048924046L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25200000L + "'", long5 == 25200000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570048923999L) + "'", long7 == (-1570048923999L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084984001L) + "'", long10 == (-1570084984001L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3599902L) + "'", long14 == (-3599902L));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        java.lang.String str24 = dateTimeZone1.toString();
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
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36000000 + "'", int21 == 36000000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 36000000 + "'", int23 == 36000000);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+10:00" + "'", str24, "+10:00");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.lang.String str7 = dateTimeZone1.getID();
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+10:00" + "'", str7, "+10:00");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        long long3 = dateTimeZone1.previousTransition(115800002L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-25740001L), locale5);
        java.lang.String str8 = dateTimeZone1.getNameKey(100L);
        long long12 = dateTimeZone1.convertLocalToUTC(90059899L, true, (-61199968L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115800002L + "'", long3 == 115800002L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+100:00" + "'", str6, "+100:00");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-269940101L) + "'", long12 == (-269940101L));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        boolean boolean14 = dateTimeZone12.isFixed();
        long long17 = dateTimeZone12.convertLocalToUTC((-115799904L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-151799904L) + "'", long17 == (-151799904L));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        boolean boolean7 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long15 = dateTimeZone12.convertLocalToUTC((-1570084924001L), false);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) long15);
        long long18 = dateTimeZone1.previousTransition((-91L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.lang.String str22 = dateTimeZone21.toString();
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone21.isLocalDateTimeGap(localDateTime23);
        boolean boolean25 = dateTimeZone1.equals((java.lang.Object) localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924000L) + "'", long15 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-91L) + "'", long18 == (-91L));
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        long long29 = dateTimeZone1.convertLocalToUTC((-3L), false, (-1570120923937L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25200001L) + "'", long16 == (-25200001L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 31L + "'", long20 == 31L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-2L) + "'", long29 == (-2L));
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC((-115799899L), true, 36000100L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone10.getOffset(readableInstant11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115799898L) + "'", long8 == (-115799898L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long3 = dateTimeZone1.convertUTCToLocal((long) 25200000);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) ' ');
        long long7 = dateTimeZone1.convertUTCToLocal((-1570084924099L));
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName((-1570084924102L), locale12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25200052L + "'", long3 == 25200052L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570084924047L) + "'", long7 == (-1570084924047L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.052" + "'", str10, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.052" + "'", str13, "+00:00:00.052");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        java.lang.String str22 = dateTimeZone3.getName(61200002L);
        int int24 = dateTimeZone3.getStandardOffset(34L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "124) test0871(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "116) test0871(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "102) test0871(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "76) test0871(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "53) test0871(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 119400000L + "'", long18 == 119400000L);
// flaky "33) test0871(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 360600000L + "'", long20 == 360600000L);
// flaky "24) test0871(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
// flaky "22) test0871(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        int int6 = dateTimeZone1.getOffset((long) 115800000);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((-1570200724001L), locale8);
        long long11 = dateTimeZone1.previousTransition(3660101L);
        java.lang.String str12 = dateTimeZone1.getID();
        java.lang.String str13 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3660101L + "'", long11 == 3660101L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone23.isLocalDateTimeGap(localDateTime24);
        int int27 = dateTimeZone23.getStandardOffset((long) (short) 0);
        long long29 = dateTimeZone23.previousTransition((long) '#');
        long long33 = dateTimeZone23.convertLocalToUTC(101L, true, (long) (byte) 0);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone23.getShortName(103L, locale35);
        long long38 = dateTimeZone2.getMillisKeepLocal(dateTimeZone23, 200L);
        long long40 = dateTimeZone23.convertUTCToLocal((-1570048924002L));
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
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "125) test0874(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 35L + "'", long29 == 35L);
// flaky "117) test0874(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 101L + "'", long33 == 101L);
// flaky "103) test0874(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
// flaky "77) test0874(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 60200L + "'", long38 == 60200L);
// flaky "54) test0874(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1570048924002L) + "'", long40 == (-1570048924002L));
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(129120000, 363120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 363120000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        java.lang.String str35 = dateTimeZone24.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "126) test0876(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "118) test0876(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "104) test0876(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky "78) test0876(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "55) test0876(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
// flaky "34) test0876(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570084924000L) + "'", long16 == (-1570084924000L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky "25) test0876(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 11L + "'", long20 == 11L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.001" + "'", str35, "+00:00:00.001");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 0);
        java.lang.String str3 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        int int17 = dateTimeZone3.getOffsetFromLocal(119400000L);
        int int19 = dateTimeZone3.getOffset((long) 360600000);
        int int21 = dateTimeZone3.getStandardOffset(36000100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "127) test0878(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "119) test0878(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "105) test0878(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "79) test0878(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "56) test0878(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky "35) test0878(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky "26) test0878(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) 25200001L);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        java.lang.String str12 = dateTimeZone6.getName((long) (byte) 10);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone6, (long) '4');
        long long16 = dateTimeZone6.convertUTCToLocal((long) ' ');
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone6.isLocalDateTimeGap(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "128) test0879(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
// flaky "120) test0879(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115260052L + "'", long14 == 115260052L);
// flaky "106) test0879(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        long long17 = dateTimeZone10.adjustOffset(155400002L, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "129) test0880(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "121) test0880(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 155400002L + "'", long17 == 155400002L);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        boolean boolean20 = dateTimeZone1.isStandardOffset(72000000L);
        java.lang.String str22 = dateTimeZone1.getNameKey(125940043L);
        long long26 = dateTimeZone1.convertLocalToUTC((-71459998L), true, 60032L);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-71459998L) + "'", long26 == (-71459998L));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        boolean boolean24 = dateTimeZone3.isFixed();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570084924000L) + "'", long16 == (-1570084924000L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 11L + "'", long20 == 11L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        long long13 = dateTimeZone1.adjustOffset(2L, true);
        java.lang.String str14 = dateTimeZone1.toString();
        long long18 = dateTimeZone1.convertLocalToUTC((-25740001L), false, (-1570048923900L));
        long long22 = dateTimeZone1.convertLocalToUTC(0L, false, 119340000L);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone1.getShortName(187199999L, locale24);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-25740000L) + "'", long18 == (-25740000L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        java.lang.String str4 = dateTimeZone2.getShortName(31L);
        int int6 = dateTimeZone2.getOffsetFromLocal((-90600001L));
        java.lang.Class<?> wildcardClass7 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:35" + "'", str4, "+00:35");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2100000 + "'", int6 == 2100000);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        java.util.TimeZone timeZone19 = dateTimeZone3.toTimeZone();
        long long22 = dateTimeZone3.adjustOffset((-115800098L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "130) test0885(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "122) test0885(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
// flaky "107) test0885(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
// flaky "80) test0885(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-35939969L) + "'", long18 == (-35939969L));
        org.junit.Assert.assertNotNull(timeZone19);
// flaky "57) test0885(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-115800098L) + "'", long22 == (-115800098L));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((-1570084924000L), locale6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        long long12 = dateTimeZone1.adjustOffset(11L, true);
        long long14 = dateTimeZone1.nextTransition((-1570200184100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1570200184100L) + "'", long14 == (-1570200184100L));
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        long long23 = dateTimeZone1.convertLocalToUTC((-151800099L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "131) test0887(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
// flaky "123) test0887(org.joda.time.RegressionTest1)":         org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25200001L) + "'", long16 == (-25200001L));
// flaky "108) test0887(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "81) test0887(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+10:00");
// flaky "58) test0887(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 36000032L + "'", long20 == 36000032L);
// flaky "36) test0887(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-187800099L) + "'", long23 == (-187800099L));
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getOffsetFromLocal(98L);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "132) test0888(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
// flaky "124) test0888(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:00" + "'", str3, "+10:00");
// flaky "109) test0888(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
// flaky "82) test0888(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), 363120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 363120000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        boolean boolean8 = dateTimeZone3.isFixed();
        long long10 = dateTimeZone3.nextTransition(103L);
        java.lang.String str12 = dateTimeZone3.getShortName((-1570120924000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "133) test0890(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 103L + "'", long10 == 103L);
// flaky "125) test0890(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        java.lang.Class<?> wildcardClass22 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "134) test0891(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "126) test0891(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
// flaky "110) test0891(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
// flaky "83) test0891(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
// flaky "59) test0891(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+10:00" + "'", str15, "+10:00");
// flaky "37) test0891(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
// flaky "27) test0891(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+10:00" + "'", str19, "+10:00");
// flaky "23) test0891(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36000000 + "'", int21 == 36000000);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        long long11 = dateTimeZone1.convertLocalToUTC(3660000L, false, (-1570012924001L));
        java.lang.String str12 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky "135) test0892(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+10:00");
// flaky "127) test0892(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-32340000L) + "'", long11 == (-32340000L));
// flaky "111) test0892(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
// flaky "84) test0892(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36000000 + "'", int14 == 36000000);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        java.lang.String str8 = dateTimeZone1.getName((-2L));
        boolean boolean10 = dateTimeZone1.isStandardOffset(89520051L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "136) test0893(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "128) test0893(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        long long8 = dateTimeZone1.nextTransition((-231599899L));
        long long10 = dateTimeZone1.nextTransition((-4L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "137) test0894(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-231599899L) + "'", long8 == (-231599899L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-4L) + "'", long10 == (-4L));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        boolean boolean8 = dateTimeZone3.isFixed();
        long long11 = dateTimeZone3.convertLocalToUTC((-1570084924101L), false);
        java.lang.Object obj12 = dateTimeZone3.writeReplace();
        long long14 = dateTimeZone3.nextTransition((-360599948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "138) test0895(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "129) test0895(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570120924101L) + "'", long11 == (-1570120924101L));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-360599948L) + "'", long14 == (-360599948L));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "139) test0896(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115260000 + "'", int7 == 115260000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "130) test0896(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "112) test0896(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        boolean boolean9 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        int int22 = dateTimeZone6.getOffsetFromLocal(231059997L);
        int int24 = dateTimeZone6.getStandardOffset((-1570275724001L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        java.lang.String str31 = dateTimeZone8.getID();
        boolean boolean33 = dateTimeZone8.equals((java.lang.Object) 115800097L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115800000 + "'", int6 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1570048924000L) + "'", long28 == (-1570048924000L));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str6 = dateTimeZone1.getShortName(2L);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str10 = dateTimeZone8.getNameKey((-1570012924100L));
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone8.getName(7L, locale12);
        long long15 = dateTimeZone8.nextTransition((-33899999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-33899999L) + "'", long15 == (-33899999L));
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        java.lang.String str26 = dateTimeZone3.getNameKey((-35999848L));
        java.lang.String str28 = dateTimeZone3.getNameKey(151200011L);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long15 = dateTimeZone12.convertLocalToUTC((-1570084924001L), false);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) long15);
        int int18 = dateTimeZone1.getStandardOffset((-1570197064001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924000L) + "'", long15 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        java.lang.Class<?> wildcardClass33 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115800000L + "'", long27 == 115800000L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.previousTransition((long) (short) 1);
        java.lang.String str9 = dateTimeZone1.getID();
        int int11 = dateTimeZone1.getStandardOffset((-1570048924000L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((long) '4', locale13);
        long long16 = dateTimeZone1.previousTransition((-1570120924102L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570120924102L) + "'", long16 == (-1570120924102L));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        int int17 = dateTimeZone1.getOffset((-349199999L));
        java.lang.String str18 = dateTimeZone1.toString();
        org.joda.time.tz.Provider provider19 = org.joda.time.DateTimeZone.getProvider();
        java.lang.Class<?> wildcardClass20 = provider19.getClass();
        boolean boolean21 = dateTimeZone1.equals((java.lang.Object) wildcardClass20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "140) test0907(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "131) test0907(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
// flaky "113) test0907(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky "85) test0907(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky "60) test0907(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+97:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+97:00\" is malformed at \"97:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(101L, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924200L));
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int10 = dateTimeZone1.getOffset(3660200L);
        java.lang.String str12 = dateTimeZone1.getName((-1570081324100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.052" + "'", str4, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.052" + "'", str6, "+00:00:00.052");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.052" + "'", str12, "+00:00:00.052");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 115260000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115260000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        java.util.TimeZone timeZone23 = dateTimeZone3.toTimeZone();
        java.lang.Class<?> wildcardClass24 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.052" + "'", str14, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.052" + "'", str17, "+00:00:00.052");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570200724049L) + "'", long20 == (-1570200724049L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (short) 0, true);
        long long7 = dateTimeZone1.nextTransition(1L);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        long long10 = dateTimeZone1.nextTransition(100L);
        long long12 = dateTimeZone1.nextTransition(32L);
        java.lang.String str13 = dateTimeZone1.getID();
        java.lang.String str15 = dateTimeZone1.getName((-2100002L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187200000, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 10);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone2.getOffset(readableInstant4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115800000 + "'", int5 == 115800000);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        boolean boolean7 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((-25740001L), locale10);
        int int13 = dateTimeZone1.getOffsetFromLocal(360600001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        int int27 = dateTimeZone1.getOffset((long) 126060000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570084924101L) + "'", long12 == (-1570084924101L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        long long10 = dateTimeZone1.nextTransition(97L);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName((-1569969663900L), locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "141) test0917(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3660000) + "'", int5 == (-3660000));
// flaky "132) test0917(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-01:01" + "'", str8, "-01:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "114) test0917(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-01:01" + "'", str16, "-01:01");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:35");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((-35999899L), locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((-1570192924001L), locale6);
        java.lang.String str8 = dateTimeZone1.toString();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((-115799999L), locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:35" + "'", str4, "+00:35");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:35" + "'", str7, "+00:35");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:35" + "'", str8, "+00:35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:35" + "'", str11, "+00:35");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        int int34 = dateTimeZone6.getOffset((long) '#');
        java.util.TimeZone timeZone35 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        int int38 = dateTimeZone36.getOffset(readableInstant37);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
// flaky "142) test0919(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
// flaky "133) test0919(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
// flaky "115) test0919(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
// flaky "86) test0919(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
// flaky "61) test0919(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115799900L + "'", long27 == 115799900L);
// flaky "38) test0919(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-100L) + "'", long30 == (-100L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
// flaky "28) test0919(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "143) test0920(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(obj6);
// flaky "134) test0920(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
// flaky "116) test0920(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
// flaky "87) test0920(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        long long9 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-90600000L));
        java.lang.String str10 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "144) test0921(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-90600000L) + "'", long9 == (-90600000L));
// flaky "135) test0921(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        long long29 = dateTimeZone15.adjustOffset((-115799901L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "145) test0922(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "136) test0922(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199900L + "'", long10 == 25199900L);
// flaky "117) test0922(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 98L + "'", long22 == 98L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 101L + "'", long24 == 101L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570012923999L) + "'", long26 == (-1570012923999L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-115799901L) + "'", long29 == (-115799901L));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        int int34 = dateTimeZone6.getOffset((long) '#');
        java.util.TimeZone timeZone35 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        int int38 = dateTimeZone36.getStandardOffset(60002L);
        java.lang.Class<?> wildcardClass39 = dateTimeZone36.getClass();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        boolean boolean10 = dateTimeZone3.equals((java.lang.Object) ' ');
        long long14 = dateTimeZone3.convertLocalToUTC(115800002L, false, (-1570048924000L));
        long long18 = dateTimeZone3.convertLocalToUTC(479399901L, false, (-190319968L));
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone3.getOffset(readableInstant19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115800001L + "'", long14 == 115800001L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 479399900L + "'", long18 == 479399900L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        java.util.TimeZone timeZone29 = dateTimeZone3.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.001" + "'", str21, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        long long11 = dateTimeZone1.convertLocalToUTC(115799900L, false);
        java.lang.String str13 = dateTimeZone1.getNameKey((-35999899L));
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25199999L + "'", long8 == 25199999L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115799899L + "'", long11 == 115799899L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(101L, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924200L));
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        long long11 = dateTimeZone1.convertLocalToUTC(28860000L, false, 51L);
        boolean boolean12 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.052" + "'", str4, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.052" + "'", str6, "+00:00:00.052");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 28859948L + "'", long11 == 28859948L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        long long26 = dateTimeZone2.adjustOffset((-1569969124103L), true);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1569969124103L) + "'", long26 == (-1569969124103L));
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        long long22 = dateTimeZone3.nextTransition((-35939934L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-35939934L) + "'", long22 == (-35939934L));
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(36000000);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str17 = dateTimeZone15.getShortName(3599999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        java.lang.String str4 = dateTimeZone2.getNameKey(1L);
        int int6 = dateTimeZone2.getStandardOffset(36000002L);
        java.lang.Class<?> wildcardClass7 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2100000 + "'", int6 == 2100000);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str7 = dateTimeZone1.getNameKey(36000100L);
        java.lang.String str8 = dateTimeZone1.getID();
        java.lang.String str9 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        int int42 = dateTimeZone13.getOffsetFromLocal((-36000000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "146) test0934(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "137) test0934(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "118) test0934(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
// flaky "88) test0934(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 36000000 + "'", int23 == 36000000);
        org.junit.Assert.assertNotNull(timeZone24);
// flaky "62) test0934(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+10:00");
// flaky "39) test0934(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+10:00" + "'", str27, "+10:00");
// flaky "29) test0934(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+10:00" + "'", str30, "+10:00");
// flaky "24) test0934(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+10:00" + "'", str33, "+10:00");
// flaky "16) test0934(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+10:00" + "'", str35, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky "11) test0934(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1570084924101L) + "'", long40 == (-1570084924101L));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj4 = dateTimeZone3.writeReplace();
        java.lang.String str5 = dateTimeZone3.getID();
        long long8 = dateTimeZone3.convertLocalToUTC((long) 'a', true);
        int int10 = dateTimeZone3.getStandardOffset(0L);
        long long14 = dateTimeZone3.convertLocalToUTC(102L, false, 2L);
        long long18 = dateTimeZone3.convertLocalToUTC((long) (byte) 1, false, (-25740001L));
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 119400001L);
        boolean boolean22 = dateTimeZone1.isStandardOffset((long) 126000000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 103L + "'", long14 == 103L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 155400002L + "'", long20 == 155400002L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        long long11 = dateTimeZone1.convertLocalToUTC((-1570084924101L), true);
        int int13 = dateTimeZone1.getOffsetFromLocal((-25200001L));
        long long15 = dateTimeZone1.convertUTCToLocal((-1570084924000L));
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getShortName((-35939969L), locale17);
        long long20 = dateTimeZone1.previousTransition(35999932L);
        java.lang.Object obj21 = dateTimeZone1.writeReplace();
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone1.getShortName(79800000L, locale23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone1.getOffset(readableInstant25);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "147) test0936(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
// flaky "138) test0936(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924102L) + "'", long11 == (-1570084924102L));
// flaky "119) test0936(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky "89) test0936(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084923999L) + "'", long15 == (-1570084923999L));
// flaky "63) test0936(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35999932L + "'", long20 == 35999932L);
        org.junit.Assert.assertNotNull(obj21);
// flaky "40) test0936(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
// flaky "30) test0936(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone12.getName(98L, locale16);
        java.lang.Class<?> wildcardClass18 = dateTimeZone12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "148) test0937(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky "139) test0937(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky "120) test0937(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999899L) + "'", long14 == (-35999899L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone1.getName(231059997L, locale31);
        java.lang.String str33 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
// flaky "149) test0938(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-25200001L) + "'", long25 == (-25200001L));
// flaky "140) test0938(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 95L + "'", long27 == 95L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-00:00:00.001" + "'", str33, "-00:00:00.001");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.convertUTCToLocal(100L);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        long long9 = dateTimeZone1.nextTransition(132L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 132L + "'", long9 == 132L);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        long long19 = dateTimeZone3.convertLocalToUTC(60000L, true, (-231599899L));
        long long21 = dateTimeZone3.nextTransition(60001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "150) test0940(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "141) test0940(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
// flaky "121) test0940(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
// flaky "90) test0940(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 59999L + "'", long19 == 59999L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 60001L + "'", long21 == 60001L);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
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
        long long20 = dateTimeZone1.convertUTCToLocal(119400000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "151) test0941(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
// flaky "142) test0941(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky "122) test0941(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2L) + "'", long14 == (-2L));
// flaky "91) test0941(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
// flaky "64) test0941(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
// flaky "41) test0941(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 119400001L + "'", long20 == 119400001L);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        long long36 = dateTimeZone6.nextTransition(151740001L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
// flaky "152) test0942(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
// flaky "143) test0942(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
// flaky "123) test0942(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
// flaky "92) test0942(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
// flaky "65) test0942(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115799900L + "'", long27 == 115799900L);
// flaky "42) test0942(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
// flaky "31) test0942(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 3L + "'", long32 == 3L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 151740001L + "'", long36 == 151740001L);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        boolean boolean22 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "153) test0943(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "144) test0943(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924099L) + "'", long10 == (-1570084924099L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-36000001L) + "'", long12 == (-36000001L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-35999999L) + "'", long17 == (-35999999L));
// flaky "124) test0943(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-360599999L) + "'", long19 == (-360599999L));
// flaky "93) test0943(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean4 = dateTimeZone1.isStandardOffset(98L);
        int int6 = dateTimeZone1.getOffset((-90600100L));
        java.lang.String str8 = dateTimeZone1.getNameKey((-3660000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "154) test0944(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "145) test0944(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((-1570084924000L), locale6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        java.lang.String str10 = dateTimeZone1.toString();
        java.lang.String str12 = dateTimeZone1.getShortName((long) 52);
        boolean boolean14 = dateTimeZone1.isStandardOffset((-115799900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(129120000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean3 = dateTimeZone1.isStandardOffset(60000L);
        java.lang.String str5 = dateTimeZone1.getShortName((-206400000L));
        long long8 = dateTimeZone1.convertLocalToUTC(3L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4L + "'", long8 == 4L);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(102L, false, 2L);
        long long16 = dateTimeZone1.convertLocalToUTC((long) (byte) 1, false, (-25740001L));
        java.lang.Class<?> wildcardClass17 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 103L + "'", long12 == 103L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        java.lang.String str24 = dateTimeZone12.getName(119340000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "155) test0949(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky "146) test0949(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky "125) test0949(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999899L) + "'", long14 == (-35999899L));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+10:00" + "'", str24, "+10:00");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long19 = dateTimeZone1.adjustOffset((-1570120923936L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36000000 + "'", int8 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+10:00" + "'", str15, "+10:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1570120923936L) + "'", long19 == (-1570120923936L));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        java.lang.String str5 = dateTimeZone1.toString();
        long long7 = dateTimeZone1.convertUTCToLocal(25200001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 61200001L + "'", long7 == 61200001L);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        int int19 = dateTimeZone6.getOffsetFromLocal((-280800000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 79260052L + "'", long14 == 79260052L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36000000 + "'", int19 == 36000000);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str3 = dateTimeZone1.getShortName((-1570048923902L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:00" + "'", str3, "+32:00");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        long long27 = dateTimeZone4.nextTransition(32340032L);
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = dateTimeZone4.isLocalDateTimeGap(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115800000 + "'", int9 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:00" + "'", str18, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-35999900L) + "'", long22 == (-35999900L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 231059997L + "'", long24 == 231059997L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32340032L + "'", long27 == 32340032L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        java.lang.String str19 = dateTimeZone3.toString();
        java.lang.Object obj20 = dateTimeZone3.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 119399900L + "'", long16 == 119399900L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9L + "'", long18 == 9L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        long long7 = dateTimeZone2.adjustOffset(89519901L, false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3600000 + "'", int4 == 3600000);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 89519901L + "'", long7 == 89519901L);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        boolean boolean9 = dateTimeZone3.equals((java.lang.Object) (byte) 0);
        java.util.TimeZone timeZone10 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long8 = dateTimeZone1.previousTransition((long) (byte) 1);
        int int10 = dateTimeZone1.getOffset((-35999993L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, (-3660000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3660000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(129120000, 2100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 2100000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj7 = dateTimeZone6.writeReplace();
        java.lang.String str8 = dateTimeZone6.getID();
        long long11 = dateTimeZone6.convertLocalToUTC((long) 'a', true);
        java.lang.String str13 = dateTimeZone6.getNameKey((-1570084924201L));
        long long15 = dateTimeZone2.getMillisKeepLocal(dateTimeZone6, (long) (short) 1);
        long long18 = dateTimeZone6.convertLocalToUTC((-1570197064001L), false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 36000002L + "'", long15 == 36000002L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570197064000L) + "'", long18 == (-1570197064000L));
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        boolean boolean14 = dateTimeZone1.isStandardOffset(35999800L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        java.lang.String str24 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25199999L + "'", long19 == 25199999L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 119400099L + "'", long21 == 119400099L);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        boolean boolean11 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
        java.lang.String str15 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360600000, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        boolean boolean7 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        java.lang.String str21 = dateTimeZone1.getShortName(3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924000L) + "'", long15 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long10 = dateTimeZone1.convertUTCToLocal(25200000L);
        java.lang.String str12 = dateTimeZone1.getNameKey(43800000L);
        long long14 = dateTimeZone1.previousTransition(363120000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199999L + "'", long10 == 25199999L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 363120000L + "'", long14 == 363120000L);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        java.lang.String str8 = dateTimeZone1.getName((-1570084924101L));
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-35999901L), locale12);
        boolean boolean14 = dateTimeZone1.isFixed();
        int int16 = dateTimeZone1.getOffsetFromLocal((-206400000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        long long23 = dateTimeZone3.nextTransition((-1570120984000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 119399900L + "'", long16 == 119399900L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9L + "'", long18 == 9L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 61200002L + "'", long21 == 61200002L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1570120984000L) + "'", long23 == (-1570120984000L));
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone1.getName(94L, locale20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone1.getShortName((-59903L), locale23);
        int int26 = dateTimeZone1.getOffset((-349199899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25200001L) + "'", long16 == (-25200001L));
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2100000, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (short) 0);
        long long5 = dateTimeZone2.convertLocalToUTC((long) 0, false);
        boolean boolean7 = dateTimeZone2.isStandardOffset(2100002L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-349200000L) + "'", long5 == (-349200000L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        int int17 = dateTimeZone1.getOffset((-349199999L));
        java.lang.String str19 = dateTimeZone1.getName((-1570517524001L));
        long long21 = dateTimeZone1.convertUTCToLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        int int16 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        long long19 = dateTimeZone1.adjustOffset((-25200002L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-25200002L) + "'", long19 == (-25200002L));
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.previousTransition((long) (short) 1);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-1570085464099L));
        int int12 = dateTimeZone1.getOffset(101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getNameKey(101L);
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName(0L, locale14);
        long long18 = dateTimeZone1.convertLocalToUTC((-1570120923836L), true);
        long long21 = dateTimeZone1.adjustOffset(71999948L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570120923936L) + "'", long18 == (-1570120923936L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 71999948L + "'", long21 == 71999948L);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        boolean boolean7 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        long long22 = dateTimeZone1.nextTransition(25200052L);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 25200052L + "'", long22 == 25200052L);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        java.lang.String str12 = dateTimeZone10.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2100000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        long long11 = dateTimeZone1.convertLocalToUTC(3660000L, false, (-1570012924001L));
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3660001L + "'", long11 == 3660001L);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        java.lang.String str4 = dateTimeZone2.getShortName(31L);
        int int6 = dateTimeZone2.getOffsetFromLocal((-90600001L));
        boolean boolean8 = dateTimeZone2.isStandardOffset((-25200000L));
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone2.isLocalDateTimeGap(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:35" + "'", str4, "+00:35");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2100000 + "'", int6 == 2100000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187200000, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str26 = dateTimeZone24.getShortName((-25200001L));
        java.lang.Object obj27 = dateTimeZone24.writeReplace();
        boolean boolean28 = dateTimeZone14.equals((java.lang.Object) dateTimeZone24);
        int int30 = dateTimeZone24.getOffset(60002L);
        java.lang.String str32 = dateTimeZone24.getName((long) (byte) 1);
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
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone3.getName((-349199999L), locale17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getStandardOffset((-35999800L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        int int26 = dateTimeZone3.getOffsetFromLocal((-1570084384100L));
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 101L + "'", long24 == 101L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        java.lang.String str20 = dateTimeZone3.getID();
        long long23 = dateTimeZone3.convertLocalToUTC((-320399963L), true);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-320399962L) + "'", long23 == (-320399962L));
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.String str3 = dateTimeZone1.getShortName((-1570084923900L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.String str8 = dateTimeZone7.getID();
        long long10 = dateTimeZone7.previousTransition((-1L));
        long long14 = dateTimeZone7.convertLocalToUTC(25200000L, true, 100L);
        long long16 = dateTimeZone5.getMillisKeepLocal(dateTimeZone7, 100L);
        java.lang.String str18 = dateTimeZone5.getNameKey(115799900L);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        long long24 = dateTimeZone20.getMillisKeepLocal(dateTimeZone22, (long) 'a');
        int int26 = dateTimeZone22.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone27 = dateTimeZone22.toTimeZone();
        java.util.TimeZone timeZone28 = dateTimeZone22.toTimeZone();
        boolean boolean29 = dateTimeZone5.equals((java.lang.Object) timeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
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
        long long50 = dateTimeZone38.adjustOffset((long) (short) -1, false);
        boolean boolean51 = dateTimeZone38.isFixed();
        boolean boolean52 = dateTimeZone31.equals((java.lang.Object) dateTimeZone38);
        java.lang.String str53 = dateTimeZone38.toString();
        long long55 = dateTimeZone1.getMillisKeepLocal(dateTimeZone38, 79260052L);
        boolean boolean56 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.100" + "'", str3, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 25200001L + "'", long14 == 25200001L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 102L + "'", long16 == 102L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 115800000 + "'", int36 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 97L + "'", long42 == 97L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-00:00:00.001" + "'", str45, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "-00:00:00.001" + "'", str53, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 79260153L + "'", long55 == 79260153L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        long long13 = dateTimeZone1.adjustOffset(2L, true);
        java.lang.String str14 = dateTimeZone1.toString();
        java.lang.String str16 = dateTimeZone1.getShortName(119340000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        long long18 = dateTimeZone1.convertUTCToLocal((long) (-1));
        java.util.TimeZone timeZone19 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25200001L) + "'", long16 == (-25200001L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-2L) + "'", long18 == (-2L));
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        long long31 = dateTimeZone1.convertUTCToLocal(151799999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 151799998L + "'", long31 == 151799998L);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(363120000, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        long long9 = dateTimeZone1.nextTransition((-115799999L));
        java.util.Set<java.lang.String> strSet10 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) strSet10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((-1570120924102L), locale13);
        java.lang.Class<?> wildcardClass15 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115799999L) + "'", long9 == (-115799999L));
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        int int12 = dateTimeZone1.getStandardOffset((long) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        long long23 = dateTimeZone2.convertUTCToLocal((-101L));
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 59899L + "'", long23 == 59899L);
    }
}
