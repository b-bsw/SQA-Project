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
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) '4');
        java.lang.String str4 = dateTimeZone2.getName((long) '#');
        boolean boolean6 = dateTimeZone2.isStandardOffset((-115799900L));
        long long9 = dateTimeZone2.convertLocalToUTC((-20L), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long13 = dateTimeZone2.convertLocalToUTC((-71999989L), true);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone2.getName(140399948L, locale15);
        int int18 = dateTimeZone2.getOffsetFromLocal((-115799967L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:52" + "'", str4, "+01:52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-6720020L) + "'", long9 == (-6720020L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-78719989L) + "'", long13 == (-78719989L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+01:52" + "'", str16, "+01:52");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6720000 + "'", int18 == 6720000);
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
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone3.getName((long) '#', locale14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 'a');
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone17.getName((long) (short) 1, locale23);
        boolean boolean26 = dateTimeZone17.equals((java.lang.Object) false);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone17.getName((long) 100, locale28);
        long long31 = dateTimeZone17.convertUTCToLocal((-1570084924101L));
        int int33 = dateTimeZone17.getOffsetFromLocal((-1570084924001L));
        int int35 = dateTimeZone17.getOffsetFromLocal(25200001L);
        long long37 = dateTimeZone17.convertUTCToLocal((-1570048924000L));
        long long39 = dateTimeZone3.getMillisKeepLocal(dateTimeZone17, 2L);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forID("+00:00:00.052");
        long long45 = dateTimeZone41.convertLocalToUTC(25200011L, false, (-360600002L));
        long long47 = dateTimeZone17.getMillisKeepLocal(dateTimeZone41, (-1570120924152L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6720000 + "'", int7 == 6720000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:52");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+01:52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:52" + "'", str12, "+01:52");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+01:52" + "'", str15, "+01:52");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+01:52" + "'", str24, "+01:52");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+01:52" + "'", str29, "+01:52");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1570078204101L) + "'", long31 == (-1570078204101L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6720000 + "'", int33 == 6720000);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 6720000 + "'", int35 == 6720000);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1570042204000L) + "'", long37 == (-1570042204000L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 2L + "'", long39 == 2L);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 25199959L + "'", long45 == 25199959L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1570114204204L) + "'", long47 == (-1570114204204L));
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        int int5 = dateTimeZone2.getOffsetFromLocal(0L);
        java.lang.String str6 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115800000 + "'", int5 == 115800000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:10" + "'", str6, "+32:10");
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
        long long22 = dateTimeZone1.previousTransition((-1570200724099L));
        int int24 = dateTimeZone1.getOffsetFromLocal(3600000L);
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone1.isLocalDateTimeGap(localDateTime25);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long31 = dateTimeZone28.convertLocalToUTC((-1570084924001L), false);
        int int33 = dateTimeZone28.getOffsetFromLocal((-1570084924000L));
        java.lang.String str35 = dateTimeZone28.getShortName((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        long long39 = dateTimeZone28.nextTransition((long) (short) -1);
        long long41 = dateTimeZone1.getMillisKeepLocal(dateTimeZone28, 0L);
        java.lang.String str43 = dateTimeZone28.getNameKey((-268L));
        java.lang.String str44 = dateTimeZone28.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:10" + "'", str8, "+32:10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:10" + "'", str10, "+32:10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:10" + "'", str11, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-35999865L) + "'", long17 == (-35999865L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:10" + "'", str20, "+32:10");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1570200724099L) + "'", long22 == (-1570200724099L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 115800000 + "'", int24 == 115800000);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1570084924000L) + "'", long31 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-00:00:00.001" + "'", str35, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 115800001L + "'", long41 == 115800001L);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "-00:00:00.001" + "'", str44, "-00:00:00.001");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        boolean boolean4 = dateTimeZone0.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone0.getShortName((-1570084924200L), locale6);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone0.isLocalDateTimeGap(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset(0L);
        long long7 = dateTimeZone1.adjustOffset((-1570084924100L), false);
        long long11 = dateTimeZone1.convertLocalToUTC(115800000L, false, (-1570084924202L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName(79800000L, locale13);
        java.lang.String str16 = dateTimeZone1.getNameKey(0L);
        long long20 = dateTimeZone1.convertLocalToUTC((-1570120924101L), true, (-1570084924199L));
        int int22 = dateTimeZone1.getStandardOffset((-25200101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570084924100L) + "'", long7 == (-1570084924100L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115799999L + "'", long11 == 115799999L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570120924102L) + "'", long20 == (-1570120924102L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long4 = dateTimeZone1.adjustOffset((long) 100, false);
        java.lang.String str6 = dateTimeZone1.getNameKey((-35999979L));
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        long long9 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, 115200101L);
        int int11 = dateTimeZone1.getStandardOffset((-1570084924301L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 115200101L + "'", long9 == 115200101L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        long long15 = dateTimeZone1.convertUTCToLocal(187200010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 187200009L + "'", long15 == 187200009L);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
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
        int int44 = dateTimeZone1.getOffset(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long47 = dateTimeZone1.nextTransition((-1570194003800L));
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long52 = dateTimeZone49.adjustOffset((long) (short) 1, false);
        java.lang.String str53 = dateTimeZone49.toString();
        boolean boolean54 = dateTimeZone49.isFixed();
        long long56 = dateTimeZone1.getMillisKeepLocal(dateTimeZone49, (-36000045L));
        java.lang.String str57 = dateTimeZone1.getID();
        java.lang.Object obj58 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200001L + "'", long10 == 25200001L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 102L + "'", long12 == 102L);
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
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1570194003800L) + "'", long47 == (-1570194003800L));
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+00:00:00.001" + "'", str53, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-36000045L) + "'", long56 == (-36000045L));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:00:00.001" + "'", str57, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj58);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((-35999979L), locale10);
        int int13 = dateTimeZone1.getOffsetFromLocal((-3599900L));
        long long15 = dateTimeZone1.previousTransition((-1570045324000L));
        java.lang.String str16 = dateTimeZone1.getID();
        boolean boolean17 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25199999L + "'", long8 == 25199999L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570045324000L) + "'", long15 == (-1570045324000L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str5 = dateTimeZone1.getName((-1570084924100L));
        java.lang.String str7 = dateTimeZone1.getShortName((-29400002L));
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((-36600056L), locale9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long5 = dateTimeZone1.convertLocalToUTC(25199999L, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        long long11 = dateTimeZone7.adjustOffset((long) (byte) 1, false);
        java.lang.String str13 = dateTimeZone7.getName(97L);
        java.lang.String str15 = dateTimeZone7.getNameKey(0L);
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-1570084924101L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str20 = dateTimeZone1.getShortName(0L);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        long long26 = dateTimeZone22.getMillisKeepLocal(dateTimeZone24, (long) 'a');
        int int28 = dateTimeZone24.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone29 = dateTimeZone24.toTimeZone();
        java.util.TimeZone timeZone30 = dateTimeZone24.toTimeZone();
        long long32 = dateTimeZone24.convertUTCToLocal(0L);
        java.lang.Object obj33 = dateTimeZone24.writeReplace();
        boolean boolean34 = dateTimeZone1.equals(obj33);
        long long36 = dateTimeZone1.convertUTCToLocal((-100L));
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean40 = dateTimeZone38.isStandardOffset((-35999979L));
        java.util.Locale locale42 = null;
        java.lang.String str43 = dateTimeZone38.getShortName(46L, locale42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        int int45 = dateTimeZone38.getOffset(readableInstant44);
        java.lang.Object obj46 = dateTimeZone38.writeReplace();
        long long48 = dateTimeZone38.convertUTCToLocal(76199986L);
        long long50 = dateTimeZone1.getMillisKeepLocal(dateTimeZone38, (-75600099L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25199999L + "'", long5 == 25199999L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570084924102L) + "'", long17 == (-1570084924102L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-100L) + "'", long36 == (-100L));
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00" + "'", str43, "+00:00");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 76199986L + "'", long48 == 76199986L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-75600099L) + "'", long50 == (-75600099L));
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
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
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long25 = dateTimeZone21.getMillisKeepLocal(dateTimeZone23, (long) 'a');
        int int27 = dateTimeZone23.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone28 = dateTimeZone23.toTimeZone();
        java.util.TimeZone timeZone29 = dateTimeZone23.toTimeZone();
        long long31 = dateTimeZone23.nextTransition((long) 1);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        long long37 = dateTimeZone33.getMillisKeepLocal(dateTimeZone35, (long) 'a');
        boolean boolean38 = dateTimeZone33.isFixed();
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone33.getShortName((long) '4', locale40);
        long long43 = dateTimeZone23.getMillisKeepLocal(dateTimeZone33, 2L);
        boolean boolean44 = dateTimeZone14.equals((java.lang.Object) long43);
        long long47 = dateTimeZone14.convertLocalToUTC((-118800057L), false);
        java.util.Locale locale49 = null;
        java.lang.String str50 = dateTimeZone14.getShortName((-73080200L), locale49);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200000L + "'", long10 == 25200000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 101L + "'", long12 == 101L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599902L) + "'", long16 == (-3599902L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 21600001L + "'", long19 == 21600001L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 97L + "'", long37 == 97L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 2L + "'", long43 == 2L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-122400057L) + "'", long47 == (-122400057L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+01:00" + "'", str50, "+01:00");
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
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
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        long long28 = dateTimeZone1.getMillisKeepLocal(dateTimeZone26, (long) (short) -1);
        long long30 = dateTimeZone1.previousTransition(71999833L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25199999L + "'", long20 == 25199999L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-25200002L) + "'", long24 == (-25200002L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 99L + "'", long28 == 99L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 71999833L + "'", long30 == 71999833L);
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
        java.lang.String str13 = dateTimeZone1.getNameKey((long) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        long long19 = dateTimeZone15.convertLocalToUTC((long) 3600000, false, (-25200001L));
        long long21 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, (-1570084924101L));
        long long23 = dateTimeZone15.nextTransition((-35999689L));
        java.lang.Object obj24 = dateTimeZone15.writeReplace();
        int int26 = dateTimeZone15.getOffsetFromLocal((-338999899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3600000L + "'", long19 == 3600000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1570084924101L) + "'", long21 == (-1570084924101L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-35999689L) + "'", long23 == (-35999689L));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
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
        java.lang.String str20 = dateTimeZone1.getID();
        long long23 = dateTimeZone1.convertLocalToUTC((-1570048923900L), true);
        java.lang.Object obj24 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115800000L + "'", long8 == 115800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1570048924000L) + "'", long23 == (-1570048924000L));
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getOffsetFromLocal(99L);
        long long7 = dateTimeZone1.adjustOffset((-1570048923998L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570048923998L) + "'", long7 == (-1570048923998L));
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
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
        java.lang.String str24 = dateTimeZone1.getName((-35999990L), locale23);
        long long28 = dateTimeZone1.convertLocalToUTC(360600136L, true, 403800002L);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 360600036L + "'", long28 == 360600036L);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int3 = dateTimeZone1.getOffset(36060000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 360600000 + "'", int4 == 360600000);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        long long7 = dateTimeZone1.previousTransition((long) (short) 10);
        long long10 = dateTimeZone1.convertLocalToUTC((-1570084924099L), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int13 = dateTimeZone1.getOffsetFromLocal(25200012L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924199L) + "'", long10 == (-1570084924199L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
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
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-1570084924202L), locale12);
        int int15 = dateTimeZone1.getStandardOffset(35L);
        java.lang.String str17 = dateTimeZone1.getName((-99L));
        long long20 = dateTimeZone1.adjustOffset((-1570200723999L), false);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean23 = dateTimeZone1.equals((java.lang.Object) dateTimeZone22);
        java.lang.String str24 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570200723999L) + "'", long20 == (-1570200723999L));
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str10 = dateTimeZone1.toString();
        boolean boolean12 = dateTimeZone1.isStandardOffset(0L);
        long long16 = dateTimeZone1.convertLocalToUTC((-7199802L), false, 76200086L);
        long long19 = dateTimeZone1.adjustOffset(0L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-7199902L) + "'", long16 == (-7199902L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str10 = dateTimeZone1.toString();
        boolean boolean12 = dateTimeZone1.isStandardOffset(0L);
        boolean boolean14 = dateTimeZone1.isStandardOffset((-115799942L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str5 = dateTimeZone1.toString();
        int int7 = dateTimeZone1.getOffsetFromLocal(71999900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
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
        long long23 = dateTimeZone11.convertLocalToUTC(134L, true);
        long long26 = dateTimeZone11.convertLocalToUTC((-360000068L), false);
        int int28 = dateTimeZone11.getOffsetFromLocal((-140400001L));
        boolean boolean30 = dateTimeZone11.isStandardOffset((-10800196L));
        java.lang.String str32 = dateTimeZone11.getNameKey(101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 102L + "'", long16 == 102L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25199948L + "'", long18 == 25199948L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 135L + "'", long23 == 135L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-360000067L) + "'", long26 == (-360000067L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str32);
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
        java.lang.Object obj34 = dateTimeZone1.writeReplace();
        int int36 = dateTimeZone1.getOffset(3599849L);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-3599802L) + "'", long32 == (-3599802L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-00:00:00.001" + "'", str33, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        long long7 = dateTimeZone1.previousTransition((long) (short) 10);
        long long10 = dateTimeZone1.convertLocalToUTC((-1570084924099L), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int13 = dateTimeZone1.getOffsetFromLocal(21600001L);
        boolean boolean15 = dateTimeZone1.isStandardOffset((-115799902L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924098L) + "'", long10 == (-1570084924098L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
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
        int int26 = dateTimeZone1.getStandardOffset((-115799900L));
        boolean boolean28 = dateTimeZone1.isStandardOffset((long) 'a');
        long long31 = dateTimeZone1.convertLocalToUTC((-115199945L), true);
        java.lang.String str32 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone34);
        long long37 = dateTimeZone1.getMillisKeepLocal(dateTimeZone34, (-39599799L));
        long long40 = dateTimeZone34.convertLocalToUTC(0L, false);
        int int42 = dateTimeZone34.getStandardOffset(25199949L);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-115200045L) + "'", long31 == (-115200045L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.100" + "'", str32, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-75599699L) + "'", long37 == (-75599699L));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-36000000L) + "'", long40 == (-36000000L));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 36000000 + "'", int42 == 36000000);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        int int8 = dateTimeZone1.getOffset(100L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((-199L), locale10);
        int int13 = dateTimeZone1.getStandardOffset((-1570272183900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36000000 + "'", int8 == 36000000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36000000 + "'", int13 == 36000000);
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
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forID("+10:01");
        long long32 = dateTimeZone1.getMillisKeepLocal(dateTimeZone30, (-35999897L));
        long long34 = dateTimeZone30.previousTransition((-39599902L));
        org.joda.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = dateTimeZone30.isLocalDateTimeGap(localDateTime35);
        boolean boolean38 = dateTimeZone30.isStandardOffset((-1570088524199L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36000000 + "'", int14 == 36000000);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36000000 + "'", int17 == 36000000);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 79800000L + "'", long21 == 79800000L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-3599902L) + "'", long28 == (-3599902L));
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-36059897L) + "'", long32 == (-36059897L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-39599902L) + "'", long34 == (-39599902L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        long long11 = dateTimeZone1.convertUTCToLocal((long) 0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName(36599901L, locale15);
        int int18 = dateTimeZone1.getOffset((-10799900L));
        int int20 = dateTimeZone1.getOffsetFromLocal((-1569969724103L));
        int int22 = dateTimeZone1.getOffsetFromLocal((-42719999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 36000000L + "'", long11 == 36000000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36000000 + "'", int13 == 36000000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36000000 + "'", int18 == 36000000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 36000000 + "'", int20 == 36000000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36000000 + "'", int22 == 36000000);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        long long8 = dateTimeZone2.convertLocalToUTC(115800000L, true, 99L);
        java.lang.String str10 = dateTimeZone2.getName(102L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getShortName((-25200001L), locale12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone15.getShortName((long) 0, locale17);
        boolean boolean19 = dateTimeZone15.isFixed();
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone15.getOffset(readableInstant20);
        java.lang.String str22 = dateTimeZone15.getID();
        long long24 = dateTimeZone2.getMillisKeepLocal(dateTimeZone15, (-35999897L));
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone15.getName((-35999890L), locale26);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:10" + "'", str10, "+32:10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:10" + "'", str13, "+32:10");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 79800104L + "'", long24 == 79800104L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal(25199999L);
        long long5 = dateTimeZone1.nextTransition(9L);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36000000 + "'", int3 == 36000000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9L + "'", long5 == 9L);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal(25199999L);
        int int5 = dateTimeZone1.getOffsetFromLocal((long) '4');
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getStandardOffset((-25200001L));
        long long11 = dateTimeZone1.adjustOffset(2L, true);
        long long15 = dateTimeZone1.convertLocalToUTC((long) 36000000, false, (-90L));
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone1.getOffset(readableInstant16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str21 = dateTimeZone19.getNameKey(79800100L);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone19.isLocalDateTimeGap(localDateTime22);
        boolean boolean24 = dateTimeZone19.isFixed();
        boolean boolean25 = dateTimeZone1.equals((java.lang.Object) boolean24);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36000000 + "'", int3 == 36000000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36000000 + "'", int8 == 36000000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36000000 + "'", int17 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
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
        boolean boolean15 = dateTimeZone1.isStandardOffset(0L);
        java.lang.String str17 = dateTimeZone1.getNameKey((-36000091L));
        java.util.TimeZone timeZone18 = dateTimeZone1.toTimeZone();
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone1.getName(79799900L, locale20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36000000 + "'", int9 == 36000000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+10:00" + "'", str21, "+10:00");
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
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
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone5.getName(32L, locale24);
        boolean boolean27 = dateTimeZone5.isStandardOffset((-10799900L));
        java.lang.String str28 = dateTimeZone5.getID();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int3 = dateTimeZone1.getOffset(111L);
        int int5 = dateTimeZone1.getOffset((long) (short) 0);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        long long9 = dateTimeZone1.nextTransition(25200010L);
        java.lang.String str11 = dateTimeZone1.getName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 25200010L + "'", long9 == 25200010L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
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
        java.lang.String str16 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        long long8 = dateTimeZone2.convertLocalToUTC(115800000L, true, 99L);
        java.lang.String str10 = dateTimeZone2.getName(102L);
        long long13 = dateTimeZone2.adjustOffset((-1570048324200L), true);
        long long16 = dateTimeZone2.convertLocalToUTC(58L, false);
        java.lang.Object obj17 = dateTimeZone2.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:10" + "'", str10, "+32:10");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570048324200L) + "'", long13 == (-1570048324200L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115799942L) + "'", long16 == (-115799942L));
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.lang.String str4 = dateTimeZone1.getID();
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        int int12 = dateTimeZone8.getStandardOffset((long) (short) 100);
        boolean boolean14 = dateTimeZone8.equals((java.lang.Object) (byte) 0);
        long long18 = dateTimeZone8.convertLocalToUTC((long) (byte) 1, false, 25200000L);
        java.lang.String str19 = dateTimeZone8.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone8.getShortName((-53L), locale22);
        long long25 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, (-134L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35999867L + "'", long25 == 35999867L);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        long long11 = dateTimeZone1.convertUTCToLocal((long) 0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName(36599901L, locale15);
        long long18 = dateTimeZone1.previousTransition(317279967L);
        java.lang.String str20 = dateTimeZone1.getNameKey(6720096L);
        int int22 = dateTimeZone1.getOffsetFromLocal((-35999757L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 317279967L + "'", long18 == 317279967L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
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
        boolean boolean15 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
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
        long long20 = dateTimeZone1.convertLocalToUTC(10L, false, (-1570120924101L));
        java.lang.String str21 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 211L + "'", long16 == 211L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-90L) + "'", long20 == (-90L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        java.lang.String str5 = dateTimeZone1.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-3600011L), locale9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        java.lang.String str3 = dateTimeZone1.getShortName((-201L));
        int int5 = dateTimeZone1.getOffsetFromLocal((-46800098L));
        long long8 = dateTimeZone1.convertLocalToUTC((-396600001L), true);
        int int10 = dateTimeZone1.getStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-396600000L) + "'", long8 == (-396600000L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
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
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone1.getName((-151799865L), locale25);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.001" + "'", str26, "+00:00:00.001");
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 52);
        long long4 = dateTimeZone2.convertUTCToLocal((-36599899L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 326520101L + "'", long4 == 326520101L);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str3 = dateTimeZone1.getNameKey(79800100L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
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
        long long19 = dateTimeZone6.adjustOffset(18480001L, true);
        long long21 = dateTimeZone6.nextTransition(136739903L);
        boolean boolean23 = dateTimeZone6.equals((java.lang.Object) (-32399998L));
        long long25 = dateTimeZone6.nextTransition((-268L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 211L + "'", long16 == 211L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 18480001L + "'", long19 == 18480001L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 136739903L + "'", long21 == 136739903L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-268L) + "'", long25 == (-268L));
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        long long12 = dateTimeZone1.previousTransition((long) (short) 100);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        java.lang.String str15 = dateTimeZone1.getShortName((-35999999L));
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone1.isLocalDateTimeGap(localDateTime16);
        int int19 = dateTimeZone1.getOffset((-1569648723948L));
        int int21 = dateTimeZone1.getOffset(3599917L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
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
        java.lang.String str18 = dateTimeZone3.getID();
        java.lang.String str19 = dateTimeZone3.getID();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        java.lang.String str14 = dateTimeZone1.getName((-1570084924100L));
        int int16 = dateTimeZone1.getOffsetFromLocal(115799901L);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        long long22 = dateTimeZone18.getMillisKeepLocal(dateTimeZone20, (long) 'a');
        int int24 = dateTimeZone20.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone25 = dateTimeZone20.toTimeZone();
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone20.getShortName((long) (byte) 100, locale27);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone20.getShortName((long) (short) 0, locale30);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        long long35 = dateTimeZone20.adjustOffset(25199900L, false);
        java.lang.String str36 = dateTimeZone20.getID();
        org.joda.time.ReadableInstant readableInstant37 = null;
        int int38 = dateTimeZone20.getOffset(readableInstant37);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone20.getShortName((long) 100, locale40);
        long long43 = dateTimeZone20.convertUTCToLocal((-103L));
        long long46 = dateTimeZone20.convertLocalToUTC((-43200100L), true);
        int int48 = dateTimeZone20.getOffset(7199900L);
        boolean boolean49 = dateTimeZone1.equals((java.lang.Object) dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200001L + "'", long10 == 25200001L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 102L + "'", long12 == 102L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-00:00:00.001" + "'", str31, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 25199900L + "'", long35 == 25199900L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-00:00:00.001" + "'", str36, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-00:00:00.001" + "'", str41, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-104L) + "'", long43 == (-104L));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-43200099L) + "'", long46 == (-43200099L));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        boolean boolean11 = dateTimeZone1.isStandardOffset(25199900L);
        long long14 = dateTimeZone1.adjustOffset(356399833L, false);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 356399833L + "'", long14 == 356399833L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((-115800101L), locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean11 = dateTimeZone1.isStandardOffset((-1570084923899L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((-7199802L), locale13);
        java.lang.String str15 = dateTimeZone1.toString();
        java.lang.String str17 = dateTimeZone1.getName(190799901L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
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
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long10 = dateTimeZone7.convertLocalToUTC((-1570084924001L), false);
        int int12 = dateTimeZone7.getOffsetFromLocal((-1570084924000L));
        int int14 = dateTimeZone7.getOffset(97L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone7.getName((long) (-1), locale16);
        java.lang.String str18 = dateTimeZone7.toString();
        java.util.TimeZone timeZone19 = dateTimeZone7.toTimeZone();
        long long21 = dateTimeZone3.getMillisKeepLocal(dateTimeZone7, 187199899L);
        long long25 = dateTimeZone7.convertLocalToUTC((-1570444924101L), true, (-6720051L));
        long long28 = dateTimeZone7.adjustOffset((-1570084324198L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924000L) + "'", long10 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 187199899L + "'", long21 == 187199899L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1570444924100L) + "'", long25 == (-1570444924100L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1570084324198L) + "'", long28 == (-1570084324198L));
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str6 = dateTimeZone1.getShortName((-25200001L));
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone8.isLocalDateTimeGap(localDateTime10);
        java.lang.String str13 = dateTimeZone8.getNameKey((-71460204L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
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
        int int30 = dateTimeZone1.getStandardOffset((-1570200724064L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(187200000);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getName((-1570200123900L), locale5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        long long9 = dateTimeZone3.convertUTCToLocal(6720096L);
        long long11 = dateTimeZone3.convertUTCToLocal(403800002L);
        int int13 = dateTimeZone3.getOffset(360060000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 6720096L + "'", long9 == 6720096L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 403800002L + "'", long11 == 403800002L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        int int14 = dateTimeZone3.getOffsetFromLocal((long) (byte) 1);
        long long16 = dateTimeZone3.convertUTCToLocal((-99L));
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str20 = dateTimeZone18.getNameKey((long) 115800000);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone18.getShortName((-1570084924001L), locale22);
        long long25 = dateTimeZone18.nextTransition(98L);
        int int27 = dateTimeZone18.getStandardOffset((long) 0);
        long long29 = dateTimeZone3.getMillisKeepLocal(dateTimeZone18, 0L);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone3.isLocalDateTimeGap(localDateTime30);
        java.lang.String str33 = dateTimeZone3.getShortName((-36060001L));
        boolean boolean34 = dateTimeZone3.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-99L) + "'", long16 == (-99L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 98L + "'", long25 == 98L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        long long5 = dateTimeZone1.convertLocalToUTC((-99L), true, 187199801L);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int11 = dateTimeZone9.getStandardOffset((long) 10);
        java.lang.String str12 = dateTimeZone9.getID();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone9.getShortName((-91L), locale14);
        long long18 = dateTimeZone9.convertLocalToUTC(35999900L, false);
        long long21 = dateTimeZone9.adjustOffset(324000002L, false);
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-36000099L) + "'", long5 == (-36000099L));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115800000 + "'", int11 == 115800000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:10" + "'", str12, "+32:10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:10" + "'", str15, "+32:10");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-79800100L) + "'", long18 == (-79800100L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 324000002L + "'", long21 == 324000002L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
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
        long long50 = dateTimeZone1.convertLocalToUTC(0L, false);
        int int52 = dateTimeZone1.getOffsetFromLocal((-1570048923948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200000L + "'", long10 == 25200000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 101L + "'", long12 == 101L);
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
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(97L);
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        long long11 = dateTimeZone1.nextTransition(32L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str14 = dateTimeZone1.getShortName((-1570200724011L));
        java.lang.String str16 = dateTimeZone1.getName(209L);
        java.lang.String str18 = dateTimeZone1.getShortName(317280099L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
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
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset(52L);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false);
        long long15 = dateTimeZone1.previousTransition((long) (byte) 0);
        java.lang.String str16 = dateTimeZone1.toString();
        java.lang.String str18 = dateTimeZone1.getShortName((-1570048324298L));
        long long21 = dateTimeZone1.adjustOffset((-1570005183901L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1570005183901L) + "'", long21 == (-1570005183901L));
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
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
        int int33 = dateTimeZone20.getStandardOffset(0L);
        java.lang.String str35 = dateTimeZone20.getNameKey((-302399999L));
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone20.getShortName((-190859804L), locale37);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-00:00:00.001" + "'", str38, "-00:00:00.001");
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.lang.String str5 = dateTimeZone1.getShortName(187199901L);
        int int7 = dateTimeZone1.getOffsetFromLocal((-244200000L));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        long long12 = dateTimeZone1.adjustOffset(182579950L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 182579950L + "'", long12 == 182579950L);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone5.nextTransition((long) (short) 100);
        int int9 = dateTimeZone5.getOffsetFromLocal(100L);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (long) 115800000);
        java.lang.String str13 = dateTimeZone1.getName(9L);
        long long17 = dateTimeZone1.convertLocalToUTC((-1570084923900L), false, (long) (short) -1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str20 = dateTimeZone1.getNameKey((-199L));
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        long long39 = dateTimeZone24.adjustOffset(25199900L, false);
        long long42 = dateTimeZone24.adjustOffset(2L, false);
        java.lang.Object obj43 = dateTimeZone24.writeReplace();
        boolean boolean44 = dateTimeZone1.equals((java.lang.Object) dateTimeZone24);
        long long46 = dateTimeZone24.convertUTCToLocal((-1570408924001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570084923899L) + "'", long17 == (-1570084923899L));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-00:00:00.001" + "'", str35, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 25199900L + "'", long39 == 25199900L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 2L + "'", long42 == 2L);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1570408924002L) + "'", long46 == (-1570408924002L));
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.lang.String str3 = dateTimeZone1.getNameKey(359999983L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(187200000);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 126000000, true, (-90L));
        int int8 = dateTimeZone1.getStandardOffset((-360000100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-61200000L) + "'", long6 == (-61200000L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long3 = dateTimeZone1.nextTransition((long) 36000000);
        java.lang.Object obj4 = dateTimeZone1.writeReplace();
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getStandardOffset((-1569724924101L));
        boolean boolean9 = dateTimeZone1.isStandardOffset(25199990L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str14 = dateTimeZone13.getID();
        long long16 = dateTimeZone13.previousTransition((-1L));
        long long20 = dateTimeZone13.convertLocalToUTC(25200000L, true, 100L);
        long long22 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, 100L);
        java.lang.String str24 = dateTimeZone11.getName((-1570084924100L));
        long long27 = dateTimeZone11.convertLocalToUTC((-35999900L), false);
        java.lang.String str29 = dateTimeZone11.getShortName((-35999900L));
        java.lang.String str30 = dateTimeZone11.getID();
        long long32 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (-36000099L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 36000000L + "'", long3 == 36000000L);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25199999L + "'", long20 == 25199999L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-35999901L) + "'", long27 == (-35999901L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.001" + "'", str29, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.001" + "'", str30, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-36000065L) + "'", long32 == (-36000065L));
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset(52L);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long18 = dateTimeZone15.convertLocalToUTC(0L, true);
        int int20 = dateTimeZone15.getOffset((-201L));
        long long22 = dateTimeZone15.nextTransition(98L);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, (long) 'a');
        long long27 = dateTimeZone15.adjustOffset(34L, false);
        java.lang.String str28 = dateTimeZone15.toString();
        java.util.TimeZone timeZone29 = dateTimeZone15.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 98L + "'", long22 == 98L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 34L + "'", long27 == 34L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.001" + "'", str28, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (short) 10);
        java.lang.Object obj3 = dateTimeZone2.writeReplace();
        int int5 = dateTimeZone2.getOffset((-90L));
        java.lang.String str6 = dateTimeZone2.toString();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone2.getShortName(36000010L, locale8);
        long long11 = dateTimeZone2.convertUTCToLocal((-1570005184001L));
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        java.lang.String str15 = dateTimeZone13.getID();
        long long19 = dateTimeZone13.convertLocalToUTC(135L, true, (-36000000L));
        java.lang.String str20 = dateTimeZone13.getID();
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
        java.lang.String str36 = dateTimeZone24.getID();
        boolean boolean38 = dateTimeZone24.isStandardOffset((long) (short) -1);
        int int40 = dateTimeZone24.getStandardOffset((long) 100);
        long long43 = dateTimeZone24.convertLocalToUTC((-36000199L), true);
        boolean boolean44 = dateTimeZone13.equals((java.lang.Object) dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(115800000);
        boolean boolean48 = dateTimeZone46.isStandardOffset((-200L));
        long long50 = dateTimeZone46.nextTransition(187199801L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone46);
        long long53 = dateTimeZone13.getMillisKeepLocal(dateTimeZone46, (-1570160524000L));
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone56 = dateTimeZone55.toTimeZone();
        long long59 = dateTimeZone55.adjustOffset((long) (byte) 1, false);
        java.lang.String str61 = dateTimeZone55.getName(97L);
        int int63 = dateTimeZone55.getOffsetFromLocal((long) 1);
        org.joda.time.LocalDateTime localDateTime64 = null;
        boolean boolean65 = dateTimeZone55.isLocalDateTimeGap(localDateTime64);
        int int67 = dateTimeZone55.getOffsetFromLocal((-1570120924101L));
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long72 = dateTimeZone69.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str73 = dateTimeZone69.toString();
        org.joda.time.ReadableInstant readableInstant74 = null;
        int int75 = dateTimeZone69.getOffset(readableInstant74);
        java.util.TimeZone timeZone76 = dateTimeZone69.toTimeZone();
        java.lang.Object obj77 = dateTimeZone69.writeReplace();
        long long79 = dateTimeZone55.getMillisKeepLocal(dateTimeZone69, (-46800100L));
        long long81 = dateTimeZone46.getMillisKeepLocal(dateTimeZone55, 288000003L);
        long long83 = dateTimeZone2.getMillisKeepLocal(dateTimeZone55, (-324600001L));
        int int85 = dateTimeZone55.getOffsetFromLocal(25199910L);
        int int87 = dateTimeZone55.getOffset(115799948L);
        java.util.Locale locale89 = null;
        java.lang.String str90 = dateTimeZone55.getName((-115800164L), locale89);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36600000 + "'", int5 == 36600000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:10" + "'", str6, "+10:10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:10" + "'", str9, "+10:10");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1569968584001L) + "'", long11 == (-1569968584001L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+10:00" + "'", str15, "+10:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-35999865L) + "'", long19 == (-35999865L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+10:00" + "'", str20, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 36000000 + "'", int28 == 36000000);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+10:00" + "'", str32, "+10:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+10:00" + "'", str35, "+10:00");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+10:00" + "'", str36, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 36000000 + "'", int40 == 36000000);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-72000199L) + "'", long43 == (-72000199L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 187199801L + "'", long50 == 187199801L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1570240324000L) + "'", long53 == (-1570240324000L));
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(timeZone56);
        org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "+00:00:00.001" + "'", str61, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1570084924000L) + "'", long72 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "-00:00:00.001" + "'", str73, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(timeZone76);
        org.junit.Assert.assertEquals(timeZone76.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-46800098L) + "'", long79 == (-46800098L));
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 403800002L + "'", long81 == 403800002L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + (-288000002L) + "'", long83 == (-288000002L));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "+00:00:00.001" + "'", str90, "+00:00:00.001");
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
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
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long34 = dateTimeZone30.convertLocalToUTC(25199999L, false, 0L);
        long long36 = dateTimeZone30.convertUTCToLocal(25199999L);
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone30.getName(210L, locale38);
        long long42 = dateTimeZone30.convertLocalToUTC((long) 100, false);
        boolean boolean43 = dateTimeZone1.equals((java.lang.Object) long42);
        java.util.TimeZone timeZone44 = dateTimeZone1.toTimeZone();
        long long46 = dateTimeZone1.convertUTCToLocal((-39600002L));
        long long49 = dateTimeZone1.convertLocalToUTC((-1570131844001L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:10" + "'", str8, "+32:10");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115800000 + "'", int17 == 115800000);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 115800000L + "'", long21 == 115800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1569969124000L) + "'", long25 == (-1569969124000L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:10" + "'", str28, "+32:10");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 25199999L + "'", long34 == 25199999L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 25199999L + "'", long36 == 25199999L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00" + "'", str39, "+00:00");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 76199998L + "'", long46 == 76199998L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1570247644001L) + "'", long49 == (-1570247644001L));
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:10" + "'", str2, "+32:10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:10" + "'", str4, "+32:10");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-1570084924202L), locale12);
        long long15 = dateTimeZone1.convertUTCToLocal((-1570084924201L));
        java.lang.String str17 = dateTimeZone1.getNameKey((-25200000L));
        java.util.TimeZone timeZone18 = dateTimeZone1.toTimeZone();
        long long20 = dateTimeZone1.previousTransition((-36000299L));
        long long23 = dateTimeZone1.adjustOffset((-25200102L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115800000 + "'", int8 == 115800000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115800000 + "'", int10 == 115800000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:10" + "'", str13, "+32:10");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1569969124201L) + "'", long15 == (-1569969124201L));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-36000299L) + "'", long20 == (-36000299L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-25200102L) + "'", long23 == (-25200102L));
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
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
        boolean boolean21 = dateTimeZone3.isFixed();
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone3.getOffset(readableInstant22);
        long long25 = dateTimeZone3.nextTransition(79800104L);
        java.lang.String str27 = dateTimeZone3.getName((-39599836L));
        int int29 = dateTimeZone3.getOffsetFromLocal((-71999989L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115800000 + "'", int7 == 115800000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:10" + "'", str11, "+32:10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:10" + "'", str14, "+32:10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:10" + "'", str15, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:10" + "'", str20, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115800000 + "'", int23 == 115800000);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 79800104L + "'", long25 == 79800104L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:10" + "'", str27, "+32:10");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 115800000 + "'", int29 == 115800000);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
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
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long25 = dateTimeZone21.getMillisKeepLocal(dateTimeZone23, (long) 'a');
        int int27 = dateTimeZone23.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone28 = dateTimeZone23.toTimeZone();
        java.util.TimeZone timeZone29 = dateTimeZone23.toTimeZone();
        long long31 = dateTimeZone23.nextTransition((long) 1);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        long long37 = dateTimeZone33.getMillisKeepLocal(dateTimeZone35, (long) 'a');
        boolean boolean38 = dateTimeZone33.isFixed();
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone33.getShortName((long) '4', locale40);
        long long43 = dateTimeZone23.getMillisKeepLocal(dateTimeZone33, 2L);
        boolean boolean44 = dateTimeZone14.equals((java.lang.Object) long43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        int int46 = dateTimeZone14.getOffset(readableInstant45);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone49 = dateTimeZone48.toTimeZone();
        long long52 = dateTimeZone48.adjustOffset((long) (byte) 1, false);
        java.lang.String str54 = dateTimeZone48.getName(97L);
        int int56 = dateTimeZone48.getOffsetFromLocal((long) 1);
        org.joda.time.LocalDateTime localDateTime57 = null;
        boolean boolean58 = dateTimeZone48.isLocalDateTimeGap(localDateTime57);
        int int60 = dateTimeZone48.getStandardOffset(115199900L);
        long long62 = dateTimeZone14.getMillisKeepLocal(dateTimeZone48, 151199901L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:10" + "'", str4, "+32:10");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-90600000L) + "'", long10 == (-90600000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-115799899L) + "'", long12 == (-115799899L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599902L) + "'", long16 == (-3599902L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 21600001L + "'", long19 == 21600001L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 115800000 + "'", int27 == 115800000);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 97L + "'", long37 == 97L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+32:10" + "'", str41, "+32:10");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 2L + "'", long43 == 2L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3600000 + "'", int46 == 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00:00.001" + "'", str54, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 154799900L + "'", long62 == 154799900L);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
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
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 'a');
        int int23 = dateTimeZone19.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone24 = dateTimeZone19.toTimeZone();
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        long long28 = dateTimeZone26.nextTransition((long) (short) 100);
        int int30 = dateTimeZone26.getOffsetFromLocal(100L);
        long long32 = dateTimeZone26.previousTransition(10L);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone35 = dateTimeZone34.toTimeZone();
        long long38 = dateTimeZone34.adjustOffset((long) (byte) 1, false);
        java.lang.String str40 = dateTimeZone34.getName(97L);
        int int42 = dateTimeZone34.getOffsetFromLocal((long) 1);
        org.joda.time.LocalDateTime localDateTime43 = null;
        boolean boolean44 = dateTimeZone34.isLocalDateTimeGap(localDateTime43);
        int int46 = dateTimeZone34.getOffsetFromLocal((-1570120924101L));
        long long48 = dateTimeZone26.getMillisKeepLocal(dateTimeZone34, (-115799999L));
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj51 = dateTimeZone50.writeReplace();
        java.lang.Object obj52 = dateTimeZone50.writeReplace();
        long long54 = dateTimeZone26.getMillisKeepLocal(dateTimeZone50, 115799800L);
        long long58 = dateTimeZone26.convertLocalToUTC((-360600001L), true, (long) 3600000);
        java.lang.String str60 = dateTimeZone26.getShortName((-1570084924102L));
        boolean boolean61 = dateTimeZone19.equals((java.lang.Object) (-1570084924102L));
        boolean boolean62 = dateTimeZone1.equals((java.lang.Object) dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "1) test5083(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "1) test5083(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky "1) test5083(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky "1) test5083(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
// flaky "1) test5083(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(timeZone24);
// flaky "1) test5083(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
// flaky "1) test5083(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.001" + "'", str40, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
// flaky "1) test5083(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-115800001L) + "'", long48 == (-115800001L));
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
// flaky "1) test5083(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + long54 + "' != '" + 115799798L + "'", long54 == 115799798L);
// flaky "1) test5083(org.joda.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-360600000L) + "'", long58 == (-360600000L));
// flaky "1) test5083(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "-00:00:00.001" + "'", str60, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset(0L);
        long long7 = dateTimeZone1.adjustOffset((-1570084924100L), false);
        java.lang.String str9 = dateTimeZone1.getShortName(79800000L);
        long long12 = dateTimeZone1.adjustOffset((-1570444924154L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570084924100L) + "'", long7 == (-1570084924100L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570444924154L) + "'", long12 == (-1570444924154L));
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) false);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "2) test5085(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky "2) test5085(org.joda.time.RegressionTest10)":         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
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
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.lang.String str25 = dateTimeZone24.getID();
        long long27 = dateTimeZone24.previousTransition((-1L));
        boolean boolean29 = dateTimeZone24.equals((java.lang.Object) 1.0f);
        int int31 = dateTimeZone24.getOffsetFromLocal((long) 25200000);
        java.lang.String str32 = dateTimeZone24.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        long long35 = dateTimeZone24.convertUTCToLocal((-35999790L));
        boolean boolean36 = dateTimeZone5.equals((java.lang.Object) (-35999790L));
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str40 = dateTimeZone38.getNameKey((long) 115800000);
        java.util.TimeZone timeZone41 = dateTimeZone38.toTimeZone();
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        java.lang.String str44 = dateTimeZone43.getID();
        long long46 = dateTimeZone43.previousTransition((-1L));
        boolean boolean48 = dateTimeZone43.equals((java.lang.Object) 1.0f);
        int int50 = dateTimeZone43.getOffsetFromLocal((long) 25200000);
        java.lang.String str51 = dateTimeZone43.getID();
        java.util.TimeZone timeZone52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        java.lang.String str54 = dateTimeZone53.getID();
        long long56 = dateTimeZone53.previousTransition((-1L));
        long long58 = dateTimeZone53.previousTransition(102L);
        long long60 = dateTimeZone43.getMillisKeepLocal(dateTimeZone53, 25199948L);
        java.lang.Object obj61 = dateTimeZone53.writeReplace();
        boolean boolean62 = dateTimeZone38.equals(obj61);
        long long64 = dateTimeZone5.getMillisKeepLocal(dateTimeZone38, 277260100L);
        long long66 = dateTimeZone38.previousTransition((-1569724924100L));
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
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-35999791L) + "'", long35 == (-35999791L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "-00:00:00.001" + "'", str44, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "-00:00:00.001" + "'", str51, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "-00:00:00.001" + "'", str54, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1L) + "'", long56 == (-1L));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 102L + "'", long58 == 102L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 25199948L + "'", long60 == 25199948L);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 277260100L + "'", long64 == 277260100L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1569724924100L) + "'", long66 == (-1569724924100L));
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((-1570120924103L), locale8);
        int int11 = dateTimeZone1.getOffsetFromLocal((-39600002L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
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
        int int8 = dateTimeZone1.getOffsetFromLocal((long) 25200000);
        java.lang.String str9 = dateTimeZone1.getID();
        long long11 = dateTimeZone1.convertUTCToLocal(10L);
        java.lang.String str12 = dateTimeZone1.getID();
        java.lang.String str14 = dateTimeZone1.getName((-1569897124001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9L + "'", long11 == 9L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
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
        java.lang.String str20 = dateTimeZone1.getID();
        long long23 = dateTimeZone1.adjustOffset((-360600002L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115800000L + "'", long8 == 115800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-360600002L) + "'", long23 == (-360600002L));
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset(0L);
        long long7 = dateTimeZone1.adjustOffset((-1570084924100L), false);
        long long11 = dateTimeZone1.convertLocalToUTC(115800000L, false, (-1570084924202L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName(79800000L, locale13);
        java.lang.String str16 = dateTimeZone1.getNameKey(0L);
        long long20 = dateTimeZone1.convertLocalToUTC((-1570120924101L), true, (-1570084924199L));
        long long24 = dateTimeZone1.convertLocalToUTC((-6719866L), true, (-395999899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570084924100L) + "'", long7 == (-1570084924100L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115799999L + "'", long11 == 115799999L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570120924102L) + "'", long20 == (-1570120924102L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-6719867L) + "'", long24 == (-6719867L));
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), 0);
        java.lang.String str3 = dateTimeZone2.getID();
        int int5 = dateTimeZone2.getStandardOffset(244800000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getNameKey((-115799900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-01:00" + "'", str3, "-01:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3600000) + "'", int5 == (-3600000));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
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
        boolean boolean23 = dateTimeZone1.isStandardOffset((-1569724924100L));
        long long27 = dateTimeZone1.convertLocalToUTC((-1570084924103L), false, (-360599898L));
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = dateTimeZone1.isLocalDateTimeGap(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-01:00" + "'", str2, "-01:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 28800000L + "'", long8 == 28800000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-01:00" + "'", str11, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-01:00" + "'", str13, "-01:00");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 40200000L + "'", long18 == 40200000L);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3600000) + "'", int21 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1570081324103L) + "'", long27 == (-1570081324103L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
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
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        long long36 = dateTimeZone32.getMillisKeepLocal(dateTimeZone34, (long) 'a');
        boolean boolean37 = dateTimeZone32.isFixed();
        int int39 = dateTimeZone32.getStandardOffset((-1L));
        int int41 = dateTimeZone32.getOffset((long) (short) 1);
        java.util.Locale locale43 = null;
        java.lang.String str44 = dateTimeZone32.getName((-1570084924202L), locale43);
        int int46 = dateTimeZone32.getStandardOffset(35L);
        int int48 = dateTimeZone32.getOffsetFromLocal((-35999900L));
        long long50 = dateTimeZone1.getMillisKeepLocal(dateTimeZone32, (long) ' ');
        int int52 = dateTimeZone1.getOffset((-360000199L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-01:00" + "'", str8, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-01:00" + "'", str13, "-01:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570088524101L) + "'", long15 == (-1570088524101L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3600000) + "'", int17 == (-3600000));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-3600000) + "'", int19 == (-3600000));
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-3600000) + "'", int25 == (-3600000));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-01:00" + "'", str26, "-01:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-01:00" + "'", str27, "-01:00");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-3600000) + "'", int29 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 97L + "'", long36 == 97L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-3600000) + "'", int39 == (-3600000));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-3600000) + "'", int41 == (-3600000));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "-01:00" + "'", str44, "-01:00");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-3600000) + "'", int46 == (-3600000));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-3600000) + "'", int48 == (-3600000));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 32L + "'", long50 == 32L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-3600000) + "'", int52 == (-3600000));
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        int int10 = dateTimeZone1.getStandardOffset(98L);
        long long13 = dateTimeZone1.convertLocalToUTC(115199900L, true);
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3600000) + "'", int5 == (-3600000));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-01:00" + "'", str8, "-01:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-3600000) + "'", int10 == (-3600000));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 118799900L + "'", long13 == 118799900L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT-01:00");
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        int int5 = dateTimeZone1.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        long long9 = dateTimeZone1.adjustOffset((-1570084923900L), true);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str13 = dateTimeZone1.getShortName((-79800100L));
        long long15 = dateTimeZone1.previousTransition((-1570200123900L));
        int int17 = dateTimeZone1.getOffsetFromLocal(18480000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1570084923900L) + "'", long9 == (-1570084923900L));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570200123900L) + "'", long15 == (-1570200123900L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.toString();
        long long7 = dateTimeZone1.convertLocalToUTC((-1L), false, (long) 1);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long14 = dateTimeZone1.convertLocalToUTC(3L, true, 59999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 4L + "'", long14 == 4L);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str4 = dateTimeZone1.getNameKey(25199900L);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        long long8 = dateTimeZone1.previousTransition((-43200200L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-43200200L) + "'", long8 == (-43200200L));
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset(0L);
        long long7 = dateTimeZone1.adjustOffset((-1570084924100L), false);
        long long11 = dateTimeZone1.convertLocalToUTC(115800000L, false, (-1570084924202L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName(79800000L, locale13);
        java.lang.String str16 = dateTimeZone1.getNameKey(0L);
        int int18 = dateTimeZone1.getOffsetFromLocal(35999849L);
        long long20 = dateTimeZone1.convertUTCToLocal((-1570081324101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570084924100L) + "'", long7 == (-1570084924100L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115799999L + "'", long11 == 115799999L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570081324100L) + "'", long20 == (-1570081324100L));
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
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
        java.lang.String str25 = dateTimeZone3.getName(374400000L);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone3.getShortName(359999802L, locale27);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
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
        boolean boolean17 = dateTimeZone1.isFixed();
        long long20 = dateTimeZone1.adjustOffset((long) ' ', false);
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
        int int35 = dateTimeZone24.getOffsetFromLocal((long) (byte) 1);
        long long37 = dateTimeZone24.convertUTCToLocal((-99L));
        java.util.TimeZone timeZone38 = dateTimeZone24.toTimeZone();
        long long41 = dateTimeZone24.adjustOffset(25199899L, false);
        long long43 = dateTimeZone24.nextTransition(25200001L);
        java.lang.String str45 = dateTimeZone24.getName((long) (byte) -1);
        long long47 = dateTimeZone1.getMillisKeepLocal(dateTimeZone24, 100L);
        long long49 = dateTimeZone24.nextTransition(288000004L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115799901L + "'", long14 == 115799901L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-00:00:00.001" + "'", str33, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-100L) + "'", long37 == (-100L));
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 25199899L + "'", long41 == 25199899L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 25200001L + "'", long43 == 25200001L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-00:00:00.001" + "'", str45, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 100L + "'", long47 == 100L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 288000004L + "'", long49 == 288000004L);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
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
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (byte) 10);
        long long71 = dateTimeZone24.getMillisKeepLocal(dateTimeZone69, (-78719989L));
        java.util.TimeZone timeZone72 = null;
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forTimeZone(timeZone72);
        java.lang.String str74 = dateTimeZone73.getID();
        long long76 = dateTimeZone73.previousTransition((-1L));
        long long80 = dateTimeZone73.convertLocalToUTC(25200000L, true, 100L);
        java.util.Locale locale82 = null;
        java.lang.String str83 = dateTimeZone73.getShortName((-1L), locale82);
        boolean boolean84 = dateTimeZone73.isFixed();
        java.lang.String str85 = dateTimeZone73.getID();
        java.lang.Object obj86 = dateTimeZone73.writeReplace();
        long long90 = dateTimeZone73.convertLocalToUTC((long) 36600000, true, (-47L));
        java.util.TimeZone timeZone91 = dateTimeZone73.toTimeZone();
        org.joda.time.ReadableInstant readableInstant92 = null;
        int int93 = dateTimeZone73.getOffset(readableInstant92);
        boolean boolean94 = dateTimeZone24.equals((java.lang.Object) dateTimeZone73);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200001L + "'", long10 == 25200001L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 102L + "'", long12 == 102L);
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
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-115319889L) + "'", long71 == (-115319889L));
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "+00:00:00.100" + "'", str74, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-1L) + "'", long76 == (-1L));
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 25199900L + "'", long80 == 25199900L);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "+00:00:00.100" + "'", str83, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "+00:00:00.100" + "'", str85, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 36599900L + "'", long90 == 36599900L);
        org.junit.Assert.assertNotNull(timeZone91);
        org.junit.Assert.assertEquals(timeZone91.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 100 + "'", int93 == 100);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        java.lang.String str3 = dateTimeZone1.getShortName((long) (short) 10);
        int int5 = dateTimeZone1.getOffsetFromLocal((-1570084924102L));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        long long9 = dateTimeZone7.nextTransition((-46800000L));
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-36059897L));
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long17 = dateTimeZone1.adjustOffset(115799901L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+01:00" + "'", str3, "+01:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-46800000L) + "'", long9 == (-46800000L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-36059897L) + "'", long11 == (-36059897L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3600000 + "'", int13 == 3600000);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 115799901L + "'", long17 == 115799901L);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(32);
        long long3 = dateTimeZone1.previousTransition((-1570200724001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1570200724001L) + "'", long3 == (-1570200724001L));
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
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
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone1.getOffset(readableInstant22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone1.getName((-6719890L), locale25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone1.getOffset(readableInstant27);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:00" + "'", str2, "+01:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+01:00" + "'", str6, "+01:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+01:00" + "'", str9, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3600000 + "'", int23 == 3600000);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+01:00" + "'", str26, "+01:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3600000 + "'", int28 == 3600000);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 0, locale3);
        boolean boolean5 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone7.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone7.getOffset(readableInstant10);
        long long13 = dateTimeZone7.previousTransition((long) (short) 10);
        java.lang.String str14 = dateTimeZone7.toString();
        java.lang.String str16 = dateTimeZone7.getName((-1570084923900L));
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, 9L);
        java.lang.String str19 = dateTimeZone7.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3600000 + "'", int11 == 3600000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:00" + "'", str14, "+01:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+01:00" + "'", str16, "+01:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3599992L) + "'", long18 == (-3599992L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+01:00" + "'", str19, "+01:00");
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str7 = dateTimeZone1.getName((long) 100);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.getID();
        long long12 = dateTimeZone9.previousTransition((-1L));
        long long16 = dateTimeZone9.convertLocalToUTC(25200000L, true, 100L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone9.getShortName((-1L), locale18);
        boolean boolean20 = dateTimeZone9.isFixed();
        java.lang.String str21 = dateTimeZone9.getID();
        java.lang.Object obj22 = dateTimeZone9.writeReplace();
        long long26 = dateTimeZone9.convertLocalToUTC((long) 36600000, true, (-47L));
        java.util.TimeZone timeZone27 = dateTimeZone9.toTimeZone();
        boolean boolean28 = dateTimeZone1.equals((java.lang.Object) timeZone27);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone1.getName((-1570200724064L), locale30);
        org.joda.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = dateTimeZone1.isLocalDateTimeGap(localDateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:00" + "'", str7, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:00" + "'", str10, "+01:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 21600000L + "'", long16 == 21600000L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+01:00" + "'", str19, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+01:00" + "'", str21, "+01:00");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 33000000L + "'", long26 == 33000000L);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+01:00" + "'", str31, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
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
        java.lang.String str35 = dateTimeZone1.getNameKey(547199901L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:00" + "'", str8, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3600000 + "'", int17 == 3600000);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3600000L + "'", long21 == 3600000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570088524001L) + "'", long26 == (-1570088524001L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3600000 + "'", int28 == 3600000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3600000 + "'", int30 == 3600000);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-3599802L) + "'", long32 == (-3599802L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+01:00" + "'", str33, "+01:00");
        org.junit.Assert.assertNull(str35);
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        java.lang.String str14 = dateTimeZone3.getName(0L);
        java.lang.String str16 = dateTimeZone3.getName((long) 'a');
        java.lang.Object obj17 = dateTimeZone3.writeReplace();
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone3.getOffset(readableInstant18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        java.lang.String str23 = dateTimeZone22.toString();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forID("+10:00");
        java.lang.String str26 = dateTimeZone25.getID();
        boolean boolean27 = dateTimeZone22.equals((java.lang.Object) dateTimeZone25);
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = dateTimeZone25.getOffset(readableInstant28);
        java.lang.Object obj30 = dateTimeZone25.writeReplace();
        long long32 = dateTimeZone3.getMillisKeepLocal(dateTimeZone25, (-1570194003999L));
        long long36 = dateTimeZone3.convertLocalToUTC(223200009L, false, (-14400099L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:00" + "'", str12, "+01:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:00" + "'", str14, "+01:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+01:00" + "'", str16, "+01:00");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3600000 + "'", int19 == 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+01:00" + "'", str23, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+10:00" + "'", str26, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 36000000 + "'", int29 == 36000000);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1570226403999L) + "'", long32 == (-1570226403999L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 219600009L + "'", long36 == 219600009L);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
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
        java.lang.String str23 = dateTimeZone1.getShortName((-1570048923999L));
        java.lang.String str24 = dateTimeZone1.toString();
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        long long30 = dateTimeZone26.getMillisKeepLocal(dateTimeZone28, (long) 'a');
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone26.getName((long) (short) 1, locale32);
        boolean boolean35 = dateTimeZone26.equals((java.lang.Object) false);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone26.getName((long) 100, locale37);
        long long40 = dateTimeZone26.convertUTCToLocal((-1570084924101L));
        int int42 = dateTimeZone26.getOffsetFromLocal((-1570084924001L));
        int int44 = dateTimeZone26.getOffsetFromLocal(25200001L);
        long long46 = dateTimeZone26.convertUTCToLocal((-1570048924000L));
        java.lang.String str47 = dateTimeZone26.toString();
        java.lang.String str49 = dateTimeZone26.getName(7200000L);
        long long51 = dateTimeZone1.getMillisKeepLocal(dateTimeZone26, 359999909L);
        long long53 = dateTimeZone26.convertUTCToLocal(209L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:00" + "'", str2, "+01:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+01:00" + "'", str9, "+01:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3599948L) + "'", long15 == (-3599948L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-3600001L) + "'", long19 == (-3600001L));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+01:00" + "'", str23, "+01:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+01:00" + "'", str24, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+01:00" + "'", str33, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+01:00" + "'", str38, "+01:00");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1570081324101L) + "'", long40 == (-1570081324101L));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3600000 + "'", int42 == 3600000);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3600000 + "'", int44 == 3600000);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1570045324000L) + "'", long46 == (-1570045324000L));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+01:00" + "'", str47, "+01:00");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+01:00" + "'", str49, "+01:00");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 359999909L + "'", long51 == 359999909L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 3600209L + "'", long53 == 3600209L);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        long long4 = dateTimeZone1.convertLocalToUTC((-46800000L), false);
        long long7 = dateTimeZone1.adjustOffset(360000111L, true);
        long long9 = dateTimeZone1.nextTransition((-1570444923900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-46800000L) + "'", long4 == (-46800000L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 360000111L + "'", long7 == 360000111L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1570444923900L) + "'", long9 == (-1570444923900L));
        org.junit.Assert.assertNotNull(obj11);
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
        long long7 = dateTimeZone1.convertUTCToLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        java.lang.Object obj10 = dateTimeZone9.writeReplace();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone9.getName((-35999890L), locale12);
        java.lang.String str14 = dateTimeZone9.toString();
        long long16 = dateTimeZone9.convertUTCToLocal(76200054L);
        boolean boolean18 = dateTimeZone9.isStandardOffset((-1570084923901L));
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, 175L);
        boolean boolean22 = dateTimeZone9.isStandardOffset(36599902L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.032" + "'", str13, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.032" + "'", str14, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 76200086L + "'", long16 == 76200086L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 143L + "'", long20 == 143L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long5 = dateTimeZone1.convertLocalToUTC(25199999L, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        long long11 = dateTimeZone7.adjustOffset((long) (byte) 1, false);
        java.lang.String str13 = dateTimeZone7.getName(97L);
        java.lang.String str15 = dateTimeZone7.getNameKey(0L);
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-1570084924101L));
        java.lang.String str19 = dateTimeZone7.getShortName((long) 'a');
        java.lang.String str21 = dateTimeZone7.getNameKey((-20L));
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.lang.String str26 = dateTimeZone25.getID();
        long long28 = dateTimeZone25.previousTransition((-1L));
        long long32 = dateTimeZone25.convertLocalToUTC(25200000L, true, 100L);
        long long34 = dateTimeZone23.getMillisKeepLocal(dateTimeZone25, 100L);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        long long38 = dateTimeZone23.getMillisKeepLocal(dateTimeZone36, 97L);
        long long40 = dateTimeZone36.previousTransition(25199900L);
        java.lang.String str42 = dateTimeZone36.getName((-10800100L));
        long long46 = dateTimeZone36.convertLocalToUTC((-35999899L), true, 102L);
        long long50 = dateTimeZone36.convertLocalToUTC((-35999903L), false, (-35999999L));
        boolean boolean51 = dateTimeZone7.equals((java.lang.Object) long50);
        int int53 = dateTimeZone7.getStandardOffset((-1570120984102L));
        long long56 = dateTimeZone7.adjustOffset((-1570088524190L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25199999L + "'", long5 == 25199999L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570084924102L) + "'", long17 == (-1570084924102L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 25200000L + "'", long32 == 25200000L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 101L + "'", long34 == 101L);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-3599902L) + "'", long38 == (-3599902L));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 25199900L + "'", long40 == 25199900L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+01:00" + "'", str42, "+01:00");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-39599899L) + "'", long46 == (-39599899L));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-39599903L) + "'", long50 == (-39599903L));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1570088524190L) + "'", long56 == (-1570088524190L));
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset(0L);
        long long7 = dateTimeZone1.adjustOffset((-1570084924100L), false);
        long long11 = dateTimeZone1.convertLocalToUTC(101L, true, 115799797L);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str14 = dateTimeZone13.getID();
        long long16 = dateTimeZone13.previousTransition((-1L));
        boolean boolean18 = dateTimeZone13.equals((java.lang.Object) 1.0f);
        int int20 = dateTimeZone13.getOffsetFromLocal((long) 25200000);
        java.lang.String str21 = dateTimeZone13.getID();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.lang.String str24 = dateTimeZone23.getID();
        long long26 = dateTimeZone23.previousTransition((-1L));
        long long28 = dateTimeZone23.previousTransition(102L);
        long long30 = dateTimeZone13.getMillisKeepLocal(dateTimeZone23, 25199948L);
        java.lang.String str32 = dateTimeZone23.getName((long) 36000000);
        long long35 = dateTimeZone23.convertLocalToUTC(134L, true);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        int int38 = dateTimeZone36.getOffsetFromLocal((-25200002L));
        boolean boolean39 = dateTimeZone23.equals((java.lang.Object) dateTimeZone36);
        boolean boolean40 = dateTimeZone1.equals((java.lang.Object) dateTimeZone36);
        java.util.TimeZone timeZone41 = dateTimeZone36.toTimeZone();
        boolean boolean42 = dateTimeZone36.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570084924100L) + "'", long7 == (-1570084924100L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 102L + "'", long28 == 102L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 25199948L + "'", long30 == 25199948L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 134L + "'", long35 == 134L);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        boolean boolean14 = dateTimeZone3.equals((java.lang.Object) (byte) 0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone3.getOffset(readableInstant15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone3.getName((-6720020L), locale19);
        boolean boolean21 = dateTimeZone3.isFixed();
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone3.getShortName((-10799899L), locale23);
        boolean boolean25 = dateTimeZone3.isFixed();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        boolean boolean13 = dateTimeZone3.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone14 = dateTimeZone3.toTimeZone();
        int int16 = dateTimeZone3.getOffsetFromLocal((long) ' ');
        long long19 = dateTimeZone3.convertLocalToUTC((-1570084923900L), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.lang.String str22 = dateTimeZone3.getNameKey((-121499999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1570084923900L) + "'", long19 == (-1570084923900L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
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
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forID("+00:00:00.052");
        long long32 = dateTimeZone1.getMillisKeepLocal(dateTimeZone30, (-1569969724100L));
        java.lang.String str34 = dateTimeZone1.getName((-1570084924090L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 25200001L + "'", long25 == 25200001L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-25200102L) + "'", long27 == (-25200102L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1569969724152L) + "'", long32 == (-1569969724152L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long26 = dateTimeZone1.convertLocalToUTC((-79200000L), true, (-1570048324200L));
        boolean boolean28 = dateTimeZone1.isStandardOffset((-35999689L));
        long long30 = dateTimeZone1.nextTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 25199999L + "'", long17 == 25199999L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-25200002L) + "'", long21 == (-25200002L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-79200000L) + "'", long26 == (-79200000L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.lang.String str3 = dateTimeZone1.getShortName((-25200001L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 52L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-3599803L), locale9);
        long long12 = dateTimeZone1.nextTransition(359999900L);
        int int14 = dateTimeZone1.getOffsetFromLocal(115799999L);
        boolean boolean16 = dateTimeZone1.isStandardOffset(187199899L);
        long long19 = dateTimeZone1.convertLocalToUTC((-17520099L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.010" + "'", str3, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-11L) + "'", long7 == (-11L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 359999900L + "'", long12 == 359999900L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-17520109L) + "'", long19 == (-17520109L));
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
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
        java.lang.String str17 = dateTimeZone1.getNameKey((-25200000L));
        java.util.TimeZone timeZone18 = dateTimeZone1.toTimeZone();
        long long20 = dateTimeZone1.previousTransition((-36000299L));
        java.lang.String str21 = dateTimeZone1.toString();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        long long27 = dateTimeZone23.getMillisKeepLocal(dateTimeZone25, (long) 'a');
        int int29 = dateTimeZone25.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone30 = dateTimeZone25.toTimeZone();
        int int32 = dateTimeZone25.getOffset((long) (short) 1);
        long long36 = dateTimeZone25.convertLocalToUTC((long) 115800000, true, (-1570084924000L));
        java.lang.String str38 = dateTimeZone25.getNameKey(359999834L);
        boolean boolean39 = dateTimeZone1.equals((java.lang.Object) str38);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924201L) + "'", long15 == (-1570084924201L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-36000299L) + "'", long20 == (-36000299L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 115800000L + "'", long36 == 115800000L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UTC" + "'", str38, "UTC");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
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
        long long19 = dateTimeZone3.previousTransition((-1569724924100L));
        int int21 = dateTimeZone3.getOffsetFromLocal((-140399998L));
        long long23 = dateTimeZone3.convertUTCToLocal((-6720045L));
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone3.isLocalDateTimeGap(localDateTime24);
        long long28 = dateTimeZone3.convertLocalToUTC((-1570084923999L), false);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1569724924100L) + "'", long19 == (-1569724924100L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-6720045L) + "'", long23 == (-6720045L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1570084923999L) + "'", long28 == (-1570084923999L));
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
        org.joda.time.LocalDateTime localDateTime57 = null;
        boolean boolean58 = dateTimeZone3.isLocalDateTimeGap(localDateTime57);
        int int60 = dateTimeZone3.getStandardOffset((-6720044L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean63 = dateTimeZone3.isStandardOffset((-35999801L));
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj66 = dateTimeZone65.writeReplace();
        long long70 = dateTimeZone65.convertLocalToUTC(324000003L, true, (-91L));
        long long72 = dateTimeZone3.getMillisKeepLocal(dateTimeZone65, (-152399899L));
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTC" + "'", str41, "UTC");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 25199900L + "'", long50 == 25199900L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-3599803L) + "'", long52 == (-3599803L));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1570084924000L) + "'", long54 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 187199901L + "'", long56 == 187199901L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 324000002L + "'", long70 == 324000002L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-152399900L) + "'", long72 == (-152399900L));
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long8 = dateTimeZone1.previousTransition(115800000L);
        long long12 = dateTimeZone1.convertLocalToUTC(97L, true, (-35999903L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((long) '#', locale14);
        int int17 = dateTimeZone1.getOffset((-36000099L));
        boolean boolean18 = dateTimeZone1.isFixed();
        long long21 = dateTimeZone1.adjustOffset((-1570084924102L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115800000L + "'", long8 == 115800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1570084924102L) + "'", long21 == (-1570084924102L));
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        int int5 = dateTimeZone1.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        long long9 = dateTimeZone1.adjustOffset((-1570084923900L), true);
        java.lang.String str11 = dateTimeZone1.getNameKey(79800000L);
        java.lang.String str13 = dateTimeZone1.getNameKey(62L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1570084923900L) + "'", long9 == (-1570084923900L));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        int int10 = dateTimeZone1.getOffsetFromLocal(9L);
        boolean boolean11 = dateTimeZone1.isFixed();
        java.lang.String str13 = dateTimeZone1.getNameKey(36599900L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) '4');
        java.lang.String str17 = dateTimeZone16.getID();
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, (-1569933723900L));
        java.lang.String str20 = dateTimeZone16.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+01:52" + "'", str17, "+01:52");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1569940443901L) + "'", long19 == (-1569940443901L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+01:52" + "'", str20, "+01:52");
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
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        long long34 = dateTimeZone32.nextTransition((long) (short) 100);
        int int36 = dateTimeZone32.getOffsetFromLocal(100L);
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone32.getName((-99L), locale38);
        org.joda.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = dateTimeZone32.isLocalDateTimeGap(localDateTime40);
        java.util.TimeZone timeZone42 = dateTimeZone32.toTimeZone();
        java.lang.String str44 = dateTimeZone32.getShortName(32L);
        java.lang.String str45 = dateTimeZone32.getID();
        boolean boolean46 = dateTimeZone1.equals((java.lang.Object) str45);
        long long48 = dateTimeZone1.previousTransition((-1569688924001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924001L) + "'", long15 == (-1570084924001L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.100" + "'", str39, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00:00.100" + "'", str44, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00:00.100" + "'", str45, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1569688924001L) + "'", long48 == (-1569688924001L));
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str5 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        long long11 = dateTimeZone1.convertLocalToUTC((long) (byte) 1, false, 0L);
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName(359999948L, locale14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
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
        long long21 = dateTimeZone1.adjustOffset((-35999699L), false);
        long long23 = dateTimeZone1.previousTransition((-1570200723964L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-35999699L) + "'", long21 == (-35999699L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1570200723964L) + "'", long23 == (-1570200723964L));
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long5 = dateTimeZone1.convertLocalToUTC(25199999L, false, 0L);
        int int7 = dateTimeZone1.getOffsetFromLocal(21600001L);
        long long9 = dateTimeZone1.convertUTCToLocal(28799901L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        long long14 = dateTimeZone1.adjustOffset((-1569897724101L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25199999L + "'", long5 == 25199999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 28799901L + "'", long9 == 28799901L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1569897724101L) + "'", long14 == (-1569897724101L));
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        long long11 = dateTimeZone1.nextTransition((long) ' ');
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        int int15 = dateTimeZone1.getOffset((-6720020L));
        java.lang.String str17 = dateTimeZone1.getName(547200000L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName((-7199801L), locale19);
        java.lang.String str22 = dateTimeZone1.getNameKey(280199800L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertNull(str22);
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
        long long26 = dateTimeZone1.convertUTCToLocal(180479902L);
        java.lang.String str28 = dateTimeZone1.getNameKey((-159000100L));
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 180480002L + "'", long26 == 180480002L);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        int int6 = dateTimeZone1.getOffset((long) 115800000);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone8.getName((long) (short) 1, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.lang.String str17 = dateTimeZone8.getID();
        long long19 = dateTimeZone8.previousTransition((-10800000L));
        boolean boolean20 = dateTimeZone1.equals((java.lang.Object) long19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        long long26 = dateTimeZone22.getMillisKeepLocal(dateTimeZone24, (long) 'a');
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone22.getName((long) (short) 1, locale28);
        java.lang.String str31 = dateTimeZone22.getName((long) '#');
        java.lang.String str32 = dateTimeZone22.getID();
        long long34 = dateTimeZone1.getMillisKeepLocal(dateTimeZone22, 112L);
        boolean boolean36 = dateTimeZone22.isStandardOffset(115799999L);
        boolean boolean37 = dateTimeZone22.isFixed();
        java.lang.String str39 = dateTimeZone22.getShortName((-1570048924000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-10800000L) + "'", long19 == (-10800000L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.100" + "'", str29, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.100" + "'", str32, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 112L + "'", long34 == 112L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.100" + "'", str39, "+00:00:00.100");
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.lang.String str3 = dateTimeZone1.getName((-35999799L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str6 = dateTimeZone1.getName((-6719950L));
        java.lang.String str8 = dateTimeZone1.getNameKey((-36000099L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+100:00" + "'", str3, "+100:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+100:00" + "'", str6, "+100:00");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        boolean boolean7 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        boolean boolean10 = dateTimeZone1.isFixed();
        boolean boolean12 = dateTimeZone1.isStandardOffset((-18480002L));
        long long14 = dateTimeZone1.convertUTCToLocal((-1570120924103L));
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1570120924104L) + "'", long14 == (-1570120924104L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        int int3 = dateTimeZone1.getOffsetFromLocal((-6719991L));
        java.lang.String str4 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.Class<?> wildcardClass7 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600000 + "'", int3 == 3600000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3600000 + "'", int6 == 3600000);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
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
        long long30 = dateTimeZone3.adjustOffset(0L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 360000000 + "'", int7 == 360000000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+:0:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+:0:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+100:00" + "'", str12, "+100:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 360000000 + "'", int14 == 360000000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 359999901L + "'", long16 == 359999901L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+:0:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25199899L + "'", long20 == 25199899L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-35999948L) + "'", long22 == (-35999948L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+100:00" + "'", str25, "+100:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 349800000L + "'", long27 == 349800000L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        long long5 = dateTimeZone1.convertLocalToUTC((-1570084924102L), false);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        long long9 = dateTimeZone1.adjustOffset(3600098L, true);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+100:00" + "'", str2, "+100:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570444924102L) + "'", long5 == (-1570444924102L));
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+:0:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600098L + "'", long9 == 3600098L);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(25200000L, locale3);
        long long6 = dateTimeZone1.previousTransition((-1569969124101L));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-39600099L), locale8);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        int int17 = dateTimeZone13.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone18 = dateTimeZone13.toTimeZone();
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone13.getShortName((long) (byte) 100, locale20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone13.getShortName((long) (short) 0, locale23);
        java.lang.String str25 = dateTimeZone13.getID();
        java.lang.String str27 = dateTimeZone13.getNameKey(115799900L);
        java.lang.String str28 = dateTimeZone13.getID();
        long long30 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (-1569933124299L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1569969124101L) + "'", long6 == (-1569969124101L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 360000000 + "'", int17 == 360000000);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+:0:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+100:00" + "'", str21, "+100:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+100:00" + "'", str24, "+100:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+100:00" + "'", str25, "+100:00");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+100:00" + "'", str28, "+100:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1570293124299L) + "'", long30 == (-1570293124299L));
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((-168L), locale3);
        java.lang.String str6 = dateTimeZone1.getName((-1569735724301L));
        long long10 = dateTimeZone1.convertLocalToUTC((-115200000L), true, 3599910L);
        java.lang.String str12 = dateTimeZone1.getNameKey((-1570048324000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-230400000L) + "'", long10 == (-230400000L));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 25200000, true, (long) (short) 10);
        int int8 = dateTimeZone1.getStandardOffset(115799900L);
        java.lang.String str10 = dateTimeZone1.getShortName(110L);
        java.lang.String str12 = dateTimeZone1.getShortName((-25200001L));
        java.lang.String str14 = dateTimeZone1.getShortName(187200000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
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
        java.lang.String str30 = dateTimeZone19.getNameKey((-91L));
        long long32 = dateTimeZone1.getMillisKeepLocal(dateTimeZone19, 46L);
        boolean boolean33 = dateTimeZone19.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25199999L + "'", long6 == 25199999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.001" + "'", str28, "+00:00:00.001");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 46L + "'", long32 == 46L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        long long14 = dateTimeZone3.convertUTCToLocal(187199900L);
        long long16 = dateTimeZone3.convertUTCToLocal(35L);
        long long19 = dateTimeZone3.convertLocalToUTC((-91L), true);
        long long22 = dateTimeZone3.convertLocalToUTC(7200000L, false);
        long long25 = dateTimeZone3.convertLocalToUTC(187199801L, true);
        int int27 = dateTimeZone3.getStandardOffset((-10800000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199999L + "'", long10 == 25199999L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 187199901L + "'", long14 == 187199901L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 36L + "'", long16 == 36L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-92L) + "'", long19 == (-92L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 7199999L + "'", long22 == 7199999L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 187199800L + "'", long25 == 187199800L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        long long6 = dateTimeZone1.nextTransition((-79800000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-79800000L) + "'", long6 == (-79800000L));
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset(0L);
        long long7 = dateTimeZone1.adjustOffset((-1570084924100L), false);
        long long9 = dateTimeZone1.convertUTCToLocal(151260101L);
        java.lang.String str10 = dateTimeZone1.getID();
        boolean boolean12 = dateTimeZone1.isStandardOffset(172739802L);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        long long16 = dateTimeZone14.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj19 = dateTimeZone18.writeReplace();
        java.lang.Object obj20 = dateTimeZone18.writeReplace();
        int int22 = dateTimeZone18.getOffsetFromLocal((long) (short) 10);
        boolean boolean23 = dateTimeZone14.equals((java.lang.Object) int22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone14.getShortName(0L, locale25);
        java.lang.Object obj27 = dateTimeZone14.writeReplace();
        java.lang.String str29 = dateTimeZone14.getName(115800000L);
        long long31 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 223199900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570084924100L) + "'", long7 == (-1570084924100L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 151260102L + "'", long9 == 151260102L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.001" + "'", str26, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.001" + "'", str29, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 223199900L + "'", long31 == 223199900L);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long5 = dateTimeZone1.convertLocalToUTC(25199999L, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        long long11 = dateTimeZone7.adjustOffset((long) (byte) 1, false);
        java.lang.String str13 = dateTimeZone7.getName(97L);
        java.lang.String str15 = dateTimeZone7.getNameKey(0L);
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-1570084924101L));
        java.lang.String str18 = dateTimeZone7.toString();
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone7.isLocalDateTimeGap(localDateTime19);
        java.lang.Class<?> wildcardClass21 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25199999L + "'", long5 == 25199999L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570084924102L) + "'", long17 == (-1570084924102L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone3.getName((-35999979L), locale12);
        int int15 = dateTimeZone3.getOffsetFromLocal((-3599900L));
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 360000001L);
        java.lang.String str19 = dateTimeZone1.getShortName(6720000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199999L + "'", long10 == 25199999L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 360000100L + "'", long17 == 360000100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long3 = dateTimeZone1.nextTransition((long) 36000000);
        java.lang.Object obj4 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long9 = dateTimeZone6.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        long long14 = dateTimeZone6.convertLocalToUTC(25199999L, false, 79800000L);
        long long16 = dateTimeZone6.nextTransition((-115799999L));
        long long18 = dateTimeZone6.previousTransition((long) ' ');
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, 45L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone6.getOffset(readableInstant22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone6.getName((-140400099L), locale25);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 36000000L + "'", long3 == 36000000L);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-99L) + "'", long9 == (-99L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 25199899L + "'", long14 == 25199899L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115799999L) + "'", long16 == (-115799999L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-20L) + "'", long20 == (-20L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
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
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 0);
        boolean boolean26 = dateTimeZone1.equals((java.lang.Object) dateTimeZone25);
        long long29 = dateTimeZone1.convertLocalToUTC((-43200000L), true);
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
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-43200100L) + "'", long29 == (-43200100L));
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
        long long25 = dateTimeZone3.convertLocalToUTC((-1570120924102L), true);
        java.lang.String str27 = dateTimeZone3.getShortName(158L);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1570120924202L) + "'", long25 == (-1570120924202L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str3 = dateTimeZone1.getNameKey(79800100L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.lang.String str7 = dateTimeZone1.getNameKey(244800000L);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str3 = dateTimeZone1.getID();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName(1L, locale5);
        long long9 = dateTimeZone1.adjustOffset((-6719866L), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.100" + "'", str3, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-6719866L) + "'", long9 == (-6719866L));
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
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 'a');
        java.lang.String str13 = dateTimeZone1.toString();
        long long16 = dateTimeZone1.adjustOffset((-98L), false);
        long long18 = dateTimeZone1.nextTransition((-89999999L));
        java.lang.String str19 = dateTimeZone1.getID();
        java.lang.Class<?> wildcardClass20 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-98L) + "'", long16 == (-98L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-89999999L) + "'", long18 == (-89999999L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((-1L), locale10);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        boolean boolean14 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25199900L + "'", long8 == 25199900L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
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
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone1.isLocalDateTimeGap(localDateTime20);
        int int23 = dateTimeZone1.getOffset((-1570084923900L));
        java.lang.String str25 = dateTimeZone1.getName(0L);
        java.lang.String str26 = dateTimeZone1.toString();
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        long long30 = dateTimeZone28.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = dateTimeZone28.getOffset(readableInstant31);
        java.lang.String str33 = dateTimeZone28.toString();
        int int35 = dateTimeZone28.getStandardOffset((-25200002L));
        long long37 = dateTimeZone1.getMillisKeepLocal(dateTimeZone28, (-21600001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25199948L + "'", long5 == 25199948L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-45L) + "'", long19 == (-45L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.052" + "'", str25, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.052" + "'", str26, "+00:00:00.052");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-21600049L) + "'", long37 == (-21600049L));
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        boolean boolean3 = dateTimeZone1.isStandardOffset(89999998L);
        java.lang.String str4 = dateTimeZone1.toString();
        java.lang.String str6 = dateTimeZone1.getShortName((-32399901L));
        long long9 = dateTimeZone1.convertLocalToUTC(28799901L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 28799900L + "'", long9 == 28799900L);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        java.lang.String str5 = dateTimeZone1.getNameKey(1L);
        int int7 = dateTimeZone1.getOffsetFromLocal((-115799999L));
        java.lang.String str9 = dateTimeZone1.getNameKey((-36000000L));
        java.lang.String str11 = dateTimeZone1.getNameKey(25199990L);
        long long13 = dateTimeZone1.convertUTCToLocal((-1570315924201L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570315924101L) + "'", long13 == (-1570315924101L));
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
        java.lang.String str25 = dateTimeZone3.toString();
        long long27 = dateTimeZone3.nextTransition(28799901L);
        java.lang.String str29 = dateTimeZone3.getShortName((long) (short) 10);
        java.lang.String str30 = dateTimeZone3.getID();
        java.lang.String str31 = dateTimeZone3.getID();
        boolean boolean33 = dateTimeZone3.equals((java.lang.Object) (-25200003L));
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 28799901L + "'", long27 == 28799901L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.100" + "'", str29, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        java.lang.String str10 = dateTimeZone1.getName((long) '#');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-35999948L), locale12);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName(25200001L, locale15);
        int int18 = dateTimeZone1.getOffsetFromLocal(115799902L);
        long long21 = dateTimeZone1.convertLocalToUTC((-1570048323964L), true);
        long long24 = dateTimeZone1.adjustOffset(79200000L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1570048324064L) + "'", long21 == (-1570048324064L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 79200000L + "'", long24 == 79200000L);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (short) 1);
        int int5 = dateTimeZone1.getStandardOffset((-1570084924000L));
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName(3L, locale7);
        java.lang.String str9 = dateTimeZone1.getID();
        long long11 = dateTimeZone1.nextTransition((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str15 = dateTimeZone13.getNameKey((long) 115800000);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone13.getShortName((-1570084924001L), locale17);
        boolean boolean19 = dateTimeZone13.isFixed();
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone13.isLocalDateTimeGap(localDateTime20);
        boolean boolean22 = dateTimeZone13.isFixed();
        int int24 = dateTimeZone13.getOffset((long) 115800000);
        java.lang.String str26 = dateTimeZone13.getNameKey((long) 115800000);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone13.isLocalDateTimeGap(localDateTime27);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone13.getName((-25200101L), locale30);
        boolean boolean32 = dateTimeZone1.equals((java.lang.Object) (-25200101L));
        int int34 = dateTimeZone1.getOffsetFromLocal((-223259897L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-00:00:00.001" + "'", str31, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        int int12 = dateTimeZone1.getOffset((long) '#');
        long long14 = dateTimeZone1.previousTransition((-39599799L));
        long long16 = dateTimeZone1.nextTransition((-71999989L));
        java.lang.Object obj17 = dateTimeZone1.writeReplace();
        long long21 = dateTimeZone1.convertLocalToUTC(115799847L, false, (-432600001L));
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone1.getName((-39599897L), locale23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-39599799L) + "'", long14 == (-39599799L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-71999989L) + "'", long16 == (-71999989L));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 115799747L + "'", long21 == 115799747L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        long long11 = dateTimeZone1.convertUTCToLocal((long) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.lang.Object obj2 = null;
        boolean boolean3 = dateTimeZone1.equals(obj2);
        long long6 = dateTimeZone1.adjustOffset(25199900L, false);
        java.lang.String str8 = dateTimeZone1.getNameKey(100L);
        java.lang.String str9 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25199900L + "'", long6 == 25199900L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        int int8 = dateTimeZone1.getOffsetFromLocal((long) 25200000);
        int int10 = dateTimeZone1.getOffsetFromLocal((-47L));
        long long13 = dateTimeZone1.adjustOffset((-1570444923935L), false);
        java.lang.String str14 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570444923935L) + "'", long13 == (-1570444923935L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        long long7 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        java.lang.String str10 = dateTimeZone1.getNameKey((-125999948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.Class<?> wildcardClass5 = dateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        boolean boolean9 = dateTimeZone3.equals((java.lang.Object) (byte) 0);
        long long13 = dateTimeZone3.convertLocalToUTC((long) (byte) 1, false, 25200000L);
        long long16 = dateTimeZone3.adjustOffset(115800032L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-99L) + "'", long13 == (-99L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 115800032L + "'", long16 == 115800032L);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
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
        java.lang.String str46 = dateTimeZone1.getName((-1570444924101L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone48 = dateTimeZone1.toTimeZone();
        long long50 = dateTimeZone1.previousTransition((-10799999L));
        int int52 = dateTimeZone1.getOffsetFromLocal((-48L));
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
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1570084924101L) + "'", long44 == (-1570084924101L));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.001" + "'", str46, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-10799999L) + "'", long50 == (-10799999L));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal(25199999L);
        int int5 = dateTimeZone1.getOffsetFromLocal((long) '4');
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getStandardOffset((-25200001L));
        long long11 = dateTimeZone1.adjustOffset(2L, true);
        long long15 = dateTimeZone1.convertLocalToUTC((long) 36000000, false, (-90L));
        long long18 = dateTimeZone1.convertLocalToUTC(18480000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35999999L + "'", long15 == 35999999L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 18479999L + "'", long18 == 18479999L);
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        java.lang.String str10 = dateTimeZone1.getName((long) '#');
        java.lang.String str11 = dateTimeZone1.getID();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName((-10800100L), locale13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str18 = dateTimeZone16.getNameKey((long) 115800000);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone16.getShortName((-1570084924001L), locale20);
        long long23 = dateTimeZone16.nextTransition(98L);
        long long25 = dateTimeZone16.nextTransition((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone16.getOffset(readableInstant26);
        long long29 = dateTimeZone16.nextTransition(0L);
        boolean boolean30 = dateTimeZone16.isFixed();
        java.lang.String str32 = dateTimeZone16.getShortName((-25199999L));
        long long34 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, (-6720000L));
        long long36 = dateTimeZone1.nextTransition(25199800L);
        java.lang.String str38 = dateTimeZone1.getName(40200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 98L + "'", long23 == 98L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-6719998L) + "'", long34 == (-6719998L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 25199800L + "'", long36 == 25199800L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.001" + "'", str38, "+00:00:00.001");
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360600000, 115800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.lang.Object obj2 = null;
        boolean boolean3 = dateTimeZone1.equals(obj2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-35999990L));
        java.lang.String str9 = dateTimeZone5.getShortName(133L);
        long long11 = dateTimeZone5.nextTransition((-1570200724098L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-71999989L) + "'", long7 == (-71999989L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570200724098L) + "'", long11 == (-1570200724098L));
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
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
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone13.getName((-68L), locale28);
        long long33 = dateTimeZone13.convertLocalToUTC((-1570045324000L), false, (-152399901L));
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        long long37 = dateTimeZone35.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = dateTimeZone35.getOffset(readableInstant38);
        java.lang.String str40 = dateTimeZone35.toString();
        java.lang.String str41 = dateTimeZone35.toString();
        java.util.Locale locale43 = null;
        java.lang.String str44 = dateTimeZone35.getShortName((-47L), locale43);
        long long46 = dateTimeZone13.getMillisKeepLocal(dateTimeZone35, (-54479800L));
        boolean boolean48 = dateTimeZone13.isStandardOffset(28800000L);
        java.lang.String str49 = dateTimeZone13.getID();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.001" + "'", str26, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.001" + "'", str29, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1570045324001L) + "'", long33 == (-1570045324001L));
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.001" + "'", str40, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.001" + "'", str41, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00:00.001" + "'", str44, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-54479800L) + "'", long46 == (-54479800L));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00:00.001" + "'", str49, "+00:00:00.001");
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
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
        long long17 = dateTimeZone1.convertUTCToLocal((-10L));
        long long19 = dateTimeZone1.previousTransition((-389400001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-9L) + "'", long17 == (-9L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-389400001L) + "'", long19 == (-389400001L));
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(97L);
        long long12 = dateTimeZone1.convertLocalToUTC((-39599799L), false, (-360600001L));
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        long long20 = dateTimeZone16.getMillisKeepLocal(dateTimeZone18, (long) 'a');
        int int22 = dateTimeZone18.getStandardOffset((long) (short) 100);
        boolean boolean24 = dateTimeZone18.equals((java.lang.Object) (byte) 0);
        long long28 = dateTimeZone18.convertLocalToUTC((long) (byte) 1, false, 25200000L);
        java.lang.String str30 = dateTimeZone18.getNameKey(98L);
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
        java.lang.String str47 = dateTimeZone34.toString();
        java.util.TimeZone timeZone48 = dateTimeZone34.toTimeZone();
        java.lang.String str49 = dateTimeZone34.toString();
        java.util.TimeZone timeZone50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        long long53 = dateTimeZone51.nextTransition((long) (short) 100);
        int int55 = dateTimeZone51.getOffsetFromLocal(100L);
        java.util.Locale locale57 = null;
        java.lang.String str58 = dateTimeZone51.getName((-99L), locale57);
        long long60 = dateTimeZone34.getMillisKeepLocal(dateTimeZone51, 10L);
        boolean boolean62 = dateTimeZone51.isStandardOffset((-1570084924102L));
        int int64 = dateTimeZone51.getStandardOffset(0L);
        java.util.Locale locale66 = null;
        java.lang.String str67 = dateTimeZone51.getName((-1569969124202L), locale66);
        long long69 = dateTimeZone18.getMillisKeepLocal(dateTimeZone51, 3600000L);
        int int71 = dateTimeZone51.getStandardOffset(313800045L);
        boolean boolean72 = dateTimeZone1.equals((java.lang.Object) int71);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-39599798L) + "'", long12 == (-39599798L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 97L + "'", long36 == 97L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.001" + "'", str42, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00:00.001" + "'", str45, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.001" + "'", str46, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00:00.001" + "'", str47, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00:00.001" + "'", str49, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 100L + "'", long53 == 100L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+00:00:00.001" + "'", str58, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 10L + "'", long60 == 10L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+00:00:00.001" + "'", str67, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 3600000L + "'", long69 == 3600000L);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
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
        java.lang.Object obj14 = dateTimeZone1.writeReplace();
        int int16 = dateTimeZone1.getOffsetFromLocal(36060000L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone1.getShortName(187199802L, locale18);
        int int21 = dateTimeZone1.getOffset(324000099L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        java.lang.String str7 = dateTimeZone1.toString();
        long long10 = dateTimeZone1.convertLocalToUTC(21600001L, false);
        java.lang.String str12 = dateTimeZone1.getNameKey(360000001L);
        boolean boolean14 = dateTimeZone1.isStandardOffset(25199952L);
        long long16 = dateTimeZone1.previousTransition((-50L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21600000L + "'", long10 == 21600000L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-50L) + "'", long16 == (-50L));
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-46800000L), locale8);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass10);
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
        int int10 = dateTimeZone1.getOffset((long) 1);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        long long13 = dateTimeZone1.nextTransition((long) (byte) -1);
        java.lang.Object obj14 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.lang.String str17 = dateTimeZone16.getID();
        long long19 = dateTimeZone16.previousTransition((-1L));
        long long23 = dateTimeZone16.convertLocalToUTC(25200000L, true, 100L);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone16.getShortName((-1L), locale25);
        boolean boolean27 = dateTimeZone16.isFixed();
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        long long33 = dateTimeZone29.getMillisKeepLocal(dateTimeZone31, (long) 'a');
        int int35 = dateTimeZone31.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone36 = dateTimeZone31.toTimeZone();
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone31.getShortName((long) (byte) 100, locale38);
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone31.getShortName((long) (short) 0, locale41);
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone31.getName((long) (short) 100, locale44);
        boolean boolean46 = dateTimeZone16.equals((java.lang.Object) locale44);
        java.util.TimeZone timeZone47 = dateTimeZone16.toTimeZone();
        boolean boolean48 = dateTimeZone1.equals((java.lang.Object) dateTimeZone16);
        java.util.TimeZone timeZone49 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 25199999L + "'", long23 == 25199999L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.001" + "'", str26, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 97L + "'", long33 == 97L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.001" + "'", str39, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.001" + "'", str42, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00:00.001" + "'", str45, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone17 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.getID();
        long long3 = dateTimeZone0.previousTransition(32L);
        int int5 = dateTimeZone0.getStandardOffset((-187199900L));
        int int7 = dateTimeZone0.getStandardOffset((-3599999L));
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(32);
        boolean boolean11 = dateTimeZone9.isStandardOffset(54L);
        int int13 = dateTimeZone9.getOffset(60098L);
        java.lang.String str14 = dateTimeZone9.toString();
        long long16 = dateTimeZone0.getMillisKeepLocal(dateTimeZone9, (-145L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+00:00:00.001" + "'", str1, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.032" + "'", str14, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-176L) + "'", long16 == (-176L));
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
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
        boolean boolean43 = dateTimeZone13.equals((java.lang.Object) 35999832L);
        long long45 = dateTimeZone13.previousTransition((-1570048923848L));
        long long47 = dateTimeZone13.convertUTCToLocal(157859998L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.001" + "'", str25, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1570084924100L) + "'", long27 == (-1570084924100L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.001" + "'", str32, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-3600000L) + "'", long41 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1570048923848L) + "'", long45 == (-1570048923848L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 157859999L + "'", long47 == 157859999L);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        java.lang.String str5 = dateTimeZone2.getID();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getShortName((-91L), locale7);
        long long11 = dateTimeZone2.convertLocalToUTC(35999900L, false);
        long long14 = dateTimeZone2.adjustOffset(324000002L, false);
        long long17 = dateTimeZone2.convertLocalToUTC((-1569969124200L), true);
        java.util.TimeZone timeZone18 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:10" + "'", str5, "+32:10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:10" + "'", str8, "+32:10");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-79800100L) + "'", long11 == (-79800100L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 324000002L + "'", long14 == 324000002L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570084924200L) + "'", long17 == (-1570084924200L));
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
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
        int int15 = dateTimeZone1.getStandardOffset((-92L));
        int int17 = dateTimeZone1.getStandardOffset((-71999989L));
        java.lang.String str19 = dateTimeZone1.getName((-1570012323999L));
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone21.getName((long) '4', locale23);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone21.getShortName((-1570084924001L), locale26);
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone21, (-6719902L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.001" + "'", str27, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-6719902L) + "'", long29 == (-6719902L));
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        int int10 = dateTimeZone1.getOffsetFromLocal(9L);
        long long14 = dateTimeZone1.convertLocalToUTC((-1570194003901L), true, (-1570084923901L));
        java.lang.String str15 = dateTimeZone1.getID();
        int int17 = dateTimeZone1.getOffsetFromLocal(21599999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1570194003900L) + "'", long14 == (-1570194003900L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.lang.String str7 = dateTimeZone1.getName((long) (byte) 10);
        java.lang.String str9 = dateTimeZone1.getNameKey(25200100L);
        java.lang.String str10 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long14 = dateTimeZone1.convertLocalToUTC((-150660032L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-150660033L) + "'", long14 == (-150660033L));
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getShortName((-1570084924000L));
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        long long17 = dateTimeZone1.convertLocalToUTC(0L, false, 100L);
        long long19 = dateTimeZone1.previousTransition((-36599997L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-36599997L) + "'", long19 == (-36599997L));
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
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
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        long long37 = dateTimeZone35.nextTransition((long) (short) 100);
        int int39 = dateTimeZone35.getOffsetFromLocal(100L);
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone35.getName((-99L), locale41);
        org.joda.time.LocalDateTime localDateTime43 = null;
        boolean boolean44 = dateTimeZone35.isLocalDateTimeGap(localDateTime43);
        java.util.TimeZone timeZone45 = dateTimeZone35.toTimeZone();
        java.lang.String str46 = dateTimeZone35.getID();
        long long49 = dateTimeZone35.convertLocalToUTC(136739903L, true);
        java.util.Locale locale51 = null;
        java.lang.String str52 = dateTimeZone35.getShortName((-1570084923900L), locale51);
        long long54 = dateTimeZone1.getMillisKeepLocal(dateTimeZone35, (-152399900L));
        java.lang.Class<?> wildcardClass55 = dateTimeZone35.getClass();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-3599802L) + "'", long32 == (-3599802L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-00:00:00.001" + "'", str33, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-00:00:00.001" + "'", str42, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "-00:00:00.001" + "'", str46, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 136739904L + "'", long49 == 136739904L);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "-00:00:00.001" + "'", str52, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-152399900L) + "'", long54 == (-152399900L));
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115200000);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(101L, locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
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
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        long long20 = dateTimeZone16.getMillisKeepLocal(dateTimeZone18, (long) 'a');
        int int22 = dateTimeZone18.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone23 = dateTimeZone18.toTimeZone();
        java.util.TimeZone timeZone24 = dateTimeZone18.toTimeZone();
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone18.getName((long) (short) 10, locale26);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forID("+01:00");
        boolean boolean31 = dateTimeZone18.equals((java.lang.Object) dateTimeZone30);
        long long34 = dateTimeZone30.convertLocalToUTC(35L, false);
        long long37 = dateTimeZone30.convertLocalToUTC(187200000L, false);
        boolean boolean38 = dateTimeZone1.equals((java.lang.Object) long37);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone1.getName((-3599965L), locale40);
        long long43 = dateTimeZone1.convertUTCToLocal((-1570081324201L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-3599965L) + "'", long34 == (-3599965L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 183600000L + "'", long37 == 183600000L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-00:00:00.001" + "'", str41, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1570081324202L) + "'", long43 == (-1570081324202L));
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(111L, false, 25199999L);
        int int14 = dateTimeZone1.getOffset(35L);
        long long16 = dateTimeZone1.nextTransition((-36000001L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getShortName((-1570444924101L), locale19);
        long long22 = dateTimeZone1.nextTransition(324000002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 112L + "'", long12 == 112L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-36000001L) + "'", long16 == (-36000001L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 324000002L + "'", long22 == 324000002L);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str3 = dateTimeZone1.getNameKey(79800100L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.lang.String str7 = dateTimeZone1.getNameKey(244800000L);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        java.lang.String str11 = dateTimeZone1.getNameKey((-68400023L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
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
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forID("+10:10");
        long long29 = dateTimeZone3.getMillisKeepLocal(dateTimeZone27, (-115799900L));
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        long long35 = dateTimeZone31.getMillisKeepLocal(dateTimeZone33, (long) 'a');
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone31.getName((long) (short) 1, locale37);
        long long41 = dateTimeZone31.convertLocalToUTC((-1570084924101L), true);
        boolean boolean43 = dateTimeZone31.isStandardOffset(0L);
        long long45 = dateTimeZone3.getMillisKeepLocal(dateTimeZone31, 389279900L);
        java.util.Locale locale47 = null;
        java.lang.String str48 = dateTimeZone31.getName((-35999999L), locale47);
        org.joda.time.tz.NameProvider nameProvider49 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider49);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider49);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider49);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider49);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider49);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider49);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider49);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider49);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider49);
        boolean boolean59 = dateTimeZone31.equals((java.lang.Object) nameProvider49);
        long long61 = dateTimeZone31.convertUTCToLocal(35999933L);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-152399901L) + "'", long29 == (-152399901L));
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 97L + "'", long35 == 97L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-00:00:00.001" + "'", str38, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1570084924100L) + "'", long41 == (-1570084924100L));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 389279900L + "'", long45 == 389279900L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "-00:00:00.001" + "'", str48, "-00:00:00.001");
        org.junit.Assert.assertNotNull(nameProvider49);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 35999932L + "'", long61 == 35999932L);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
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
        int int14 = dateTimeZone1.getStandardOffset((long) (byte) 1);
        java.lang.String str16 = dateTimeZone1.getNameKey((long) (byte) 10);
        long long20 = dateTimeZone1.convertLocalToUTC(35999801L, false, (-166L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35999802L + "'", long20 == 35999802L);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
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
        java.lang.String str25 = dateTimeZone1.getName(115799848L, locale24);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.lang.String str28 = dateTimeZone27.getID();
        long long30 = dateTimeZone27.previousTransition((-1L));
        long long34 = dateTimeZone27.convertLocalToUTC(25200000L, true, 100L);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone27.getShortName((-1L), locale36);
        boolean boolean38 = dateTimeZone27.isFixed();
        java.lang.String str39 = dateTimeZone27.getID();
        java.lang.Object obj40 = dateTimeZone27.writeReplace();
        long long44 = dateTimeZone27.convertLocalToUTC((long) 36600000, true, (-47L));
        java.util.TimeZone timeZone45 = dateTimeZone27.toTimeZone();
        int int47 = dateTimeZone27.getStandardOffset((-1569969124102L));
        java.lang.String str49 = dateTimeZone27.getName(359999900L);
        long long53 = dateTimeZone27.convertLocalToUTC((-1569963004101L), false, 18000000L);
        java.util.TimeZone timeZone54 = dateTimeZone27.toTimeZone();
        boolean boolean55 = dateTimeZone1.equals((java.lang.Object) dateTimeZone27);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 25200001L + "'", long34 == 25200001L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-00:00:00.001" + "'", str37, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-00:00:00.001" + "'", str39, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 36600001L + "'", long44 == 36600001L);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "-00:00:00.001" + "'", str49, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1569963004100L) + "'", long53 == (-1569963004100L));
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str5 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        int int9 = dateTimeZone1.getOffsetFromLocal((-35999900L));
        long long11 = dateTimeZone1.previousTransition((-1570084924001L));
        long long14 = dateTimeZone1.convertLocalToUTC((-10799999L), false);
        long long16 = dateTimeZone1.previousTransition(0L);
        long long19 = dateTimeZone1.adjustOffset(115799999L, false);
        java.util.TimeZone timeZone20 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924001L) + "'", long11 == (-1570084924001L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-10800000L) + "'", long14 == (-10800000L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115799999L + "'", long19 == 115799999L);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
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
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        int int14 = dateTimeZone3.getOffsetFromLocal((long) (byte) 1);
        long long16 = dateTimeZone3.convertUTCToLocal((-99L));
        java.util.TimeZone timeZone17 = dateTimeZone3.toTimeZone();
        long long20 = dateTimeZone3.adjustOffset(25199899L, false);
        long long22 = dateTimeZone3.nextTransition(25200001L);
        java.lang.String str24 = dateTimeZone3.getName((long) (byte) -1);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone3.getName((-36599789L), locale26);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-100L) + "'", long16 == (-100L));
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25199899L + "'", long20 == 25199899L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 25200001L + "'", long22 == 25200001L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str4 = dateTimeZone1.getName(190800000L);
        java.lang.String str5 = dateTimeZone1.toString();
        boolean boolean6 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        long long12 = dateTimeZone1.convertLocalToUTC((long) 36000000, false, (-25200002L));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int17 = dateTimeZone15.getStandardOffset((long) 10);
        long long19 = dateTimeZone15.previousTransition((long) (-1));
        boolean boolean20 = dateTimeZone15.isFixed();
        boolean boolean21 = dateTimeZone15.isFixed();
        long long23 = dateTimeZone15.convertUTCToLocal((-1570438204201L));
        boolean boolean24 = dateTimeZone1.equals((java.lang.Object) dateTimeZone15);
        long long26 = dateTimeZone1.previousTransition((-36000209L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36000001L + "'", long12 == 36000001L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115800000 + "'", int17 == 115800000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1570322404201L) + "'", long23 == (-1570322404201L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-36000209L) + "'", long26 == (-36000209L));
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        long long19 = dateTimeZone15.convertLocalToUTC((long) 3600000, false, (-25200001L));
        long long21 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, (-1570084924101L));
        long long23 = dateTimeZone15.nextTransition((-35999689L));
        long long27 = dateTimeZone15.convertLocalToUTC(0L, true, (-45L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3600001L + "'", long19 == 3600001L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1570084924101L) + "'", long21 == (-1570084924101L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-35999689L) + "'", long23 == (-35999689L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        int int12 = dateTimeZone1.getOffsetFromLocal(32L);
        boolean boolean13 = dateTimeZone1.isFixed();
        java.lang.String str15 = dateTimeZone1.getNameKey(136799948L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
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
        long long26 = dateTimeZone1.previousTransition((-3599802L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass28 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115799901L + "'", long14 == 115799901L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-3599802L) + "'", long26 == (-3599802L));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
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
        long long20 = dateTimeZone3.nextTransition((-1570084924099L));
        boolean boolean22 = dateTimeZone3.isStandardOffset((-1570084924167L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570084924099L) + "'", long20 == (-1570084924099L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        boolean boolean14 = dateTimeZone3.equals((java.lang.Object) (byte) 0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone3.getOffset(readableInstant15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone3.getName((-6720020L), locale19);
        boolean boolean21 = dateTimeZone3.isFixed();
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone3.getShortName((-10799899L), locale23);
        int int26 = dateTimeZone3.getOffsetFromLocal((-360000100L));
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        long long11 = dateTimeZone1.convertLocalToUTC(115799999L, false);
        java.lang.String str13 = dateTimeZone1.getShortName((-201L));
        int int15 = dateTimeZone1.getStandardOffset((-1570084924151L));
        long long17 = dateTimeZone1.convertUTCToLocal((-35999955L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-35999956L) + "'", long17 == (-35999956L));
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360060000, 360600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
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
        long long20 = dateTimeZone3.convertUTCToLocal(25199911L);
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
        java.lang.String str36 = dateTimeZone24.getID();
        java.lang.String str37 = dateTimeZone24.toString();
        java.util.TimeZone timeZone38 = dateTimeZone24.toTimeZone();
        java.lang.String str39 = dateTimeZone24.toString();
        org.joda.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = dateTimeZone24.isLocalDateTimeGap(localDateTime40);
        boolean boolean42 = dateTimeZone3.equals((java.lang.Object) localDateTime40);
        java.lang.String str43 = dateTimeZone3.getID();
        long long45 = dateTimeZone3.convertUTCToLocal(11399898L);
        java.util.TimeZone timeZone46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        java.lang.String str48 = dateTimeZone47.getID();
        long long50 = dateTimeZone47.previousTransition((-1L));
        long long54 = dateTimeZone47.convertLocalToUTC(25200000L, true, 100L);
        java.util.Locale locale56 = null;
        java.lang.String str57 = dateTimeZone47.getShortName((-1L), locale56);
        boolean boolean58 = dateTimeZone47.isFixed();
        java.lang.String str59 = dateTimeZone47.getID();
        java.lang.Object obj60 = dateTimeZone47.writeReplace();
        long long64 = dateTimeZone47.convertLocalToUTC((long) 36600000, true, (-47L));
        java.util.TimeZone timeZone65 = dateTimeZone47.toTimeZone();
        int int67 = dateTimeZone47.getStandardOffset((-1569969124102L));
        java.lang.String str69 = dateTimeZone47.getName(359999900L);
        long long73 = dateTimeZone47.convertLocalToUTC((-1569963004101L), false, 18000000L);
        java.util.TimeZone timeZone74 = dateTimeZone47.toTimeZone();
        long long76 = dateTimeZone3.getMillisKeepLocal(dateTimeZone47, 389279867L);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25199910L + "'", long20 == 25199910L);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-00:00:00.001" + "'", str35, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-00:00:00.001" + "'", str36, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-00:00:00.001" + "'", str37, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-00:00:00.001" + "'", str39, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-00:00:00.001" + "'", str43, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 11399897L + "'", long45 == 11399897L);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "-00:00:00.001" + "'", str48, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 25200001L + "'", long54 == 25200001L);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "-00:00:00.001" + "'", str57, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "-00:00:00.001" + "'", str59, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 36600001L + "'", long64 == 36600001L);
        org.junit.Assert.assertNotNull(timeZone65);
        org.junit.Assert.assertEquals(timeZone65.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "-00:00:00.001" + "'", str69, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-1569963004100L) + "'", long73 == (-1569963004100L));
        org.junit.Assert.assertNotNull(timeZone74);
        org.junit.Assert.assertEquals(timeZone74.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 389279867L + "'", long76 == 389279867L);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
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
        boolean boolean19 = dateTimeZone1.isStandardOffset((-6720049L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.lang.String str3 = dateTimeZone1.getName((-35999799L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str5 = dateTimeZone1.getID();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName(323999903L, locale7);
        long long10 = dateTimeZone1.previousTransition((-360059991L));
        int int12 = dateTimeZone1.getOffset((-25200101L));
        java.lang.String str14 = dateTimeZone1.getShortName((-1570329724201L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+100:00" + "'", str3, "+100:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+100:00" + "'", str5, "+100:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+100:00" + "'", str8, "+100:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-360059991L) + "'", long10 == (-360059991L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 360000000 + "'", int12 == 360000000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+100:00" + "'", str14, "+100:00");
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        java.lang.String str11 = dateTimeZone1.getShortName((-68L));
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        java.lang.String str15 = dateTimeZone13.getID();
        java.lang.String str16 = dateTimeZone13.getID();
        java.lang.String str17 = dateTimeZone13.toString();
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone13.getOffset(readableInstant18);
        long long21 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (-1570048924001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+100:00" + "'", str2, "+100:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+100:00" + "'", str9, "+100:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+100:00" + "'", str11, "+100:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+10:00" + "'", str15, "+10:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36000000 + "'", int19 == 36000000);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1569724924001L) + "'", long21 == (-1569724924001L));
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25199900L + "'", long18 == 25199900L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 36000000 + "'", int20 == 36000000);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
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
        boolean boolean15 = dateTimeZone1.isFixed();
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getShortName((-40199991L), locale17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:00" + "'", str18, "+10:00");
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((-35999948L), locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset((-75060000L));
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
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
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        long long29 = dateTimeZone27.nextTransition((long) (short) 100);
        java.lang.String str31 = dateTimeZone27.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = dateTimeZone27.isLocalDateTimeGap(localDateTime32);
        long long35 = dateTimeZone1.getMillisKeepLocal(dateTimeZone27, (-4079999L));
        java.lang.String str37 = dateTimeZone27.getShortName((-1570084924101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1570048923900L) + "'", long22 == (-1570048923900L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+10:00" + "'", str25, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-4079999L) + "'", long35 == (-4079999L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+10:00" + "'", str37, "+10:00");
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        long long4 = dateTimeZone1.adjustOffset((-35999699L), true);
        java.lang.Object obj5 = dateTimeZone1.writeReplace();
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.nextTransition((-1570084924202L));
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        long long11 = dateTimeZone1.nextTransition(197L);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, (-3600115L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-35999699L) + "'", long4 == (-35999699L));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1570084924202L) + "'", long8 == (-1570084924202L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 197L + "'", long11 == 197L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-43200115L) + "'", long14 == (-43200115L));
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
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
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forID("+01:00");
        boolean boolean16 = dateTimeZone3.equals((java.lang.Object) dateTimeZone15);
        int int18 = dateTimeZone15.getStandardOffset(359999900L);
        int int20 = dateTimeZone15.getOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3600000 + "'", int18 == 3600000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3600000 + "'", int20 == 3600000);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long5 = dateTimeZone1.convertLocalToUTC(25199999L, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        long long11 = dateTimeZone7.adjustOffset((long) (byte) 1, false);
        java.lang.String str13 = dateTimeZone7.getName(97L);
        java.lang.String str15 = dateTimeZone7.getNameKey(0L);
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-1570084924101L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone1.isLocalDateTimeGap(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25199999L + "'", long5 == 25199999L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570084924102L) + "'", long17 == (-1570084924102L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
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
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        long long17 = dateTimeZone1.previousTransition((-353399999L));
        long long19 = dateTimeZone1.nextTransition((-71459900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-353399999L) + "'", long17 == (-353399999L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-71459900L) + "'", long19 == (-71459900L));
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
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        java.lang.String str15 = dateTimeZone3.getID();
        boolean boolean17 = dateTimeZone3.isStandardOffset((long) (short) -1);
        int int19 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        int int23 = dateTimeZone21.getOffset(0L);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        long long29 = dateTimeZone25.getMillisKeepLocal(dateTimeZone27, (long) 'a');
        int int31 = dateTimeZone27.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone32 = dateTimeZone27.toTimeZone();
        java.util.TimeZone timeZone33 = dateTimeZone27.toTimeZone();
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone27.getName((long) (short) 10, locale35);
        java.lang.String str38 = dateTimeZone27.getName(0L);
        long long40 = dateTimeZone21.getMillisKeepLocal(dateTimeZone27, (long) (short) 1);
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        long long44 = dateTimeZone42.nextTransition((long) (short) 100);
        int int46 = dateTimeZone42.getOffsetFromLocal(100L);
        java.util.Locale locale48 = null;
        java.lang.String str49 = dateTimeZone42.getName((-99L), locale48);
        int int51 = dateTimeZone42.getStandardOffset(98L);
        boolean boolean52 = dateTimeZone21.equals((java.lang.Object) int51);
        long long54 = dateTimeZone3.getMillisKeepLocal(dateTimeZone21, 0L);
        org.joda.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = dateTimeZone21.isLocalDateTimeGap(localDateTime55);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 2L + "'", long40 == 2L);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 100L + "'", long44 == 100L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00" + "'", str49, "+00:00");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        int int6 = dateTimeZone1.getOffset((-48L));
        int int8 = dateTimeZone1.getOffsetFromLocal((-25200001L));
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str13 = dateTimeZone11.getNameKey((long) 115800000);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone11.getShortName((-1570084924001L), locale15);
        boolean boolean17 = dateTimeZone11.isFixed();
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone11.isLocalDateTimeGap(localDateTime18);
        boolean boolean20 = dateTimeZone11.isFixed();
        int int22 = dateTimeZone11.getOffset((long) 115800000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        long long25 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (-1570084924199L));
        long long28 = dateTimeZone1.adjustOffset((-39599897L), false);
        long long32 = dateTimeZone1.convertLocalToUTC((-35519999L), true, 25200012L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1570084924198L) + "'", long25 == (-1570084924198L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-39599897L) + "'", long28 == (-39599897L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-35519999L) + "'", long32 == (-35519999L));
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        long long11 = dateTimeZone1.adjustOffset((-35999979L), true);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str14 = dateTimeZone13.getID();
        long long16 = dateTimeZone13.previousTransition((-1L));
        long long20 = dateTimeZone13.convertLocalToUTC(25200000L, true, 100L);
        boolean boolean21 = dateTimeZone13.isFixed();
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) boolean21);
        long long24 = dateTimeZone1.previousTransition((long) ' ');
        java.util.TimeZone timeZone25 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-35999979L) + "'", long11 == (-35999979L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200001L + "'", long20 == 25200001L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
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
        java.lang.String str24 = dateTimeZone12.getName(35L);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone12.getName((-115799900L), locale26);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone12.getShortName((-28800000L), locale29);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 25199999L + "'", long17 == 25199999L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-25200003L) + "'", long21 == (-25200003L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.001" + "'", str27, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.001" + "'", str30, "+00:00:00.001");
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
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
        long long29 = dateTimeZone8.nextTransition(115800054L);
        long long31 = dateTimeZone8.convertUTCToLocal((long) 0);
        org.joda.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = dateTimeZone8.isLocalDateTimeGap(localDateTime32);
        java.lang.String str34 = dateTimeZone8.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 211L + "'", long23 == 211L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-168L) + "'", long25 == (-168L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 115800054L + "'", long29 == 115800054L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.100" + "'", str34, "+00:00:00.100");
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        int int10 = dateTimeZone1.getOffsetFromLocal(9L);
        boolean boolean12 = dateTimeZone1.isStandardOffset(183599801L);
        int int14 = dateTimeZone1.getOffset(36600032L);
        java.lang.String str15 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200001L + "'", long10 == 25200001L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 102L + "'", long12 == 102L);
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        int int14 = dateTimeZone3.getOffsetFromLocal((long) (byte) 1);
        long long16 = dateTimeZone3.previousTransition((-71999989L));
        java.util.TimeZone timeZone17 = dateTimeZone3.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-71999989L) + "'", long16 == (-71999989L));
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        boolean boolean12 = dateTimeZone1.isStandardOffset((-1570084924000L));
        int int14 = dateTimeZone1.getStandardOffset((-115199899L));
        long long16 = dateTimeZone1.convertUTCToLocal((-98L));
        long long18 = dateTimeZone1.previousTransition((-1570293124299L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-99L) + "'", long16 == (-99L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570293124299L) + "'", long18 == (-1570293124299L));
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
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
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 1);
        java.lang.String str58 = dateTimeZone56.getNameKey((-1570084924101L));
        java.lang.String str60 = dateTimeZone56.getNameKey((-115800000L));
        java.util.TimeZone timeZone61 = dateTimeZone56.toTimeZone();
        boolean boolean62 = dateTimeZone1.equals((java.lang.Object) timeZone61);
        java.lang.String str64 = dateTimeZone1.getShortName((-1570444924100L));
        long long66 = dateTimeZone1.previousTransition((-3599911L));
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
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "GMT+10:01");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "+01:52" + "'", str64, "+01:52");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-3599911L) + "'", long66 == (-3599911L));
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str3 = dateTimeZone1.getNameKey(79800100L);
        java.lang.String str4 = dateTimeZone1.toString();
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName((-90000101L), locale6);
        long long11 = dateTimeZone1.convertLocalToUTC(79200000L, false, 323999900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 79199999L + "'", long11 == 79199999L);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        int int4 = dateTimeZone0.getOffset(98L);
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        java.lang.String str7 = dateTimeZone0.getShortName((long) '4');
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone0.isLocalDateTimeGap(localDateTime8);
        boolean boolean10 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone12.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone12.getOffset(readableInstant15);
        java.lang.String str17 = dateTimeZone12.toString();
        int int19 = dateTimeZone12.getStandardOffset((-25200002L));
        java.util.TimeZone timeZone20 = dateTimeZone12.toTimeZone();
        long long23 = dateTimeZone12.adjustOffset((-25200003L), false);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone12.getOffset(readableInstant24);
        boolean boolean26 = dateTimeZone0.equals((java.lang.Object) int25);
        boolean boolean27 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-25200003L) + "'", long23 == (-25200003L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
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
        java.lang.String str14 = dateTimeZone1.toString();
        long long16 = dateTimeZone1.previousTransition((-152400000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-152400000L) + "'", long16 == (-152400000L));
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        java.lang.String str5 = dateTimeZone2.getID();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getShortName((-91L), locale7);
        long long11 = dateTimeZone2.convertLocalToUTC(35999900L, false);
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
        java.lang.String str28 = dateTimeZone15.toString();
        java.util.TimeZone timeZone29 = dateTimeZone15.toTimeZone();
        java.lang.String str30 = dateTimeZone15.toString();
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        long long34 = dateTimeZone32.nextTransition((long) (short) 100);
        int int36 = dateTimeZone32.getOffsetFromLocal(100L);
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone32.getName((-99L), locale38);
        long long41 = dateTimeZone15.getMillisKeepLocal(dateTimeZone32, 10L);
        boolean boolean43 = dateTimeZone32.isStandardOffset((-1570084924102L));
        int int45 = dateTimeZone32.getStandardOffset(0L);
        java.util.TimeZone timeZone46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        long long51 = dateTimeZone47.getMillisKeepLocal(dateTimeZone49, (long) 'a');
        int int53 = dateTimeZone49.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone54 = dateTimeZone49.toTimeZone();
        java.util.Locale locale56 = null;
        java.lang.String str57 = dateTimeZone49.getShortName((long) (byte) 100, locale56);
        java.util.Locale locale59 = null;
        java.lang.String str60 = dateTimeZone49.getShortName((long) (short) 0, locale59);
        java.lang.String str61 = dateTimeZone49.getID();
        java.lang.String str63 = dateTimeZone49.getNameKey(115799900L);
        boolean boolean65 = dateTimeZone49.isStandardOffset(110L);
        long long67 = dateTimeZone32.getMillisKeepLocal(dateTimeZone49, 0L);
        boolean boolean68 = dateTimeZone2.equals((java.lang.Object) long67);
        long long71 = dateTimeZone2.adjustOffset((-115800064L), false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:10" + "'", str5, "+32:10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:10" + "'", str8, "+32:10");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-79800100L) + "'", long11 == (-79800100L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-00:00:00.001" + "'", str26, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-00:00:00.001" + "'", str30, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-00:00:00.001" + "'", str39, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 97L + "'", long51 == 97L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "-00:00:00.001" + "'", str57, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "-00:00:00.001" + "'", str60, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "-00:00:00.001" + "'", str61, "-00:00:00.001");
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-115800064L) + "'", long71 == (-115800064L));
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, 187260000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187260000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.getID();
        long long3 = dateTimeZone0.previousTransition(32L);
        java.lang.String str5 = dateTimeZone0.getNameKey((-6720045L));
        java.lang.String str7 = dateTimeZone0.getNameKey((-54479901L));
        int int9 = dateTimeZone0.getOffset((-1570048923998L));
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone0.isLocalDateTimeGap(localDateTime10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName(0L, locale13);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-00:00:00.001" + "'", str1, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((-1570200124201L), locale13);
        long long16 = dateTimeZone3.nextTransition((-1570012324201L));
        long long18 = dateTimeZone3.nextTransition((-1570325524101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570012324201L) + "'", long16 == (-1570012324201L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570325524101L) + "'", long18 == (-1570325524101L));
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forID("+10:00");
        java.lang.String str6 = dateTimeZone5.getID();
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) dateTimeZone5);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone5.getOffset(readableInstant8);
        java.lang.String str10 = dateTimeZone5.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+01:00" + "'", str3, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36000000 + "'", int9 == 36000000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:00" + "'", str10, "+10:00");
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
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
        java.lang.String str19 = dateTimeZone3.getName((-52L));
        java.lang.String str21 = dateTimeZone3.getShortName((long) 349200000);
        java.lang.String str23 = dateTimeZone3.getShortName((-99L));
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570444924102L) + "'", long17 == (-1570444924102L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.lang.Object obj2 = null;
        boolean boolean3 = dateTimeZone1.equals(obj2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        long long7 = dateTimeZone1.convertUTCToLocal((-268L));
        java.lang.String str9 = dateTimeZone1.getNameKey((-25200000L));
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(3599999L, locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-267L) + "'", long7 == (-267L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        java.lang.String str10 = dateTimeZone1.getNameKey((-167L));
        java.lang.String str11 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.previousTransition((-36000200L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean16 = dateTimeZone1.isStandardOffset((-1570052523902L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-36000200L) + "'", long13 == (-36000200L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        long long11 = dateTimeZone1.adjustOffset((-35999979L), true);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str14 = dateTimeZone13.getID();
        long long16 = dateTimeZone13.previousTransition((-1L));
        long long20 = dateTimeZone13.convertLocalToUTC(25200000L, true, 100L);
        boolean boolean21 = dateTimeZone13.isFixed();
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) boolean21);
        java.lang.String str24 = dateTimeZone1.getShortName(11400000L);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone1.getName((-1570197124098L), locale26);
        java.lang.Class<?> wildcardClass28 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-35999979L) + "'", long11 == (-35999979L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200001L + "'", long20 == 25200001L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
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
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forID("+10:10");
        long long29 = dateTimeZone3.getMillisKeepLocal(dateTimeZone27, (-115799900L));
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        long long35 = dateTimeZone31.getMillisKeepLocal(dateTimeZone33, (long) 'a');
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone31.getName((long) (short) 1, locale37);
        long long41 = dateTimeZone31.convertLocalToUTC((-1570084924101L), true);
        boolean boolean43 = dateTimeZone31.isStandardOffset(0L);
        long long45 = dateTimeZone3.getMillisKeepLocal(dateTimeZone31, 389279900L);
        long long47 = dateTimeZone31.convertUTCToLocal(35999833L);
        boolean boolean48 = dateTimeZone31.isFixed();
        java.lang.String str50 = dateTimeZone31.getName((-360000069L));
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-152399901L) + "'", long29 == (-152399901L));
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 97L + "'", long35 == 97L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-00:00:00.001" + "'", str38, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1570084924100L) + "'", long41 == (-1570084924100L));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 389279900L + "'", long45 == 389279900L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 35999832L + "'", long47 == 35999832L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "-00:00:00.001" + "'", str50, "-00:00:00.001");
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        int int6 = dateTimeZone1.getOffset((long) 115800000);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone8.getName((long) (short) 1, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.lang.String str17 = dateTimeZone8.getID();
        long long19 = dateTimeZone8.previousTransition((-10800000L));
        boolean boolean20 = dateTimeZone1.equals((java.lang.Object) long19);
        long long23 = dateTimeZone1.convertLocalToUTC(52L, true);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone1.getOffset(readableInstant24);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-10800000L) + "'", long19 == (-10800000L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-48L) + "'", long23 == (-48L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 1);
        java.lang.String str4 = dateTimeZone2.getNameKey((-1570084924101L));
        java.lang.String str6 = dateTimeZone2.getShortName((-1570048924101L));
        java.util.TimeZone timeZone7 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long11 = dateTimeZone9.previousTransition((-1570052523900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:01" + "'", str6, "+10:01");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+10:01");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570052523900L) + "'", long11 == (-1570052523900L));
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
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
        int int53 = dateTimeZone35.getStandardOffset((long) (short) 10);
        long long55 = dateTimeZone35.convertUTCToLocal((-61200000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 53L + "'", long15 == 53L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
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
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 35999998L + "'", long51 == 35999998L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-61199999L) + "'", long55 == (-61199999L));
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-3600000));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(0L, locale3);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        java.lang.String str6 = dateTimeZone1.toString();
        int int8 = dateTimeZone1.getOffset((-36599790L));
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT-01:00");
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 0);
        java.lang.String str3 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+01:00" + "'", str3, "+01:00");
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 1);
        java.lang.String str4 = dateTimeZone2.getShortName((long) (byte) 10);
        long long6 = dateTimeZone2.convertUTCToLocal((-35999899L));
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str9 = dateTimeZone8.getID();
        long long11 = dateTimeZone8.previousTransition((-1L));
        boolean boolean13 = dateTimeZone8.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone8.getName((long) (short) 0, locale15);
        long long18 = dateTimeZone8.nextTransition((long) ' ');
        long long22 = dateTimeZone8.convertLocalToUTC((long) '4', false, 115799900L);
        long long26 = dateTimeZone8.convertLocalToUTC((long) (short) -1, false, 36000000L);
        java.lang.String str27 = dateTimeZone8.toString();
        int int29 = dateTimeZone8.getOffsetFromLocal((long) 100);
        long long31 = dateTimeZone8.previousTransition(1L);
        java.lang.String str33 = dateTimeZone8.getName(135L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        long long36 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, (-52L));
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        long long42 = dateTimeZone38.getMillisKeepLocal(dateTimeZone40, (long) 'a');
        int int44 = dateTimeZone40.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone45 = dateTimeZone40.toTimeZone();
        java.util.TimeZone timeZone46 = dateTimeZone40.toTimeZone();
        java.util.Locale locale48 = null;
        java.lang.String str49 = dateTimeZone40.getName((long) (short) 10, locale48);
        int int51 = dateTimeZone40.getOffsetFromLocal((long) (byte) 1);
        long long53 = dateTimeZone40.convertUTCToLocal((-99L));
        java.util.TimeZone timeZone54 = dateTimeZone40.toTimeZone();
        long long57 = dateTimeZone40.adjustOffset(25199899L, false);
        long long59 = dateTimeZone40.nextTransition((-35999948L));
        java.util.TimeZone timeZone60 = null;
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forTimeZone(timeZone60);
        java.lang.String str62 = dateTimeZone61.toString();
        long long64 = dateTimeZone40.getMillisKeepLocal(dateTimeZone61, 349800000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        java.util.TimeZone timeZone66 = null;
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forTimeZone(timeZone66);
        java.util.TimeZone timeZone68 = null;
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forTimeZone(timeZone68);
        long long71 = dateTimeZone67.getMillisKeepLocal(dateTimeZone69, (long) 'a');
        java.util.Locale locale73 = null;
        java.lang.String str74 = dateTimeZone67.getName((long) (short) 1, locale73);
        boolean boolean76 = dateTimeZone67.equals((java.lang.Object) false);
        java.util.Locale locale78 = null;
        java.lang.String str79 = dateTimeZone67.getName((long) 100, locale78);
        long long81 = dateTimeZone67.convertUTCToLocal((-1570084924101L));
        int int83 = dateTimeZone67.getOffsetFromLocal((-1570084924001L));
        int int85 = dateTimeZone67.getOffsetFromLocal(25200001L);
        java.lang.String str86 = dateTimeZone67.getID();
        long long88 = dateTimeZone67.nextTransition((-91L));
        java.util.Locale locale90 = null;
        java.lang.String str91 = dateTimeZone67.getShortName((-39599798L), locale90);
        long long93 = dateTimeZone40.getMillisKeepLocal(dateTimeZone67, 3600000L);
        java.lang.Object obj94 = dateTimeZone67.writeReplace();
        boolean boolean95 = dateTimeZone2.equals((java.lang.Object) dateTimeZone67);
        long long97 = dateTimeZone67.previousTransition(36000210L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:01" + "'", str4, "+52:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 151260101L + "'", long6 == 151260101L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 53L + "'", long22 == 53L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-00:00:00.001" + "'", str33, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 187259949L + "'", long36 == 187259949L);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 97L + "'", long42 == 97L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "-00:00:00.001" + "'", str49, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-100L) + "'", long53 == (-100L));
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 25199899L + "'", long57 == 25199899L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-35999948L) + "'", long59 == (-35999948L));
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "-00:00:00.001" + "'", str62, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 349800000L + "'", long64 == 349800000L);
        org.junit.Assert.assertNotNull(dateTimeZone67);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 97L + "'", long71 == 97L);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "-00:00:00.001" + "'", str74, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "-00:00:00.001" + "'", str79, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1570084924102L) + "'", long81 == (-1570084924102L));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "-00:00:00.001" + "'", str86, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + (-91L) + "'", long88 == (-91L));
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "-00:00:00.001" + "'", str91, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 3600000L + "'", long93 == 3600000L);
        org.junit.Assert.assertNotNull(obj94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 36000210L + "'", long97 == 36000210L);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        int int6 = dateTimeZone1.getOffset((long) 115800000);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone8.getName((long) (short) 1, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.lang.String str17 = dateTimeZone8.getID();
        long long19 = dateTimeZone8.previousTransition((-10800000L));
        boolean boolean20 = dateTimeZone1.equals((java.lang.Object) long19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        long long26 = dateTimeZone22.getMillisKeepLocal(dateTimeZone24, (long) 'a');
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone22.getName((long) (short) 1, locale28);
        java.lang.String str31 = dateTimeZone22.getName((long) '#');
        java.lang.String str32 = dateTimeZone22.getID();
        long long34 = dateTimeZone1.getMillisKeepLocal(dateTimeZone22, 112L);
        long long36 = dateTimeZone22.previousTransition((-223199801L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-10800000L) + "'", long19 == (-10800000L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-00:00:00.001" + "'", str29, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-00:00:00.001" + "'", str31, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 213L + "'", long34 == 213L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-223199801L) + "'", long36 == (-223199801L));
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.util.TimeZone timeZone16 = dateTimeZone3.toTimeZone();
        long long18 = dateTimeZone3.convertUTCToLocal((-3600001L));
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        int int23 = dateTimeZone20.getStandardOffset(0L);
        boolean boolean24 = dateTimeZone20.isFixed();
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone20.getOffset(readableInstant25);
        long long28 = dateTimeZone3.getMillisKeepLocal(dateTimeZone20, 359999800L);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        java.lang.String str33 = dateTimeZone32.getID();
        long long35 = dateTimeZone32.previousTransition((-1L));
        long long39 = dateTimeZone32.convertLocalToUTC(25200000L, true, 100L);
        long long41 = dateTimeZone30.getMillisKeepLocal(dateTimeZone32, 100L);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        long long45 = dateTimeZone30.getMillisKeepLocal(dateTimeZone43, 97L);
        long long47 = dateTimeZone43.previousTransition(25199900L);
        java.lang.String str49 = dateTimeZone43.getShortName((long) (byte) 10);
        long long53 = dateTimeZone43.convertLocalToUTC((-71460000L), false, (-353400000L));
        long long55 = dateTimeZone20.getMillisKeepLocal(dateTimeZone43, (-25200049L));
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
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3600002L) + "'", long18 == (-3600002L));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 359999798L + "'", long28 == 359999798L);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-00:00:00.001" + "'", str33, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 25200001L + "'", long39 == 25200001L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 102L + "'", long41 == 102L);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-3599902L) + "'", long45 == (-3599902L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 25199900L + "'", long47 == 25199900L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+01:00" + "'", str49, "+01:00");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-75060000L) + "'", long53 == (-75060000L));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-28800048L) + "'", long55 == (-28800048L));
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(111L, false, 25199999L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName(187199899L, locale14);
        long long17 = dateTimeZone1.convertUTCToLocal(115800000L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getShortName((-1570200123900L), locale19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 112L + "'", long12 == 112L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 115799999L + "'", long17 == 115799999L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        java.lang.String str4 = dateTimeZone2.getShortName((long) '#');
        java.lang.String str6 = dateTimeZone2.getShortName((-1569969124002L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+01:00" + "'", str6, "+01:00");
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
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
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone13.getName(29280001L, locale40);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-00:00:00.001" + "'", str34, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-35999990L) + "'", long38 == (-35999990L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-00:00:00.001" + "'", str41, "-00:00:00.001");
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        int int8 = dateTimeZone1.getOffsetFromLocal((long) 25200000);
        long long12 = dateTimeZone1.convertLocalToUTC(9L, true, (-67L));
        java.lang.String str14 = dateTimeZone1.getNameKey((-71999989L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(126000000, 115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        int int4 = dateTimeZone0.getOffset(98L);
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        java.lang.String str7 = dateTimeZone0.getShortName((long) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone0.getOffset(readableInstant9);
        java.lang.String str11 = dateTimeZone0.getID();
        int int13 = dateTimeZone0.getOffsetFromLocal(32999999L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
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
        java.lang.String str24 = dateTimeZone1.getName((-35999990L), locale23);
        java.lang.Object obj25 = dateTimeZone1.writeReplace();
        long long27 = dateTimeZone1.convertUTCToLocal(36000200L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 36000200L + "'", long27 == 36000200L);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        long long12 = dateTimeZone1.previousTransition((-360600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25200000L + "'", long8 == 25200000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360600000L) + "'", long12 == (-360600000L));
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long3 = dateTimeZone1.nextTransition((long) 36000000);
        java.lang.Object obj4 = dateTimeZone1.writeReplace();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        long long9 = dateTimeZone1.adjustOffset((-1570048923899L), true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long12 = dateTimeZone1.previousTransition((-1570012924000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 36000000L + "'", long3 == 36000000L);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1570048923899L) + "'", long9 == (-1570048923899L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570012924000L) + "'", long12 == (-1570012924000L));
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-00:00:00.001");
        long long3 = dateTimeZone1.convertUTCToLocal((-10800099L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long7 = dateTimeZone1.adjustOffset((-25200003L), false);
        boolean boolean8 = dateTimeZone1.isFixed();
        java.lang.String str9 = dateTimeZone1.getID();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((-1570048923948L), locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10800100L) + "'", long3 == (-10800100L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-25200003L) + "'", long7 == (-25200003L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
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
        int int28 = dateTimeZone23.getOffsetFromLocal((-98L));
        boolean boolean30 = dateTimeZone23.isStandardOffset(3L);
        java.util.TimeZone timeZone31 = dateTimeZone23.toTimeZone();
        java.lang.Object obj32 = dateTimeZone23.writeReplace();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
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
        java.lang.String str24 = dateTimeZone8.getNameKey((-35999979L));
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forID("-00:00:00.001");
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone26.getName((-1569724924201L), locale28);
        long long31 = dateTimeZone8.getMillisKeepLocal(dateTimeZone26, (-61199902L));
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone26.getShortName((-167L), locale33);
        long long36 = dateTimeZone26.previousTransition((-1570008723896L));
        java.lang.String str37 = dateTimeZone26.getID();
        int int39 = dateTimeZone26.getOffset((-359999948L));
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
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-00:00:00.001" + "'", str29, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-61199801L) + "'", long31 == (-61199801L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-00:00:00.001" + "'", str34, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1570008723896L) + "'", long36 == (-1570008723896L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-00:00:00.001" + "'", str37, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(35);
        long long4 = dateTimeZone1.convertLocalToUTC(183599801L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 57599801L + "'", long4 == 57599801L);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        long long7 = dateTimeZone1.previousTransition((long) (short) 10);
        java.lang.String str9 = dateTimeZone1.getNameKey((-53520098L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
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
        org.joda.time.ReadableInstant readableInstant70 = null;
        int int71 = dateTimeZone21.getOffset(readableInstant70);
        java.lang.String str72 = dateTimeZone21.getID();
        java.lang.String str74 = dateTimeZone21.getName((-57L));
        long long76 = dateTimeZone21.convertUTCToLocal(195L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924001L) + "'", long15 == (-1570084924001L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 25199900L + "'", long30 == 25199900L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
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
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1569969124002L) + "'", long69 == (-1569969124002L));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "+00:00:00.001" + "'", str72, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "+00:00:00.001" + "'", str74, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 196L + "'", long76 == 196L);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-3600000));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(0L, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone3.getName((long) '#', locale14);
        long long19 = dateTimeZone3.convertLocalToUTC((-35999799L), true, (-36000299L));
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone3.getShortName((-359999790L), locale21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int26 = dateTimeZone24.getOffset(111L);
        long long29 = dateTimeZone24.adjustOffset((long) 349800000, true);
        int int31 = dateTimeZone24.getOffsetFromLocal(135L);
        long long33 = dateTimeZone3.getMillisKeepLocal(dateTimeZone24, (-116L));
        boolean boolean34 = dateTimeZone3.isFixed();
        long long36 = dateTimeZone3.convertUTCToLocal((-215L));
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone3.getShortName((-360600101L), locale38);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 349800000L + "'", long29 == 349800000L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-16L) + "'", long33 == (-16L));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-115L) + "'", long36 == (-115L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.100" + "'", str39, "+00:00:00.100");
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
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
        java.lang.String str18 = dateTimeZone8.getShortName((-1570084924101L));
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone8.isLocalDateTimeGap(localDateTime19);
        java.lang.String str21 = dateTimeZone8.getID();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
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
        int int12 = dateTimeZone1.getOffset((long) '#');
        long long14 = dateTimeZone1.previousTransition((-39599799L));
        long long17 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true);
        java.lang.String str18 = dateTimeZone1.getID();
        java.util.TimeZone timeZone19 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-39599799L) + "'", long14 == (-39599799L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-101L) + "'", long17 == (-101L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        int int13 = dateTimeZone3.getOffset((-1570048924001L));
        int int15 = dateTimeZone3.getOffset(10L);
        java.lang.String str17 = dateTimeZone3.getName((-1570052523800L));
        long long19 = dateTimeZone3.convertUTCToLocal(110L);
        java.lang.String str21 = dateTimeZone3.getName((-302400099L));
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 210L + "'", long19 == 210L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 100);
        boolean boolean2 = dateTimeZone1.isFixed();
        long long4 = dateTimeZone1.convertUTCToLocal((-1570084924200L));
        java.lang.String str6 = dateTimeZone1.getName((-72059797L));
        int int8 = dateTimeZone1.getStandardOffset((-1569724324101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924100L) + "'", long4 == (-1570084924100L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long8 = dateTimeZone1.previousTransition(115800000L);
        long long12 = dateTimeZone1.convertLocalToUTC(97L, true, (-35999903L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((long) '#', locale14);
        long long18 = dateTimeZone1.adjustOffset((-71999989L), false);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone1.isLocalDateTimeGap(localDateTime19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone1.getOffset(readableInstant21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115800000L + "'", long8 == 115800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-71999989L) + "'", long18 == (-71999989L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
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
        int int21 = dateTimeZone1.getStandardOffset(0L);
        long long23 = dateTimeZone1.nextTransition((-1569897124001L));
        java.lang.Class<?> wildcardClass24 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-90L) + "'", long15 == (-90L));
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1569897124001L) + "'", long23 == (-1569897124001L));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str29 = dateTimeZone1.getShortName((-1570013463999L));
        java.util.TimeZone timeZone30 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.100" + "'", str29, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(111L, false, 25199999L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName(187199899L, locale14);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getName((-115799866L), locale17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone1.getOffset(readableInstant19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 112L + "'", long12 == 112L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Asia/Bangkok");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 10, locale3);
        java.lang.Class<?> wildcardClass5 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+07:00" + "'", str4, "+07:00");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
}
