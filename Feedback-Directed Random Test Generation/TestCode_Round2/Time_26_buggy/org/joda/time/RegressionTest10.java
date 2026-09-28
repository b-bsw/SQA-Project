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
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        long long3 = dateTimeZone1.convertUTCToLocal(25800010L);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        boolean boolean7 = dateTimeZone4.isFixed();
        long long9 = dateTimeZone4.nextTransition((long) 1);
        java.lang.String str10 = dateTimeZone4.getID();
        java.lang.String str11 = dateTimeZone4.toString();
        long long13 = dateTimeZone4.convertUTCToLocal(3540001L);
        int int15 = dateTimeZone4.getStandardOffset((long) (byte) 10);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) (byte) 10);
        java.lang.String str17 = dateTimeZone1.getID();
        int int19 = dateTimeZone1.getOffsetFromLocal((-3600000L));
        java.lang.String str21 = dateTimeZone1.getName(115199900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25800011L + "'", long3 == 25800011L);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3540001L + "'", long13 == 3540001L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.001" + "'", str21, "+00:00:00.001");
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        java.lang.String str11 = dateTimeZone1.getShortName((long) 10);
        int int13 = dateTimeZone1.getStandardOffset(7199998L);
        int int15 = dateTimeZone1.getStandardOffset(115260099L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getName((-359999903L), locale17);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky "1) test5002(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName((long) (byte) -1, locale9);
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (byte) 100);
        long long15 = dateTimeZone0.convertLocalToUTC((long) (byte) 1, false);
        boolean boolean16 = dateTimeZone0.isFixed();
        boolean boolean17 = dateTimeZone0.isFixed();
        long long19 = dateTimeZone0.previousTransition(387300010L);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone0.isLocalDateTimeGap(localDateTime20);
        java.lang.String str23 = dateTimeZone0.getNameKey((long) 362100000);
        long long26 = dateTimeZone0.convertLocalToUTC((long) 3600000, true);
        long long28 = dateTimeZone0.nextTransition(324059967L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 387300010L + "'", long19 == 387300010L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3600000L + "'", long26 == 3600000L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 324059967L + "'", long28 == 324059967L);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(1L);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) '4');
        boolean boolean9 = dateTimeZone1.isFixed();
        java.lang.String str10 = dateTimeZone1.toString();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str14 = dateTimeZone12.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider15 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider15);
        boolean boolean17 = dateTimeZone12.equals((java.lang.Object) nameProvider15);
        long long20 = dateTimeZone12.convertLocalToUTC((-1L), true);
        java.lang.String str21 = dateTimeZone12.getID();
        boolean boolean22 = dateTimeZone12.isFixed();
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone12.getName(1L, locale24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone12.getOffset(readableInstant26);
        long long30 = dateTimeZone12.convertLocalToUTC((long) (byte) 10, false);
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = dateTimeZone12.getOffset(readableInstant31);
        java.lang.String str33 = dateTimeZone12.toString();
        long long35 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 3600011L);
        java.lang.Object obj36 = null;
        boolean boolean37 = dateTimeZone1.equals(obj36);
        java.lang.String str38 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky "2) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(nameProvider15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "2) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
