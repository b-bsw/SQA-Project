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
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((-1570084924000L), locale6);
        java.lang.String str9 = dateTimeZone1.getShortName((-35999899L));
        java.lang.String str10 = dateTimeZone1.toString();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName((-61199947L), locale12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
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
        long long28 = dateTimeZone3.convertLocalToUTC((long) 187200000, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(obj16);
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36000000 + "'", int18 == 36000000);
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+10:00" + "'", str21, "+10:00");
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 36000000 + "'", int23 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 151200000L + "'", long28 == 151200000L);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.previousTransition(25200000L);
        int int7 = dateTimeZone1.getOffset(25200051L);
        boolean boolean8 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25200000L + "'", long5 == 25200000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.lang.Object obj5 = dateTimeZone2.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getName((long) 'a');
        java.lang.String str10 = dateTimeZone2.getNameKey((-306540000L));
        long long12 = dateTimeZone2.convertUTCToLocal((-61140001L));
        java.lang.String str14 = dateTimeZone2.getName(13L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-25140001L) + "'", long12 == (-25140001L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
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
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 100L);
        boolean boolean15 = dateTimeZone1.isFixed();
        java.lang.String str16 = dateTimeZone1.toString();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        long long22 = dateTimeZone18.getMillisKeepLocal(dateTimeZone20, (long) 'a');
        boolean boolean23 = dateTimeZone18.isFixed();
        int int25 = dateTimeZone18.getStandardOffset((-1L));
        int int27 = dateTimeZone18.getOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        long long31 = dateTimeZone18.getMillisKeepLocal(dateTimeZone29, 100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        java.lang.String str34 = dateTimeZone29.getNameKey(231059997L);
        long long36 = dateTimeZone1.getMillisKeepLocal(dateTimeZone29, 3660035L);
        java.lang.String str37 = dateTimeZone29.getID();
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = dateTimeZone29.getOffset(readableInstant38);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36000000 + "'", int8 == 36000000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 36000000 + "'", int25 == 36000000);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36000000 + "'", int27 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 3660035L + "'", long36 == 3660035L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+10:00" + "'", str37, "+10:00");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 36000000 + "'", int39 == 36000000);
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        java.lang.String str15 = dateTimeZone3.getID();
        java.lang.String str16 = dateTimeZone3.toString();
        java.lang.String str18 = dateTimeZone3.getShortName((-1570120924201L));
        java.lang.String str20 = dateTimeZone3.getShortName((-61259968L));
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:00" + "'", str18, "+10:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+10:00" + "'", str20, "+10:00");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = dateTimeZone1.isFixed();
        java.lang.String str9 = dateTimeZone1.getName(115800002L);
        java.lang.String str11 = dateTimeZone1.getNameKey((-1570156924001L));
        boolean boolean13 = dateTimeZone1.isStandardOffset(89519901L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
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
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj46 = dateTimeZone45.writeReplace();
        java.lang.String str47 = dateTimeZone45.getID();
        long long50 = dateTimeZone45.convertLocalToUTC((long) 'a', true);
        java.lang.String str52 = dateTimeZone45.getNameKey((-1570084924201L));
        long long54 = dateTimeZone45.previousTransition((long) (byte) -1);
        long long56 = dateTimeZone40.getMillisKeepLocal(dateTimeZone45, (-1569969664000L));
        long long60 = dateTimeZone40.convertLocalToUTC(112139946L, false, 119400097L);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+10:00" + "'", str31, "+10:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1570084924099L) + "'", long36 == (-1570084924099L));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 3600001L + "'", long43 == 3600001L);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-00:00:00.001" + "'", str47, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 98L + "'", long50 == 98L);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1569969664000L) + "'", long56 == (-1569969664000L));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 112139947L + "'", long60 == 112139947L);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360600000);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 52);
        long long6 = dateTimeZone1.convertLocalToUTC((long) '4', false);
        long long10 = dateTimeZone1.convertLocalToUTC((-1570156924001L), true, 115260051L);
        java.lang.String str12 = dateTimeZone1.getShortName(79739900L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((-360599949L), locale14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-360599948L) + "'", long6 == (-360599948L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570517524001L) + "'", long10 == (-1570517524001L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+100:10" + "'", str12, "+100:10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+100:10" + "'", str15, "+100:10");
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
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
        long long24 = dateTimeZone2.adjustOffset((-1570048923999L), true);
        java.lang.String str26 = dateTimeZone2.getName((-112140000L));
        java.lang.String str28 = dateTimeZone2.getName(187200002L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115800000 + "'", int17 == 115800000);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-115800099L) + "'", long21 == (-115800099L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1570048923999L) + "'", long24 == (-1570048923999L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:10" + "'", str26, "+32:10");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:10" + "'", str28, "+32:10");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        java.lang.String str14 = dateTimeZone1.getNameKey(115799900L);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-10800000L) + "'", long10 == (-10800000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-35999899L) + "'", long12 == (-35999899L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        int int13 = dateTimeZone3.getOffset((long) (-1));
        java.lang.String str14 = dateTimeZone3.getID();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone3.getShortName((-1570084924201L), locale16);
        boolean boolean19 = dateTimeZone3.isStandardOffset(39600000L);
        long long21 = dateTimeZone3.convertUTCToLocal(39600000L);
        long long24 = dateTimeZone3.adjustOffset((-35939934L), false);
        long long27 = dateTimeZone3.adjustOffset((-126599965L), false);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 75600000L + "'", long21 == 75600000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-35939934L) + "'", long24 == (-35939934L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-126599965L) + "'", long27 == (-126599965L));
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(102L, false, 2L);
        java.lang.String str13 = dateTimeZone1.toString();
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        boolean boolean17 = dateTimeZone1.isStandardOffset((-1570081264201L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 103L + "'", long12 == 103L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset(0L);
        int int7 = dateTimeZone1.getStandardOffset((-1570084924201L));
        boolean boolean9 = dateTimeZone1.isStandardOffset(99L);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str7 = dateTimeZone1.getID();
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) '4');
        long long11 = dateTimeZone1.previousTransition((-2L));
        long long13 = dateTimeZone1.nextTransition(103L);
        java.lang.String str15 = dateTimeZone1.getNameKey((-35939969L));
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone1.isLocalDateTimeGap(localDateTime16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName((-59916L), locale19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-2L) + "'", long11 == (-2L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 103L + "'", long13 == 103L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
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
        long long18 = dateTimeZone1.convertUTCToLocal((-36059865L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-10800000L) + "'", long10 == (-10800000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-35999899L) + "'", long12 == (-35999899L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-36059864L) + "'", long18 == (-36059864L));
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
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
        java.lang.String str39 = dateTimeZone1.getName((-25200000L));
        long long42 = dateTimeZone1.adjustOffset((-1570120924113L), false);
        long long45 = dateTimeZone1.adjustOffset((-176459968L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.001" + "'", str25, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.001" + "'", str26, "+00:00:00.001");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-90600001L) + "'", long31 == (-90600001L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 36000032L + "'", long34 == 36000032L);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 4140000L + "'", long37 == 4140000L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.001" + "'", str39, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1570120924113L) + "'", long42 == (-1570120924113L));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-176459968L) + "'", long45 == (-176459968L));
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 360060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360060000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        long long12 = dateTimeZone1.convertLocalToUTC((-1570084924100L), true);
        long long16 = dateTimeZone1.convertLocalToUTC((long) (byte) 1, false, (long) (short) 1);
        java.lang.String str18 = dateTimeZone1.getShortName((long) (short) 10);
        java.lang.String str20 = dateTimeZone1.getNameKey(25200000L);
        int int22 = dateTimeZone1.getOffsetFromLocal((long) 349260000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570084924101L) + "'", long12 == (-1570084924101L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), 52);
        org.junit.Assert.assertNotNull(dateTimeZone2);
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(100L, locale11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long15 = dateTimeZone1.convertUTCToLocal(0L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getShortName((long) 35, locale17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long23 = dateTimeZone20.convertLocalToUTC((-1570084924001L), false);
        boolean boolean24 = dateTimeZone20.isFixed();
        boolean boolean26 = dateTimeZone20.isStandardOffset((-1570517524000L));
        long long28 = dateTimeZone1.getMillisKeepLocal(dateTimeZone20, 401700097L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1570084924000L) + "'", long23 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 401700099L + "'", long28 == 401700099L);
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        int int13 = dateTimeZone3.getOffset((long) (-1));
        java.lang.String str14 = dateTimeZone3.toString();
        java.lang.String str15 = dateTimeZone3.toString();
        boolean boolean17 = dateTimeZone3.isStandardOffset((-1570120923936L));
        long long21 = dateTimeZone3.convertLocalToUTC(0L, true, (-1570200724201L));
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
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
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        int int13 = dateTimeZone10.getOffset((-36000000L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone10.getName(39600001L, locale16);
        java.lang.String str19 = dateTimeZone10.getNameKey((-1570046824000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        int int6 = dateTimeZone1.getOffset((long) 115800000);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((-1570200724001L), locale8);
        long long11 = dateTimeZone1.nextTransition((long) 349200000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 349200000L + "'", long11 == 349200000L);
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
        long long44 = dateTimeZone3.adjustOffset((-115800051L), false);
        int int46 = dateTimeZone3.getOffset((-1570084924145L));
        java.util.Locale locale48 = null;
        java.lang.String str49 = dateTimeZone3.getShortName((-231059900L), locale48);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1570120924101L) + "'", long40 == (-1570120924101L));
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-115800051L) + "'", long44 == (-115800051L));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00" + "'", str49, "+00:00");
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
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long27 = dateTimeZone24.adjustOffset((long) (short) 1, false);
        java.lang.String str29 = dateTimeZone24.getShortName(0L);
        long long33 = dateTimeZone24.convertLocalToUTC((-1L), false, (long) '#');
        java.lang.String str34 = dateTimeZone24.getID();
        long long36 = dateTimeZone24.nextTransition(115799901L);
        java.lang.String str38 = dateTimeZone24.getShortName((-35939934L));
        boolean boolean39 = dateTimeZone12.equals((java.lang.Object) str38);
        java.util.TimeZone timeZone40 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
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
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.001" + "'", str29, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-2L) + "'", long33 == (-2L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.001" + "'", str34, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 115799901L + "'", long36 == 115799901L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.001" + "'", str38, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone41);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
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
        long long20 = dateTimeZone1.convertLocalToUTC(39600000L, false, (long) (short) 10);
        java.lang.String str22 = dateTimeZone1.getName(36000099L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570120924100L) + "'", long12 == (-1570120924100L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-35999999L) + "'", long16 == (-35999999L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3600000L + "'", long20 == 3600000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+10:00" + "'", str22, "+10:00");
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
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
        int int20 = dateTimeZone6.getOffsetFromLocal((-115799999L));
        java.lang.String str22 = dateTimeZone6.getShortName(99L);
        long long24 = dateTimeZone6.convertUTCToLocal(95L);
        long long26 = dateTimeZone6.previousTransition((-3660000L));
        boolean boolean28 = dateTimeZone6.isStandardOffset(54600001L);
        int int30 = dateTimeZone6.getStandardOffset(89520051L);
        long long32 = dateTimeZone6.nextTransition(36000000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 36000000 + "'", int20 == 36000000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+10:00" + "'", str22, "+10:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 36000095L + "'", long24 == 36000095L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-3660000L) + "'", long26 == (-3660000L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 36000000 + "'", int30 == 36000000);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 36000000L + "'", long32 == 36000000L);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
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
        int int23 = dateTimeZone3.getStandardOffset((-90599999L));
        long long26 = dateTimeZone3.adjustOffset((-324000000L), true);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone3.getShortName(119399900L, locale28);
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
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 36000000 + "'", int23 == 36000000);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-324000000L) + "'", long26 == (-324000000L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+10:00" + "'", str29, "+10:00");
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
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
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        long long29 = dateTimeZone27.nextTransition((long) (short) 100);
        int int31 = dateTimeZone27.getOffsetFromLocal(100L);
        long long33 = dateTimeZone27.previousTransition(10L);
        long long35 = dateTimeZone27.nextTransition((-115799999L));
        int int37 = dateTimeZone27.getOffset((long) (byte) -1);
        long long39 = dateTimeZone1.getMillisKeepLocal(dateTimeZone27, (-233400101L));
        java.lang.String str41 = dateTimeZone1.getShortName((-355860001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36000000 + "'", int12 == 36000000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2L) + "'", long14 == (-2L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36000000 + "'", int18 == 36000000);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+10:00" + "'", str19, "+10:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36000000 + "'", int21 == 36000000);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+10:00" + "'", str24, "+10:00");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 36000000 + "'", int31 == 36000000);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-115799999L) + "'", long35 == (-115799999L));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 36000000 + "'", int37 == 36000000);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-233400101L) + "'", long39 == (-233400101L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+10:00" + "'", str41, "+10:00");
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
        long long34 = dateTimeZone23.previousTransition((-1570084924150L));
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
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+10:00" + "'", str21, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 99L + "'", long27 == 99L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 231059997L + "'", long30 == 231059997L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1570048924046L) + "'", long32 == (-1570048924046L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1570084924150L) + "'", long34 == (-1570084924150L));
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
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
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone19.getName(125940095L, locale33);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+10:00" + "'", str34, "+10:00");
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (short) 0, true);
        long long7 = dateTimeZone1.nextTransition(1L);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        long long10 = dateTimeZone1.nextTransition(100L);
        long long12 = dateTimeZone1.nextTransition(32L);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        long long15 = dateTimeZone1.nextTransition((-118920001L));
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-118920001L) + "'", long15 == (-118920001L));
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
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
        long long21 = dateTimeZone1.convertLocalToUTC(0L, false, 151200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36000000 + "'", int12 == 36000000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36000000 + "'", int14 == 36000000);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-36000000L) + "'", long21 == (-36000000L));
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 35);
        long long5 = dateTimeZone2.convertLocalToUTC((-324599998L), false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-326699998L) + "'", long5 == (-326699998L));
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
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
        int int19 = dateTimeZone1.getOffsetFromLocal((long) 10);
        int int21 = dateTimeZone1.getOffsetFromLocal((-323999999L));
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone1.isLocalDateTimeGap(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 103L + "'", long12 == 103L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
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
        boolean boolean18 = dateTimeZone10.isFixed();
        java.lang.String str20 = dateTimeZone10.getNameKey(71999948L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 72000000L + "'", long12 == 72000000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36000000 + "'", int17 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str20);
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
        java.lang.String str34 = dateTimeZone24.getShortName(79800002L);
        long long36 = dateTimeZone24.nextTransition(72059979L);
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
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 36000011L + "'", long20 == 36000011L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.001" + "'", str34, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 72059979L + "'", long36 == 72059979L);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long12 = dateTimeZone1.convertLocalToUTC((-1570084924100L), true);
        long long16 = dateTimeZone1.convertLocalToUTC((long) (byte) 1, false, (long) (short) 1);
        java.util.TimeZone timeZone17 = dateTimeZone1.toTimeZone();
        boolean boolean19 = dateTimeZone1.isStandardOffset(115800097L);
        long long21 = dateTimeZone1.convertUTCToLocal(2L);
        java.lang.Object obj22 = dateTimeZone1.writeReplace();
        java.lang.String str24 = dateTimeZone1.getShortName((-35999998L));
        boolean boolean26 = dateTimeZone1.isStandardOffset((-60001L));
        int int28 = dateTimeZone1.getOffsetFromLocal(201L);
        long long30 = dateTimeZone1.nextTransition((-177000002L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570120924100L) + "'", long12 == (-1570120924100L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-35999999L) + "'", long16 == (-35999999L));
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 36000002L + "'", long21 == 36000002L);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+10:00" + "'", str24, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 36000000 + "'", int28 == 36000000);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-177000002L) + "'", long30 == (-177000002L));
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        long long12 = dateTimeZone1.convertLocalToUTC(25200001L, true, 231059997L);
        long long14 = dateTimeZone1.nextTransition((-1570048924100L));
        long long16 = dateTimeZone1.convertUTCToLocal(60100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 25200002L + "'", long12 == 25200002L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1570048924100L) + "'", long14 == (-1570048924100L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60099L + "'", long16 == 60099L);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:35");
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName(147L, locale4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:35" + "'", str5, "+00:35");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean3 = dateTimeZone1.isStandardOffset(2100002L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        long long7 = dateTimeZone1.convertUTCToLocal((-59965L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-59964L) + "'", long7 == (-59964L));
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
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
        boolean boolean42 = dateTimeZone38.isStandardOffset(100L);
        java.lang.String str43 = dateTimeZone38.getID();
        int int45 = dateTimeZone38.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2100000 + "'", int10 == 2100000);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:35");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:35" + "'", str14, "+00:35");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:35" + "'", str17, "+00:35");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:35" + "'", str20, "+00:35");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:35" + "'", str22, "+00:35");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 97L + "'", long31 == 97L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2100000 + "'", int33 == 2100000);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "GMT+00:35");
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "GMT+00:35");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:35" + "'", str39, "+00:35");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:35" + "'", str43, "+00:35");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2100000 + "'", int45 == 2100000);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (short) 0);
        long long4 = dateTimeZone2.nextTransition(0L);
        long long6 = dateTimeZone2.nextTransition(79800002L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 79800002L + "'", long6 == 79800002L);
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
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone12.getName(28800000L, locale24);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2100000 + "'", int8 == 2100000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2100000 + "'", int10 == 2100000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-33899900L) + "'", long14 == (-33899900L));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+10:00" + "'", str25, "+10:00");
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
        java.lang.String str7 = dateTimeZone1.getNameKey(25200000L);
        java.lang.String str8 = dateTimeZone1.toString();
        boolean boolean10 = dateTimeZone1.isStandardOffset(115800002L);
        long long12 = dateTimeZone1.previousTransition((-1570084924047L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str14 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570084924047L) + "'", long12 == (-1570084924047L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
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
        int int18 = dateTimeZone1.getStandardOffset(103L);
        java.lang.String str20 = dateTimeZone1.getNameKey((-1570200724101L));
        long long22 = dateTimeZone1.nextTransition(0L);
        boolean boolean23 = dateTimeZone1.isFixed();
        boolean boolean24 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-10800000L) + "'", long10 == (-10800000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-35999899L) + "'", long12 == (-35999899L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long3 = dateTimeZone1.previousTransition((long) '4');
        int int5 = dateTimeZone1.getOffset(89520000L);
        java.lang.String str7 = dateTimeZone1.getShortName(110L);
        long long9 = dateTimeZone1.previousTransition((-2100003L));
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        boolean boolean11 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-2100003L) + "'", long9 == (-2100003L));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        java.lang.String str20 = dateTimeZone18.getNameKey(1L);
        int int22 = dateTimeZone18.getStandardOffset(36000002L);
        boolean boolean23 = dateTimeZone1.equals((java.lang.Object) dateTimeZone18);
        boolean boolean25 = dateTimeZone1.isStandardOffset(79260101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1570084924099L) + "'", long14 == (-1570084924099L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2100000 + "'", int22 == 2100000);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-3660000));
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str4 = dateTimeZone1.getNameKey(71999999L);
        int int6 = dateTimeZone1.getOffsetFromLocal((-59904L));
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        long long10 = dateTimeZone1.nextTransition(79260051L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT-01:01");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3660000) + "'", int6 == (-3660000));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 79260051L + "'", long10 == 79260051L);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getOffsetFromLocal(60084L);
        long long8 = dateTimeZone1.convertLocalToUTC(115259909L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115259908L + "'", long8 == 115259908L);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
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
        java.lang.String str22 = dateTimeZone1.toString();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        long long28 = dateTimeZone24.getMillisKeepLocal(dateTimeZone26, (long) 'a');
        boolean boolean29 = dateTimeZone24.isFixed();
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone24.isLocalDateTimeGap(localDateTime30);
        long long34 = dateTimeZone24.adjustOffset((-1570120924001L), false);
        java.lang.Object obj35 = dateTimeZone24.writeReplace();
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone24.getShortName((-115800001L), locale37);
        long long40 = dateTimeZone1.getMillisKeepLocal(dateTimeZone24, 36000011L);
        java.util.TimeZone timeZone41 = dateTimeZone24.toTimeZone();
        java.util.Locale locale43 = null;
        java.lang.String str44 = dateTimeZone24.getShortName(61L, locale43);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 97L + "'", long28 == 97L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1570120924001L) + "'", long34 == (-1570120924001L));
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.001" + "'", str38, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 36000011L + "'", long40 == 36000011L);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00:00.001" + "'", str44, "+00:00:00.001");
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 10);
        boolean boolean4 = dateTimeZone2.isStandardOffset(36000100L);
        long long6 = dateTimeZone2.nextTransition(39599999L);
        int int8 = dateTimeZone2.getStandardOffset((-25200101L));
        java.lang.String str9 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 39599999L + "'", long6 == 39599999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 360600000 + "'", int8 == 360600000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+100:10" + "'", str9, "+100:10");
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
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
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        long long30 = dateTimeZone28.nextTransition((long) (short) 100);
        int int32 = dateTimeZone28.getOffsetFromLocal(100L);
        org.joda.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = dateTimeZone28.isLocalDateTimeGap(localDateTime33);
        boolean boolean36 = dateTimeZone28.isStandardOffset(115800002L);
        long long38 = dateTimeZone28.previousTransition(112139999L);
        long long41 = dateTimeZone28.adjustOffset((-59903L), false);
        boolean boolean42 = dateTimeZone6.equals((java.lang.Object) false);
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
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 112139999L + "'", long38 == 112139999L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-59903L) + "'", long41 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
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
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone10.getOffset(readableInstant18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (short) 0);
        long long25 = dateTimeZone22.convertLocalToUTC((long) 0, false);
        java.lang.Object obj26 = dateTimeZone22.writeReplace();
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.lang.String str29 = dateTimeZone28.getID();
        long long31 = dateTimeZone28.previousTransition((-1L));
        boolean boolean33 = dateTimeZone28.equals((java.lang.Object) (-1.0f));
        int int35 = dateTimeZone28.getOffsetFromLocal(25200052L);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone28.getShortName(11L, locale37);
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        long long44 = dateTimeZone40.getMillisKeepLocal(dateTimeZone42, (long) 'a');
        java.util.Locale locale46 = null;
        java.lang.String str47 = dateTimeZone40.getName((long) (short) 1, locale46);
        int int49 = dateTimeZone40.getOffset((long) 1);
        java.lang.Object obj50 = dateTimeZone40.writeReplace();
        java.lang.String str52 = dateTimeZone40.getShortName((-1570084924001L));
        long long55 = dateTimeZone40.adjustOffset((long) '#', false);
        org.joda.time.ReadableInstant readableInstant56 = null;
        int int57 = dateTimeZone40.getOffset(readableInstant56);
        long long59 = dateTimeZone28.getMillisKeepLocal(dateTimeZone40, 35999899L);
        org.joda.time.LocalDateTime localDateTime60 = null;
        boolean boolean61 = dateTimeZone40.isLocalDateTimeGap(localDateTime60);
        long long63 = dateTimeZone22.getMillisKeepLocal(dateTimeZone40, (-3660005L));
        java.lang.Object obj64 = dateTimeZone40.writeReplace();
        boolean boolean65 = dateTimeZone10.equals(obj64);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-349200000L) + "'", long25 == (-349200000L));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.001" + "'", str29, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.001" + "'", str38, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 97L + "'", long44 == 97L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00:00.001" + "'", str47, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:00:00.001" + "'", str52, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 35L + "'", long55 == 35L);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 35999899L + "'", long59 == 35999899L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 345539994L + "'", long63 == 345539994L);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        boolean boolean3 = dateTimeZone1.isStandardOffset((-115259999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-3660000));
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getOffset((-1570084924003L));
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName((-277800017L), locale6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT-01:01");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3660000) + "'", int4 == (-3660000));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-01:01" + "'", str7, "-01:01");
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        long long9 = dateTimeZone1.nextTransition((-115799999L));
        java.util.Set<java.lang.String> strSet10 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) strSet10);
        java.lang.String str13 = dateTimeZone1.getShortName(119400101L);
        java.lang.String str14 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone1.getShortName(205320050L, locale18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115799999L) + "'", long9 == (-115799999L));
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(102L, false, 2L);
        java.lang.String str13 = dateTimeZone1.toString();
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        boolean boolean16 = dateTimeZone15.isFixed();
        java.lang.String str18 = dateTimeZone15.getShortName((-1569969663898L));
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        long long9 = dateTimeZone1.nextTransition((-115799999L));
        int int11 = dateTimeZone1.getOffset((long) (byte) -1);
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName(25199901L, locale14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115799999L) + "'", long9 == (-115799999L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
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
        boolean boolean19 = dateTimeZone3.isStandardOffset(39600000L);
        long long21 = dateTimeZone3.convertUTCToLocal(39600000L);
        long long24 = dateTimeZone3.adjustOffset((-35939934L), false);
        long long26 = dateTimeZone3.nextTransition((-1570164664002L));
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 39600001L + "'", long21 == 39600001L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-35939934L) + "'", long24 == (-35939934L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570164664002L) + "'", long26 == (-1570164664002L));
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (int) (short) 1);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        long long6 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 115739900L);
        java.lang.String str7 = dateTimeZone2.toString();
        java.lang.String str9 = dateTimeZone2.getName(396600000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT-01:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 112079899L + "'", long6 == 112079899L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-01:01" + "'", str7, "-01:01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-01:01" + "'", str9, "-01:01");
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) (-1), locale8);
        java.lang.String str10 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 10);
        int int15 = dateTimeZone13.getStandardOffset((-99L));
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.lang.String str20 = dateTimeZone19.getID();
        long long22 = dateTimeZone19.previousTransition((-1L));
        long long26 = dateTimeZone19.convertLocalToUTC(25200000L, true, 100L);
        long long28 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, 100L);
        long long30 = dateTimeZone13.getMillisKeepLocal(dateTimeZone19, (-1570084924101L));
        long long32 = dateTimeZone1.getMillisKeepLocal(dateTimeZone19, (-1570084384200L));
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
        java.lang.String str49 = dateTimeZone39.toString();
        java.lang.String str50 = dateTimeZone39.getID();
        int int52 = dateTimeZone39.getStandardOffset((-115799999L));
        int int54 = dateTimeZone39.getOffsetFromLocal((-115799899L));
        int int56 = dateTimeZone39.getOffset(59L);
        long long58 = dateTimeZone19.getMillisKeepLocal(dateTimeZone39, (-61200002L));
        long long61 = dateTimeZone19.adjustOffset((-113L), true);
        java.util.Locale locale63 = null;
        java.lang.String str64 = dateTimeZone19.getName(25140002L, locale63);
        org.joda.time.LocalDateTime localDateTime65 = null;
        boolean boolean66 = dateTimeZone19.isLocalDateTimeGap(localDateTime65);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115800000 + "'", int15 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 25199999L + "'", long26 == 25199999L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1569969124102L) + "'", long30 == (-1569969124102L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1570084384200L) + "'", long32 == (-1570084384200L));
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 115800000 + "'", int37 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 97L + "'", long43 == 97L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.001" + "'", str46, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00:00.001" + "'", str49, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00:00.001" + "'", str50, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-61200002L) + "'", long58 == (-61200002L));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-113L) + "'", long61 == (-113L));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "+00:00:00.001" + "'", str64, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
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
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
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
        int int30 = dateTimeZone14.getOffsetFromLocal((-1570084864046L));
        boolean boolean31 = dateTimeZone14.isFixed();
        int int33 = dateTimeZone14.getOffsetFromLocal(345539895L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.035" + "'", str5, "+00:00:00.035");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.035" + "'", str8, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115799965L + "'", long12 == 115799965L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 101L + "'", long26 == 101L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-115799866L) + "'", long28 == (-115799866L));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
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
        long long23 = dateTimeZone1.previousTransition(231059997L);
        int int25 = dateTimeZone1.getOffset(244739999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 231059997L + "'", long23 == 231059997L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((-540049L), locale3);
        int int6 = dateTimeZone1.getOffsetFromLocal((-3600065L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
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
        long long70 = dateTimeZone52.adjustOffset((-1570048984099L), true);
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
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1570048984099L) + "'", long70 == (-1570048984099L));
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360000000);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 115799900L);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str9 = dateTimeZone8.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        long long12 = dateTimeZone8.convertUTCToLocal((long) 'a');
        java.lang.String str14 = dateTimeZone8.getName(28800000L);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, (-115799951L));
        long long18 = dateTimeZone1.previousTransition((-1570084924099L));
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone1.getOffset(readableInstant19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 479399900L + "'", long5 == 479399900L);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 96L + "'", long12 == 96L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 244200050L + "'", long16 == 244200050L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570084924099L) + "'", long18 == (-1570084924099L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 360000000 + "'", int20 == 360000000);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(97L);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        long long14 = dateTimeZone1.convertUTCToLocal((-2159816L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2159817L) + "'", long14 == (-2159817L));
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
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
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone9.getName((-2099904L), locale24);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 96L + "'", long5 == 96L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
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
        java.lang.String str36 = dateTimeZone10.getNameKey((-118920002L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1570084924001L) + "'", long23 == (-1570084924001L));
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-00:00:00.001" + "'", str29, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 51L + "'", long31 == 51L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-35999949L) + "'", long34 == (-35999949L));
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.convertUTCToLocal(100L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.lang.String str9 = dateTimeZone1.getNameKey((-91L));
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        int int13 = dateTimeZone1.getOffsetFromLocal(71400064L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str8 = dateTimeZone1.toString();
        long long10 = dateTimeZone1.convertUTCToLocal((-540099L));
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 10);
        int int15 = dateTimeZone13.getStandardOffset((-99L));
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.lang.String str20 = dateTimeZone19.getID();
        long long22 = dateTimeZone19.previousTransition((-1L));
        long long26 = dateTimeZone19.convertLocalToUTC(25200000L, true, 100L);
        long long28 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, 100L);
        long long30 = dateTimeZone13.getMillisKeepLocal(dateTimeZone19, (-1570084924101L));
        int int32 = dateTimeZone19.getOffsetFromLocal(115799900L);
        boolean boolean34 = dateTimeZone19.isStandardOffset(59999L);
        boolean boolean35 = dateTimeZone1.equals((java.lang.Object) boolean34);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-540100L) + "'", long10 == (-540100L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115800000 + "'", int15 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 25200001L + "'", long26 == 25200001L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 102L + "'", long28 == 102L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1569969124100L) + "'", long30 == (-1569969124100L));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
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
        java.lang.Object obj29 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
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
        java.lang.String str16 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
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
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone1.getName((-87000000L), locale27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.lang.String str31 = dateTimeZone30.getID();
        long long33 = dateTimeZone30.previousTransition((-1L));
        boolean boolean35 = dateTimeZone30.equals((java.lang.Object) 1.0f);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone30.getName((-1570084924101L), locale37);
        java.lang.String str40 = dateTimeZone30.getNameKey((-36000000L));
        java.lang.String str41 = dateTimeZone30.getID();
        int int43 = dateTimeZone30.getOffset((-1570084924003L));
        long long45 = dateTimeZone1.getMillisKeepLocal(dateTimeZone30, 60199L);
        long long48 = dateTimeZone30.adjustOffset(0L, true);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-00:00:00.001" + "'", str31, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-00:00:00.001" + "'", str38, "-00:00:00.001");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-00:00:00.001" + "'", str41, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 60199L + "'", long45 == 60199L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str8 = dateTimeZone1.getShortName(115800002L);
        long long11 = dateTimeZone1.adjustOffset(39600000L, false);
        int int13 = dateTimeZone1.getOffsetFromLocal((-35999990L));
        java.lang.String str14 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 39600000L + "'", long11 == 39600000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(25200000L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone2.getOffset(readableInstant6);
        java.lang.String str9 = dateTimeZone2.getName(0L);
        java.lang.String str10 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
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
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone3.getShortName(36000032L, locale36);
        boolean boolean38 = dateTimeZone3.isFixed();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-00:00:00.001" + "'", str37, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
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
        boolean boolean47 = dateTimeZone42.isStandardOffset(79800100L);
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        int int15 = dateTimeZone1.getOffsetFromLocal((-26280099L));
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone1.getOffset(readableInstant16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
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
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone18.getShortName(71400012L, locale22);
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
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName(25200051L, locale12);
        java.lang.Object obj14 = dateTimeZone1.writeReplace();
        boolean boolean16 = dateTimeZone1.isStandardOffset(32340032L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(101L, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924200L));
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        long long11 = dateTimeZone1.convertLocalToUTC(28860000L, false, 51L);
        java.lang.String str13 = dateTimeZone1.getShortName(119340000L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName(187200011L, locale15);
        int int18 = dateTimeZone1.getStandardOffset(0L);
        long long21 = dateTimeZone1.convertLocalToUTC(36000037L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.052" + "'", str4, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.052" + "'", str6, "+00:00:00.052");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 28859948L + "'", long11 == 28859948L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.052" + "'", str13, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.052" + "'", str16, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35999985L + "'", long21 == 35999985L);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        long long10 = dateTimeZone1.previousTransition((-1570084924099L));
        long long12 = dateTimeZone1.previousTransition((-36000001L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((-1569969663900L), locale14);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getShortName(151740000L, locale17);
        int int20 = dateTimeZone1.getOffset((-1569688324000L));
        int int22 = dateTimeZone1.getStandardOffset((long) 362100000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924099L) + "'", long10 == (-1570084924099L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-36000001L) + "'", long12 == (-36000001L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
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
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone3.getName((-39659900L), locale28);
        long long33 = dateTimeZone3.convertLocalToUTC((-1570200664101L), false, (-91L));
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone3.getName(3660100L, locale35);
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
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-00:00:00.001" + "'", str29, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1570200664100L) + "'", long33 == (-1570200664100L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-00:00:00.001" + "'", str36, "-00:00:00.001");
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
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
        boolean boolean12 = dateTimeZone10.isStandardOffset((-48L));
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        int int10 = dateTimeZone1.getOffset(97L);
        int int12 = dateTimeZone1.getStandardOffset((-34439999L));
        long long14 = dateTimeZone1.nextTransition((-71999848L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-71999848L) + "'", long14 == (-71999848L));
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName((-1570200724101L));
        long long8 = dateTimeZone1.nextTransition((-1570084924045L));
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        boolean boolean12 = dateTimeZone1.isStandardOffset(187260001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1570084924045L) + "'", long8 == (-1570084924045L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
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
        boolean boolean17 = dateTimeZone1.isFixed();
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getShortName(36000002L, locale19);
        long long23 = dateTimeZone1.adjustOffset((-33899999L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 102L + "'", long16 == 102L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-33899999L) + "'", long23 == (-33899999L));
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
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
        java.util.TimeZone timeZone17 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        long long20 = dateTimeZone18.previousTransition((-151799899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570084924099L) + "'", long12 == (-1570084924099L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-151799899L) + "'", long20 == (-151799899L));
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str8 = dateTimeZone1.getShortName(115800002L);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-1570084924047L));
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.convertUTCToLocal((-35999993L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-35999994L) + "'", long13 == (-35999994L));
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
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
        boolean boolean22 = dateTimeZone10.isStandardOffset((-59990L));
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        long long28 = dateTimeZone24.getMillisKeepLocal(dateTimeZone26, (long) 'a');
        int int30 = dateTimeZone26.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone31 = dateTimeZone26.toTimeZone();
        int int33 = dateTimeZone26.getOffset((long) (short) 1);
        long long37 = dateTimeZone26.convertLocalToUTC((long) 115800000, true, (-1570084924000L));
        long long40 = dateTimeZone26.adjustOffset(60032L, false);
        long long42 = dateTimeZone26.convertUTCToLocal((-1570048923902L));
        long long44 = dateTimeZone10.getMillisKeepLocal(dateTimeZone26, 35999832L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 97L + "'", long28 == 97L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 115800001L + "'", long37 == 115800001L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 60032L + "'", long40 == 60032L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1570048923903L) + "'", long42 == (-1570048923903L));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 35999832L + "'", long44 == 35999832L);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str7 = dateTimeZone1.getNameKey(36000100L);
        java.lang.String str8 = dateTimeZone1.getID();
        long long11 = dateTimeZone1.adjustOffset(97L, false);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        int int15 = dateTimeZone1.getOffset(33L);
        java.lang.String str17 = dateTimeZone1.getShortName((-206400001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
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
        java.lang.String str28 = dateTimeZone1.getNameKey((-1569688324052L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-99L) + "'", long15 == (-99L));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-39660000L) + "'", long23 == (-39660000L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
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
        java.util.TimeZone timeZone25 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone26.getOffset(readableInstant27);
        java.lang.String str30 = dateTimeZone26.getName(255719957L);
        java.util.TimeZone timeZone31 = dateTimeZone26.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199900L + "'", long10 == 25199900L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 98L + "'", long22 == 98L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 101L + "'", long24 == 101L);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:01");
        java.lang.String str3 = dateTimeZone1.getNameKey(101L);
        long long5 = dateTimeZone1.nextTransition(83400000L);
        java.lang.String str6 = dateTimeZone1.getID();
        long long8 = dateTimeZone1.nextTransition(115260000L);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-1570084924100L));
        boolean boolean12 = dateTimeZone1.isStandardOffset(25139999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 83400000L + "'", long5 == 83400000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:01" + "'", str6, "-01:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115260000L + "'", long8 == 115260000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (short) 0, true);
        long long7 = dateTimeZone1.nextTransition(1L);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        long long10 = dateTimeZone1.nextTransition(100L);
        long long12 = dateTimeZone1.nextTransition(32L);
        java.lang.String str13 = dateTimeZone1.getID();
        java.lang.String str15 = dateTimeZone1.getNameKey((-35999897L));
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
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
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
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
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
        org.junit.Assert.assertNotNull(dateTimeZone27);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset(0L);
        long long6 = dateTimeZone1.convertUTCToLocal((long) 36000000);
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 36000001L + "'", long6 == 36000001L);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (short) 0);
        long long4 = dateTimeZone2.nextTransition(0L);
        long long7 = dateTimeZone2.adjustOffset(115739900L, false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 115739900L + "'", long7 == 115739900L);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
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
        java.lang.String str22 = dateTimeZone1.getNameKey((-60002L));
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.previousTransition((long) (short) 1);
        java.lang.String str9 = dateTimeZone1.getID();
        boolean boolean11 = dateTimeZone1.isStandardOffset((-1570048924000L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
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
        boolean boolean37 = dateTimeZone9.isStandardOffset(3720200L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 36000000L + "'", long5 == 36000000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-35999991L) + "'", long7 == (-35999991L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-2L) + "'", long22 == (-2L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 35999931L + "'", long31 == 35999931L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 244200038L + "'", long35 == 244200038L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-35999991L) + "'", long24 == (-35999991L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570048924099L) + "'", long26 == (-1570048924099L));
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 35);
        long long6 = dateTimeZone2.convertLocalToUTC((-59905L), false, 115799999L);
        java.lang.Object obj7 = dateTimeZone2.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-362159905L) + "'", long6 == (-362159905L));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360600000);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 52);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        int int7 = dateTimeZone1.getOffset((-2099964L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 360600000 + "'", int7 == 360600000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 360600000 + "'", int9 == 360600000);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
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
        boolean boolean17 = dateTimeZone10.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 10);
        boolean boolean3 = dateTimeZone2.isFixed();
        int int5 = dateTimeZone2.getOffset((-118859800L));
        java.lang.Object obj6 = dateTimeZone2.writeReplace();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115800000 + "'", int5 == 115800000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName((-1570200724101L));
        int int8 = dateTimeZone1.getOffset((-1570048924100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName(60097L, locale6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.String str11 = dateTimeZone9.getShortName((-1570084924100L));
        long long14 = dateTimeZone9.adjustOffset((long) 36000000, false);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone9.getOffset(readableInstant15);
        long long20 = dateTimeZone9.convertLocalToUTC((-1569861724098L), true, (-61140001L));
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (-35999999L));
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        long long28 = dateTimeZone24.getMillisKeepLocal(dateTimeZone26, (long) 'a');
        int int30 = dateTimeZone26.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone31 = dateTimeZone26.toTimeZone();
        int int33 = dateTimeZone26.getOffset((long) (short) 1);
        long long37 = dateTimeZone26.convertLocalToUTC((long) 115800000, true, (-1570084924000L));
        long long39 = dateTimeZone1.getMillisKeepLocal(dateTimeZone26, 125939995L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.035" + "'", str11, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 36000000L + "'", long14 == 36000000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1569861724133L) + "'", long20 == (-1569861724133L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-36000033L) + "'", long22 == (-36000033L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 97L + "'", long28 == 97L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 115799999L + "'", long37 == 115799999L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 125939995L + "'", long39 == 125939995L);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
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
        java.lang.String str18 = dateTimeZone1.toString();
        int int20 = dateTimeZone1.getStandardOffset((-35939800L));
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.previousTransition(25200000L);
        long long7 = dateTimeZone1.nextTransition((-1570048923999L));
        int int9 = dateTimeZone1.getOffsetFromLocal((long) '4');
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25200000L + "'", long5 == 25200000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570048923999L) + "'", long7 == (-1570048923999L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        long long11 = dateTimeZone1.convertLocalToUTC(115799900L, false);
        java.lang.String str13 = dateTimeZone1.getNameKey((-35999899L));
        int int15 = dateTimeZone1.getOffsetFromLocal(0L);
        int int17 = dateTimeZone1.getOffsetFromLocal(115740000L);
        java.lang.String str18 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25199999L + "'", long8 == 25199999L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115799899L + "'", long11 == 115799899L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
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
        java.lang.String str43 = dateTimeZone3.getName(35999909L);
        long long45 = dateTimeZone3.convertUTCToLocal((-67800000L));
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
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.001" + "'", str43, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-67799999L) + "'", long45 == (-67799999L));
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 1, false, 97L);
        int int7 = dateTimeZone1.getOffset((long) 10);
        int int9 = dateTimeZone1.getOffsetFromLocal((-1569969124103L));
        boolean boolean11 = dateTimeZone1.isStandardOffset(360660000L);
        java.lang.String str13 = dateTimeZone1.getShortName((-1570084924100L));
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        java.lang.String str3 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:10" + "'", str3, "+32:10");
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
        java.lang.Object obj26 = dateTimeZone19.writeReplace();
        long long28 = dateTimeZone19.convertUTCToLocal(115799999L);
        long long30 = dateTimeZone19.convertUTCToLocal((-1570084924153L));
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
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 115800000L + "'", long28 == 115800000L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1570084924152L) + "'", long30 == (-1570084924152L));
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str4 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.previousTransition((-115799866L));
        long long8 = dateTimeZone2.nextTransition((-1570084924099L));
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone11.getOffset(readableInstant12);
        java.lang.Object obj14 = dateTimeZone11.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        int int17 = dateTimeZone11.getOffsetFromLocal((-1570120924111L));
        boolean boolean18 = dateTimeZone2.equals((java.lang.Object) int17);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:10" + "'", str4, "+32:10");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-115799866L) + "'", long6 == (-115799866L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1570084924099L) + "'", long8 == (-1570084924099L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36000000 + "'", int13 == 36000000);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36000000 + "'", int17 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getShortName((-1570012924100L), locale4);
        long long7 = dateTimeZone1.nextTransition(119399999L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.035" + "'", str5, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 119399999L + "'", long7 == 119399999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:10");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean4 = dateTimeZone1.isStandardOffset(98L);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        java.lang.String str9 = dateTimeZone1.getName((-90600034L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:10" + "'", str2, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:10" + "'", str9, "+32:10");
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(52);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(151200011L, locale3);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.052" + "'", str4, "+00:00:00.052");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.convertUTCToLocal(100L);
        java.lang.String str7 = dateTimeZone1.getName((-99L));
        boolean boolean9 = dateTimeZone1.isStandardOffset((-1570200724001L));
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        java.lang.String str11 = dateTimeZone1.toString();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((-10800000L), locale13);
        java.lang.String str16 = dateTimeZone1.getNameKey(115860097L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
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
        long long24 = dateTimeZone3.previousTransition((-61140001L));
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-61140001L) + "'", long24 == (-61140001L));
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName((long) (short) 10, locale14);
        java.lang.String str16 = dateTimeZone1.toString();
        java.util.TimeZone timeZone17 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:10" + "'", str4, "+32:10");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-90600000L) + "'", long10 == (-90600000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-115799899L) + "'", long12 == (-115799899L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
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
        java.util.TimeZone timeZone16 = dateTimeZone1.toTimeZone();
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
        java.lang.String str39 = dateTimeZone18.getShortName(115800004L);
        boolean boolean40 = dateTimeZone1.equals((java.lang.Object) str39);
        int int42 = dateTimeZone1.getStandardOffset(79260100L);
        long long44 = dateTimeZone1.convertUTCToLocal((-33899898L));
        long long47 = dateTimeZone1.convertLocalToUTC(35999832L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:10" + "'", str2, "+32:10");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115800000 + "'", int9 == 115800000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115800000 + "'", int13 == 115800000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:10" + "'", str15, "+32:10");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+32:10" + "'", str39, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 115800000 + "'", int42 == 115800000);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 81900102L + "'", long44 == 81900102L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-79800168L) + "'", long47 == (-79800168L));
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str6 = dateTimeZone1.toString();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-1570085464099L), locale8);
        boolean boolean10 = dateTimeZone1.isFixed();
        int int12 = dateTimeZone1.getStandardOffset(115740001L);
        int int14 = dateTimeZone1.getStandardOffset((-153L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115800000 + "'", int5 == 115800000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:10" + "'", str6, "+32:10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:10" + "'", str9, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115800000 + "'", int12 == 115800000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115800000 + "'", int14 == 115800000);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
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
        long long25 = dateTimeZone1.convertLocalToUTC((-206400000L), false);
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone1.isLocalDateTimeGap(localDateTime26);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:10" + "'", str8, "+32:10");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570200724100L) + "'", long12 == (-1570200724100L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115799999L) + "'", long16 == (-115799999L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:10" + "'", str18, "+32:10");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115800000 + "'", int22 == 115800000);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-322200000L) + "'", long25 == (-322200000L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) '4');
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(35999900L, locale4);
        int int7 = dateTimeZone2.getOffsetFromLocal(61200002L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+35:52" + "'", str5, "+35:52");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 129120000 + "'", int7 == 129120000);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(52);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
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
        java.util.TimeZone timeZone14 = dateTimeZone11.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115800000 + "'", int7 == 115800000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
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
        long long43 = dateTimeZone3.convertLocalToUTC(89520001L, true);
        int int45 = dateTimeZone3.getStandardOffset((long) (short) -1);
        int int47 = dateTimeZone3.getStandardOffset((long) 360000000);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.lang.String str51 = dateTimeZone49.getShortName((-1L));
        org.joda.time.LocalDateTime localDateTime52 = null;
        boolean boolean53 = dateTimeZone49.isLocalDateTimeGap(localDateTime52);
        int int55 = dateTimeZone49.getStandardOffset((-1570048924098L));
        long long57 = dateTimeZone3.getMillisKeepLocal(dateTimeZone49, (-33899898L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115800000 + "'", int7 == 115800000);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115800000 + "'", int23 == 115800000);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:10" + "'", str27, "+32:10");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:10" + "'", str30, "+32:10");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+32:10" + "'", str33, "+32:10");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+32:10" + "'", str35, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1570005124101L) + "'", long40 == (-1570005124101L));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-26279999L) + "'", long43 == (-26279999L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 115800000 + "'", int45 == 115800000);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 115800000 + "'", int47 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00:00.052" + "'", str51, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 52 + "'", int55 == 52);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 81900050L + "'", long57 == 81900050L);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
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
        long long41 = dateTimeZone0.convertLocalToUTC((-190319968L), false, (-126600000L));
        java.lang.String str42 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long47 = dateTimeZone44.adjustOffset((long) (short) 1, false);
        long long49 = dateTimeZone0.getMillisKeepLocal(dateTimeZone44, (-360599948L));
        boolean boolean50 = dateTimeZone44.isFixed();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:10" + "'", str21, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:10" + "'", str24, "+32:10");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:10" + "'", str25, "+32:10");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 115800000 + "'", int27 == 115800000);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 115800000 + "'", int29 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 200L + "'", long36 == 200L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-190319968L) + "'", long41 == (-190319968L));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-360599949L) + "'", long49 == (-360599949L));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
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
        long long26 = dateTimeZone1.convertLocalToUTC((-111599999L), true, 360600002L);
        java.lang.Object obj27 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115800000 + "'", int5 == 115800000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11L + "'", long10 == 11L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115800000 + "'", int16 == 115800000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1570200724001L) + "'", long19 == (-1570200724001L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 115800000 + "'", int21 == 115800000);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-227399999L) + "'", long26 == (-227399999L));
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.lang.String str7 = dateTimeZone1.getNameKey(25200000L);
        java.lang.String str8 = dateTimeZone1.toString();
        boolean boolean10 = dateTimeZone1.isStandardOffset(115800002L);
        boolean boolean11 = dateTimeZone1.isFixed();
        boolean boolean12 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:10" + "'", str8, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
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
        long long25 = dateTimeZone3.convertLocalToUTC((long) (short) 0, false, (-67800000L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115800000 + "'", int7 == 115800000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:10" + "'", str12, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-115799990L) + "'", long18 == (-115799990L));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-115800000L) + "'", long25 == (-115800000L));
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 115260000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115260000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
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
        long long35 = dateTimeZone10.convertLocalToUTC((-1570517524101L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115800000 + "'", int14 == 115800000);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115800000 + "'", int20 == 115800000);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:10" + "'", str21, "+32:10");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1569969124000L) + "'", long23 == (-1569969124000L));
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115800011L + "'", long27 == 115800011L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:10" + "'", str29, "+32:10");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 115800052L + "'", long31 == 115800052L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1570633324101L) + "'", long35 == (-1570633324101L));
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean4 = dateTimeZone1.isStandardOffset(98L);
        java.lang.String str6 = dateTimeZone1.getShortName(231059997L);
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        long long11 = dateTimeZone1.convertLocalToUTC(115259950L, true, 115259898L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:10" + "'", str2, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:10" + "'", str6, "+32:10");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-540050L) + "'", long11 == (-540050L));
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        boolean boolean3 = dateTimeZone1.isFixed();
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((-59904L));
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.String str9 = dateTimeZone1.toString();
        long long12 = dateTimeZone1.adjustOffset((-206400000L), false);
        int int14 = dateTimeZone1.getOffsetFromLocal((long) 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-59903L) + "'", long6 == (-59903L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-206400000L) + "'", long12 == (-206400000L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
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
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        int int38 = dateTimeZone36.getStandardOffset((-1570164724101L));
        org.joda.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = dateTimeZone36.isLocalDateTimeGap(localDateTime39);
        long long42 = dateTimeZone3.getMillisKeepLocal(dateTimeZone36, (-421800000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115800000 + "'", int7 == 115800000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115800000 + "'", int13 == 115800000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:10" + "'", str14, "+32:10");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1569969124000L) + "'", long16 == (-1569969124000L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 115800011L + "'", long20 == 115800011L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:10" + "'", str22, "+32:10");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:10" + "'", str25, "+32:10");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:10" + "'", str28, "+32:10");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 115800000 + "'", int30 == 115800000);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:10" + "'", str32, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-306000001L) + "'", long42 == (-306000001L));
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
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
        boolean boolean26 = dateTimeZone1.isStandardOffset(35999999L);
        java.util.TimeZone timeZone27 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone28.getName(35999978L, locale30);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:10" + "'", str8, "+32:10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115800000 + "'", int10 == 115800000);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:10" + "'", str13, "+32:10");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115800000 + "'", int18 == 115800000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115800000 + "'", int20 == 115800000);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-151799990L) + "'", long24 == (-151799990L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) '4');
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(35999900L, locale4);
        java.lang.String str6 = dateTimeZone2.toString();
        boolean boolean8 = dateTimeZone2.isStandardOffset((-35999999L));
        long long10 = dateTimeZone2.convertUTCToLocal(3600010L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+35:52" + "'", str5, "+35:52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+35:52" + "'", str6, "+35:52");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 132720010L + "'", long10 == 132720010L);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
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
        java.util.TimeZone timeZone23 = dateTimeZone14.toTimeZone();
        int int25 = dateTimeZone14.getOffset((-35999993L));
        int int27 = dateTimeZone14.getOffset(119340000L);
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = dateTimeZone14.getOffset(readableInstant28);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:10" + "'", str2, "+32:10");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115800000 + "'", int8 == 115800000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924099L) + "'", long10 == (-1570084924099L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-36000001L) + "'", long12 == (-36000001L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-35999999L) + "'", long17 == (-35999999L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-244800000L) + "'", long19 == (-244800000L));
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+:0:10");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-233400101L) + "'", long22 == (-233400101L));
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+:0:10");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 360600000 + "'", int25 == 360600000);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 360600000 + "'", int27 == 360600000);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 360600000 + "'", int29 == 360600000);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        java.lang.String str9 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115800000 + "'", int5 == 115800000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:10" + "'", str8, "+32:10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:10" + "'", str9, "+32:10");
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset(0L);
        int int7 = dateTimeZone1.getStandardOffset((-1570084924201L));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-10L), locale12);
        java.lang.String str15 = dateTimeZone1.getShortName((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
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
        long long19 = dateTimeZone1.convertLocalToUTC((-115260064L), false, 25199902L);
        boolean boolean20 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:10" + "'", str8, "+32:10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:10" + "'", str12, "+32:10");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115800000L + "'", long15 == 115800000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-231060064L) + "'", long19 == (-231060064L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
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
        long long22 = dateTimeZone3.adjustOffset((-1570156924001L), true);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone3.isLocalDateTimeGap(localDateTime23);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone3.getName((-1570128664000L), locale26);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115800000 + "'", int7 == 115800000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:10" + "'", str12, "+32:10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:10" + "'", str14, "+32:10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:10" + "'", str15, "+32:10");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:10" + "'", str19, "+32:10");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1570156924001L) + "'", long22 == (-1570156924001L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:10" + "'", str27, "+32:10");
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(3660000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.lang.String str7 = dateTimeZone1.getName((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str12 = dateTimeZone11.getID();
        long long14 = dateTimeZone11.previousTransition((-1L));
        long long18 = dateTimeZone11.convertLocalToUTC(25200000L, true, 100L);
        long long20 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, 100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str25 = dateTimeZone23.getNameKey((long) 115800000);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone23.getShortName((-1570084924001L), locale27);
        long long30 = dateTimeZone23.nextTransition(98L);
        long long32 = dateTimeZone9.getMillisKeepLocal(dateTimeZone23, 99L);
        java.lang.Object obj33 = dateTimeZone9.writeReplace();
        java.lang.String str34 = dateTimeZone9.getID();
        java.lang.String str35 = dateTimeZone9.toString();
        java.util.TimeZone timeZone36 = dateTimeZone9.toTimeZone();
        long long38 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (-32340000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:10" + "'", str7, "+32:10");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:10" + "'", str12, "+32:10");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-90600000L) + "'", long18 == (-90600000L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-115799899L) + "'", long20 == (-115799899L));
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 98L + "'", long30 == 98L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 101L + "'", long32 == 101L);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.001" + "'", str34, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.001" + "'", str35, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 83459999L + "'", long38 == 83459999L);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
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
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone3.isLocalDateTimeGap(localDateTime14);
        java.lang.Object obj16 = dateTimeZone3.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        long long24 = dateTimeZone22.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone22.getOffset(readableInstant25);
        java.lang.Object obj27 = dateTimeZone22.writeReplace();
        int int29 = dateTimeZone22.getOffset((long) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        java.lang.String str32 = dateTimeZone22.getNameKey(101L);
        java.lang.Object obj33 = dateTimeZone22.writeReplace();
        boolean boolean34 = dateTimeZone19.equals(obj33);
        long long36 = dateTimeZone3.getMillisKeepLocal(dateTimeZone19, 53520001L);
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone3.getShortName((-1570084924097L), locale38);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 115800000 + "'", int26 == 115800000);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 115800000 + "'", int29 == 115800000);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-62279998L) + "'", long36 == (-62279998L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.001" + "'", str39, "+00:00:00.001");
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        long long3 = dateTimeZone1.previousTransition(115800002L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-25740001L), locale5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long9 = dateTimeZone1.nextTransition((-25200098L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115800002L + "'", long3 == 115800002L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+100:00" + "'", str6, "+100:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-25200098L) + "'", long9 == (-25200098L));
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
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
        long long23 = dateTimeZone1.adjustOffset(0L, false);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone1.getShortName(35999800L, locale25);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+100:00" + "'", str2, "+100:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 360000000 + "'", int8 == 360000000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+100:00" + "'", str9, "+100:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 360000000 + "'", int11 == 360000000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+100:00" + "'", str20, "+100:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+100:00" + "'", str26, "+100:00");
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str19 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+100:00" + "'", str8, "+100:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+100:00" + "'", str12, "+100:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 360000000L + "'", long15 == 360000000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+100:00" + "'", str17, "+100:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+100:00" + "'", str19, "+100:00");
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (short) 0, true);
        long long7 = dateTimeZone1.nextTransition(1L);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        java.lang.String str9 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((-25200001L));
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((-36000001L));
        long long7 = dateTimeZone0.previousTransition(54L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 54L + "'", long7 == 54L);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(349260000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getName((-323999999L));
        java.lang.String str5 = dateTimeZone1.getShortName(360600002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:52" + "'", str3, "+10:52");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:52" + "'", str5, "+10:52");
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) '4');
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(35999900L, locale4);
        long long8 = dateTimeZone2.convertLocalToUTC(94L, false);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, (long) 'a');
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone10.getName((long) (short) 1, locale16);
        int int19 = dateTimeZone10.getOffset((long) 1);
        boolean boolean20 = dateTimeZone10.isFixed();
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone10.isLocalDateTimeGap(localDateTime21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        long long25 = dateTimeZone10.getMillisKeepLocal(dateTimeZone23, 0L);
        boolean boolean26 = dateTimeZone2.equals((java.lang.Object) long25);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+35:52" + "'", str5, "+35:52");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-129119906L) + "'", long8 == (-129119906L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:52" + "'", str17, "+10:52");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 39120000 + "'", int19 == 39120000);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
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
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone10.getOffset(readableInstant21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 39120000 + "'", int7 == 39120000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:52");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:52" + "'", str12, "+10:52");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 39120000 + "'", int15 == 39120000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:52" + "'", str16, "+10:52");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+10:52");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 39120000 + "'", int22 == 39120000);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
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
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone18.isLocalDateTimeGap(localDateTime24);
        int int27 = dateTimeZone18.getOffsetFromLocal(119399997L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 39120000 + "'", int7 == 39120000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:52");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+10:52");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 39120000 + "'", int13 == 39120000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:52" + "'", str14, "+10:52");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570045804000L) + "'", long16 == (-1570045804000L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 39120011L + "'", long20 == 39120011L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        boolean boolean9 = dateTimeZone1.isStandardOffset(115800002L);
        long long11 = dateTimeZone1.previousTransition(112139999L);
        long long15 = dateTimeZone1.convertLocalToUTC((-1570120923999L), true, 200L);
        long long19 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false, (-68L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 112139999L + "'", long11 == 112139999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570120923998L) + "'", long15 == (-1570120923998L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1570084924000L) + "'", long19 == (-1570084924000L));
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        long long8 = dateTimeZone1.adjustOffset(0L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36000000 + "'", int3 == 36000000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long10 = dateTimeZone1.convertUTCToLocal(25200000L);
        java.lang.String str11 = dateTimeZone1.getID();
        long long15 = dateTimeZone1.convertLocalToUTC((-1570012924001L), true, (-25200001L));
        boolean boolean17 = dateTimeZone1.isStandardOffset((-90600010L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199999L + "'", long10 == 25199999L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570012924000L) + "'", long15 == (-1570012924000L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        boolean boolean7 = dateTimeZone1.isFixed();
        java.lang.String str9 = dateTimeZone1.getShortName(115800000L);
        java.lang.String str11 = dateTimeZone1.getName((-115799990L));
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        int int14 = dateTimeZone1.getOffsetFromLocal((-1570086424000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 1, false, 97L);
        int int7 = dateTimeZone1.getOffset((long) 10);
        int int9 = dateTimeZone1.getOffsetFromLocal((-1569969124103L));
        java.lang.String str11 = dateTimeZone1.getNameKey((-10800047L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
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
        int int20 = dateTimeZone1.getOffset(382319968L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570084924099L) + "'", long12 == (-1570084924099L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570156924000L) + "'", long18 == (-1570156924000L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
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
        int int21 = dateTimeZone3.getStandardOffset(36000002L);
        java.util.TimeZone timeZone22 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.lang.String str25 = dateTimeZone3.getShortName((-59991L));
        boolean boolean27 = dateTimeZone3.isStandardOffset((-1569969184045L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 36000001L + "'", long19 == 36000001L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
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
        int int24 = dateTimeZone1.getOffset((-1570200724049L));
        int int26 = dateTimeZone1.getStandardOffset((-59939L));
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
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
        long long55 = dateTimeZone1.convertLocalToUTC((long) '#', false, 0L);
        boolean boolean57 = dateTimeZone1.isStandardOffset((-101L));
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
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 36L + "'", long55 == 36L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
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
        int int23 = dateTimeZone1.getOffsetFromLocal(2099910L);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
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
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        long long18 = dateTimeZone3.getMillisKeepLocal(dateTimeZone16, 100L);
        int int20 = dateTimeZone3.getStandardOffset(59909L);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        int int24 = dateTimeZone22.getOffset(79260100L);
        java.lang.String str25 = dateTimeZone22.toString();
        long long27 = dateTimeZone22.convertUTCToLocal(89519999L);
        java.lang.Object obj28 = dateTimeZone22.writeReplace();
        boolean boolean29 = dateTimeZone3.equals((java.lang.Object) dateTimeZone22);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone22.getName(93179902L, locale31);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.052" + "'", str25, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 89520051L + "'", long27 == 89520051L);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.052" + "'", str32, "+00:00:00.052");
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((-1570084924200L), locale8);
        int int11 = dateTimeZone1.getStandardOffset(112139999L);
        long long14 = dateTimeZone1.adjustOffset((-1570164724101L), false);
        long long18 = dateTimeZone1.convertLocalToUTC((-126600000L), false, 2100001L);
        int int20 = dateTimeZone1.getStandardOffset(360600002L);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        long long26 = dateTimeZone22.getMillisKeepLocal(dateTimeZone24, (long) 'a');
        int int28 = dateTimeZone24.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone29 = dateTimeZone24.toTimeZone();
        java.util.TimeZone timeZone30 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        long long33 = dateTimeZone31.convertUTCToLocal((long) 36000000);
        long long36 = dateTimeZone31.adjustOffset((long) 35, false);
        long long39 = dateTimeZone31.convertLocalToUTC(36000011L, true);
        java.lang.String str40 = dateTimeZone31.getID();
        java.lang.String str41 = dateTimeZone31.getID();
        java.lang.String str43 = dateTimeZone31.getNameKey(36000099L);
        long long45 = dateTimeZone1.getMillisKeepLocal(dateTimeZone31, 36000101L);
        java.util.Locale locale47 = null;
        java.lang.String str48 = dateTimeZone31.getShortName(0L, locale47);
        org.joda.time.LocalDateTime localDateTime49 = null;
        boolean boolean50 = dateTimeZone31.isLocalDateTimeGap(localDateTime49);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1570164724101L) + "'", long14 == (-1570164724101L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-126599999L) + "'", long18 == (-126599999L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 36000000L + "'", long33 == 36000000L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 35L + "'", long36 == 35L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 36000011L + "'", long39 == 36000011L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UTC" + "'", str40, "UTC");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTC" + "'", str41, "UTC");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTC" + "'", str43, "UTC");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 36000100L + "'", long45 == 36000100L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00" + "'", str48, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        int int9 = dateTimeZone1.getOffset((-1570048923950L));
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
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone11.getShortName(0L, locale38);
        long long42 = dateTimeZone11.adjustOffset(25140002L, true);
        boolean boolean43 = dateTimeZone1.equals((java.lang.Object) long42);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1570084924000L) + "'", long36 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-00:00:00.001" + "'", str39, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 25140002L + "'", long42 == 25140002L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        int int5 = dateTimeZone1.getOffsetFromLocal((-35939934L));
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName(115260051L, locale7);
        java.lang.String str9 = dateTimeZone1.getID();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(79800000L, locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        java.lang.String str10 = dateTimeZone1.getName((long) '#');
        java.lang.String str11 = dateTimeZone1.getID();
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        java.lang.String str13 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115800000);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        java.lang.String str5 = dateTimeZone1.getName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:10" + "'", str5, "+32:10");
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115800000);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long5 = dateTimeZone1.convertUTCToLocal((long) 'a');
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 96L + "'", long5 == 96L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084923900L));
        boolean boolean7 = dateTimeZone1.isFixed();
        long long11 = dateTimeZone1.convertLocalToUTC((-115800098L), false, 0L);
        int int13 = dateTimeZone1.getOffset((long) '4');
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str16 = dateTimeZone15.getID();
        java.lang.String str17 = dateTimeZone15.toString();
        long long21 = dateTimeZone15.convertLocalToUTC((-59904L), false, 89520002L);
        boolean boolean22 = dateTimeZone15.isFixed();
        long long26 = dateTimeZone15.convertLocalToUTC((-25200001L), true, 115800004L);
        long long28 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, (-362100000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115800097L) + "'", long11 == (-115800097L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-59903L) + "'", long21 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-25200000L) + "'", long26 == (-25200000L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-362100000L) + "'", long28 == (-362100000L));
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 10);
        long long6 = dateTimeZone2.convertLocalToUTC((-1569969664099L), true, 101L);
        int int8 = dateTimeZone2.getOffsetFromLocal((-1570084924101L));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        boolean boolean12 = dateTimeZone2.equals((java.lang.Object) timeZone11);
        boolean boolean13 = dateTimeZone2.isFixed();
        int int15 = dateTimeZone2.getOffsetFromLocal((-111120000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1570085464099L) + "'", long6 == (-1570085464099L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115800000 + "'", int8 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115800000 + "'", int15 == 115800000);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        boolean boolean6 = dateTimeZone1.isStandardOffset((-35999899L));
        boolean boolean7 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 360000000 + "'", int4 == 360000000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        long long6 = dateTimeZone1.previousTransition((long) 363120000);
        int int8 = dateTimeZone1.getOffset(25199998L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int13 = dateTimeZone11.getStandardOffset((long) 10);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        long long19 = dateTimeZone15.getMillisKeepLocal(dateTimeZone17, (long) 'a');
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone15.getName((long) (short) 1, locale21);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        boolean boolean24 = dateTimeZone11.equals((java.lang.Object) dateTimeZone15);
        long long27 = dateTimeZone15.adjustOffset((long) (short) -1, false);
        int int29 = dateTimeZone15.getOffsetFromLocal((-115799999L));
        java.lang.String str31 = dateTimeZone15.getShortName(99L);
        long long33 = dateTimeZone15.convertUTCToLocal(95L);
        long long35 = dateTimeZone15.previousTransition((-3660000L));
        boolean boolean37 = dateTimeZone15.isStandardOffset(54600001L);
        boolean boolean38 = dateTimeZone1.equals((java.lang.Object) 54600001L);
        java.lang.String str40 = dateTimeZone1.getNameKey(115800197L);
        long long42 = dateTimeZone1.nextTransition(23100000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 363120000L + "'", long6 == 363120000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115800000 + "'", int13 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-00:00:00.001" + "'", str31, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 94L + "'", long33 == 94L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-3660000L) + "'", long35 == (-3660000L));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 23100000L + "'", long42 == 23100000L);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        java.lang.String str8 = dateTimeZone1.getShortName(25200052L);
        long long11 = dateTimeZone1.adjustOffset(0L, false);
        java.lang.String str12 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 1, false, 97L);
        int int7 = dateTimeZone1.getOffset((long) 10);
        int int9 = dateTimeZone1.getOffsetFromLocal((-1569969124103L));
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((-187200099L), locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
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
        java.lang.Object obj24 = dateTimeZone3.writeReplace();
        int int26 = dateTimeZone3.getStandardOffset(0L);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570200724102L) + "'", long20 == (-1570200724102L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
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
        java.lang.String str49 = dateTimeZone34.toString();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone52 = dateTimeZone51.toTimeZone();
        long long54 = dateTimeZone51.nextTransition((-99L));
        boolean boolean55 = dateTimeZone51.isFixed();
        java.util.Locale locale57 = null;
        java.lang.String str58 = dateTimeZone51.getName(115859999L, locale57);
        long long60 = dateTimeZone34.getMillisKeepLocal(dateTimeZone51, 231480036L);
        long long64 = dateTimeZone34.convertLocalToUTC((-151799904L), false, (-115800090L));
        java.util.Locale locale66 = null;
        java.lang.String str67 = dateTimeZone34.getName((-35999906L), locale66);
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
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 115800000 + "'", int32 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 97L + "'", long38 == 97L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-00:00:00.001" + "'", str41, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "-00:00:00.001" + "'", str49, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-99L) + "'", long54 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+00:00:00.001" + "'", str58, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 231480034L + "'", long60 == 231480034L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-151799903L) + "'", long64 == (-151799903L));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "-00:00:00.001" + "'", str67, "-00:00:00.001");
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        long long11 = dateTimeZone9.nextTransition((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long16 = dateTimeZone13.convertLocalToUTC((-1570084924001L), false);
        int int18 = dateTimeZone13.getOffsetFromLocal((-1570084924000L));
        java.lang.String str20 = dateTimeZone13.getShortName((long) (short) 1);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        long long24 = dateTimeZone22.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone22.getOffset(readableInstant25);
        java.lang.Object obj27 = dateTimeZone22.writeReplace();
        java.lang.Object obj28 = dateTimeZone22.writeReplace();
        boolean boolean29 = dateTimeZone22.isFixed();
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        long long33 = dateTimeZone31.nextTransition((long) (short) 100);
        java.lang.String str35 = dateTimeZone31.getNameKey(1L);
        long long37 = dateTimeZone22.getMillisKeepLocal(dateTimeZone31, (-25200001L));
        long long39 = dateTimeZone13.getMillisKeepLocal(dateTimeZone22, (long) 'a');
        long long41 = dateTimeZone22.nextTransition((-115800099L));
        long long44 = dateTimeZone22.convertLocalToUTC((-115800000L), true);
        boolean boolean45 = dateTimeZone9.equals((java.lang.Object) long44);
        long long49 = dateTimeZone9.convertLocalToUTC(115259898L, true, (-79799989L));
        long long51 = dateTimeZone9.convertUTCToLocal((-115259991L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570084924000L) + "'", long16 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-25200001L) + "'", long37 == (-25200001L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 97L + "'", long39 == 97L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-115800099L) + "'", long41 == (-115800099L));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-115799999L) + "'", long44 == (-115799999L));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 115259898L + "'", long49 == 115259898L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-115259991L) + "'", long51 == (-115259991L));
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        int int10 = dateTimeZone1.getStandardOffset(36000001L);
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
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
        int int15 = dateTimeZone1.getStandardOffset(39600095L);
        long long17 = dateTimeZone1.nextTransition((-79800068L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-79800068L) + "'", long17 == (-79800068L));
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
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
        boolean boolean32 = dateTimeZone3.isStandardOffset((-1570084924100L));
        long long36 = dateTimeZone3.convertLocalToUTC(12L, false, (long) 36000000);
        long long40 = dateTimeZone3.convertLocalToUTC((-1570081264200L), false, 0L);
        int int42 = dateTimeZone3.getOffset((-1570164664001L));
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-115799999L) + "'", long26 == (-115799999L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-00:00:00.001" + "'", str30, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 13L + "'", long36 == 13L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1570081264199L) + "'", long40 == (-1570081264199L));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
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
        int int22 = dateTimeZone3.getOffset(readableInstant21);
        java.lang.String str23 = dateTimeZone3.getID();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570084924001L) + "'", long16 == (-1570084924001L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
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
        java.lang.Object obj30 = null;
        boolean boolean31 = dateTimeZone11.equals(obj30);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        long long12 = dateTimeZone1.nextTransition((-1570084924100L));
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        long long17 = dateTimeZone1.adjustOffset(0L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570084924100L) + "'", long12 == (-1570084924100L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
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
        java.lang.String str28 = dateTimeZone3.getShortName(187200011L);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-115799999L) + "'", long26 == (-115799999L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        java.lang.String str9 = dateTimeZone1.getID();
        java.lang.String str11 = dateTimeZone1.getName(39600101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25200001L + "'", long8 == 25200001L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        java.lang.String str10 = dateTimeZone1.getName((-25200001L));
        long long13 = dateTimeZone1.adjustOffset((long) 25200000, true);
        long long15 = dateTimeZone1.convertUTCToLocal((-1570120924200L));
        long long18 = dateTimeZone1.adjustOffset((-1569861724097L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 25200000L + "'", long13 == 25200000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570120924201L) + "'", long15 == (-1570120924201L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1569861724097L) + "'", long18 == (-1569861724097L));
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) '#');
        java.lang.String str4 = dateTimeZone2.getShortName(3660101L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName(115740000L, locale6);
        java.lang.String str9 = dateTimeZone2.getNameKey((-1570084984045L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:35" + "'", str4, "+100:35");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:35" + "'", str7, "+100:35");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
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
        int int37 = dateTimeZone2.getStandardOffset(4200000L);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 115800000 + "'", int37 == 115800000);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        boolean boolean7 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        int int10 = dateTimeZone1.getOffsetFromLocal((-115259899L));
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (-119460000L));
        java.lang.Object obj14 = null;
        boolean boolean15 = dateTimeZone1.equals(obj14);
        int int17 = dateTimeZone1.getOffset((-206460000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-119460000L) + "'", long13 == (-119460000L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.lang.String str7 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getID();
        int int10 = dateTimeZone1.getStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj13 = dateTimeZone12.writeReplace();
        boolean boolean14 = dateTimeZone12.isFixed();
        long long18 = dateTimeZone12.convertLocalToUTC(25140000L, true, 34L);
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 3L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone23.isLocalDateTimeGap(localDateTime24);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone23.getName((-1570120924201L), locale27);
        long long30 = dateTimeZone12.getMillisKeepLocal(dateTimeZone23, (-3660001L));
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = dateTimeZone12.isLocalDateTimeGap(localDateTime31);
        boolean boolean33 = dateTimeZone12.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25139999L + "'", long18 == 25139999L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:01" + "'", str28, "+32:01");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-118920000L) + "'", long30 == (-118920000L));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        java.lang.String str8 = dateTimeZone1.getName((-1570084924101L));
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        int int12 = dateTimeZone10.getOffsetFromLocal(360600000L);
        long long16 = dateTimeZone10.convertLocalToUTC((-1570156924101L), true, 0L);
        boolean boolean17 = dateTimeZone10.isFixed();
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        long long23 = dateTimeZone19.getMillisKeepLocal(dateTimeZone21, (long) 'a');
        int int25 = dateTimeZone21.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone26 = dateTimeZone21.toTimeZone();
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone21.getShortName((long) (byte) 100, locale28);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone21.getShortName((long) (short) 0, locale31);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone21.getName((long) (short) 100, locale34);
        java.lang.String str37 = dateTimeZone21.getName((long) (-1));
        org.joda.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = dateTimeZone21.isLocalDateTimeGap(localDateTime38);
        boolean boolean40 = dateTimeZone10.equals((java.lang.Object) dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570156924101L) + "'", long16 == (-1570156924101L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-00:00:00.001" + "'", str29, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-00:00:00.001" + "'", str35, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-00:00:00.001" + "'", str37, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
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
        boolean boolean23 = dateTimeZone5.isStandardOffset((-1570052524098L));
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-126599966L) + "'", long21 == (-126599966L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
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
        boolean boolean32 = dateTimeZone3.isStandardOffset((-1570084924100L));
        java.lang.String str33 = dateTimeZone3.getID();
        int int35 = dateTimeZone3.getOffsetFromLocal(115799948L);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-115799999L) + "'", long26 == (-115799999L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-00:00:00.001" + "'", str30, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-00:00:00.001" + "'", str33, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
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
        java.lang.String str16 = dateTimeZone1.getShortName(23099951L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35999978L + "'", long14 == 35999978L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360000000);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 115799900L);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isStandardOffset(3660200L);
        long long11 = dateTimeZone1.adjustOffset(115799901L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 479399900L + "'", long5 == 479399900L);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115799901L + "'", long11 == 115799901L);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long8 = dateTimeZone1.previousTransition((long) (byte) 1);
        java.lang.String str10 = dateTimeZone1.getName(0L);
        int int12 = dateTimeZone1.getStandardOffset((-205860002L));
        java.lang.String str14 = dateTimeZone1.getNameKey(2100001L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getShortName((-1570084923902L), locale16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        boolean boolean7 = dateTimeZone1.isFixed();
        long long10 = dateTimeZone1.adjustOffset(90059898L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 90059898L + "'", long10 == 90059898L);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
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
        long long24 = dateTimeZone3.convertUTCToLocal((-66L));
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-67L) + "'", long24 == (-67L));
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        long long5 = dateTimeZone2.adjustOffset(103L, true);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-35999990L));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone2.isLocalDateTimeGap(localDateTime8);
        java.lang.String str11 = dateTimeZone2.getShortName(115260000L);
        long long13 = dateTimeZone2.nextTransition(187259999L);
        int int15 = dateTimeZone2.getStandardOffset((-79799989L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 103L + "'", long5 == 103L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:35" + "'", str11, "+00:35");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 187259999L + "'", long13 == 187259999L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2100000 + "'", int15 == 2100000);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
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
        long long55 = dateTimeZone1.convertLocalToUTC((long) '#', false, 0L);
        java.lang.String str57 = dateTimeZone1.getNameKey(3600053L);
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
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 36L + "'", long55 == 36L);
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360600000);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 52);
        long long7 = dateTimeZone1.convertLocalToUTC((long) 25200000, true, (-1570012924001L));
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.getID();
        long long12 = dateTimeZone9.previousTransition((-1L));
        boolean boolean14 = dateTimeZone9.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone9.getShortName((-1570084924200L), locale16);
        int int19 = dateTimeZone9.getStandardOffset(112139999L);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone9.getOffset(readableInstant20);
        java.lang.Object obj22 = dateTimeZone9.writeReplace();
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (-115799900L));
        int int26 = dateTimeZone1.getStandardOffset(115320085L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-335400000L) + "'", long7 == (-335400000L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 244800101L + "'", long24 == 244800101L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 360600000 + "'", int26 == 360600000);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long6 = dateTimeZone3.convertLocalToUTC((long) 1, true);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 32L);
        long long10 = dateTimeZone3.convertUTCToLocal((-206399999L));
        java.lang.String str11 = dateTimeZone3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-99L) + "'", long6 == (-99L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35999932L + "'", long8 == 35999932L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-206399899L) + "'", long10 == (-206399899L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
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
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        long long28 = dateTimeZone26.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone26.getOffset(readableInstant29);
        java.lang.Object obj31 = dateTimeZone26.writeReplace();
        int int33 = dateTimeZone26.getOffset((long) 1);
        java.lang.String str34 = dateTimeZone26.toString();
        org.joda.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = dateTimeZone26.isLocalDateTimeGap(localDateTime35);
        long long39 = dateTimeZone26.adjustOffset((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = dateTimeZone26.isLocalDateTimeGap(localDateTime41);
        java.util.TimeZone timeZone43 = dateTimeZone26.toTimeZone();
        boolean boolean44 = dateTimeZone1.equals((java.lang.Object) timeZone43);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        java.lang.String str46 = dateTimeZone45.toString();
        long long49 = dateTimeZone45.adjustOffset(0L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2L) + "'", long14 == (-2L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-00:00:00.001" + "'", str34, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UTC" + "'", str46, "UTC");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getStandardOffset((-1570470124037L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
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
        int int23 = dateTimeZone1.getOffsetFromLocal((-61199999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999901L) + "'", long14 == (-35999901L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
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
        long long25 = dateTimeZone13.convertLocalToUTC((-421800000L), false, (-1570200184002L));
        boolean boolean26 = dateTimeZone13.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-99L) + "'", long16 == (-99L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-421800100L) + "'", long25 == (-421800100L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
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
        long long22 = dateTimeZone1.adjustOffset((-35999848L), false);
        boolean boolean24 = dateTimeZone1.isStandardOffset((-151199905L));
        long long27 = dateTimeZone1.adjustOffset(346319967L, true);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-35999848L) + "'", long22 == (-35999848L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 346319967L + "'", long27 == 346319967L);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
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
        java.lang.Object obj21 = dateTimeZone3.writeReplace();
        int int23 = dateTimeZone3.getOffsetFromLocal((-206399899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 98L + "'", long17 == 98L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360600000);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 52);
        long long7 = dateTimeZone1.convertLocalToUTC((long) 25200000, true, (-1570012924001L));
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.getID();
        long long12 = dateTimeZone9.previousTransition((-1L));
        boolean boolean14 = dateTimeZone9.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone9.getShortName((-1570084924200L), locale16);
        int int19 = dateTimeZone9.getStandardOffset(112139999L);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone9.getOffset(readableInstant20);
        java.lang.Object obj22 = dateTimeZone9.writeReplace();
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (-115799900L));
        long long26 = dateTimeZone9.convertUTCToLocal(34L);
        long long30 = dateTimeZone9.convertLocalToUTC((-1570081264199L), false, (long) 187200000);
        long long33 = dateTimeZone9.convertLocalToUTC(41100096L, false);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        java.lang.String str36 = dateTimeZone35.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone35);
        java.lang.String str38 = dateTimeZone35.getID();
        int int40 = dateTimeZone35.getOffsetFromLocal((long) (byte) 100);
        java.util.TimeZone timeZone41 = dateTimeZone35.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        java.util.TimeZone timeZone43 = dateTimeZone42.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        int int47 = dateTimeZone45.getOffset(244200047L);
        java.util.Locale locale49 = null;
        java.lang.String str50 = dateTimeZone45.getName((long) 3660000, locale49);
        long long52 = dateTimeZone9.getMillisKeepLocal(dateTimeZone45, (-2099903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-335400000L) + "'", long7 == (-335400000L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 244800000L + "'", long24 == 244800000L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 134L + "'", long26 == 134L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1570081264299L) + "'", long30 == (-1570081264299L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 41099996L + "'", long33 == 41099996L);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.100" + "'", str36, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.100" + "'", str38, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00" + "'", str50, "+00:00");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-2099803L) + "'", long52 == (-2099803L));
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
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
        java.lang.String str23 = dateTimeZone3.getShortName((-39659899L));
        boolean boolean25 = dateTimeZone3.isStandardOffset(39600000L);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(360000000);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long31 = dateTimeZone27.getMillisKeepLocal(dateTimeZone29, 115799900L);
        java.lang.Object obj32 = dateTimeZone27.writeReplace();
        long long34 = dateTimeZone27.nextTransition((long) (short) 10);
        long long36 = dateTimeZone3.getMillisKeepLocal(dateTimeZone27, 115739999L);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long40 = dateTimeZone38.convertUTCToLocal((-1569969184145L));
        long long42 = dateTimeZone27.getMillisKeepLocal(dateTimeZone38, (-101L));
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 479399900L + "'", long31 == 479399900L);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-244259901L) + "'", long36 == (-244259901L));
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1569969184045L) + "'", long40 == (-1569969184045L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 359999799L + "'", long42 == 359999799L);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
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
        java.lang.String str12 = dateTimeZone9.getID();
        int int14 = dateTimeZone9.getOffsetFromLocal((-187199999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 36000000L + "'", long11 == 36000000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
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
        java.lang.String str39 = dateTimeZone1.getName((-25200000L));
        long long42 = dateTimeZone1.adjustOffset((-1570120924113L), false);
        java.util.TimeZone timeZone43 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-90600100L) + "'", long31 == (-90600100L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 36000032L + "'", long34 == 36000032L);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 4140000L + "'", long37 == 4140000L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.100" + "'", str39, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1570120924113L) + "'", long42 == (-1570120924113L));
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
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
        java.lang.String str15 = dateTimeZone1.getName(0L);
        int int17 = dateTimeZone1.getStandardOffset((-90599901L));
        java.lang.Object obj18 = dateTimeZone1.writeReplace();
        long long20 = dateTimeZone1.previousTransition(151199910L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924099L) + "'", long10 == (-1570084924099L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 151199910L + "'", long20 == 151199910L);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset(0L);
        int int7 = dateTimeZone1.getStandardOffset((-1570084924201L));
        boolean boolean9 = dateTimeZone1.isStandardOffset(99L);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        java.lang.String str13 = dateTimeZone1.getName(25200000L);
        long long15 = dateTimeZone1.nextTransition(119400000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 119400000L + "'", long15 == 119400000L);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
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
        long long42 = dateTimeZone8.convertLocalToUTC((-1570084864046L), false, 79260052L);
        java.util.TimeZone timeZone43 = dateTimeZone8.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115800000 + "'", int6 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-100L) + "'", long23 == (-100L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1570048923900L) + "'", long28 == (-1570048923900L));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1570120924201L) + "'", long33 == (-1570120924201L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 115800002L + "'", long36 == 115800002L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.100" + "'", str38, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1570084864146L) + "'", long42 == (-1570084864146L));
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (short) 0, true);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.String str10 = dateTimeZone1.getNameKey((-3660001L));
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName((-1570084924011L), locale12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
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
        int int23 = dateTimeZone1.getStandardOffset((-1570051024002L));
        long long27 = dateTimeZone1.convertLocalToUTC(360660000L, false, (-1570084923903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35999931L + "'", long21 == 35999931L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 360659900L + "'", long27 == 360659900L);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
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
        java.lang.String str18 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int23 = dateTimeZone21.getStandardOffset((long) 10);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        long long29 = dateTimeZone25.getMillisKeepLocal(dateTimeZone27, (long) 'a');
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone25.getName((long) (short) 1, locale31);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        boolean boolean34 = dateTimeZone21.equals((java.lang.Object) dateTimeZone25);
        long long37 = dateTimeZone25.adjustOffset((long) (short) -1, false);
        int int39 = dateTimeZone25.getOffsetFromLocal((-115799999L));
        java.lang.String str41 = dateTimeZone25.getShortName(99L);
        long long43 = dateTimeZone25.convertUTCToLocal(95L);
        long long45 = dateTimeZone25.convertUTCToLocal((-1570120924112L));
        long long47 = dateTimeZone1.getMillisKeepLocal(dateTimeZone25, (-1570434124100L));
        java.util.Locale locale49 = null;
        java.lang.String str50 = dateTimeZone25.getName((-71999848L), locale49);
        java.lang.Object obj51 = dateTimeZone25.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 103L + "'", long12 == 103L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115800000 + "'", int23 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.100" + "'", str32, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.100" + "'", str41, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 195L + "'", long43 == 195L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1570120924012L) + "'", long45 == (-1570120924012L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1570434124201L) + "'", long47 == (-1570434124201L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00:00.100" + "'", str50, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj51);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
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
        long long22 = dateTimeZone3.adjustOffset((-1570156924001L), true);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone3.isLocalDateTimeGap(localDateTime23);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.lang.String str27 = dateTimeZone26.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        boolean boolean29 = dateTimeZone26.isFixed();
        int int31 = dateTimeZone26.getStandardOffset((-36059848L));
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = dateTimeZone26.getOffset(readableInstant32);
        java.lang.String str35 = dateTimeZone26.getShortName((-360540000L));
        long long37 = dateTimeZone3.getMillisKeepLocal(dateTimeZone26, 187199900L);
        org.joda.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = dateTimeZone26.isLocalDateTimeGap(localDateTime38);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1570156924001L) + "'", long22 == (-1570156924001L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.100" + "'", str35, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 187199900L + "'", long37 == 187199900L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long10 = dateTimeZone1.convertLocalToUTC((-1L), false, (long) '#');
        java.lang.String str11 = dateTimeZone1.getID();
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((-206400000L), locale14);
        long long19 = dateTimeZone1.convertLocalToUTC((-25200000L), true, (-35999968L));
        long long22 = dateTimeZone1.convertLocalToUTC((-36059964L), false);
        int int24 = dateTimeZone1.getStandardOffset(115260032L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-25200001L) + "'", long19 == (-25200001L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-36059965L) + "'", long22 == (-36059965L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((-25200001L));
        java.lang.String str3 = dateTimeZone0.getID();
        java.util.TimeZone timeZone4 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
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
        boolean boolean17 = dateTimeZone1.isStandardOffset((-1570084924100L));
        java.util.TimeZone timeZone18 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone19 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-99L) + "'", long15 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        long long7 = dateTimeZone1.previousTransition(0L);
        long long9 = dateTimeZone1.previousTransition((-91L));
        int int11 = dateTimeZone1.getOffsetFromLocal(115800050L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-91L) + "'", long9 == (-91L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        long long23 = dateTimeZone3.convertLocalToUTC(35999900L, true, (-1570084924102L));
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200052L + "'", long16 == 25200052L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35999800L + "'", long23 == 35999800L);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 10);
        boolean boolean4 = dateTimeZone2.isStandardOffset(36000100L);
        int int6 = dateTimeZone2.getOffset(72000000L);
        long long8 = dateTimeZone2.nextTransition((-35939969L));
        java.lang.String str9 = dateTimeZone2.getID();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone2.getOffset(readableInstant10);
        long long13 = dateTimeZone2.previousTransition((-22620098L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 360600000 + "'", int6 == 360600000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-35939969L) + "'", long8 == (-35939969L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+100:10" + "'", str9, "+100:10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 360600000 + "'", int11 == 360600000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-22620098L) + "'", long13 == (-22620098L));
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        java.lang.String str8 = dateTimeZone1.getName((-1570084924101L));
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone1.convertUTCToLocal((-36059848L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-36059849L) + "'", long12 == (-36059849L));
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        long long9 = dateTimeZone1.adjustOffset(36000000L, false);
        java.lang.String str10 = dateTimeZone1.getID();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName(101L, locale12);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName((long) 0, locale15);
        java.lang.String str18 = dateTimeZone1.getName((-34440000L));
        int int20 = dateTimeZone1.getOffset((-1570120923901L));
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone1.getShortName((-115260005L), locale22);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 36000000L + "'", long9 == 36000000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        long long10 = dateTimeZone1.previousTransition((-1570084924099L));
        long long12 = dateTimeZone1.previousTransition((-36000001L));
        long long14 = dateTimeZone1.nextTransition((-1570084864046L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924099L) + "'", long10 == (-1570084924099L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-36000001L) + "'", long12 == (-36000001L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1570084864046L) + "'", long14 == (-1570084864046L));
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        long long6 = dateTimeZone4.nextTransition((long) (short) 100);
        long long9 = dateTimeZone4.convertLocalToUTC((long) (short) -1, false);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (-59905L));
        long long14 = dateTimeZone4.convertLocalToUTC((-115740000L), false);
        boolean boolean15 = dateTimeZone4.isFixed();
        java.lang.String str16 = dateTimeZone4.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-101L) + "'", long9 == (-101L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 125939995L + "'", long11 == 125939995L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115740100L) + "'", long14 == (-115740100L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        int int12 = dateTimeZone9.getStandardOffset((-223199902L));
        long long14 = dateTimeZone9.convertUTCToLocal(35939932L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35939932L + "'", long14 == 35939932L);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
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
        boolean boolean30 = dateTimeZone27.isFixed();
        long long33 = dateTimeZone27.convertLocalToUTC((-1570120924111L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-187140000L) + "'", long29 == (-187140000L));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1570308124111L) + "'", long33 == (-1570308124111L));
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        java.lang.String str11 = dateTimeZone1.toString();
        int int13 = dateTimeZone1.getOffset((-1570120924002L));
        java.lang.String str15 = dateTimeZone1.getNameKey((-1570120924100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        java.lang.String str8 = dateTimeZone1.getNameKey((-1570084924201L));
        long long10 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long12 = dateTimeZone1.previousTransition((long) 2100000);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((-115799999L), locale14);
        long long17 = dateTimeZone1.previousTransition(3660032L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2100000L + "'", long12 == 2100000L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3660032L + "'", long17 == 3660032L);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
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
        long long25 = dateTimeZone8.nextTransition(112L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1570084924100L) + "'", long14 == (-1570084924100L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1569688324001L) + "'", long19 == (-1569688324001L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1570120924202L) + "'", long22 == (-1570120924202L));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 112L + "'", long25 == 112L);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getOffsetFromLocal(60084L);
        java.lang.String str7 = dateTimeZone1.getName(4140001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
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
        long long18 = dateTimeZone1.nextTransition((-1570445524101L));
        java.lang.String str20 = dateTimeZone1.getNameKey((-35939899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570445524101L) + "'", long18 == (-1570445524101L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (short) 0, true);
        long long7 = dateTimeZone1.nextTransition(1L);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        java.lang.String str10 = dateTimeZone1.getNameKey(25200052L);
        long long12 = dateTimeZone1.previousTransition(125999956L);
        int int14 = dateTimeZone1.getStandardOffset((-115799951L));
        long long16 = dateTimeZone1.convertUTCToLocal((-1569684723999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 125999956L + "'", long12 == 125999956L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1569684723998L) + "'", long16 == (-1569684723998L));
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
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
        java.lang.String str14 = dateTimeZone12.getNameKey(360600100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
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
        long long18 = dateTimeZone1.convertLocalToUTC(35999932L, false);
        java.lang.Object obj19 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35999932L + "'", long18 == 35999932L);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
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
        long long15 = dateTimeZone1.previousTransition((-57600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11L + "'", long10 == 11L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-57600000L) + "'", long15 == (-57600000L));
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName((-1570012924051L), locale6);
        long long9 = dateTimeZone1.convertUTCToLocal((-107939902L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-107939903L) + "'", long9 == (-107939903L));
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
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
        java.lang.String str17 = dateTimeZone3.toString();
        long long20 = dateTimeZone3.adjustOffset((-26L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-26L) + "'", long20 == (-26L));
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
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
        long long17 = dateTimeZone5.adjustOffset((-1570549384100L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 231480036L + "'", long3 == 231480036L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570549384100L) + "'", long17 == (-1570549384100L));
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        long long12 = dateTimeZone1.previousTransition((-151799899L));
        java.lang.String str13 = dateTimeZone1.toString();
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-151799899L) + "'", long12 == (-151799899L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long10 = dateTimeZone1.convertLocalToUTC((-1L), false, (long) '#');
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        java.lang.Object obj13 = dateTimeZone1.writeReplace();
        java.lang.String str15 = dateTimeZone1.getName((-90059948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
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
        long long35 = dateTimeZone1.adjustOffset((-1570123024200L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2L) + "'", long14 == (-2L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 187200000L + "'", long27 == 187200000L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 115800000L + "'", long30 == 115800000L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1570123024200L) + "'", long35 == (-1570123024200L));
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
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
        long long15 = dateTimeZone1.nextTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924099L) + "'", long10 == (-1570084924099L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-36000001L) + "'", long12 == (-36000001L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
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
        long long17 = dateTimeZone1.previousTransition(79800002L);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone1.isLocalDateTimeGap(localDateTime18);
        long long22 = dateTimeZone1.convertLocalToUTC((long) (short) 10, false);
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone1.getOffset(readableInstant23);
        long long27 = dateTimeZone1.convertLocalToUTC(187260000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 79800002L + "'", long17 == 79800002L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 187260000L + "'", long27 == 187260000L);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
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
        java.util.TimeZone timeZone17 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone18.isLocalDateTimeGap(localDateTime19);
        long long24 = dateTimeZone18.convertLocalToUTC(25200002L, false, (-1570084923900L));
        long long28 = dateTimeZone18.convertLocalToUTC(187199901L, false, (-151200005L));
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        long long34 = dateTimeZone31.adjustOffset(103L, true);
        boolean boolean36 = dateTimeZone31.isStandardOffset((-35999990L));
        org.joda.time.LocalDateTime localDateTime37 = null;
        boolean boolean38 = dateTimeZone31.isLocalDateTimeGap(localDateTime37);
        java.lang.String str40 = dateTimeZone31.getShortName(115260000L);
        boolean boolean41 = dateTimeZone18.equals((java.lang.Object) str40);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570084924100L) + "'", long12 == (-1570084924100L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 25200002L + "'", long24 == 25200002L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 187199901L + "'", long28 == 187199901L);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 103L + "'", long34 == 103L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:35" + "'", str40, "+00:35");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
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
        long long18 = dateTimeZone1.convertLocalToUTC((-4L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-4L) + "'", long18 == (-4L));
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
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
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long27 = dateTimeZone24.adjustOffset((long) (short) 1, false);
        java.lang.String str29 = dateTimeZone24.getShortName(0L);
        long long33 = dateTimeZone24.convertLocalToUTC((-1L), false, (long) '#');
        java.lang.String str34 = dateTimeZone24.getID();
        java.lang.Object obj35 = dateTimeZone24.writeReplace();
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone24.getName((-206400000L), locale37);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone24.getShortName((-1569969664099L), locale40);
        java.lang.Object obj42 = dateTimeZone24.writeReplace();
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone24.getShortName(25139999L, locale44);
        java.lang.String str46 = dateTimeZone24.toString();
        long long48 = dateTimeZone3.getMillisKeepLocal(dateTimeZone24, 61139899L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 98L + "'", long17 == 98L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1570120864101L) + "'", long22 == (-1570120864101L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.001" + "'", str29, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-2L) + "'", long33 == (-2L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.001" + "'", str34, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.001" + "'", str38, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.001" + "'", str41, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00:00.001" + "'", str45, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.001" + "'", str46, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 61139898L + "'", long48 == 61139898L);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.previousTransition((long) (short) 1);
        java.lang.String str10 = dateTimeZone1.getNameKey((-99L));
        java.lang.String str12 = dateTimeZone1.getNameKey((-35939934L));
        long long15 = dateTimeZone1.adjustOffset(115800050L, false);
        long long18 = dateTimeZone1.adjustOffset((-93599901L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115800050L + "'", long15 == 115800050L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-93599901L) + "'", long18 == (-93599901L));
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
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
        java.lang.String str19 = dateTimeZone12.getNameKey(115800044L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999900L) + "'", long14 == (-35999900L));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115800000);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 1, locale3);
        long long8 = dateTimeZone1.convertLocalToUTC(302459967L, false, 0L);
        java.lang.String str9 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:10" + "'", str4, "+32:10");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 186659967L + "'", long8 == 186659967L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:10" + "'", str9, "+32:10");
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
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
        int int29 = dateTimeZone1.getStandardOffset(89519800L);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 52);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName(360600002L, locale6);
        java.lang.String str9 = dateTimeZone2.getShortName((-2099904L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:52" + "'", str7, "+100:52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+100:52" + "'", str9, "+100:52");
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
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
        java.lang.String str30 = dateTimeZone15.getShortName(36000097L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:52" + "'", str4, "+100:52");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-337920000L) + "'", long10 == (-337920000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-363119899L) + "'", long12 == (-363119899L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 98L + "'", long22 == 98L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 101L + "'", long24 == 101L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570012923999L) + "'", long26 == (-1570012923999L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-00:00:00.001" + "'", str30, "-00:00:00.001");
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        boolean boolean11 = dateTimeZone1.isFixed();
        int int13 = dateTimeZone1.getOffset(25199900L);
        java.lang.String str15 = dateTimeZone1.getNameKey((-3659998L));
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long20 = dateTimeZone17.adjustOffset((long) (short) 1, false);
        java.lang.String str22 = dateTimeZone17.getShortName(0L);
        long long26 = dateTimeZone17.convertLocalToUTC((-1L), false, (long) '#');
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long32 = dateTimeZone28.getMillisKeepLocal(dateTimeZone30, (long) 'a');
        int int34 = dateTimeZone30.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone35 = dateTimeZone30.toTimeZone();
        java.util.TimeZone timeZone36 = dateTimeZone30.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        long long39 = dateTimeZone37.convertUTCToLocal((long) 36000000);
        long long42 = dateTimeZone37.adjustOffset((long) 35, false);
        boolean boolean43 = dateTimeZone17.equals((java.lang.Object) dateTimeZone37);
        boolean boolean44 = dateTimeZone1.equals((java.lang.Object) dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-2L) + "'", long26 == (-2L));
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 36000000L + "'", long39 == 36000000L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 35L + "'", long42 == 35L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) '4');
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(35999900L, locale4);
        java.lang.String str6 = dateTimeZone2.getID();
        long long8 = dateTimeZone2.convertUTCToLocal((-115799901L));
        long long11 = dateTimeZone2.adjustOffset((-98280000L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+35:52" + "'", str5, "+35:52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+35:52" + "'", str6, "+35:52");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 13320099L + "'", long8 == 13320099L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-98280000L) + "'", long11 == (-98280000L));
    }
}
