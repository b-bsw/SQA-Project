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
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getOffsetFromLocal((-25200002L));
        int int4 = dateTimeZone0.getOffset((-25200101L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "1) test0501(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6720000 + "'", int2 == 6720000);
// flaky "1) test0501(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6720000 + "'", int4 == 6720000);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        java.lang.String str15 = dateTimeZone3.getID();
        boolean boolean17 = dateTimeZone3.isStandardOffset((long) (short) -1);
        int int19 = dateTimeZone3.getStandardOffset((long) 100);
        java.lang.Class<?> wildcardClass20 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "2) test0503(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6720000 + "'", int7 == 6720000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "2) test0503(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:52");
// flaky "1) test0503(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:52" + "'", str11, "+01:52");
// flaky "1) test0503(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:52" + "'", str14, "+01:52");
// flaky "1) test0503(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+01:52" + "'", str15, "+01:52");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "1) test0503(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6720000 + "'", int19 == 6720000);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        long long5 = dateTimeZone1.convertLocalToUTC((-61199999L), true, 54L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-187199999L) + "'", long5 == (-187199999L));
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+10:01");
        java.lang.String str2 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:01" + "'", str2, "+10:01");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.toString();
        long long7 = dateTimeZone1.convertLocalToUTC((-1L), false, (long) 1);
        boolean boolean9 = dateTimeZone1.isStandardOffset(115799800L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "3) test0506(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:52" + "'", str2, "+01:52");
// flaky "3) test0506(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+01:52" + "'", str3, "+01:52");
// flaky "2) test0506(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-6720001L) + "'", long7 == (-6720001L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj6 = dateTimeZone5.writeReplace();
        java.lang.Object obj7 = dateTimeZone5.writeReplace();
        int int9 = dateTimeZone5.getOffsetFromLocal((long) (short) 10);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) int9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName(0L, locale12);
        java.lang.Object obj14 = dateTimeZone1.writeReplace();
        int int16 = dateTimeZone1.getStandardOffset(79800104L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "4) test0507(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:52" + "'", str13, "+01:52");
        org.junit.Assert.assertNotNull(obj14);
// flaky "4) test0507(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6720000 + "'", int16 == 6720000);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset(0L);
        boolean boolean5 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.getShortName(100L);
        java.lang.String str9 = dateTimeZone1.getNameKey(21600000L);
        boolean boolean10 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = false; // flaky "5) test0509(org.joda.time.RegressionTest1)": dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        java.lang.String str13 = dateTimeZone1.getShortName(32L);
        long long16 = dateTimeZone1.convertLocalToUTC((-25200001L), true);
        long long18 = dateTimeZone1.nextTransition((-35999897L));
        long long20 = dateTimeZone1.convertUTCToLocal((-1570200723999L));
        java.lang.String str22 = dateTimeZone1.getName(134L);
        java.lang.Object obj23 = null;
        boolean boolean24 = dateTimeZone1.equals(obj23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "5) test0509(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6720000 + "'", int5 == 6720000);
// flaky "3) test0509(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:52" + "'", str8, "+01:52");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky "2) test0509(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+01:52");
// flaky "2) test0509(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:52" + "'", str13, "+01:52");
// flaky "2) test0509(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-31920001L) + "'", long16 == (-31920001L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-35999897L) + "'", long18 == (-35999897L));
// flaky "1) test0509(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570194003999L) + "'", long20 == (-1570194003999L));
// flaky "1) test0509(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+01:52" + "'", str22, "+01:52");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 1);
        java.lang.String str4 = dateTimeZone2.getNameKey((-1570084924101L));
        java.lang.String str6 = dateTimeZone2.getNameKey((-115800000L));
        java.util.TimeZone timeZone7 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+10:01");
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forID("+10:00");
        java.lang.String str6 = dateTimeZone5.getID();
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) dateTimeZone5);
        boolean boolean8 = dateTimeZone5.isFixed();
        long long11 = dateTimeZone5.convertLocalToUTC((-3599802L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+01:00" + "'", str3, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-39599802L) + "'", long11 == (-39599802L));
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
        int int21 = dateTimeZone3.getOffset(0L);
        java.lang.Class<?> wildcardClass22 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "6) test0512(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6720000 + "'", int7 == 6720000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "6) test0512(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:52");
// flaky "4) test0512(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:52" + "'", str11, "+01:52");
// flaky "3) test0512(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:52" + "'", str14, "+01:52");
// flaky "3) test0512(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+01:52" + "'", str15, "+01:52");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "3) test0512(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6720000 + "'", int19 == 6720000);
// flaky "2) test0512(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6720000 + "'", int21 == 6720000);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj6 = dateTimeZone5.writeReplace();
        java.lang.Object obj7 = dateTimeZone5.writeReplace();
        int int9 = dateTimeZone5.getOffsetFromLocal((long) (short) 10);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) int9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName(0L, locale12);
        java.lang.Object obj14 = dateTimeZone1.writeReplace();
        boolean boolean16 = dateTimeZone1.isStandardOffset((-1569933124000L));
        int int18 = dateTimeZone1.getStandardOffset(9L);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone1.getShortName(0L, locale20);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = false; // flaky "7) test0513(org.joda.time.RegressionTest1)": dateTimeZone1.isLocalDateTimeGap(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "7) test0513(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:52" + "'", str13, "+01:52");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky "5) test0513(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6720000 + "'", int18 == 6720000);
// flaky "4) test0513(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+01:52" + "'", str21, "+01:52");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
        long long25 = dateTimeZone1.convertUTCToLocal((-6720044L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "8) test0514(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:52" + "'", str8, "+01:52");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "8) test0514(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:52" + "'", str13, "+01:52");
// flaky "6) test0514(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570078204101L) + "'", long15 == (-1570078204101L));
// flaky "5) test0514(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6720000 + "'", int17 == 6720000);
// flaky "4) test0514(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6720000 + "'", int19 == 6720000);
// flaky "4) test0514(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+01:52" + "'", str20, "+01:52");
// flaky "3) test0514(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+01:52" + "'", str22, "+01:52");
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "2) test0514(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+01:52");
// flaky "1) test0514(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-44L) + "'", long25 == (-44L));
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(349200000, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        boolean boolean26 = false; // flaky "9) test0516(org.joda.time.RegressionTest1)": dateTimeZone13.isLocalDateTimeGap(localDateTime25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "9) test0516(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:01" + "'", str8, "+10:01");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "7) test0516(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36060000 + "'", int17 == 36060000);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "6) test0516(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+10:01");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky "5) test0516(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+10:01");
// flaky "5) test0516(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 36060000L + "'", long21 == 36060000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
// flaky "4) test0516(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+10:01" + "'", str24, "+10:01");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 97L);
        int int18 = dateTimeZone1.getStandardOffset((long) 1);
        boolean boolean19 = dateTimeZone1.isFixed();
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone1.getShortName(47L, locale21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "10) test0517(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:01" + "'", str4, "+10:01");
// flaky "10) test0517(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "8) test0517(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-10860000L) + "'", long10 == (-10860000L));
// flaky "7) test0517(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-36059899L) + "'", long12 == (-36059899L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599902L) + "'", long16 == (-3599902L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = false; // flaky "11) test0518(org.joda.time.RegressionTest1)": dateTimeZone3.isLocalDateTimeGap(localDateTime8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone3.getOffset(readableInstant10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone3.getShortName((long) 10, locale14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "11) test0518(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36060000 + "'", int7 == 36060000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "9) test0518(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36060000 + "'", int11 == 36060000);
// flaky "8) test0518(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+10:01" + "'", str15, "+10:01");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        java.lang.String str7 = dateTimeZone1.toString();
        int int9 = dateTimeZone1.getOffset((-1570084924000L));
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(360000111L, locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "12) test0520(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36060000 + "'", int5 == 36060000);
// flaky "12) test0520(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:01" + "'", str6, "+10:01");
// flaky "10) test0520(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+10:01" + "'", str7, "+10:01");
// flaky "9) test0520(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36060000 + "'", int9 == 36060000);
// flaky "6) test0520(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:01" + "'", str12, "+10:01");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        int int22 = dateTimeZone1.getOffsetFromLocal((long) 100);
        int int24 = dateTimeZone1.getOffsetFromLocal((-1569963004101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "13) test0521(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:00" + "'", str2, "+32:00");
// flaky "13) test0521(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "11) test0521(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky "10) test0521(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115199948L) + "'", long15 == (-115199948L));
// flaky "7) test0521(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-115200001L) + "'", long19 == (-115200001L));
// flaky "6) test0521(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
// flaky "5) test0521(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
// flaky "3) test0521(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 115200000 + "'", int24 == 115200000);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        int int10 = dateTimeZone1.getStandardOffset((long) 0);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        boolean boolean13 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        long long29 = dateTimeZone3.adjustOffset((-48L), false);
        java.lang.String str30 = dateTimeZone3.toString();
        java.lang.String str32 = dateTimeZone3.getName((-1570091644001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "14) test0523(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "14) test0523(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "12) test0523(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
// flaky "11) test0523(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115200000L + "'", long11 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "8) test0523(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200010L + "'", long15 == 115200010L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
// flaky "7) test0523(org.joda.time.RegressionTest1)":         org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "6) test0523(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-115200000L) + "'", long26 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-48L) + "'", long29 == (-48L));
// flaky "4) test0523(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
// flaky "2) test0523(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:00" + "'", str32, "+32:00");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        int int22 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long24 = dateTimeZone1.previousTransition(1L);
        java.lang.String str26 = dateTimeZone1.getName(135L);
        java.lang.String str27 = dateTimeZone1.getID();
        long long29 = dateTimeZone1.previousTransition(36060000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "15) test0524(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:00" + "'", str2, "+32:00");
// flaky "15) test0524(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "13) test0524(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky "12) test0524(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115199948L) + "'", long15 == (-115199948L));
// flaky "9) test0524(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-115200001L) + "'", long19 == (-115200001L));
// flaky "8) test0524(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
// flaky "7) test0524(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
// flaky "5) test0524(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
// flaky "3) test0524(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:00" + "'", str26, "+32:00");
// flaky "1) test0524(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
// flaky "1) test0524(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 36060000L + "'", long29 == 36060000L);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        java.lang.String str20 = dateTimeZone14.getShortName((-1570200124102L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "16) test0525(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
// flaky "16) test0525(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "14) test0525(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-90000000L) + "'", long10 == (-90000000L));
// flaky "13) test0525(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-115199899L) + "'", long12 == (-115199899L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599902L) + "'", long16 == (-3599902L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25199900L + "'", long18 == 25199900L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+01:00" + "'", str20, "+01:00");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition((long) (-1));
        java.lang.String str5 = dateTimeZone1.getShortName((-10799999L));
        long long8 = dateTimeZone1.adjustOffset((-1570045323900L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1570045323900L) + "'", long8 == (-1570045323900L));
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        java.lang.String str20 = dateTimeZone11.getName((long) 36000000);
        boolean boolean21 = dateTimeZone11.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "17) test0528(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:00" + "'", str2, "+32:00");
// flaky "17) test0528(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "15) test0528(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
// flaky "14) test0528(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky "10) test0528(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
// flaky "9) test0528(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
// flaky "8) test0528(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 102L + "'", long16 == 102L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25199948L + "'", long18 == 25199948L);
// flaky "6) test0528(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
// flaky "4) test0528(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = false; // flaky "18) test0529(org.joda.time.RegressionTest1)": dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        int int8 = dateTimeZone1.getOffset(100L);
        java.lang.String str10 = dateTimeZone1.getShortName((-1569969124002L));
        java.lang.String str12 = dateTimeZone1.getNameKey((-92L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "18) test0529(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:00" + "'", str2, "+32:00");
// flaky "16) test0529(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "15) test0529(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
// flaky "11) test0529(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
// flaky "10) test0529(org.joda.time.RegressionTest1)":         org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(349200000, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        java.util.TimeZone timeZone22 = dateTimeZone12.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "19) test0531(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "19) test0531(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
// flaky "17) test0531(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 25199999L + "'", long17 == 25199999L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
// flaky "16) test0531(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 89999998L + "'", long21 == 89999998L);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        boolean boolean24 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "20) test0532(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:00" + "'", str2, "+32:00");
// flaky "20) test0532(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "18) test0532(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky "17) test0532(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115199948L) + "'", long15 == (-115199948L));
// flaky "12) test0532(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-115200001L) + "'", long19 == (-115200001L));
// flaky "11) test0532(org.joda.time.RegressionTest1)":         org.junit.Assert.assertNull(str21);
// flaky "9) test0532(org.joda.time.RegressionTest1)":         org.junit.Assert.assertNull(str23);
// flaky "7) test0532(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115200000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        long long28 = dateTimeZone3.convertLocalToUTC(360000000L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "21) test0534(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "21) test0534(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
// flaky "19) test0534(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
// flaky "18) test0534(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
// flaky "13) test0534(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
// flaky "12) test0534(org.joda.time.RegressionTest1)":         org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "10) test0534(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1569933723900L) + "'", long24 == (-1569933723900L));
// flaky "8) test0534(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 244800000L + "'", long28 == 244800000L);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) '4');
        java.lang.Class<?> wildcardClass3 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        java.lang.String str10 = dateTimeZone1.getShortName((-3599902L));
        java.lang.String str11 = dateTimeZone1.getID();
        int int13 = dateTimeZone1.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long9 = dateTimeZone1.convertLocalToUTC(25199999L, false, 79800000L);
        long long11 = dateTimeZone1.nextTransition((-115799999L));
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 25199899L + "'", long9 == 25199899L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115799999L) + "'", long11 == (-115799999L));
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
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
        java.lang.Class<?> wildcardClass26 = dateTimeZone8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 110L + "'", long23 == 110L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-67L) + "'", long25 == (-67L));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        boolean boolean12 = dateTimeZone1.isStandardOffset((-1570084924000L));
        long long16 = dateTimeZone1.convertLocalToUTC((long) '#', false, (long) (short) -1);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone1.isLocalDateTimeGap(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 36L + "'", long16 == 36L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        long long5 = dateTimeZone1.convertLocalToUTC((-1570084924102L), false);
        int int7 = dateTimeZone1.getOffset(115800000L);
        java.lang.String str9 = dateTimeZone1.getShortName(25200000L);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long15 = dateTimeZone12.convertLocalToUTC((-1570084924001L), false);
        int int17 = dateTimeZone12.getOffsetFromLocal((-1570084924000L));
        int int19 = dateTimeZone12.getOffset(97L);
        java.lang.Object obj20 = dateTimeZone12.writeReplace();
        long long22 = dateTimeZone12.nextTransition(32L);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, (-25200002L));
        long long27 = dateTimeZone1.adjustOffset((-99L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570084924101L) + "'", long5 == (-1570084924101L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924000L) + "'", long15 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-25200002L) + "'", long24 == (-25200002L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-99L) + "'", long27 == (-99L));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 'a');
        int int14 = dateTimeZone1.getStandardOffset(187199902L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long3 = dateTimeZone1.nextTransition((long) 36000000);
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 36000000L + "'", long3 == 36000000L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int3 = dateTimeZone1.getOffset(111L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long8 = dateTimeZone5.convertLocalToUTC((-1570084924001L), false);
        int int10 = dateTimeZone5.getOffsetFromLocal((-1570084924000L));
        java.lang.String str12 = dateTimeZone5.getShortName((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        java.lang.String str15 = dateTimeZone5.getShortName((-1570084924000L));
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone5.getOffset(readableInstant16);
        long long20 = dateTimeZone5.adjustOffset(112L, true);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 0L);
        long long25 = dateTimeZone1.convertLocalToUTC((-25199903L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1570084924000L) + "'", long8 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 112L + "'", long20 == 112L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-25199903L) + "'", long25 == (-25199903L));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        long long11 = dateTimeZone1.nextTransition((long) ' ');
        int int13 = dateTimeZone1.getStandardOffset(115799900L);
        java.lang.String str15 = dateTimeZone1.getShortName((-32399997L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        int int5 = dateTimeZone1.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        int int10 = dateTimeZone1.getOffsetFromLocal(79800104L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        java.lang.String str9 = dateTimeZone1.getID();
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) (-47L));
        java.lang.String str12 = dateTimeZone1.toString();
        java.lang.String str14 = dateTimeZone1.getShortName((-39599799L));
        boolean boolean15 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        long long5 = dateTimeZone1.convertUTCToLocal((-1570048924000L));
        boolean boolean6 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570048924001L) + "'", long5 == (-1570048924001L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int3 = dateTimeZone1.getOffset(111L);
        long long6 = dateTimeZone1.adjustOffset((long) 349800000, true);
        int int8 = dateTimeZone1.getOffsetFromLocal(135L);
        java.lang.String str10 = dateTimeZone1.getNameKey(3L);
        int int12 = dateTimeZone1.getOffset(97L);
        boolean boolean14 = dateTimeZone1.isStandardOffset((-36000200L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 349800000L + "'", long6 == 349800000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName(79800000L, locale14);
        java.lang.String str17 = dateTimeZone1.getShortName((-35999990L));
        long long19 = dateTimeZone1.previousTransition((-35999865L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "22) test0549(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
// flaky "22) test0549(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "20) test0549(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
// flaky "19) test0549(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
// flaky "14) test0549(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-35999865L) + "'", long19 == (-35999865L));
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 0);
        java.lang.Object obj3 = dateTimeZone2.writeReplace();
        java.lang.String str4 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:00" + "'", str4, "+100:00");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long3 = dateTimeZone1.previousTransition((long) '4');
        long long5 = dateTimeZone1.convertUTCToLocal(111L);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+100:00' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 360000111L + "'", long5 == 360000111L);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+:0:00");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((-1L), locale10);
        boolean boolean12 = dateTimeZone1.isFixed();
        long long14 = dateTimeZone1.nextTransition(34L);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "23) test0552(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "23) test0552(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25199900L + "'", long8 == 25199900L);
// flaky "21) test0552(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 34L + "'", long14 == 34L);
// flaky "20) test0552(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str5 = dateTimeZone1.toString();
        long long7 = dateTimeZone1.nextTransition((-1570084924001L));
        int int9 = dateTimeZone1.getStandardOffset((-35999999L));
        java.lang.String str10 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570084924001L) + "'", long7 == (-1570084924001L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        int int4 = dateTimeZone0.getOffset(98L);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone0.getOffset(readableInstant5);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        java.lang.String str5 = dateTimeZone2.getID();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getShortName((-91L), locale7);
        java.lang.String str10 = dateTimeZone2.getName((long) 52);
        java.util.TimeZone timeZone11 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:10" + "'", str5, "+32:10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:10" + "'", str8, "+32:10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:10" + "'", str10, "+32:10");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int29 = dateTimeZone27.getStandardOffset((long) 10);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        long long38 = dateTimeZone34.getMillisKeepLocal(dateTimeZone36, (long) 'a');
        int int40 = dateTimeZone36.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone41 = dateTimeZone36.toTimeZone();
        java.util.TimeZone timeZone42 = dateTimeZone36.toTimeZone();
        long long44 = dateTimeZone36.nextTransition((long) (short) -1);
        long long46 = dateTimeZone31.getMillisKeepLocal(dateTimeZone36, 110L);
        long long48 = dateTimeZone27.getMillisKeepLocal(dateTimeZone31, (-1570048923900L));
        java.util.Locale locale50 = null;
        java.lang.String str51 = dateTimeZone27.getName((long) ' ', locale50);
        org.joda.time.ReadableInstant readableInstant52 = null;
        int int53 = dateTimeZone27.getOffset(readableInstant52);
        boolean boolean54 = dateTimeZone21.equals((java.lang.Object) int53);
        java.lang.Class<?> wildcardClass55 = dateTimeZone21.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "24) test0556(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "24) test0556(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.052" + "'", str11, "+00:00:00.052");
// flaky "22) test0556(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.052" + "'", str14, "+00:00:00.052");
// flaky "21) test0556(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.052" + "'", str15, "+00:00:00.052");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "15) test0556(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1570048923848L) + "'", long24 == (-1570048923848L));
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 115800000 + "'", int29 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 97L + "'", long38 == 97L);
// flaky "13) test0556(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
// flaky "11) test0556(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 158L + "'", long46 == 158L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1569933124000L) + "'", long48 == (-1569933124000L));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+32:10" + "'", str51, "+32:10");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 115800000 + "'", int53 == 115800000);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
        int int35 = dateTimeZone3.getOffsetFromLocal(115799798L);
        long long37 = dateTimeZone3.convertUTCToLocal(210L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "25) test0557(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "25) test0557(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.052" + "'", str11, "+00:00:00.052");
// flaky "23) test0557(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.052" + "'", str14, "+00:00:00.052");
// flaky "22) test0557(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.052" + "'", str15, "+00:00:00.052");
// flaky "16) test0557(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.052" + "'", str16, "+00:00:00.052");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
// flaky "14) test0557(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.052" + "'", str18, "+00:00:00.052");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
// flaky "12) test0557(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
// flaky "9) test0557(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.052" + "'", str27, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
// flaky "5) test0557(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
// flaky "2) test0557(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
// flaky "2) test0557(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 262L + "'", long37 == 262L);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        java.lang.String str5 = dateTimeZone1.getNameKey(1L);
        int int7 = dateTimeZone1.getOffsetFromLocal((-115799999L));
        java.lang.String str9 = dateTimeZone1.getNameKey((-36000000L));
        long long12 = dateTimeZone1.convertLocalToUTC((-115800001L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNull(str5);
// flaky "26) test0558(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNull(str9);
// flaky "26) test0558(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-115800053L) + "'", long12 == (-115800053L));
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        long long16 = dateTimeZone3.adjustOffset(115799900L, true);
        long long18 = dateTimeZone3.convertUTCToLocal(115799901L);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone3.getOffset(readableInstant19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "27) test0559(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "27) test0559(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 115799900L + "'", long16 == 115799900L);
// flaky "24) test0559(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 115800001L + "'", long18 == 115800001L);
// flaky "23) test0559(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', 360600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        int int11 = dateTimeZone1.getStandardOffset((long) 'a');
        long long14 = dateTimeZone1.convertLocalToUTC(324000003L, true);
        long long18 = dateTimeZone1.convertLocalToUTC(359999900L, true, (-6720020L));
        long long21 = dateTimeZone1.convertLocalToUTC((-115799866L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "28) test0561(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "28) test0561(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
// flaky "25) test0561(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
// flaky "24) test0561(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 323999903L + "'", long14 == 323999903L);
// flaky "17) test0561(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 359999800L + "'", long18 == 359999800L);
// flaky "15) test0561(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-115799966L) + "'", long21 == (-115799966L));
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        java.lang.String str7 = dateTimeZone1.getName(97L);
        java.lang.String str9 = dateTimeZone1.getNameKey(0L);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        java.lang.String str12 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone0.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone0.getName(0L, locale6);
        int int9 = dateTimeZone0.getStandardOffset((long) '#');
        int int11 = dateTimeZone0.getStandardOffset(111L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getShortName((-3600000L), locale13);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        int int5 = dateTimeZone1.getOffset((long) (short) -1);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str10 = dateTimeZone1.getName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        int int12 = dateTimeZone1.getOffset((long) '#');
        int int14 = dateTimeZone1.getOffsetFromLocal(115799999L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj17 = dateTimeZone16.writeReplace();
        java.lang.Object obj18 = dateTimeZone16.writeReplace();
        int int20 = dateTimeZone16.getOffset((long) (short) -1);
        boolean boolean21 = dateTimeZone16.isFixed();
        java.lang.String str22 = dateTimeZone16.getID();
        long long25 = dateTimeZone16.convertLocalToUTC(25200000L, true);
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, (-25200103L));
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = dateTimeZone1.isLocalDateTimeGap(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 25200001L + "'", long25 == 25200001L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-25200103L) + "'", long27 == (-25200103L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal(25199999L);
        long long7 = dateTimeZone1.convertLocalToUTC(98L, true, (long) (-1));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 99L + "'", long7 == 99L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getShortName((-1570084924000L));
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        int int15 = dateTimeZone1.getOffsetFromLocal((-71999989L));
        java.lang.String str16 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long20 = dateTimeZone1.convertLocalToUTC((-140399999L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-140399998L) + "'", long20 == (-140399998L));
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(111L, false, 25199999L);
        long long16 = dateTimeZone1.convertLocalToUTC(25199999L, false, (-48L));
        java.lang.String str18 = dateTimeZone1.getShortName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone1.isLocalDateTimeGap(localDateTime19);
        long long24 = dateTimeZone1.convertLocalToUTC(0L, false, (-3599803L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 112L + "'", long12 == 112L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200000L + "'", long16 == 25200000L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        long long13 = dateTimeZone9.adjustOffset((long) (byte) 1, false);
        java.lang.String str15 = dateTimeZone9.getName(97L);
        int int17 = dateTimeZone9.getOffsetFromLocal((long) 1);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone9.isLocalDateTimeGap(localDateTime18);
        int int21 = dateTimeZone9.getOffsetFromLocal((-1570120924101L));
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (-115799999L));
        java.lang.String str25 = dateTimeZone1.getNameKey((long) (byte) 100);
        java.lang.Class<?> wildcardClass26 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-115800001L) + "'", long23 == (-115800001L));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        long long5 = dateTimeZone1.previousTransition((-1570084924101L));
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 100, locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((-1570048924101L), locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570084924101L) + "'", long5 == (-1570084924101L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360600000, 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        long long16 = dateTimeZone3.previousTransition((long) 25200000);
        long long19 = dateTimeZone3.adjustOffset((-1569999004091L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "29) test0572(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "29) test0572(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200000L + "'", long16 == 25200000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1569999004091L) + "'", long19 == (-1569999004091L));
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        int int32 = dateTimeZone6.getOffsetFromLocal((long) (byte) 1);
        int int34 = dateTimeZone6.getOffsetFromLocal((long) 36600000);
        java.lang.Class<?> wildcardClass35 = dateTimeZone6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "30) test0573(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "30) test0573(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "26) test0573(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
// flaky "25) test0573(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570084924100L) + "'", long20 == (-1570084924100L));
// flaky "18) test0573(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
// flaky "16) test0573(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
// flaky "13) test0573(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570048923999L) + "'", long26 == (-1570048923999L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 25199999L + "'", long28 == 25199999L);
// flaky "10) test0573(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
// flaky "6) test0573(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
// flaky "3) test0573(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal(25199999L);
        long long5 = dateTimeZone1.nextTransition(9L);
        long long7 = dateTimeZone1.nextTransition((-71999989L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "31) test0574(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9L + "'", long5 == 9L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-71999989L) + "'", long7 == (-71999989L));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName((-1570084924000L), locale6);
        long long9 = dateTimeZone1.convertUTCToLocal(2L);
        java.lang.String str10 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        long long5 = dateTimeZone1.convertLocalToUTC((-1570084924102L), false);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        long long8 = dateTimeZone1.convertUTCToLocal((-1570084924199L));
        java.lang.String str9 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "32) test0576(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
// flaky "31) test0576(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570084924103L) + "'", long5 == (-1570084924103L));
        org.junit.Assert.assertNotNull(obj6);
// flaky "27) test0576(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1570084924198L) + "'", long8 == (-1570084924198L));
// flaky "26) test0576(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset((-1570045324000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:00" + "'", str3, "+10:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj6 = dateTimeZone5.writeReplace();
        java.lang.Object obj7 = dateTimeZone5.writeReplace();
        int int9 = dateTimeZone5.getOffsetFromLocal((long) (short) 10);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) int9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName(0L, locale12);
        java.lang.Object obj14 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        long long22 = dateTimeZone20.nextTransition((long) (short) 100);
        int int24 = dateTimeZone20.getOffsetFromLocal(100L);
        long long26 = dateTimeZone16.getMillisKeepLocal(dateTimeZone20, (long) 115800000);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        java.lang.Object obj29 = dateTimeZone28.writeReplace();
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone28.getName((-35999890L), locale31);
        java.lang.String str33 = dateTimeZone28.toString();
        java.lang.String str35 = dateTimeZone28.getNameKey(56L);
        boolean boolean36 = dateTimeZone20.equals((java.lang.Object) dateTimeZone28);
        boolean boolean37 = dateTimeZone1.equals((java.lang.Object) dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36000000 + "'", int24 == 36000000);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 115800000L + "'", long26 == 115800000L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.032" + "'", str32, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.032" + "'", str33, "+00:00:00.032");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        java.lang.String str24 = dateTimeZone1.getNameKey((-10800099L));
        long long26 = dateTimeZone1.convertUTCToLocal((-1570078204201L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570048924101L) + "'", long15 == (-1570048924101L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36000000 + "'", int17 == 36000000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36000000 + "'", int19 == 36000000);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+10:00" + "'", str20, "+10:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+10:00" + "'", str22, "+10:00");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570042204201L) + "'", long26 == (-1570042204201L));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-35999948L) + "'", long15 == (-35999948L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-36000001L) + "'", long19 == (-36000001L));
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+10:00" + "'", str24, "+10:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-10800000L) + "'", long30 == (-10800000L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-35999899L) + "'", long32 == (-35999899L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.001" + "'", str35, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1570048924101L) + "'", long39 == (-1570048924101L));
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
        java.lang.Class<?> wildcardClass30 = dateTimeZone20.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+10:00" + "'", str15, "+10:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:00" + "'", str18, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36000000 + "'", int24 == 36000000);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+10:00" + "'", str27, "+10:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+10:01");
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true);
        java.lang.String str6 = dateTimeZone1.getNameKey((-1569969124102L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-36060001L) + "'", long4 == (-36060001L));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(349200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long8 = dateTimeZone5.convertLocalToUTC((long) 1, true);
        int int10 = dateTimeZone5.getOffset((long) 115800000);
        int int12 = dateTimeZone5.getStandardOffset((long) 10);
        java.lang.Object obj13 = dateTimeZone5.writeReplace();
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        int int16 = dateTimeZone1.getOffsetFromLocal((-1570048924001L));
        long long19 = dateTimeZone1.adjustOffset((-35999899L), true);
        java.lang.Class<?> wildcardClass20 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-99L) + "'", long8 == (-99L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-35999899L) + "'", long19 == (-35999899L));
        org.junit.Assert.assertNotNull(wildcardClass20);
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
        int int14 = dateTimeZone3.getOffsetFromLocal((long) (byte) 1);
        long long16 = dateTimeZone3.convertUTCToLocal((-99L));
        java.util.TimeZone timeZone17 = dateTimeZone3.toTimeZone();
        long long20 = dateTimeZone3.adjustOffset(25199899L, false);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone3.isLocalDateTimeGap(localDateTime21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone3.getOffset(readableInstant23);
        long long26 = dateTimeZone3.previousTransition(76200054L);
        java.lang.Class<?> wildcardClass27 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "33) test0585(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "32) test0585(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "28) test0585(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "27) test0585(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
// flaky "19) test0585(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
// flaky "17) test0585(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-98L) + "'", long16 == (-98L));
        org.junit.Assert.assertNotNull(timeZone17);
// flaky "14) test0585(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25199899L + "'", long20 == 25199899L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "11) test0585(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 76200054L + "'", long26 == 76200054L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        java.lang.String str18 = dateTimeZone3.getName((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone3.getOffset(readableInstant19);
        java.lang.Object obj21 = dateTimeZone3.writeReplace();
        java.util.TimeZone timeZone22 = dateTimeZone3.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
// flaky "34) test0586(org.joda.time.RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "33) test0586(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "29) test0586(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky "28) test0586(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
// flaky "20) test0586(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky "18) test0586(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.lang.Class<?> wildcardClass5 = provider0.getClass();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.lang.String str30 = dateTimeZone29.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        long long35 = dateTimeZone33.nextTransition((long) (short) 100);
        int int37 = dateTimeZone33.getOffsetFromLocal(100L);
        long long39 = dateTimeZone29.getMillisKeepLocal(dateTimeZone33, (long) 115800000);
        java.lang.String str41 = dateTimeZone29.getName(9L);
        long long45 = dateTimeZone29.convertLocalToUTC((-1570084923900L), false, (long) (short) -1);
        java.lang.String str47 = dateTimeZone29.getNameKey((-10799999L));
        boolean boolean48 = dateTimeZone1.equals((java.lang.Object) str47);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str52 = dateTimeZone50.getNameKey((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long57 = dateTimeZone54.convertLocalToUTC((long) 1, true);
        int int59 = dateTimeZone54.getOffset((long) 115800000);
        int int61 = dateTimeZone54.getStandardOffset((long) 10);
        java.lang.Object obj62 = dateTimeZone54.writeReplace();
        boolean boolean63 = dateTimeZone50.equals((java.lang.Object) dateTimeZone54);
        int int65 = dateTimeZone50.getOffsetFromLocal((-1570048924001L));
        boolean boolean66 = dateTimeZone1.equals((java.lang.Object) int65);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "35) test0588(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "34) test0588(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "30) test0588(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "29) test0588(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky "21) test0588(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
// flaky "19) test0588(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1570084924101L) + "'", long27 == (-1570084924101L));
        org.junit.Assert.assertNotNull(dateTimeZone29);
// flaky "15) test0588(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.001" + "'", str30, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
// flaky "12) test0588(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 115800000L + "'", long39 == 115800000L);
// flaky "7) test0588(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.001" + "'", str41, "+00:00:00.001");
// flaky "4) test0588(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1570084923901L) + "'", long45 == (-1570084923901L));
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-99L) + "'", long57 == (-99L));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        long long11 = dateTimeZone1.convertLocalToUTC((-1570084924101L), true);
        boolean boolean13 = dateTimeZone1.isStandardOffset(0L);
        boolean boolean15 = dateTimeZone1.equals((java.lang.Object) 0.0f);
        java.lang.String str17 = dateTimeZone1.getName((long) (short) 0);
        int int19 = dateTimeZone1.getOffset((-56L));
        int int21 = dateTimeZone1.getOffset((-6719790L));
        long long23 = dateTimeZone1.convertUTCToLocal((-1570008724000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "36) test0590(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.052" + "'", str8, "+00:00:00.052");
// flaky "35) test0590(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924153L) + "'", long11 == (-1570084924153L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "31) test0590(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.052" + "'", str17, "+00:00:00.052");
// flaky "30) test0590(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
// flaky "22) test0590(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
// flaky "20) test0590(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1570008723948L) + "'", long23 == (-1570008723948L));
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int3 = dateTimeZone1.getOffset(111L);
        java.lang.String str5 = dateTimeZone1.getShortName((-7199802L));
        java.lang.String str7 = dateTimeZone1.getShortName(211L);
        int int9 = dateTimeZone1.getOffset((-115800053L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str5 = dateTimeZone1.toString();
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.Object obj7 = null;
        boolean boolean8 = dateTimeZone1.equals(obj7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName(3L, locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int8 = dateTimeZone1.getOffsetFromLocal((-47L));
        java.lang.String str9 = dateTimeZone1.getID();
        long long11 = dateTimeZone1.nextTransition((-168L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "37) test0594(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-53L) + "'", long6 == (-53L));
// flaky "36) test0594(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
// flaky "32) test0594(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.052" + "'", str9, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-168L) + "'", long11 == (-168L));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
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
        long long14 = dateTimeZone1.nextTransition((long) (short) 0);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        long long18 = dateTimeZone16.nextTransition((long) (short) 100);
        int int20 = dateTimeZone16.getOffsetFromLocal(100L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone16.getName((-99L), locale22);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone16.isLocalDateTimeGap(localDateTime24);
        int int27 = dateTimeZone16.getOffsetFromLocal((long) 'a');
        java.lang.String str28 = dateTimeZone16.getID();
        java.lang.Object obj29 = dateTimeZone16.writeReplace();
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone16.getName((-35999999L), locale31);
        java.util.TimeZone timeZone33 = dateTimeZone16.toTimeZone();
        long long35 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, 3L);
        java.lang.Object obj36 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass37 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "38) test0595(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
// flaky "37) test0595(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.052" + "'", str8, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
// flaky "33) test0595(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
// flaky "31) test0595(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.052" + "'", str23, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "23) test0595(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
// flaky "21) test0595(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.052" + "'", str28, "+00:00:00.052");
        org.junit.Assert.assertNotNull(obj29);
// flaky "16) test0595(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.052" + "'", str32, "+00:00:00.052");
        org.junit.Assert.assertNotNull(timeZone33);
// flaky "13) test0595(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 3L + "'", long35 == 3L);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        boolean boolean4 = dateTimeZone0.equals((java.lang.Object) (-1.0f));
        java.lang.String str6 = dateTimeZone0.getName(115800054L);
        java.lang.String str7 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        java.lang.String str10 = dateTimeZone1.getShortName((-3599902L));
        long long12 = dateTimeZone1.previousTransition(99L);
        java.lang.String str14 = dateTimeZone1.getNameKey((-115799966L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 99L + "'", long12 == 99L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        long long20 = dateTimeZone1.convertUTCToLocal(1L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "39) test0599(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
// flaky "38) test0599(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.052" + "'", str8, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
// flaky "34) test0599(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115799848L + "'", long14 == 115799848L);
// flaky "32) test0599(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNull(str18);
// flaky "24) test0599(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 53L + "'", long20 == 53L);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (short) 10);
        java.lang.Object obj3 = dateTimeZone2.writeReplace();
        int int5 = dateTimeZone2.getOffset((-90L));
        long long8 = dateTimeZone2.convertLocalToUTC((-1570088524001L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36600000 + "'", int5 == 36600000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1570125124001L) + "'", long8 == (-1570125124001L));
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        java.lang.Class<?> wildcardClass48 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "40) test0601(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.052" + "'", str4, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "39) test0601(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199948L + "'", long10 == 25199948L);
// flaky "35) test0601(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 49L + "'", long12 == 49L);
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
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone3.isLocalDateTimeGap(localDateTime8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone3.getOffset(readableInstant10);
        java.util.TimeZone timeZone12 = dateTimeZone3.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset((long) (byte) 10);
        int int7 = dateTimeZone1.getStandardOffset(115799901L);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) ' ');
        java.lang.Object obj10 = null;
        boolean boolean11 = dateTimeZone1.equals(obj10);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        long long19 = dateTimeZone15.getMillisKeepLocal(dateTimeZone17, (long) 'a');
        int int21 = dateTimeZone17.getStandardOffset((long) (short) 100);
        boolean boolean23 = dateTimeZone17.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        boolean boolean25 = dateTimeZone17.isFixed();
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone17, 115799948L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115799847L + "'", long27 == 115799847L);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        long long20 = dateTimeZone1.previousTransition((-25200103L));
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-25200103L) + "'", long20 == (-25200103L));
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long9 = dateTimeZone1.convertLocalToUTC(25199999L, false, 79800000L);
        long long11 = dateTimeZone1.nextTransition((-115799999L));
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 25199899L + "'", long9 == 25199899L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115799999L) + "'", long11 == (-115799999L));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, 6720000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        long long10 = dateTimeZone1.convertUTCToLocal(198L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "41) test0608(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky "40) test0608(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "36) test0608(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 197L + "'", long10 == 197L);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long4 = dateTimeZone1.convertLocalToUTC(35999901L, false);
        java.lang.String str5 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35999801L + "'", long4 == 35999801L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        boolean boolean22 = dateTimeZone1.isStandardOffset((-99L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "42) test0610(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "41) test0610(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
// flaky "37) test0610(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924102L) + "'", long15 == (-1570084924102L));
// flaky "33) test0610(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky "25) test0610(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
// flaky "22) test0610(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.previousTransition(110L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((-167L), locale10);
        long long14 = dateTimeZone1.convertLocalToUTC((-115200000L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "43) test0611(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky "42) test0611(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
// flaky "38) test0611(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "34) test0611(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199999L) + "'", long14 == (-115199999L));
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        java.lang.String str13 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "44) test0612(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200000L + "'", long10 == 25200000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-35999903L) + "'", long12 == (-35999903L));
// flaky "43) test0612(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        int int4 = dateTimeZone0.getOffset(98L);
        java.lang.String str5 = dateTimeZone0.toString();
        int int7 = dateTimeZone0.getOffsetFromLocal((long) 187200000);
        java.lang.String str9 = dateTimeZone0.getShortName(111L);
        boolean boolean11 = dateTimeZone0.isStandardOffset((-35999990L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
        java.lang.String str18 = dateTimeZone3.getName((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone3.getOffset(readableInstant19);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone3.getShortName((-1570048923800L), locale22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone3.getName(360000009L, locale25);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "45) test0614(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "44) test0614(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-35999999L) + "'", long13 == (-35999999L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky "39) test0614(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:00" + "'", str18, "+10:00");
// flaky "35) test0614(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 36000000 + "'", int20 == 36000000);
// flaky "26) test0614(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+10:00" + "'", str23, "+10:00");
// flaky "23) test0614(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+10:00" + "'", str26, "+10:00");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.lang.String str7 = dateTimeZone1.getName((long) (byte) 10);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName(1L, locale9);
        java.lang.String str12 = dateTimeZone1.getName((-1569969124002L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName(323999901L, locale14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "46) test0615(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
// flaky "45) test0615(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
// flaky "40) test0615(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
// flaky "36) test0615(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        long long16 = dateTimeZone1.adjustOffset(35999999L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "47) test0616(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "46) test0616(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky "41) test0616(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "37) test0616(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35999999L + "'", long16 == 35999999L);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        boolean boolean11 = dateTimeZone1.isFixed();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName(200L, locale13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "48) test0618(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
// flaky "47) test0618(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "42) test0618(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName((-48L), locale11);
        java.lang.String str14 = dateTimeZone1.getName((-1570088524102L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "49) test0619(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "48) test0619(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
// flaky "43) test0619(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
// flaky "38) test0619(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone5.nextTransition((long) (short) 100);
        int int9 = dateTimeZone5.getOffsetFromLocal(100L);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (long) 115800000);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str14 = dateTimeZone13.getID();
        long long16 = dateTimeZone13.previousTransition((-1L));
        boolean boolean18 = dateTimeZone13.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone13.getName((long) (short) 0, locale20);
        long long23 = dateTimeZone13.nextTransition((long) ' ');
        long long27 = dateTimeZone13.convertLocalToUTC((long) '4', false, 115799900L);
        long long31 = dateTimeZone13.convertLocalToUTC((long) (short) -1, false, 36000000L);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        java.lang.String str36 = dateTimeZone35.getID();
        long long38 = dateTimeZone35.previousTransition((-1L));
        long long42 = dateTimeZone35.convertLocalToUTC(25200000L, true, 100L);
        long long44 = dateTimeZone33.getMillisKeepLocal(dateTimeZone35, 100L);
        java.util.Locale locale46 = null;
        java.lang.String str47 = dateTimeZone33.getShortName((long) (short) 10, locale46);
        boolean boolean49 = dateTimeZone33.isStandardOffset(25200001L);
        long long51 = dateTimeZone13.getMillisKeepLocal(dateTimeZone33, (-1570084924100L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        boolean boolean53 = dateTimeZone1.equals((java.lang.Object) dateTimeZone13);
        java.lang.Class<?> wildcardClass54 = dateTimeZone13.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "50) test0620(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
// flaky "49) test0620(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky "44) test0620(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "39) test0620(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
// flaky "27) test0620(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
// flaky "24) test0620(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
// flaky "17) test0620(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
// flaky "14) test0620(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 25200000L + "'", long42 == 25200000L);
// flaky "8) test0620(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 101L + "'", long44 == 101L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00:00.001" + "'", str47, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
// flaky "5) test0620(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1570084924101L) + "'", long51 == (-1570084924101L));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone4 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(97L);
        int int10 = dateTimeZone1.getStandardOffset((-1570444923900L));
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        long long19 = dateTimeZone1.convertLocalToUTC(79800104L, true, (-61199999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 79800104L + "'", long19 == 79800104L);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition(0L);
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long9 = dateTimeZone1.convertLocalToUTC(25199999L, false, 79800000L);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 25199899L + "'", long9 == 25199899L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        long long22 = dateTimeZone1.convertUTCToLocal((-55L));
        java.util.TimeZone timeZone23 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-48L) + "'", long15 == (-48L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-101L) + "'", long19 == (-101L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 45L + "'", long22 == 45L);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) '4');
        long long4 = dateTimeZone2.previousTransition((-1570444924101L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570444924101L) + "'", long4 == (-1570444924101L));
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str5 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        long long10 = dateTimeZone1.convertLocalToUTC((-25199902L), false);
        long long12 = dateTimeZone1.previousTransition((-1569969124101L));
        java.lang.String str13 = dateTimeZone1.getID();
        long long17 = dateTimeZone1.convertLocalToUTC((-1570197124099L), false, 20L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-25199901L) + "'", long10 == (-25199901L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1569969124101L) + "'", long12 == (-1569969124101L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570197124098L) + "'", long17 == (-1570197124098L));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone1.getName(36599968L, locale24);
        java.lang.Class<?> wildcardClass26 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        long long18 = dateTimeZone3.adjustOffset(25199900L, false);
        int int20 = dateTimeZone3.getStandardOffset((long) 1);
        long long24 = dateTimeZone3.convertLocalToUTC((long) 25200000, false, (-1570084924099L));
        boolean boolean25 = dateTimeZone3.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25199900L + "'", long18 == 25199900L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 25199900L + "'", long24 == 25199900L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) '4', locale8);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long5 = dateTimeZone1.convertLocalToUTC(25199999L, false, 0L);
        java.lang.String str7 = dateTimeZone1.getNameKey((-3L));
        long long9 = dateTimeZone1.previousTransition((-115799900L));
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((-1569724924100L), locale11);
        java.lang.String str14 = dateTimeZone1.getShortName((-115799998L));
        long long17 = dateTimeZone1.convertLocalToUTC(374400000L, false);
        java.lang.Class<?> wildcardClass18 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25199999L + "'", long5 == 25199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115799900L) + "'", long9 == (-115799900L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 374400000L + "'", long17 == 374400000L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone3.getShortName(1L, locale15);
        java.lang.String str17 = dateTimeZone3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "51) test0633(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "50) test0633(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "45) test0633(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
// flaky "40) test0633(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(187200000);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getShortName((-199L), locale4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+52:00" + "'", str5, "+52:00");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 25200000, true, (long) (short) 10);
        int int8 = dateTimeZone1.getStandardOffset(115799900L);
        int int10 = dateTimeZone1.getStandardOffset((long) (byte) 100);
        java.lang.String str12 = dateTimeZone1.getName((-35999902L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25199999L + "'", long6 == 25199999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        int int22 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long24 = dateTimeZone1.previousTransition(1L);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone1.getShortName((-39599899L), locale26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long33 = dateTimeZone29.convertLocalToUTC(25199999L, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone36 = dateTimeZone35.toTimeZone();
        long long39 = dateTimeZone35.adjustOffset((long) (byte) 1, false);
        java.lang.String str41 = dateTimeZone35.getName(97L);
        java.lang.String str43 = dateTimeZone35.getNameKey(0L);
        long long45 = dateTimeZone29.getMillisKeepLocal(dateTimeZone35, (-1570084924101L));
        org.joda.time.LocalDateTime localDateTime46 = null;
        boolean boolean47 = dateTimeZone35.isLocalDateTimeGap(localDateTime46);
        int int49 = dateTimeZone35.getOffsetFromLocal((-1570200724100L));
        long long51 = dateTimeZone1.getMillisKeepLocal(dateTimeZone35, 36000000L);
        long long53 = dateTimeZone35.nextTransition((-1570444924101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "52) test0636(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "51) test0636(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky "46) test0636(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 51L + "'", long15 == 51L);
// flaky "41) test0636(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-2L) + "'", long19 == (-2L));
// flaky "28) test0636(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
// flaky "25) test0636(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
// flaky "18) test0636(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.001" + "'", str27, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 25199999L + "'", long33 == 25199999L);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.001" + "'", str41, "+00:00:00.001");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1570084924102L) + "'", long45 == (-1570084924102L));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
// flaky "15) test0636(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 36000000L + "'", long51 == 36000000L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1570444924101L) + "'", long53 == (-1570444924101L));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        long long17 = dateTimeZone3.previousTransition((-1570444924102L));
        java.lang.String str19 = dateTimeZone3.getNameKey(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "53) test0637(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "52) test0637(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
// flaky "47) test0637(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570444924102L) + "'", long17 == (-1570444924102L));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 1);
        java.lang.String str4 = dateTimeZone2.getNameKey((-1570084924101L));
        java.lang.String str6 = dateTimeZone2.getNameKey((-115800000L));
        int int8 = dateTimeZone2.getOffsetFromLocal((-1570444924100L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36060000 + "'", int8 == 36060000);
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
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone16.getName((long) (short) 1, locale22);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        java.lang.String str25 = dateTimeZone16.getID();
        boolean boolean26 = dateTimeZone3.equals((java.lang.Object) dateTimeZone16);
        java.lang.String str28 = dateTimeZone16.getShortName((-6720000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long8 = dateTimeZone1.previousTransition(115800000L);
        long long12 = dateTimeZone1.convertLocalToUTC(97L, true, (-35999903L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((long) '#', locale14);
        long long18 = dateTimeZone1.adjustOffset((-71999989L), false);
        long long22 = dateTimeZone1.convertLocalToUTC(0L, true, (-35999999L));
        long long25 = dateTimeZone1.adjustOffset((-1569724924201L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115800000L + "'", long8 == 115800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-71999989L) + "'", long18 == (-71999989L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-100L) + "'", long22 == (-100L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1569724924201L) + "'", long25 == (-1569724924201L));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        int int5 = dateTimeZone1.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        long long9 = dateTimeZone1.adjustOffset((-1570084923900L), true);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1570084923900L) + "'", long9 == (-1570084923900L));
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 1);
        java.lang.String str4 = dateTimeZone2.getNameKey((-1569963004101L));
        java.lang.Class<?> wildcardClass5 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) 0, locale6);
        boolean boolean9 = dateTimeZone4.equals((java.lang.Object) 2L);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 1L);
        long long14 = dateTimeZone2.adjustOffset((-35999900L), false);
        long long18 = dateTimeZone2.convertLocalToUTC((-35999999L), false, 0L);
        boolean boolean20 = dateTimeZone2.isStandardOffset((-35999897L));
        long long23 = dateTimeZone2.convertLocalToUTC(115799800L, false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999900L) + "'", long14 == (-35999900L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-35999999L) + "'", long18 == (-35999999L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 115799800L + "'", long23 == 115799800L);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        boolean boolean17 = dateTimeZone3.equals((java.lang.Object) (-25199999L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.lang.String str20 = dateTimeZone3.getName((-10800000L));
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone3.getOffset(readableInstant21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        boolean boolean3 = dateTimeZone1.isFixed();
        long long5 = dateTimeZone1.convertUTCToLocal((-35999899L));
        java.lang.String str7 = dateTimeZone1.getShortName((-35999997L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-35999900L) + "'", long5 == (-35999900L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        int int23 = dateTimeZone13.getStandardOffset(3600000L);
        boolean boolean25 = dateTimeZone13.isStandardOffset(187199900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.032" + "'", str17, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.032" + "'", str18, "+00:00:00.032");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        long long25 = dateTimeZone3.previousTransition(115799900L);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone3.getShortName((-1L), locale27);
        boolean boolean30 = dateTimeZone3.isStandardOffset(0L);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 115799900L + "'", long25 == 115799900L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(97L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((long) (-1), locale10);
        java.lang.String str12 = dateTimeZone1.toString();
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass14 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        long long14 = dateTimeZone1.nextTransition((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        long long18 = dateTimeZone1.convertUTCToLocal(262L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "54) test0651(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
// flaky "53) test0651(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky "48) test0651(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
// flaky "42) test0651(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 362L + "'", long18 == 362L);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        java.lang.String str9 = dateTimeZone1.getID();
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) (-47L));
        java.lang.String str12 = dateTimeZone1.toString();
        java.lang.String str14 = dateTimeZone1.getShortName((-39599799L));
        java.lang.Object obj15 = dateTimeZone1.writeReplace();
        long long18 = dateTimeZone1.convertLocalToUTC((-1570048324198L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "55) test0652(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
// flaky "54) test0652(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "49) test0652(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
// flaky "43) test0652(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj15);
// flaky "29) test0652(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570048324298L) + "'", long18 == (-1570048324298L));
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        long long32 = dateTimeZone3.convertUTCToLocal((-1570084924100L));
        org.joda.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = dateTimeZone3.isLocalDateTimeGap(localDateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "56) test0653(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "55) test0653(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
// flaky "50) test0653(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
// flaky "44) test0653(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
// flaky "30) test0653(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
// flaky "26) test0653(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
// flaky "19) test0653(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
// flaky "16) test0653(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
// flaky "9) test0653(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1570084924000L) + "'", long32 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal(25199999L);
        int int5 = dateTimeZone1.getOffsetFromLocal((long) '4');
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getStandardOffset((-25200001L));
        boolean boolean10 = dateTimeZone1.isStandardOffset((-68L));
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "57) test0654(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
// flaky "56) test0654(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(obj6);
// flaky "51) test0654(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long8 = dateTimeZone1.previousTransition(115800000L);
        long long12 = dateTimeZone1.convertLocalToUTC(97L, true, (-35999903L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((long) '#', locale14);
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone1.isLocalDateTimeGap(localDateTime16);
        java.lang.String str19 = dateTimeZone1.getName(25200001L);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        long long23 = dateTimeZone21.nextTransition((long) (short) 100);
        int int25 = dateTimeZone21.getOffsetFromLocal(100L);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone21.getName((-99L), locale27);
        boolean boolean29 = dateTimeZone21.isFixed();
        long long31 = dateTimeZone21.nextTransition((-1570084924201L));
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = dateTimeZone21.getOffset(readableInstant32);
        long long36 = dateTimeZone21.convertLocalToUTC((-1570048924001L), true);
        java.lang.String str38 = dateTimeZone21.getNameKey((-36000001L));
        org.joda.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = dateTimeZone21.isLocalDateTimeGap(localDateTime39);
        long long42 = dateTimeZone1.getMillisKeepLocal(dateTimeZone21, 45L);
        boolean boolean43 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115800000L + "'", long8 == 115800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1570084924201L) + "'", long31 == (-1570084924201L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1570048924101L) + "'", long36 == (-1570048924101L));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 45L + "'", long42 == 45L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        int int3 = dateTimeZone1.getOffset((-35999866L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600000 + "'", int3 == 3600000);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        java.lang.String str7 = dateTimeZone1.getName(97L);
        int int9 = dateTimeZone1.getOffsetFromLocal((long) 1);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        long long13 = dateTimeZone1.convertUTCToLocal((-1570048923800L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570048923799L) + "'", long13 == (-1570048923799L));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        java.lang.String str7 = dateTimeZone1.toString();
        int int9 = dateTimeZone1.getOffset((-1570084924000L));
        boolean boolean10 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str5 = dateTimeZone1.toString();
        long long7 = dateTimeZone1.nextTransition((-1570084924001L));
        int int9 = dateTimeZone1.getStandardOffset((-35999999L));
        long long11 = dateTimeZone1.previousTransition((-1570084924000L));
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570084924001L) + "'", long7 == (-1570084924001L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924000L) + "'", long11 == (-1570084924000L));
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        java.lang.String str7 = dateTimeZone1.getName(97L);
        int int9 = dateTimeZone1.getOffsetFromLocal((long) 1);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        int int30 = dateTimeZone1.getOffsetFromLocal((-115800001L));
        java.lang.Class<?> wildcardClass31 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone1.getShortName(288000099L, locale26);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
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
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) false);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((long) 100, locale12);
        long long15 = dateTimeZone1.convertUTCToLocal((-1570084924101L));
        int int17 = dateTimeZone1.getOffsetFromLocal((-1570084924001L));
        int int19 = dateTimeZone1.getOffsetFromLocal(25200001L);
        long long21 = dateTimeZone1.convertUTCToLocal((-1570048924000L));
        java.lang.String str22 = dateTimeZone1.toString();
        boolean boolean23 = dateTimeZone1.isFixed();
        java.lang.String str24 = dateTimeZone1.getID();
        java.lang.String str26 = dateTimeZone1.getShortName((long) (byte) 100);
        java.lang.String str28 = dateTimeZone1.getShortName((-25199801L));
        java.lang.Class<?> wildcardClass29 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924001L) + "'", long15 == (-1570084924001L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1570048923900L) + "'", long21 == (-1570048923900L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.lang.String str19 = dateTimeZone3.getNameKey((long) 115800000);
        java.lang.String str21 = dateTimeZone3.getNameKey(96L);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        java.util.TimeZone timeZone50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        long long53 = dateTimeZone49.getMillisKeepLocal(dateTimeZone51, (long) 'a');
        int int55 = dateTimeZone51.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone56 = dateTimeZone51.toTimeZone();
        java.util.Locale locale58 = null;
        java.lang.String str59 = dateTimeZone51.getShortName((long) (byte) 100, locale58);
        java.util.Locale locale61 = null;
        java.lang.String str62 = dateTimeZone51.getShortName((long) (short) 0, locale61);
        java.lang.String str63 = dateTimeZone51.getID();
        java.lang.String str64 = dateTimeZone51.toString();
        java.util.TimeZone timeZone65 = dateTimeZone51.toTimeZone();
        long long67 = dateTimeZone1.getMillisKeepLocal(dateTimeZone51, (-1570084924000L));
        java.lang.Class<?> wildcardClass68 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "58) test0665(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "57) test0665(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199999L + "'", long10 == 25199999L);
// flaky "52) test0665(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
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
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 97L + "'", long53 == 97L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNotNull(timeZone56);
        org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+00:00:00.100" + "'", str59, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "+00:00:00.100" + "'", str62, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "+00:00:00.100" + "'", str63, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "+00:00:00.100" + "'", str64, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone65);
        org.junit.Assert.assertEquals(timeZone65.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1570084924099L) + "'", long67 == (-1570084924099L));
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        java.lang.String str33 = dateTimeZone1.toString();
        long long37 = dateTimeZone1.convertLocalToUTC(359999901L, false, (-39599898L));
        java.util.TimeZone timeZone38 = dateTimeZone1.toTimeZone();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-3599802L) + "'", long32 == (-3599802L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 359999801L + "'", long37 == 359999801L);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        int int3 = dateTimeZone1.getOffset(0L);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone5.getMillisKeepLocal(dateTimeZone7, (long) 'a');
        int int11 = dateTimeZone7.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone12 = dateTimeZone7.toTimeZone();
        java.util.TimeZone timeZone13 = dateTimeZone7.toTimeZone();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone7.getName((long) (short) 10, locale15);
        java.lang.String str18 = dateTimeZone7.getName(0L);
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (short) 1);
        int int22 = dateTimeZone7.getOffset((-157L));
        long long24 = dateTimeZone7.nextTransition(187200001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-98L) + "'", long20 == (-98L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 187200001L + "'", long24 == 187200001L);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        int int12 = dateTimeZone1.getOffset((long) '#');
        int int14 = dateTimeZone1.getOffsetFromLocal(115799999L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj17 = dateTimeZone16.writeReplace();
        java.lang.Object obj18 = dateTimeZone16.writeReplace();
        int int20 = dateTimeZone16.getOffset((long) (short) -1);
        boolean boolean21 = dateTimeZone16.isFixed();
        java.lang.String str22 = dateTimeZone16.getID();
        long long25 = dateTimeZone16.convertLocalToUTC(25200000L, true);
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, (-25200103L));
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone1.getShortName(150599901L, locale29);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 25200001L + "'", long25 == 25200001L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-25200002L) + "'", long27 == (-25200002L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.lang.Object obj2 = null;
        boolean boolean3 = dateTimeZone1.equals(obj2);
        long long6 = dateTimeZone1.adjustOffset(25199900L, false);
        java.lang.String str8 = dateTimeZone1.getNameKey(100L);
        java.lang.String str9 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25199900L + "'", long6 == 25199900L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        int int5 = dateTimeZone1.getOffset((long) (short) -1);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        java.lang.String str8 = dateTimeZone1.getNameKey((-10799899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115800000);
        boolean boolean3 = dateTimeZone1.isStandardOffset((-200L));
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        java.lang.String str26 = dateTimeZone6.getName((-36599790L), locale25);
        java.lang.Class<?> wildcardClass27 = dateTimeZone6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 110L + "'", long21 == 110L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1569933124000L) + "'", long23 == (-1569933124000L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        java.lang.String str7 = dateTimeZone1.getName(97L);
        int int9 = dateTimeZone1.getOffsetFromLocal((long) 1);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        java.lang.String str12 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass3 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(32);
        java.lang.String str3 = dateTimeZone1.getNameKey((-1570084923900L));
        long long5 = dateTimeZone1.nextTransition(152399799L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 152399799L + "'", long5 == 152399799L);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str5 = dateTimeZone1.toString();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-56L), locale7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        long long6 = dateTimeZone2.convertLocalToUTC((long) 35, true, (-101L));
        long long8 = dateTimeZone2.convertUTCToLocal(9L);
        boolean boolean9 = dateTimeZone2.isFixed();
        int int11 = dateTimeZone2.getOffset((-1570084923901L));
        int int13 = dateTimeZone2.getStandardOffset((-1570088524000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-115799965L) + "'", long6 == (-115799965L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115800009L + "'", long8 == 115800009L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115800000 + "'", int11 == 115800000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115800000 + "'", int13 == 115800000);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.previousTransition(25199948L);
        java.lang.String str9 = dateTimeZone1.getID();
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj13 = dateTimeZone12.writeReplace();
        java.lang.Object obj14 = dateTimeZone12.writeReplace();
        int int16 = dateTimeZone12.getOffsetFromLocal((long) (short) 10);
        boolean boolean17 = dateTimeZone1.equals((java.lang.Object) dateTimeZone12);
        long long21 = dateTimeZone1.convertLocalToUTC((-1570200723900L), false, (long) 36600000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25199948L + "'", long8 == 25199948L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1570200723899L) + "'", long21 == (-1570200723899L));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal(25199999L);
        long long7 = dateTimeZone1.convertLocalToUTC(98L, true, (long) (-1));
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        long long11 = dateTimeZone9.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone9.getOffset(readableInstant12);
        long long15 = dateTimeZone9.previousTransition((long) (short) 10);
        java.lang.String str16 = dateTimeZone9.toString();
        long long20 = dateTimeZone9.convertLocalToUTC((-51L), true, (long) (short) 100);
        long long22 = dateTimeZone9.nextTransition((-1569963004101L));
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (long) (byte) -1);
        boolean boolean25 = dateTimeZone9.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "59) test0679(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3600000) + "'", int3 == (-3600000));
// flaky "58) test0679(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600098L + "'", long7 == 3600098L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
// flaky "53) test0679(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3600000) + "'", int13 == (-3600000));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
// flaky "45) test0679(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-01:00" + "'", str16, "-01:00");
// flaky "31) test0679(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3599949L + "'", long20 == 3599949L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1569963004101L) + "'", long22 == (-1569963004101L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        int int6 = dateTimeZone1.getOffset((long) 115800000);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (byte) 10);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (-97L));
        int int14 = dateTimeZone10.getOffset(0L);
        java.lang.String str16 = dateTimeZone10.getShortName((-1569969124101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599997L) + "'", long12 == (-360599997L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 360600000 + "'", int14 == 360600000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+100:10" + "'", str16, "+100:10");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition((long) (-1));
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        long long23 = dateTimeZone1.convertUTCToLocal((-115200056L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "60) test0682(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-01:00" + "'", str8, "-01:00");
// flaky "59) test0682(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570081324101L) + "'", long11 == (-1570081324101L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "54) test0682(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-01:00" + "'", str17, "-01:00");
// flaky "46) test0682(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-43199899L) + "'", long19 == (-43199899L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "32) test0682(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-118800056L) + "'", long23 == (-118800056L));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.010");
        long long5 = dateTimeZone1.convertLocalToUTC(39599999L, true, (-56L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 39599989L + "'", long5 == 39599989L);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str10 = dateTimeZone1.toString();
        long long12 = dateTimeZone1.previousTransition((-1570084924202L));
        long long14 = dateTimeZone1.convertUTCToLocal(187199801L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "61) test0684(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-01:00" + "'", str8, "-01:00");
// flaky "60) test0684(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-01:00" + "'", str10, "-01:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570084924202L) + "'", long12 == (-1570084924202L));
// flaky "55) test0684(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 183599801L + "'", long14 == 183599801L);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.String str2 = dateTimeZone1.toString();
        long long5 = dateTimeZone1.convertLocalToUTC((-25199998L), true);
        int int7 = dateTimeZone1.getStandardOffset((-223199900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-25199999L) + "'", long5 == (-25199999L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.nextTransition((-98L));
        java.lang.String str15 = dateTimeZone1.getName((-1569969124002L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "62) test0686(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 187260000 + "'", int5 == 187260000);
// flaky "61) test0686(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+52:01" + "'", str8, "+52:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky "56) test0686(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-98L) + "'", long13 == (-98L));
// flaky "47) test0686(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+52:01" + "'", str15, "+52:01");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        int int26 = dateTimeZone3.getOffsetFromLocal(0L);
        long long29 = dateTimeZone3.adjustOffset(135L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "63) test0687(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187260000 + "'", int7 == 187260000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "62) test0687(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
// flaky "57) test0687(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+52:01" + "'", str11, "+52:01");
// flaky "48) test0687(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+52:01" + "'", str14, "+52:01");
// flaky "33) test0687(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+52:01" + "'", str17, "+52:01");
// flaky "27) test0687(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+52:01" + "'", str19, "+52:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
// flaky "20) test0687(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+52:01" + "'", str24, "+52:01");
// flaky "17) test0687(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 187260000 + "'", int26 == 187260000);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 135L + "'", long29 == 135L);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 0);
        java.lang.String str4 = dateTimeZone2.getShortName((-152399901L));
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone2.getOffset(readableInstant5);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long8 = dateTimeZone1.previousTransition(115800000L);
        long long12 = dateTimeZone1.convertLocalToUTC(97L, true, (-35999903L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((long) '#', locale14);
        long long18 = dateTimeZone1.adjustOffset((-71999989L), false);
        java.lang.Object obj19 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115800000L + "'", long8 == 115800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-71999989L) + "'", long18 == (-71999989L));
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        long long17 = dateTimeZone1.convertUTCToLocal((-35999799L));
        long long20 = dateTimeZone1.convertLocalToUTC(324000003L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924201L) + "'", long11 == (-1570084924201L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-35999699L) + "'", long17 == (-35999699L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 323999903L + "'", long20 == 323999903L);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.lang.Object obj2 = null;
        boolean boolean3 = dateTimeZone1.equals(obj2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-35999990L));
        long long9 = dateTimeZone1.previousTransition(18479910L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-71999989L) + "'", long7 == (-71999989L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 18479910L + "'", long9 == 18479910L);
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
        int int29 = dateTimeZone13.getOffsetFromLocal((-71460000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "64) test0692(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 360000000 + "'", int7 == 360000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "63) test0692(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+:0:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "58) test0692(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+:0:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky "49) test0692(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+100:00" + "'", str21, "+100:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2L + "'", long23 == 2L);
// flaky "34) test0692(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-360000168L) + "'", long27 == (-360000168L));
// flaky "28) test0692(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 360000000 + "'", int29 == 360000000);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115800000, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str5 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        int int9 = dateTimeZone1.getOffsetFromLocal((-35999900L));
        long long11 = dateTimeZone1.previousTransition((-1570084924001L));
        long long14 = dateTimeZone1.convertLocalToUTC((-10799999L), false);
        boolean boolean16 = dateTimeZone1.isStandardOffset(100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924001L) + "'", long11 == (-1570084924001L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-10800000L) + "'", long14 == (-10800000L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int3 = dateTimeZone1.getOffset(111L);
        int int5 = dateTimeZone1.getStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj6 = dateTimeZone5.writeReplace();
        java.lang.Object obj7 = dateTimeZone5.writeReplace();
        int int9 = dateTimeZone5.getOffsetFromLocal((long) (short) 10);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) int9);
        int int12 = dateTimeZone1.getOffset(99L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        java.lang.Object obj20 = dateTimeZone1.writeReplace();
        int int22 = dateTimeZone1.getStandardOffset((-54L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        long long32 = dateTimeZone3.adjustOffset(132L, false);
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 132L + "'", long32 == 132L);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        long long3 = dateTimeZone1.convertUTCToLocal((long) 187200000);
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 374400000L + "'", long3 == 374400000L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str5 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        int int9 = dateTimeZone1.getOffsetFromLocal((-35999900L));
        boolean boolean10 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forID("+10:00");
        java.lang.String str6 = dateTimeZone5.getID();
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) dateTimeZone5);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long13 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, (long) 'a');
        int int15 = dateTimeZone11.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone16 = dateTimeZone11.toTimeZone();
        java.util.TimeZone timeZone17 = dateTimeZone11.toTimeZone();
        boolean boolean18 = dateTimeZone2.equals((java.lang.Object) dateTimeZone11);
        java.lang.Class<?> wildcardClass19 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+01:00" + "'", str3, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
// flaky "65) test0702(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        java.lang.String str12 = dateTimeZone1.getName((long) 'a');
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        long long31 = dateTimeZone16.adjustOffset(25199900L, false);
        boolean boolean32 = dateTimeZone1.equals((java.lang.Object) long31);
        java.lang.Object obj33 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 25199900L + "'", long31 == 25199900L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int3 = dateTimeZone1.getOffset(111L);
        long long6 = dateTimeZone1.adjustOffset((long) 349800000, true);
        int int8 = dateTimeZone1.getOffsetFromLocal(135L);
        java.lang.String str10 = dateTimeZone1.getNameKey(3L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        java.lang.Object obj13 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 349800000L + "'", long6 == 349800000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        java.lang.Object obj18 = null;
        boolean boolean19 = dateTimeZone3.equals(obj18);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long25 = dateTimeZone21.getMillisKeepLocal(dateTimeZone23, (long) 'a');
        int int27 = dateTimeZone23.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone28 = dateTimeZone23.toTimeZone();
        java.util.TimeZone timeZone29 = dateTimeZone23.toTimeZone();
        long long31 = dateTimeZone23.convertUTCToLocal(0L);
        boolean boolean33 = dateTimeZone23.equals((java.lang.Object) 100);
        long long35 = dateTimeZone23.convertUTCToLocal((long) 10);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        long long39 = dateTimeZone37.nextTransition((long) (short) 100);
        java.lang.String str41 = dateTimeZone37.getNameKey(1L);
        boolean boolean42 = dateTimeZone23.equals((java.lang.Object) str41);
        long long46 = dateTimeZone23.convertLocalToUTC(0L, false, 32L);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        long long50 = dateTimeZone23.getMillisKeepLocal(dateTimeZone48, 25199899L);
        long long52 = dateTimeZone48.convertUTCToLocal((-3599802L));
        long long54 = dateTimeZone48.previousTransition((-1570084924000L));
        long long56 = dateTimeZone3.getMillisKeepLocal(dateTimeZone48, 187199900L);
        java.lang.String str58 = dateTimeZone3.getShortName((-3L));
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 110L + "'", long35 == 110L);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-100L) + "'", long46 == (-100L));
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 25200000L + "'", long50 == 25200000L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-3599803L) + "'", long52 == (-3599803L));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1570084924000L) + "'", long54 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 187200001L + "'", long56 == 187200001L);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+00:00:00.100" + "'", str58, "+00:00:00.100");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC((-99L), true, (-3599902L));
        boolean boolean10 = dateTimeZone1.isStandardOffset((-1569969124002L));
        boolean boolean11 = dateTimeZone1.isFixed();
        long long13 = dateTimeZone1.nextTransition((-6720020L));
        int int15 = dateTimeZone1.getOffsetFromLocal((long) 36060000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-199L) + "'", long8 == (-199L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-6720020L) + "'", long13 == (-6720020L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        long long21 = dateTimeZone3.previousTransition(102L);
        java.lang.Object obj22 = dateTimeZone3.writeReplace();
        java.lang.String str24 = dateTimeZone3.getShortName((-1570120924101L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 102L + "'", long21 == 102L);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        int int6 = dateTimeZone1.getOffset((long) 115800000);
        int int8 = dateTimeZone1.getStandardOffset((long) 10);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        long long15 = dateTimeZone1.adjustOffset((-46800100L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-46800100L) + "'", long15 == (-46800100L));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long9 = dateTimeZone1.adjustOffset((long) '#', true);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        boolean boolean11 = dateTimeZone1.isFixed();
        long long13 = dateTimeZone1.convertUTCToLocal((-118800056L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-118799956L) + "'", long13 == (-118799956L));
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone2.isLocalDateTimeGap(localDateTime5);
        long long10 = dateTimeZone2.convertLocalToUTC((-47L), false, (-68399989L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-47L) + "'", long10 == (-47L));
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        long long11 = dateTimeZone1.adjustOffset((-90L), false);
        long long13 = dateTimeZone1.previousTransition((-1570120924102L));
        boolean boolean15 = dateTimeZone1.isStandardOffset(323999902L);
        long long17 = dateTimeZone1.previousTransition((-10799999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-90L) + "'", long11 == (-90L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570120924102L) + "'", long13 == (-1570120924102L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-10799999L) + "'", long17 == (-10799999L));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str3 = dateTimeZone1.getID();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName((-35999890L), locale5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.100" + "'", str3, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone3.getOffset(readableInstant16);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((-35999948L), locale3);
        java.lang.String str6 = dateTimeZone1.getName((-25200000L));
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        int int14 = dateTimeZone10.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone15 = dateTimeZone10.toTimeZone();
        java.lang.String str17 = dateTimeZone10.getNameKey((long) 10);
        boolean boolean18 = dateTimeZone10.isFixed();
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        boolean boolean7 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        boolean boolean10 = dateTimeZone1.isFixed();
        int int12 = dateTimeZone1.getOffset((long) 115800000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass14 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        boolean boolean9 = dateTimeZone3.equals((java.lang.Object) (byte) 0);
        long long13 = dateTimeZone3.convertLocalToUTC((long) (byte) 1, false, 25200000L);
        java.lang.String str14 = dateTimeZone3.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean16 = dateTimeZone3.isFixed();
        java.lang.Class<?> wildcardClass17 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        long long11 = dateTimeZone1.previousTransition((long) '4');
        int int13 = dateTimeZone1.getStandardOffset((long) 3600000);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        long long19 = dateTimeZone15.getMillisKeepLocal(dateTimeZone17, (long) 'a');
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone15.getName((long) (short) 1, locale21);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone15.getName(100L, locale25);
        long long29 = dateTimeZone15.adjustOffset((-90L), false);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj32 = dateTimeZone31.writeReplace();
        boolean boolean33 = dateTimeZone15.equals((java.lang.Object) dateTimeZone31);
        long long35 = dateTimeZone1.getMillisKeepLocal(dateTimeZone31, (-1570194003899L));
        long long37 = dateTimeZone1.nextTransition((-67L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-00:00:00.001" + "'", str26, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-90L) + "'", long29 == (-90L));
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1570194003901L) + "'", long35 == (-1570194003901L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-67L) + "'", long37 == (-67L));
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        long long32 = dateTimeZone3.convertUTCToLocal((-1570084924100L));
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        long long38 = dateTimeZone34.getMillisKeepLocal(dateTimeZone36, (long) 'a');
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone34.getName((long) (short) 1, locale40);
        int int43 = dateTimeZone34.getOffset((long) 1);
        int int45 = dateTimeZone34.getOffset((long) '#');
        boolean boolean46 = dateTimeZone34.isFixed();
        long long48 = dateTimeZone3.getMillisKeepLocal(dateTimeZone34, (-35999799L));
        java.util.Locale locale50 = null;
        java.lang.String str51 = dateTimeZone34.getName((-1570048923899L), locale50);
        java.lang.String str52 = dateTimeZone34.getID();
        java.lang.String str53 = dateTimeZone34.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1570084924101L) + "'", long32 == (-1570084924101L));
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 97L + "'", long38 == 97L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-00:00:00.001" + "'", str41, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-35999799L) + "'", long48 == (-35999799L));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "-00:00:00.001" + "'", str51, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "-00:00:00.001" + "'", str52, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "-00:00:00.001" + "'", str53, "-00:00:00.001");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        int int4 = dateTimeZone0.getOffset(98L);
        java.lang.String str6 = dateTimeZone0.getName((long) 115800000);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone0.isLocalDateTimeGap(localDateTime7);
        long long10 = dateTimeZone0.nextTransition((-140399998L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-140399998L) + "'", long10 == (-140399998L));
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.toString();
        long long7 = dateTimeZone1.convertLocalToUTC((-1L), false, (long) 1);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        long long17 = dateTimeZone11.convertUTCToLocal(0L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone11.getShortName((-1570084924201L), locale19);
        int int22 = dateTimeZone11.getStandardOffset(324000002L);
        java.lang.Object obj23 = dateTimeZone11.writeReplace();
        boolean boolean24 = dateTimeZone1.equals(obj23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "66) test0722(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
// flaky "64) test0722(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.100" + "'", str3, "+00:00:00.100");
// flaky "59) test0722(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-101L) + "'", long7 == (-101L));
// flaky "50) test0722(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "35) test0722(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
// flaky "29) test0722(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
// flaky "21) test0722(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        long long11 = dateTimeZone1.adjustOffset((-90L), false);
        long long13 = dateTimeZone1.previousTransition((-1570120924102L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName(36000000L, locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "67) test0723(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-90L) + "'", long11 == (-90L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570120924102L) + "'", long13 == (-1570120924102L));
// flaky "65) test0723(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long4 = dateTimeZone1.convertLocalToUTC((-35999999L), false);
        java.lang.String str6 = dateTimeZone1.getName(158L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-36000099L) + "'", long4 == (-36000099L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        boolean boolean17 = dateTimeZone3.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "68) test0725(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "66) test0725(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
// flaky "60) test0725(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        java.lang.String str10 = dateTimeZone1.getName((long) '#');
        java.lang.String str11 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Object obj13 = null;
        boolean boolean14 = dateTimeZone1.equals(obj13);
        long long17 = dateTimeZone1.adjustOffset((-35999865L), true);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getShortName((-54479800L), locale19);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone1.isLocalDateTimeGap(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "69) test0726(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
// flaky "67) test0726(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
// flaky "61) test0726(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-35999865L) + "'", long17 == (-35999865L));
// flaky "51) test0726(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.String str15 = dateTimeZone14.getID();
        long long17 = dateTimeZone14.previousTransition((-1L));
        long long21 = dateTimeZone14.convertLocalToUTC(25200000L, true, 100L);
        long long23 = dateTimeZone12.getMillisKeepLocal(dateTimeZone14, 100L);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone12.getShortName((long) (short) 10, locale25);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long31 = dateTimeZone28.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        boolean boolean33 = dateTimeZone28.isFixed();
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        java.lang.String str36 = dateTimeZone35.getID();
        long long38 = dateTimeZone35.previousTransition((-1L));
        boolean boolean40 = dateTimeZone35.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale42 = null;
        java.lang.String str43 = dateTimeZone35.getName((long) (short) 0, locale42);
        long long45 = dateTimeZone35.nextTransition((long) ' ');
        int int47 = dateTimeZone35.getStandardOffset(115799900L);
        long long49 = dateTimeZone28.getMillisKeepLocal(dateTimeZone35, 110L);
        long long51 = dateTimeZone12.getMillisKeepLocal(dateTimeZone35, (long) ' ');
        long long53 = dateTimeZone12.convertUTCToLocal((long) 1);
        long long55 = dateTimeZone12.previousTransition((-1570084924199L));
        long long58 = dateTimeZone12.adjustOffset(211L, true);
        boolean boolean59 = dateTimeZone1.equals((java.lang.Object) dateTimeZone12);
        long long61 = dateTimeZone12.previousTransition((long) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "70) test0727(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
// flaky "68) test0727(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky "62) test0727(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
// flaky "52) test0727(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 25199900L + "'", long21 == 25199900L);
// flaky "36) test0727(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.001" + "'", str26, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-99L) + "'", long31 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.100" + "'", str36, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.100" + "'", str43, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 32L + "'", long45 == 32L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 110L + "'", long49 == 110L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-67L) + "'", long51 == (-67L));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 2L + "'", long53 == 2L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1570084924199L) + "'", long55 == (-1570084924199L));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 211L + "'", long58 == 211L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 100L + "'", long61 == 100L);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        java.lang.String str16 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        java.lang.String str25 = dateTimeZone13.getNameKey((long) (short) 0);
        java.lang.Object obj26 = dateTimeZone13.writeReplace();
        long long28 = dateTimeZone13.nextTransition((-115800010L));
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-115800010L) + "'", long28 == (-115800010L));
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(100L, locale11);
        java.lang.Object obj13 = dateTimeZone1.writeReplace();
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        long long19 = dateTimeZone1.convertLocalToUTC(11400100L, false, (-39599900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 11400000L + "'", long19 == 11400000L);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        boolean boolean7 = dateTimeZone1.isFixed();
        boolean boolean8 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
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
        java.lang.String str28 = dateTimeZone13.getNameKey((-1570120924101L));
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
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str5 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        java.lang.Object obj20 = dateTimeZone7.writeReplace();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
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
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str5 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.convertLocalToUTC((-2L), false);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((-71999989L), locale10);
        java.lang.String str12 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3L) + "'", long8 == (-3L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.lang.String str21 = dateTimeZone20.getID();
        long long23 = dateTimeZone20.previousTransition((-1L));
        boolean boolean24 = dateTimeZone1.equals((java.lang.Object) dateTimeZone20);
        boolean boolean25 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115799800L + "'", long14 == 115799800L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone1.isLocalDateTimeGap(localDateTime23);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        java.lang.String str42 = dateTimeZone21.getName(187199900L, locale41);
        long long45 = dateTimeZone21.convertLocalToUTC((long) 'a', false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-48L) + "'", long15 == (-48L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-101L) + "'", long19 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 25199900L + "'", long30 == 25199900L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.001" + "'", str35, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1570084924001L) + "'", long39 == (-1570084924001L));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.001" + "'", str42, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 96L + "'", long45 == 96L);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName((long) 'a');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone3.getShortName(324000001L, locale21);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1570084924000L) + "'", long19 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone3.isLocalDateTimeGap(localDateTime8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone3.getOffset(readableInstant10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getName((-3600100L), locale13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(111L, false, 25199999L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName(187199899L, locale14);
        long long19 = dateTimeZone1.convertLocalToUTC(0L, false, (-201L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 112L + "'", long12 == 112L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        long long11 = dateTimeZone1.previousTransition((long) '4');
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName((long) (byte) -1, locale13);
        boolean boolean15 = dateTimeZone1.isFixed();
        java.lang.String str16 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 1);
        java.lang.String str3 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:01" + "'", str3, "+10:01");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) '4', locale3);
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
        java.lang.String str21 = dateTimeZone8.getName((long) 'a');
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) 'a');
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone1.getName((-1570048923801L), locale24);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone1.getName((-1569724924100L), locale27);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        long long13 = dateTimeZone9.adjustOffset((long) (byte) 1, false);
        java.lang.String str15 = dateTimeZone9.getName(97L);
        int int17 = dateTimeZone9.getOffsetFromLocal((long) 1);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone9.isLocalDateTimeGap(localDateTime18);
        int int21 = dateTimeZone9.getOffsetFromLocal((-1570120924101L));
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (-115799999L));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj26 = dateTimeZone25.writeReplace();
        java.lang.Object obj27 = dateTimeZone25.writeReplace();
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone25, 115799800L);
        long long33 = dateTimeZone1.convertLocalToUTC((-360600001L), true, (long) 3600000);
        int int35 = dateTimeZone1.getStandardOffset((-10800098L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-115799900L) + "'", long23 == (-115799900L));
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 115799899L + "'", long29 == 115799899L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-360600101L) + "'", long33 == (-360600101L));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal(25199999L);
        int int5 = dateTimeZone1.getOffsetFromLocal((long) '4');
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getStandardOffset((-25200001L));
        int int10 = dateTimeZone1.getStandardOffset((-35999865L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        java.lang.String str12 = dateTimeZone10.getID();
        long long14 = dateTimeZone3.getMillisKeepLocal(dateTimeZone10, (-1570084924200L));
        java.lang.String str16 = dateTimeZone3.getNameKey((-1570200723899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:00" + "'", str12, "+01:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1570088524100L) + "'", long14 == (-1570088524100L));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((-168L), locale3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        int int44 = dateTimeZone24.getOffsetFromLocal((long) 1);
        java.lang.Object obj45 = dateTimeZone24.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-90000000L) + "'", long10 == (-90000000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-115199899L) + "'", long12 == (-115199899L));
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition((long) (-1));
        java.lang.String str5 = dateTimeZone1.getName(6720000L);
        boolean boolean7 = dateTimeZone1.isStandardOffset(209L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long4 = dateTimeZone1.adjustOffset((-35999948L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-35999948L) + "'", long4 == (-35999948L));
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        java.lang.String str35 = dateTimeZone1.toString();
        java.util.TimeZone timeZone36 = dateTimeZone1.toTimeZone();
        java.lang.String str38 = dateTimeZone1.getNameKey((long) (-3600000));
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 21600000L + "'", long34 == 21600000L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.100" + "'", str35, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        long long13 = dateTimeZone3.convertUTCToLocal((long) 32);
        java.lang.String str15 = dateTimeZone3.getName((-1569724924201L));
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone3.getOffset(readableInstant16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 132L + "'", long13 == 132L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, 6720000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long11 = dateTimeZone1.adjustOffset(115799900L, false);
        int int13 = dateTimeZone1.getOffset(76199986L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115799900L + "'", long11 == 115799900L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int8 = dateTimeZone1.getOffsetFromLocal((-47L));
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) (short) -1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean13 = dateTimeZone1.isStandardOffset(32L);
        long long15 = dateTimeZone1.nextTransition((-36000001L));
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 'a');
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone17.getName((long) (short) 1, locale23);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        long long31 = dateTimeZone27.getMillisKeepLocal(dateTimeZone29, (long) 'a');
        int int33 = dateTimeZone29.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone34 = dateTimeZone29.toTimeZone();
        java.util.TimeZone timeZone35 = dateTimeZone29.toTimeZone();
        long long37 = dateTimeZone29.convertUTCToLocal(0L);
        long long39 = dateTimeZone17.getMillisKeepLocal(dateTimeZone29, (long) (short) -1);
        long long42 = dateTimeZone17.convertLocalToUTC((-1570084924001L), false);
        int int44 = dateTimeZone17.getStandardOffset((-25200002L));
        int int46 = dateTimeZone17.getOffsetFromLocal((-91L));
        long long48 = dateTimeZone17.nextTransition((-3599802L));
        java.lang.String str49 = dateTimeZone17.toString();
        java.lang.Object obj50 = dateTimeZone17.writeReplace();
        java.util.TimeZone timeZone51 = dateTimeZone17.toTimeZone();
        long long53 = dateTimeZone1.getMillisKeepLocal(dateTimeZone17, 359999800L);
        java.lang.String str54 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-36000001L) + "'", long15 == (-36000001L));
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 97L + "'", long31 == 97L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1570084924101L) + "'", long42 == (-1570084924101L));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-3599802L) + "'", long48 == (-3599802L));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00:00.100" + "'", str49, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 359999800L + "'", long53 == 359999800L);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00:00.100" + "'", str54, "+00:00:00.100");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        long long5 = dateTimeZone1.previousTransition((-1570084924101L));
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 100, locale7);
        java.lang.String str9 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570084924101L) + "'", long5 == (-1570084924101L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360600000, 349800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 349800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        long long25 = dateTimeZone3.adjustOffset(53L, true);
        java.lang.Class<?> wildcardClass26 = dateTimeZone3.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 53L + "'", long25 == 53L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        long long8 = dateTimeZone2.convertLocalToUTC(115800000L, true, 99L);
        java.lang.String str10 = dateTimeZone2.getName(102L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getShortName((-25200001L), locale12);
        long long15 = dateTimeZone2.previousTransition((-10800100L));
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone2.isLocalDateTimeGap(localDateTime16);
        long long20 = dateTimeZone2.adjustOffset(51L, false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:10" + "'", str10, "+32:10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:10" + "'", str13, "+32:10");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-10800100L) + "'", long15 == (-10800100L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 51L + "'", long20 == 51L);
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        long long13 = dateTimeZone1.nextTransition((long) (byte) -1);
        long long16 = dateTimeZone1.convertLocalToUTC(45L, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean19 = dateTimeZone1.isStandardOffset((-1570048324101L));
        java.lang.String str21 = dateTimeZone1.getName((-1570207443899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-55L) + "'", long16 == (-55L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        int int22 = dateTimeZone1.getOffsetFromLocal((long) 100);
        java.lang.String str24 = dateTimeZone1.getName(244800000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-48L) + "'", long15 == (-48L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-101L) + "'", long19 == (-101L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset(52L);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName(152399799L, locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-99L) + "'", long13 == (-99L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        java.lang.String str25 = dateTimeZone13.getNameKey((long) (short) 0);
        boolean boolean27 = dateTimeZone13.isStandardOffset((-1570048923998L));
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone1.getName((-2L), locale23);
        long long27 = dateTimeZone1.convertLocalToUTC((-39599902L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-39600002L) + "'", long27 == (-39600002L));
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 10);
        java.lang.Class<?> wildcardClass3 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str5 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.convertLocalToUTC((-2L), false);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((-71999989L), locale10);
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3L) + "'", long8 == (-3L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        long long24 = dateTimeZone1.previousTransition((-25200102L));
        long long26 = dateTimeZone1.nextTransition((long) (short) 0);
        long long28 = dateTimeZone1.previousTransition(0L);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone1.getShortName(35999899L, locale30);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-25200102L) + "'", long24 == (-25200102L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long8 = dateTimeZone5.convertLocalToUTC((long) 1, true);
        int int10 = dateTimeZone5.getOffset((long) 115800000);
        int int12 = dateTimeZone5.getStandardOffset((long) 10);
        java.lang.Object obj13 = dateTimeZone5.writeReplace();
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.lang.String str15 = dateTimeZone1.getID();
        int int17 = dateTimeZone1.getOffset((-44L));
        long long19 = dateTimeZone1.nextTransition(324000003L);
        long long21 = dateTimeZone1.convertUTCToLocal(3600032L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-99L) + "'", long8 == (-99L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 324000003L + "'", long19 == 324000003L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3600042L + "'", long21 == 3600042L);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        java.lang.String str19 = dateTimeZone1.getNameKey((-10800099L));
        java.lang.Class<?> wildcardClass20 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 187199801L + "'", long13 == 187199801L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
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
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        java.lang.String str9 = dateTimeZone1.getID();
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) (-47L));
        java.lang.String str12 = dateTimeZone1.toString();
        long long14 = dateTimeZone1.nextTransition(36600032L);
        boolean boolean16 = dateTimeZone1.isStandardOffset((-1570048923800L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 36600032L + "'", long14 == 36600032L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone5.nextTransition((long) (short) 100);
        int int9 = dateTimeZone5.getOffsetFromLocal(100L);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (long) 115800000);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str14 = dateTimeZone13.getID();
        long long16 = dateTimeZone13.previousTransition((-1L));
        boolean boolean18 = dateTimeZone13.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone13.getName((long) (short) 0, locale20);
        long long23 = dateTimeZone13.nextTransition((long) ' ');
        long long27 = dateTimeZone13.convertLocalToUTC((long) '4', false, 115799900L);
        long long31 = dateTimeZone13.convertLocalToUTC((long) (short) -1, false, 36000000L);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        java.lang.String str36 = dateTimeZone35.getID();
        long long38 = dateTimeZone35.previousTransition((-1L));
        long long42 = dateTimeZone35.convertLocalToUTC(25200000L, true, 100L);
        long long44 = dateTimeZone33.getMillisKeepLocal(dateTimeZone35, 100L);
        java.util.Locale locale46 = null;
        java.lang.String str47 = dateTimeZone33.getShortName((long) (short) 10, locale46);
        boolean boolean49 = dateTimeZone33.isStandardOffset(25200001L);
        long long51 = dateTimeZone13.getMillisKeepLocal(dateTimeZone33, (-1570084924100L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        boolean boolean53 = dateTimeZone1.equals((java.lang.Object) dateTimeZone13);
        int int55 = dateTimeZone1.getOffset(36600032L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-48L) + "'", long27 == (-48L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-101L) + "'", long31 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.100" + "'", str36, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 25199900L + "'", long42 == 25199900L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00:00.001" + "'", str47, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1570084924001L) + "'", long51 == (-1570084924001L));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(32);
        java.lang.String str3 = dateTimeZone1.getNameKey((-1570084923900L));
        java.lang.String str5 = dateTimeZone1.getNameKey(362L);
        java.lang.String str7 = dateTimeZone1.getShortName(56L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str6 = dateTimeZone1.getShortName((-25200001L));
        boolean boolean7 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, 36600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        java.lang.String str5 = dateTimeZone2.getID();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getShortName((-91L), locale7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone2.getOffset(readableInstant9);
        java.lang.Class<?> wildcardClass11 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:10" + "'", str5, "+32:10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:10" + "'", str8, "+32:10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115800000 + "'", int10 == 115800000);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        int int5 = dateTimeZone1.getOffset((long) (short) -1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) 36000000);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((long) 25200000, locale9);
        boolean boolean11 = dateTimeZone1.isFixed();
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        long long16 = dateTimeZone1.convertLocalToUTC((-6720045L), false, 96L);
        boolean boolean18 = dateTimeZone1.isStandardOffset((-152399800L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-6720044L) + "'", long16 == (-6720044L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        long long11 = dateTimeZone1.nextTransition((long) ' ');
        int int13 = dateTimeZone1.getStandardOffset(115799900L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        boolean boolean16 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "71) test0780(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:01" + "'", str2, "+52:01");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "69) test0780(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:01" + "'", str9, "+52:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky "63) test0780(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 187260000 + "'", int13 == 187260000);
// flaky "53) test0780(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 187260000 + "'", int15 == 187260000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) false);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((long) 100, locale12);
        long long16 = dateTimeZone1.adjustOffset(0L, true);
        long long18 = dateTimeZone1.convertUTCToLocal((-1569969724101L));
        java.lang.String str19 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "72) test0781(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+52:01" + "'", str8, "+52:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "70) test0781(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+52:01" + "'", str13, "+52:01");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
// flaky "64) test0781(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1569782464101L) + "'", long18 == (-1569782464101L));
// flaky "54) test0781(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+52:01" + "'", str19, "+52:01");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        long long13 = dateTimeZone9.adjustOffset((long) (byte) 1, false);
        java.lang.String str15 = dateTimeZone9.getName(97L);
        int int17 = dateTimeZone9.getOffsetFromLocal((long) 1);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone9.isLocalDateTimeGap(localDateTime18);
        int int21 = dateTimeZone9.getOffsetFromLocal((-1570120924101L));
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (-115799999L));
        long long27 = dateTimeZone1.convertLocalToUTC((-39599937L), true, (-1570088523999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "73) test0782(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 187260000 + "'", int5 == 187260000);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
// flaky "71) test0782(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 71460000L + "'", long23 == 71460000L);
// flaky "65) test0782(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-226859937L) + "'", long27 == (-226859937L));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        int int6 = dateTimeZone1.getStandardOffset((long) 349800000);
        java.lang.String str8 = dateTimeZone1.getName((-1570084924101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) '4', locale8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int15 = dateTimeZone13.getStandardOffset((long) 10);
        long long17 = dateTimeZone13.previousTransition((long) (-1));
        boolean boolean18 = dateTimeZone1.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass19 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "74) test0784(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:01" + "'", str9, "+52:01");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115800000 + "'", int15 == 115800000);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset((long) (byte) 10);
        int int7 = dateTimeZone1.getStandardOffset(115799901L);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) ' ');
        java.lang.Object obj10 = null;
        boolean boolean11 = dateTimeZone1.equals(obj10);
        long long13 = dateTimeZone1.nextTransition(115800054L);
        long long17 = dateTimeZone1.convertLocalToUTC((-1570048923899L), false, 389279900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 115800054L + "'", long13 == 115800054L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570048923898L) + "'", long17 == (-1570048923898L));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        boolean boolean9 = dateTimeZone3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        int int12 = dateTimeZone3.getOffsetFromLocal((long) 0);
        long long15 = dateTimeZone3.convertLocalToUTC(132L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "75) test0786(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "72) test0786(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky "66) test0786(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 133L + "'", long15 == 133L);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        java.lang.String str12 = dateTimeZone1.getName((long) 'a');
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        long long31 = dateTimeZone16.adjustOffset(25199900L, false);
        boolean boolean32 = dateTimeZone1.equals((java.lang.Object) long31);
        java.lang.Object obj33 = dateTimeZone1.writeReplace();
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone1.getOffset(readableInstant34);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
// flaky "76) test0787(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
// flaky "73) test0787(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
// flaky "67) test0787(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 25199900L + "'", long31 == 25199900L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName((-1570084924000L), locale6);
        long long9 = dateTimeZone1.convertUTCToLocal(2L);
        java.lang.String str11 = dateTimeZone1.getName(0L);
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) 52L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
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
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        int int13 = dateTimeZone3.getOffset((-1570048924001L));
        int int15 = dateTimeZone3.getOffset(10L);
        java.lang.String str17 = dateTimeZone3.getName((-1570052523800L));
        java.lang.Class<?> wildcardClass18 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "77) test0789(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "74) test0789(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
// flaky "68) test0789(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky "55) test0789(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky "37) test0789(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        long long21 = dateTimeZone3.convertLocalToUTC((-35999902L), false, 323999902L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "78) test0790(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "75) test0790(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "69) test0790(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "56) test0790(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "38) test0790(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-35999901L) + "'", long21 == (-35999901L));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        long long7 = dateTimeZone1.previousTransition((long) (short) 10);
        java.lang.String str8 = dateTimeZone1.toString();
        java.lang.String str10 = dateTimeZone1.getName((-1570084923900L));
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-100L), locale12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str16 = dateTimeZone1.getShortName(187259848L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "79) test0791(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky "76) test0791(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "70) test0791(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
// flaky "57) test0791(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
// flaky "39) test0791(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        long long66 = dateTimeZone24.convertUTCToLocal((long) (short) 0);
        java.util.Locale locale68 = null;
        java.lang.String str69 = dateTimeZone24.getName(187199901L, locale68);
        java.lang.String str70 = dateTimeZone24.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "80) test0792(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "77) test0792(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200001L + "'", long10 == 25200001L);
// flaky "71) test0792(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 102L + "'", long12 == 102L);
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
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 100L + "'", long66 == 100L);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "+00:00:00.100" + "'", str69, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "+00:00:00.100" + "'", str70, "+00:00:00.100");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        int int44 = dateTimeZone1.getStandardOffset((-78719989L));
        org.joda.time.ReadableInstant readableInstant45 = null;
        int int46 = dateTimeZone1.getOffset(readableInstant45);
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone1.getShortName(25199999L);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "81) test0794(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 360000000 + "'", int5 == 360000000);
// flaky "78) test0794(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        int int23 = dateTimeZone13.getStandardOffset(3600000L);
        int int25 = dateTimeZone13.getOffset(209L);
        java.util.TimeZone timeZone26 = dateTimeZone13.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "82) test0795(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
// flaky "79) test0795(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.032" + "'", str17, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.032" + "'", str18, "+00:00:00.032");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long20 = dateTimeZone18.nextTransition((long) 36000000);
        java.lang.Object obj21 = dateTimeZone18.writeReplace();
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forID("+00:00:00.052");
        long long26 = dateTimeZone1.getMillisKeepLocal(dateTimeZone24, 187200052L);
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone1.getOffset(readableInstant27);
        boolean boolean30 = dateTimeZone1.isStandardOffset((-2L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "83) test0798(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
// flaky "80) test0798(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
// flaky "72) test0798(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
// flaky "58) test0798(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 36000000L + "'", long20 == 36000000L);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone24);
// flaky "40) test0798(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 187200001L + "'", long26 == 187200001L);
// flaky "30) test0798(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(349200000, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        long long18 = dateTimeZone3.adjustOffset(25199900L, false);
        long long21 = dateTimeZone3.adjustOffset(2L, false);
        long long25 = dateTimeZone3.convertLocalToUTC(32L, true, (long) 10);
        int int27 = dateTimeZone3.getOffsetFromLocal((-1570048924001L));
        java.lang.String str28 = dateTimeZone3.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "84) test0800(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "81) test0800(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
// flaky "73) test0800(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25199900L + "'", long18 == 25199900L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2L + "'", long21 == 2L);
// flaky "59) test0800(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 31L + "'", long25 == 31L);
// flaky "41) test0800(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
// flaky "31) test0800(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.001" + "'", str28, "+00:00:00.001");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        long long13 = dateTimeZone3.previousTransition((-1570200724100L));
        long long15 = dateTimeZone3.nextTransition((-1570444924202L));
        java.lang.String str16 = dateTimeZone3.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "85) test0801(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "82) test0801(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570200724100L) + "'", long13 == (-1570200724100L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570444924202L) + "'", long15 == (-1570444924202L));
// flaky "74) test0801(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        int int6 = dateTimeZone1.getOffsetFromLocal((-115799900L));
        long long10 = dateTimeZone1.convertLocalToUTC((-1570444923901L), true, (-1570084924200L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570444923902L) + "'", long10 == (-1570444923902L));
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
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        java.lang.String str15 = dateTimeZone3.getID();
        java.lang.String str17 = dateTimeZone3.getNameKey((long) (byte) -1);
        java.lang.Object obj18 = null;
        boolean boolean19 = dateTimeZone3.equals(obj18);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long25 = dateTimeZone21.getMillisKeepLocal(dateTimeZone23, (long) 'a');
        int int27 = dateTimeZone23.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone28 = dateTimeZone23.toTimeZone();
        java.util.TimeZone timeZone29 = dateTimeZone23.toTimeZone();
        long long31 = dateTimeZone23.convertUTCToLocal(0L);
        boolean boolean33 = dateTimeZone23.equals((java.lang.Object) 100);
        long long35 = dateTimeZone23.convertUTCToLocal((long) 10);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        long long39 = dateTimeZone37.nextTransition((long) (short) 100);
        java.lang.String str41 = dateTimeZone37.getNameKey(1L);
        boolean boolean42 = dateTimeZone23.equals((java.lang.Object) str41);
        long long46 = dateTimeZone23.convertLocalToUTC(0L, false, 32L);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        long long50 = dateTimeZone23.getMillisKeepLocal(dateTimeZone48, 25199899L);
        long long52 = dateTimeZone48.convertUTCToLocal((-3599802L));
        long long54 = dateTimeZone48.previousTransition((-1570084924000L));
        long long56 = dateTimeZone3.getMillisKeepLocal(dateTimeZone48, 187199900L);
        java.lang.Object obj57 = dateTimeZone48.writeReplace();
        int int59 = dateTimeZone48.getOffsetFromLocal((-36000000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "86) test0803(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "83) test0803(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "75) test0803(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "60) test0803(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
// flaky "42) test0803(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
// flaky "32) test0803(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky "22) test0803(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 9L + "'", long35 == 9L);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky "18) test0803(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone48);
// flaky "10) test0803(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 25199899L + "'", long50 == 25199899L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-3599803L) + "'", long52 == (-3599803L));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1570084924000L) + "'", long54 == (-1570084924000L));
// flaky "6) test0803(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long56 + "' != '" + 187199900L + "'", long56 == 187199900L);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        java.lang.String str7 = dateTimeZone1.toString();
        long long11 = dateTimeZone1.convertLocalToUTC(324000099L, false, (-25200102L));
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "87) test0804(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky "84) test0804(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
// flaky "76) test0804(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
// flaky "61) test0804(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 324000100L + "'", long11 == 324000100L);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long9 = dateTimeZone1.convertLocalToUTC(25199999L, false, 79800000L);
        int int11 = dateTimeZone1.getOffset(187259848L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 25199899L + "'", long9 == 25199899L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(111L, false, 25199999L);
        long long16 = dateTimeZone1.convertLocalToUTC(25199999L, false, (-48L));
        int int18 = dateTimeZone1.getOffsetFromLocal((long) (short) 100);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone1.getShortName((-25199801L), locale20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 112L + "'", long12 == 112L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200000L + "'", long16 == 25200000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        long long18 = dateTimeZone1.previousTransition((-35999899L));
        java.lang.Class<?> wildcardClass19 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-35999899L) + "'", long18 == (-35999899L));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.previousTransition(110L);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-32400101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 97L);
        long long19 = dateTimeZone14.convertLocalToUTC(25200001L, false);
        java.lang.String str20 = dateTimeZone14.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199900L + "'", long10 == 25199900L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599902L) + "'", long16 == (-3599902L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 21600001L + "'", long19 == 21600001L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+01:00" + "'", str20, "+01:00");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        boolean boolean7 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName(115800000L, locale11);
        boolean boolean13 = dateTimeZone1.isFixed();
        long long16 = dateTimeZone1.adjustOffset((-55L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-55L) + "'", long16 == (-55L));
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) '4', locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName((-1570084924001L), locale6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "88) test0811(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
// flaky "85) test0811(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
// flaky "77) test0811(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str10 = dateTimeZone1.getShortName((-6720051L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "89) test0812(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky "86) test0812(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        long long5 = dateTimeZone1.convertLocalToUTC(115799797L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115799697L + "'", long5 == 115799697L);
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
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) false);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((long) 100, locale12);
        long long15 = dateTimeZone1.convertUTCToLocal((-1570084924101L));
        int int17 = dateTimeZone1.getOffsetFromLocal((-1570084924001L));
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone1.isLocalDateTimeGap(localDateTime18);
        java.lang.Class<?> wildcardClass20 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "90) test0814(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "87) test0814(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
// flaky "78) test0814(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924101L) + "'", long15 == (-1570084924101L));
// flaky "62) test0814(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.adjustOffset((long) '4', false);
        long long11 = dateTimeZone1.nextTransition(25199990L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 25199990L + "'", long11 == 25199990L);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str5 = dateTimeZone1.toString();
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        java.lang.String str8 = dateTimeZone1.getShortName((-35999903L));
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(97L);
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        int int11 = dateTimeZone1.getStandardOffset((long) 'a');
        int int13 = dateTimeZone1.getOffset((-35999699L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName((-1569969124101L), locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "91) test0818(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "88) test0818(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
// flaky "79) test0818(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "63) test0818(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky "43) test0818(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115800000, 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        java.lang.String str9 = dateTimeZone1.getShortName(100L);
        long long11 = dateTimeZone1.convertUTCToLocal((-52L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "92) test0820(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky "89) test0820(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
// flaky "80) test0820(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-52L) + "'", long11 == (-52L));
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        org.joda.time.DateTimeZone dateTimeZone32 = null; // flaky "93) test0821(org.joda.time.RegressionTest1)": org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        int int34 = 0; // flaky "90) test0821(org.joda.time.RegressionTest1)": dateTimeZone32.getStandardOffset((-35999990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "81) test0821(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "64) test0821(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "44) test0821(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
// flaky "33) test0821(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570084924101L) + "'", long20 == (-1570084924101L));
// flaky "23) test0821(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky "19) test0821(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
// flaky "11) test0821(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570048924000L) + "'", long26 == (-1570048924000L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 25199999L + "'", long28 == 25199999L);
// flaky "7) test0821(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(timeZone31);
// flaky "3) test0821(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "1) test0821(org.joda.time.RegressionTest1)":         org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int11 = dateTimeZone1.getOffsetFromLocal(324000099L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "94) test0822(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
// flaky "91) test0822(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
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
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone3.getName(547200000L, locale16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long22 = dateTimeZone19.convertLocalToUTC((-1570084924001L), false);
        int int24 = dateTimeZone19.getOffsetFromLocal((-1570084924000L));
        java.lang.String str26 = dateTimeZone19.getShortName((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        long long29 = dateTimeZone19.nextTransition((-1570084924201L));
        boolean boolean30 = dateTimeZone3.equals((java.lang.Object) dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1570084924000L) + "'", long22 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-00:00:00.001" + "'", str26, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1570084924201L) + "'", long29 == (-1570084924201L));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long8 = dateTimeZone1.previousTransition(115800000L);
        long long12 = dateTimeZone1.convertLocalToUTC(97L, true, (-35999903L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean14 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115800000L + "'", long8 == 115800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str3 = dateTimeZone1.getID();
        boolean boolean5 = dateTimeZone1.isStandardOffset((-360599997L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:00" + "'", str3, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.lang.String str3 = dateTimeZone1.getName((-35999799L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str5 = dateTimeZone1.getID();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName(323999903L, locale7);
        int int10 = dateTimeZone1.getStandardOffset(115799697L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+100:00" + "'", str3, "+100:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+100:00" + "'", str5, "+100:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+100:00" + "'", str8, "+100:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 360000000 + "'", int10 == 360000000);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str3 = dateTimeZone1.getNameKey(79800100L);
        int int5 = dateTimeZone1.getOffset((-35999900L));
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long8 = dateTimeZone4.getMillisKeepLocal(dateTimeZone6, (long) 'a');
        boolean boolean9 = dateTimeZone4.isFixed();
        int int11 = dateTimeZone4.getStandardOffset((-1L));
        java.lang.String str13 = dateTimeZone4.getShortName(25199900L);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj16 = dateTimeZone15.writeReplace();
        long long20 = dateTimeZone15.convertLocalToUTC((long) 25200000, true, (long) (short) 10);
        int int22 = dateTimeZone15.getStandardOffset(115799900L);
        long long24 = dateTimeZone4.getMillisKeepLocal(dateTimeZone15, (-25200001L));
        boolean boolean25 = dateTimeZone1.equals((java.lang.Object) dateTimeZone4);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone4.getName((-36000000L), locale27);
        java.util.TimeZone timeZone29 = dateTimeZone4.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 360000000 + "'", int11 == 360000000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:00" + "'", str13, "+100:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25199999L + "'", long20 == 25199999L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 334799998L + "'", long24 == 334799998L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+100:00" + "'", str28, "+100:00");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+:0:00");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        java.lang.String str5 = dateTimeZone1.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.lang.String str9 = dateTimeZone1.getShortName(0L);
        long long11 = dateTimeZone1.previousTransition((-11L));
        boolean boolean13 = dateTimeZone1.isStandardOffset((-1569969724100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+100:00" + "'", str9, "+100:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-11L) + "'", long11 == (-11L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 'a');
        boolean boolean22 = dateTimeZone17.isFixed();
        int int24 = dateTimeZone17.getStandardOffset((-1L));
        int int26 = dateTimeZone17.getOffset((long) (short) 1);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone17.getName((-1570084924202L), locale28);
        int int31 = dateTimeZone17.getStandardOffset(35L);
        long long34 = dateTimeZone17.adjustOffset((long) '#', true);
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        long long38 = dateTimeZone36.previousTransition((long) (short) 1);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone36.getName(25199899L, locale40);
        boolean boolean42 = dateTimeZone17.equals((java.lang.Object) str41);
        boolean boolean44 = dateTimeZone17.isStandardOffset((-1570084924102L));
        int int46 = dateTimeZone17.getOffsetFromLocal((-115800001L));
        boolean boolean47 = dateTimeZone1.equals((java.lang.Object) int46);
        java.lang.Object obj48 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 360000000 + "'", int5 == 360000000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200000L + "'", long10 == 25200000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-35999903L) + "'", long12 == (-35999903L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570048924002L) + "'", long15 == (-1570048924002L));
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 360000000 + "'", int24 == 360000000);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 360000000 + "'", int26 == 360000000);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+100:00" + "'", str29, "+100:00");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 360000000 + "'", int31 == 360000000);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 35L + "'", long34 == 35L);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+100:00" + "'", str41, "+100:00");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 360000000 + "'", int46 == 360000000);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        long long26 = dateTimeZone2.adjustOffset(115799799L, false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 360000000 + "'", int15 == 360000000);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+:0:00");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+:0:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-359999790L) + "'", long21 == (-359999790L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1569933124000L) + "'", long23 == (-1569933124000L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 115799799L + "'", long26 == 115799799L);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        long long13 = dateTimeZone1.nextTransition((long) (byte) -1);
        java.lang.Object obj14 = dateTimeZone1.writeReplace();
        long long16 = dateTimeZone1.convertUTCToLocal((-1570008723948L));
        int int18 = dateTimeZone1.getStandardOffset((-1569724924101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+100:00" + "'", str8, "+100:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 360000000 + "'", int10 == 360000000);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1569648723948L) + "'", long16 == (-1569648723948L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 360000000 + "'", int18 == 360000000);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        long long29 = dateTimeZone3.adjustOffset((-48L), false);
        java.lang.String str30 = dateTimeZone3.toString();
        java.lang.String str31 = dateTimeZone3.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 360000000 + "'", int7 == 360000000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+:0:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+:0:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 360000000L + "'", long11 == 360000000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 360000010L + "'", long15 == 360000010L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-360000000L) + "'", long26 == (-360000000L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-48L) + "'", long29 == (-48L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+100:00" + "'", str30, "+100:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+100:00" + "'", str31, "+100:00");
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        long long18 = dateTimeZone3.adjustOffset(25199900L, false);
        int int20 = dateTimeZone3.getStandardOffset(359999909L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 360000000 + "'", int7 == 360000000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+:0:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+100:00" + "'", str11, "+100:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+100:00" + "'", str14, "+100:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25199900L + "'", long18 == 25199900L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 360000000 + "'", int20 == 360000000);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long9 = dateTimeZone1.adjustOffset((long) '#', true);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "95) test0836(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.052" + "'", str2, "+00:00:00.052");
// flaky "92) test0836(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.052" + "'", str4, "+00:00:00.052");
// flaky "82) test0836(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.052" + "'", str6, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        long long6 = dateTimeZone2.convertLocalToUTC((long) 35, true, (-101L));
        long long8 = dateTimeZone2.convertUTCToLocal(9L);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        int int12 = dateTimeZone10.getOffsetFromLocal(25199999L);
        int int14 = dateTimeZone10.getOffsetFromLocal((long) '4');
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) '4');
        int int17 = dateTimeZone2.getOffset((-187199900L));
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.lang.String str22 = dateTimeZone21.getID();
        long long24 = dateTimeZone21.previousTransition((-1L));
        long long28 = dateTimeZone21.convertLocalToUTC(25200000L, true, 100L);
        long long30 = dateTimeZone19.getMillisKeepLocal(dateTimeZone21, 100L);
        long long32 = dateTimeZone21.convertUTCToLocal(187199900L);
        long long34 = dateTimeZone21.convertUTCToLocal(35L);
        long long37 = dateTimeZone21.convertLocalToUTC((-91L), true);
        long long39 = dateTimeZone2.getMillisKeepLocal(dateTimeZone21, (-39599802L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-115799965L) + "'", long6 == (-115799965L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115800009L + "'", long8 == 115800009L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "96) test0837(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36000000 + "'", int12 == 36000000);
// flaky "93) test0837(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36000000 + "'", int14 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115800000 + "'", int17 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
// flaky "83) test0837(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+10:00" + "'", str22, "+10:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
// flaky "65) test0837(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-10800000L) + "'", long28 == (-10800000L));
// flaky "45) test0837(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-35999899L) + "'", long30 == (-35999899L));
// flaky "34) test0837(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 223199900L + "'", long32 == 223199900L);
// flaky "24) test0837(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 36000035L + "'", long34 == 36000035L);
// flaky "20) test0837(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-36000091L) + "'", long37 == (-36000091L));
// flaky "12) test0837(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 40200198L + "'", long39 == 40200198L);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset(52L);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false);
        long long15 = dateTimeZone1.previousTransition((long) (byte) 0);
        long long19 = dateTimeZone1.convertLocalToUTC(76200086L, true, 359999800L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "97) test0838(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36000000 + "'", int8 == 36000000);
// flaky "94) test0838(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
// flaky "84) test0838(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-35999999L) + "'", long13 == (-35999999L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
// flaky "66) test0838(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 40200086L + "'", long19 == 40200086L);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        long long5 = dateTimeZone1.convertLocalToUTC((long) 100, false);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str9 = dateTimeZone7.getNameKey((long) 115800000);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone7.getShortName((-1570084924001L), locale11);
        long long14 = dateTimeZone7.previousTransition(25199948L);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-334800000L));
        long long20 = dateTimeZone1.convertLocalToUTC((long) (byte) 0, true, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 25199948L + "'", long14 == 25199948L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-334799998L) + "'", long16 == (-334799998L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        int int11 = dateTimeZone1.getStandardOffset((long) 'a');
        int int13 = dateTimeZone1.getOffset((-35999699L));
        boolean boolean14 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone16 = null; // flaky "98) test0840(org.joda.time.RegressionTest1)": org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "95) test0840(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "85) test0840(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
// flaky "67) test0840(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36000000 + "'", int11 == 36000000);
// flaky "46) test0840(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36000000 + "'", int13 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky "35) test0840(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+10:00");
// flaky "25) test0840(org.joda.time.RegressionTest1)":         org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        int int4 = dateTimeZone0.getOffset(98L);
        boolean boolean6 = dateTimeZone0.isStandardOffset((-35999890L));
        java.util.TimeZone timeZone7 = dateTimeZone0.toTimeZone();
        long long10 = dateTimeZone0.convertLocalToUTC((-3599803L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3599803L) + "'", long10 == (-3599803L));
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        long long38 = dateTimeZone13.adjustOffset((-35999990L), false);
        long long42 = dateTimeZone13.convertLocalToUTC(25200000L, false, (-268L));
        boolean boolean43 = dateTimeZone13.isFixed();
        long long46 = dateTimeZone13.convertLocalToUTC(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "99) test0842(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "96) test0842(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "86) test0842(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky "68) test0842(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
// flaky "47) test0842(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
// flaky "36) test0842(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky "26) test0842(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
// flaky "21) test0842(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.100" + "'", str34, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-35999990L) + "'", long38 == (-35999990L));
// flaky "13) test0842(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 25199900L + "'", long42 == 25199900L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
// flaky "8) test0842(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-100L) + "'", long46 == (-100L));
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        long long11 = dateTimeZone1.previousTransition((long) '4');
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName((long) (byte) -1, locale13);
        java.lang.Class<?> wildcardClass15 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "100) test0844(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "97) test0844(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
// flaky "87) test0844(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00");
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.convertUTCToLocal((-359999945L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-359999945L) + "'", long5 == (-359999945L));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long12 = dateTimeZone1.nextTransition((long) (short) -1);
        java.lang.String str14 = dateTimeZone1.getShortName((-1570084924102L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        long long13 = dateTimeZone9.adjustOffset((long) (byte) 1, false);
        java.lang.String str15 = dateTimeZone9.getName(97L);
        int int17 = dateTimeZone9.getOffsetFromLocal((long) 1);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone9.isLocalDateTimeGap(localDateTime18);
        int int21 = dateTimeZone9.getOffsetFromLocal((-1570120924101L));
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (-115799999L));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj26 = dateTimeZone25.writeReplace();
        java.lang.Object obj27 = dateTimeZone25.writeReplace();
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone25, 115799800L);
        long long33 = dateTimeZone1.convertLocalToUTC((-1569724924201L), false, 3599900L);
        java.lang.Class<?> wildcardClass34 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "101) test0847(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
// flaky "98) test0847(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-115799900L) + "'", long23 == (-115799900L));
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
// flaky "88) test0847(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 115799899L + "'", long29 == 115799899L);
// flaky "69) test0847(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1569724924301L) + "'", long33 == (-1569724924301L));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        long long38 = dateTimeZone13.adjustOffset((-35999990L), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        long long41 = dateTimeZone13.convertUTCToLocal(11L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "102) test0848(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "99) test0848(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
// flaky "89) test0848(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
// flaky "70) test0848(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky "48) test0848(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
// flaky "37) test0848(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.100" + "'", str34, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-35999990L) + "'", long38 == (-35999990L));
// flaky "27) test0848(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 111L + "'", long41 == 111L);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        int int12 = dateTimeZone1.getOffset((long) '#');
        int int14 = dateTimeZone1.getOffsetFromLocal(115799999L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj17 = dateTimeZone16.writeReplace();
        java.lang.Object obj18 = dateTimeZone16.writeReplace();
        int int20 = dateTimeZone16.getOffset((long) (short) -1);
        boolean boolean21 = dateTimeZone16.isFixed();
        java.lang.String str22 = dateTimeZone16.getID();
        long long25 = dateTimeZone16.convertLocalToUTC(25200000L, true);
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, (-25200103L));
        java.lang.String str28 = dateTimeZone1.toString();
        java.lang.Object obj29 = dateTimeZone1.writeReplace();
        boolean boolean30 = dateTimeZone1.isFixed();
        long long32 = dateTimeZone1.convertUTCToLocal((-151799965L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "103) test0849(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
// flaky "100) test0849(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
// flaky "90) test0849(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
// flaky "71) test0849(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 25200001L + "'", long25 == 25200001L);
// flaky "49) test0849(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-25200002L) + "'", long27 == (-25200002L));
// flaky "38) test0849(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
// flaky "28) test0849(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-151799865L) + "'", long32 == (-151799865L));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        java.lang.String str7 = dateTimeZone1.toString();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-47L), locale9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        boolean boolean12 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "104) test0850(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
// flaky "101) test0850(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
// flaky "91) test0850(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
// flaky "72) test0850(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        java.lang.String str25 = dateTimeZone3.getID();
        boolean boolean27 = dateTimeZone3.isStandardOffset((-35999900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "105) test0851(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "102) test0851(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
// flaky "92) test0851(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
// flaky "73) test0851(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "50) test0851(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1570048923800L) + "'", long24 == (-1570048923800L));
// flaky "39) test0851(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        boolean boolean19 = dateTimeZone1.isStandardOffset((-25199903L));
        java.lang.String str20 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "106) test0852(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "103) test0852(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
// flaky "93) test0852(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924001L) + "'", long15 == (-1570084924001L));
// flaky "74) test0852(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky "51) test0852(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(36060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        long long4 = dateTimeZone1.convertLocalToUTC((-46800000L), false);
        long long7 = dateTimeZone1.adjustOffset(360000111L, true);
        long long9 = dateTimeZone1.nextTransition((-1570444923900L));
        long long12 = dateTimeZone1.convertLocalToUTC(28799900L, false);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName(3599949L, locale14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-46800000L) + "'", long4 == (-46800000L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 360000111L + "'", long7 == 360000111L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1570444923900L) + "'", long9 == (-1570444923900L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 28799900L + "'", long12 == 28799900L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        java.lang.String str25 = dateTimeZone2.getShortName(2L);
        java.lang.Class<?> wildcardClass26 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
// flaky "107) test0855(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
// flaky "104) test0855(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 110L + "'", long21 == 110L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1569933124000L) + "'", long23 == (-1569933124000L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:10" + "'", str25, "+32:10");
        org.junit.Assert.assertNotNull(wildcardClass26);
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone3.getName((long) (short) 100, locale16);
        long long19 = dateTimeZone3.convertUTCToLocal((-25199901L));
        int int21 = dateTimeZone3.getStandardOffset((-191L));
        long long25 = dateTimeZone3.convertLocalToUTC(33L, true, (-32999790L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "108) test0856(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "105) test0856(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
// flaky "94) test0856(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
// flaky "75) test0856(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
// flaky "52) test0856(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-25199801L) + "'", long19 == (-25199801L));
// flaky "40) test0856(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
// flaky "29) test0856(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-67L) + "'", long25 == (-67L));
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        java.lang.String str41 = dateTimeZone1.getID();
        java.util.Locale locale43 = null;
        java.lang.String str44 = dateTimeZone1.getShortName((long) 3600000, locale43);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "109) test0857(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "106) test0857(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199900L + "'", long10 == 25199900L);
// flaky "95) test0857(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.001" + "'", str41, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00:00.001" + "'", str44, "+00:00:00.001");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        int int10 = dateTimeZone1.getOffsetFromLocal((-3599991L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(97L);
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.convertLocalToUTC(115799797L, true);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName((-1570081324000L), locale15);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone1.isLocalDateTimeGap(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 115799798L + "'", long13 == 115799798L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
        boolean boolean28 = dateTimeZone8.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 110L + "'", long23 == 110L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-67L) + "'", long25 == (-67L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long20 = dateTimeZone18.nextTransition((long) 36000000);
        java.lang.Object obj21 = dateTimeZone18.writeReplace();
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) dateTimeZone18);
        int int24 = dateTimeZone18.getOffsetFromLocal(96L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 36000000L + "'", long20 == 36000000L);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        long long9 = dateTimeZone3.convertUTCToLocal((-168L));
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone3.isLocalDateTimeGap(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-68L) + "'", long9 == (-68L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), 6720000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115200000, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(349200000, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        int int14 = dateTimeZone10.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone15 = dateTimeZone10.toTimeZone();
        int int17 = dateTimeZone10.getOffset((long) (short) 1);
        long long21 = dateTimeZone10.convertLocalToUTC((long) 115800000, true, (-1570084924000L));
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) (-1570084924000L));
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone1.isLocalDateTimeGap(localDateTime23);
        boolean boolean25 = dateTimeZone1.isFixed();
        long long28 = dateTimeZone1.convertLocalToUTC(187199902L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 115799900L + "'", long21 == 115799900L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 187199802L + "'", long28 == 187199802L);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+100:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+100:00\" is malformed at \"0:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        long long6 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        long long12 = dateTimeZone1.previousTransition((long) (short) 100);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        long long15 = dateTimeZone1.previousTransition(323999902L);
        java.lang.String str16 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 323999902L + "'", long15 == 323999902L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        int int22 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long24 = dateTimeZone1.previousTransition(1L);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone1.getShortName((-39599899L), locale26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long33 = dateTimeZone29.convertLocalToUTC(25199999L, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone36 = dateTimeZone35.toTimeZone();
        long long39 = dateTimeZone35.adjustOffset((long) (byte) 1, false);
        java.lang.String str41 = dateTimeZone35.getName(97L);
        java.lang.String str43 = dateTimeZone35.getNameKey(0L);
        long long45 = dateTimeZone29.getMillisKeepLocal(dateTimeZone35, (-1570084924101L));
        org.joda.time.LocalDateTime localDateTime46 = null;
        boolean boolean47 = dateTimeZone35.isLocalDateTimeGap(localDateTime46);
        int int49 = dateTimeZone35.getOffsetFromLocal((-1570200724100L));
        long long51 = dateTimeZone1.getMillisKeepLocal(dateTimeZone35, 36000000L);
        java.util.TimeZone timeZone52 = dateTimeZone1.toTimeZone();
        int int54 = dateTimeZone1.getOffsetFromLocal((-25200000L));
        java.util.TimeZone timeZone55 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forTimeZone(timeZone55);
        java.util.TimeZone timeZone57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        long long60 = dateTimeZone56.getMillisKeepLocal(dateTimeZone58, (long) 'a');
        long long62 = dateTimeZone56.convertUTCToLocal(0L);
        java.util.Locale locale64 = null;
        java.lang.String str65 = dateTimeZone56.getShortName((-1570084924201L), locale64);
        org.joda.time.ReadableInstant readableInstant66 = null;
        int int67 = dateTimeZone56.getOffset(readableInstant66);
        boolean boolean68 = dateTimeZone1.equals((java.lang.Object) int67);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:00" + "'", str2, "+01:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+01:00" + "'", str9, "+01:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3599948L) + "'", long15 == (-3599948L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-3600001L) + "'", long19 == (-3600001L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+01:00" + "'", str20, "+01:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3600000 + "'", int22 == 3600000);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+01:00" + "'", str27, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 25199999L + "'", long33 == 25199999L);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.001" + "'", str41, "+00:00:00.001");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1570084924102L) + "'", long45 == (-1570084924102L));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 39599999L + "'", long51 == 39599999L);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3600000 + "'", int54 == 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 97L + "'", long60 == 97L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 3600000L + "'", long62 == 3600000L);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "+01:00" + "'", str65, "+01:00");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 3600000 + "'", int67 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(6720000, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        java.lang.Object obj21 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "110) test0872(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky "107) test0872(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
// flaky "96) test0872(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115799901L + "'", long14 == 115799901L);
// flaky "76) test0872(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky "53) test0872(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) false);
        long long12 = dateTimeZone1.nextTransition(187199900L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "111) test0873(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 187199900L + "'", long12 == 187199900L);
// flaky "108) test0873(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        long long27 = dateTimeZone23.getMillisKeepLocal(dateTimeZone25, (long) 'a');
        boolean boolean28 = dateTimeZone23.isFixed();
        int int30 = dateTimeZone23.getStandardOffset((-1L));
        int int32 = dateTimeZone23.getOffset((long) (short) 1);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone23.getName((-1570084924202L), locale34);
        int int37 = dateTimeZone23.getStandardOffset(35L);
        java.lang.String str39 = dateTimeZone23.getName((-99L));
        long long41 = dateTimeZone3.getMillisKeepLocal(dateTimeZone23, (-6720045L));
        java.util.Locale locale43 = null;
        java.lang.String str44 = dateTimeZone3.getShortName((-1570084923900L), locale43);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "112) test0874(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "109) test0874(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "97) test0874(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
// flaky "77) test0874(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
// flaky "54) test0874(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
// flaky "41) test0874(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
// flaky "30) test0874(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky "22) test0874(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
// flaky "14) test0874(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
// flaky "9) test0874(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.100" + "'", str35, "+00:00:00.100");
// flaky "4) test0874(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
// flaky "2) test0874(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.100" + "'", str39, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-6720045L) + "'", long41 == (-6720045L));
// flaky "1) test0874(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00:00.100" + "'", str44, "+00:00:00.100");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        long long8 = dateTimeZone1.convertLocalToUTC((-1570084924100L), true, 1L);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long14 = dateTimeZone1.convertLocalToUTC(11400100L, false, (-39599903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1570084924099L) + "'", long8 == (-1570084924099L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11400101L + "'", long14 == 11400101L);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-35999890L), locale4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.previousTransition((-39600099L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.032" + "'", str6, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-39600099L) + "'", long8 == (-39600099L));
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        long long7 = dateTimeZone1.convertUTCToLocal(0L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-1570084924201L), locale9);
        int int12 = dateTimeZone1.getStandardOffset(324000002L);
        java.lang.Object obj13 = dateTimeZone1.writeReplace();
        long long15 = dateTimeZone1.previousTransition((-1570084924053L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "113) test0877(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
// flaky "110) test0877(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
// flaky "98) test0877(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924053L) + "'", long15 == (-1570084924053L));
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
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        boolean boolean13 = dateTimeZone3.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone14 = dateTimeZone3.toTimeZone();
        int int16 = dateTimeZone3.getOffsetFromLocal((long) ' ');
        long long19 = dateTimeZone3.convertLocalToUTC((long) 187200000, true);
        long long21 = dateTimeZone3.nextTransition((-101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "114) test0878(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "111) test0878(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "99) test0878(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "78) test0878(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky "55) test0878(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
// flaky "42) test0878(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
// flaky "31) test0878(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 187199900L + "'", long19 == 187199900L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-101L) + "'", long21 == (-101L));
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(97L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((long) (-1), locale10);
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        long long8 = dateTimeZone1.previousTransition((-1570084924101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "115) test0880(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
// flaky "112) test0880(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
// flaky "100) test0880(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1570084924101L) + "'", long8 == (-1570084924101L));
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.010");
        int int3 = dateTimeZone1.getOffset(115799900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(100L, locale11);
        long long15 = dateTimeZone1.adjustOffset((-90L), false);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj18 = dateTimeZone17.writeReplace();
        boolean boolean19 = dateTimeZone1.equals((java.lang.Object) dateTimeZone17);
        java.lang.String str20 = dateTimeZone17.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "116) test0882(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
// flaky "113) test0882(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-90L) + "'", long15 == (-90L));
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        int int8 = dateTimeZone1.getOffsetFromLocal((long) 25200000);
        boolean boolean10 = dateTimeZone1.isStandardOffset(52L);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((long) (byte) 10, locale13);
        long long16 = dateTimeZone1.convertUTCToLocal((-200L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "117) test0883(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "114) test0883(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky "101) test0883(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
// flaky "79) test0883(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
// flaky "56) test0883(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-100L) + "'", long16 == (-100L));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        long long8 = dateTimeZone1.adjustOffset(25200000L, true);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName(3600098L, locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "118) test0884(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(timeZone5);
// flaky "115) test0884(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25200000L + "'", long8 == 25200000L);
// flaky "102) test0884(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(97L);
        int int10 = dateTimeZone1.getStandardOffset((-1570444923900L));
        int int12 = dateTimeZone1.getOffset(111L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (byte) 1);
        boolean boolean3 = dateTimeZone2.isFixed();
        java.util.TimeZone timeZone4 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+:0:01");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        boolean boolean11 = dateTimeZone1.isStandardOffset(25199899L);
        long long13 = dateTimeZone1.nextTransition((-44L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+100:01" + "'", str2, "+100:01");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+100:01" + "'", str9, "+100:01");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-44L) + "'", long13 == (-44L));
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        long long17 = dateTimeZone3.nextTransition((-68L));
        java.lang.String str18 = dateTimeZone3.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 360060000 + "'", int7 == 360060000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+:0:01");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+:0:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 360060000L + "'", long11 == 360060000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 360060000 + "'", int13 == 360060000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 360060000 + "'", int15 == 360060000);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-68L) + "'", long17 == (-68L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+100:01" + "'", str18, "+100:01");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        int int8 = dateTimeZone1.getOffsetFromLocal((long) 25200000);
        long long12 = dateTimeZone1.convertLocalToUTC(9L, true, (-67L));
        long long15 = dateTimeZone1.adjustOffset(101L, true);
        java.lang.Object obj16 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone1.isLocalDateTimeGap(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+100:01" + "'", str2, "+100:01");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 360060000 + "'", int8 == 360060000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360059991L) + "'", long12 == (-360059991L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115200000, 187260000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187260000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(25200000L, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((-1570078204101L), locale6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(187260000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        int int21 = dateTimeZone3.getOffsetFromLocal((-1570048324198L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "119) test0893(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "116) test0893(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "103) test0893(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
// flaky "80) test0893(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
// flaky "57) test0893(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
// flaky "43) test0893(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
// flaky "32) test0893(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.lang.Object obj2 = null;
        boolean boolean3 = dateTimeZone1.equals(obj2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-35999990L));
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        long long11 = dateTimeZone1.convertLocalToUTC(97L, false);
        long long13 = dateTimeZone1.convertUTCToLocal(115799800L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-71999989L) + "'", long7 == (-71999989L));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 96L + "'", long11 == 96L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 115799801L + "'", long13 == 115799801L);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(53L, true, 0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        java.lang.String str11 = dateTimeZone1.getNameKey((-3599900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "120) test0895(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "117) test0895(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 54L + "'", long8 == 54L);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "104) test0895(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal(25199999L);
        long long7 = dateTimeZone1.convertLocalToUTC(98L, true, (long) (-1));
        int int9 = dateTimeZone1.getOffset(3L);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "121) test0896(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky "118) test0896(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 99L + "'", long7 == 99L);
// flaky "105) test0896(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((-1569735724301L), locale3);
        java.lang.Object obj5 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long5 = dateTimeZone1.convertLocalToUTC((long) 25200000, false, (long) (-1));
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone7.nextTransition((long) (short) 100);
        int int11 = dateTimeZone7.getOffsetFromLocal(100L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone7.getName((-99L), locale13);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone7.isLocalDateTimeGap(localDateTime15);
        java.lang.Object obj17 = dateTimeZone7.writeReplace();
        java.lang.Object obj18 = dateTimeZone7.writeReplace();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        boolean boolean20 = dateTimeZone1.equals(obj18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25199948L + "'", long5 == 25199948L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
// flaky "122) test0898(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "119) test0898(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        long long24 = dateTimeZone7.adjustOffset(324000002L, true);
        long long26 = dateTimeZone7.convertUTCToLocal((-25199902L));
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 324000002L + "'", long24 == 324000002L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-25199901L) + "'", long26 == (-25199901L));
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        int int5 = dateTimeZone1.getOffset((long) (short) -1);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
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
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+10:01");
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true);
        long long8 = dateTimeZone1.convertLocalToUTC((-3599948L), true, (-360059790L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-36060001L) + "'", long4 == (-36060001L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-39659948L) + "'", long8 == (-39659948L));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
        long long22 = dateTimeZone3.adjustOffset((long) (-3600000), true);
        long long25 = dateTimeZone3.convertLocalToUTC((-1570194003899L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "123) test0902(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "120) test0902(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "106) test0902(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
// flaky "81) test0902(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
// flaky "58) test0902(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
// flaky "44) test0902(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3600000L) + "'", long22 == (-3600000L));
// flaky "33) test0902(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1570194003900L) + "'", long25 == (-1570194003900L));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long10 = dateTimeZone1.convertLocalToUTC((-25199902L), true, (-35999990L));
        boolean boolean12 = dateTimeZone1.isStandardOffset(8L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "124) test0903(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "121) test0903(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
// flaky "107) test0903(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-25199903L) + "'", long10 == (-25199903L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        long long21 = dateTimeZone1.adjustOffset((-98L), false);
        long long23 = dateTimeZone1.convertUTCToLocal((-35999903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "125) test0904(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "122) test0904(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924201L) + "'", long11 == (-1570084924201L));
// flaky "108) test0904(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky "82) test0904(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570048924002L) + "'", long16 == (-1570048924002L));
// flaky "59) test0904(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-98L) + "'", long21 == (-98L));
// flaky "45) test0904(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-35999902L) + "'", long23 == (-35999902L));
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        boolean boolean6 = dateTimeZone1.isStandardOffset((-1570084923899L));
        long long9 = dateTimeZone1.convertLocalToUTC(198L, false);
        java.lang.String str10 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-349199802L) + "'", long9 == (-349199802L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        int int3 = dateTimeZone1.getOffsetFromLocal((-39599802L));
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName(36599900L, locale5);
        long long10 = dateTimeZone1.convertLocalToUTC((-25200003L), true, 36000035L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 126000000 + "'", int3 == 126000000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+35:00" + "'", str6, "+35:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-151200003L) + "'", long10 == (-151200003L));
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
        long long11 = dateTimeZone1.convertLocalToUTC((-1570084924101L), true);
        boolean boolean13 = dateTimeZone1.isStandardOffset(0L);
        boolean boolean15 = dateTimeZone1.equals((java.lang.Object) 0.0f);
        java.lang.String str17 = dateTimeZone1.getName((long) (short) 0);
        int int19 = dateTimeZone1.getOffset((-56L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "126) test0907(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
// flaky "123) test0907(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924201L) + "'", long11 == (-1570084924201L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "109) test0907(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
// flaky "83) test0907(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        long long4 = dateTimeZone2.convertUTCToLocal((-115199899L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-111599899L) + "'", long4 == (-111599899L));
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        int int5 = dateTimeZone1.getOffset((long) (short) -1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) 36000000);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((long) 25200000, locale9);
        boolean boolean11 = dateTimeZone1.isFixed();
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        long long16 = dateTimeZone1.convertLocalToUTC((-6720045L), false, 96L);
        java.lang.String str18 = dateTimeZone1.getName((-1570444923900L));
        int int20 = dateTimeZone1.getOffsetFromLocal(47L);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone1.isLocalDateTimeGap(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-6720044L) + "'", long16 == (-6720044L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        int int16 = dateTimeZone3.getOffsetFromLocal((-36000045L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone3.isLocalDateTimeGap(localDateTime18);
        java.lang.Class<?> wildcardClass20 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "127) test0910(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "124) test0910(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "110) test0910(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "84) test0910(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "60) test0910(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((-68L), true);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-99L), locale5);
        int int8 = dateTimeZone0.getStandardOffset((-6720020L));
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str11 = dateTimeZone10.getID();
        long long13 = dateTimeZone10.previousTransition((-1L));
        long long17 = dateTimeZone10.convertLocalToUTC(25200000L, true, 100L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone10.getName((-35999979L), locale19);
        java.lang.String str21 = dateTimeZone10.toString();
        long long23 = dateTimeZone0.getMillisKeepLocal(dateTimeZone10, 187199801L);
        long long25 = dateTimeZone10.convertUTCToLocal((-1570084924102L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-68L) + "'", long3 == (-68L));
// flaky "128) test0911(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
// flaky "125) test0911(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "111) test0911(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
// flaky "85) test0911(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 25199900L + "'", long17 == 25199900L);
// flaky "61) test0911(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
// flaky "46) test0911(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 187199801L + "'", long23 == 187199801L);
// flaky "34) test0911(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1570084924002L) + "'", long25 == (-1570084924002L));
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str5 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.convertLocalToUTC((-2L), false);
        long long10 = dateTimeZone1.nextTransition((long) 35);
        java.lang.String str11 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3L) + "'", long8 == (-3L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
        java.lang.String str24 = dateTimeZone1.getNameKey((-10800099L));
        boolean boolean25 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "129) test0913(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "126) test0913(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
// flaky "112) test0913(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924001L) + "'", long15 == (-1570084924001L));
// flaky "86) test0913(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
// flaky "62) test0913(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
// flaky "47) test0913(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
// flaky "35) test0913(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 187260000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187260000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone3.isLocalDateTimeGap(localDateTime21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone3.getOffset(readableInstant23);
        long long26 = dateTimeZone3.previousTransition(76200054L);
        java.lang.String str28 = dateTimeZone3.getShortName(36599901L);
        java.lang.Class<?> wildcardClass29 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "130) test0915(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "127) test0915(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "113) test0915(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "87) test0915(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
// flaky "63) test0915(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
// flaky "48) test0915(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky "36) test0915(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25199899L + "'", long20 == 25199899L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "23) test0915(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 76200054L + "'", long26 == 76200054L);
// flaky "15) test0915(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        long long18 = dateTimeZone1.nextTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "131) test0916(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
// flaky "128) test0916(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924201L) + "'", long11 == (-1570084924201L));
// flaky "114) test0916(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
// flaky "88) test0916(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570048924101L) + "'", long16 == (-1570048924101L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(349200000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(32, 360600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        java.lang.String str20 = dateTimeZone11.getName((long) 36000000);
        java.lang.String str22 = dateTimeZone11.getNameKey((long) 187200000);
        int int24 = dateTimeZone11.getStandardOffset((-1570444924102L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "132) test0919(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "129) test0919(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
// flaky "115) test0919(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky "89) test0919(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 102L + "'", long16 == 102L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25199948L + "'", long18 == 25199948L);
// flaky "64) test0919(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertNull(str22);
// flaky "49) test0919(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        long long8 = dateTimeZone2.convertLocalToUTC(115800000L, true, 99L);
        java.lang.String str10 = dateTimeZone2.getName(102L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getShortName((-25200001L), locale12);
        long long15 = dateTimeZone2.previousTransition((-10800100L));
        long long17 = dateTimeZone2.convertUTCToLocal((-35999900L));
        long long19 = dateTimeZone2.nextTransition((-1570045324000L));
        long long21 = dateTimeZone2.previousTransition((-25200001L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:10" + "'", str10, "+32:10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:10" + "'", str13, "+32:10");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-10800100L) + "'", long15 == (-10800100L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 79800100L + "'", long17 == 79800100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1570045324000L) + "'", long19 == (-1570045324000L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-25200001L) + "'", long21 == (-25200001L));
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        int int12 = dateTimeZone3.getOffsetFromLocal(0L);
        int int14 = dateTimeZone3.getOffsetFromLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long19 = dateTimeZone16.adjustOffset((long) 100, false);
        long long21 = dateTimeZone3.getMillisKeepLocal(dateTimeZone16, (long) 'a');
        boolean boolean23 = dateTimeZone16.isStandardOffset((-1570042204201L));
        int int25 = dateTimeZone16.getOffsetFromLocal((-61199801L));
        boolean boolean27 = dateTimeZone16.equals((java.lang.Object) (-25200102L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "133) test0921(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "130) test0921(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "116) test0921(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky "90) test0921(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
// flaky "65) test0921(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
// flaky "50) test0921(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 108L + "'", long21 == 108L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360600000, 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 25200000, true, (long) (short) 10);
        int int8 = dateTimeZone1.getStandardOffset(115799900L);
        java.lang.String str10 = dateTimeZone1.getShortName(110L);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        boolean boolean13 = dateTimeZone1.isStandardOffset((-1570194003900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25199999L + "'", long6 == 25199999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "134) test0925(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "131) test0925(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
// flaky "117) test0925(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName(79800000L, locale14);
        java.lang.Object obj16 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "135) test0926(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky "132) test0926(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "118) test0926(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky "91) test0926(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) false);
        long long12 = dateTimeZone1.nextTransition(187199900L);
        java.lang.String str13 = dateTimeZone1.toString();
        long long15 = dateTimeZone1.convertUTCToLocal((-1570052523900L));
        java.lang.Class<?> wildcardClass16 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "136) test0927(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 187199900L + "'", long12 == 187199900L);
// flaky "133) test0927(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
// flaky "119) test0927(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570052523901L) + "'", long15 == (-1570052523901L));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.lang.Object obj2 = null;
        boolean boolean3 = dateTimeZone1.equals(obj2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        int int14 = dateTimeZone10.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone15 = dateTimeZone10.toTimeZone();
        int int17 = dateTimeZone10.getOffset((long) (short) 1);
        long long21 = dateTimeZone10.convertLocalToUTC((long) 115800000, true, (-1570084924000L));
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) (-1570084924000L));
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone1.isLocalDateTimeGap(localDateTime23);
        boolean boolean25 = dateTimeZone1.isFixed();
        long long28 = dateTimeZone1.adjustOffset((-3599902L), true);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone1.getShortName(36059990L, locale30);
        long long33 = dateTimeZone1.previousTransition(244800000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 115799999L + "'", long21 == 115799999L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-3599902L) + "'", long28 == (-3599902L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.001" + "'", str31, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 244800000L + "'", long33 == 244800000L);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        java.lang.String str5 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int3 = dateTimeZone1.getOffset(111L);
        long long6 = dateTimeZone1.adjustOffset((long) 349800000, true);
        int int8 = dateTimeZone1.getOffsetFromLocal(135L);
        java.lang.String str10 = dateTimeZone1.getNameKey(3L);
        java.lang.String str11 = dateTimeZone1.getID();
        boolean boolean13 = dateTimeZone1.isStandardOffset((long) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 349800000L + "'", long6 == 349800000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        int int4 = dateTimeZone0.getOffset((-115799965L));
        long long6 = dateTimeZone0.nextTransition((-61199801L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-61199801L) + "'", long6 == (-61199801L));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        int int4 = dateTimeZone0.getOffset(98L);
        java.lang.String str6 = dateTimeZone0.getName((long) 1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getName(395999900L, locale8);
        int int11 = dateTimeZone0.getOffsetFromLocal(101L);
        long long15 = dateTimeZone0.convertLocalToUTC((-36000045L), true, (-1570081324100L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-36000045L) + "'", long15 == (-36000045L));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal(25199999L);
        int int5 = dateTimeZone1.getOffsetFromLocal((long) '4');
        java.lang.String str6 = dateTimeZone1.toString();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) 0, locale6);
        boolean boolean9 = dateTimeZone4.equals((java.lang.Object) 2L);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 1L);
        java.lang.String str12 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        boolean boolean11 = dateTimeZone1.isFixed();
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        int int4 = dateTimeZone0.getOffset(98L);
        java.lang.String str6 = dateTimeZone0.getName((long) 115800000);
        boolean boolean7 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        int int23 = dateTimeZone1.getOffset((-36000001L));
        java.util.TimeZone timeZone24 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long8 = dateTimeZone4.convertLocalToUTC((long) 25200000, false, (long) (-1));
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, (long) 'a');
        int int16 = dateTimeZone12.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone17 = dateTimeZone12.toTimeZone();
        java.util.TimeZone timeZone18 = dateTimeZone12.toTimeZone();
        java.lang.String str20 = dateTimeZone12.getName(102L);
        long long22 = dateTimeZone4.getMillisKeepLocal(dateTimeZone12, 3L);
        boolean boolean23 = dateTimeZone1.equals((java.lang.Object) long22);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long28 = dateTimeZone1.convertLocalToUTC((long) 126000000, true, (-1570012324101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25199948L + "'", long8 == 25199948L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
// flaky "137) test0940(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36000000 + "'", int16 == 36000000);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky "134) test0940(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "120) test0940(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+10:00");
// flaky "92) test0940(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+10:00" + "'", str20, "+10:00");
// flaky "66) test0940(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-35999945L) + "'", long22 == (-35999945L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 122400000L + "'", long28 == 122400000L);
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
        long long25 = dateTimeZone3.convertLocalToUTC((-39599903L), true);
        boolean boolean27 = dateTimeZone3.isStandardOffset(18480101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:00" + "'", str11, "+01:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:00" + "'", str14, "+01:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+01:00" + "'", str15, "+01:00");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+01:00" + "'", str19, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-43199903L) + "'", long25 == (-43199903L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "138) test0942(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "135) test0942(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int24 = dateTimeZone22.getOffset(111L);
        int int26 = dateTimeZone22.getOffset((long) (short) 0);
        boolean boolean27 = dateTimeZone1.equals((java.lang.Object) int26);
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = dateTimeZone1.isLocalDateTimeGap(localDateTime28);
        java.lang.Class<?> wildcardClass30 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "139) test0943(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "136) test0943(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
// flaky "121) test0943(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924001L) + "'", long15 == (-1570084924001L));
// flaky "93) test0943(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
// flaky "67) test0943(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
// flaky "51) test0943(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.lang.String str3 = dateTimeZone1.getShortName((-25200001L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 52L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-3599803L), locale9);
        long long12 = dateTimeZone1.nextTransition(359999900L);
        int int14 = dateTimeZone1.getOffsetFromLocal(115799999L);
        boolean boolean16 = dateTimeZone1.isStandardOffset((-25199801L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.010" + "'", str3, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-11L) + "'", long7 == (-11L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 359999900L + "'", long12 == 359999900L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        boolean boolean2 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 1, true, (-36000001L));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-1570078204201L), locale8);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        int int3 = dateTimeZone1.getOffset(0L);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone5.getMillisKeepLocal(dateTimeZone7, (long) 'a');
        int int11 = dateTimeZone7.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone12 = dateTimeZone7.toTimeZone();
        java.util.TimeZone timeZone13 = dateTimeZone7.toTimeZone();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone7.getName((long) (short) 10, locale15);
        java.lang.String str18 = dateTimeZone7.getName(0L);
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (short) 1);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        long long24 = dateTimeZone22.nextTransition((long) (short) 100);
        int int26 = dateTimeZone22.getOffsetFromLocal(100L);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone22.getName((-99L), locale28);
        int int31 = dateTimeZone22.getStandardOffset(98L);
        boolean boolean32 = dateTimeZone1.equals((java.lang.Object) int31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone1.getOffset(readableInstant33);
        long long36 = dateTimeZone1.convertUTCToLocal(36599968L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
// flaky "140) test0946(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky "137) test0946(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone13);
// flaky "122) test0946(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
// flaky "94) test0946(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
// flaky "68) test0946(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
// flaky "52) test0946(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-98L) + "'", long20 == (-98L));
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
// flaky "37) test0946(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
// flaky "24) test0946(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.100" + "'", str29, "+00:00:00.100");
// flaky "16) test0946(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 36599969L + "'", long36 == 36599969L);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        boolean boolean7 = dateTimeZone1.isFixed();
        java.lang.String str8 = dateTimeZone1.getID();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((-1570084924199L), locale10);
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.lang.String str24 = dateTimeZone23.getID();
        long long26 = dateTimeZone23.previousTransition((-1L));
        long long30 = dateTimeZone23.convertLocalToUTC(25200000L, true, 100L);
        long long32 = dateTimeZone21.getMillisKeepLocal(dateTimeZone23, 100L);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone21.getShortName((long) (short) 10, locale34);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long40 = dateTimeZone37.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone37);
        boolean boolean42 = dateTimeZone37.isFixed();
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        java.lang.String str45 = dateTimeZone44.getID();
        long long47 = dateTimeZone44.previousTransition((-1L));
        boolean boolean49 = dateTimeZone44.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale51 = null;
        java.lang.String str52 = dateTimeZone44.getName((long) (short) 0, locale51);
        long long54 = dateTimeZone44.nextTransition((long) ' ');
        int int56 = dateTimeZone44.getStandardOffset(115799900L);
        long long58 = dateTimeZone37.getMillisKeepLocal(dateTimeZone44, 110L);
        long long60 = dateTimeZone21.getMillisKeepLocal(dateTimeZone44, (long) ' ');
        long long62 = dateTimeZone21.convertUTCToLocal((long) 1);
        long long64 = dateTimeZone21.previousTransition((-1570084924199L));
        long long67 = dateTimeZone21.adjustOffset(211L, true);
        long long69 = dateTimeZone1.getMillisKeepLocal(dateTimeZone21, (-1569969124101L));
        java.util.TimeZone timeZone70 = dateTimeZone1.toTimeZone();
        long long72 = dateTimeZone1.previousTransition((-1569782464101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "141) test0948(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "138) test0948(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
// flaky "123) test0948(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924001L) + "'", long15 == (-1570084924001L));
// flaky "95) test0948(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
// flaky "69) test0948(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
// flaky "53) test0948(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
// flaky "38) test0948(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 25199900L + "'", long30 == 25199900L);
// flaky "25) test0948(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.001" + "'", str35, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-99L) + "'", long40 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00:00.100" + "'", str45, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:00:00.100" + "'", str52, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 32L + "'", long54 == 32L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 110L + "'", long58 == 110L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-67L) + "'", long60 == (-67L));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 2L + "'", long62 == 2L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-1570084924199L) + "'", long64 == (-1570084924199L));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 211L + "'", long67 == 211L);
// flaky "17) test0948(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1569969124002L) + "'", long69 == (-1569969124002L));
        org.junit.Assert.assertNotNull(timeZone70);
// flaky "10) test0948(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1569782464101L) + "'", long72 == (-1569782464101L));
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        java.lang.String str10 = dateTimeZone1.getName((long) '#');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-35999948L), locale12);
        long long15 = dateTimeZone1.nextTransition(52L);
        long long17 = dateTimeZone1.nextTransition(0L);
        long long19 = dateTimeZone1.convertUTCToLocal((-10800000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-10799900L) + "'", long19 == (-10799900L));
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        int int12 = dateTimeZone3.getOffset(349800000L);
        int int14 = dateTimeZone3.getStandardOffset((-360059790L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        long long14 = dateTimeZone1.nextTransition((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        long long18 = dateTimeZone1.previousTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        long long19 = dateTimeZone3.adjustOffset((-360600000L), false);
        java.lang.String str21 = dateTimeZone3.getName((-90L));
        int int23 = dateTimeZone3.getStandardOffset((-25200101L));
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-360600000L) + "'", long19 == (-360600000L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) 6720000, locale5);
        java.lang.String str7 = dateTimeZone1.getID();
        long long10 = dateTimeZone1.adjustOffset((-1570052523901L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570052523901L) + "'", long10 == (-1570052523901L));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(187260000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (byte) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(395999900L, locale4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+100:01" + "'", str5, "+100:01");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360060000, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        int int12 = dateTimeZone1.getOffset((long) '#');
        int int14 = dateTimeZone1.getOffsetFromLocal(115799999L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj17 = dateTimeZone16.writeReplace();
        java.lang.Object obj18 = dateTimeZone16.writeReplace();
        int int20 = dateTimeZone16.getOffset((long) (short) -1);
        boolean boolean21 = dateTimeZone16.isFixed();
        java.lang.String str22 = dateTimeZone16.getID();
        long long25 = dateTimeZone16.convertLocalToUTC(25200000L, true);
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, (-25200103L));
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = dateTimeZone1.getOffset(readableInstant28);
        long long31 = dateTimeZone1.convertUTCToLocal((-39599802L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 25200001L + "'", long25 == 25200001L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-25200002L) + "'", long27 == (-25200002L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-39599702L) + "'", long31 == (-39599702L));
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 0, locale3);
        int int6 = dateTimeZone1.getOffsetFromLocal((-71999989L));
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        long long6 = dateTimeZone2.previousTransition((long) (-1));
        boolean boolean7 = dateTimeZone2.isFixed();
        int int9 = dateTimeZone2.getOffset(0L);
        java.lang.Object obj10 = dateTimeZone2.writeReplace();
        long long12 = dateTimeZone2.convertUTCToLocal(36059900L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115800000 + "'", int9 == 115800000);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 151859900L + "'", long12 == 151859900L);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        int int12 = dateTimeZone1.getOffset((long) '#');
        int int14 = dateTimeZone1.getOffsetFromLocal(115799999L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj17 = dateTimeZone16.writeReplace();
        java.lang.Object obj18 = dateTimeZone16.writeReplace();
        int int20 = dateTimeZone16.getOffset((long) (short) -1);
        boolean boolean21 = dateTimeZone16.isFixed();
        java.lang.String str22 = dateTimeZone16.getID();
        long long25 = dateTimeZone16.convertLocalToUTC(25200000L, true);
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, (-25200103L));
        long long29 = dateTimeZone16.previousTransition((long) (short) 1);
        long long31 = dateTimeZone16.nextTransition((-360600101L));
        java.lang.String str33 = dateTimeZone16.getNameKey((-54L));
        long long36 = dateTimeZone16.convertLocalToUTC((long) 187200000, false);
        boolean boolean38 = dateTimeZone16.isStandardOffset((-1570052523901L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 25200001L + "'", long25 == 25200001L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-25200002L) + "'", long27 == (-25200002L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-360600101L) + "'", long31 == (-360600101L));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 187200001L + "'", long36 == 187200001L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset(0L);
        long long7 = dateTimeZone1.adjustOffset((-1570084924100L), false);
        long long11 = dateTimeZone1.convertLocalToUTC(115800000L, false, (-1570084924202L));
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570084924100L) + "'", long7 == (-1570084924100L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115799999L + "'", long11 == 115799999L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long5 = dateTimeZone1.convertLocalToUTC(25199999L, false, 0L);
        java.lang.String str7 = dateTimeZone1.getNameKey((-3L));
        long long9 = dateTimeZone1.previousTransition((-115799900L));
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((-1569724924100L), locale11);
        java.lang.String str14 = dateTimeZone1.getShortName((-115799998L));
        java.lang.String str15 = dateTimeZone1.toString();
        java.lang.Object obj16 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25199999L + "'", long5 == 25199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115799900L) + "'", long9 == (-115799900L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 6720000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        java.lang.String str5 = dateTimeZone2.getID();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getShortName((-91L), locale7);
        java.lang.Class<?> wildcardClass9 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:10" + "'", str5, "+32:10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:10" + "'", str8, "+32:10");
        org.junit.Assert.assertNotNull(wildcardClass9);
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
        java.lang.String str35 = dateTimeZone3.getNameKey((-32400101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "142) test0965(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "139) test0965(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "124) test0965(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
// flaky "96) test0965(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
// flaky "70) test0965(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
// flaky "54) test0965(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(timeZone17);
// flaky "39) test0965(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "26) test0965(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
// flaky "18) test0965(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
// flaky "11) test0965(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
// flaky "5) test0965(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
// flaky "3) test0965(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
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
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-1570084924202L), locale12);
        int int15 = dateTimeZone1.getStandardOffset(35L);
        long long18 = dateTimeZone1.adjustOffset((long) '#', true);
        java.lang.String str20 = dateTimeZone1.getShortName((-35999948L));
        long long24 = dateTimeZone1.convertLocalToUTC(25200001L, false, 115799798L);
        java.util.TimeZone timeZone25 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone26 = null; // flaky "143) test0966(org.joda.time.RegressionTest1)": org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = null; // flaky "140) test0966(org.joda.time.RegressionTest1)": org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.lang.Object obj28 = null; // flaky "125) test0966(org.joda.time.RegressionTest1)": dateTimeZone27.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "97) test0966(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "71) test0966(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "55) test0966(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
// flaky "40) test0966(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
// flaky "27) test0966(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
// flaky "19) test0966(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 25200001L + "'", long24 == 25200001L);
        org.junit.Assert.assertNotNull(timeZone25);
// flaky "12) test0966(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "6) test0966(org.joda.time.RegressionTest1)":         org.junit.Assert.assertNotNull(dateTimeZone26);
// flaky "4) test0966(org.joda.time.RegressionTest1)":         org.junit.Assert.assertNotNull(dateTimeZone27);
// flaky "2) test0966(org.joda.time.RegressionTest1)":         org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        java.lang.String str7 = dateTimeZone1.getName(97L);
        int int9 = dateTimeZone1.getOffsetFromLocal((long) 1);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        int int13 = dateTimeZone1.getOffsetFromLocal((-1570120924101L));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long18 = dateTimeZone15.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str19 = dateTimeZone15.toString();
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone15.getOffset(readableInstant20);
        java.util.TimeZone timeZone22 = dateTimeZone15.toTimeZone();
        java.lang.Object obj23 = dateTimeZone15.writeReplace();
        long long25 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, (-46800100L));
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone1.getOffset(readableInstant26);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570084924000L) + "'", long18 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-46800098L) + "'", long25 == (-46800098L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(349200000, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(349200000, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        java.lang.String str35 = dateTimeZone1.toString();
        java.util.TimeZone timeZone36 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone37 = null; // flaky "144) test0970(org.joda.time.RegressionTest1)": org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = null; // flaky "141) test0970(org.joda.time.RegressionTest1)": org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.DateTimeZone dateTimeZone39 = null; // flaky "126) test0970(org.joda.time.RegressionTest1)": org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "98) test0970(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "72) test0970(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25200000L + "'", long8 == 25200000L);
// flaky "56) test0970(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
// flaky "41) test0970(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(timeZone21);
// flaky "28) test0970(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "20) test0970(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
// flaky "13) test0970(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
// flaky "7) test0970(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 21600000L + "'", long34 == 21600000L);
// flaky "5) test0970(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertNotNull(timeZone36);
// flaky "3) test0970(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "1) test0970(org.joda.time.RegressionTest1)":         org.junit.Assert.assertNotNull(dateTimeZone37);
// flaky "1) test0970(org.joda.time.RegressionTest1)":         org.junit.Assert.assertNotNull(dateTimeZone38);
// flaky "1) test0970(org.joda.time.RegressionTest1)":         org.junit.Assert.assertNotNull(dateTimeZone39);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.getID();
        long long3 = dateTimeZone0.previousTransition(32L);
        java.lang.String str5 = dateTimeZone0.getShortName((-35999990L));
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName(3599901L, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "145) test0971(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
// flaky "142) test0971(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
// flaky "127) test0971(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        int int12 = dateTimeZone3.getOffsetFromLocal(0L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone3.getShortName(0L, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "146) test0973(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "143) test0973(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "128) test0973(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "99) test0973(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "73) test0973(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        java.lang.String str26 = dateTimeZone1.getName((-1570120923900L), locale25);
        int int28 = dateTimeZone1.getOffset((-25199902L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "147) test0974(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "144) test0974(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "129) test0974(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky "100) test0974(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "74) test0974(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
// flaky "57) test0974(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
// flaky "42) test0974(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        java.lang.Object obj18 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "148) test0975(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "145) test0975(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
// flaky "130) test0975(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 110L + "'", long15 == 110L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long5 = dateTimeZone1.convertLocalToUTC(25199999L, false, 0L);
        java.lang.String str7 = dateTimeZone1.getNameKey((-3L));
        long long9 = dateTimeZone1.convertUTCToLocal((-1570200723999L));
        long long11 = dateTimeZone1.nextTransition(2L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25199999L + "'", long5 == 25199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1570200723999L) + "'", long9 == (-1570200723999L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getShortName((-1570084924000L));
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        long long16 = dateTimeZone1.adjustOffset(112L, true);
        java.lang.String str18 = dateTimeZone1.getName((-115199951L));
        int int20 = dateTimeZone1.getOffsetFromLocal((-140399998L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 112L + "'", long16 == 112L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long20 = dateTimeZone18.nextTransition((long) 36000000);
        java.lang.Object obj21 = dateTimeZone18.writeReplace();
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) dateTimeZone18);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone18.getName((-45L), locale24);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        long long31 = dateTimeZone27.getMillisKeepLocal(dateTimeZone29, (long) 'a');
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone27.getName((long) (short) 1, locale33);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        long long41 = dateTimeZone37.getMillisKeepLocal(dateTimeZone39, (long) 'a');
        int int43 = dateTimeZone39.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone44 = dateTimeZone39.toTimeZone();
        java.util.TimeZone timeZone45 = dateTimeZone39.toTimeZone();
        long long47 = dateTimeZone39.convertUTCToLocal(0L);
        long long49 = dateTimeZone27.getMillisKeepLocal(dateTimeZone39, (long) (short) -1);
        java.lang.String str50 = dateTimeZone39.toString();
        boolean boolean51 = dateTimeZone18.equals((java.lang.Object) dateTimeZone39);
        boolean boolean52 = dateTimeZone39.isFixed();
        long long54 = dateTimeZone39.convertUTCToLocal((-1570160524000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 36000000L + "'", long20 == 36000000L);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.035" + "'", str25, "+00:00:00.035");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 97L + "'", long31 == 97L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-00:00:00.001" + "'", str34, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 97L + "'", long41 == 97L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "-00:00:00.001" + "'", str50, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1570160524001L) + "'", long54 == (-1570160524001L));
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        boolean boolean23 = dateTimeZone1.isFixed();
        java.lang.String str24 = dateTimeZone1.getID();
        java.lang.String str26 = dateTimeZone1.getShortName((long) (byte) 100);
        java.lang.String str28 = dateTimeZone1.getShortName((-25199801L));
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone1.getName((-1570088524000L), locale30);
        java.lang.Class<?> wildcardClass32 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924102L) + "'", long15 == (-1570084924102L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1570048924001L) + "'", long21 == (-1570048924001L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-00:00:00.001" + "'", str26, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-00:00:00.001" + "'", str31, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((-35999948L), locale3);
        long long6 = dateTimeZone1.previousTransition(97L);
        java.lang.String str8 = dateTimeZone1.getName((long) (byte) -1);
        java.lang.String str10 = dateTimeZone1.getShortName((-36000299L));
        long long13 = dateTimeZone1.adjustOffset((long) (-3600000), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3600000L) + "'", long13 == (-3600000L));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
        java.lang.String str16 = dateTimeZone1.getNameKey((-35999948L));
        int int18 = dateTimeZone1.getOffset((-10800099L));
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        long long24 = dateTimeZone20.getMillisKeepLocal(dateTimeZone22, (long) 'a');
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone20.getName((long) (short) 1, locale26);
        long long30 = dateTimeZone20.convertLocalToUTC((-1570084924101L), true);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone20.getShortName((long) 115800000, locale32);
        java.lang.String str35 = dateTimeZone20.getNameKey((-35999948L));
        long long37 = dateTimeZone1.getMillisKeepLocal(dateTimeZone20, (-268L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924100L) + "'", long11 == (-1570084924100L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1570084924100L) + "'", long30 == (-1570084924100L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-00:00:00.001" + "'", str33, "-00:00:00.001");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-268L) + "'", long37 == (-268L));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        long long14 = dateTimeZone1.nextTransition((long) (short) 0);
        long long18 = dateTimeZone1.convertLocalToUTC((-1570012324001L), false, 395999900L);
        java.lang.String str19 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570012324000L) + "'", long18 == (-1570012324000L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        long long5 = dateTimeZone1.convertLocalToUTC((-1570084924102L), false);
        int int7 = dateTimeZone1.getOffset(115800000L);
        java.lang.String str9 = dateTimeZone1.getShortName(25200000L);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long15 = dateTimeZone12.convertLocalToUTC((-1570084924001L), false);
        int int17 = dateTimeZone12.getOffsetFromLocal((-1570084924000L));
        int int19 = dateTimeZone12.getOffset(97L);
        java.lang.Object obj20 = dateTimeZone12.writeReplace();
        long long22 = dateTimeZone12.nextTransition(32L);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, (-25200002L));
        java.util.TimeZone timeZone25 = dateTimeZone12.toTimeZone();
        boolean boolean27 = dateTimeZone12.isStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570084924101L) + "'", long5 == (-1570084924101L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924000L) + "'", long15 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-25200002L) + "'", long24 == (-25200002L));
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone3.getName((-39599899L), locale16);
        long long19 = dateTimeZone3.convertUTCToLocal((-115799966L));
        long long22 = dateTimeZone3.convertLocalToUTC(323999901L, true);
        long long25 = dateTimeZone3.adjustOffset((-42719999L), false);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-115799967L) + "'", long19 == (-115799967L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 323999902L + "'", long22 == 323999902L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-42719999L) + "'", long25 == (-42719999L));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(349200000, 36060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36060000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) '4', locale8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long12 = dateTimeZone1.nextTransition((-35999990L));
        int int14 = dateTimeZone1.getOffsetFromLocal((-6719866L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-35999990L) + "'", long12 == (-35999990L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        int int3 = dateTimeZone1.getOffset(0L);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone5.getMillisKeepLocal(dateTimeZone7, (long) 'a');
        int int11 = dateTimeZone7.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone12 = dateTimeZone7.toTimeZone();
        java.util.TimeZone timeZone13 = dateTimeZone7.toTimeZone();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone7.getName((long) (short) 10, locale15);
        java.lang.String str18 = dateTimeZone7.getName(0L);
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (short) 1);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone7.isLocalDateTimeGap(localDateTime21);
        long long25 = dateTimeZone7.adjustOffset(39599999L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 39599999L + "'", long25 == 39599999L);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115800000);
        boolean boolean3 = dateTimeZone1.isStandardOffset((-200L));
        long long5 = dateTimeZone1.nextTransition(187199801L);
        boolean boolean7 = dateTimeZone1.isStandardOffset(21600002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 187199801L + "'", long5 == 187199801L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36060000, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int3 = dateTimeZone1.getOffset(111L);
        java.lang.String str5 = dateTimeZone1.getShortName((-7199802L));
        java.lang.String str7 = dateTimeZone1.getShortName(211L);
        long long10 = dateTimeZone1.convertLocalToUTC((-6719790L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-6719790L) + "'", long10 == (-6719790L));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj6 = dateTimeZone5.writeReplace();
        java.lang.Object obj7 = dateTimeZone5.writeReplace();
        int int9 = dateTimeZone5.getOffsetFromLocal((long) (short) 10);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) int9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName(0L, locale12);
        java.lang.Object obj14 = dateTimeZone1.writeReplace();
        boolean boolean16 = dateTimeZone1.isStandardOffset((-1569933124000L));
        int int18 = dateTimeZone1.getStandardOffset(9L);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone1.getShortName(0L, locale20);
        long long23 = dateTimeZone1.convertUTCToLocal(36000010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "149) test0991(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:00" + "'", str13, "+100:00");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky "146) test0991(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 360000000 + "'", int18 == 360000000);
// flaky "131) test0991(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+100:00" + "'", str21, "+100:00");
// flaky "101) test0991(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 396000010L + "'", long23 == 396000010L);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        int int25 = dateTimeZone7.getStandardOffset((-35999801L));
        java.lang.String str27 = dateTimeZone7.getNameKey((-115200001L));
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj11 = dateTimeZone10.writeReplace();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone10.getOffset(readableInstant12);
        int int15 = dateTimeZone10.getOffsetFromLocal(0L);
        long long18 = dateTimeZone10.adjustOffset(0L, false);
        boolean boolean19 = dateTimeZone1.equals((java.lang.Object) long18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(187200000);
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
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        java.lang.String str21 = dateTimeZone1.getNameKey((-1570120924102L));
        long long23 = dateTimeZone1.previousTransition(36000098L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "150) test0995(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+100:00" + "'", str8, "+100:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "147) test0995(org.joda.time.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:00" + "'", str13, "+100:00");
// flaky "132) test0995(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1569724924101L) + "'", long15 == (-1569724924101L));
// flaky "102) test0995(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 360000000 + "'", int17 == 360000000);
// flaky "75) test0995(org.joda.time.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 360000000 + "'", int19 == 360000000);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 36000098L + "'", long23 == 36000098L);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        java.lang.String str24 = dateTimeZone8.getShortName((-150660032L));
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal(25199999L);
        long long7 = dateTimeZone1.convertLocalToUTC(98L, true, (long) (-1));
        java.lang.String str8 = dateTimeZone1.getID();
        java.lang.String str10 = dateTimeZone1.getName((-39599902L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-2L) + "'", long7 == (-2L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        int int6 = dateTimeZone1.getOffset((long) 115800000);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName(3600032L, locale9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        long long36 = dateTimeZone28.previousTransition(36600000L);
        long long39 = dateTimeZone28.adjustOffset((-115800100L), true);
        java.lang.String str41 = dateTimeZone28.getNameKey((-39599937L));
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-3599803L) + "'", long32 == (-3599803L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1570084924000L) + "'", long34 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 36600000L + "'", long36 == 36600000L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-115800100L) + "'", long39 == (-115800100L));
        org.junit.Assert.assertNull(str41);
    }
}
