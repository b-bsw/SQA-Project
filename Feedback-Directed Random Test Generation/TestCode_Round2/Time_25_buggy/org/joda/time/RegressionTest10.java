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
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        int int4 = dateTimeZone2.getOffsetFromLocal(115200000L);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone2.isLocalDateTimeGap(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2100000 + "'", int4 == 2100000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        long long10 = dateTimeZone0.previousTransition((long) 100);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone0.getOffset(readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone0.getOffset(readableInstant13);
        java.lang.String str16 = dateTimeZone0.getShortName((-37920000L));
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone0.getName(104939903L, locale18);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone7.nextTransition(1L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone7.isLocalDateTimeGap(localDateTime10);
        int int13 = dateTimeZone7.getOffsetFromLocal((-126000000L));
        java.lang.String str15 = dateTimeZone7.getName(1740001L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone0.getName(100L, locale6);
        long long9 = dateTimeZone0.previousTransition((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone10.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean15 = dateTimeZone10.isFixed();
        java.lang.String str17 = dateTimeZone10.getShortName((-1L));
        java.util.TimeZone timeZone18 = dateTimeZone10.toTimeZone();
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone10.getShortName(0L, locale20);
        boolean boolean22 = dateTimeZone0.equals((java.lang.Object) str21);
        long long24 = dateTimeZone0.convertUTCToLocal((long) 10);
        java.lang.String str25 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        long long30 = dateTimeZone26.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean31 = dateTimeZone26.isFixed();
        java.lang.String str33 = dateTimeZone26.getShortName((-1L));
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone26.getOffset(readableInstant34);
        java.lang.String str37 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        long long42 = dateTimeZone38.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean43 = dateTimeZone38.isFixed();
        java.util.TimeZone timeZone44 = dateTimeZone38.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        int int47 = dateTimeZone45.getOffsetFromLocal((long) (short) 0);
        boolean boolean48 = dateTimeZone45.isFixed();
        boolean boolean49 = dateTimeZone26.equals((java.lang.Object) boolean48);
        boolean boolean50 = dateTimeZone26.isFixed();
        long long52 = dateTimeZone0.getMillisKeepLocal(dateTimeZone26, (-36060000L));
        java.lang.String str54 = dateTimeZone0.getName(0L);
        java.lang.Object obj55 = dateTimeZone0.writeReplace();
        boolean boolean57 = dateTimeZone0.isStandardOffset((long) 126000000);
        long long59 = dateTimeZone0.nextTransition((long) 39120000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-36060000L) + "'", long52 == (-36060000L));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00" + "'", str54, "+00:00");
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 39120000L + "'", long59 == 39120000L);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone0.getShortName((long) (short) -1, locale3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone5.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean10 = dateTimeZone5.isFixed();
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.toString();
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone12, (long) 100);
        int int17 = dateTimeZone12.getOffset(0L);
        int int19 = dateTimeZone12.getStandardOffset(3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long10 = dateTimeZone6.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean11 = dateTimeZone6.isFixed();
        java.util.TimeZone timeZone12 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone13, (long) (byte) 10);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone0.getName((long) (short) 1, locale17);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone0.isLocalDateTimeGap(localDateTime19);
        java.util.TimeZone timeZone21 = dateTimeZone0.toTimeZone();
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone0.getOffset(readableInstant22);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long27 = dateTimeZone0.convertLocalToUTC((-223859999L), false);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone0.getName(226800000L, locale29);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-223859999L) + "'", long27 == (-223859999L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((long) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long8 = dateTimeZone4.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean9 = dateTimeZone4.isFixed();
        java.util.TimeZone timeZone10 = dateTimeZone4.toTimeZone();
        int int12 = dateTimeZone4.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        boolean boolean15 = dateTimeZone4.isStandardOffset((long) (-1));
        long long17 = dateTimeZone4.convertUTCToLocal(100L);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, 10L);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long24 = dateTimeZone21.convertLocalToUTC(0L, true);
        boolean boolean25 = dateTimeZone21.isFixed();
        long long27 = dateTimeZone4.getMillisKeepLocal(dateTimeZone21, (long) 115200000);
        long long29 = dateTimeZone4.nextTransition((-3599968L));
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long33 = dateTimeZone31.previousTransition((long) 100);
        java.lang.String str34 = dateTimeZone31.getID();
        long long36 = dateTimeZone31.convertUTCToLocal(10L);
        java.lang.String str37 = dateTimeZone31.getID();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        int int41 = dateTimeZone39.getOffset(39660100L);
        long long45 = dateTimeZone39.convertLocalToUTC(36000042L, false, (-3599890L));
        long long47 = dateTimeZone31.getMillisKeepLocal(dateTimeZone39, 36600000L);
        org.joda.time.tz.Provider provider48 = org.joda.time.DateTimeZone.getProvider();
        boolean boolean49 = dateTimeZone31.equals((java.lang.Object) provider48);
        org.joda.time.DateTimeZone.setProvider(provider48);
        boolean boolean51 = dateTimeZone4.equals((java.lang.Object) provider48);
        org.joda.time.ReadableInstant readableInstant52 = null;
        int int53 = dateTimeZone4.getOffset(readableInstant52);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3600010L + "'", long19 == 3600010L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3600000L) + "'", long24 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 111600000L + "'", long27 == 111600000L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-3599968L) + "'", long29 == (-3599968L));
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+01:00" + "'", str34, "+01:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 3600010L + "'", long36 == 3600010L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+01:00" + "'", str37, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 35999945L + "'", long45 == 35999945L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 40199903L + "'", long47 == 40199903L);
        org.junit.Assert.assertNotNull(provider48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        int int7 = dateTimeZone0.getStandardOffset(0L);
        java.lang.Object obj8 = dateTimeZone0.writeReplace();
        long long12 = dateTimeZone0.convertLocalToUTC(0L, false, 32400001L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone0.getShortName((long) (short) 1, locale14);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone0.getShortName(1L, locale17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        long long23 = dateTimeZone19.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean24 = dateTimeZone19.isFixed();
        java.util.TimeZone timeZone25 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        int int28 = dateTimeZone26.getOffsetFromLocal((long) (short) 0);
        boolean boolean29 = dateTimeZone26.isFixed();
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone26.getShortName((long) '4', locale31);
        org.joda.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = dateTimeZone26.isLocalDateTimeGap(localDateTime33);
        java.lang.String str35 = dateTimeZone26.toString();
        long long37 = dateTimeZone0.getMillisKeepLocal(dateTimeZone26, 223200010L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 223200010L + "'", long37 == 223200010L);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        boolean boolean12 = dateTimeZone0.isStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long17 = dateTimeZone13.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean18 = dateTimeZone13.isFixed();
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        int int22 = dateTimeZone20.getOffsetFromLocal((long) (short) 0);
        java.lang.String str24 = dateTimeZone20.getShortName((long) (byte) 10);
        long long26 = dateTimeZone0.getMillisKeepLocal(dateTimeZone20, 0L);
        boolean boolean27 = dateTimeZone0.isFixed();
        int int29 = dateTimeZone0.getStandardOffset(0L);
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone0.getOffset(readableInstant30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = dateTimeZone0.getOffset(readableInstant32);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.lang.String str37 = dateTimeZone35.getShortName((long) (byte) 100);
        long long40 = dateTimeZone35.convertLocalToUTC((long) '4', true);
        java.util.Locale locale42 = null;
        java.lang.String str43 = dateTimeZone35.getShortName((long) ' ', locale42);
        boolean boolean44 = dateTimeZone0.equals((java.lang.Object) ' ');
        long long46 = dateTimeZone0.convertUTCToLocal(363120000L);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        long long51 = dateTimeZone47.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean52 = dateTimeZone47.isFixed();
        java.lang.String str54 = dateTimeZone47.getShortName((-1L));
        java.util.TimeZone timeZone55 = dateTimeZone47.toTimeZone();
        long long57 = dateTimeZone47.nextTransition((-3600000L));
        long long60 = dateTimeZone47.convertLocalToUTC(36000042L, false);
        int int62 = dateTimeZone47.getOffsetFromLocal((-75119965L));
        long long64 = dateTimeZone0.getMillisKeepLocal(dateTimeZone47, (-32L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.010" + "'", str37, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 42L + "'", long40 == 42L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.010" + "'", str43, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 363120000L + "'", long46 == 363120000L);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00" + "'", str54, "+00:00");
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-3600000L) + "'", long57 == (-3600000L));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 36000042L + "'", long60 == 36000042L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-32L) + "'", long64 == (-32L));
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:10");
        java.lang.String str3 = dateTimeZone1.getName(144600000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:10" + "'", str3, "+00:10");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        java.lang.String str11 = dateTimeZone0.getShortName((long) (short) 10);
        int int13 = dateTimeZone0.getStandardOffset((-126000000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean7 = dateTimeZone0.isStandardOffset((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone0.isLocalDateTimeGap(localDateTime8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int12 = dateTimeZone0.getOffset(3599945L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        long long8 = dateTimeZone0.nextTransition((long) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long13 = dateTimeZone10.convertLocalToUTC(0L, true);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone10.isLocalDateTimeGap(localDateTime14);
        int int17 = dateTimeZone10.getOffsetFromLocal((long) 1);
        java.lang.String str19 = dateTimeZone10.getNameKey((long) '4');
        boolean boolean20 = dateTimeZone0.equals((java.lang.Object) dateTimeZone10);
        java.lang.String str21 = dateTimeZone10.getID();
        long long23 = dateTimeZone10.nextTransition(39600010L);
        int int25 = dateTimeZone10.getOffset((-10800001L));
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone10.isLocalDateTimeGap(localDateTime26);
        boolean boolean28 = dateTimeZone10.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3600000L) + "'", long13 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3600000 + "'", int17 == 3600000);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+01:00" + "'", str21, "+01:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 39600010L + "'", long23 == 39600010L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3600000 + "'", int25 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        int int6 = dateTimeZone1.getOffsetFromLocal((-10L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone9.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean14 = dateTimeZone9.isFixed();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        long long19 = dateTimeZone15.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean20 = dateTimeZone15.isFixed();
        java.util.TimeZone timeZone21 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        long long24 = dateTimeZone9.getMillisKeepLocal(dateTimeZone22, (long) (byte) 10);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone9.getName((long) (short) 1, locale26);
        java.util.TimeZone timeZone28 = dateTimeZone9.toTimeZone();
        boolean boolean29 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str11 = dateTimeZone9.getShortName((long) '4');
        java.lang.String str13 = dateTimeZone9.getName((long) 1);
        boolean boolean15 = dateTimeZone9.isStandardOffset(36000001L);
        boolean boolean16 = dateTimeZone9.isFixed();
        long long20 = dateTimeZone9.convertLocalToUTC(35999945L, false, 3600011L);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone9.isLocalDateTimeGap(localDateTime21);
        int int24 = dateTimeZone9.getStandardOffset((-396059948L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35999945L + "'", long20 == 35999945L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long10 = dateTimeZone6.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean11 = dateTimeZone6.isFixed();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long16 = dateTimeZone12.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean17 = dateTimeZone12.isFixed();
        java.util.TimeZone timeZone18 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone6.getMillisKeepLocal(dateTimeZone19, (long) (byte) 10);
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        long long27 = dateTimeZone23.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean28 = dateTimeZone23.isFixed();
        java.util.TimeZone timeZone29 = dateTimeZone23.toTimeZone();
        int int31 = dateTimeZone23.getOffsetFromLocal((long) ' ');
        long long33 = dateTimeZone6.getMillisKeepLocal(dateTimeZone23, 32L);
        long long36 = dateTimeZone6.convertLocalToUTC((-3599903L), false);
        boolean boolean38 = dateTimeZone6.isStandardOffset(41220020L);
        org.joda.time.ReadableInstant readableInstant39 = null;
        int int40 = dateTimeZone6.getOffset(readableInstant39);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-3599903L) + "'", long36 == (-3599903L));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long3 = dateTimeZone1.previousTransition(10L);
        int int5 = dateTimeZone1.getOffset((long) (short) 0);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName(111600010L, locale8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (short) 0);
        long long5 = dateTimeZone2.convertLocalToUTC((-3599890L), false);
        long long8 = dateTimeZone2.convertLocalToUTC((long) 360000000, true);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-129599890L) + "'", long5 == (-129599890L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 234000000L + "'", long8 == 234000000L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (-1));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName((long) (short) -1, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone0.getName((-1L), locale16);
        java.lang.String str19 = dateTimeZone0.getShortName(100L);
        java.util.TimeZone timeZone20 = dateTimeZone0.toTimeZone();
        java.lang.String str22 = dateTimeZone0.getNameKey((-32459948L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str24 = dateTimeZone0.toString();
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone0.getOffset(readableInstant25);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (-1));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName((long) (short) -1, locale13);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone0.isLocalDateTimeGap(localDateTime15);
        boolean boolean18 = dateTimeZone0.equals((java.lang.Object) 0.0d);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone0.getOffset(readableInstant19);
        int int22 = dateTimeZone0.getOffset((long) (-3600000));
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        long long26 = dateTimeZone0.getMillisKeepLocal(dateTimeZone24, 0L);
        int int28 = dateTimeZone24.getOffset(111600000L);
        int int30 = dateTimeZone24.getOffsetFromLocal(108000010L);
        java.lang.String str32 = dateTimeZone24.getShortName((long) 35);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-187200000L) + "'", long26 == (-187200000L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 187200000 + "'", int28 == 187200000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 187200000 + "'", int30 == 187200000);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+52:00" + "'", str32, "+52:00");
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(2100000);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(32L, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((-302400002L), locale6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:35" + "'", str4, "+00:35");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:35" + "'", str7, "+00:35");
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone0.getShortName((long) (short) -1, locale3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone5.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean10 = dateTimeZone5.isFixed();
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.toString();
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone12, (long) 100);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone0.getOffset(readableInstant16);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str20 = dateTimeZone0.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone21 = dateTimeZone0.toTimeZone();
        java.util.TimeZone timeZone22 = dateTimeZone0.toTimeZone();
        int int24 = dateTimeZone0.getStandardOffset((-39600001L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        boolean boolean8 = dateTimeZone0.isStandardOffset(0L);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        boolean boolean13 = dateTimeZone11.isStandardOffset(36060000L);
        long long17 = dateTimeZone11.convertLocalToUTC((long) '4', false, (-259800000L));
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long22 = dateTimeZone19.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        long long27 = dateTimeZone23.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean28 = dateTimeZone23.isFixed();
        java.util.TimeZone timeZone29 = dateTimeZone23.toTimeZone();
        java.lang.Object obj30 = dateTimeZone23.writeReplace();
        boolean boolean31 = dateTimeZone19.equals((java.lang.Object) dateTimeZone23);
        long long33 = dateTimeZone11.getMillisKeepLocal(dateTimeZone23, (-352800041L));
        java.lang.Object obj34 = null;
        boolean boolean35 = dateTimeZone11.equals(obj34);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3600000L + "'", long22 == 3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-352800041L) + "'", long33 == (-352800041L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long10 = dateTimeZone6.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean11 = dateTimeZone6.isFixed();
        java.util.TimeZone timeZone12 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone13, (long) (byte) 10);
        java.lang.String str16 = dateTimeZone0.getID();
        boolean boolean18 = dateTimeZone0.isStandardOffset((long) (short) 1);
        boolean boolean20 = dateTimeZone0.isStandardOffset((long) 3600000);
        long long22 = dateTimeZone0.previousTransition((long) '4');
        java.lang.String str24 = dateTimeZone0.getName(42L);
        boolean boolean26 = dateTimeZone0.isStandardOffset((long) 36000000);
        java.util.TimeZone timeZone27 = dateTimeZone0.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        long long7 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, 10L);
        long long11 = dateTimeZone0.convertLocalToUTC(0L, true, (long) 100);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName(0L, locale13);
        long long16 = dateTimeZone0.previousTransition((-3599903L));
        java.lang.String str17 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long21 = dateTimeZone0.getMillisKeepLocal(dateTimeZone19, (long) 36600000);
        java.lang.String str22 = dateTimeZone19.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599903L) + "'", long16 == (-3599903L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 36599900L + "'", long21 == 36599900L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone5.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean10 = dateTimeZone5.isFixed();
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        java.lang.Object obj12 = dateTimeZone5.writeReplace();
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        long long17 = dateTimeZone1.convertLocalToUTC(3600010L, true, 3600000L);
        java.lang.String str18 = dateTimeZone1.getID();
        java.lang.String str20 = dateTimeZone1.getShortName((long) (byte) 1);
        int int22 = dateTimeZone1.getStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long26 = dateTimeZone24.previousTransition((long) 100);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        long long31 = dateTimeZone27.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean32 = dateTimeZone27.isFixed();
        java.util.TimeZone timeZone33 = dateTimeZone27.toTimeZone();
        int int35 = dateTimeZone27.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        boolean boolean38 = dateTimeZone27.isStandardOffset((long) (-1));
        long long40 = dateTimeZone27.convertUTCToLocal(100L);
        long long42 = dateTimeZone24.getMillisKeepLocal(dateTimeZone27, 10L);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long47 = dateTimeZone44.convertLocalToUTC(0L, true);
        boolean boolean48 = dateTimeZone44.isFixed();
        long long50 = dateTimeZone27.getMillisKeepLocal(dateTimeZone44, (long) 115200000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone44);
        java.util.Locale locale53 = null;
        java.lang.String str54 = dateTimeZone44.getName(184200001L, locale53);
        java.lang.Object obj55 = dateTimeZone44.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        long long58 = dateTimeZone44.getMillisKeepLocal(dateTimeZone56, (long) 600000);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.UTC;
        long long63 = dateTimeZone59.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean64 = dateTimeZone59.isFixed();
        int int66 = dateTimeZone59.getStandardOffset(0L);
        java.lang.String str68 = dateTimeZone59.getNameKey((long) (byte) 1);
        java.util.Locale locale70 = null;
        java.lang.String str71 = dateTimeZone59.getName((long) '4', locale70);
        long long75 = dateTimeZone59.convertLocalToUTC(360000100L, true, (long) 36060000);
        boolean boolean76 = dateTimeZone44.equals((java.lang.Object) 36060000);
        long long78 = dateTimeZone44.previousTransition((-363599965L));
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.UTC;
        long long81 = dateTimeZone79.nextTransition((long) (byte) -1);
        long long83 = dateTimeZone79.previousTransition((long) ' ');
        java.lang.Object obj84 = dateTimeZone79.writeReplace();
        java.lang.String str86 = dateTimeZone79.getShortName((-259260000L));
        boolean boolean87 = dateTimeZone44.equals((java.lang.Object) str86);
        boolean boolean88 = dateTimeZone1.equals((java.lang.Object) boolean87);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 7200010L + "'", long17 == 7200010L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-01:00" + "'", str18, "-01:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-01:00" + "'", str20, "-01:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-3600000) + "'", int22 == (-3600000));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L + "'", long40 == 100L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 3600010L + "'", long42 == 3600010L);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-3600000L) + "'", long47 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 111600000L + "'", long50 == 111600000L);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+01:00" + "'", str54, "+01:00");
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 600000L + "'", long58 == 600000L);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "UTC" + "'", str68, "UTC");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "+00:00" + "'", str71, "+00:00");
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 360000100L + "'", long75 == 360000100L);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + (-363599965L) + "'", long78 == (-363599965L));
        org.junit.Assert.assertNotNull(dateTimeZone79);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1L) + "'", long81 == (-1L));
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 32L + "'", long83 == 32L);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "+00:00" + "'", str86, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.String str5 = dateTimeZone1.getShortName(97L);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long8 = dateTimeZone1.convertUTCToLocal(7200010L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) -1);
        boolean boolean11 = dateTimeZone1.isFixed();
        long long13 = dateTimeZone1.nextTransition((-216000000L));
        java.lang.String str15 = dateTimeZone1.getShortName((long) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3600000L) + "'", long3 == (-3600000L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600010L + "'", long8 == 3600010L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-216000000L) + "'", long13 == (-216000000L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-01:00" + "'", str15, "-01:00");
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        boolean boolean8 = dateTimeZone1.isStandardOffset((-65L));
        java.lang.String str10 = dateTimeZone1.getNameKey((-125999990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long7 = dateTimeZone1.convertLocalToUTC((long) 100, false, 100L);
        long long9 = dateTimeZone1.previousTransition((-1500000L));
        boolean boolean10 = dateTimeZone1.isFixed();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName(187200097L, locale12);
        long long17 = dateTimeZone1.convertLocalToUTC(148080097L, false, 3600097L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1500000L) + "'", long9 == (-1500000L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 148080097L + "'", long17 == 148080097L);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone0.getShortName((long) (short) -1, locale3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone5.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean10 = dateTimeZone5.isFixed();
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.toString();
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone12, (long) 100);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone0.getOffset(readableInstant16);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int20 = dateTimeZone0.getOffsetFromLocal(36600100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone1.toString();
        java.lang.String str9 = dateTimeZone1.getNameKey(36000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:00" + "'", str7, "+01:00");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (short) 100);
        java.lang.String str8 = dateTimeZone0.toString();
        long long12 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true, (long) (short) 100);
        long long15 = dateTimeZone0.convertLocalToUTC((long) (short) 1, false);
        java.util.TimeZone timeZone16 = dateTimeZone0.toTimeZone();
        long long18 = dateTimeZone0.nextTransition(68400001L);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 0);
        boolean boolean23 = dateTimeZone21.isStandardOffset((-396059948L));
        boolean boolean24 = dateTimeZone0.equals((java.lang.Object) (-396059948L));
        java.lang.String str25 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 68400001L + "'", long18 == 68400001L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long10 = dateTimeZone6.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean11 = dateTimeZone6.isFixed();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long16 = dateTimeZone12.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean17 = dateTimeZone12.isFixed();
        java.util.TimeZone timeZone18 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone6.getMillisKeepLocal(dateTimeZone19, (long) (byte) 10);
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        long long27 = dateTimeZone23.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean28 = dateTimeZone23.isFixed();
        java.util.TimeZone timeZone29 = dateTimeZone23.toTimeZone();
        int int31 = dateTimeZone23.getOffsetFromLocal((long) ' ');
        long long33 = dateTimeZone6.getMillisKeepLocal(dateTimeZone23, 32L);
        java.lang.String str35 = dateTimeZone23.getName((long) (short) 100);
        long long37 = dateTimeZone23.nextTransition((long) 100);
        long long41 = dateTimeZone23.convertLocalToUTC((long) 10, true, (-7200065L));
        java.lang.String str42 = dateTimeZone23.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.lang.String str9 = dateTimeZone0.getName((long) (byte) 10);
        int int11 = dateTimeZone0.getStandardOffset(0L);
        boolean boolean13 = dateTimeZone0.isStandardOffset(37920000L);
        long long15 = dateTimeZone0.previousTransition(154320000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 154320000L + "'", long15 == 154320000L);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) 1);
        java.lang.String str4 = dateTimeZone2.getNameKey((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long7 = dateTimeZone2.nextTransition((long) (short) 0);
        long long9 = dateTimeZone2.nextTransition((-36599999L));
        long long11 = dateTimeZone2.nextTransition(7199935L);
        boolean boolean12 = dateTimeZone2.isFixed();
        java.lang.Class<?> wildcardClass13 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-36599999L) + "'", long9 == (-36599999L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 7199935L + "'", long11 == 7199935L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        int int5 = dateTimeZone2.getOffset(3600035L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone2.isLocalDateTimeGap(localDateTime6);
        java.lang.String str8 = dateTimeZone2.getID();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.Object obj11 = dateTimeZone10.writeReplace();
        java.lang.String str13 = dateTimeZone10.getShortName(237600000L);
        int int15 = dateTimeZone10.getOffset(32L);
        long long17 = dateTimeZone2.getMillisKeepLocal(dateTimeZone10, (-39120000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36600000 + "'", int5 == 36600000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:10" + "'", str8, "+10:10");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-117720000L) + "'", long17 == (-117720000L));
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 100);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-3600000), true, (long) 0);
        java.util.TimeZone timeZone10 = dateTimeZone5.toTimeZone();
        int int12 = dateTimeZone5.getOffsetFromLocal(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        int int16 = dateTimeZone5.getStandardOffset((-223859999L));
        java.lang.String str17 = dateTimeZone5.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3600000L) + "'", long9 == (-3600000L));
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long10 = dateTimeZone6.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean11 = dateTimeZone6.isFixed();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long16 = dateTimeZone12.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean17 = dateTimeZone12.isFixed();
        java.util.TimeZone timeZone18 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone6.getMillisKeepLocal(dateTimeZone19, (long) (byte) 10);
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        long long27 = dateTimeZone23.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean28 = dateTimeZone23.isFixed();
        java.util.TimeZone timeZone29 = dateTimeZone23.toTimeZone();
        int int31 = dateTimeZone23.getOffsetFromLocal((long) ' ');
        long long33 = dateTimeZone6.getMillisKeepLocal(dateTimeZone23, 32L);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone6.getShortName(3600000L, locale35);
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone6.getName((long) (byte) 100, locale38);
        java.lang.String str40 = dateTimeZone6.getID();
        long long42 = dateTimeZone6.nextTransition((-187199999L));
        boolean boolean44 = dateTimeZone6.equals((java.lang.Object) "+00:00:00.100");
        java.lang.String str45 = dateTimeZone6.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00" + "'", str39, "+00:00");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UTC" + "'", str40, "UTC");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-187199999L) + "'", long42 == (-187199999L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UTC" + "'", str45, "UTC");
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone3.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean8 = dateTimeZone3.isFixed();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        int int11 = dateTimeZone3.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean14 = dateTimeZone3.isStandardOffset((long) (-1));
        long long16 = dateTimeZone2.getMillisKeepLocal(dateTimeZone3, (long) ' ');
        boolean boolean17 = dateTimeZone1.equals((java.lang.Object) dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        long long22 = dateTimeZone18.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        boolean boolean25 = dateTimeZone18.isStandardOffset((long) (byte) 1);
        boolean boolean27 = dateTimeZone18.isStandardOffset(7200035L);
        boolean boolean28 = dateTimeZone1.equals((java.lang.Object) 7200035L);
        long long30 = dateTimeZone1.previousTransition((-399659948L));
        long long33 = dateTimeZone1.convertLocalToUTC((-7199965L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-399659948L) + "'", long30 == (-399659948L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-7200000L) + "'", long33 == (-7200000L));
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (-1));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName((long) (short) -1, locale13);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone0.isLocalDateTimeGap(localDateTime15);
        boolean boolean18 = dateTimeZone0.equals((java.lang.Object) 0.0d);
        long long20 = dateTimeZone0.nextTransition((long) (short) 0);
        java.lang.Object obj21 = dateTimeZone0.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        java.lang.String str9 = dateTimeZone0.toString();
        int int11 = dateTimeZone0.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone12 = dateTimeZone0.toTimeZone();
        long long14 = dateTimeZone0.nextTransition((-77580000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-77580000L) + "'", long14 == (-77580000L));
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        java.lang.String str9 = dateTimeZone0.toString();
        int int11 = dateTimeZone0.getStandardOffset((long) (short) -1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName((long) 100, locale13);
        java.util.TimeZone timeZone15 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone17.getOffset(readableInstant19);
        boolean boolean22 = dateTimeZone17.isStandardOffset(360000000L);
        long long25 = dateTimeZone17.convertLocalToUTC(147540097L, false);
        boolean boolean26 = dateTimeZone17.isFixed();
        java.lang.String str28 = dateTimeZone17.getName((-34320000L));
        int int30 = dateTimeZone17.getOffsetFromLocal(39600010L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 147540097L + "'", long25 == 147540097L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 0);
        int int4 = dateTimeZone2.getOffset((long) 3600000);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(32460101L, locale6);
        long long11 = dateTimeZone2.convertLocalToUTC(39119999L, false, (long) 3600000);
        java.lang.String str13 = dateTimeZone2.getShortName((-237599989L));
        long long17 = dateTimeZone2.convertLocalToUTC((-85800000L), true, 42600000L);
        java.lang.String str18 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3600000 + "'", int4 == 3600000);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:00" + "'", str7, "+01:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35519999L + "'", long11 == 35519999L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:00" + "'", str13, "+01:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-89400000L) + "'", long17 == (-89400000L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+01:00" + "'", str18, "+01:00");
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone0.getShortName((long) (short) -1, locale3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone5.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean10 = dateTimeZone5.isFixed();
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.toString();
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone12, (long) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone16.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean21 = dateTimeZone16.isFixed();
        java.util.TimeZone timeZone22 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        int int25 = dateTimeZone23.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone26 = dateTimeZone23.toTimeZone();
        long long28 = dateTimeZone23.convertUTCToLocal((long) ' ');
        long long30 = dateTimeZone12.getMillisKeepLocal(dateTimeZone23, 3599999L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        boolean boolean32 = dateTimeZone23.isFixed();
        int int34 = dateTimeZone23.getOffsetFromLocal(36060100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3599999L + "'", long30 == 3599999L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long3 = dateTimeZone1.previousTransition(10L);
        java.lang.String str4 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) ' ');
        java.lang.String str12 = dateTimeZone10.getName((long) 360000000);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long17 = dateTimeZone13.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean18 = dateTimeZone13.isFixed();
        java.lang.String str20 = dateTimeZone13.getShortName((-1L));
        java.util.TimeZone timeZone21 = dateTimeZone13.toTimeZone();
        long long23 = dateTimeZone13.nextTransition((-3600000L));
        boolean boolean24 = dateTimeZone10.equals((java.lang.Object) dateTimeZone13);
        long long26 = dateTimeZone10.nextTransition((long) '#');
        boolean boolean28 = dateTimeZone10.isStandardOffset(3600097L);
        long long30 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (long) (byte) 0);
        long long33 = dateTimeZone1.convertLocalToUTC((-363599965L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:32" + "'", str12, "+10:32");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-3600000L) + "'", long23 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 35L + "'", long26 == 35L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-37920000L) + "'", long30 == (-37920000L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-363599965L) + "'", long33 == (-363599965L));
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffsetFromLocal((long) (short) 0);
        java.lang.String str11 = dateTimeZone7.getShortName((long) 0);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone7.getShortName(0L, locale13);
        boolean boolean15 = dateTimeZone7.isFixed();
        long long17 = dateTimeZone7.previousTransition((long) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        boolean boolean20 = dateTimeZone7.isStandardOffset((long) 36060000);
        java.util.TimeZone timeZone21 = dateTimeZone7.toTimeZone();
        java.lang.String str23 = dateTimeZone7.getNameKey((long) 0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone7.getOffset(readableInstant24);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.010");
        long long3 = dateTimeZone1.convertUTCToLocal(0L);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1920000, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        long long4 = dateTimeZone1.convertLocalToUTC((long) 100, false);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        long long7 = dateTimeZone1.previousTransition((-187200061L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-187200061L) + "'", long7 == (-187200061L));
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        boolean boolean12 = dateTimeZone0.isStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long17 = dateTimeZone13.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean18 = dateTimeZone13.isFixed();
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        int int22 = dateTimeZone20.getOffsetFromLocal((long) (short) 0);
        java.lang.String str24 = dateTimeZone20.getShortName((long) (byte) 10);
        long long26 = dateTimeZone0.getMillisKeepLocal(dateTimeZone20, 0L);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone20.isLocalDateTimeGap(localDateTime27);
        java.lang.String str29 = dateTimeZone20.getID();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj31 = dateTimeZone30.writeReplace();
        boolean boolean32 = dateTimeZone20.equals((java.lang.Object) dateTimeZone30);
        long long35 = dateTimeZone20.convertLocalToUTC(0L, true);
        long long37 = dateTimeZone20.convertUTCToLocal((-39059965L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-39059965L) + "'", long37 == (-39059965L));
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((long) 100);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getNameKey((long) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) 1);
        java.lang.String str12 = dateTimeZone10.getNameKey((long) (short) 0);
        java.util.TimeZone timeZone13 = dateTimeZone10.toTimeZone();
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (long) '4');
        int int17 = dateTimeZone10.getStandardOffset((-32999999L));
        int int19 = dateTimeZone10.getStandardOffset((long) (-3600000));
        java.lang.String str21 = dateTimeZone10.getNameKey((long) 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:00" + "'", str5, "+01:00");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+10:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-32459948L) + "'", long15 == (-32459948L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36060000 + "'", int17 == 36060000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36060000 + "'", int19 == 36060000);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str10 = dateTimeZone0.toString();
        long long12 = dateTimeZone0.convertUTCToLocal((long) 'a');
        int int14 = dateTimeZone0.getOffset((-7139968L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        boolean boolean4 = dateTimeZone2.isStandardOffset((long) 10);
        long long6 = dateTimeZone2.nextTransition(187200000L);
        java.lang.String str8 = dateTimeZone2.getNameKey(4200000L);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 100, false);
        boolean boolean13 = dateTimeZone2.isStandardOffset(147540097L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 187200000L + "'", long6 == 187200000L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59900L) + "'", long11 == (-59900L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (-1));
        java.lang.String str12 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long17 = dateTimeZone14.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        long long22 = dateTimeZone18.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean23 = dateTimeZone18.isFixed();
        java.util.TimeZone timeZone24 = dateTimeZone18.toTimeZone();
        java.lang.Object obj25 = dateTimeZone18.writeReplace();
        boolean boolean26 = dateTimeZone14.equals((java.lang.Object) dateTimeZone18);
        java.lang.String str27 = dateTimeZone14.toString();
        java.lang.String str28 = dateTimeZone14.toString();
        java.util.TimeZone timeZone29 = dateTimeZone14.toTimeZone();
        boolean boolean30 = dateTimeZone0.equals((java.lang.Object) timeZone29);
        long long32 = dateTimeZone0.previousTransition(36000010L);
        int int34 = dateTimeZone0.getOffsetFromLocal((long) 118320000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3600000L + "'", long17 == 3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-01:00" + "'", str27, "-01:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-01:00" + "'", str28, "-01:00");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 36000010L + "'", long32 == 36000010L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone1.toString();
        long long9 = dateTimeZone1.convertUTCToLocal((-3600001L));
        long long11 = dateTimeZone1.nextTransition(115200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:00" + "'", str7, "+01:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115200000L + "'", long11 == 115200000L);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str10 = dateTimeZone0.toString();
        int int12 = dateTimeZone0.getOffsetFromLocal((long) 'a');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str15 = dateTimeZone0.getNameKey(363600002L);
        int int17 = dateTimeZone0.getOffsetFromLocal((-237599989L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '#');
        boolean boolean4 = dateTimeZone2.isStandardOffset(3600097L);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long10 = dateTimeZone6.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean11 = dateTimeZone6.isFixed();
        java.util.TimeZone timeZone12 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        int int15 = dateTimeZone13.getOffset(1L);
        long long17 = dateTimeZone13.previousTransition((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        long long22 = dateTimeZone18.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        long long24 = dateTimeZone13.getMillisKeepLocal(dateTimeZone18, (-32459948L));
        boolean boolean26 = dateTimeZone18.isStandardOffset(3599935L);
        int int28 = dateTimeZone18.getStandardOffset((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = dateTimeZone18.isLocalDateTimeGap(localDateTime29);
        java.lang.String str32 = dateTimeZone18.getShortName((long) (short) 100);
        boolean boolean33 = dateTimeZone2.equals((java.lang.Object) str32);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT-01:35");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-32459948L) + "'", long24 == (-32459948L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((long) (short) -1, locale7);
        long long11 = dateTimeZone0.convertLocalToUTC((long) (byte) 10, false);
        int int13 = dateTimeZone0.getOffsetFromLocal(3599999L);
        long long15 = dateTimeZone0.nextTransition((long) (byte) -1);
        long long17 = dateTimeZone0.previousTransition(36059999L);
        java.lang.String str19 = dateTimeZone0.getNameKey((-75119965L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 36059999L + "'", long17 == 36059999L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        boolean boolean12 = dateTimeZone0.isStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long17 = dateTimeZone13.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean18 = dateTimeZone13.isFixed();
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        int int22 = dateTimeZone20.getOffsetFromLocal((long) (short) 0);
        java.lang.String str24 = dateTimeZone20.getShortName((long) (byte) 10);
        long long26 = dateTimeZone0.getMillisKeepLocal(dateTimeZone20, 0L);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone20.isLocalDateTimeGap(localDateTime27);
        java.lang.String str29 = dateTimeZone20.getID();
        int int31 = dateTimeZone20.getOffsetFromLocal((long) 0);
        java.lang.String str33 = dateTimeZone20.getName((-118800001L));
        java.lang.String str34 = dateTimeZone20.getID();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long39 = dateTimeZone36.convertLocalToUTC(0L, true);
        boolean boolean40 = dateTimeZone36.isFixed();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        long long45 = dateTimeZone41.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean46 = dateTimeZone41.isFixed();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        long long51 = dateTimeZone47.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean52 = dateTimeZone47.isFixed();
        java.util.TimeZone timeZone53 = dateTimeZone47.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        long long56 = dateTimeZone41.getMillisKeepLocal(dateTimeZone54, (long) (byte) 10);
        boolean boolean57 = dateTimeZone36.equals((java.lang.Object) dateTimeZone41);
        java.util.TimeZone timeZone58 = dateTimeZone36.toTimeZone();
        long long60 = dateTimeZone20.getMillisKeepLocal(dateTimeZone36, 0L);
        int int62 = dateTimeZone36.getStandardOffset((-39000000L));
        java.lang.String str64 = dateTimeZone36.getNameKey(359459999L);
        java.lang.Class<?> wildcardClass65 = dateTimeZone36.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-3600000L) + "'", long39 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 10L + "'", long56 == 10L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(timeZone58);
        org.junit.Assert.assertEquals(timeZone58.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-3600000L) + "'", long60 == (-3600000L));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3600000 + "'", int62 == 3600000);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long13 = dateTimeZone0.convertLocalToUTC((long) 10, false, 10L);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        long long16 = dateTimeZone0.getMillisKeepLocal(dateTimeZone14, (long) '4');
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        long long21 = dateTimeZone17.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean22 = dateTimeZone17.isFixed();
        java.util.TimeZone timeZone23 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        int int26 = dateTimeZone24.getOffsetFromLocal((long) (short) 0);
        int int28 = dateTimeZone24.getOffsetFromLocal((long) (short) 10);
        java.lang.String str29 = dateTimeZone24.toString();
        boolean boolean30 = dateTimeZone24.isFixed();
        long long32 = dateTimeZone0.getMillisKeepLocal(dateTimeZone24, 154320000L);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone24.getShortName(32400001L, locale34);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        long long40 = dateTimeZone36.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean41 = dateTimeZone36.isFixed();
        java.util.TimeZone timeZone42 = dateTimeZone36.toTimeZone();
        int int44 = dateTimeZone36.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone36);
        long long49 = dateTimeZone36.convertLocalToUTC((long) 10, false, 10L);
        long long51 = dateTimeZone36.convertUTCToLocal((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant52 = null;
        int int53 = dateTimeZone36.getOffset(readableInstant52);
        java.util.Locale locale55 = null;
        java.lang.String str56 = dateTimeZone36.getName((-1L), locale55);
        boolean boolean57 = dateTimeZone24.equals((java.lang.Object) dateTimeZone36);
        boolean boolean58 = dateTimeZone24.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 154320000L + "'", long32 == 154320000L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 10L + "'", long49 == 10L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00" + "'", str56, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffsetFromLocal((long) (short) 0);
        java.lang.String str11 = dateTimeZone7.getShortName((long) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long16 = dateTimeZone12.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean17 = dateTimeZone12.isFixed();
        int int19 = dateTimeZone12.getStandardOffset(0L);
        boolean boolean21 = dateTimeZone12.isStandardOffset((long) (short) 100);
        long long23 = dateTimeZone7.getMillisKeepLocal(dateTimeZone12, 32400001L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone12.getOffset(readableInstant24);
        long long28 = dateTimeZone12.convertLocalToUTC((-32999999L), true);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        boolean boolean33 = dateTimeZone12.equals((java.lang.Object) dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32400001L + "'", long23 == 32400001L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-32999999L) + "'", long28 == (-32999999L));
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((-187199968L), locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        long long9 = dateTimeZone1.convertLocalToUTC(79140000L, true, (-36059903L));
        java.lang.String str10 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 43140000L + "'", long9 == 43140000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:00" + "'", str10, "+10:00");
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((long) 100);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getNameKey((long) 10);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:00" + "'", str5, "+01:00");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3600000 + "'", int10 == 3600000);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone10 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long13 = dateTimeZone11.previousTransition((long) (short) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        long long17 = dateTimeZone11.convertLocalToUTC(104940000L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 104940000L + "'", long17 == 104940000L);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone10.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean15 = dateTimeZone10.isFixed();
        java.util.TimeZone timeZone16 = dateTimeZone10.toTimeZone();
        int int18 = dateTimeZone10.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        java.lang.Object obj20 = dateTimeZone10.writeReplace();
        boolean boolean22 = dateTimeZone10.isStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        long long27 = dateTimeZone23.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean28 = dateTimeZone23.isFixed();
        java.util.TimeZone timeZone29 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        int int32 = dateTimeZone30.getOffsetFromLocal((long) (short) 0);
        java.lang.String str34 = dateTimeZone30.getShortName((long) (byte) 10);
        long long36 = dateTimeZone10.getMillisKeepLocal(dateTimeZone30, 0L);
        boolean boolean37 = dateTimeZone0.equals((java.lang.Object) dateTimeZone10);
        boolean boolean39 = dateTimeZone0.equals((java.lang.Object) (-32459948L));
        java.lang.String str41 = dateTimeZone0.getShortName((long) '#');
        int int43 = dateTimeZone0.getOffset((-39660000L));
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone0.getName(154320000L, locale45);
        org.joda.time.LocalDateTime localDateTime47 = null;
        boolean boolean48 = dateTimeZone0.isLocalDateTimeGap(localDateTime47);
        boolean boolean50 = dateTimeZone0.isStandardOffset((-187740001L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, false);
        java.lang.String str6 = dateTimeZone1.getName((-36060000L));
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone0.isLocalDateTimeGap(localDateTime10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forID("+00:00:00.010");
        long long15 = dateTimeZone13.convertUTCToLocal(0L);
        long long17 = dateTimeZone0.getMillisKeepLocal(dateTimeZone13, (-36060000L));
        long long19 = dateTimeZone13.nextTransition((-3000000L));
        boolean boolean20 = dateTimeZone13.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-36060010L) + "'", long17 == (-36060010L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-3000000L) + "'", long19 == (-3000000L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        java.lang.String str11 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long17 = dateTimeZone13.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean18 = dateTimeZone13.isFixed();
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        int int21 = dateTimeZone13.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        boolean boolean24 = dateTimeZone13.isStandardOffset((long) (-1));
        long long26 = dateTimeZone12.getMillisKeepLocal(dateTimeZone13, (long) ' ');
        java.lang.String str28 = dateTimeZone12.getName((long) (byte) 1);
        java.lang.String str30 = dateTimeZone12.getShortName(3600000L);
        boolean boolean31 = dateTimeZone0.equals((java.lang.Object) dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long36 = dateTimeZone32.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean37 = dateTimeZone32.isFixed();
        java.lang.String str39 = dateTimeZone32.getShortName((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        long long43 = dateTimeZone32.convertLocalToUTC(3600010L, false);
        java.lang.String str45 = dateTimeZone32.getNameKey((long) 10);
        int int47 = dateTimeZone32.getOffsetFromLocal(52L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        boolean boolean49 = dateTimeZone0.equals((java.lang.Object) dateTimeZone32);
        boolean boolean51 = dateTimeZone32.isStandardOffset(33000000L);
        long long53 = dateTimeZone32.nextTransition(36060000L);
        org.joda.time.ReadableInstant readableInstant54 = null;
        int int55 = dateTimeZone32.getOffset(readableInstant54);
        long long57 = dateTimeZone32.convertUTCToLocal(42L);
        org.joda.time.ReadableInstant readableInstant58 = null;
        int int59 = dateTimeZone32.getOffset(readableInstant58);
        java.util.TimeZone timeZone60 = dateTimeZone32.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00" + "'", str39, "+00:00");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 3600010L + "'", long43 == 3600010L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UTC" + "'", str45, "UTC");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 36060000L + "'", long53 == 36060000L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 42L + "'", long57 == 42L);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(timeZone60);
        org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }
}