// flaky "2) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
// flaky "2) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "2) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
// flaky "2) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
// flaky "1) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
// flaky "1) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
// flaky "1) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
// flaky "1) test5004(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 3600012L + "'", long35 == 3600012L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.001" + "'", str38, "+00:00:00.001");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.String str8 = dateTimeZone7.toString();
        boolean boolean9 = dateTimeZone7.isFixed();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone7.getName(36600035L, locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25199999L + "'", long3 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getShortName(25200035L, locale9);
        java.lang.String str11 = dateTimeZone0.toString();
        long long14 = dateTimeZone0.convertLocalToUTC(115260100L, true);
        int int16 = dateTimeZone0.getOffsetFromLocal((long) '4');
        long long18 = dateTimeZone0.convertUTCToLocal((-125999903L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115260100L + "'", long14 == 115260100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-125999903L) + "'", long18 == (-125999903L));
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long4 = dateTimeZone2.nextTransition((long) ' ');
        long long6 = dateTimeZone2.nextTransition((-3600000L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology7 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3600000L) + "'", long6 == (-3600000L));
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getName(100L, locale11);
        long long15 = dateTimeZone0.convertLocalToUTC((long) (short) 10, false);
        java.util.TimeZone timeZone16 = dateTimeZone0.toTimeZone();
        long long18 = dateTimeZone0.nextTransition(100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone21.getOffset(readableInstant22);
        java.lang.String str25 = dateTimeZone21.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        long long29 = dateTimeZone26.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        long long32 = dateTimeZone30.previousTransition((long) ' ');
        java.lang.String str33 = dateTimeZone30.getID();
        java.lang.Object obj34 = dateTimeZone30.writeReplace();
        boolean boolean35 = dateTimeZone26.equals((java.lang.Object) dateTimeZone30);
        boolean boolean36 = dateTimeZone21.equals((java.lang.Object) dateTimeZone30);
        java.lang.String str37 = dateTimeZone21.getID();
        java.lang.String str39 = dateTimeZone21.getName((long) 600000);
        long long41 = dateTimeZone0.getMillisKeepLocal(dateTimeZone21, (-600000L));
        boolean boolean43 = dateTimeZone0.isStandardOffset((long) 60000);
        long long45 = dateTimeZone0.convertUTCToLocal(3540001L);
        long long48 = dateTimeZone0.convertLocalToUTC(659965L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00" + "'", str39, "+00:00");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-600000L) + "'", long41 == (-600000L));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 3540001L + "'", long45 == 3540001L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 659965L + "'", long48 == 659965L);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology3 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        java.lang.String str10 = dateTimeZone4.getID();
        java.lang.Object obj11 = dateTimeZone4.writeReplace();
        java.lang.String str13 = dateTimeZone4.getShortName((-25200001L));
        long long16 = dateTimeZone4.convertLocalToUTC(36000035L, false);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.lang.String str22 = dateTimeZone20.getNameKey(10L);
        long long24 = dateTimeZone18.getMillisKeepLocal(dateTimeZone20, (long) 1);
        java.lang.String str26 = dateTimeZone18.getName((long) 0);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone18.getName(25200035L, locale28);
        long long32 = dateTimeZone18.convertLocalToUTC(25200010L, true);
        int int34 = dateTimeZone18.getStandardOffset((-1L));
        int int36 = dateTimeZone18.getOffset((long) '4');
        int int38 = dateTimeZone18.getOffset((long) (short) 10);
        int int40 = dateTimeZone18.getStandardOffset(1L);
        java.lang.String str42 = dateTimeZone18.getName((long) 'a');
        java.util.TimeZone timeZone43 = dateTimeZone18.toTimeZone();
        long long45 = dateTimeZone4.getMillisKeepLocal(dateTimeZone18, (long) (byte) 10);
        java.util.TimeZone timeZone46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        java.lang.String str49 = dateTimeZone47.getNameKey(10L);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.UTC;
        long long52 = dateTimeZone50.previousTransition((long) ' ');
        java.lang.String str53 = dateTimeZone50.getID();
        java.lang.String str55 = dateTimeZone50.getShortName((long) (short) 0);
        long long58 = dateTimeZone50.convertLocalToUTC((long) (byte) 100, true);
        java.lang.Object obj59 = dateTimeZone50.writeReplace();
        boolean boolean60 = dateTimeZone47.equals((java.lang.Object) dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long64 = dateTimeZone47.getMillisKeepLocal(dateTimeZone62, 0L);
        java.util.TimeZone timeZone65 = dateTimeZone47.toTimeZone();
        java.lang.String str67 = dateTimeZone47.getShortName((long) 'a');
        java.util.TimeZone timeZone68 = dateTimeZone47.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forTimeZone(timeZone68);
        int int71 = dateTimeZone69.getOffsetFromLocal((-358560000L));
        boolean boolean72 = dateTimeZone4.equals((java.lang.Object) int71);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 36000035L + "'", long16 == 36000035L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 25200010L + "'", long32 == 25200010L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "UTC" + "'", str49, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 32L + "'", long52 == 32L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "UTC" + "'", str53, "UTC");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00" + "'", str55, "+00:00");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 100L + "'", long58 == 100L);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-35L) + "'", long64 == (-35L));
        org.junit.Assert.assertNotNull(timeZone65);
        org.junit.Assert.assertEquals(timeZone65.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+00:00" + "'", str67, "+00:00");
        org.junit.Assert.assertNotNull(timeZone68);
        org.junit.Assert.assertEquals(timeZone68.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        int int11 = dateTimeZone1.getOffset((long) (short) 100);
        boolean boolean12 = dateTimeZone1.isFixed();
        int int14 = dateTimeZone1.getStandardOffset(50400010L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        long long18 = dateTimeZone16.convertUTCToLocal(25800010L);
        boolean boolean19 = dateTimeZone1.equals((java.lang.Object) long18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long23 = dateTimeZone21.nextTransition(25199999L);
        int int25 = dateTimeZone21.getStandardOffset(1L);
        java.lang.String str27 = dateTimeZone21.getName(0L);
        boolean boolean28 = dateTimeZone1.equals((java.lang.Object) str27);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        long long32 = dateTimeZone29.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        long long35 = dateTimeZone33.previousTransition((long) ' ');
        java.lang.String str36 = dateTimeZone33.getID();
        java.lang.Object obj37 = dateTimeZone33.writeReplace();
        boolean boolean38 = dateTimeZone29.equals((java.lang.Object) dateTimeZone33);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone29.getName(100L, locale40);
        java.lang.Object obj42 = dateTimeZone29.writeReplace();
        java.lang.Object obj43 = dateTimeZone29.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        long long46 = dateTimeZone44.previousTransition((long) ' ');
        boolean boolean47 = dateTimeZone44.isFixed();
        long long49 = dateTimeZone44.nextTransition((long) 1);
        java.lang.String str51 = dateTimeZone44.getName((long) ' ');
        long long53 = dateTimeZone29.getMillisKeepLocal(dateTimeZone44, (long) 100);
        long long55 = dateTimeZone1.getMillisKeepLocal(dateTimeZone44, 600035L);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        long long60 = dateTimeZone58.nextTransition(0L);
        long long62 = dateTimeZone58.nextTransition((-25200001L));
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.UTC;
        long long65 = dateTimeZone63.previousTransition((long) ' ');
        boolean boolean66 = dateTimeZone63.isFixed();
        long long68 = dateTimeZone63.nextTransition((long) 1);
        java.lang.String str69 = dateTimeZone63.getID();
        java.util.Locale locale71 = null;
        java.lang.String str72 = dateTimeZone63.getShortName((-25200001L), locale71);
        java.lang.Object obj73 = dateTimeZone63.writeReplace();
        java.lang.String str74 = dateTimeZone63.toString();
        long long76 = dateTimeZone63.nextTransition((long) (-1));
        java.util.TimeZone timeZone77 = dateTimeZone63.toTimeZone();
        long long80 = dateTimeZone63.convertLocalToUTC((-35L), true);
        java.lang.String str82 = dateTimeZone63.getName((long) (short) 1);
        long long84 = dateTimeZone58.getMillisKeepLocal(dateTimeZone63, (-111540001L));
        boolean boolean85 = dateTimeZone44.equals((java.lang.Object) dateTimeZone58);
        java.lang.String str86 = dateTimeZone44.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone44);
        int int89 = dateTimeZone44.getStandardOffset(359940001L);
        long long91 = dateTimeZone44.nextTransition(362099999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25800011L + "'", long18 == 25800011L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 25199999L + "'", long23 == 25199999L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.001" + "'", str27, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 32L + "'", long46 == 32L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00" + "'", str51, "+00:00");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 100L + "'", long53 == 100L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 600035L + "'", long55 == 600035L);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-25200001L) + "'", long62 == (-25200001L));
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 32L + "'", long65 == 32L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "UTC" + "'", str69, "UTC");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "+00:00" + "'", str72, "+00:00");
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "UTC" + "'", str74, "UTC");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-1L) + "'", long76 == (-1L));
        org.junit.Assert.assertNotNull(timeZone77);
        org.junit.Assert.assertEquals(timeZone77.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + (-35L) + "'", long80 == (-35L));
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "+00:00" + "'", str82, "+00:00");
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-75540001L) + "'", long84 == (-75540001L));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "UTC" + "'", str86, "UTC");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 362099999L + "'", long91 == 362099999L);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(25200035L, locale11);
        long long15 = dateTimeZone1.convertLocalToUTC(25200010L, true);
        int int17 = dateTimeZone1.getStandardOffset((-1L));
        int int19 = dateTimeZone1.getOffset((long) '4');
        long long22 = dateTimeZone1.convertLocalToUTC(0L, false);
        int int24 = dateTimeZone1.getOffset((-2L));
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone1.getName(362099999L, locale26);
        java.lang.Object obj28 = null;
        boolean boolean29 = dateTimeZone1.equals(obj28);
        long long31 = dateTimeZone1.nextTransition((-34L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25200010L + "'", long15 == 25200010L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-34L) + "'", long31 == (-34L));
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getName(100L, locale11);
        int int14 = dateTimeZone0.getOffsetFromLocal(32L);
        long long16 = dateTimeZone0.convertUTCToLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone0.isLocalDateTimeGap(localDateTime17);
        java.lang.String str20 = dateTimeZone0.getName(359999991L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 10, false);
        java.lang.Object obj9 = dateTimeZone0.writeReplace();
        int int11 = dateTimeZone0.getOffsetFromLocal(387300010L);
        java.lang.String str13 = dateTimeZone0.getShortName(25800011L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone0.getOffset(readableInstant14);
        int int17 = dateTimeZone0.getOffsetFromLocal(723599966L);
        java.lang.String str19 = dateTimeZone0.getName(3600004L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        boolean boolean5 = dateTimeZone0.isStandardOffset((long) (byte) 1);
        long long8 = dateTimeZone0.convertLocalToUTC(600010L, true);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName(3120000L, locale10);
        int int13 = dateTimeZone0.getStandardOffset((-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600010L + "'", long8 == 600010L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        java.lang.String str10 = dateTimeZone1.getID();
        boolean boolean11 = dateTimeZone1.isFixed();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName(1L, locale13);
        java.lang.String str16 = dateTimeZone1.getNameKey((long) (short) -1);
        long long19 = dateTimeZone1.convertLocalToUTC(3599999L, true);
        java.lang.String str21 = dateTimeZone1.getName((-25200001L));
        java.util.TimeZone timeZone22 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str24 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.lang.String str31 = dateTimeZone29.getNameKey(10L);
        long long33 = dateTimeZone27.getMillisKeepLocal(dateTimeZone29, (long) 1);
        java.lang.String str35 = dateTimeZone27.getName((long) 0);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone27.getName(25200035L, locale37);
        long long41 = dateTimeZone27.convertLocalToUTC(25200010L, true);
        int int43 = dateTimeZone27.getStandardOffset((-1L));
        int int45 = dateTimeZone27.getOffset((long) '4');
        int int47 = dateTimeZone27.getOffset((long) (short) 10);
        int int49 = dateTimeZone27.getStandardOffset(1L);
        org.joda.time.LocalDateTime localDateTime50 = null;
        boolean boolean51 = dateTimeZone27.isLocalDateTimeGap(localDateTime50);
        long long53 = dateTimeZone27.previousTransition(25200001L);
        java.lang.String str54 = dateTimeZone27.getID();
        long long56 = dateTimeZone27.nextTransition((-21600000L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        java.lang.String str58 = dateTimeZone27.toString();
        long long60 = dateTimeZone1.getMillisKeepLocal(dateTimeZone27, 50399910L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3599999L + "'", long19 == 3599999L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 25200010L + "'", long41 == 25200010L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 25200001L + "'", long53 == 25200001L);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "UTC" + "'", str54, "UTC");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-21600000L) + "'", long56 == (-21600000L));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "UTC" + "'", str58, "UTC");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 50399910L + "'", long60 == 50399910L);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str4 = dateTimeZone1.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = dateTimeZone1.equals(obj5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = dateTimeZone10.getNameKey(10L);
        long long14 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 1);
        java.lang.String str16 = dateTimeZone8.getName((long) 0);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone8.getName(25200035L, locale18);
        long long22 = dateTimeZone8.convertLocalToUTC(25200010L, true);
        int int24 = dateTimeZone8.getStandardOffset((-1L));
        int int26 = dateTimeZone8.getOffset((long) '4');
        int int28 = dateTimeZone8.getOffset((long) (short) 10);
        int int30 = dateTimeZone8.getStandardOffset(1L);
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = dateTimeZone8.isLocalDateTimeGap(localDateTime31);
        java.lang.String str34 = dateTimeZone8.getNameKey((-362100000L));
        boolean boolean36 = dateTimeZone8.isStandardOffset(431999966L);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 0);
        long long41 = dateTimeZone8.getMillisKeepLocal(dateTimeZone39, 25260011L);
        boolean boolean43 = dateTimeZone8.isStandardOffset((-599999L));
        long long45 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 359940000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 25200010L + "'", long22 == 25200010L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-334739989L) + "'", long41 == (-334739989L));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 359940000L + "'", long45 == 359940000L);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone3.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone3.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone8.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone12.previousTransition((long) ' ');
        java.lang.String str15 = dateTimeZone12.getID();
        java.lang.Object obj16 = dateTimeZone12.writeReplace();
        boolean boolean17 = dateTimeZone8.equals((java.lang.Object) dateTimeZone12);
        boolean boolean18 = dateTimeZone3.equals((java.lang.Object) dateTimeZone12);
        long long20 = dateTimeZone3.convertUTCToLocal(25200010L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (-1));
        int int24 = dateTimeZone3.getOffsetFromLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        long long28 = dateTimeZone25.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        long long31 = dateTimeZone29.previousTransition((long) ' ');
        java.lang.String str32 = dateTimeZone29.getID();
        java.lang.Object obj33 = dateTimeZone29.writeReplace();
        boolean boolean34 = dateTimeZone25.equals((java.lang.Object) dateTimeZone29);
        boolean boolean36 = dateTimeZone25.isStandardOffset(25200035L);
        int int38 = dateTimeZone25.getOffsetFromLocal((long) (byte) 10);
        boolean boolean40 = dateTimeZone25.isStandardOffset(25200000L);
        boolean boolean41 = dateTimeZone3.equals((java.lang.Object) 25200000L);
        java.util.TimeZone timeZone42 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone43.getName(0L, locale45);
        boolean boolean48 = dateTimeZone43.isStandardOffset((-337499990L));
        java.util.Locale locale50 = null;
        java.lang.String str51 = dateTimeZone43.getShortName(423300010L, locale50);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200010L + "'", long20 == 25200010L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00" + "'", str51, "+00:00");
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str6 = dateTimeZone0.getID();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName((-25200001L), locale8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getName((long) (-3600000), locale12);
        long long15 = dateTimeZone0.nextTransition(4199965L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone0.getName(28200010L, locale17);
        boolean boolean19 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4199965L + "'", long15 == 4199965L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getShortName(25200035L, locale9);
        java.lang.String str11 = dateTimeZone0.toString();
        long long14 = dateTimeZone0.convertLocalToUTC(115260100L, true);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone16.getOffset(readableInstant17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        long long21 = dateTimeZone19.previousTransition((long) ' ');
        java.lang.String str22 = dateTimeZone19.getID();
        java.lang.String str24 = dateTimeZone19.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone19.getOffset(readableInstant25);
        long long28 = dateTimeZone16.getMillisKeepLocal(dateTimeZone19, (long) '#');
        long long30 = dateTimeZone0.getMillisKeepLocal(dateTimeZone19, 3600000L);
        int int32 = dateTimeZone0.getOffset(25199999L);
        long long34 = dateTimeZone0.convertUTCToLocal((long) (short) 100);
        java.lang.String str36 = dateTimeZone0.getShortName(35L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115260100L + "'", long14 == 115260100L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3600000L + "'", long30 == 3600000L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        java.lang.Object obj7 = null;
        boolean boolean8 = dateTimeZone1.equals(obj7);
        java.lang.String str9 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone10.previousTransition((long) ' ');
        java.lang.String str13 = dateTimeZone10.getID();
        java.lang.String str15 = dateTimeZone10.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone10.getOffset(readableInstant16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone10.getName((long) (byte) -1, locale19);
        int int22 = dateTimeZone10.getOffsetFromLocal((long) (byte) 100);
        java.util.TimeZone timeZone23 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone24.isLocalDateTimeGap(localDateTime25);
        long long29 = dateTimeZone24.convertLocalToUTC(36000052L, true);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone24.getName((long) (short) -1, locale31);
        boolean boolean33 = dateTimeZone1.equals((java.lang.Object) str32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 36000052L + "'", long29 == 36000052L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(25200035L, locale11);
        long long15 = dateTimeZone1.convertLocalToUTC(25200010L, true);
        int int17 = dateTimeZone1.getStandardOffset((-1L));
        int int19 = dateTimeZone1.getOffset((long) '4');
        int int21 = dateTimeZone1.getOffset((long) (short) 10);
        int int23 = dateTimeZone1.getStandardOffset(1L);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone1.isLocalDateTimeGap(localDateTime24);
        long long27 = dateTimeZone1.previousTransition(25200001L);
        boolean boolean28 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = dateTimeZone1.isLocalDateTimeGap(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25200010L + "'", long15 == 25200010L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 25200001L + "'", long27 == 25200001L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+10:00");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long6 = dateTimeZone4.nextTransition((long) '4');
        java.lang.String str7 = dateTimeZone4.toString();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone4.getName((long) (byte) 0, locale9);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str14 = dateTimeZone12.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider15 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider15);
        boolean boolean17 = dateTimeZone12.equals((java.lang.Object) nameProvider15);
        long long20 = dateTimeZone12.convertLocalToUTC((-1L), true);
        java.lang.String str21 = dateTimeZone12.getID();
        boolean boolean23 = dateTimeZone12.isStandardOffset((long) 1);
        boolean boolean24 = dateTimeZone4.equals((java.lang.Object) boolean23);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        long long27 = dateTimeZone25.previousTransition((long) ' ');
        java.lang.String str28 = dateTimeZone25.getID();
        java.lang.String str30 = dateTimeZone25.getShortName((long) (short) 0);
        long long32 = dateTimeZone25.previousTransition((long) (short) -1);
        int int34 = dateTimeZone25.getStandardOffset((long) 0);
        long long36 = dateTimeZone25.convertUTCToLocal((long) ' ');
        java.lang.String str38 = dateTimeZone25.getName((long) 600000);
        long long40 = dateTimeZone4.getMillisKeepLocal(dateTimeZone25, 3L);
        long long42 = dateTimeZone25.convertUTCToLocal(25200000L);
        boolean boolean44 = dateTimeZone25.isStandardOffset((long) (-3600000));
        java.lang.String str45 = dateTimeZone25.getID();
        long long47 = dateTimeZone1.getMillisKeepLocal(dateTimeZone25, (long) 600000);
        java.lang.String str48 = dateTimeZone1.getID();
        long long51 = dateTimeZone1.convertLocalToUTC(25199965L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:00" + "'", str7, "+01:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:00" + "'", str10, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(nameProvider15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 3600003L + "'", long40 == 3600003L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 25200000L + "'", long42 == 25200000L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UTC" + "'", str45, "UTC");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 36600000L + "'", long47 == 36600000L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+10:00" + "'", str48, "+10:00");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-10800035L) + "'", long51 == (-10800035L));
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        long long9 = dateTimeZone3.convertUTCToLocal((long) (-1));
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone3.isLocalDateTimeGap(localDateTime10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone12.convertLocalToUTC((long) (byte) -1, true);
        java.lang.String str16 = dateTimeZone12.getID();
        long long18 = dateTimeZone3.getMillisKeepLocal(dateTimeZone12, (long) (short) -1);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.lang.String str22 = dateTimeZone20.getNameKey(10L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        long long25 = dateTimeZone23.previousTransition((long) ' ');
        java.lang.String str26 = dateTimeZone23.getID();
        java.lang.String str28 = dateTimeZone23.getShortName((long) (short) 0);
        long long31 = dateTimeZone23.convertLocalToUTC((long) (byte) 100, true);
        java.lang.Object obj32 = dateTimeZone23.writeReplace();
        boolean boolean33 = dateTimeZone20.equals((java.lang.Object) dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long37 = dateTimeZone20.getMillisKeepLocal(dateTimeZone35, 0L);
        java.util.TimeZone timeZone38 = dateTimeZone20.toTimeZone();
        java.lang.String str40 = dateTimeZone20.getShortName((long) (-3600000));
        int int42 = dateTimeZone20.getOffsetFromLocal(25199999L);
        long long44 = dateTimeZone3.getMillisKeepLocal(dateTimeZone20, (-362100000L));
        long long46 = dateTimeZone3.convertUTCToLocal((long) 128100000);
        org.joda.time.ReadableInstant readableInstant47 = null;
        int int48 = dateTimeZone3.getOffset(readableInstant47);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-35L) + "'", long37 == (-35L));
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-362100000L) + "'", long44 == (-362100000L));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 128100000L + "'", long46 == 128100000L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName((long) (byte) -1, locale9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str13 = dateTimeZone0.getShortName(35L);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str16 = dateTimeZone15.toString();
        long long19 = dateTimeZone15.convertLocalToUTC(24600010L, true);
        long long21 = dateTimeZone0.getMillisKeepLocal(dateTimeZone15, (long) (byte) -1);
        java.lang.String str23 = dateTimeZone0.getShortName((long) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        long long27 = dateTimeZone24.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        long long30 = dateTimeZone28.previousTransition((long) ' ');
        java.lang.String str31 = dateTimeZone28.getID();
        java.lang.Object obj32 = dateTimeZone28.writeReplace();
        boolean boolean33 = dateTimeZone24.equals((java.lang.Object) dateTimeZone28);
        boolean boolean35 = dateTimeZone24.isStandardOffset(25200035L);
        int int37 = dateTimeZone24.getOffsetFromLocal((long) (byte) 10);
        long long40 = dateTimeZone24.convertLocalToUTC((long) 'a', false);
        java.lang.String str41 = dateTimeZone24.getID();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        long long45 = dateTimeZone42.convertLocalToUTC((long) (byte) -1, true);
        java.util.Locale locale47 = null;
        java.lang.String str48 = dateTimeZone42.getShortName((long) '4', locale47);
        long long50 = dateTimeZone42.convertUTCToLocal((long) 25200000);
        long long52 = dateTimeZone24.getMillisKeepLocal(dateTimeZone42, 51L);
        long long54 = dateTimeZone0.getMillisKeepLocal(dateTimeZone24, (long) 362100000);
        long long56 = dateTimeZone24.previousTransition((-115800001L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 24600010L + "'", long19 == 24600010L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 97L + "'", long40 == 97L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTC" + "'", str41, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00" + "'", str48, "+00:00");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 25200000L + "'", long50 == 25200000L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 51L + "'", long52 == 51L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 362100000L + "'", long54 == 362100000L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-115800001L) + "'", long56 == (-115800001L));
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        java.lang.String str11 = dateTimeZone4.getName(97L);
        int int13 = dateTimeZone4.getStandardOffset((long) 10);
        int int15 = dateTimeZone4.getStandardOffset((long) (-3600000));
        java.lang.String str16 = dateTimeZone4.toString();
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone4.getName(101L, locale18);
        boolean boolean20 = dateTimeZone4.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone3.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone3.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone8.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone12.previousTransition((long) ' ');
        java.lang.String str15 = dateTimeZone12.getID();
        java.lang.Object obj16 = dateTimeZone12.writeReplace();
        boolean boolean17 = dateTimeZone8.equals((java.lang.Object) dateTimeZone12);
        boolean boolean18 = dateTimeZone3.equals((java.lang.Object) dateTimeZone12);
        long long20 = dateTimeZone3.convertUTCToLocal(25200010L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (-1));
        int int24 = dateTimeZone3.getOffsetFromLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        long long28 = dateTimeZone25.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        long long31 = dateTimeZone29.previousTransition((long) ' ');
        java.lang.String str32 = dateTimeZone29.getID();
        java.lang.Object obj33 = dateTimeZone29.writeReplace();
        boolean boolean34 = dateTimeZone25.equals((java.lang.Object) dateTimeZone29);
        boolean boolean36 = dateTimeZone25.isStandardOffset(25200035L);
        int int38 = dateTimeZone25.getOffsetFromLocal((long) (byte) 10);
        boolean boolean40 = dateTimeZone25.isStandardOffset(25200000L);
        boolean boolean41 = dateTimeZone3.equals((java.lang.Object) 25200000L);
        java.util.TimeZone timeZone42 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone43.getName(356400000L, locale45);
        boolean boolean48 = dateTimeZone43.isStandardOffset((-25199900L));
        long long50 = dateTimeZone43.nextTransition((-98L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200010L + "'", long20 == 25200010L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-98L) + "'", long50 == (-98L));
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long3 = dateTimeZone1.previousTransition(0L);
        java.lang.String str4 = dateTimeZone1.toString();
        java.lang.Object obj5 = dateTimeZone1.writeReplace();
        java.lang.String str7 = dateTimeZone1.getShortName(0L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName(600062L, locale9);
        java.lang.String str12 = dateTimeZone1.getName((-3600035L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getNameKey((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone0.isLocalDateTimeGap(localDateTime6);
        int int9 = dateTimeZone0.getStandardOffset(35999999L);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getShortName(115320099L, locale11);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Asia/Bangkok");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(32L, locale3);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.lang.Class<?> wildcardClass8 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+07:00" + "'", str4, "+07:00");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone11.previousTransition((long) ' ');
        boolean boolean14 = dateTimeZone11.isFixed();
        long long16 = dateTimeZone10.getMillisKeepLocal(dateTimeZone11, (long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        boolean boolean18 = dateTimeZone10.isFixed();
        java.util.TimeZone timeZone19 = dateTimeZone10.toTimeZone();
        int int21 = dateTimeZone10.getOffset((-3600001L));
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone25.getOffset(readableInstant26);
        java.lang.String str29 = dateTimeZone25.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        long long33 = dateTimeZone30.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        long long36 = dateTimeZone34.previousTransition((long) ' ');
        java.lang.String str37 = dateTimeZone34.getID();
        java.lang.Object obj38 = dateTimeZone34.writeReplace();
        boolean boolean39 = dateTimeZone30.equals((java.lang.Object) dateTimeZone34);
        boolean boolean40 = dateTimeZone25.equals((java.lang.Object) dateTimeZone34);
        long long42 = dateTimeZone25.convertUTCToLocal(25200010L);
        long long44 = dateTimeZone23.getMillisKeepLocal(dateTimeZone25, (long) (-1));
        int int46 = dateTimeZone25.getOffsetFromLocal(0L);
        java.lang.String str48 = dateTimeZone25.getShortName((long) (-3600000));
        java.lang.String str49 = dateTimeZone25.getID();
        long long51 = dateTimeZone10.getMillisKeepLocal(dateTimeZone25, (-3600001L));
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long55 = dateTimeZone53.nextTransition((long) 'a');
        java.lang.Object obj56 = dateTimeZone53.writeReplace();
        org.joda.time.LocalDateTime localDateTime57 = null;
        boolean boolean58 = dateTimeZone53.isLocalDateTimeGap(localDateTime57);
        java.util.Locale locale60 = null;
        java.lang.String str61 = dateTimeZone53.getName((long) 1, locale60);
        java.util.Locale locale63 = null;
        java.lang.String str64 = dateTimeZone53.getShortName(387300010L, locale63);
        boolean boolean65 = dateTimeZone25.equals((java.lang.Object) dateTimeZone53);
        java.util.Locale locale67 = null;
        java.lang.String str68 = dateTimeZone53.getShortName((-36600000L), locale67);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 25200010L + "'", long42 == 25200010L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00" + "'", str48, "+00:00");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "UTC" + "'", str49, "UTC");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-3600001L) + "'", long51 == (-3600001L));
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 97L + "'", long55 == 97L);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "+100:00" + "'", str61, "+100:00");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "+100:00" + "'", str64, "+100:00");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "+100:00" + "'", str68, "+100:00");
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        boolean boolean11 = dateTimeZone0.isStandardOffset(25200035L);
        int int13 = dateTimeZone0.getOffsetFromLocal((long) (byte) 10);
        boolean boolean15 = dateTimeZone0.isStandardOffset(25200000L);
        long long18 = dateTimeZone0.convertLocalToUTC((long) (short) 100, false);
        boolean boolean20 = dateTimeZone0.isStandardOffset(599965L);
        long long22 = dateTimeZone0.nextTransition(25140010L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 25140010L + "'", long22 == 25140010L);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone3.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone3.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone8.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone12.previousTransition((long) ' ');
        java.lang.String str15 = dateTimeZone12.getID();
        java.lang.Object obj16 = dateTimeZone12.writeReplace();
        boolean boolean17 = dateTimeZone8.equals((java.lang.Object) dateTimeZone12);
        boolean boolean18 = dateTimeZone3.equals((java.lang.Object) dateTimeZone12);
        long long20 = dateTimeZone3.convertUTCToLocal(25200010L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (-1));
        long long24 = dateTimeZone3.previousTransition((-35L));
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone3.getShortName(0L, locale26);
        java.lang.String str28 = dateTimeZone3.toString();
        long long30 = dateTimeZone3.previousTransition((long) (byte) 1);
        int int32 = dateTimeZone3.getOffsetFromLocal((long) (byte) 10);
        int int34 = dateTimeZone3.getOffsetFromLocal(28799958L);
        java.lang.Object obj35 = dateTimeZone3.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200010L + "'", long20 == 25200010L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-35L) + "'", long24 == (-35L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long10 = dateTimeZone0.nextTransition((-35L));
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        java.lang.Class<?> wildcardClass13 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-35L) + "'", long10 == (-35L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getShortName(25200035L, locale9);
        java.lang.String str11 = dateTimeZone0.toString();
        long long14 = dateTimeZone0.convertLocalToUTC(115260100L, true);
        java.lang.String str16 = dateTimeZone0.getNameKey((long) 126000000);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long20 = dateTimeZone18.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone18.isLocalDateTimeGap(localDateTime21);
        java.util.TimeZone timeZone23 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone26.getOffset(readableInstant27);
        java.lang.String str29 = dateTimeZone26.toString();
        java.util.TimeZone timeZone30 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        boolean boolean34 = dateTimeZone0.equals((java.lang.Object) dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115260100L + "'", long14 == 115260100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25199999L + "'", long20 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) "");
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName(10L, locale4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone0.isLocalDateTimeGap(localDateTime6);
        long long10 = dateTimeZone0.convertLocalToUTC((long) (-3600000), false);
        int int12 = dateTimeZone0.getStandardOffset(3L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone0.getName(600035L, locale14);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone0.getName(151200010L, locale17);
        java.lang.String str20 = dateTimeZone0.getNameKey((-35399939L));
        java.lang.String str22 = dateTimeZone0.getNameKey(3120000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3600000L) + "'", long10 == (-3600000L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(25200035L, locale11);
        int int14 = dateTimeZone1.getOffset((long) '4');
        java.lang.Object obj15 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone16 = dateTimeZone1.toTimeZone();
        java.lang.String str18 = dateTimeZone1.getNameKey(359999966L);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) '#');
        java.lang.String str23 = dateTimeZone21.getName((-336899990L));
        boolean boolean24 = dateTimeZone1.equals((java.lang.Object) dateTimeZone21);
        long long27 = dateTimeZone21.convertLocalToUTC(26700010L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:35" + "'", str23, "+00:35");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 24600010L + "'", long27 == 24600010L);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        long long11 = dateTimeZone0.convertUTCToLocal((-1L));
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone12.previousTransition((long) ' ');
        boolean boolean15 = dateTimeZone12.isFixed();
        long long17 = dateTimeZone12.nextTransition((long) 1);
        java.lang.String str19 = dateTimeZone12.getName((long) ' ');
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone12.getShortName(25200035L, locale21);
        java.lang.String str23 = dateTimeZone12.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        long long26 = dateTimeZone0.getMillisKeepLocal(dateTimeZone12, (-362100001L));
        long long28 = dateTimeZone12.nextTransition((-25199900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-362100001L) + "'", long26 == (-362100001L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-25199900L) + "'", long28 == (-25199900L));
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset(25200036L);
        long long11 = dateTimeZone7.convertUTCToLocal(388800010L);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone7.getOffset(readableInstant12);
        boolean boolean14 = dateTimeZone7.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25199999L + "'", long3 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 388800010L + "'", long11 == 388800010L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) '#');
        java.lang.String str4 = dateTimeZone2.getName(25200000L);
        int int6 = dateTimeZone2.getOffsetFromLocal(0L);
        java.lang.Object obj7 = dateTimeZone2.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+35:35" + "'", str4, "+35:35");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 128100000 + "'", int6 == 128100000);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        int int11 = dateTimeZone1.getOffset(25200010L);
        java.lang.String str13 = dateTimeZone1.getShortName((-1L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName(115260100L, locale15);
        java.lang.String str17 = dateTimeZone1.getID();
        long long19 = dateTimeZone1.nextTransition((-35L));
        java.util.TimeZone timeZone20 = dateTimeZone1.toTimeZone();
        java.lang.String str22 = dateTimeZone1.getNameKey(256200052L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-35L) + "'", long19 == (-35L));
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long5 = dateTimeZone3.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone3.isLocalDateTimeGap(localDateTime6);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.toString();
        boolean boolean11 = dateTimeZone9.isFixed();
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone9.isLocalDateTimeGap(localDateTime12);
        long long15 = dateTimeZone9.previousTransition((-36000001L));
        java.lang.String str16 = dateTimeZone9.getID();
        boolean boolean17 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        int int19 = dateTimeZone1.getOffset(25200009L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25199999L + "'", long5 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-36000001L) + "'", long15 == (-36000001L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long4 = dateTimeZone2.nextTransition((long) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long9 = dateTimeZone7.nextTransition((long) '4');
        java.lang.String str10 = dateTimeZone7.toString();
        long long12 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, 387300010L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone7.getOffset(readableInstant13);
        boolean boolean16 = dateTimeZone7.isStandardOffset(24540010L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone7.getName((-25200000L), locale18);
        long long21 = dateTimeZone7.previousTransition((long) (byte) 10);
        java.util.TimeZone timeZone22 = dateTimeZone7.toTimeZone();
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone7.getShortName(61200036L, locale24);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone7.getName((-4199989L), locale27);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:00" + "'", str10, "+01:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 387300010L + "'", long12 == 387300010L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3600000 + "'", int14 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+01:00" + "'", str19, "+01:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+01:00" + "'", str25, "+01:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+01:00" + "'", str28, "+01:00");
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        int int11 = dateTimeZone1.getOffset(25200010L);
        long long13 = dateTimeZone1.convertUTCToLocal(359999966L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName((-3600000L), locale15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone1.getShortName(21600010L, locale18);
        java.lang.Object obj20 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        long long23 = dateTimeZone21.previousTransition((long) ' ');
        boolean boolean24 = dateTimeZone21.isFixed();
        long long26 = dateTimeZone21.nextTransition((long) 1);
        long long29 = dateTimeZone21.convertLocalToUTC((long) (byte) 10, false);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone21.getName(599965L, locale31);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.util.TimeZone timeZone35 = dateTimeZone34.toTimeZone();
        boolean boolean36 = dateTimeZone21.equals((java.lang.Object) timeZone35);
        long long38 = dateTimeZone1.getMillisKeepLocal(dateTimeZone21, 0L);
        java.lang.String str40 = dateTimeZone21.getShortName(360000052L);
        java.util.TimeZone timeZone41 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 359999966L + "'", long13 == 359999966L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone42);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone3.previousTransition((long) ' ');
        boolean boolean6 = dateTimeZone3.isFixed();
        long long8 = dateTimeZone3.nextTransition((long) 1);
        long long11 = dateTimeZone3.convertLocalToUTC((long) (byte) 10, false);
        java.lang.Object obj12 = dateTimeZone3.writeReplace();
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone3, (long) (byte) 100);
        java.lang.Object obj15 = dateTimeZone2.writeReplace();
        long long17 = dateTimeZone2.convertUTCToLocal(25200011L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone2.getShortName(100L, locale19);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115260100L + "'", long14 == 115260100L);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 140460011L + "'", long17 == 140460011L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:01" + "'", str20, "+32:01");
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str9 = dateTimeZone0.getNameKey(362099999L);
        java.lang.String str10 = dateTimeZone0.getID();
        boolean boolean11 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone12 = dateTimeZone0.toTimeZone();
        int int14 = dateTimeZone0.getStandardOffset(326100000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+10:00");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long6 = dateTimeZone4.nextTransition((long) '4');
        java.lang.String str7 = dateTimeZone4.toString();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone4.getName((long) (byte) 0, locale9);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str14 = dateTimeZone12.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider15 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider15);
        boolean boolean17 = dateTimeZone12.equals((java.lang.Object) nameProvider15);
        long long20 = dateTimeZone12.convertLocalToUTC((-1L), true);
        java.lang.String str21 = dateTimeZone12.getID();
        boolean boolean23 = dateTimeZone12.isStandardOffset((long) 1);
        boolean boolean24 = dateTimeZone4.equals((java.lang.Object) boolean23);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        long long27 = dateTimeZone25.previousTransition((long) ' ');
        java.lang.String str28 = dateTimeZone25.getID();
        java.lang.String str30 = dateTimeZone25.getShortName((long) (short) 0);
        long long32 = dateTimeZone25.previousTransition((long) (short) -1);
        int int34 = dateTimeZone25.getStandardOffset((long) 0);
        long long36 = dateTimeZone25.convertUTCToLocal((long) ' ');
        java.lang.String str38 = dateTimeZone25.getName((long) 600000);
        long long40 = dateTimeZone4.getMillisKeepLocal(dateTimeZone25, 3L);
        long long42 = dateTimeZone25.convertUTCToLocal(25200000L);
        boolean boolean44 = dateTimeZone25.isStandardOffset((long) (-3600000));
        java.lang.String str45 = dateTimeZone25.getID();
        long long47 = dateTimeZone1.getMillisKeepLocal(dateTimeZone25, (long) 600000);
        java.lang.String str48 = dateTimeZone1.getID();
        java.lang.Object obj49 = dateTimeZone1.writeReplace();
        org.joda.time.LocalDateTime localDateTime50 = null;
        boolean boolean51 = dateTimeZone1.isLocalDateTimeGap(localDateTime50);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:00" + "'", str7, "+01:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:00" + "'", str10, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(nameProvider15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 3600003L + "'", long40 == 3600003L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 25200000L + "'", long42 == 25200000L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UTC" + "'", str45, "UTC");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 36600000L + "'", long47 == 36600000L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+10:00" + "'", str48, "+10:00");
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        java.lang.String str11 = dateTimeZone1.getNameKey((-25200001L));
        java.lang.String str12 = dateTimeZone1.getID();
        long long14 = dateTimeZone1.previousTransition((-25200001L));
        long long16 = dateTimeZone1.nextTransition(25200035L);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone1.isLocalDateTimeGap(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-25200001L) + "'", long14 == (-25200001L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200035L + "'", long16 == 25200035L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        java.lang.String str10 = dateTimeZone1.getID();
        boolean boolean11 = dateTimeZone1.isFixed();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName(1L, locale13);
        java.lang.String str16 = dateTimeZone1.getNameKey((long) (short) -1);
        boolean boolean17 = dateTimeZone1.isFixed();
        long long19 = dateTimeZone1.convertUTCToLocal(3599899L);
        java.lang.Object obj20 = dateTimeZone1.writeReplace();
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone1.isLocalDateTimeGap(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3599899L + "'", long19 == 3599899L);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str5 = dateTimeZone1.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone6.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone10.previousTransition((long) ' ');
        java.lang.String str13 = dateTimeZone10.getID();
        java.lang.Object obj14 = dateTimeZone10.writeReplace();
        boolean boolean15 = dateTimeZone6.equals((java.lang.Object) dateTimeZone10);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) dateTimeZone10);
        boolean boolean18 = dateTimeZone1.isStandardOffset(3599999L);
        long long20 = dateTimeZone1.previousTransition((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean23 = dateTimeZone1.isStandardOffset((-3600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long12 = dateTimeZone10.nextTransition(25199999L);
        int int14 = dateTimeZone10.getStandardOffset(1L);
        java.lang.String str16 = dateTimeZone10.getNameKey(25800010L);
        boolean boolean17 = dateTimeZone8.equals((java.lang.Object) 25800010L);
        int int19 = dateTimeZone8.getOffsetFromLocal((-3600001L));
        java.util.TimeZone timeZone20 = dateTimeZone8.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25199999L + "'", long3 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 25199999L + "'", long12 == 25199999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        java.lang.String str12 = dateTimeZone9.toString();
        java.util.TimeZone timeZone13 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        long long16 = dateTimeZone14.convertUTCToLocal(7200000L);
        java.lang.String str17 = dateTimeZone14.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25199999L + "'", long3 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 7200000L + "'", long16 == 7200000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName((long) (byte) -1, locale9);
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (byte) 100);
        long long15 = dateTimeZone0.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 1);
        long long20 = dateTimeZone0.getMillisKeepLocal(dateTimeZone18, (long) (short) -1);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone0.getShortName(3L, locale22);
        java.lang.Object obj24 = dateTimeZone0.writeReplace();
        java.lang.Object obj25 = dateTimeZone0.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-60001L) + "'", long20 == (-60001L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getName(100L, locale11);
        java.lang.Object obj13 = dateTimeZone0.writeReplace();
        java.lang.Object obj14 = dateTimeZone0.writeReplace();
        int int16 = dateTimeZone0.getOffsetFromLocal(0L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone0.getShortName(115260000L, locale18);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        java.lang.String str11 = dateTimeZone4.getName(97L);
        int int13 = dateTimeZone4.getOffsetFromLocal((-36060001L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        boolean boolean10 = dateTimeZone9.isFixed();
        java.lang.Object obj11 = dateTimeZone9.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone12.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        long long18 = dateTimeZone16.previousTransition((long) ' ');
        java.lang.String str19 = dateTimeZone16.getID();
        java.lang.Object obj20 = dateTimeZone16.writeReplace();
        boolean boolean21 = dateTimeZone12.equals((java.lang.Object) dateTimeZone16);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone12.getName(100L, locale23);
        java.lang.Object obj25 = dateTimeZone12.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = dateTimeZone27.getOffset(readableInstant28);
        boolean boolean30 = dateTimeZone12.equals((java.lang.Object) int29);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone32.getOffset(readableInstant33);
        java.lang.String str36 = dateTimeZone32.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        long long40 = dateTimeZone37.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        long long43 = dateTimeZone41.previousTransition((long) ' ');
        java.lang.String str44 = dateTimeZone41.getID();
        java.lang.Object obj45 = dateTimeZone41.writeReplace();
        boolean boolean46 = dateTimeZone37.equals((java.lang.Object) dateTimeZone41);
        boolean boolean47 = dateTimeZone32.equals((java.lang.Object) dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = dateTimeZone41.isLocalDateTimeGap(localDateTime48);
        java.lang.Object obj50 = null;
        boolean boolean51 = dateTimeZone41.equals(obj50);
        long long53 = dateTimeZone41.convertUTCToLocal((long) (byte) 10);
        java.util.TimeZone timeZone54 = dateTimeZone41.toTimeZone();
        long long56 = dateTimeZone12.getMillisKeepLocal(dateTimeZone41, 324059967L);
        boolean boolean57 = dateTimeZone9.equals((java.lang.Object) dateTimeZone41);
        int int59 = dateTimeZone41.getOffset(3600001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25199999L + "'", long3 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 32L + "'", long43 == 32L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 10L + "'", long53 == 10L);
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 324059967L + "'", long56 == 324059967L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(32);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 10, false);
        java.lang.Object obj9 = dateTimeZone0.writeReplace();
        int int11 = dateTimeZone0.getOffsetFromLocal(387300010L);
        int int13 = dateTimeZone0.getOffsetFromLocal(1L);
        long long16 = dateTimeZone0.convertLocalToUTC(21600009L, false);
        java.lang.String str18 = dateTimeZone0.getShortName(120000L);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long22 = dateTimeZone20.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone20.isLocalDateTimeGap(localDateTime23);
        java.util.TimeZone timeZone25 = dateTimeZone20.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long31 = dateTimeZone29.nextTransition(25199999L);
        int int33 = dateTimeZone29.getStandardOffset(1L);
        java.lang.String str35 = dateTimeZone29.getNameKey(25800010L);
        boolean boolean36 = dateTimeZone27.equals((java.lang.Object) 25800010L);
        boolean boolean37 = dateTimeZone0.equals((java.lang.Object) boolean36);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 21600009L + "'", long16 == 21600009L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 25199999L + "'", long22 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 25199999L + "'", long31 == 25199999L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        int int7 = dateTimeZone0.getOffset((long) (short) 0);
        long long10 = dateTimeZone0.convertLocalToUTC((-2L), true);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone0.getOffset(readableInstant11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone0.getName((-359999997L), locale14);
        java.lang.String str17 = dateTimeZone0.getName(25199998L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone11.previousTransition((long) ' ');
        boolean boolean14 = dateTimeZone11.isFixed();
        long long16 = dateTimeZone10.getMillisKeepLocal(dateTimeZone11, (long) ' ');
        java.lang.String str18 = dateTimeZone11.getName(24540010L);
        int int20 = dateTimeZone11.getOffsetFromLocal(50400008L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        java.lang.String str10 = dateTimeZone1.getID();
        boolean boolean11 = dateTimeZone1.isFixed();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName(1L, locale13);
        java.lang.String str16 = dateTimeZone1.getNameKey((long) (short) -1);
        long long19 = dateTimeZone1.convertLocalToUTC(3599999L, true);
        java.lang.String str21 = dateTimeZone1.getName((-25200001L));
        java.util.TimeZone timeZone22 = dateTimeZone1.toTimeZone();
        long long24 = dateTimeZone1.convertUTCToLocal(362700000L);
        long long26 = dateTimeZone1.convertUTCToLocal((-337439991L));
        java.lang.String str27 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3599999L + "'", long19 == 3599999L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 362700000L + "'", long24 == 362700000L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-337439991L) + "'", long26 == (-337439991L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone3.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone3.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone8.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone12.previousTransition((long) ' ');
        java.lang.String str15 = dateTimeZone12.getID();
        java.lang.Object obj16 = dateTimeZone12.writeReplace();
        boolean boolean17 = dateTimeZone8.equals((java.lang.Object) dateTimeZone12);
        boolean boolean18 = dateTimeZone3.equals((java.lang.Object) dateTimeZone12);
        long long20 = dateTimeZone3.convertUTCToLocal(25200010L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (-1));
        java.lang.String str24 = dateTimeZone1.getNameKey((-25200001L));
        long long26 = dateTimeZone1.nextTransition(52L);
        int int28 = dateTimeZone1.getOffsetFromLocal((long) 3600000);
        int int30 = dateTimeZone1.getStandardOffset(3600001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200010L + "'", long20 == 25200010L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 52L + "'", long26 == 52L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone3.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone3.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone8.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone12.previousTransition((long) ' ');
        java.lang.String str15 = dateTimeZone12.getID();
        java.lang.Object obj16 = dateTimeZone12.writeReplace();
        boolean boolean17 = dateTimeZone8.equals((java.lang.Object) dateTimeZone12);
        boolean boolean18 = dateTimeZone3.equals((java.lang.Object) dateTimeZone12);
        long long20 = dateTimeZone3.convertUTCToLocal(25200010L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (-1));
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone24.getOffset(readableInstant25);
        java.lang.String str28 = dateTimeZone24.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        long long32 = dateTimeZone29.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        long long35 = dateTimeZone33.previousTransition((long) ' ');
        java.lang.String str36 = dateTimeZone33.getID();
        java.lang.Object obj37 = dateTimeZone33.writeReplace();
        boolean boolean38 = dateTimeZone29.equals((java.lang.Object) dateTimeZone33);
        boolean boolean39 = dateTimeZone24.equals((java.lang.Object) dateTimeZone33);
        java.lang.String str40 = dateTimeZone33.toString();
        long long42 = dateTimeZone3.getMillisKeepLocal(dateTimeZone33, (long) (short) 100);
        long long44 = dateTimeZone3.previousTransition(3540000L);
        java.lang.String str46 = dateTimeZone3.getShortName(115260000L);
        java.util.TimeZone timeZone47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        int int50 = dateTimeZone48.getOffset(readableInstant49);
        int int52 = dateTimeZone48.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone53 = dateTimeZone48.toTimeZone();
        long long55 = dateTimeZone48.nextTransition((long) '4');
        int int57 = dateTimeZone48.getOffset((long) 'a');
        long long59 = dateTimeZone3.getMillisKeepLocal(dateTimeZone48, (-111540001L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200010L + "'", long20 == 25200010L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UTC" + "'", str40, "UTC");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 3540000L + "'", long44 == 3540000L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 52L + "'", long55 == 52L);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-111540001L) + "'", long59 == (-111540001L));
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone3.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone3.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone8.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone12.previousTransition((long) ' ');
        java.lang.String str15 = dateTimeZone12.getID();
        java.lang.Object obj16 = dateTimeZone12.writeReplace();
        boolean boolean17 = dateTimeZone8.equals((java.lang.Object) dateTimeZone12);
        boolean boolean18 = dateTimeZone3.equals((java.lang.Object) dateTimeZone12);
        long long20 = dateTimeZone3.convertUTCToLocal(25200010L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (-1));
        int int24 = dateTimeZone3.getOffsetFromLocal(0L);
        java.lang.String str26 = dateTimeZone3.getShortName((long) (-3600000));
        java.lang.String str27 = dateTimeZone3.getID();
        int int29 = dateTimeZone3.getOffsetFromLocal(360599966L);
        int int31 = dateTimeZone3.getStandardOffset(36000036L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200010L + "'", long20 == 25200010L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone11.previousTransition((long) ' ');
        boolean boolean14 = dateTimeZone11.isFixed();
        long long16 = dateTimeZone10.getMillisKeepLocal(dateTimeZone11, (long) ' ');
        java.util.TimeZone timeZone17 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone18.previousTransition((long) ' ');
        java.lang.String str21 = dateTimeZone18.getID();
        java.lang.Object obj22 = dateTimeZone18.writeReplace();
        int int24 = dateTimeZone18.getStandardOffset((long) 1);
        int int26 = dateTimeZone18.getStandardOffset((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        long long29 = dateTimeZone27.previousTransition((long) ' ');
        boolean boolean30 = dateTimeZone27.isFixed();
        long long32 = dateTimeZone27.nextTransition((long) 1);
        java.lang.String str33 = dateTimeZone27.getID();
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone27.getShortName((-25200001L), locale35);
        java.lang.Object obj37 = dateTimeZone27.writeReplace();
        boolean boolean38 = dateTimeZone18.equals((java.lang.Object) dateTimeZone27);
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        java.lang.String str42 = dateTimeZone40.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider43 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider43);
        boolean boolean45 = dateTimeZone40.equals((java.lang.Object) nameProvider43);
        long long48 = dateTimeZone40.convertLocalToUTC((-1L), true);
        long long50 = dateTimeZone27.getMillisKeepLocal(dateTimeZone40, (-1L));
        boolean boolean51 = dateTimeZone10.equals((java.lang.Object) dateTimeZone40);
        boolean boolean53 = dateTimeZone10.isStandardOffset(36L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertNotNull(nameProvider43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) "");
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName(10L, locale4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone0.getMillisKeepLocal(dateTimeZone7, (long) (short) 0);
        int int11 = dateTimeZone7.getStandardOffset(100L);
        java.lang.String str12 = dateTimeZone7.toString();
        long long14 = dateTimeZone7.convertUTCToLocal((-35999900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3600000) + "'", int11 == (-3600000));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-39599900L) + "'", long14 == (-39599900L));
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        int int11 = dateTimeZone1.getOffset(25200010L);
        java.lang.String str13 = dateTimeZone1.getShortName((-1L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName(115260100L, locale15);
        java.lang.String str17 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long21 = dateTimeZone19.nextTransition(25199999L);
        int int23 = dateTimeZone19.getStandardOffset(1L);
        java.lang.String str25 = dateTimeZone19.getName(0L);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long29 = dateTimeZone27.previousTransition(0L);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone27.getShortName(61200010L, locale31);
        long long34 = dateTimeZone19.getMillisKeepLocal(dateTimeZone27, (-311699990L));
        long long36 = dateTimeZone19.previousTransition((-59999L));
        long long38 = dateTimeZone1.getMillisKeepLocal(dateTimeZone19, 32400036L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 25199999L + "'", long21 == 25199999L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.001" + "'", str25, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.010" + "'", str32, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-311699999L) + "'", long34 == (-311699999L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-59999L) + "'", long36 == (-59999L));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32400035L + "'", long38 == 32400035L);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long7 = dateTimeZone0.previousTransition((long) (short) -1);
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str15 = dateTimeZone13.getNameKey(10L);
        long long17 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 1);
        long long19 = dateTimeZone11.nextTransition(10L);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.lang.String str23 = dateTimeZone21.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider24 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider24);
        boolean boolean26 = dateTimeZone21.equals((java.lang.Object) nameProvider24);
        boolean boolean27 = dateTimeZone11.equals((java.lang.Object) dateTimeZone21);
        java.lang.Object obj28 = dateTimeZone11.writeReplace();
        boolean boolean29 = dateTimeZone0.equals(obj28);
        int int31 = dateTimeZone0.getStandardOffset(32L);
        long long33 = dateTimeZone0.nextTransition(359999967L);
        long long35 = dateTimeZone0.nextTransition((long) 1);
        java.lang.Class<?> wildcardClass36 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertNotNull(nameProvider24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 359999967L + "'", long33 == 359999967L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(10);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(25200001L, locale3);
        int int6 = dateTimeZone1.getOffsetFromLocal((-3599990L));
        boolean boolean7 = dateTimeZone1.isFixed();
        boolean boolean8 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36000000 + "'", int6 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.convertUTCToLocal((-115800001L));
        long long5 = dateTimeZone1.previousTransition(600035L);
        java.lang.String str7 = dateTimeZone1.getName((-365700000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-115800000L) + "'", long3 == (-115800000L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600035L + "'", long5 == 600035L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str6 = dateTimeZone0.getID();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName((-25200001L), locale8);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        java.lang.String str11 = dateTimeZone0.toString();
        long long13 = dateTimeZone0.nextTransition((long) (-1));
        java.util.TimeZone timeZone14 = dateTimeZone0.toTimeZone();
        long long17 = dateTimeZone0.convertLocalToUTC((-35L), true);
        long long19 = dateTimeZone0.previousTransition(10L);
        boolean boolean20 = dateTimeZone0.isFixed();
        java.lang.String str21 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-35L) + "'", long17 == (-35L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, 0);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone3.getOffset(readableInstant4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone3.getShortName(126000001L, locale7);
        java.lang.String str10 = dateTimeZone3.getNameKey(395999966L);
        int int12 = dateTimeZone3.getOffsetFromLocal(36000000L);
        long long14 = dateTimeZone3.nextTransition(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology15 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 360000000 + "'", int5 == 360000000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+100:00" + "'", str8, "+100:00");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 360000000 + "'", int12 == 360000000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone3.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone3.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone8.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone12.previousTransition((long) ' ');
        java.lang.String str15 = dateTimeZone12.getID();
        java.lang.Object obj16 = dateTimeZone12.writeReplace();
        boolean boolean17 = dateTimeZone8.equals((java.lang.Object) dateTimeZone12);
        boolean boolean18 = dateTimeZone3.equals((java.lang.Object) dateTimeZone12);
        long long20 = dateTimeZone3.convertUTCToLocal(25200010L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (-1));
        java.lang.String str24 = dateTimeZone1.getNameKey((-25200001L));
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone1.isLocalDateTimeGap(localDateTime25);
        boolean boolean27 = dateTimeZone1.isFixed();
        boolean boolean29 = dateTimeZone1.isStandardOffset(323999966L);
        java.lang.String str31 = dateTimeZone1.getNameKey((-32459903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200010L + "'", long20 == 25200010L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long4 = dateTimeZone2.nextTransition((long) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long9 = dateTimeZone7.nextTransition((long) '4');
        java.lang.String str10 = dateTimeZone7.toString();
        long long12 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, 387300010L);
        long long15 = dateTimeZone7.convertLocalToUTC((-111540001L), false);
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone7.isLocalDateTimeGap(localDateTime16);
        java.util.TimeZone timeZone18 = dateTimeZone7.toTimeZone();
        int int20 = dateTimeZone7.getOffset((-324060000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:00" + "'", str10, "+01:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 387300010L + "'", long12 == 387300010L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115140001L) + "'", long15 == (-115140001L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3600000 + "'", int20 == 3600000);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 10, locale3);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        long long8 = dateTimeZone1.convertLocalToUTC((-600001L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-600002L) + "'", long8 == (-600002L));
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        int int7 = dateTimeZone0.getOffset((long) (short) 0);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getShortName(25200001L, locale9);
        long long13 = dateTimeZone0.convertLocalToUTC(0L, false);
        java.util.TimeZone timeZone14 = dateTimeZone0.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str5 = dateTimeZone1.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone6.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone10.previousTransition((long) ' ');
        java.lang.String str13 = dateTimeZone10.getID();
        java.lang.Object obj14 = dateTimeZone10.writeReplace();
        boolean boolean15 = dateTimeZone6.equals((java.lang.Object) dateTimeZone10);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone10.isLocalDateTimeGap(localDateTime17);
        java.lang.Object obj19 = null;
        boolean boolean20 = dateTimeZone10.equals(obj19);
        int int22 = dateTimeZone10.getOffsetFromLocal(324000000L);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone10.getName(363539999L, locale24);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        long long8 = dateTimeZone1.nextTransition((long) '4');
        long long10 = dateTimeZone1.convertUTCToLocal((long) (short) -1);
        long long12 = dateTimeZone1.previousTransition((-600000L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str15 = dateTimeZone1.getNameKey(600000L);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone1.getOffset(readableInstant16);
        java.lang.Object obj18 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-600000L) + "'", long12 == (-600000L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone3.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone3.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone8.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone12.previousTransition((long) ' ');
        java.lang.String str15 = dateTimeZone12.getID();
        java.lang.Object obj16 = dateTimeZone12.writeReplace();
        boolean boolean17 = dateTimeZone8.equals((java.lang.Object) dateTimeZone12);
        boolean boolean18 = dateTimeZone3.equals((java.lang.Object) dateTimeZone12);
        long long20 = dateTimeZone3.convertUTCToLocal(25200010L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (-1));
        java.lang.String str24 = dateTimeZone1.getNameKey((-25200001L));
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone1.isLocalDateTimeGap(localDateTime25);
        boolean boolean27 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone28 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = dateTimeZone30.getOffset(readableInstant31);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        long long35 = dateTimeZone33.previousTransition((long) ' ');
        java.lang.String str36 = dateTimeZone33.getID();
        java.lang.String str38 = dateTimeZone33.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant39 = null;
        int int40 = dateTimeZone33.getOffset(readableInstant39);
        long long42 = dateTimeZone30.getMillisKeepLocal(dateTimeZone33, (long) '#');
        org.joda.time.LocalDateTime localDateTime43 = null;
        boolean boolean44 = dateTimeZone33.isLocalDateTimeGap(localDateTime43);
        java.lang.String str46 = dateTimeZone33.getNameKey((long) 0);
        java.lang.Object obj47 = dateTimeZone33.writeReplace();
        int int49 = dateTimeZone33.getOffset((long) 36000000);
        long long52 = dateTimeZone33.convertLocalToUTC(38100001L, false);
        boolean boolean53 = dateTimeZone1.equals((java.lang.Object) 38100001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200010L + "'", long20 == 25200010L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 35L + "'", long42 == 35L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UTC" + "'", str46, "UTC");
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 38100001L + "'", long52 == 38100001L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        int int3 = dateTimeZone1.getOffset((-3600035L));
        java.lang.Object obj4 = dateTimeZone1.writeReplace();
        java.lang.String str6 = dateTimeZone1.getName((-25200001L));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName(387300010L, locale8);
        int int11 = dateTimeZone1.getOffsetFromLocal(3600003L);
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        java.lang.String str14 = dateTimeZone1.getShortName(151200010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        java.lang.String str10 = dateTimeZone1.getID();
        boolean boolean11 = dateTimeZone1.isFixed();
        java.lang.String str13 = dateTimeZone1.getShortName((long) ' ');
        java.lang.String str15 = dateTimeZone1.getShortName(362099999L);
        long long17 = dateTimeZone1.previousTransition(101L);
        int int19 = dateTimeZone1.getStandardOffset(358439999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 101L + "'", long17 == 101L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long7 = dateTimeZone0.previousTransition((long) (short) -1);
        int int9 = dateTimeZone0.getStandardOffset((long) 0);
        long long11 = dateTimeZone0.convertUTCToLocal((long) ' ');
        java.lang.String str13 = dateTimeZone0.getName((long) 600000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone0.getShortName(3540000L, locale16);
        long long19 = dateTimeZone0.nextTransition((-471540001L));
        boolean boolean21 = dateTimeZone0.isStandardOffset((-359999903L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-471540001L) + "'", long19 == (-471540001L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str6 = dateTimeZone0.getID();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName((-25200001L), locale8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getName((long) (-3600000), locale12);
        long long15 = dateTimeZone0.nextTransition(4199965L);
        long long17 = dateTimeZone0.convertUTCToLocal(25200011L);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long21 = dateTimeZone19.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone19.isLocalDateTimeGap(localDateTime22);
        java.lang.Object obj24 = dateTimeZone19.writeReplace();
        int int26 = dateTimeZone19.getOffsetFromLocal((long) '#');
        long long28 = dateTimeZone0.getMillisKeepLocal(dateTimeZone19, (long) 97);
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = dateTimeZone0.isLocalDateTimeGap(localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        long long33 = dateTimeZone31.previousTransition((long) ' ');
        java.lang.String str34 = dateTimeZone31.getID();
        java.lang.String str36 = dateTimeZone31.getShortName((long) (short) 0);
        long long39 = dateTimeZone31.convertLocalToUTC((long) (byte) 100, true);
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone31.getName((long) (byte) 1, locale41);
        int int44 = dateTimeZone31.getStandardOffset(10L);
        org.joda.time.LocalDateTime localDateTime45 = null;
        boolean boolean46 = dateTimeZone31.isLocalDateTimeGap(localDateTime45);
        java.util.TimeZone timeZone47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        java.lang.String str50 = dateTimeZone48.getNameKey(10L);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.UTC;
        long long53 = dateTimeZone51.previousTransition((long) ' ');
        java.lang.String str54 = dateTimeZone51.getID();
        java.lang.String str56 = dateTimeZone51.getShortName((long) (short) 0);
        long long59 = dateTimeZone51.convertLocalToUTC((long) (byte) 100, true);
        java.lang.Object obj60 = dateTimeZone51.writeReplace();
        boolean boolean61 = dateTimeZone48.equals((java.lang.Object) dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long65 = dateTimeZone48.getMillisKeepLocal(dateTimeZone63, 0L);
        long long67 = dateTimeZone31.getMillisKeepLocal(dateTimeZone63, 0L);
        org.joda.time.ReadableInstant readableInstant68 = null;
        int int69 = dateTimeZone31.getOffset(readableInstant68);
        java.lang.Object obj70 = dateTimeZone31.writeReplace();
        boolean boolean71 = dateTimeZone0.equals((java.lang.Object) dateTimeZone31);
        java.util.TimeZone timeZone72 = dateTimeZone0.toTimeZone();
        long long74 = dateTimeZone0.convertUTCToLocal(4199965L);
        long long76 = dateTimeZone0.convertUTCToLocal(360599966L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4199965L + "'", long15 == 4199965L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 25200011L + "'", long17 == 25200011L);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 25199999L + "'", long21 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 96L + "'", long28 == 96L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "UTC" + "'", str50, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 32L + "'", long53 == 32L);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "UTC" + "'", str54, "UTC");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00" + "'", str56, "+00:00");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 100L + "'", long59 == 100L);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-35L) + "'", long65 == (-35L));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-35L) + "'", long67 == (-35L));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(timeZone72);
        org.junit.Assert.assertEquals(timeZone72.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 4199965L + "'", long74 == 4199965L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 360599966L + "'", long76 == 360599966L);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.Object obj4 = dateTimeZone0.writeReplace();
        int int6 = dateTimeZone0.getStandardOffset((long) 1);
        java.lang.String str7 = dateTimeZone0.getID();
        java.lang.String str9 = dateTimeZone0.getName((long) 360000000);
        long long11 = dateTimeZone0.nextTransition(599965L);
        long long14 = dateTimeZone0.convertLocalToUTC((-3660035L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 599965L + "'", long11 == 599965L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3660035L) + "'", long14 == (-3660035L));
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str5 = dateTimeZone1.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone6.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone10.previousTransition((long) ' ');
        java.lang.String str13 = dateTimeZone10.getID();
        java.lang.Object obj14 = dateTimeZone10.writeReplace();
        boolean boolean15 = dateTimeZone6.equals((java.lang.Object) dateTimeZone10);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) dateTimeZone10);
        java.lang.String str17 = dateTimeZone10.toString();
        java.lang.Object obj18 = dateTimeZone10.writeReplace();
        long long20 = dateTimeZone10.previousTransition((-48L));
        java.util.TimeZone timeZone21 = dateTimeZone10.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-48L) + "'", long20 == (-48L));
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(1L);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) '4');
        boolean boolean9 = dateTimeZone1.isFixed();
        java.lang.String str10 = dateTimeZone1.toString();
        long long13 = dateTimeZone1.convertLocalToUTC(385200001L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 385200000L + "'", long13 == 385200000L);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone4.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone4.getNameKey((long) (-4200000));
        boolean boolean10 = dateTimeZone4.isStandardOffset(39599899L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        int int3 = dateTimeZone1.getStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long8 = dateTimeZone6.nextTransition((long) '4');
        java.lang.String str9 = dateTimeZone6.toString();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone6.getName((long) (byte) 0, locale11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.String str16 = dateTimeZone14.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider17 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider17);
        boolean boolean19 = dateTimeZone14.equals((java.lang.Object) nameProvider17);
        long long22 = dateTimeZone14.convertLocalToUTC((-1L), true);
        java.lang.String str23 = dateTimeZone14.getID();
        boolean boolean25 = dateTimeZone14.isStandardOffset((long) 1);
        boolean boolean26 = dateTimeZone6.equals((java.lang.Object) boolean25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        long long29 = dateTimeZone27.previousTransition((long) ' ');
        java.lang.String str30 = dateTimeZone27.getID();
        java.lang.String str32 = dateTimeZone27.getShortName((long) (short) 0);
        long long34 = dateTimeZone27.previousTransition((long) (short) -1);
        int int36 = dateTimeZone27.getStandardOffset((long) 0);
        long long38 = dateTimeZone27.convertUTCToLocal((long) ' ');
        java.lang.String str40 = dateTimeZone27.getName((long) 600000);
        long long42 = dateTimeZone6.getMillisKeepLocal(dateTimeZone27, 3L);
        long long44 = dateTimeZone27.convertUTCToLocal(25200000L);
        long long46 = dateTimeZone1.getMillisKeepLocal(dateTimeZone27, 3540000L);
        java.lang.String str47 = dateTimeZone1.getID();
        java.util.TimeZone timeZone48 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+01:00" + "'", str9, "+01:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:00" + "'", str12, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(nameProvider17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 3600003L + "'", long42 == 3600003L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 25200000L + "'", long44 == 25200000L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 3540001L + "'", long46 == 3540001L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00:00.001" + "'", str47, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str5 = dateTimeZone1.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone6.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone10.previousTransition((long) ' ');
        java.lang.String str13 = dateTimeZone10.getID();
        java.lang.Object obj14 = dateTimeZone10.writeReplace();
        boolean boolean15 = dateTimeZone6.equals((java.lang.Object) dateTimeZone10);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) dateTimeZone10);
        boolean boolean18 = dateTimeZone1.isStandardOffset(3599999L);
        long long20 = dateTimeZone1.previousTransition((long) (short) 1);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone1.isLocalDateTimeGap(localDateTime21);
        int int24 = dateTimeZone1.getStandardOffset(120000L);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.lang.String str30 = dateTimeZone28.getNameKey(10L);
        long long32 = dateTimeZone26.getMillisKeepLocal(dateTimeZone28, (long) 1);
        java.util.TimeZone timeZone33 = dateTimeZone26.toTimeZone();
        java.util.TimeZone timeZone34 = dateTimeZone26.toTimeZone();
        java.lang.String str36 = dateTimeZone26.getName((long) 0);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        long long39 = dateTimeZone37.previousTransition((long) ' ');
        boolean boolean40 = dateTimeZone37.isFixed();
        long long42 = dateTimeZone37.nextTransition((long) 1);
        java.lang.String str43 = dateTimeZone37.getID();
        java.lang.String str44 = dateTimeZone37.toString();
        java.util.Locale locale46 = null;
        java.lang.String str47 = dateTimeZone37.getName(0L, locale46);
        java.lang.String str48 = dateTimeZone37.toString();
        boolean boolean50 = dateTimeZone37.isStandardOffset((long) (-1));
        long long52 = dateTimeZone26.getMillisKeepLocal(dateTimeZone37, 360000001L);
        java.lang.String str54 = dateTimeZone26.getName(3600003L);
        long long56 = dateTimeZone1.getMillisKeepLocal(dateTimeZone26, 28799958L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 32L + "'", long39 == 32L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTC" + "'", str43, "UTC");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00" + "'", str47, "+00:00");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "UTC" + "'", str48, "UTC");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 360000001L + "'", long52 == 360000001L);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00" + "'", str54, "+00:00");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 28799958L + "'", long56 == 28799958L);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getName(100L, locale11);
        long long15 = dateTimeZone0.convertLocalToUTC((long) (short) 10, false);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone0.getOffset(readableInstant16);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str19 = dateTimeZone0.toString();
        java.lang.String str21 = dateTimeZone0.getShortName((long) (byte) 1);
        long long24 = dateTimeZone0.convertLocalToUTC(25200035L, false);
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone0.isLocalDateTimeGap(localDateTime25);
        int int28 = dateTimeZone0.getStandardOffset(600035L);
        boolean boolean29 = dateTimeZone0.isFixed();
        java.lang.String str31 = dateTimeZone0.getName((-25199901L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 25200035L + "'", long24 == 25200035L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long4 = dateTimeZone2.nextTransition((long) '4');
        java.lang.String str5 = dateTimeZone2.toString();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getName((long) (byte) 0, locale7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = dateTimeZone10.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider13 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider13);
        boolean boolean15 = dateTimeZone10.equals((java.lang.Object) nameProvider13);
        long long18 = dateTimeZone10.convertLocalToUTC((-1L), true);
        java.lang.String str19 = dateTimeZone10.getID();
        boolean boolean21 = dateTimeZone10.isStandardOffset((long) 1);
        boolean boolean22 = dateTimeZone2.equals((java.lang.Object) boolean21);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        long long25 = dateTimeZone23.previousTransition((long) ' ');
        java.lang.String str26 = dateTimeZone23.getID();
        java.lang.String str28 = dateTimeZone23.getShortName((long) (short) 0);
        long long30 = dateTimeZone23.previousTransition((long) (short) -1);
        int int32 = dateTimeZone23.getStandardOffset((long) 0);
        long long34 = dateTimeZone23.convertUTCToLocal((long) ' ');
        java.lang.String str36 = dateTimeZone23.getName((long) 600000);
        long long38 = dateTimeZone2.getMillisKeepLocal(dateTimeZone23, 3L);
        long long40 = dateTimeZone23.convertUTCToLocal(25200000L);
        boolean boolean42 = dateTimeZone23.isStandardOffset((long) (-3600000));
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone23.getName(3600000L, locale44);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.util.Locale locale49 = null;
        java.lang.String str50 = dateTimeZone47.getName((long) (short) 1, locale49);
        long long52 = dateTimeZone23.getMillisKeepLocal(dateTimeZone47, (long) 25200000);
        java.util.TimeZone timeZone53 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        java.lang.String str56 = dateTimeZone54.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider57 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider57);
        boolean boolean59 = dateTimeZone54.equals((java.lang.Object) nameProvider57);
        long long62 = dateTimeZone54.convertLocalToUTC((-1L), true);
        java.lang.String str63 = dateTimeZone54.getID();
        boolean boolean65 = dateTimeZone54.isStandardOffset((long) 1);
        long long67 = dateTimeZone54.previousTransition((-3600035L));
        long long69 = dateTimeZone54.nextTransition((long) 36000000);
        java.lang.String str71 = dateTimeZone54.getName(362100100L);
        java.lang.String str72 = dateTimeZone54.toString();
        long long74 = dateTimeZone23.getMillisKeepLocal(dateTimeZone54, (-4200096L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:00" + "'", str5, "+01:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:00" + "'", str8, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(nameProvider13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 3600003L + "'", long38 == 3600003L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 25200000L + "'", long40 == 25200000L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00" + "'", str45, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00:00.001" + "'", str50, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 25199999L + "'", long52 == 25199999L);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "UTC" + "'", str56, "UTC");
        org.junit.Assert.assertNotNull(nameProvider57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "UTC" + "'", str63, "UTC");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-3600035L) + "'", long67 == (-3600035L));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 36000000L + "'", long69 == 36000000L);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "+00:00" + "'", str71, "+00:00");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "UTC" + "'", str72, "UTC");
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-4200096L) + "'", long74 == (-4200096L));
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(0L, locale3);
        long long7 = dateTimeZone1.convertLocalToUTC(0L, true);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) (byte) -1);
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) 35L);
        int int13 = dateTimeZone1.getOffset((-599990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.097" + "'", str4, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-97L) + "'", long7 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getShortName((long) (short) 0);
        long long12 = dateTimeZone4.convertLocalToUTC((long) (byte) 100, true);
        java.lang.Object obj13 = dateTimeZone4.writeReplace();
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, 0L);
        java.util.TimeZone timeZone19 = dateTimeZone1.toTimeZone();
        java.lang.String str21 = dateTimeZone1.getShortName((long) 'a');
        java.lang.String str22 = dateTimeZone1.toString();
        int int24 = dateTimeZone1.getOffsetFromLocal((-25200001L));
        java.lang.String str25 = dateTimeZone1.getID();
        int int27 = dateTimeZone1.getOffsetFromLocal((-337499990L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-35L) + "'", long18 == (-35L));
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName(32L, locale5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone0.getOffset(readableInstant7);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getName(100L, locale11);
        int int14 = dateTimeZone0.getOffsetFromLocal(32L);
        long long16 = dateTimeZone0.convertUTCToLocal((long) (byte) 100);
        long long18 = dateTimeZone0.nextTransition((long) 0);
        java.util.TimeZone timeZone19 = dateTimeZone0.toTimeZone();
        boolean boolean20 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long24 = dateTimeZone0.getMillisKeepLocal(dateTimeZone22, (long) '4');
        long long27 = dateTimeZone0.convertLocalToUTC((-3600035L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-48L) + "'", long24 == (-48L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-3600035L) + "'", long27 == (-3600035L));
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone11.previousTransition((long) ' ');
        boolean boolean14 = dateTimeZone11.isFixed();
        long long16 = dateTimeZone10.getMillisKeepLocal(dateTimeZone11, (long) ' ');
        boolean boolean18 = dateTimeZone10.isStandardOffset((long) (byte) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        java.lang.String str11 = dateTimeZone1.getName((long) 0);
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        int int16 = dateTimeZone14.getStandardOffset(52L);
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, (long) (short) 100);
        java.lang.Object obj19 = dateTimeZone1.writeReplace();
        int int21 = dateTimeZone1.getOffsetFromLocal(39599899L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 360000000 + "'", int16 == 360000000);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-359999900L) + "'", long18 == (-359999900L));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName(50400010L, locale4);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        java.lang.String str8 = dateTimeZone1.getShortName(362700000L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((-361500000L), locale10);
        java.lang.String str13 = dateTimeZone1.getNameKey((-127500035L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(25200011L);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.lang.String str8 = dateTimeZone6.getNameKey(10L);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone6, (long) 1);
        java.lang.String str12 = dateTimeZone4.getName((long) 0);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone4.getName(25200035L, locale14);
        long long18 = dateTimeZone4.convertLocalToUTC(25200010L, true);
        int int20 = dateTimeZone4.getStandardOffset((-1L));
        int int22 = dateTimeZone4.getOffset((long) '4');
        int int24 = dateTimeZone4.getOffset((long) (short) 10);
        int int26 = dateTimeZone4.getStandardOffset(1L);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone4.isLocalDateTimeGap(localDateTime27);
        long long30 = dateTimeZone4.convertUTCToLocal(599965L);
        boolean boolean31 = dateTimeZone4.isFixed();
        long long33 = dateTimeZone4.convertUTCToLocal((long) 10);
        long long35 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, 25260010L);
        int int37 = dateTimeZone0.getOffsetFromLocal(3600012L);
        long long39 = dateTimeZone0.previousTransition(3600112L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25200010L + "'", long18 == 25200010L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 599965L + "'", long30 == 599965L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 25260010L + "'", long35 == 25260010L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 3600112L + "'", long39 == 3600112L);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean3 = dateTimeZone0.isStandardOffset((-308159964L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(25200035L, locale11);
        int int14 = dateTimeZone1.getOffset((long) '4');
        java.lang.Object obj15 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone16 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone18.getName(1L, locale20);
        java.lang.String str23 = dateTimeZone18.getNameKey((long) ' ');
        boolean boolean24 = dateTimeZone1.equals((java.lang.Object) str23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.001" + "'", str21, "+00:00:00.001");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str5 = dateTimeZone1.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone6.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone10.previousTransition((long) ' ');
        java.lang.String str13 = dateTimeZone10.getID();
        java.lang.Object obj14 = dateTimeZone10.writeReplace();
        boolean boolean15 = dateTimeZone6.equals((java.lang.Object) dateTimeZone10);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) dateTimeZone10);
        java.lang.String str17 = dateTimeZone10.toString();
        java.lang.Object obj18 = dateTimeZone10.writeReplace();
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone10.getOffset(readableInstant19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        java.lang.String str11 = dateTimeZone1.getNameKey((-25200001L));
        java.lang.String str12 = dateTimeZone1.getID();
        long long14 = dateTimeZone1.previousTransition((-25200001L));
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        int int18 = dateTimeZone1.getStandardOffset((-600001L));
        long long20 = dateTimeZone1.nextTransition((-3660001L));
        long long22 = dateTimeZone1.previousTransition(61800010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-25200001L) + "'", long14 == (-25200001L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-3660001L) + "'", long20 == (-3660001L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 61800010L + "'", long22 == 61800010L);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 1);
        boolean boolean4 = dateTimeZone3.isFixed();
        int int6 = dateTimeZone3.getStandardOffset((-35L));
        int int8 = dateTimeZone3.getOffsetFromLocal((-36600000L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology9 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3660000 + "'", int6 == 3660000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3660000 + "'", int8 == 3660000);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone3.previousTransition((long) ' ');
        boolean boolean6 = dateTimeZone3.isFixed();
        long long8 = dateTimeZone3.nextTransition((long) 1);
        long long11 = dateTimeZone3.convertLocalToUTC((long) (byte) 10, false);
        java.lang.Object obj12 = dateTimeZone3.writeReplace();
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone3, (long) (byte) 100);
        long long17 = dateTimeZone3.convertLocalToUTC(324000000L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.lang.Class<?> wildcardClass19 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115260100L + "'", long14 == 115260100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 324000000L + "'", long17 == 324000000L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        boolean boolean11 = dateTimeZone0.isStandardOffset(25200035L);
        int int13 = dateTimeZone0.getOffset(360000052L);
        java.util.TimeZone timeZone14 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str16 = dateTimeZone15.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str5 = dateTimeZone1.getNameKey((long) '4');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((long) '4', locale7);
        int int10 = dateTimeZone1.getOffset((long) 100);
        long long12 = dateTimeZone1.previousTransition(324000001L);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 324000001L + "'", long12 == 324000001L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 362100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 362100000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        long long9 = dateTimeZone1.nextTransition(10L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone10.previousTransition((long) ' ');
        java.lang.String str13 = dateTimeZone10.getID();
        java.lang.String str15 = dateTimeZone10.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone10.getOffset(readableInstant16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone10.getName((long) (byte) -1, locale19);
        int int22 = dateTimeZone10.getOffsetFromLocal((long) (byte) 100);
        long long25 = dateTimeZone10.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str27 = dateTimeZone10.getName(600035L);
        boolean boolean28 = dateTimeZone1.equals((java.lang.Object) str27);
        int int30 = dateTimeZone1.getOffsetFromLocal(0L);
        long long33 = dateTimeZone1.convertLocalToUTC(60001L, false);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        long long36 = dateTimeZone34.previousTransition((long) ' ');
        boolean boolean37 = dateTimeZone34.isFixed();
        long long39 = dateTimeZone34.nextTransition((long) 1);
        int int41 = dateTimeZone34.getOffset((long) (short) 0);
        int int43 = dateTimeZone34.getOffset((long) (byte) 10);
        long long46 = dateTimeZone34.convertLocalToUTC(0L, false);
        java.util.Locale locale48 = null;
        java.lang.String str49 = dateTimeZone34.getName((long) 360000000, locale48);
        java.util.TimeZone timeZone50 = dateTimeZone34.toTimeZone();
        java.lang.String str51 = dateTimeZone34.toString();
        long long53 = dateTimeZone1.getMillisKeepLocal(dateTimeZone34, (-48L));
        int int55 = dateTimeZone34.getOffsetFromLocal((-334739989L));
        java.util.TimeZone timeZone56 = dateTimeZone34.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 60001L + "'", long33 == 60001L);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00" + "'", str49, "+00:00");
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "UTC" + "'", str51, "UTC");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-48L) + "'", long53 == (-48L));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(timeZone56);
        org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3660000), (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((long) (byte) -1, locale10);
        int int13 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        java.lang.String str14 = dateTimeZone1.getID();
        java.lang.String str15 = dateTimeZone1.toString();
        long long17 = dateTimeZone1.convertUTCToLocal((-36600000L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology18 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-36600000L) + "'", long17 == (-36600000L));
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (int) ' ');
        boolean boolean3 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getStandardOffset((long) 25200000);
        java.lang.String str7 = dateTimeZone1.getName(100L);
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        java.lang.String str10 = dateTimeZone1.getNameKey(25200009L);
        boolean boolean11 = dateTimeZone1.isFixed();
        java.lang.String str13 = dateTimeZone1.getShortName((-362039999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone3.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone3.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone8.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone12.previousTransition((long) ' ');
        java.lang.String str15 = dateTimeZone12.getID();
        java.lang.Object obj16 = dateTimeZone12.writeReplace();
        boolean boolean17 = dateTimeZone8.equals((java.lang.Object) dateTimeZone12);
        boolean boolean18 = dateTimeZone3.equals((java.lang.Object) dateTimeZone12);
        long long20 = dateTimeZone3.convertUTCToLocal(25200010L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (-1));
        long long24 = dateTimeZone3.previousTransition((-35L));
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone3.getShortName(0L, locale26);
        boolean boolean28 = dateTimeZone3.isFixed();
        long long30 = dateTimeZone3.nextTransition((-36600000L));
        java.util.TimeZone timeZone31 = dateTimeZone3.toTimeZone();
        org.joda.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = dateTimeZone3.isLocalDateTimeGap(localDateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200010L + "'", long20 == 25200010L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-35L) + "'", long24 == (-35L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-36600000L) + "'", long30 == (-36600000L));
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+10:00");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long6 = dateTimeZone4.nextTransition((long) '4');
        java.lang.String str7 = dateTimeZone4.toString();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone4.getName((long) (byte) 0, locale9);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str14 = dateTimeZone12.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider15 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider15);
        boolean boolean17 = dateTimeZone12.equals((java.lang.Object) nameProvider15);
        long long20 = dateTimeZone12.convertLocalToUTC((-1L), true);
        java.lang.String str21 = dateTimeZone12.getID();
        boolean boolean23 = dateTimeZone12.isStandardOffset((long) 1);
        boolean boolean24 = dateTimeZone4.equals((java.lang.Object) boolean23);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        long long27 = dateTimeZone25.previousTransition((long) ' ');
        java.lang.String str28 = dateTimeZone25.getID();
        java.lang.String str30 = dateTimeZone25.getShortName((long) (short) 0);
        long long32 = dateTimeZone25.previousTransition((long) (short) -1);
        int int34 = dateTimeZone25.getStandardOffset((long) 0);
        long long36 = dateTimeZone25.convertUTCToLocal((long) ' ');
        java.lang.String str38 = dateTimeZone25.getName((long) 600000);
        long long40 = dateTimeZone4.getMillisKeepLocal(dateTimeZone25, 3L);
        long long42 = dateTimeZone25.convertUTCToLocal(25200000L);
        boolean boolean44 = dateTimeZone25.isStandardOffset((long) (-3600000));
        java.lang.String str45 = dateTimeZone25.getID();
        long long47 = dateTimeZone1.getMillisKeepLocal(dateTimeZone25, (long) 600000);
        long long49 = dateTimeZone25.convertUTCToLocal(600035L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        boolean boolean51 = dateTimeZone25.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:00" + "'", str7, "+01:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:00" + "'", str10, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(nameProvider15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 3600003L + "'", long40 == 3600003L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 25200000L + "'", long42 == 25200000L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UTC" + "'", str45, "UTC");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 36600000L + "'", long47 == 36600000L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 600035L + "'", long49 == 600035L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) "");
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName(10L, locale4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone0.getMillisKeepLocal(dateTimeZone7, (long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) '#');
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone12, 24600010L);
        java.lang.String str15 = dateTimeZone12.getID();
        boolean boolean16 = dateTimeZone12.isFixed();
        long long18 = dateTimeZone12.convertUTCToLocal((-3600035L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-337499990L) + "'", long14 == (-337499990L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+100:35" + "'", str15, "+100:35");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 358499965L + "'", long18 == 358499965L);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        boolean boolean10 = dateTimeZone9.isFixed();
        int int12 = dateTimeZone9.getOffset((-600000L));
        java.lang.String str14 = dateTimeZone9.getName(0L);
        java.util.TimeZone timeZone15 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25199999L + "'", long3 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        int int3 = dateTimeZone1.getStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long8 = dateTimeZone6.nextTransition((long) '4');
        java.lang.String str9 = dateTimeZone6.toString();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone6.getName((long) (byte) 0, locale11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.String str16 = dateTimeZone14.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider17 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider17);
        boolean boolean19 = dateTimeZone14.equals((java.lang.Object) nameProvider17);
        long long22 = dateTimeZone14.convertLocalToUTC((-1L), true);
        java.lang.String str23 = dateTimeZone14.getID();
        boolean boolean25 = dateTimeZone14.isStandardOffset((long) 1);
        boolean boolean26 = dateTimeZone6.equals((java.lang.Object) boolean25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        long long29 = dateTimeZone27.previousTransition((long) ' ');
        java.lang.String str30 = dateTimeZone27.getID();
        java.lang.String str32 = dateTimeZone27.getShortName((long) (short) 0);
        long long34 = dateTimeZone27.previousTransition((long) (short) -1);
        int int36 = dateTimeZone27.getStandardOffset((long) 0);
        long long38 = dateTimeZone27.convertUTCToLocal((long) ' ');
        java.lang.String str40 = dateTimeZone27.getName((long) 600000);
        long long42 = dateTimeZone6.getMillisKeepLocal(dateTimeZone27, 3L);
        long long44 = dateTimeZone27.convertUTCToLocal(25200000L);
        long long46 = dateTimeZone1.getMillisKeepLocal(dateTimeZone27, 3540000L);
        org.joda.time.LocalDateTime localDateTime47 = null;
        boolean boolean48 = dateTimeZone1.isLocalDateTimeGap(localDateTime47);
        java.lang.String str50 = dateTimeZone1.getName(25200036L);
        int int52 = dateTimeZone1.getOffsetFromLocal(360599966L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+01:00" + "'", str9, "+01:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:00" + "'", str12, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(nameProvider17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 3600003L + "'", long42 == 3600003L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 25200000L + "'", long44 == 25200000L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 3540001L + "'", long46 == 3540001L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00:00.001" + "'", str50, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long4 = dateTimeZone2.nextTransition((long) '4');
        java.lang.String str5 = dateTimeZone2.toString();
        long long8 = dateTimeZone2.convertLocalToUTC(0L, false);
        int int10 = dateTimeZone2.getStandardOffset((-1L));
        long long12 = dateTimeZone2.previousTransition(115260100L);
        java.lang.String str14 = dateTimeZone2.getNameKey(98L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:00" + "'", str5, "+01:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3600000L) + "'", long8 == (-3600000L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3600000 + "'", int10 == 3600000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115260100L + "'", long12 == 115260100L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(25200035L, locale11);
        long long15 = dateTimeZone1.convertLocalToUTC(25200010L, true);
        int int17 = dateTimeZone1.getStandardOffset((-1L));
        int int19 = dateTimeZone1.getOffset((long) '4');
        int int21 = dateTimeZone1.getOffset((long) (short) 10);
        int int23 = dateTimeZone1.getStandardOffset(1L);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone1.isLocalDateTimeGap(localDateTime24);
        java.lang.String str27 = dateTimeZone1.getNameKey((-362100000L));
        boolean boolean29 = dateTimeZone1.isStandardOffset(431999966L);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 0);
        long long34 = dateTimeZone1.getMillisKeepLocal(dateTimeZone32, 25260011L);
        long long36 = dateTimeZone32.nextTransition(600035L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25200010L + "'", long15 == 25200010L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-334739989L) + "'", long34 == (-334739989L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 600035L + "'", long36 == 600035L);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str4 = dateTimeZone2.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider5 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider5);
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) nameProvider5);
        long long10 = dateTimeZone2.convertLocalToUTC((-1L), true);
        java.lang.String str12 = dateTimeZone2.getNameKey((-25200001L));
        java.lang.String str13 = dateTimeZone2.getID();
        long long15 = dateTimeZone2.previousTransition((-25200001L));
        long long18 = dateTimeZone2.convertLocalToUTC((long) (short) 10, true);
        java.lang.Object obj19 = dateTimeZone2.writeReplace();
        boolean boolean20 = dateTimeZone2.isFixed();
        java.lang.String str22 = dateTimeZone2.getShortName(3599899L);
        java.lang.Object obj23 = null;
        boolean boolean24 = dateTimeZone2.equals(obj23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone2.getOffset(readableInstant25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology27 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(nameProvider5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-25200001L) + "'", long15 == (-25200001L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        java.lang.String str11 = dateTimeZone4.getName(97L);
        int int13 = dateTimeZone4.getStandardOffset((long) 10);
        int int15 = dateTimeZone4.getStandardOffset((long) (-3600000));
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone4.getName((long) 360000000, locale17);
        java.lang.String str19 = dateTimeZone4.getID();
        boolean boolean20 = dateTimeZone4.isFixed();
        boolean boolean21 = dateTimeZone4.isFixed();
        java.lang.String str23 = dateTimeZone4.getShortName(35L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(1L);
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        java.lang.String str9 = dateTimeZone1.getName((long) (-3600000));
        int int11 = dateTimeZone1.getOffsetFromLocal((long) '#');
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((long) (-1), locale13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(35);
        java.lang.String str2 = dateTimeZone1.getID();
        boolean boolean3 = dateTimeZone1.isFixed();
        boolean boolean4 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+35:00" + "'", str2, "+35:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(25200035L, locale11);
        long long15 = dateTimeZone1.convertLocalToUTC(25200010L, true);
        int int17 = dateTimeZone1.getStandardOffset((-1L));
        int int19 = dateTimeZone1.getOffset((long) '4');
        int int21 = dateTimeZone1.getOffset((long) (short) 10);
        int int23 = dateTimeZone1.getStandardOffset(1L);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone1.isLocalDateTimeGap(localDateTime24);
        long long27 = dateTimeZone1.previousTransition(25200001L);
        java.lang.String str28 = dateTimeZone1.getID();
        long long30 = dateTimeZone1.nextTransition((-21600000L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = dateTimeZone1.isLocalDateTimeGap(localDateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25200009L + "'", long15 == 25200009L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 25200001L + "'", long27 == 25200001L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.001" + "'", str28, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-21600000L) + "'", long30 == (-21600000L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str6 = dateTimeZone0.getID();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName((-25200001L), locale8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getName((long) (-3600000), locale12);
        long long15 = dateTimeZone0.nextTransition(4199965L);
        long long17 = dateTimeZone0.convertUTCToLocal(25200011L);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long21 = dateTimeZone19.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone19.isLocalDateTimeGap(localDateTime22);
        java.lang.Object obj24 = dateTimeZone19.writeReplace();
        int int26 = dateTimeZone19.getOffsetFromLocal((long) '#');
        long long28 = dateTimeZone0.getMillisKeepLocal(dateTimeZone19, (long) 97);
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = dateTimeZone0.isLocalDateTimeGap(localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        long long33 = dateTimeZone31.previousTransition((long) ' ');
        java.lang.String str34 = dateTimeZone31.getID();
        java.lang.String str36 = dateTimeZone31.getShortName((long) (short) 0);
        long long39 = dateTimeZone31.convertLocalToUTC((long) (byte) 100, true);
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone31.getName((long) (byte) 1, locale41);
        int int44 = dateTimeZone31.getStandardOffset(10L);
        org.joda.time.LocalDateTime localDateTime45 = null;
        boolean boolean46 = dateTimeZone31.isLocalDateTimeGap(localDateTime45);
        java.util.TimeZone timeZone47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        java.lang.String str50 = dateTimeZone48.getNameKey(10L);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.UTC;
        long long53 = dateTimeZone51.previousTransition((long) ' ');
        java.lang.String str54 = dateTimeZone51.getID();
        java.lang.String str56 = dateTimeZone51.getShortName((long) (short) 0);
        long long59 = dateTimeZone51.convertLocalToUTC((long) (byte) 100, true);
        java.lang.Object obj60 = dateTimeZone51.writeReplace();
        boolean boolean61 = dateTimeZone48.equals((java.lang.Object) dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long65 = dateTimeZone48.getMillisKeepLocal(dateTimeZone63, 0L);
        long long67 = dateTimeZone31.getMillisKeepLocal(dateTimeZone63, 0L);
        org.joda.time.ReadableInstant readableInstant68 = null;
        int int69 = dateTimeZone31.getOffset(readableInstant68);
        java.lang.Object obj70 = dateTimeZone31.writeReplace();
        boolean boolean71 = dateTimeZone0.equals((java.lang.Object) dateTimeZone31);
        java.util.Locale locale73 = null;
        java.lang.String str74 = dateTimeZone0.getShortName(3480001L, locale73);
        long long77 = dateTimeZone0.convertLocalToUTC(431999966L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4199965L + "'", long15 == 4199965L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 25200011L + "'", long17 == 25200011L);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 25199999L + "'", long21 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 96L + "'", long28 == 96L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "UTC" + "'", str50, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 32L + "'", long53 == 32L);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "UTC" + "'", str54, "UTC");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00" + "'", str56, "+00:00");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 100L + "'", long59 == 100L);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-35L) + "'", long65 == (-35L));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-35L) + "'", long67 == (-35L));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "+00:00" + "'", str74, "+00:00");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 431999966L + "'", long77 == 431999966L);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str3 = dateTimeZone1.getShortName(25199999L);
        int int5 = dateTimeZone1.getStandardOffset(0L);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.String str7 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getShortName((long) (short) 0);
        long long12 = dateTimeZone4.convertLocalToUTC((long) (byte) 100, true);
        java.lang.Object obj13 = dateTimeZone4.writeReplace();
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, 0L);
        java.util.TimeZone timeZone19 = dateTimeZone1.toTimeZone();
        int int21 = dateTimeZone1.getOffsetFromLocal((long) ' ');
        boolean boolean22 = dateTimeZone1.isFixed();
        java.lang.String str23 = dateTimeZone1.getID();
        java.lang.String str25 = dateTimeZone1.getNameKey(125999999L);
        java.lang.Object obj26 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-35L) + "'", long18 == (-35L));
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 100, locale8);
        long long12 = dateTimeZone1.convertLocalToUTC(25199999L, false);
        java.lang.String str14 = dateTimeZone1.getName((long) 2100000);
        boolean boolean15 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 25199999L + "'", long12 == 25199999L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone11.previousTransition((long) ' ');
        boolean boolean14 = dateTimeZone11.isFixed();
        long long16 = dateTimeZone10.getMillisKeepLocal(dateTimeZone11, (long) ' ');
        java.util.TimeZone timeZone17 = dateTimeZone10.toTimeZone();
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone10.getName(3600003L, locale19);
        long long22 = dateTimeZone10.previousTransition(25200001L);
        boolean boolean23 = dateTimeZone10.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 25200001L + "'", long22 == 25200001L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.lang.String str8 = dateTimeZone1.getName((long) ' ');
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName(25200035L, locale10);
        java.lang.String str12 = dateTimeZone1.toString();
        long long15 = dateTimeZone1.convertLocalToUTC(115260100L, true);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone17.getOffset(readableInstant18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        long long22 = dateTimeZone20.previousTransition((long) ' ');
        java.lang.String str23 = dateTimeZone20.getID();
        java.lang.String str25 = dateTimeZone20.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone20.getOffset(readableInstant26);
        long long29 = dateTimeZone17.getMillisKeepLocal(dateTimeZone20, (long) '#');
        long long31 = dateTimeZone1.getMillisKeepLocal(dateTimeZone20, 3600000L);
        java.lang.String str33 = dateTimeZone1.getShortName(52L);
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone1.isLocalDateTimeGap(localDateTime34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology36 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115260100L + "'", long15 == 115260100L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 35L + "'", long29 == 35L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 3600000L + "'", long31 == 3600000L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(25200035L, locale11);
        int int14 = dateTimeZone1.getOffset((long) '4');
        java.lang.String str16 = dateTimeZone1.getNameKey((long) 0);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone17.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        long long23 = dateTimeZone21.previousTransition((long) ' ');
        java.lang.String str24 = dateTimeZone21.getID();
        java.lang.Object obj25 = dateTimeZone21.writeReplace();
        boolean boolean26 = dateTimeZone17.equals((java.lang.Object) dateTimeZone21);
        java.lang.String str27 = dateTimeZone21.getID();
        java.lang.Object obj28 = dateTimeZone21.writeReplace();
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = dateTimeZone21.isLocalDateTimeGap(localDateTime29);
        java.lang.String str32 = dateTimeZone21.getName((-365700000L));
        long long34 = dateTimeZone1.getMillisKeepLocal(dateTimeZone21, 36000010L);
        java.lang.String str36 = dateTimeZone21.getName((long) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 36000010L + "'", long34 == 36000010L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str5 = dateTimeZone1.getNameKey((long) '4');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((long) '4', locale7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forID("+00:00");
        long long12 = dateTimeZone10.convertUTCToLocal((long) (short) 10);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, 126000000L);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone10.getOffset(readableInstant15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 126000000L + "'", long14 == 126000000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone3.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone3.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone8.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone12.previousTransition((long) ' ');
        java.lang.String str15 = dateTimeZone12.getID();
        java.lang.Object obj16 = dateTimeZone12.writeReplace();
        boolean boolean17 = dateTimeZone8.equals((java.lang.Object) dateTimeZone12);
        boolean boolean18 = dateTimeZone3.equals((java.lang.Object) dateTimeZone12);
        long long20 = dateTimeZone3.convertUTCToLocal(25200010L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (-1));
        java.lang.String str24 = dateTimeZone1.getNameKey((-25200001L));
        java.lang.String str26 = dateTimeZone1.getNameKey((long) (short) 10);
        long long28 = dateTimeZone1.convertUTCToLocal(25800011L);
        long long30 = dateTimeZone1.nextTransition(60032L);
        boolean boolean32 = dateTimeZone1.isStandardOffset(64920110L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200010L + "'", long20 == 25200010L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 25800012L + "'", long28 == 25800012L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 60032L + "'", long30 == 60032L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long7 = dateTimeZone0.nextTransition((long) (byte) 10);
        java.lang.String str9 = dateTimeZone0.getNameKey(387300010L);
        java.lang.String str10 = dateTimeZone0.toString();
        java.lang.String str12 = dateTimeZone0.getNameKey((-362100000L));
        java.lang.String str14 = dateTimeZone0.getNameKey(35999904L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getStandardOffset((long) 25200000);
        java.lang.String str7 = dateTimeZone1.getName(100L);
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        java.lang.String str10 = dateTimeZone1.getNameKey(25200009L);
        boolean boolean11 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str15 = dateTimeZone13.getNameKey(10L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        long long18 = dateTimeZone16.previousTransition((long) ' ');
        java.lang.String str19 = dateTimeZone16.getID();
        java.lang.String str21 = dateTimeZone16.getShortName((long) (short) 0);
        long long24 = dateTimeZone16.convertLocalToUTC((long) (byte) 100, true);
        java.lang.Object obj25 = dateTimeZone16.writeReplace();
        boolean boolean26 = dateTimeZone13.equals((java.lang.Object) dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long30 = dateTimeZone13.getMillisKeepLocal(dateTimeZone28, 0L);
        java.util.TimeZone timeZone31 = dateTimeZone13.toTimeZone();
        java.lang.String str33 = dateTimeZone13.getShortName((long) 'a');
        java.util.TimeZone timeZone34 = dateTimeZone13.toTimeZone();
        java.lang.String str36 = dateTimeZone13.getName((long) 100);
        long long39 = dateTimeZone13.convertLocalToUTC((long) (-5700000), false);
        long long41 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, 359999966L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 362100000 + "'", int3 == 362100000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 362100000 + "'", int5 == 362100000);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:35" + "'", str7, "+100:35");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 362099965L + "'", long30 == 362099965L);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+:0:35");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+100:35" + "'", str33, "+100:35");
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "GMT+:0:35");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+100:35" + "'", str36, "+100:35");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-367800000L) + "'", long39 == (-367800000L));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 359999966L + "'", long41 == 359999966L);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        java.lang.String str11 = dateTimeZone4.getName(97L);
        int int13 = dateTimeZone4.getOffset(36000000L);
        java.lang.String str15 = dateTimeZone4.getNameKey(362099999L);
        java.lang.String str16 = dateTimeZone4.toString();
        int int18 = dateTimeZone4.getOffset(21599958L);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone4.getShortName((-115200001L), locale20);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        java.lang.String str4 = dateTimeZone2.getName(7199999L);
        long long6 = dateTimeZone2.convertUTCToLocal(395999966L);
        boolean boolean8 = dateTimeZone2.isStandardOffset(25860010L);
        long long10 = dateTimeZone2.previousTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 431999966L + "'", long6 == 431999966L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        long long9 = dateTimeZone1.nextTransition(10L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone10.previousTransition((long) ' ');
        java.lang.String str13 = dateTimeZone10.getID();
        java.lang.String str15 = dateTimeZone10.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone10.getOffset(readableInstant16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone10.getName((long) (byte) -1, locale19);
        int int22 = dateTimeZone10.getOffsetFromLocal((long) (byte) 100);
        long long25 = dateTimeZone10.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str27 = dateTimeZone10.getName(600035L);
        boolean boolean28 = dateTimeZone1.equals((java.lang.Object) str27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        java.lang.String str34 = dateTimeZone32.getNameKey(10L);
        long long36 = dateTimeZone30.getMillisKeepLocal(dateTimeZone32, (long) 1);
        java.lang.String str38 = dateTimeZone30.getName((long) 0);
        int int40 = dateTimeZone30.getOffset(25200010L);
        java.lang.String str42 = dateTimeZone30.getShortName((-1L));
        boolean boolean43 = dateTimeZone1.equals((java.lang.Object) dateTimeZone30);
        boolean boolean44 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+100:35" + "'", str38, "+100:35");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 362100000 + "'", int40 == 362100000);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+100:35" + "'", str42, "+100:35");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long4 = dateTimeZone2.nextTransition((long) '4');
        java.lang.String str5 = dateTimeZone2.toString();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getName((long) (byte) 0, locale7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = dateTimeZone10.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider13 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider13);
        boolean boolean15 = dateTimeZone10.equals((java.lang.Object) nameProvider13);
        long long18 = dateTimeZone10.convertLocalToUTC((-1L), true);
        java.lang.String str19 = dateTimeZone10.getID();
        boolean boolean21 = dateTimeZone10.isStandardOffset((long) 1);
        boolean boolean22 = dateTimeZone2.equals((java.lang.Object) boolean21);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        long long25 = dateTimeZone23.previousTransition((long) ' ');
        java.lang.String str26 = dateTimeZone23.getID();
        java.lang.String str28 = dateTimeZone23.getShortName((long) (short) 0);
        long long30 = dateTimeZone23.previousTransition((long) (short) -1);
        int int32 = dateTimeZone23.getStandardOffset((long) 0);
        long long34 = dateTimeZone23.convertUTCToLocal((long) ' ');
        java.lang.String str36 = dateTimeZone23.getName((long) 600000);
        long long38 = dateTimeZone2.getMillisKeepLocal(dateTimeZone23, 3L);
        long long40 = dateTimeZone23.convertUTCToLocal(25200000L);
        boolean boolean42 = dateTimeZone23.isStandardOffset((long) (-3600000));
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone23.getName(3600000L, locale44);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.util.Locale locale49 = null;
        java.lang.String str50 = dateTimeZone47.getName((long) (short) 1, locale49);
        long long52 = dateTimeZone23.getMillisKeepLocal(dateTimeZone47, (long) 25200000);
        java.lang.String str53 = dateTimeZone23.getID();
        java.lang.String str54 = dateTimeZone23.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:00" + "'", str5, "+01:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:00" + "'", str8, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nameProvider13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-362100001L) + "'", long18 == (-362100001L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+100:35" + "'", str19, "+100:35");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 3600003L + "'", long38 == 3600003L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 25200000L + "'", long40 == 25200000L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00" + "'", str45, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00:00.001" + "'", str50, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 25199999L + "'", long52 == 25199999L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "UTC" + "'", str53, "UTC");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "UTC" + "'", str54, "UTC");
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.032");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(686159967L, locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.032" + "'", str4, "+00:00:00.032");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str5 = dateTimeZone1.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone6.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone10.previousTransition((long) ' ');
        java.lang.String str13 = dateTimeZone10.getID();
        java.lang.Object obj14 = dateTimeZone10.writeReplace();
        boolean boolean15 = dateTimeZone6.equals((java.lang.Object) dateTimeZone10);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) dateTimeZone10);
        long long18 = dateTimeZone1.convertUTCToLocal(25200010L);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone1.getShortName(52L, locale20);
        java.lang.String str23 = dateTimeZone1.getShortName(0L);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone1.getName(25800010L, locale25);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 362100000 + "'", int3 == 362100000);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 387300010L + "'", long18 == 387300010L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+100:35" + "'", str21, "+100:35");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+100:35" + "'", str23, "+100:35");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+100:35" + "'", str26, "+100:35");
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Asia/Bangkok");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(32L, locale3);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean7 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 25259958L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+07:00" + "'", str4, "+07:00");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25259958L + "'", long10 == 25259958L);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str3 = dateTimeZone1.getShortName(25199999L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        int int7 = dateTimeZone1.getOffsetFromLocal((-331139990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        java.lang.String str7 = dateTimeZone0.toString();
        boolean boolean9 = dateTimeZone0.isStandardOffset(97L);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone0.getOffset(readableInstant10);
        long long14 = dateTimeZone0.convertLocalToUTC((long) 128100000, false);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone0.getName(25260010L, locale16);
        long long20 = dateTimeZone0.convertLocalToUTC(359999991L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 128100000L + "'", long14 == 128100000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 359999991L + "'", long20 == 359999991L);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(1L, locale3);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        java.lang.String str10 = dateTimeZone1.getID();
        boolean boolean11 = dateTimeZone1.isFixed();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName(1L, locale13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        long long19 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone1.getOffset(readableInstant20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long26 = dateTimeZone24.nextTransition((long) '4');
        java.lang.String str27 = dateTimeZone24.toString();
        java.util.TimeZone timeZone28 = dateTimeZone24.toTimeZone();
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone24.getOffset(readableInstant29);
        boolean boolean31 = dateTimeZone1.equals((java.lang.Object) dateTimeZone24);
        long long34 = dateTimeZone24.convertLocalToUTC(1L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ICT" + "'", str3, "ICT");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-25200001L) + "'", long9 == (-25200001L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Asia/Bangkok" + "'", str10, "Asia/Bangkok");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+07:00" + "'", str14, "+07:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 25200000 + "'", int16 == 25200000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-25199990L) + "'", long19 == (-25199990L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 25200000 + "'", int21 == 25200000);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 52L + "'", long26 == 52L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+01:00" + "'", str27, "+01:00");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3600000 + "'", int30 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-3599999L) + "'", long34 == (-3599999L));
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        long long9 = dateTimeZone1.convertUTCToLocal(10L);
        long long11 = dateTimeZone1.previousTransition(115260100L);
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long16 = dateTimeZone14.convertUTCToLocal((-352800000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ICT" + "'", str5, "ICT");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 25200010L + "'", long9 == 25200010L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924001L) + "'", long11 == (-1570084924001L));
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-327600000L) + "'", long16 == (-327600000L));
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone3.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone3.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone8.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone12.previousTransition((long) ' ');
        java.lang.String str15 = dateTimeZone12.getID();
        java.lang.Object obj16 = dateTimeZone12.writeReplace();
        boolean boolean17 = dateTimeZone8.equals((java.lang.Object) dateTimeZone12);
        boolean boolean18 = dateTimeZone3.equals((java.lang.Object) dateTimeZone12);
        long long20 = dateTimeZone3.convertUTCToLocal(25200010L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (-1));
        java.lang.String str24 = dateTimeZone1.getNameKey((-25200001L));
        int int26 = dateTimeZone1.getOffsetFromLocal(25199999L);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone1.isLocalDateTimeGap(localDateTime27);
        int int30 = dateTimeZone1.getStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        long long33 = dateTimeZone31.previousTransition((long) ' ');
        boolean boolean34 = dateTimeZone31.isFixed();
        long long36 = dateTimeZone31.nextTransition((long) 1);
        java.lang.String str37 = dateTimeZone31.getID();
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone31.getShortName((-25200001L), locale39);
        java.lang.Object obj41 = dateTimeZone31.writeReplace();
        java.lang.String str42 = dateTimeZone31.toString();
        long long44 = dateTimeZone31.nextTransition((long) (-1));
        java.util.TimeZone timeZone45 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        int int48 = dateTimeZone46.getOffsetFromLocal((-25200001L));
        java.util.TimeZone timeZone49 = dateTimeZone46.toTimeZone();
        boolean boolean50 = dateTimeZone1.equals((java.lang.Object) timeZone49);
        boolean boolean52 = dateTimeZone1.isStandardOffset((-333899990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25200000 + "'", int5 == 25200000);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ICT" + "'", str7, "ICT");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 50400010L + "'", long20 == 50400010L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-25200000L) + "'", long22 == (-25200000L));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        java.lang.String str11 = dateTimeZone1.getName((long) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone12.previousTransition((long) ' ');
        boolean boolean15 = dateTimeZone12.isFixed();
        long long17 = dateTimeZone12.nextTransition((long) 1);
        java.lang.String str18 = dateTimeZone12.getID();
        java.lang.String str19 = dateTimeZone12.toString();
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone12.getName(0L, locale21);
        java.lang.String str23 = dateTimeZone12.toString();
        boolean boolean25 = dateTimeZone12.isStandardOffset((long) (-1));
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 360000001L);
        java.lang.String str29 = dateTimeZone1.getName(3600003L);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone1.getName(25800111L, locale31);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        long long35 = dateTimeZone33.previousTransition((long) ' ');
        java.lang.String str36 = dateTimeZone33.getID();
        java.lang.String str38 = dateTimeZone33.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant39 = null;
        int int40 = dateTimeZone33.getOffset(readableInstant39);
        java.util.Locale locale42 = null;
        java.lang.String str43 = dateTimeZone33.getName((long) (byte) -1, locale42);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        java.lang.String str46 = dateTimeZone33.getShortName(35L);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long50 = dateTimeZone48.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime51 = null;
        boolean boolean52 = dateTimeZone48.isLocalDateTimeGap(localDateTime51);
        java.lang.String str54 = dateTimeZone48.getNameKey(28800010L);
        boolean boolean56 = dateTimeZone48.isStandardOffset(1L);
        java.lang.String str57 = dateTimeZone48.getID();
        java.util.Locale locale59 = null;
        java.lang.String str60 = dateTimeZone48.getName(360599966L, locale59);
        long long62 = dateTimeZone33.getMillisKeepLocal(dateTimeZone48, (-4200096L));
        int int64 = dateTimeZone33.getOffsetFromLocal(2100000L);
        long long66 = dateTimeZone1.getMillisKeepLocal(dateTimeZone33, (-334799990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ICT" + "'", str5, "ICT");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+07:00" + "'", str11, "+07:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 385200001L + "'", long27 == 385200001L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+07:00" + "'", str29, "+07:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+07:00" + "'", str32, "+07:00");
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00" + "'", str43, "+00:00");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 25199999L + "'", long50 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:00:00.001" + "'", str57, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+00:00:00.001" + "'", str60, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-4200097L) + "'", long62 == (-4200097L));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-309599990L) + "'", long66 == (-309599990L));
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
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
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.junit.Assert.assertNotNull(provider0);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-25200001L), locale5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+35:00" + "'", str6, "+35:00");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2100000, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 1);
        int int4 = dateTimeZone2.getStandardOffset((-3600000L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long8 = dateTimeZone5.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition((long) ' ');
        java.lang.String str12 = dateTimeZone9.getID();
        java.lang.Object obj13 = dateTimeZone9.writeReplace();
        boolean boolean14 = dateTimeZone5.equals((java.lang.Object) dateTimeZone9);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone5.getName(100L, locale16);
        int int19 = dateTimeZone5.getOffsetFromLocal(32L);
        long long21 = dateTimeZone5.convertUTCToLocal((long) (byte) 100);
        java.lang.String str23 = dateTimeZone5.getName((long) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        java.lang.String str25 = dateTimeZone5.toString();
        long long27 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 60000);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = dateTimeZone31.getOffset(readableInstant32);
        java.lang.String str35 = dateTimeZone31.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        long long39 = dateTimeZone36.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        long long42 = dateTimeZone40.previousTransition((long) ' ');
        java.lang.String str43 = dateTimeZone40.getID();
        java.lang.Object obj44 = dateTimeZone40.writeReplace();
        boolean boolean45 = dateTimeZone36.equals((java.lang.Object) dateTimeZone40);
        boolean boolean46 = dateTimeZone31.equals((java.lang.Object) dateTimeZone40);
        long long48 = dateTimeZone31.convertUTCToLocal(25200010L);
        long long50 = dateTimeZone29.getMillisKeepLocal(dateTimeZone31, (long) (-1));
        java.lang.String str52 = dateTimeZone29.getNameKey((-25200001L));
        org.joda.time.ReadableInstant readableInstant53 = null;
        int int54 = dateTimeZone29.getOffset(readableInstant53);
        java.lang.String str56 = dateTimeZone29.getShortName(97L);
        long long58 = dateTimeZone2.getMillisKeepLocal(dateTimeZone29, (-337499990L));
        java.lang.String str60 = dateTimeZone29.getShortName((-337439991L));
        long long63 = dateTimeZone29.convertLocalToUTC(360000002L, true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 120000L + "'", long27 == 120000L);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 32L + "'", long42 == 32L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTC" + "'", str43, "UTC");
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 25200010L + "'", long48 == 25200010L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00:00.001" + "'", str56, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-337439991L) + "'", long58 == (-337439991L));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+00:00:00.001" + "'", str60, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 360000001L + "'", long63 == 360000001L);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str5 = dateTimeZone1.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone6.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone10.previousTransition((long) ' ');
        java.lang.String str13 = dateTimeZone10.getID();
        java.lang.Object obj14 = dateTimeZone10.writeReplace();
        boolean boolean15 = dateTimeZone6.equals((java.lang.Object) dateTimeZone10);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone10.isLocalDateTimeGap(localDateTime17);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone10.getShortName(3540001L, locale20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 1);
        long long27 = dateTimeZone24.convertLocalToUTC(3600000L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        boolean boolean30 = dateTimeZone24.isStandardOffset(387300010L);
        long long32 = dateTimeZone10.getMillisKeepLocal(dateTimeZone24, 0L);
        long long35 = dateTimeZone24.convertLocalToUTC((-3600001L), true);
        java.lang.Class<?> wildcardClass36 = dateTimeZone24.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 3540000L + "'", long27 == 3540000L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-60000L) + "'", long32 == (-60000L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-3660001L) + "'", long35 == (-3660001L));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone0.getOffset(readableInstant4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone0.isLocalDateTimeGap(localDateTime10);
        long long14 = dateTimeZone0.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone0.getOffset(readableInstant15);
        long long19 = dateTimeZone0.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone21.getShortName((long) 10, locale23);
        java.lang.Object obj25 = dateTimeZone21.writeReplace();
        boolean boolean26 = dateTimeZone0.equals((java.lang.Object) dateTimeZone21);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        int int4 = dateTimeZone2.getOffsetFromLocal(1L);
        long long6 = dateTimeZone2.previousTransition((-25200001L));
        boolean boolean8 = dateTimeZone2.isStandardOffset(50399910L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3600000 + "'", int4 == 3600000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25200001L) + "'", long6 == (-25200001L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.toString();
        boolean boolean4 = dateTimeZone0.isFixed();
        java.lang.Object obj5 = null;
        boolean boolean6 = dateTimeZone0.equals(obj5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 0);
        java.lang.String str10 = dateTimeZone9.toString();
        boolean boolean12 = dateTimeZone9.isStandardOffset(3600010L);
        java.util.TimeZone timeZone13 = dateTimeZone9.toTimeZone();
        boolean boolean14 = dateTimeZone0.equals((java.lang.Object) timeZone13);
        java.lang.Object obj15 = dateTimeZone0.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((long) '4', locale5);
        long long8 = dateTimeZone0.convertUTCToLocal((long) 25200000);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone0.getOffset(readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone11.previousTransition((long) ' ');
        java.lang.String str14 = dateTimeZone11.getID();
        java.lang.String str16 = dateTimeZone11.getShortName((long) (short) 0);
        long long18 = dateTimeZone11.previousTransition((long) (short) -1);
        java.util.TimeZone timeZone19 = dateTimeZone11.toTimeZone();
        java.lang.String str21 = dateTimeZone11.getShortName(100L);
        long long24 = dateTimeZone11.convertLocalToUTC(0L, true);
        boolean boolean25 = dateTimeZone0.equals((java.lang.Object) dateTimeZone11);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone11.getShortName(115200000L, locale27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        java.lang.String str34 = dateTimeZone32.getNameKey(10L);
        long long36 = dateTimeZone30.getMillisKeepLocal(dateTimeZone32, (long) 1);
        java.lang.String str38 = dateTimeZone30.getName((long) 0);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone30.getName(25200035L, locale40);
        int int43 = dateTimeZone30.getOffset((long) '4');
        java.lang.String str45 = dateTimeZone30.getNameKey((long) 0);
        int int47 = dateTimeZone30.getStandardOffset(25200009L);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        java.util.TimeZone timeZone50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        java.lang.String str53 = dateTimeZone51.getNameKey(10L);
        long long55 = dateTimeZone49.getMillisKeepLocal(dateTimeZone51, (long) 1);
        java.lang.String str57 = dateTimeZone49.getName((long) 0);
        java.util.Locale locale59 = null;
        java.lang.String str60 = dateTimeZone49.getName(25200035L, locale59);
        long long63 = dateTimeZone49.convertLocalToUTC(25200010L, true);
        java.lang.String str64 = dateTimeZone49.toString();
        long long66 = dateTimeZone30.getMillisKeepLocal(dateTimeZone49, (-3600035L));
        java.lang.Object obj67 = dateTimeZone30.writeReplace();
        long long69 = dateTimeZone11.getMillisKeepLocal(dateTimeZone30, (-600096L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25200000L + "'", long8 == 25200000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.001" + "'", str38, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.001" + "'", str41, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:00:00.001" + "'", str57, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+00:00:00.001" + "'", str60, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 25200009L + "'", long63 == 25200009L);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "+00:00:00.001" + "'", str64, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-3600035L) + "'", long66 == (-3600035L));
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-600097L) + "'", long69 == (-600097L));
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.toString();
        boolean boolean4 = dateTimeZone0.isFixed();
        java.lang.Object obj5 = null;
        boolean boolean6 = dateTimeZone0.equals(obj5);
        long long8 = dateTimeZone0.nextTransition((-337499990L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getShortName(25860010L, locale11);
        java.lang.String str14 = dateTimeZone0.getShortName(17340010L);
        int int16 = dateTimeZone0.getOffsetFromLocal(128699999L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-337499990L) + "'", long8 == (-337499990L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        long long3 = dateTimeZone1.convertUTCToLocal(25800010L);
        long long5 = dateTimeZone1.previousTransition((-98L));
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName(3600012L, locale7);
        java.lang.String str10 = dateTimeZone1.getName((-3600002L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25800011L + "'", long3 == 25800011L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-98L) + "'", long5 == (-98L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 100, true);
        java.lang.String str9 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone10.previousTransition((long) ' ');
        boolean boolean13 = dateTimeZone10.isFixed();
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone10, 25199999L);
        long long18 = dateTimeZone0.convertLocalToUTC(100L, false);
        boolean boolean20 = dateTimeZone0.isStandardOffset((-35999990L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25199999L + "'", long15 == 25199999L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone11.previousTransition((long) ' ');
        boolean boolean14 = dateTimeZone11.isFixed();
        long long16 = dateTimeZone10.getMillisKeepLocal(dateTimeZone11, (long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        boolean boolean18 = dateTimeZone10.isFixed();
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone10.isLocalDateTimeGap(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        java.lang.String str10 = dateTimeZone1.getID();
        boolean boolean11 = dateTimeZone1.isFixed();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName(1L, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getName((long) '4', locale16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone18.previousTransition((long) ' ');
        boolean boolean21 = dateTimeZone18.isFixed();
        long long23 = dateTimeZone18.nextTransition((long) 1);
        int int25 = dateTimeZone18.getOffset((long) (short) 0);
        int int27 = dateTimeZone18.getOffset((long) (byte) 10);
        int int29 = dateTimeZone18.getOffsetFromLocal((long) 'a');
        long long31 = dateTimeZone18.previousTransition(25200001L);
        long long33 = dateTimeZone1.getMillisKeepLocal(dateTimeZone18, (-3660035L));
        java.lang.String str34 = dateTimeZone1.getID();
        long long36 = dateTimeZone1.previousTransition(176400000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 25200001L + "'", long31 == 25200001L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-3660035L) + "'", long33 == (-3660035L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 176400000L + "'", long36 == 176400000L);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long5 = dateTimeZone3.nextTransition((long) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long10 = dateTimeZone8.nextTransition((long) '4');
        java.lang.String str11 = dateTimeZone8.toString();
        long long13 = dateTimeZone3.getMillisKeepLocal(dateTimeZone8, 387300010L);
        long long16 = dateTimeZone8.convertLocalToUTC((-111540001L), false);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone8.isLocalDateTimeGap(localDateTime17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        boolean boolean21 = dateTimeZone19.equals((java.lang.Object) "");
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone19.getName(10L, locale23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long28 = dateTimeZone19.getMillisKeepLocal(dateTimeZone26, (long) (short) 0);
        int int30 = dateTimeZone26.getStandardOffset(100L);
        long long32 = dateTimeZone26.nextTransition((long) 0);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone26.getOffset(readableInstant33);
        long long36 = dateTimeZone26.previousTransition((long) 25200000);
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        java.lang.String str42 = dateTimeZone40.getNameKey(10L);
        long long44 = dateTimeZone38.getMillisKeepLocal(dateTimeZone40, (long) 1);
        java.lang.String str46 = dateTimeZone38.getName((long) 0);
        java.util.Locale locale48 = null;
        java.lang.String str49 = dateTimeZone38.getName(25200035L, locale48);
        long long52 = dateTimeZone38.convertLocalToUTC(25200010L, true);
        int int54 = dateTimeZone38.getStandardOffset((-1L));
        int int56 = dateTimeZone38.getOffset((long) '4');
        long long59 = dateTimeZone38.convertLocalToUTC(0L, false);
        java.util.TimeZone timeZone60 = dateTimeZone38.toTimeZone();
        int int62 = dateTimeZone38.getOffset((long) (byte) 100);
        java.lang.String str63 = dateTimeZone38.getID();
        java.util.Locale locale65 = null;
        java.lang.String str66 = dateTimeZone38.getName(2100000L, locale65);
        long long68 = dateTimeZone26.getMillisKeepLocal(dateTimeZone38, 25199958L);
        boolean boolean69 = dateTimeZone8.equals((java.lang.Object) dateTimeZone26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology70 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:00" + "'", str11, "+01:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 387300010L + "'", long13 == 387300010L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115140001L) + "'", long16 == (-115140001L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3600000L + "'", long28 == 3600000L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3600000) + "'", int30 == (-3600000));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-3600000) + "'", int34 == (-3600000));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 25200000L + "'", long36 == 25200000L);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00" + "'", str49, "+00:00");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 25200010L + "'", long52 == 25200010L);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(timeZone60);
        org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "UTC" + "'", str63, "UTC");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "+00:00" + "'", str66, "+00:00");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 21599958L + "'", long68 == 21599958L);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(25200011L);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.lang.String str8 = dateTimeZone6.getNameKey(10L);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone6, (long) 1);
        java.lang.String str12 = dateTimeZone4.getName((long) 0);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone4.getName(25200035L, locale14);
        long long18 = dateTimeZone4.convertLocalToUTC(25200010L, true);
        int int20 = dateTimeZone4.getStandardOffset((-1L));
        int int22 = dateTimeZone4.getOffset((long) '4');
        int int24 = dateTimeZone4.getOffset((long) (short) 10);
        int int26 = dateTimeZone4.getStandardOffset(1L);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone4.isLocalDateTimeGap(localDateTime27);
        long long30 = dateTimeZone4.convertUTCToLocal(599965L);
        boolean boolean31 = dateTimeZone4.isFixed();
        long long33 = dateTimeZone4.convertUTCToLocal((long) 10);
        long long35 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, 25260010L);
        int int37 = dateTimeZone0.getOffsetFromLocal(3600012L);
        java.lang.String str39 = dateTimeZone0.getNameKey(129659999L);
        long long41 = dateTimeZone0.previousTransition(128100052L);
        boolean boolean43 = dateTimeZone0.isStandardOffset((-365700000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25200010L + "'", long18 == 25200010L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 599965L + "'", long30 == 599965L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 25260010L + "'", long35 == 25260010L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UTC" + "'", str39, "UTC");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 128100052L + "'", long41 == 128100052L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(1L, locale3);
        java.lang.String str6 = dateTimeZone1.getNameKey((long) ' ');
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName(25800011L, locale8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone3.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone3.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone8.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone12.previousTransition((long) ' ');
        java.lang.String str15 = dateTimeZone12.getID();
        java.lang.Object obj16 = dateTimeZone12.writeReplace();
        boolean boolean17 = dateTimeZone8.equals((java.lang.Object) dateTimeZone12);
        boolean boolean18 = dateTimeZone3.equals((java.lang.Object) dateTimeZone12);
        long long20 = dateTimeZone3.convertUTCToLocal(25200010L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (-1));
        long long24 = dateTimeZone3.previousTransition((-35L));
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone3.getShortName(0L, locale26);
        boolean boolean28 = dateTimeZone3.isFixed();
        long long30 = dateTimeZone3.nextTransition((-36600000L));
        java.util.TimeZone timeZone31 = dateTimeZone3.toTimeZone();
        java.lang.String str32 = dateTimeZone3.getID();
        long long34 = dateTimeZone3.convertUTCToLocal(39599899L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200011L + "'", long20 == 25200011L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-35L) + "'", long24 == (-35L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.001" + "'", str27, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-36600000L) + "'", long30 == (-36600000L));
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.001" + "'", str32, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 39599900L + "'", long34 == 39599900L);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+100:52");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+100:52\" is malformed at \"0:52\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getName(100L, locale11);
        int int14 = dateTimeZone0.getOffsetFromLocal(32L);
        long long16 = dateTimeZone0.convertUTCToLocal((long) (byte) 100);
        java.lang.String str17 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone18.previousTransition((long) ' ');
        java.lang.String str21 = dateTimeZone18.getID();
        java.lang.String str23 = dateTimeZone18.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone18.getOffset(readableInstant24);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone18.getName((long) (byte) -1, locale27);
        int int30 = dateTimeZone18.getOffsetFromLocal((long) (byte) 100);
        long long33 = dateTimeZone18.convertLocalToUTC((long) (byte) 1, false);
        boolean boolean34 = dateTimeZone18.isFixed();
        boolean boolean35 = dateTimeZone18.isFixed();
        long long37 = dateTimeZone18.previousTransition(387300010L);
        org.joda.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = dateTimeZone18.isLocalDateTimeGap(localDateTime38);
        long long41 = dateTimeZone18.convertUTCToLocal(35L);
        boolean boolean42 = dateTimeZone0.equals((java.lang.Object) dateTimeZone18);
        boolean boolean44 = dateTimeZone0.isStandardOffset((-21600000L));
        boolean boolean45 = dateTimeZone0.isFixed();
        boolean boolean46 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        boolean boolean49 = dateTimeZone47.equals((java.lang.Object) "");
        java.util.Locale locale51 = null;
        java.lang.String str52 = dateTimeZone47.getName(10L, locale51);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long56 = dateTimeZone47.getMillisKeepLocal(dateTimeZone54, (long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) '#');
        long long61 = dateTimeZone47.getMillisKeepLocal(dateTimeZone59, 24600010L);
        java.lang.String str63 = dateTimeZone47.getShortName(599965L);
        int int65 = dateTimeZone47.getOffsetFromLocal(28140010L);
        java.lang.String str67 = dateTimeZone47.getShortName((-1L));
        long long69 = dateTimeZone0.getMillisKeepLocal(dateTimeZone47, 50459910L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 387300010L + "'", long37 == 387300010L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 35L + "'", long41 == 35L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:00" + "'", str52, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 3600000L + "'", long56 == 3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-337499990L) + "'", long61 == (-337499990L));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "+00:00" + "'", str63, "+00:00");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+00:00" + "'", str67, "+00:00");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 50459910L + "'", long69 == 50459910L);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long4 = dateTimeZone2.nextTransition((long) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long9 = dateTimeZone7.nextTransition((long) '4');
        java.lang.String str10 = dateTimeZone7.toString();
        long long12 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, 387300010L);
        long long15 = dateTimeZone7.convertLocalToUTC((-111540001L), false);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone7.getShortName((long) 115200000, locale17);
        java.lang.Class<?> wildcardClass19 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:00" + "'", str10, "+01:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 387300010L + "'", long12 == 387300010L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115140001L) + "'", long15 == (-115140001L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+01:00" + "'", str18, "+01:00");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str5 = dateTimeZone1.getNameKey((long) '4');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((long) '4', locale7);
        int int10 = dateTimeZone1.getOffset((long) 100);
        long long12 = dateTimeZone1.previousTransition(324000001L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 324000001L + "'", long12 == 324000001L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        java.lang.String str10 = dateTimeZone1.getID();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName((long) (byte) 100, locale12);
        long long15 = dateTimeZone1.nextTransition((long) 36000000);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getShortName(25139999L, locale17);
        java.lang.String str20 = dateTimeZone1.getShortName(60100L);
        long long22 = dateTimeZone1.convertUTCToLocal(410400010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-2L) + "'", long9 == (-2L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 36000000L + "'", long15 == 36000000L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 410400011L + "'", long22 == 410400011L);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:00");
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-125999903L), locale4);
        java.lang.String str6 = dateTimeZone1.getID();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT-01:00");
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) "");
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str5 = dateTimeZone4.getID();
        java.lang.Object obj6 = dateTimeZone4.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        java.lang.String str11 = dateTimeZone4.getName(97L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone12.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        long long18 = dateTimeZone16.previousTransition((long) ' ');
        java.lang.String str19 = dateTimeZone16.getID();
        java.lang.Object obj20 = dateTimeZone16.writeReplace();
        boolean boolean21 = dateTimeZone12.equals((java.lang.Object) dateTimeZone16);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone12.getName(100L, locale23);
        long long27 = dateTimeZone12.convertLocalToUTC((long) (short) 10, false);
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = dateTimeZone12.getOffset(readableInstant28);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        java.lang.String str31 = dateTimeZone12.toString();
        java.lang.String str33 = dateTimeZone12.getShortName((long) (byte) 1);
        long long35 = dateTimeZone4.getMillisKeepLocal(dateTimeZone12, 3L);
        java.util.TimeZone timeZone36 = dateTimeZone12.toTimeZone();
        boolean boolean38 = dateTimeZone12.isStandardOffset((-115200001L));
        java.lang.String str40 = dateTimeZone12.getNameKey(24600010L);
        java.lang.String str42 = dateTimeZone12.getName(324000001L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 3L + "'", long35 == 3L);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UTC" + "'", str40, "UTC");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        java.lang.String str3 = dateTimeZone1.getNameKey((long) ' ');
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) 115260000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.097" + "'", str4, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        java.lang.String str10 = dateTimeZone4.getID();
        java.lang.Object obj11 = dateTimeZone4.writeReplace();
        java.lang.String str13 = dateTimeZone4.getShortName((-25200001L));
        long long16 = dateTimeZone4.convertLocalToUTC(36000035L, false);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone18.getName(0L, locale20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        boolean boolean23 = dateTimeZone4.equals((java.lang.Object) dateTimeZone18);
        long long25 = dateTimeZone4.previousTransition(0L);
        java.lang.Object obj26 = dateTimeZone4.writeReplace();
        java.util.TimeZone timeZone27 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 36000035L + "'", long16 == 36000035L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.097" + "'", str21, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone28);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getShortName(25200035L, locale9);
        boolean boolean12 = dateTimeZone0.isStandardOffset((long) '#');
        int int14 = dateTimeZone0.getOffsetFromLocal(395999966L);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        long long17 = dateTimeZone0.getMillisKeepLocal(dateTimeZone15, 115200000L);
        java.lang.String str19 = dateTimeZone0.getNameKey(25199913L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 115199903L + "'", long17 == 115199903L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long7 = dateTimeZone0.nextTransition((long) (byte) 10);
        long long9 = dateTimeZone0.convertUTCToLocal((long) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        boolean boolean12 = dateTimeZone10.equals((java.lang.Object) "");
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone10.getName(10L, locale14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long19 = dateTimeZone10.getMillisKeepLocal(dateTimeZone17, (long) (short) 0);
        int int21 = dateTimeZone17.getStandardOffset(100L);
        long long23 = dateTimeZone0.getMillisKeepLocal(dateTimeZone17, (long) (-1));
        long long25 = dateTimeZone0.previousTransition(600035L);
        java.util.TimeZone timeZone26 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        long long32 = dateTimeZone29.previousTransition(36000000L);
        boolean boolean34 = dateTimeZone29.isStandardOffset((-115140001L));
        boolean boolean35 = dateTimeZone29.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3600000L + "'", long19 == 3600000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3600000) + "'", int21 == (-3600000));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3599999L + "'", long23 == 3599999L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 600035L + "'", long25 == 600035L);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 36000000L + "'", long32 == 36000000L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone2.getName(600000L, locale5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(2100000);
        long long10 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, (-361499990L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+100:35" + "'", str6, "+100:35");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1499990L) + "'", long10 == (-1499990L));
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        int int7 = dateTimeZone0.getOffset((long) (short) 0);
        int int9 = dateTimeZone0.getOffset((long) (byte) 10);
        long long12 = dateTimeZone0.convertLocalToUTC(0L, false);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone0.getName((long) 360000000, locale14);
        java.lang.String str16 = dateTimeZone0.toString();
        java.lang.String str18 = dateTimeZone0.getShortName(147600000L);
        int int20 = dateTimeZone0.getStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long6 = dateTimeZone0.convertLocalToUTC((-25200001L), true);
        java.lang.String str8 = dateTimeZone0.getNameKey(0L);
        long long10 = dateTimeZone0.previousTransition(364200000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25200001L) + "'", long6 == (-25200001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 364200000L + "'", long10 == 364200000L);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        java.lang.String str4 = dateTimeZone3.toString();
        int int6 = dateTimeZone3.getStandardOffset((-126000000L));
        boolean boolean7 = dateTimeZone1.equals((java.lang.Object) dateTimeZone3);
        boolean boolean9 = dateTimeZone3.isStandardOffset(363599966L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:00" + "'", str4, "+100:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 360000000 + "'", int6 == 360000000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(126000000);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long5 = dateTimeZone3.nextTransition(25199999L);
        int int7 = dateTimeZone3.getStandardOffset(1L);
        java.lang.String str9 = dateTimeZone3.getName(0L);
        long long11 = dateTimeZone3.convertUTCToLocal(25200000L);
        boolean boolean12 = dateTimeZone3.isFixed();
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) boolean12);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName((-362100001L), locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25199999L + "'", long5 == 25199999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 25200001L + "'", long11 == 25200001L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+35:00" + "'", str16, "+35:00");
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        int int7 = dateTimeZone0.getOffset((long) (short) 0);
        long long10 = dateTimeZone0.convertLocalToUTC((-2L), true);
        int int12 = dateTimeZone0.getStandardOffset((long) '4');
        long long14 = dateTimeZone0.convertUTCToLocal(0L);
        long long16 = dateTimeZone0.previousTransition(25260011L);
        java.lang.String str18 = dateTimeZone0.getNameKey((-33L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25260011L + "'", long16 == 25260011L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getName(100L, locale11);
        int int14 = dateTimeZone0.getOffsetFromLocal(32L);
        long long16 = dateTimeZone0.convertUTCToLocal((long) (byte) 100);
        java.lang.String str17 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone18.previousTransition((long) ' ');
        java.lang.String str21 = dateTimeZone18.getID();
        java.lang.String str23 = dateTimeZone18.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone18.getOffset(readableInstant24);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone18.getName((long) (byte) -1, locale27);
        int int30 = dateTimeZone18.getOffsetFromLocal((long) (byte) 100);
        long long33 = dateTimeZone18.convertLocalToUTC((long) (byte) 1, false);
        boolean boolean34 = dateTimeZone18.isFixed();
        boolean boolean35 = dateTimeZone18.isFixed();
        long long37 = dateTimeZone18.previousTransition(387300010L);
        org.joda.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = dateTimeZone18.isLocalDateTimeGap(localDateTime38);
        long long41 = dateTimeZone18.convertUTCToLocal(35L);
        boolean boolean42 = dateTimeZone0.equals((java.lang.Object) dateTimeZone18);
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone0.getShortName((long) 126000000, locale44);
        java.lang.String str46 = dateTimeZone0.getID();
        long long48 = dateTimeZone0.convertUTCToLocal((-60034L));
        java.util.Locale locale50 = null;
        java.lang.String str51 = dateTimeZone0.getShortName(387300010L, locale50);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 387300010L + "'", long37 == 387300010L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 35L + "'", long41 == 35L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00" + "'", str45, "+00:00");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UTC" + "'", str46, "UTC");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-60034L) + "'", long48 == (-60034L));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00" + "'", str51, "+00:00");
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:10");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone2.previousTransition((long) ' ');
        java.lang.String str5 = dateTimeZone2.getID();
        java.lang.Object obj6 = dateTimeZone2.writeReplace();
        int int8 = dateTimeZone2.getStandardOffset((long) 1);
        long long10 = dateTimeZone2.convertUTCToLocal(100L);
        long long12 = dateTimeZone2.nextTransition((-337439991L));
        long long14 = dateTimeZone2.previousTransition(9L);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, 3599998L);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone2.isLocalDateTimeGap(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-337439991L) + "'", long12 == (-337439991L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9L + "'", long14 == 9L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 4199998L + "'", long16 == 4199998L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        java.lang.String str11 = dateTimeZone1.getNameKey((-25200001L));
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        long long18 = dateTimeZone16.previousTransition((long) ' ');
        boolean boolean19 = dateTimeZone16.isFixed();
        long long21 = dateTimeZone16.nextTransition((long) 1);
        java.lang.String str22 = dateTimeZone16.getID();
        java.lang.String str23 = dateTimeZone16.toString();
        java.lang.String str25 = dateTimeZone16.getShortName((long) (short) 10);
        java.util.TimeZone timeZone26 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone27, 3540000L);
        int int31 = dateTimeZone27.getOffset(50459910L);
        java.lang.String str33 = dateTimeZone27.getName(115199900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 3540000L + "'", long29 == 3540000L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str6 = dateTimeZone0.getID();
        java.lang.String str7 = dateTimeZone0.toString();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName(0L, locale9);
        java.lang.String str11 = dateTimeZone0.toString();
        boolean boolean13 = dateTimeZone0.isStandardOffset((long) (-1));
        int int15 = dateTimeZone0.getStandardOffset(599965L);
        int int17 = dateTimeZone0.getOffsetFromLocal(599965L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone0.getName(28800010L, locale19);
        long long22 = dateTimeZone0.nextTransition((-35L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-35L) + "'", long22 == (-35L));
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        long long11 = dateTimeZone0.convertUTCToLocal((-1L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName((long) 10, locale13);
        boolean boolean16 = dateTimeZone0.equals((java.lang.Object) (-3600000L));
        long long18 = dateTimeZone0.convertUTCToLocal((-362100000L));
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone0.getName(0L, locale20);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        long long24 = dateTimeZone22.previousTransition((long) ' ');
        java.lang.String str25 = dateTimeZone22.getID();
        java.lang.String str27 = dateTimeZone22.getShortName((long) (short) 0);
        long long29 = dateTimeZone22.previousTransition((long) (short) -1);
        java.util.TimeZone timeZone30 = dateTimeZone22.toTimeZone();
        boolean boolean31 = dateTimeZone0.equals((java.lang.Object) timeZone30);
        long long33 = dateTimeZone0.previousTransition((long) 0);
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone0.isLocalDateTimeGap(localDateTime34);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone0.getName(360000052L, locale37);
        java.lang.Class<?> wildcardClass39 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-362100000L) + "'", long18 == (-362100000L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long7 = dateTimeZone0.previousTransition((long) (short) -1);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName(28200010L, locale9);
        long long12 = dateTimeZone0.nextTransition(25260010L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 25260010L + "'", long12 == 25260010L);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        long long11 = dateTimeZone0.convertUTCToLocal((-1L));
        long long13 = dateTimeZone0.convertUTCToLocal((long) 0);
        java.lang.Object obj14 = dateTimeZone0.writeReplace();
        long long16 = dateTimeZone0.previousTransition(2L);
        java.lang.String str17 = dateTimeZone0.getID();
        long long19 = dateTimeZone0.convertUTCToLocal(396000052L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 396000052L + "'", long19 == 396000052L);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        int int3 = dateTimeZone1.getStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long8 = dateTimeZone6.nextTransition((long) '4');
        java.lang.String str9 = dateTimeZone6.toString();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone6.getName((long) (byte) 0, locale11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.String str16 = dateTimeZone14.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider17 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider17);
        boolean boolean19 = dateTimeZone14.equals((java.lang.Object) nameProvider17);
        long long22 = dateTimeZone14.convertLocalToUTC((-1L), true);
        java.lang.String str23 = dateTimeZone14.getID();
        boolean boolean25 = dateTimeZone14.isStandardOffset((long) 1);
        boolean boolean26 = dateTimeZone6.equals((java.lang.Object) boolean25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        long long29 = dateTimeZone27.previousTransition((long) ' ');
        java.lang.String str30 = dateTimeZone27.getID();
        java.lang.String str32 = dateTimeZone27.getShortName((long) (short) 0);
        long long34 = dateTimeZone27.previousTransition((long) (short) -1);
        int int36 = dateTimeZone27.getStandardOffset((long) 0);
        long long38 = dateTimeZone27.convertUTCToLocal((long) ' ');
        java.lang.String str40 = dateTimeZone27.getName((long) 600000);
        long long42 = dateTimeZone6.getMillisKeepLocal(dateTimeZone27, 3L);
        long long44 = dateTimeZone27.convertUTCToLocal(25200000L);
        long long46 = dateTimeZone1.getMillisKeepLocal(dateTimeZone27, 3540000L);
        long long48 = dateTimeZone1.previousTransition(24540010L);
        boolean boolean49 = dateTimeZone1.isFixed();
        java.lang.String str51 = dateTimeZone1.getShortName(97L);
        int int53 = dateTimeZone1.getStandardOffset(686159967L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+01:00" + "'", str9, "+01:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:00" + "'", str12, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(nameProvider17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 3600003L + "'", long42 == 3600003L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 25200000L + "'", long44 == 25200000L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 3540001L + "'", long46 == 3540001L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 24540010L + "'", long48 == 24540010L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00:00.001" + "'", str51, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long13 = dateTimeZone11.previousTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25199999L + "'", long3 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.toString();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName(0L, locale10);
        java.lang.String str12 = dateTimeZone1.toString();
        long long14 = dateTimeZone1.convertUTCToLocal(35L);
        long long17 = dateTimeZone1.convertLocalToUTC(115260100L, true);
        long long19 = dateTimeZone1.previousTransition(0L);
        java.lang.String str21 = dateTimeZone1.getShortName(21600010L);
        long long23 = dateTimeZone1.nextTransition((-3600001L));
        boolean boolean25 = dateTimeZone1.isStandardOffset(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology26 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 115260100L + "'", long17 == 115260100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-3600001L) + "'", long23 == (-3600001L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone4.getOffset(readableInstant10);
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (long) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        int int11 = dateTimeZone1.getOffset(25200010L);
        long long13 = dateTimeZone1.convertUTCToLocal(359999966L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName((-3600000L), locale15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone1.getShortName(21600010L, locale18);
        java.lang.Object obj20 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        long long23 = dateTimeZone21.previousTransition((long) ' ');
        boolean boolean24 = dateTimeZone21.isFixed();
        long long26 = dateTimeZone21.nextTransition((long) 1);
        long long29 = dateTimeZone21.convertLocalToUTC((long) (byte) 10, false);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone21.getName(599965L, locale31);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.util.TimeZone timeZone35 = dateTimeZone34.toTimeZone();
        boolean boolean36 = dateTimeZone21.equals((java.lang.Object) timeZone35);
        long long38 = dateTimeZone1.getMillisKeepLocal(dateTimeZone21, 0L);
        java.util.TimeZone timeZone39 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 359999966L + "'", long13 == 359999966L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) "");
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName(10L, locale4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone0.isLocalDateTimeGap(localDateTime6);
        long long10 = dateTimeZone0.convertLocalToUTC((long) (-3600000), false);
        int int12 = dateTimeZone0.getStandardOffset(3L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone0.getName(600035L, locale14);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone0.getName(151200010L, locale17);
        long long21 = dateTimeZone0.convertLocalToUTC(0L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3600000L) + "'", long10 == (-3600000L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+10:00");
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 0);
        java.lang.Object obj4 = dateTimeZone1.writeReplace();
        java.lang.Object obj5 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long8 = dateTimeZone1.convertUTCToLocal(431999966L);
        java.lang.String str10 = dateTimeZone1.getName(25200031L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36000000 + "'", int3 == 36000000);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 467999966L + "'", long8 == 467999966L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:00" + "'", str10, "+10:00");
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getNameKey((long) (byte) 1);
        long long8 = dateTimeZone0.convertLocalToUTC((-21599997L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-21599997L) + "'", long8 == (-21599997L));
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        int int3 = dateTimeZone1.getStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long8 = dateTimeZone6.nextTransition((long) '4');
        java.lang.String str9 = dateTimeZone6.toString();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone6.getName((long) (byte) 0, locale11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.String str16 = dateTimeZone14.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider17 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider17);
        boolean boolean19 = dateTimeZone14.equals((java.lang.Object) nameProvider17);
        long long22 = dateTimeZone14.convertLocalToUTC((-1L), true);
        java.lang.String str23 = dateTimeZone14.getID();
        boolean boolean25 = dateTimeZone14.isStandardOffset((long) 1);
        boolean boolean26 = dateTimeZone6.equals((java.lang.Object) boolean25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        long long29 = dateTimeZone27.previousTransition((long) ' ');
        java.lang.String str30 = dateTimeZone27.getID();
        java.lang.String str32 = dateTimeZone27.getShortName((long) (short) 0);
        long long34 = dateTimeZone27.previousTransition((long) (short) -1);
        int int36 = dateTimeZone27.getStandardOffset((long) 0);
        long long38 = dateTimeZone27.convertUTCToLocal((long) ' ');
        java.lang.String str40 = dateTimeZone27.getName((long) 600000);
        long long42 = dateTimeZone6.getMillisKeepLocal(dateTimeZone27, 3L);
        long long44 = dateTimeZone27.convertUTCToLocal(25200000L);
        long long46 = dateTimeZone1.getMillisKeepLocal(dateTimeZone27, 3540000L);
        long long48 = dateTimeZone1.previousTransition(24540010L);
        int int50 = dateTimeZone1.getOffset(7199899L);
        org.joda.time.LocalDateTime localDateTime51 = null;
        boolean boolean52 = dateTimeZone1.isLocalDateTimeGap(localDateTime51);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+01:00" + "'", str9, "+01:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:00" + "'", str12, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(nameProvider17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-36000001L) + "'", long22 == (-36000001L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+10:00" + "'", str23, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 3600003L + "'", long42 == 3600003L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 25200000L + "'", long44 == 25200000L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 3540001L + "'", long46 == 3540001L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 24540010L + "'", long48 == 24540010L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.Object obj8 = dateTimeZone3.writeReplace();
        java.lang.String str10 = dateTimeZone3.getShortName(0L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone3.getShortName(2L, locale12);
        java.lang.String str15 = dateTimeZone3.getShortName((-356880001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:00" + "'", str10, "+10:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+10:00" + "'", str15, "+10:00");
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.Object obj8 = dateTimeZone3.writeReplace();
        java.lang.String str10 = dateTimeZone3.getShortName((long) '4');
        java.lang.String str12 = dateTimeZone3.getShortName(3600000L);
        int int14 = dateTimeZone3.getOffset((long) 100);
        boolean boolean16 = dateTimeZone3.isStandardOffset(10L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:00" + "'", str10, "+10:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36000000 + "'", int14 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(25200035L, locale11);
        long long15 = dateTimeZone1.convertLocalToUTC(25200010L, true);
        int int17 = dateTimeZone1.getStandardOffset((-1L));
        int int19 = dateTimeZone1.getOffset((long) '4');
        int int21 = dateTimeZone1.getOffset((long) (short) 10);
        int int23 = dateTimeZone1.getStandardOffset(1L);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone1.isLocalDateTimeGap(localDateTime24);
        long long27 = dateTimeZone1.previousTransition(25200001L);
        java.lang.String str29 = dateTimeZone1.getNameKey(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-10799990L) + "'", long15 == (-10799990L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36000000 + "'", int17 == 36000000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36000000 + "'", int19 == 36000000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36000000 + "'", int21 == 36000000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 36000000 + "'", int23 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 25200001L + "'", long27 == 25200001L);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(25200035L, locale11);
        long long15 = dateTimeZone1.convertLocalToUTC(25200010L, true);
        int int17 = dateTimeZone1.getStandardOffset((-1L));
        int int19 = dateTimeZone1.getOffset((long) '4');
        long long22 = dateTimeZone1.convertLocalToUTC(0L, false);
        java.lang.Object obj23 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int26 = dateTimeZone1.getOffsetFromLocal((-95L));
        long long28 = dateTimeZone1.previousTransition((-356520000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-10799990L) + "'", long15 == (-10799990L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36000000 + "'", int17 == 36000000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36000000 + "'", int19 == 36000000);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-36000000L) + "'", long22 == (-36000000L));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 36000000 + "'", int26 == 36000000);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-356520000L) + "'", long28 == (-356520000L));
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) '#');
        java.lang.String str4 = dateTimeZone2.getShortName(14400052L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:35" + "'", str4, "-01:35");
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        java.lang.String str10 = dateTimeZone1.getID();
        boolean boolean11 = dateTimeZone1.isFixed();
        java.lang.String str13 = dateTimeZone1.getShortName((long) ' ');
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        java.lang.String str15 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-36000001L) + "'", long9 == (-36000001L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:00" + "'", str10, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+10:00" + "'", str15, "+10:00");
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        java.lang.String str10 = dateTimeZone1.getID();
        boolean boolean11 = dateTimeZone1.isFixed();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName(1L, locale13);
        java.lang.String str16 = dateTimeZone1.getNameKey((long) (short) -1);
        long long19 = dateTimeZone1.convertLocalToUTC(3599999L, true);
        int int21 = dateTimeZone1.getOffsetFromLocal(360000000L);
        int int23 = dateTimeZone1.getStandardOffset(10L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Object obj25 = dateTimeZone1.writeReplace();
        int int27 = dateTimeZone1.getStandardOffset(724200000L);
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = dateTimeZone1.isLocalDateTimeGap(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-36000001L) + "'", long9 == (-36000001L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:00" + "'", str10, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-32400001L) + "'", long19 == (-32400001L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36000000 + "'", int21 == 36000000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 36000000 + "'", int23 == 36000000);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36000000 + "'", int27 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(0L, locale3);
        long long7 = dateTimeZone1.convertLocalToUTC(0L, true);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) (byte) -1);
        java.lang.String str11 = dateTimeZone1.getNameKey((-60034L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName((-349800096L), locale13);
        int int16 = dateTimeZone1.getStandardOffset(25799965L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.097" + "'", str4, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-97L) + "'", long7 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.097" + "'", str14, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        int int11 = dateTimeZone1.getOffset((long) (short) 100);
        boolean boolean12 = dateTimeZone1.isFixed();
        int int14 = dateTimeZone1.getStandardOffset(50400010L);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        boolean boolean17 = dateTimeZone15.equals((java.lang.Object) "");
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone15.getName(10L, locale19);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone15.isLocalDateTimeGap(localDateTime21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone15.getOffset(readableInstant23);
        long long26 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, 0L);
        java.lang.String str28 = dateTimeZone15.getName(126000035L);
        long long30 = dateTimeZone15.previousTransition(3600096L);
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = dateTimeZone15.isLocalDateTimeGap(localDateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-36000001L) + "'", long9 == (-36000001L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36000000 + "'", int11 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36000000 + "'", int14 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 36000000L + "'", long26 == 36000000L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3600096L + "'", long30 == 3600096L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        long long5 = dateTimeZone1.convertUTCToLocal(25800010L);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        long long11 = dateTimeZone1.convertLocalToUTC(723599966L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 61800010L + "'", long5 == 61800010L);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36000000 + "'", int8 == 36000000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 687599966L + "'", long11 == 687599966L);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        int int3 = dateTimeZone1.getOffsetFromLocal(0L);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal(360000052L);
        java.lang.String str8 = dateTimeZone1.getNameKey(64200010L);
        long long10 = dateTimeZone1.convertUTCToLocal(324059967L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 324059966L + "'", long10 == 324059966L);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(25200035L, locale11);
        long long15 = dateTimeZone1.convertLocalToUTC(25200010L, true);
        int int17 = dateTimeZone1.getStandardOffset((-1L));
        int int19 = dateTimeZone1.getOffset((long) '4');
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone1.getShortName(362100000L, locale21);
        int int24 = dateTimeZone1.getStandardOffset(59999L);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone1.getShortName(3600011L, locale26);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-10799990L) + "'", long15 == (-10799990L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36000000 + "'", int17 == 36000000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36000000 + "'", int19 == 36000000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+10:00" + "'", str22, "+10:00");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36000000 + "'", int24 == 36000000);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+10:00" + "'", str27, "+10:00");
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.Object obj4 = dateTimeZone0.writeReplace();
        int int6 = dateTimeZone0.getStandardOffset((long) 1);
        java.lang.String str7 = dateTimeZone0.getID();
        java.lang.String str9 = dateTimeZone0.getNameKey((long) (byte) 0);
        java.lang.String str11 = dateTimeZone0.getNameKey((-362100001L));
        long long13 = dateTimeZone0.nextTransition(486000001L);
        java.lang.String str14 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 486000001L + "'", long13 == 486000001L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        java.lang.String str7 = dateTimeZone0.toString();
        boolean boolean9 = dateTimeZone0.isStandardOffset(97L);
        long long11 = dateTimeZone0.previousTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        long long5 = dateTimeZone1.previousTransition((long) (byte) -1);
        java.lang.String str7 = dateTimeZone1.getShortName((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone10.getOffset(readableInstant11);
        int int14 = dateTimeZone10.getStandardOffset((long) 25200000);
        java.lang.String str16 = dateTimeZone10.getName(100L);
        java.lang.Object obj17 = dateTimeZone10.writeReplace();
        java.lang.String str19 = dateTimeZone10.getNameKey(25200009L);
        boolean boolean20 = dateTimeZone10.isFixed();
        boolean boolean22 = dateTimeZone10.isStandardOffset((-36600000L));
        boolean boolean23 = dateTimeZone1.equals((java.lang.Object) boolean22);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+10:00" + "'", str7, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36000000 + "'", int12 == 36000000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36000000 + "'", int14 == 36000000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getStandardOffset(0L);
        int int7 = dateTimeZone1.getOffsetFromLocal(323999967L);
        java.lang.String str8 = dateTimeZone1.getID();
        java.lang.String str10 = dateTimeZone1.getNameKey(392399967L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str6 = dateTimeZone0.getID();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName((-25200001L), locale8);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        java.lang.String str11 = dateTimeZone0.toString();
        long long13 = dateTimeZone0.nextTransition((long) (-1));
        java.util.TimeZone timeZone14 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        int int17 = dateTimeZone15.getOffsetFromLocal((-25200001L));
        long long19 = dateTimeZone15.previousTransition(600001L);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone15.getName(362640000L, locale21);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600001L + "'", long19 == 600001L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str6 = dateTimeZone0.getID();
        java.lang.String str7 = dateTimeZone0.toString();
        long long9 = dateTimeZone0.convertUTCToLocal(3540001L);
        long long11 = dateTimeZone0.nextTransition((long) (byte) 100);
        int int13 = dateTimeZone0.getOffset((-358560000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3540001L + "'", long9 == 3540001L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str5 = dateTimeZone1.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone6.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone10.previousTransition((long) ' ');
        java.lang.String str13 = dateTimeZone10.getID();
        java.lang.Object obj14 = dateTimeZone10.writeReplace();
        boolean boolean15 = dateTimeZone6.equals((java.lang.Object) dateTimeZone10);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) dateTimeZone10);
        long long18 = dateTimeZone1.convertUTCToLocal(25200010L);
        boolean boolean20 = dateTimeZone1.isStandardOffset(0L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone1.getName((long) 36000000, locale22);
        int int25 = dateTimeZone1.getOffset(21599958L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36000000 + "'", int3 == 36000000);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 61200010L + "'", long18 == 61200010L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+10:00" + "'", str23, "+10:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 36000000 + "'", int25 == 36000000);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 10, false);
        java.lang.Object obj9 = dateTimeZone0.writeReplace();
        int int11 = dateTimeZone0.getOffsetFromLocal(387300010L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone12.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        long long18 = dateTimeZone16.previousTransition((long) ' ');
        java.lang.String str19 = dateTimeZone16.getID();
        java.lang.Object obj20 = dateTimeZone16.writeReplace();
        boolean boolean21 = dateTimeZone12.equals((java.lang.Object) dateTimeZone16);
        java.lang.String str23 = dateTimeZone16.getName(97L);
        int int25 = dateTimeZone16.getStandardOffset((long) 10);
        long long27 = dateTimeZone0.getMillisKeepLocal(dateTimeZone16, (-337499990L));
        java.util.TimeZone timeZone28 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone30);
        java.util.TimeZone timeZone32 = dateTimeZone30.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-337499990L) + "'", long27 == (-337499990L));
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        boolean boolean8 = dateTimeZone0.isStandardOffset(50400010L);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone10.getOffset(readableInstant11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone13.previousTransition((long) ' ');
        java.lang.String str16 = dateTimeZone13.getID();
        java.lang.String str18 = dateTimeZone13.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone13.getOffset(readableInstant19);
        long long22 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) '#');
        java.lang.String str24 = dateTimeZone10.getName((long) 362100000);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone10.getShortName(25800011L, locale26);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone29.getOffset(readableInstant30);
        int int33 = dateTimeZone29.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone34 = dateTimeZone29.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        long long38 = dateTimeZone35.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        long long41 = dateTimeZone39.previousTransition((long) ' ');
        java.lang.String str42 = dateTimeZone39.getID();
        java.lang.Object obj43 = dateTimeZone39.writeReplace();
        boolean boolean44 = dateTimeZone35.equals((java.lang.Object) dateTimeZone39);
        java.util.Locale locale46 = null;
        java.lang.String str47 = dateTimeZone35.getName(100L, locale46);
        long long50 = dateTimeZone35.convertLocalToUTC((long) (short) 10, false);
        long long52 = dateTimeZone29.getMillisKeepLocal(dateTimeZone35, (-362100000L));
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.UTC;
        long long55 = dateTimeZone53.previousTransition((long) ' ');
        java.lang.String str56 = dateTimeZone53.getID();
        java.lang.String str58 = dateTimeZone53.getShortName((long) (short) 0);
        long long60 = dateTimeZone53.nextTransition((long) (byte) 10);
        long long62 = dateTimeZone53.convertUTCToLocal((long) 100);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.UTC;
        boolean boolean65 = dateTimeZone63.equals((java.lang.Object) "");
        java.util.Locale locale67 = null;
        java.lang.String str68 = dateTimeZone63.getName(10L, locale67);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long72 = dateTimeZone63.getMillisKeepLocal(dateTimeZone70, (long) (short) 0);
        int int74 = dateTimeZone70.getStandardOffset(100L);
        long long76 = dateTimeZone53.getMillisKeepLocal(dateTimeZone70, (long) (-1));
        long long78 = dateTimeZone53.previousTransition(600035L);
        long long80 = dateTimeZone29.getMillisKeepLocal(dateTimeZone53, (long) 600000);
        java.util.TimeZone timeZone81 = dateTimeZone53.toTimeZone();
        boolean boolean82 = dateTimeZone10.equals((java.lang.Object) dateTimeZone53);
        long long84 = dateTimeZone0.getMillisKeepLocal(dateTimeZone10, 25200036L);
        java.util.TimeZone timeZone85 = dateTimeZone0.toTimeZone();
        java.util.Locale locale87 = null;
        java.lang.String str88 = dateTimeZone0.getShortName(28800011L, locale87);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 32L + "'", long41 == 32L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00" + "'", str47, "+00:00");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 10L + "'", long50 == 10L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-362100000L) + "'", long52 == (-362100000L));
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 32L + "'", long55 == 32L);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "UTC" + "'", str56, "UTC");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+00:00" + "'", str58, "+00:00");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 10L + "'", long60 == 10L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 100L + "'", long62 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "+00:00" + "'", str68, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 3600000L + "'", long72 == 3600000L);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-3600000) + "'", int74 == (-3600000));
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 3599999L + "'", long76 == 3599999L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 600035L + "'", long78 == 600035L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 600000L + "'", long80 == 600000L);
        org.junit.Assert.assertNotNull(timeZone81);
        org.junit.Assert.assertEquals(timeZone81.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 25200036L + "'", long84 == 25200036L);
        org.junit.Assert.assertNotNull(timeZone85);
        org.junit.Assert.assertEquals(timeZone85.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "+00:00" + "'", str88, "+00:00");
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(25200035L, locale11);
        long long15 = dateTimeZone1.convertLocalToUTC(25200010L, true);
        int int17 = dateTimeZone1.getStandardOffset((-1L));
        int int19 = dateTimeZone1.getOffset((long) '4');
        int int21 = dateTimeZone1.getOffset((long) (short) 10);
        int int23 = dateTimeZone1.getStandardOffset(1L);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone1.isLocalDateTimeGap(localDateTime24);
        long long27 = dateTimeZone1.convertUTCToLocal(599965L);
        java.lang.String str29 = dateTimeZone1.getNameKey(600000L);
        long long32 = dateTimeZone1.convertLocalToUTC((-2L), false);
        int int34 = dateTimeZone1.getOffsetFromLocal(392399967L);
        int int36 = dateTimeZone1.getStandardOffset((-131100035L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25200010L + "'", long15 == 25200010L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 599965L + "'", long27 == 599965L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-2L) + "'", long32 == (-2L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(25200035L, locale11);
        int int14 = dateTimeZone1.getOffsetFromLocal(7199998L);
        java.lang.String str15 = dateTimeZone1.getID();
        int int17 = dateTimeZone1.getStandardOffset((-290100000L));
        java.lang.Object obj18 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long4 = dateTimeZone2.nextTransition((long) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long9 = dateTimeZone7.nextTransition((long) '4');
        java.lang.String str10 = dateTimeZone7.toString();
        long long12 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, 387300010L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone7.getOffset(readableInstant13);
        boolean boolean16 = dateTimeZone7.isStandardOffset(24540010L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone7.getShortName((-362040001L), locale18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone7.getShortName((-358560000L), locale21);
        java.lang.String str23 = dateTimeZone7.toString();
        java.lang.String str25 = dateTimeZone7.getShortName(14400010L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:00" + "'", str10, "+01:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 387300010L + "'", long12 == 387300010L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3600000 + "'", int14 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+01:00" + "'", str19, "+01:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+01:00" + "'", str22, "+01:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+01:00" + "'", str23, "+01:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+01:00" + "'", str25, "+01:00");
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(1L);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) '4');
        boolean boolean9 = dateTimeZone1.isFixed();
        java.lang.String str10 = dateTimeZone1.toString();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str14 = dateTimeZone12.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider15 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider15);
        boolean boolean17 = dateTimeZone12.equals((java.lang.Object) nameProvider15);
        long long20 = dateTimeZone12.convertLocalToUTC((-1L), true);
        java.lang.String str21 = dateTimeZone12.getID();
        boolean boolean22 = dateTimeZone12.isFixed();
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone12.getName(1L, locale24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone12.getOffset(readableInstant26);
        long long30 = dateTimeZone12.convertLocalToUTC((long) (byte) 10, false);
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = dateTimeZone12.getOffset(readableInstant31);
        java.lang.String str33 = dateTimeZone12.toString();
        long long35 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 3600011L);
        java.lang.Object obj36 = null;
        boolean boolean37 = dateTimeZone1.equals(obj36);
        int int39 = dateTimeZone1.getOffsetFromLocal(324000001L);
        long long41 = dateTimeZone1.previousTransition((-599904L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(nameProvider15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 3600012L + "'", long35 == 3600012L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-599904L) + "'", long41 == (-599904L));
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.Object obj8 = dateTimeZone3.writeReplace();
        java.lang.String str10 = dateTimeZone3.getShortName((long) '4');
        java.lang.String str12 = dateTimeZone3.getShortName(3600000L);
        int int14 = dateTimeZone3.getOffset((long) 100);
        java.lang.String str16 = dateTimeZone3.getName(25200001L);
        java.util.TimeZone timeZone17 = dateTimeZone3.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getName(100L, locale11);
        int int14 = dateTimeZone0.getOffsetFromLocal(32L);
        long long16 = dateTimeZone0.convertUTCToLocal((long) (byte) 100);
        long long18 = dateTimeZone0.nextTransition((long) 0);
        java.util.TimeZone timeZone19 = dateTimeZone0.toTimeZone();
        boolean boolean20 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long24 = dateTimeZone0.getMillisKeepLocal(dateTimeZone22, (long) '4');
        long long27 = dateTimeZone22.convertLocalToUTC(115200000L, true);
        int int29 = dateTimeZone22.getStandardOffset(35999904L);
        long long31 = dateTimeZone22.previousTransition((-59990L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-48L) + "'", long24 == (-48L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115199900L + "'", long27 == 115199900L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-59990L) + "'", long31 == (-59990L));
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str6 = dateTimeZone0.getID();
        java.lang.String str7 = dateTimeZone0.toString();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName(0L, locale9);
        java.lang.String str11 = dateTimeZone0.toString();
        long long13 = dateTimeZone0.convertUTCToLocal(35L);
        java.lang.Object obj14 = dateTimeZone0.writeReplace();
        int int16 = dateTimeZone0.getOffset(0L);
        java.util.TimeZone timeZone17 = dateTimeZone0.toTimeZone();
        java.util.TimeZone timeZone18 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        int int21 = dateTimeZone19.getOffsetFromLocal(36600000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(25200035L, locale11);
        long long15 = dateTimeZone1.convertLocalToUTC(25200010L, true);
        int int17 = dateTimeZone1.getStandardOffset((-1L));
        int int19 = dateTimeZone1.getOffset((long) '4');
        int int21 = dateTimeZone1.getOffset((long) (short) 10);
        int int23 = dateTimeZone1.getStandardOffset(1L);
        java.lang.String str25 = dateTimeZone1.getName((long) 'a');
        long long27 = dateTimeZone1.previousTransition((-337499990L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int30 = dateTimeZone1.getStandardOffset(25800012L);
        java.util.TimeZone timeZone31 = dateTimeZone1.toTimeZone();
        org.joda.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = dateTimeZone1.isLocalDateTimeGap(localDateTime32);
        int int35 = dateTimeZone1.getOffset((-32400000L));
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone1.getName(196499967L, locale37);
        int int40 = dateTimeZone1.getStandardOffset((-401700096L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25200010L + "'", long15 == 25200010L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-337499990L) + "'", long27 == (-337499990L));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 10, false);
        java.lang.Object obj9 = dateTimeZone0.writeReplace();
        int int11 = dateTimeZone0.getOffsetFromLocal(387300010L);
        int int13 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.Class<?> wildcardClass14 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone0.isLocalDateTimeGap(localDateTime7);
        java.lang.String str10 = dateTimeZone0.getShortName(60001L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int13 = dateTimeZone0.getOffset((-60000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 10, locale3);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        java.lang.String str7 = dateTimeZone1.getName(96L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) (byte) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str4 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:01" + "'", str4, "-01:01");
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long3 = dateTimeZone1.nextTransition((long) ' ');
        int int5 = dateTimeZone1.getStandardOffset(25200010L);
        int int7 = dateTimeZone1.getOffset((long) (short) 1);
        long long9 = dateTimeZone1.convertUTCToLocal(387300010L);
        java.lang.String str10 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 387300062L + "'", long9 == 387300062L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.052" + "'", str10, "+00:00:00.052");
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone4.getOffset(readableInstant10);
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (long) '#');
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.lang.String str19 = dateTimeZone17.getNameKey(10L);
        long long21 = dateTimeZone15.getMillisKeepLocal(dateTimeZone17, (long) 1);
        java.lang.String str23 = dateTimeZone15.getName((long) 0);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone15.getName(25200035L, locale25);
        int int28 = dateTimeZone15.getOffset((long) '4');
        java.lang.String str30 = dateTimeZone15.getNameKey((long) 0);
        int int32 = dateTimeZone15.getOffset(7199999L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        java.lang.String str34 = dateTimeZone15.toString();
        long long36 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, (-21599997L));
        java.lang.String str37 = dateTimeZone15.getID();
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        boolean boolean41 = dateTimeZone39.isStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        int int47 = dateTimeZone45.getOffset(readableInstant46);
        java.lang.String str49 = dateTimeZone45.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.UTC;
        long long53 = dateTimeZone50.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
        long long56 = dateTimeZone54.previousTransition((long) ' ');
        java.lang.String str57 = dateTimeZone54.getID();
        java.lang.Object obj58 = dateTimeZone54.writeReplace();
        boolean boolean59 = dateTimeZone50.equals((java.lang.Object) dateTimeZone54);
        boolean boolean60 = dateTimeZone45.equals((java.lang.Object) dateTimeZone54);
        long long62 = dateTimeZone45.convertUTCToLocal(25200010L);
        long long64 = dateTimeZone43.getMillisKeepLocal(dateTimeZone45, (long) (-1));
        java.util.TimeZone timeZone65 = null;
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        org.joda.time.ReadableInstant readableInstant67 = null;
        int int68 = dateTimeZone66.getOffset(readableInstant67);
        java.lang.String str70 = dateTimeZone66.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.UTC;
        long long74 = dateTimeZone71.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.UTC;
        long long77 = dateTimeZone75.previousTransition((long) ' ');
        java.lang.String str78 = dateTimeZone75.getID();
        java.lang.Object obj79 = dateTimeZone75.writeReplace();
        boolean boolean80 = dateTimeZone71.equals((java.lang.Object) dateTimeZone75);
        boolean boolean81 = dateTimeZone66.equals((java.lang.Object) dateTimeZone75);
        java.lang.String str82 = dateTimeZone75.toString();
        long long84 = dateTimeZone45.getMillisKeepLocal(dateTimeZone75, (long) (short) 100);
        int int86 = dateTimeZone75.getOffset((long) (byte) 1);
        long long88 = dateTimeZone39.getMillisKeepLocal(dateTimeZone75, 35L);
        int int90 = dateTimeZone75.getStandardOffset(50459910L);
        long long92 = dateTimeZone15.getMillisKeepLocal(dateTimeZone75, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3660000) + "'", int3 == (-3660000));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3659965L) + "'", long13 == (-3659965L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-01:01" + "'", str23, "-01:01");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-01:01" + "'", str26, "-01:01");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-3660000) + "'", int28 == (-3660000));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-3660000) + "'", int32 == (-3660000));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-01:01" + "'", str34, "-01:01");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-21599997L) + "'", long36 == (-21599997L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-01:01" + "'", str37, "-01:01");
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-3660000) + "'", int47 == (-3660000));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 32L + "'", long56 == 32L);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "UTC" + "'", str57, "UTC");
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 21540010L + "'", long62 == 21540010L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 3660000L + "'", long64 == 3660000L);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-3660000) + "'", int68 == (-3660000));
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-1L) + "'", long74 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone75);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 32L + "'", long77 == 32L);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "UTC" + "'", str78, "UTC");
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "UTC" + "'", str82, "UTC");
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-3659900L) + "'", long84 == (-3659900L));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + (-3659965L) + "'", long88 == (-3659965L));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + (-3660000L) + "'", long92 == (-3660000L));
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        int int7 = dateTimeZone0.getOffset((long) (short) 0);
        long long10 = dateTimeZone0.convertLocalToUTC((-2L), true);
        int int12 = dateTimeZone0.getStandardOffset((long) '4');
        long long15 = dateTimeZone0.convertLocalToUTC(7200000L, false);
        int int17 = dateTimeZone0.getStandardOffset(360060000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 7200000L + "'", long15 == 7200000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str3 = dateTimeZone1.getShortName(25199999L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.Object obj4 = dateTimeZone0.writeReplace();
        int int6 = dateTimeZone0.getStandardOffset((long) 1);
        long long8 = dateTimeZone0.nextTransition(25199999L);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        java.lang.String str11 = dateTimeZone0.getName((-115200001L));
        java.lang.String str12 = dateTimeZone0.getID();
        java.lang.String str14 = dateTimeZone0.getNameKey(115199900L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25199999L + "'", long8 == 25199999L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3660000, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(189300000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        long long9 = dateTimeZone3.convertUTCToLocal((long) (-1));
        long long11 = dateTimeZone3.nextTransition((long) (byte) 10);
        long long13 = dateTimeZone3.previousTransition(2L);
        java.lang.String str15 = dateTimeZone3.getName(387300062L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.Object obj4 = dateTimeZone0.writeReplace();
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone0.isLocalDateTimeGap(localDateTime5);
        java.lang.String str8 = dateTimeZone0.getNameKey((-32400000L));
        java.lang.Object obj9 = dateTimeZone0.writeReplace();
        long long11 = dateTimeZone0.nextTransition((-358500000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-358500000L) + "'", long11 == (-358500000L));
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(97, 10);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone3.previousTransition((long) ' ');
        boolean boolean6 = dateTimeZone3.isFixed();
        long long8 = dateTimeZone3.nextTransition((long) 1);
        java.lang.String str10 = dateTimeZone3.getName((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        long long13 = dateTimeZone3.nextTransition((-35L));
        java.lang.String str15 = dateTimeZone3.getNameKey(50400010L);
        long long17 = dateTimeZone3.previousTransition((-25200001L));
        java.lang.String str19 = dateTimeZone3.getShortName((-1L));
        java.lang.Object obj20 = dateTimeZone3.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        long long23 = dateTimeZone2.getMillisKeepLocal(dateTimeZone3, (-34L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-35L) + "'", long13 == (-35L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-25200001L) + "'", long17 == (-25200001L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 349799966L + "'", long23 == 349799966L);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long7 = dateTimeZone0.previousTransition((long) (short) -1);
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str15 = dateTimeZone13.getNameKey(10L);
        long long17 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 1);
        long long19 = dateTimeZone11.nextTransition(10L);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        long long22 = dateTimeZone20.previousTransition((long) ' ');
        java.lang.String str23 = dateTimeZone20.getID();
        java.lang.String str25 = dateTimeZone20.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone20.getOffset(readableInstant26);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone20.getName((long) (byte) -1, locale29);
        int int32 = dateTimeZone20.getOffsetFromLocal((long) (byte) 100);
        long long35 = dateTimeZone20.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str37 = dateTimeZone20.getName(600035L);
        boolean boolean38 = dateTimeZone11.equals((java.lang.Object) str37);
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        java.lang.String str44 = dateTimeZone42.getNameKey(10L);
        long long46 = dateTimeZone40.getMillisKeepLocal(dateTimeZone42, (long) 1);
        java.lang.String str48 = dateTimeZone40.getName((long) 0);
        int int50 = dateTimeZone40.getOffset(25200010L);
        java.lang.String str52 = dateTimeZone40.getShortName((-1L));
        boolean boolean53 = dateTimeZone11.equals((java.lang.Object) dateTimeZone40);
        boolean boolean54 = dateTimeZone9.equals((java.lang.Object) dateTimeZone40);
        long long56 = dateTimeZone40.nextTransition(3600000L);
        int int58 = dateTimeZone40.getOffset(328200000L);
        java.lang.Object obj59 = dateTimeZone40.writeReplace();
        java.lang.Class<?> wildcardClass60 = obj59.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00" + "'", str48, "+00:00");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:00" + "'", str52, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 3600000L + "'", long56 == 3600000L);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        int int11 = dateTimeZone1.getOffset((long) (short) 100);
        boolean boolean12 = dateTimeZone1.isFixed();
        boolean boolean14 = dateTimeZone1.isStandardOffset((long) (-1));
        boolean boolean16 = dateTimeZone1.isStandardOffset(600010L);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) '#');
        java.lang.String str21 = dateTimeZone19.getName(25200000L);
        boolean boolean23 = dateTimeZone19.isStandardOffset((long) (short) 0);
        java.lang.String str24 = dateTimeZone19.toString();
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone19.getName((-36600000L), locale26);
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = dateTimeZone19.isLocalDateTimeGap(localDateTime28);
        long long31 = dateTimeZone1.getMillisKeepLocal(dateTimeZone19, 64200010L);
        long long33 = dateTimeZone1.previousTransition((long) '#');
        long long35 = dateTimeZone1.convertUTCToLocal((-356520000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+35:35" + "'", str21, "+35:35");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+35:35" + "'", str24, "+35:35");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+35:35" + "'", str27, "+35:35");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-63899990L) + "'", long31 == (-63899990L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 35L + "'", long33 == 35L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-356520000L) + "'", long35 == (-356520000L));
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        int int11 = dateTimeZone1.getOffset((long) (short) 100);
        boolean boolean12 = dateTimeZone1.isFixed();
        int int14 = dateTimeZone1.getStandardOffset(50400010L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        long long18 = dateTimeZone16.convertUTCToLocal(25800010L);
        boolean boolean19 = dateTimeZone1.equals((java.lang.Object) long18);
        java.util.TimeZone timeZone20 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25800011L + "'", long18 == 25800011L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 10, false);
        java.lang.String str10 = dateTimeZone0.getNameKey(362100000L);
        java.lang.String str12 = dateTimeZone0.getShortName(50400010L);
        java.lang.Object obj13 = dateTimeZone0.writeReplace();
        java.lang.Class<?> wildcardClass14 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}
