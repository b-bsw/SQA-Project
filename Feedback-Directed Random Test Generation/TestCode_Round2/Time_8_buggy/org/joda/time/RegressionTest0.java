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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
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
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("ICT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'ICT' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Bangkok" + "'", str2, "Asia/Bangkok");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass7 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25200000 + "'", int5 == 25200000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
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
        java.lang.Class<?> wildcardClass10 = timeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 25200000 + "'", int7 == 25200000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
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
        org.joda.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dateTimeZone3.isLocalDateTimeGap(localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 25200000 + "'", int7 == 25200000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+07:00" + "'", str11, "+07:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+07:00" + "'", str14, "+07:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Asia/Bangkok" + "'", str15, "Asia/Bangkok");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
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
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.Class<?> wildcardClass3 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Bangkok" + "'", str2, "Asia/Bangkok");
        org.junit.Assert.assertNotNull(wildcardClass3);
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
        java.lang.String str8 = dateTimeZone3.getShortName((-25199990L), locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+07:00" + "'", str8, "+07:00");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone3.getShortName(0L, locale9);
        java.lang.Class<?> wildcardClass11 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 25200000 + "'", int7 == 25200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+07:00" + "'", str10, "+07:00");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
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
        org.joda.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = dateTimeZone9.isLocalDateTimeGap(localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Bangkok" + "'", str2, "Asia/Bangkok");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924001L) + "'", long4 == (-1570084924001L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-25199990L) + "'", long7 == (-25199990L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Asia/Bangkok" + "'", str10, "Asia/Bangkok");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25200000 + "'", int12 == 25200000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-50399948L) + "'", long18 == (-50399948L));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.lang.String str3 = dateTimeZone1.getName(25200010L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.052" + "'", str3, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 25200000");
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
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long3 = dateTimeZone1.previousTransition((long) (short) 100);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass5 = timeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        java.lang.Object obj5 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName(100L, locale7);
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "1) test0031(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky "1) test0031(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
// flaky "2) test0032(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.toString();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((long) (byte) -1, locale9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "3) test0038(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "2) test0038(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
// flaky "1) test0038(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
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
        boolean boolean28 = dateTimeZone3.isStandardOffset((long) (byte) 0);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone3.getName(32L, locale30);
        java.util.TimeZone timeZone32 = dateTimeZone3.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
// flaky "4) test0039(org.joda.time.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "3) test0039(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "2) test0039(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "1) test0039(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "1) test0039(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky "1) test0039(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "1) test0039(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone24);
// flaky "1) test0039(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky "1) test0039(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-00:00:00.001" + "'", str31, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone32);
// flaky "1) test0039(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.lang.String str3 = dateTimeZone1.getName(25200010L);
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.052" + "'", str3, "+00:00:00.052");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str5 = dateTimeZone1.getShortName((long) (-1));
        int int7 = dateTimeZone1.getStandardOffset((long) (short) -1);
        int int9 = dateTimeZone1.getStandardOffset((long) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "5) test0042(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "4) test0042(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "3) test0042(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky "2) test0042(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        boolean boolean7 = dateTimeZone1.isStandardOffset((-25200000L));
        java.lang.String str8 = dateTimeZone1.toString();
        java.lang.String str10 = dateTimeZone1.getName((long) 25200000);
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "6) test0044(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "5) test0044(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) long10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(97L);
        int int10 = dateTimeZone1.getStandardOffset((long) (short) 100);
        long long14 = dateTimeZone1.convertLocalToUTC((-25199990L), true, (long) (short) -1);
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-25199989L) + "'", long14 == (-25199989L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
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
        java.lang.String str20 = dateTimeZone3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "7) test0048(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "6) test0048(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
// flaky "4) test0048(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
// flaky "3) test0048(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
// flaky "2) test0048(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
// flaky "2) test0048(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32400052L + "'", long16 == 32400052L);
// flaky "2) test0048(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-35999965L) + "'", long19 == (-35999965L));
// flaky "2) test0048(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+10:00" + "'", str20, "+10:00");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(97L);
        int int10 = dateTimeZone1.getStandardOffset((long) 'a');
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        long long4 = dateTimeZone1.convertUTCToLocal((long) (-1));
        java.lang.Class<?> wildcardClass5 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "8) test0050(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
// flaky "7) test0050(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35999999L + "'", long4 == 35999999L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        long long13 = dateTimeZone3.convertUTCToLocal((long) 100);
        java.lang.Object obj14 = dateTimeZone3.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "9) test0052(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "8) test0052(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
// flaky "5) test0052(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
// flaky "4) test0052(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 36000100L + "'", long13 == 36000100L);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        int int7 = dateTimeZone1.getOffset((long) (short) 100);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) (byte) 10);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "10) test0053(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky "9) test0053(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        long long8 = dateTimeZone1.convertLocalToUTC((long) '#', false, (-25200000L));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone12.nextTransition((long) (short) 100);
        java.lang.String str15 = dateTimeZone12.toString();
        long long17 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, 53L);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, (long) (byte) 1);
        java.lang.Class<?> wildcardClass20 = dateTimeZone12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 34L + "'", long8 == 34L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
// flaky "11) test0054(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
// flaky "10) test0054(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3600054L + "'", long17 == 3600054L);
// flaky "6) test0054(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3L + "'", long19 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
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
        boolean boolean16 = dateTimeZone3.isStandardOffset(2L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "12) test0056(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "11) test0056(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "7) test0056(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
// flaky "5) test0056(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
// flaky "3) test0056(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getStandardOffset(34L);
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "13) test0057(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
        long long20 = dateTimeZone3.convertLocalToUTC(32L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "14) test0059(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "12) test0059(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "8) test0059(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "6) test0059(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "4) test0059(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
// flaky "3) test0059(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
// flaky "3) test0059(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 33L + "'", long20 == 33L);
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getName((long) 10);
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
// flaky "15) test0060(org.joda.time.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "13) test0060(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "9) test0060(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone12);
// flaky "7) test0060(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        long long6 = dateTimeZone1.adjustOffset((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        int int10 = dateTimeZone1.getOffset((-25199899L));
        java.lang.String str12 = dateTimeZone1.getShortName((-25199899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "16) test0061(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky "14) test0061(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
// flaky "10) test0061(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getOffset((long) 100);
        long long11 = dateTimeZone1.convertLocalToUTC((-25199899L), false);
        long long13 = dateTimeZone1.nextTransition((-1570084924001L));
        java.lang.Class<?> wildcardClass14 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "17) test0062(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "15) test0062(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky "11) test0062(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-25199898L) + "'", long11 == (-25199898L));
// flaky "8) test0062(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570084924001L) + "'", long13 == (-1570084924001L));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean7 = dateTimeZone1.isStandardOffset((-25200000L));
        long long10 = dateTimeZone1.adjustOffset(100L, true);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getOffset(25200001L);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (-25199999L));
        long long17 = dateTimeZone1.previousTransition(3600054L);
        java.lang.Class<?> wildcardClass18 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky "18) test0063(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-25199999L) + "'", long15 == (-25199999L));
// flaky "16) test0063(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3600054L + "'", long17 == 3600054L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        int int3 = dateTimeZone1.getStandardOffset((-50399948L));
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(35, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long12 = dateTimeZone1.adjustOffset((long) (short) 10, true);
        long long15 = dateTimeZone1.adjustOffset((long) ' ', true);
        long long17 = dateTimeZone1.convertUTCToLocal((-1570084924001L));
        java.lang.Class<?> wildcardClass18 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "19) test0067(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
// flaky "17) test0067(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570084924002L) + "'", long17 == (-1570084924002L));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
        boolean boolean12 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = dateTimeZone0.getName(52L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(nameProvider1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        boolean boolean8 = dateTimeZone3.isFixed();
        java.lang.String str9 = dateTimeZone3.toString();
        int int11 = dateTimeZone3.getOffsetFromLocal((long) (byte) 1);
        int int13 = dateTimeZone3.getOffset((-32400000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "20) test0069(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky "18) test0069(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "12) test0069(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
// flaky "9) test0069(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
// flaky "5) test0069(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.toString();
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        long long10 = dateTimeZone1.nextTransition((-49L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "21) test0071(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "19) test0071(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-49L) + "'", long10 == (-49L));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long32 = dateTimeZone28.getMillisKeepLocal(dateTimeZone30, (long) 'a');
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone28.getName((long) (short) 1, locale34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        java.lang.String str38 = dateTimeZone28.getName((long) 10);
        boolean boolean39 = dateTimeZone18.equals((java.lang.Object) str38);
        java.lang.String str40 = dateTimeZone18.getID();
        java.util.Locale locale42 = null;
        java.lang.String str43 = dateTimeZone18.getName((long) (short) 1, locale42);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "22) test0072(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "20) test0072(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "13) test0072(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "10) test0072(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky "6) test0072(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "4) test0072(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone24);
// flaky "4) test0072(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
// flaky "3) test0072(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-00:00:00.001" + "'", str35, "-00:00:00.001");
// flaky "2) test0072(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-00:00:00.001" + "'", str38, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky "2) test0072(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-00:00:00.001" + "'", str40, "-00:00:00.001");
// flaky "1) test0072(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-00:00:00.001" + "'", str43, "-00:00:00.001");
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long12 = dateTimeZone1.adjustOffset((long) (short) 10, true);
        java.lang.Object obj13 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "23) test0073(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        java.lang.String str4 = dateTimeZone1.toString();
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((-50399947L), locale6);
        java.lang.String str9 = dateTimeZone1.getNameKey((-25199946L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "24) test0074(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:35" + "'", str4, "+01:35");
// flaky "21) test0074(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:35" + "'", str7, "+01:35");
// flaky "14) test0074(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone1.getOffsetFromLocal(53L);
        int int9 = dateTimeZone1.getOffset(0L);
        boolean boolean10 = dateTimeZone1.isFixed();
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "25) test0075(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
// flaky "22) test0075(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5700000 + "'", int9 == 5700000);
// flaky "15) test0075(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        boolean boolean37 = dateTimeZone1.isStandardOffset((-25199899L));
        int int39 = dateTimeZone1.getStandardOffset((long) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "26) test0076(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
// flaky "23) test0076(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:35" + "'", str11, "+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
// flaky "16) test0076(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5700000 + "'", int19 == 5700000);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky "11) test0076(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+01:35");
// flaky "7) test0076(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+01:35" + "'", str23, "+01:35");
// flaky "5) test0076(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+01:35" + "'", str24, "+01:35");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
// flaky "5) test0076(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
// flaky "4) test0076(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+01:35" + "'", str34, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
// flaky "3) test0076(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5700000 + "'", int39 == 5700000);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        int int16 = dateTimeZone14.getOffsetFromLocal(3600054L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "27) test0078(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
// flaky "24) test0078(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:35" + "'", str11, "+01:35");
        org.junit.Assert.assertNotNull(timeZone12);
// flaky "17) test0078(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertNotNull(timeZone13);
// flaky "12) test0078(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky "8) test0078(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5700000 + "'", int16 == 5700000);
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long12 = dateTimeZone1.adjustOffset((long) (short) 10, true);
        java.lang.Object obj13 = dateTimeZone1.writeReplace();
        int int15 = dateTimeZone1.getStandardOffset((long) (-1));
        int int17 = dateTimeZone1.getStandardOffset((-1570084924000L));
        long long19 = dateTimeZone1.nextTransition(25200010L);
        java.lang.Class<?> wildcardClass20 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "28) test0079(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(obj13);
// flaky "25) test0079(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5700000 + "'", int15 == 5700000);
// flaky "18) test0079(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5700000 + "'", int17 == 5700000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25200010L + "'", long19 == 25200010L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        long long6 = dateTimeZone1.nextTransition((-25199900L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 0);
        boolean boolean9 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199900L) + "'", long6 == (-25199900L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        java.lang.String str4 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        boolean boolean7 = dateTimeZone6.isFixed();
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) boolean7);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        java.util.TimeZone timeZone18 = dateTimeZone3.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((long) (byte) 0, locale14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
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
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        long long10 = dateTimeZone1.previousTransition((-1570084924000L));
        int int12 = dateTimeZone1.getOffsetFromLocal(52L);
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924000L) + "'", long10 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.nextTransition((long) ' ');
        long long10 = dateTimeZone1.nextTransition(3600001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600001L + "'", long10 == 3600001L);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        long long5 = dateTimeZone1.previousTransition(25200100L);
        java.lang.String str7 = dateTimeZone1.getName((long) '#');
        java.lang.String str9 = dateTimeZone1.getShortName(100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25200100L + "'", long5 == 25200100L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
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
        java.lang.Class<?> wildcardClass32 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25199946L) + "'", long16 == (-25199946L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 36000000L + "'", long18 == 36000000L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-49L) + "'", long28 == (-49L));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 25200001L + "'", long31 == 25200001L);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        long long10 = dateTimeZone1.previousTransition((-1570084924000L));
        int int12 = dateTimeZone1.getOffsetFromLocal(52L);
        int int14 = dateTimeZone1.getOffsetFromLocal(52L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924000L) + "'", long10 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        int int3 = dateTimeZone1.getStandardOffset((long) ' ');
        java.lang.String str4 = dateTimeZone1.toString();
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName(36000033L, locale6);
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(5700000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 5700000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        java.lang.String str10 = dateTimeZone1.getNameKey((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        java.lang.Object obj13 = dateTimeZone1.writeReplace();
        java.lang.String str14 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        long long10 = dateTimeZone1.convertLocalToUTC((-50399846L), true, (-32400000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-50399845L) + "'", long10 == (-50399845L));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
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
        java.util.TimeZone timeZone21 = dateTimeZone3.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200002L + "'", long20 == 25200002L);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        int int3 = dateTimeZone1.getOffsetFromLocal((-25199989L));
        boolean boolean5 = dateTimeZone1.isStandardOffset(36000010L);
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600000 + "'", int3 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
        java.lang.String str17 = dateTimeZone3.getShortName(25200001L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.lang.Class<?> wildcardClass19 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        java.lang.String str4 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        boolean boolean7 = dateTimeZone6.isFixed();
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) boolean7);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        boolean boolean11 = dateTimeZone1.isStandardOffset(0L);
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        long long8 = dateTimeZone1.convertLocalToUTC((long) '#', false, (-25200000L));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone12.nextTransition((long) (short) 100);
        java.lang.String str15 = dateTimeZone12.toString();
        long long17 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, 53L);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, (long) (byte) 1);
        java.lang.Class<?> wildcardClass20 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 34L + "'", long8 == 34L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3600054L + "'", long17 == 3600054L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3L + "'", long19 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(25200000);
        java.lang.String str2 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+07:00" + "'", str2, "+07:00");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        int int21 = dateTimeZone1.getStandardOffset((-56099848L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-25199899L) + "'", long14 == (-25199899L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((-25199990L));
        long long5 = dateTimeZone1.previousTransition((-3599948L));
        int int7 = dateTimeZone1.getStandardOffset(96L);
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-25199990L) + "'", long3 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3599948L) + "'", long5 == (-3599948L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        java.lang.String str8 = dateTimeZone1.getID();
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11L + "'", long7 == 11L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        java.lang.String str23 = dateTimeZone9.getNameKey((long) (short) 10);
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
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        long long12 = dateTimeZone1.adjustOffset((long) (short) 10, true);
        java.lang.Object obj13 = dateTimeZone1.writeReplace();
        int int15 = dateTimeZone1.getStandardOffset((long) (-1));
        int int17 = dateTimeZone1.getStandardOffset((-1570084924000L));
        long long21 = dateTimeZone1.convertLocalToUTC(0L, false, (long) 10);
        int int23 = dateTimeZone1.getStandardOffset((long) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        long long6 = dateTimeZone1.nextTransition((long) (byte) 100);
        java.lang.String str8 = dateTimeZone1.getName((-25199900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(5700036L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(97L);
        long long11 = dateTimeZone1.adjustOffset((long) (byte) 100, true);
        int int13 = dateTimeZone1.getOffset((long) 1);
        long long16 = dateTimeZone1.adjustOffset((-56099849L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-56099849L) + "'", long16 == (-56099849L));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.lang.Object obj9 = dateTimeZone3.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        long long12 = dateTimeZone3.getMillisKeepLocal(dateTimeZone10, (long) (short) 0);
        java.lang.Object obj13 = dateTimeZone3.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((-25199990L));
        long long5 = dateTimeZone1.previousTransition(52L);
        long long8 = dateTimeZone1.convertLocalToUTC(52L, false);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-25200000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-25199990L) + "'", long3 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3599948L) + "'", long8 == (-3599948L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int11 = dateTimeZone1.getOffsetFromLocal((long) 10);
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long32 = dateTimeZone28.getMillisKeepLocal(dateTimeZone30, (long) 'a');
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone28.getName((long) (short) 1, locale34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        java.lang.String str38 = dateTimeZone28.getName((long) 10);
        boolean boolean39 = dateTimeZone18.equals((java.lang.Object) str38);
        java.lang.String str40 = dateTimeZone18.getID();
        java.lang.String str41 = dateTimeZone18.getID();
        java.lang.String str42 = dateTimeZone18.getID();
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone18.getName(19500001L, locale44);
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
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-00:00:00.001" + "'", str35, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-00:00:00.001" + "'", str38, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-00:00:00.001" + "'", str40, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-00:00:00.001" + "'", str41, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-00:00:00.001" + "'", str42, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-00:00:00.001" + "'", str45, "-00:00:00.001");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        boolean boolean28 = dateTimeZone3.isStandardOffset((long) (byte) 0);
        java.lang.Class<?> wildcardClass29 = dateTimeZone3.getClass();
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
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.lang.String str6 = dateTimeZone5.getID();
        long long8 = dateTimeZone5.previousTransition((-1L));
        long long11 = dateTimeZone5.convertLocalToUTC((long) 10, true);
        java.lang.String str13 = dateTimeZone5.getName((-25200000L));
        java.lang.String str15 = dateTimeZone5.getNameKey((-50399948L));
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-50399948L));
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName(35999952L, locale19);
        java.lang.String str22 = dateTimeZone1.getNameKey(3L);
        long long26 = dateTimeZone1.convertLocalToUTC((long) (short) 10, false, 10800011L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 11L + "'", long11 == 11L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-50399847L) + "'", long17 == (-50399847L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-90L) + "'", long26 == (-90L));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        java.lang.String str12 = dateTimeZone3.getShortName(53L);
        java.util.TimeZone timeZone13 = dateTimeZone3.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 0);
        long long5 = dateTimeZone2.convertLocalToUTC((-56099849L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-56099849L) + "'", long5 == (-56099849L));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
        int int14 = dateTimeZone1.getStandardOffset(10L);
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
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
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        java.lang.String str12 = dateTimeZone3.getShortName(53L);
        java.lang.String str14 = dateTimeZone3.getNameKey(1L);
        boolean boolean15 = dateTimeZone3.isFixed();
        long long17 = dateTimeZone3.convertUTCToLocal((long) 'a');
        java.lang.String str19 = dateTimeZone3.getShortName((-5700000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "29) test0124(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "26) test0124(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "19) test0124(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "13) test0124(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
// flaky "9) test0124(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "6) test0124(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
// flaky "6) test0124(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        long long28 = dateTimeZone18.previousTransition((long) (byte) -1);
        long long30 = dateTimeZone18.previousTransition((long) ' ');
        java.lang.Class<?> wildcardClass31 = dateTimeZone18.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "30) test0125(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "27) test0125(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "20) test0125(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
// flaky "14) test0125(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky "10) test0125(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "7) test0125(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone24);
// flaky "7) test0125(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        java.lang.Class<?> wildcardClass7 = nameProvider4.getClass();
        boolean boolean8 = dateTimeZone3.equals((java.lang.Object) nameProvider4);
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (byte) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 5700000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long5 = dateTimeZone1.nextTransition((-50399948L));
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-35999948L), locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-50399948L) + "'", long5 == (-50399948L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) '4', locale8);
        java.lang.String str10 = dateTimeZone1.toString();
        long long13 = dateTimeZone1.convertLocalToUTC((long) '4', false);
        long long17 = dateTimeZone1.convertLocalToUTC((long) 25200000, false, (-1570060800001L));
        java.lang.String str19 = dateTimeZone1.getNameKey((long) 0);
        long long21 = dateTimeZone1.nextTransition((-50399847L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "31) test0129(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
// flaky "28) test0129(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
// flaky "21) test0129(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 51L + "'", long13 == 51L);
// flaky "15) test0129(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 25199999L + "'", long17 == 25199999L);
// flaky "11) test0129(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-50399847L) + "'", long21 == (-50399847L));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        boolean boolean20 = dateTimeZone1.isFixed();
        java.lang.Class<?> wildcardClass21 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "32) test0130(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(obj13);
// flaky "29) test0130(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
// flaky "22) test0130(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25200010L + "'", long19 == 25200010L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 3660000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        long long6 = dateTimeZone1.adjustOffset((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        int int10 = dateTimeZone1.getOffset((-25199899L));
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName(99L, locale12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "33) test0133(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36000000 + "'", int8 == 36000000);
// flaky "30) test0133(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
// flaky "23) test0133(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition(97L);
        long long6 = dateTimeZone1.convertUTCToLocal(32L);
        java.lang.String str7 = dateTimeZone1.getID();
        long long11 = dateTimeZone1.convertLocalToUTC(97L, false, (-50399847L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "34) test0134(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
// flaky "31) test0134(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 36000032L + "'", long6 == 36000032L);
// flaky "24) test0134(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+10:00" + "'", str7, "+10:00");
// flaky "16) test0134(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-35999903L) + "'", long11 == (-35999903L));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        long long4 = dateTimeZone1.convertUTCToLocal((long) (-1));
        java.lang.Object obj5 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "35) test0135(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
// flaky "32) test0135(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35999999L + "'", long4 == 35999999L);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        java.lang.String str16 = dateTimeZone3.getID();
        java.lang.Class<?> wildcardClass17 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "36) test0136(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "33) test0136(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
// flaky "25) test0136(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
// flaky "17) test0136(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
// flaky "12) test0136(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+10:00" + "'", str15, "+10:00");
// flaky "8) test0136(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        int int36 = dateTimeZone1.getOffsetFromLocal((long) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "37) test0137(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "34) test0137(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
// flaky "26) test0137(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(timeZone20);
// flaky "18) test0137(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
// flaky "13) test0137(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
// flaky "9) test0137(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
// flaky "8) test0137(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-00:00:00.001" + "'", str29, "-00:00:00.001");
// flaky "5) test0137(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-00:00:00.001" + "'", str30, "-00:00:00.001");
// flaky "4) test0137(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 5700036L + "'", long34 == 5700036L);
// flaky "3) test0137(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long7 = dateTimeZone1.convertLocalToUTC((-25200000L), true, (-3599948L));
        long long9 = dateTimeZone1.nextTransition(25200002L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        long long14 = dateTimeZone1.adjustOffset(34L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "38) test0138(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "35) test0138(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-25199999L) + "'", long7 == (-25199999L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 25200002L + "'", long9 == 25200002L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 34L + "'", long14 == 34L);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition(97L);
        java.lang.String str6 = dateTimeZone1.getName((long) 35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "39) test0140(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
// flaky "36) test0140(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        java.lang.Class<?> wildcardClass21 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "40) test0141(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "37) test0141(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "27) test0141(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
// flaky "19) test0141(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35999952L + "'", long18 == 35999952L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
        boolean boolean14 = dateTimeZone3.isStandardOffset(0L);
        java.lang.String str15 = dateTimeZone3.getID();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long20 = dateTimeZone17.convertLocalToUTC((-1570084924001L), false);
        int int22 = dateTimeZone17.getOffsetFromLocal((-1570084924000L));
        int int24 = dateTimeZone17.getOffset(97L);
        int int26 = dateTimeZone17.getStandardOffset((long) 'a');
        long long29 = dateTimeZone17.convertLocalToUTC((-50399948L), false);
        long long31 = dateTimeZone3.getMillisKeepLocal(dateTimeZone17, (-1570060800001L));
        java.lang.String str32 = dateTimeZone17.toString();
        java.lang.Class<?> wildcardClass33 = dateTimeZone17.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "41) test0142(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "38) test0142(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "28) test0142(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "20) test0142(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "14) test0142(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570084924000L) + "'", long20 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-50399947L) + "'", long29 == (-50399947L));
// flaky "10) test0142(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1570060800001L) + "'", long31 == (-1570060800001L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        long long33 = dateTimeZone1.previousTransition(101L);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone1.getShortName((-61199899L), locale35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "42) test0143(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "39) test0143(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
// flaky "29) test0143(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(timeZone20);
// flaky "21) test0143(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
// flaky "15) test0143(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
// flaky "11) test0143(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 11L + "'", long28 == 11L);
// flaky "9) test0143(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-00:00:00.001" + "'", str31, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 101L + "'", long33 == 101L);
// flaky "6) test0143(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-00:00:00.001" + "'", str36, "-00:00:00.001");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long3 = dateTimeZone1.previousTransition((long) (short) 100);
        long long5 = dateTimeZone1.convertUTCToLocal(32L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long10 = dateTimeZone7.convertLocalToUTC((-1570084924001L), false);
        long long12 = dateTimeZone7.nextTransition((-25199900L));
        java.lang.String str14 = dateTimeZone7.getShortName((long) (short) 0);
        int int16 = dateTimeZone7.getStandardOffset(25199999L);
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-50399847L));
        long long22 = dateTimeZone1.convertLocalToUTC((-35999965L), true, 25200002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924000L) + "'", long10 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-25199900L) + "'", long12 == (-25199900L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-50399846L) + "'", long18 == (-50399846L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-35999965L) + "'", long22 == (-35999965L));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        long long6 = dateTimeZone1.nextTransition((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 10L);
        java.lang.String str12 = dateTimeZone1.getName(2L);
        long long14 = dateTimeZone1.nextTransition(11L);
        long long16 = dateTimeZone1.nextTransition(11L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "43) test0145(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "40) test0145(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky "30) test0145(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9L + "'", long10 == 9L);
// flaky "22) test0145(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 11L + "'", long16 == 11L);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3660000);
        long long4 = dateTimeZone1.convertLocalToUTC(97L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3659903L) + "'", long4 == (-3659903L));
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(35, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((-25199947L), locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "44) test0148(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "41) test0148(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
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
        boolean boolean32 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "45) test0149(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
// flaky "42) test0149(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
// flaky "31) test0149(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25199946L) + "'", long16 == (-25199946L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 36000000L + "'", long18 == 36000000L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-49L) + "'", long28 == (-49L));
        org.junit.Assert.assertNotNull(obj29);
// flaky "23) test0149(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 25200001L + "'", long31 == 25200001L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        int int7 = dateTimeZone1.getOffset((long) (short) 100);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) (byte) 10);
        int int11 = dateTimeZone1.getOffset(32L);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "46) test0150(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky "43) test0150(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "32) test0150(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
// flaky "24) test0150(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        int int3 = dateTimeZone1.getOffsetFromLocal((-25199989L));
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600000 + "'", int3 == 3600000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        long long30 = dateTimeZone1.previousTransition((-49L));
        long long33 = dateTimeZone1.convertLocalToUTC((long) 36000000, true);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone1.getShortName(0L, locale35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "47) test0152(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "44) test0152(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
// flaky "33) test0152(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(timeZone20);
// flaky "25) test0152(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
// flaky "16) test0152(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
// flaky "12) test0152(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 11L + "'", long28 == 11L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-49L) + "'", long30 == (-49L));
// flaky "10) test0152(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 36000001L + "'", long33 == 36000001L);
// flaky "7) test0152(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-00:00:00.001" + "'", str36, "-00:00:00.001");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long3 = dateTimeZone1.previousTransition((long) (short) 100);
        java.lang.Object obj4 = dateTimeZone1.writeReplace();
        java.lang.String str5 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.getID();
        long long12 = dateTimeZone9.previousTransition((-1L));
        boolean boolean14 = dateTimeZone9.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        boolean boolean17 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky "48) test0154(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "45) test0154(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        boolean boolean14 = dateTimeZone3.isStandardOffset(0L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone3.getShortName((long) (short) 10, locale16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long21 = dateTimeZone3.getMillisKeepLocal(dateTimeZone19, (-50399948L));
        java.lang.Class<?> wildcardClass22 = dateTimeZone19.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "49) test0155(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "46) test0155(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "34) test0155(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "26) test0155(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "17) test0155(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone19);
// flaky "13) test0155(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-50399950L) + "'", long21 == (-50399950L));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        java.lang.String str20 = dateTimeZone1.toString();
        java.lang.String str22 = dateTimeZone1.getNameKey((long) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "50) test0156(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
// flaky "47) test0156(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924000L) + "'", long10 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-25199947L) + "'", long12 == (-25199947L));
// flaky "35) test0156(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
// flaky "27) test0156(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
// flaky "18) test0156(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
// flaky "14) test0156(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
// flaky "11) test0156(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        long long21 = dateTimeZone1.convertLocalToUTC((-1570084923999L), false, 53L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "51) test0158(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(obj13);
// flaky "48) test0158(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
// flaky "36) test0158(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
// flaky "28) test0158(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1570084924000L) + "'", long21 == (-1570084924000L));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 1);
        int int4 = dateTimeZone2.getOffset((-50399847L));
        java.lang.String str6 = dateTimeZone2.getName(99L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36060000 + "'", int4 == 36060000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:01" + "'", str6, "+10:01");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        boolean boolean15 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long19 = dateTimeZone1.adjustOffset((-30899900L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "52) test0160(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
// flaky "49) test0160(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-61199900L) + "'", long14 == (-61199900L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-30899900L) + "'", long19 == (-30899900L));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        boolean boolean8 = dateTimeZone3.isFixed();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getName((-1L), locale10);
        int int13 = dateTimeZone3.getOffsetFromLocal(0L);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone3.isLocalDateTimeGap(localDateTime14);
        long long18 = dateTimeZone3.convertLocalToUTC((-25199898L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-25199898L) + "'", long18 == (-25199898L));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(36000000);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        boolean boolean10 = dateTimeZone1.isFixed();
        long long14 = dateTimeZone1.convertLocalToUTC((-50399847L), false, (-50399846L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-50399847L) + "'", long14 == (-50399847L));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.getID();
        long long9 = dateTimeZone1.adjustOffset(10800011L, true);
        int int11 = dateTimeZone1.getStandardOffset((-25199948L));
        java.lang.String str12 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10800011L + "'", long9 == 10800011L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-25199900L) + "'", long14 == (-25199900L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((long) '4', true);
        int int6 = dateTimeZone1.getOffset((long) 1);
        int int8 = dateTimeZone1.getStandardOffset((long) 36060000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        long long16 = dateTimeZone3.convertUTCToLocal(37L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "53) test0168(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "50) test0168(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:35");
// flaky "37) test0168(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:35" + "'", str11, "+01:35");
// flaky "29) test0168(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:35" + "'", str14, "+01:35");
// flaky "19) test0168(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5700037L + "'", long16 == 5700037L);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        long long6 = dateTimeZone1.nextTransition((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 10L);
        java.lang.String str12 = dateTimeZone1.getName(2L);
        long long14 = dateTimeZone1.nextTransition(11L);
        java.lang.String str16 = dateTimeZone1.getShortName((-25199991L));
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone1.getName((long) 36000000, locale18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "54) test0169(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
// flaky "51) test0169(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5700000 + "'", int4 == 5700000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky "38) test0169(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5700010L + "'", long10 == 5700010L);
// flaky "30) test0169(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:35" + "'", str12, "+01:35");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
// flaky "20) test0169(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+01:35" + "'", str16, "+01:35");
// flaky "15) test0169(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+01:35" + "'", str19, "+01:35");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        long long24 = dateTimeZone20.getMillisKeepLocal(dateTimeZone22, (long) 'a');
        int int26 = dateTimeZone22.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone27 = dateTimeZone22.toTimeZone();
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone22.getShortName((long) (byte) 100, locale29);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone22.getShortName((long) (short) 0, locale32);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        long long39 = dateTimeZone35.getMillisKeepLocal(dateTimeZone37, (long) 'a');
        int int41 = dateTimeZone37.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone42 = dateTimeZone37.toTimeZone();
        java.util.TimeZone timeZone43 = dateTimeZone37.toTimeZone();
        long long45 = dateTimeZone22.getMillisKeepLocal(dateTimeZone37, (long) (short) 10);
        boolean boolean47 = dateTimeZone22.isStandardOffset((long) (byte) 0);
        long long49 = dateTimeZone10.getMillisKeepLocal(dateTimeZone22, 33L);
        java.lang.Class<?> wildcardClass50 = dateTimeZone22.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "55) test0170(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:35" + "'", str11, "+01:35");
// flaky "52) test0170(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:35" + "'", str14, "+01:35");
// flaky "39) test0170(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5700000 + "'", int16 == 5700000);
// flaky "31) test0170(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 30299951L + "'", long18 == 30299951L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
// flaky "21) test0170(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5700000 + "'", int26 == 5700000);
        org.junit.Assert.assertNotNull(timeZone27);
// flaky "16) test0170(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+01:35");
// flaky "12) test0170(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+01:35" + "'", str30, "+01:35");
// flaky "8) test0170(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+01:35" + "'", str33, "+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 97L + "'", long39 == 97L);
// flaky "5) test0170(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5700000 + "'", int41 == 5700000);
        org.junit.Assert.assertNotNull(timeZone42);
// flaky "4) test0170(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertNotNull(timeZone43);
// flaky "2) test0170(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 33L + "'", long49 == 33L);
        org.junit.Assert.assertNotNull(wildcardClass50);
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
        boolean boolean7 = dateTimeZone1.isFixed();
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "56) test0171(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5700000 + "'", int5 == 5700000);
// flaky "53) test0171(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+01:35" + "'", str6, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone1.getOffsetFromLocal(53L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((-25199898L), locale9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName((-50399846L), locale12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "57) test0172(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
// flaky "54) test0172(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:35" + "'", str10, "+01:35");
// flaky "40) test0172(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:35" + "'", str13, "+01:35");
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
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        java.lang.String str12 = dateTimeZone3.getShortName(53L);
        long long15 = dateTimeZone3.convertLocalToUTC((long) 25200000, false);
        long long18 = dateTimeZone3.adjustOffset((long) 100, false);
        long long20 = dateTimeZone3.previousTransition(53L);
        java.lang.String str21 = dateTimeZone3.getID();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(3600000);
        long long25 = dateTimeZone3.getMillisKeepLocal(dateTimeZone23, 0L);
        java.lang.String str26 = dateTimeZone3.toString();
        long long30 = dateTimeZone3.convertLocalToUTC(60000L, true, (-86399848L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "58) test0173(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "55) test0173(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:35");
// flaky "41) test0173(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5700000 + "'", int10 == 5700000);
// flaky "32) test0173(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:35" + "'", str12, "+01:35");
// flaky "22) test0173(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 19500000L + "'", long15 == 19500000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 53L + "'", long20 == 53L);
// flaky "17) test0173(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+01:35" + "'", str21, "+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone23);
// flaky "13) test0173(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 2100000L + "'", long25 == 2100000L);
// flaky "9) test0173(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+01:35" + "'", str26, "+01:35");
// flaky "6) test0173(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-5640000L) + "'", long30 == (-5640000L));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) 'a');
        long long7 = dateTimeZone1.convertLocalToUTC(10L, true, 25200010L);
        long long9 = dateTimeZone1.previousTransition((-97199947L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
// flaky "59) test0174(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5699990L) + "'", long7 == (-5699990L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97199947L) + "'", long9 == (-97199947L));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        long long17 = dateTimeZone1.convertUTCToLocal(5700033L);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        long long23 = dateTimeZone19.getMillisKeepLocal(dateTimeZone21, (long) 'a');
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone19.getName((long) (short) 1, locale25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        int int29 = dateTimeZone19.getOffsetFromLocal((long) 10);
        int int31 = dateTimeZone19.getOffset(36000101L);
        boolean boolean32 = dateTimeZone1.equals((java.lang.Object) 36000101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "60) test0175(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:35" + "'", str12, "+01:35");
// flaky "56) test0175(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30899900L) + "'", long14 == (-30899900L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5700033L + "'", long17 == 5700033L);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
// flaky "42) test0175(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+01:35" + "'", str26, "+01:35");
// flaky "33) test0175(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5700000 + "'", int29 == 5700000);
// flaky "23) test0175(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5700000 + "'", int31 == 5700000);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone3.getMillisKeepLocal(dateTimeZone5, (long) 'a');
        boolean boolean8 = dateTimeZone3.isFixed();
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 11L);
        long long14 = dateTimeZone1.convertLocalToUTC((-1570084924002L), true, (-5699989L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "61) test0176(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-5699989L) + "'", long10 == (-5699989L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1570084924002L) + "'", long14 == (-1570084924002L));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition(1L);
        java.lang.Class<?> wildcardClass5 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "62) test0177(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        java.lang.String str21 = dateTimeZone3.getNameKey((long) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "63) test0178(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "57) test0178(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "43) test0178(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "34) test0178(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "24) test0178(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
// flaky "18) test0178(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
// flaky "14) test0178(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
// flaky "10) test0178(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.lang.String str6 = dateTimeZone5.getID();
        long long8 = dateTimeZone5.previousTransition((-1L));
        long long11 = dateTimeZone5.convertLocalToUTC((long) 10, true);
        java.lang.String str13 = dateTimeZone5.getName((-25200000L));
        java.lang.String str15 = dateTimeZone5.getNameKey((-50399948L));
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-50399948L));
        java.lang.String str18 = dateTimeZone1.getID();
        long long20 = dateTimeZone1.convertUTCToLocal((long) (-1));
        java.util.TimeZone timeZone21 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky "64) test0179(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
// flaky "58) test0179(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 11L + "'", long11 == 11L);
// flaky "44) test0179(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
// flaky "35) test0179(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str15);
// flaky "25) test0179(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-50399847L) + "'", long17 == (-50399847L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 99L + "'", long20 == 99L);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
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
        int int42 = dateTimeZone1.getOffset(12L);
        long long46 = dateTimeZone1.convertLocalToUTC(5700010L, false, 31L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "65) test0180(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "59) test0180(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
// flaky "45) test0180(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(timeZone20);
// flaky "36) test0180(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
// flaky "26) test0180(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
// flaky "19) test0180(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
// flaky "15) test0180(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-00:00:00.001" + "'", str34, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
// flaky "11) test0180(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 3600001L + "'", long38 == 3600001L);
// flaky "7) test0180(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-00:00:00.001" + "'", str40, "-00:00:00.001");
// flaky "5) test0180(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
// flaky "3) test0180(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 5700011L + "'", long46 == 5700011L);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.convertUTCToLocal(33L);
        long long8 = dateTimeZone1.convertLocalToUTC((-66899947L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-66899946L) + "'", long8 == (-66899946L));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        java.lang.String str13 = dateTimeZone1.getName((-25199999L));
        long long16 = dateTimeZone1.convertLocalToUTC((-25199998L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "66) test0183(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
// flaky "60) test0183(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
// flaky "46) test0183(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25199997L) + "'", long16 == (-25199997L));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        int int16 = dateTimeZone9.getOffsetFromLocal(0L);
        java.lang.String str17 = dateTimeZone9.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "67) test0184(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "61) test0184(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11L + "'", long7 == 11L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky "47) test0184(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
// flaky "37) test0184(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky "27) test0184(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
// flaky "20) test0184(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getOffset((-25199899L));
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        int int9 = dateTimeZone1.getOffset((-50399848L));
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 1);
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) dateTimeZone7);
        long long11 = dateTimeZone7.adjustOffset(35999952L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35999952L + "'", long11 == 35999952L);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(3600000);
        long long25 = dateTimeZone3.getMillisKeepLocal(dateTimeZone23, 0L);
        java.lang.Class<?> wildcardClass26 = dateTimeZone23.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "68) test0188(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "62) test0188(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:35");
// flaky "48) test0188(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5700000 + "'", int10 == 5700000);
// flaky "38) test0188(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:35" + "'", str12, "+01:35");
// flaky "28) test0188(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 19500000L + "'", long15 == 19500000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 53L + "'", long20 == 53L);
// flaky "21) test0188(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+01:35" + "'", str21, "+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone23);
// flaky "16) test0188(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 2100000L + "'", long25 == 2100000L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 1);
        long long4 = dateTimeZone2.nextTransition(11L);
        int int6 = dateTimeZone2.getOffsetFromLocal((-50399848L));
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 1);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone9, (long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 11L + "'", long4 == 11L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3660000 + "'", int6 == 3660000);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        java.lang.String str34 = dateTimeZone3.toString();
        long long36 = dateTimeZone3.previousTransition(36L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "69) test0190(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "63) test0190(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:35");
// flaky "49) test0190(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5700000 + "'", int10 == 5700000);
// flaky "39) test0190(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:35" + "'", str12, "+01:35");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
// flaky "29) test0190(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2100052L + "'", long16 == 2100052L);
// flaky "22) test0190(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-5699965L) + "'", long19 == (-5699965L));
        org.junit.Assert.assertNotNull(dateTimeZone21);
// flaky "17) test0190(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+01:35" + "'", str22, "+01:35");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
// flaky "12) test0190(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-5699990L) + "'", long27 == (-5699990L));
// flaky "8) test0190(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5700000 + "'", int29 == 5700000);
// flaky "6) test0190(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5700000 + "'", int31 == 5700000);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 36000000L + "'", long33 == 36000000L);
// flaky "4) test0190(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+01:35" + "'", str34, "+01:35");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 36L + "'", long36 == 36L);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getOffset((long) 100);
        int int10 = dateTimeZone1.getOffsetFromLocal(3600054L);
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "70) test0191(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5700000 + "'", int8 == 5700000);
// flaky "64) test0191(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5700000 + "'", int10 == 5700000);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(6720000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        long long9 = dateTimeZone1.nextTransition(35L);
        java.lang.Object obj10 = null;
        boolean boolean11 = dateTimeZone1.equals(obj10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName((long) 5700000, locale13);
        boolean boolean16 = dateTimeZone1.isStandardOffset((-86399848L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "71) test0193(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "65) test0193(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5699990L) + "'", long7 == (-5699990L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "50) test0193(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:35" + "'", str14, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        java.lang.Object obj32 = dateTimeZone18.writeReplace();
        long long36 = dateTimeZone18.convertLocalToUTC((-3599949L), false, (-61199900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "72) test0194(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "66) test0194(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:35");
// flaky "51) test0194(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:35" + "'", str11, "+01:35");
// flaky "40) test0194(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:35" + "'", str14, "+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky "30) test0194(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5700000 + "'", int22 == 5700000);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "23) test0194(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+01:35");
// flaky "18) test0194(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5700000 + "'", int25 == 5700000);
// flaky "13) test0194(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+01:35" + "'", str27, "+01:35");
// flaky "9) test0194(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-61199947L) + "'", long31 == (-61199947L));
        org.junit.Assert.assertNotNull(obj32);
// flaky "7) test0194(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-9299949L) + "'", long36 == (-9299949L));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00");
        long long4 = dateTimeZone1.adjustOffset((-32400000L), false);
        boolean boolean5 = dateTimeZone1.isFixed();
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-32400000L) + "'", long4 == (-32400000L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str5 = dateTimeZone1.getShortName((long) (-1));
        long long9 = dateTimeZone1.convertLocalToUTC(0L, true, (-25199948L));
        long long11 = dateTimeZone1.previousTransition((long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "73) test0196(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
// flaky "67) test0196(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:35" + "'", str5, "+01:35");
// flaky "52) test0196(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-5700000L) + "'", long9 == (-5700000L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        org.joda.time.ReadableInstant readableInstant36 = null;
        int int37 = dateTimeZone1.getOffset(readableInstant36);
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        long long42 = dateTimeZone39.adjustOffset((long) 1, false);
        long long44 = dateTimeZone1.getMillisKeepLocal(dateTimeZone39, 33L);
        java.lang.Class<?> wildcardClass45 = dateTimeZone39.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "74) test0197(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
// flaky "68) test0197(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:35" + "'", str11, "+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
// flaky "53) test0197(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5700000 + "'", int19 == 5700000);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky "41) test0197(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+01:35");
// flaky "31) test0197(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+01:35" + "'", str23, "+01:35");
// flaky "24) test0197(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+01:35" + "'", str24, "+01:35");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
// flaky "19) test0197(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+01:35" + "'", str34, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
// flaky "14) test0197(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5700000 + "'", int37 == 5700000);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 33L + "'", long44 == 33L);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        boolean boolean18 = dateTimeZone1.equals((java.lang.Object) (-30899900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "75) test0199(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "69) test0199(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone12);
// flaky "54) test0199(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
// flaky "42) test0199(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        java.lang.String str9 = dateTimeZone1.getName((-25200000L));
        java.lang.String str11 = dateTimeZone1.getNameKey((-50399948L));
        int int13 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.Class<?> wildcardClass14 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "76) test0200(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "70) test0200(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11L + "'", long7 == 11L);
// flaky "55) test0200(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
// flaky "43) test0200(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str11);
// flaky "32) test0200(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 5700000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 5700000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, 6720000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long32 = dateTimeZone28.getMillisKeepLocal(dateTimeZone30, (long) 'a');
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone28.getName((long) (short) 1, locale34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        java.lang.String str38 = dateTimeZone28.getName((long) 10);
        boolean boolean39 = dateTimeZone18.equals((java.lang.Object) str38);
        long long41 = dateTimeZone18.convertUTCToLocal((long) ' ');
        org.joda.time.ReadableInstant readableInstant42 = null;
        int int43 = dateTimeZone18.getOffset(readableInstant42);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "77) test0203(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "71) test0203(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "56) test0203(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
// flaky "44) test0203(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky "33) test0203(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "25) test0203(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone24);
// flaky "20) test0203(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
// flaky "15) test0203(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.001" + "'", str35, "+00:00:00.001");
// flaky "10) test0203(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.001" + "'", str38, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky "8) test0203(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 33L + "'", long41 == 33L);
// flaky "5) test0203(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean7 = dateTimeZone1.isStandardOffset((-25200000L));
        java.lang.String str9 = dateTimeZone1.getName(97L);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "78) test0205(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        boolean boolean20 = dateTimeZone9.isFixed();
        int int22 = dateTimeZone9.getOffsetFromLocal((-35999966L));
        java.lang.String str24 = dateTimeZone9.getNameKey((-32399947L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "79) test0207(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "72) test0207(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky "57) test0207(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
// flaky "45) test0207(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky "34) test0207(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-25199949L) + "'", long18 == (-25199949L));
// flaky "26) test0207(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "21) test0207(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
// flaky "16) test0207(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        long long6 = dateTimeZone1.nextTransition((-25199900L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 0);
        int int10 = dateTimeZone1.getStandardOffset(25199999L);
        long long12 = dateTimeZone1.convertUTCToLocal((-35999965L));
        java.lang.String str13 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199900L) + "'", long6 == (-25199900L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-35999966L) + "'", long12 == (-35999966L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition(97L);
        int int6 = dateTimeZone1.getOffset((long) (byte) 0);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) '4');
        boolean boolean9 = dateTimeZone1.isFixed();
        java.lang.String str10 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "80) test0210(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
// flaky "73) test0210(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
// flaky "58) test0210(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "46) test0210(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str5 = dateTimeZone1.getShortName((long) (-1));
        long long9 = dateTimeZone1.convertLocalToUTC(0L, true, (-25199948L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "81) test0211(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
// flaky "74) test0211(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:35" + "'", str5, "+01:35");
// flaky "59) test0211(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-5700000L) + "'", long9 == (-5700000L));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        int int17 = dateTimeZone15.getStandardOffset(36000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "82) test0212(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
// flaky "75) test0212(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:35" + "'", str11, "+01:35");
        org.junit.Assert.assertNotNull(timeZone12);
// flaky "60) test0212(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertNotNull(timeZone13);
// flaky "47) test0212(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky "35) test0212(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5700000 + "'", int17 == 5700000);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((-3599948L), locale7);
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "83) test0213(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        long long16 = dateTimeZone1.nextTransition(25200001L);
        java.lang.String str17 = dateTimeZone1.toString();
        long long19 = dateTimeZone1.previousTransition(9L);
        boolean boolean21 = dateTimeZone1.isStandardOffset(32L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "84) test0214(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
// flaky "76) test0214(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-25199899L) + "'", long14 == (-25199899L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200001L + "'", long16 == 25200001L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9L + "'", long19 == 9L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        boolean boolean28 = dateTimeZone3.isStandardOffset((long) (byte) 0);
        long long30 = dateTimeZone3.nextTransition(10L);
        java.lang.Object obj31 = dateTimeZone3.writeReplace();
        java.lang.String str33 = dateTimeZone3.getShortName((long) (byte) 100);
        java.lang.String str34 = dateTimeZone3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "85) test0215(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "77) test0215(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "61) test0215(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "48) test0215(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky "36) test0215(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "27) test0215(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone24);
// flaky "22) test0215(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(obj31);
// flaky "17) test0215(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-00:00:00.001" + "'", str33, "-00:00:00.001");
// flaky "11) test0215(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-00:00:00.001" + "'", str34, "-00:00:00.001");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider1 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        java.lang.Class<?> wildcardClass4 = nameProvider1.getClass();
        boolean boolean5 = dateTimeZone0.equals((java.lang.Object) nameProvider1);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        java.lang.String str7 = dateTimeZone0.toString();
        org.joda.time.tz.Provider provider8 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider8);
        org.joda.time.DateTimeZone.setProvider(provider8);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) provider8);
        java.lang.String str13 = dateTimeZone0.getNameKey((long) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(nameProvider1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(provider8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
// flaky "86) test0217(org.joda.time.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "78) test0217(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "62) test0217(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "49) test0217(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "37) test0217(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "28) test0217(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky "23) test0217(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone21);
// flaky "18) test0217(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
        java.lang.String str17 = dateTimeZone3.getShortName(25200001L);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone3.isLocalDateTimeGap(localDateTime18);
        boolean boolean20 = dateTimeZone3.isFixed();
        java.lang.String str22 = dateTimeZone3.getShortName(36000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "87) test0218(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "79) test0218(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "63) test0218(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "50) test0218(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "38) test0218(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
// flaky "29) test0218(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "24) test0218(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        long long6 = dateTimeZone1.nextTransition((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 10L);
        long long12 = dateTimeZone1.previousTransition(25200100L);
        java.lang.String str14 = dateTimeZone1.getShortName((-25199999L));
        long long16 = dateTimeZone1.convertUTCToLocal((-50399947L));
        long long18 = dateTimeZone1.nextTransition((-41699903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 25200100L + "'", long12 == 25200100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-50399947L) + "'", long16 == (-50399947L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-41699903L) + "'", long18 == (-41699903L));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) ' ', locale3);
        java.lang.Class<?> wildcardClass5 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.getID();
        long long9 = dateTimeZone1.adjustOffset(10800011L, true);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((long) (byte) 10, locale11);
        int int14 = dateTimeZone1.getOffset(19500000L);
        java.lang.Class<?> wildcardClass15 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10800011L + "'", long9 == 10800011L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        long long5 = dateTimeZone1.convertLocalToUTC((-3599948L), true, (-25199989L));
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        long long9 = dateTimeZone1.convertLocalToUTC((-30899900L), true);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3599948L) + "'", long5 == (-3599948L));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-30899900L) + "'", long9 == (-30899900L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str5 = dateTimeZone1.getShortName((long) (-1));
        int int7 = dateTimeZone1.getStandardOffset((long) (short) -1);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) 25200000);
        long long13 = dateTimeZone1.convertLocalToUTC((-35999966L), true, (-61199899L));
        long long16 = dateTimeZone1.convertLocalToUTC((-25199999L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-35999966L) + "'", long13 == (-35999966L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25199999L) + "'", long16 == (-25199999L));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long7 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, (-25199948L));
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        int int10 = dateTimeZone1.getStandardOffset(36000032L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
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
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) '4', locale8);
        java.lang.String str10 = dateTimeZone1.toString();
        java.lang.String str12 = dateTimeZone1.getName((long) (byte) -1);
        int int14 = dateTimeZone1.getStandardOffset((long) (-1));
        long long17 = dateTimeZone1.convertLocalToUTC((long) 0, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(97L);
        int int10 = dateTimeZone1.getStandardOffset((long) 'a');
        long long13 = dateTimeZone1.convertLocalToUTC((-50399948L), false);
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-50399947L) + "'", long13 == (-50399947L));
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
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
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.toString();
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        boolean boolean9 = dateTimeZone1.isFixed();
        long long11 = dateTimeZone1.nextTransition(0L);
        java.lang.String str12 = dateTimeZone1.getID();
        int int14 = dateTimeZone1.getStandardOffset(10L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getShortName(5700011L, locale16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        long long3 = dateTimeZone1.nextTransition((long) 35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        boolean boolean28 = dateTimeZone3.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long32 = dateTimeZone3.getMillisKeepLocal(dateTimeZone30, 52L);
        org.joda.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = dateTimeZone30.isLocalDateTimeGap(localDateTime33);
        long long38 = dateTimeZone30.convertLocalToUTC(0L, false, 34L);
        java.lang.Class<?> wildcardClass39 = dateTimeZone30.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-48L) + "'", long32 == (-48L));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-100L) + "'", long38 == (-100L));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.lang.String str6 = dateTimeZone5.getID();
        long long8 = dateTimeZone5.previousTransition((-1L));
        long long11 = dateTimeZone5.convertLocalToUTC((long) 10, true);
        java.lang.String str13 = dateTimeZone5.getName((-25200000L));
        java.lang.String str15 = dateTimeZone5.getNameKey((-50399948L));
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-50399948L));
        java.lang.String str18 = dateTimeZone1.getID();
        java.util.TimeZone timeZone19 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-50399848L) + "'", long17 == (-50399848L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        java.lang.String str9 = dateTimeZone1.getName((-25200000L));
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider1 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        java.lang.Class<?> wildcardClass4 = nameProvider1.getClass();
        boolean boolean5 = dateTimeZone0.equals((java.lang.Object) nameProvider1);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) 'a');
        long long10 = dateTimeZone0.convertUTCToLocal((long) 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(nameProvider1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 36000000L + "'", long10 == 36000000L);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 0);
        long long5 = dateTimeZone2.convertLocalToUTC((-50399845L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-53999845L) + "'", long5 == (-53999845L));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 0);
        long long4 = dateTimeZone2.convertUTCToLocal((-61199998L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-61199998L) + "'", long4 == (-61199998L));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
// flaky "88) test0242(org.joda.time.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "80) test0242(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "64) test0242(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11L + "'", long7 == 11L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky "51) test0242(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
// flaky "39) test0242(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky "30) test0242(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        long long4 = dateTimeZone1.convertUTCToLocal((long) (-1));
        java.lang.Object obj5 = dateTimeZone1.writeReplace();
        long long7 = dateTimeZone1.convertUTCToLocal((-30299900L));
        java.lang.String str8 = dateTimeZone1.toString();
        long long11 = dateTimeZone1.adjustOffset((long) (byte) -1, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "89) test0243(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "81) test0243(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-2L) + "'", long4 == (-2L));
        org.junit.Assert.assertNotNull(obj5);
// flaky "65) test0243(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-30299901L) + "'", long7 == (-30299901L));
// flaky "52) test0243(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 3660000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 3660000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        java.lang.String str12 = dateTimeZone3.getShortName(53L);
        java.lang.String str14 = dateTimeZone3.getNameKey(1L);
        boolean boolean15 = dateTimeZone3.isFixed();
        long long17 = dateTimeZone3.convertUTCToLocal((long) 'a');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone3.getShortName(35999949L, locale19);
        int int22 = dateTimeZone3.getOffset((-32399999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, 36060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 35);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) ' ', locale6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone2.getName((long) 3660000, locale9);
        long long13 = dateTimeZone2.adjustOffset(0L, true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5700000 + "'", int4 == 5700000);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:35" + "'", str7, "+01:35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:35" + "'", str10, "+01:35");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        boolean boolean20 = dateTimeZone3.isFixed();
        java.lang.String str22 = dateTimeZone3.getNameKey((-86399848L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        int int14 = dateTimeZone10.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone15 = dateTimeZone10.toTimeZone();
        java.util.TimeZone timeZone16 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        boolean boolean18 = dateTimeZone1.equals((java.lang.Object) dateTimeZone17);
        long long20 = dateTimeZone1.convertUTCToLocal((-1570060800000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570060800000L) + "'", long20 == (-1570060800000L));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition(97L);
        int int6 = dateTimeZone1.getOffset((long) (byte) 0);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        boolean boolean11 = dateTimeZone10.isFixed();
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, 96L);
        long long15 = dateTimeZone1.nextTransition((-1570084924001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "90) test0250(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
// flaky "82) test0250(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
// flaky "66) test0250(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "53) test0250(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 161L + "'", long13 == 161L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924001L) + "'", long15 == (-1570084924001L));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        boolean boolean23 = dateTimeZone3.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "91) test0251(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "83) test0251(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "67) test0251(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
// flaky "54) test0251(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
// flaky "40) test0251(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
// flaky "31) test0251(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
// flaky "25) test0251(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(obj20);
// flaky "19) test0251(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider1 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        java.lang.Class<?> wildcardClass4 = nameProvider1.getClass();
        boolean boolean5 = dateTimeZone0.equals((java.lang.Object) nameProvider1);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        java.lang.String str8 = dateTimeZone0.getNameKey((-35999965L));
        long long10 = dateTimeZone0.previousTransition((-25199990L));
        long long13 = dateTimeZone0.adjustOffset((-56099847L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(nameProvider1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-25199990L) + "'", long10 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-56099847L) + "'", long13 == (-56099847L));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        java.lang.Class<?> wildcardClass11 = provider0.getClass();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        int int14 = dateTimeZone1.getStandardOffset(10L);
        long long16 = dateTimeZone1.previousTransition(25199999L);
        java.lang.String str18 = dateTimeZone1.getShortName((-30299901L));
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone1.isLocalDateTimeGap(localDateTime19);
        java.lang.String str21 = dateTimeZone1.toString();
        int int23 = dateTimeZone1.getOffset((-35999900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "92) test0254(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
// flaky "84) test0254(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
// flaky "68) test0254(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25199999L + "'", long16 == 25199999L);
// flaky "55) test0254(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "41) test0254(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
// flaky "32) test0254(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        long long6 = dateTimeZone1.adjustOffset((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        int int10 = dateTimeZone1.getStandardOffset(25200102L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "93) test0255(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
// flaky "85) test0255(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        int int10 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        boolean boolean12 = dateTimeZone1.isStandardOffset(32L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        int int19 = dateTimeZone12.getOffsetFromLocal((-30299901L));
        java.lang.Class<?> wildcardClass20 = dateTimeZone12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "94) test0257(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "86) test0257(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3600000 + "'", int14 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3600000 + "'", int19 == 3600000);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 36060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36060000");
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
        long long21 = dateTimeZone1.convertUTCToLocal((-5699990L));
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone1.getOffset(readableInstant22);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924000L) + "'", long10 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-25199947L) + "'", long12 == (-25199947L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-5699990L) + "'", long21 == (-5699990L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        int int3 = dateTimeZone1.getStandardOffset((-50399948L));
        int int5 = dateTimeZone1.getOffset((-1570084924000L));
        long long8 = dateTimeZone1.adjustOffset((-35999990L), false);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-25199991L));
        java.lang.String str11 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-35999990L) + "'", long8 == (-35999990L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffsetFromLocal(10L);
        long long12 = dateTimeZone3.previousTransition(35999952L);
        java.lang.String str14 = dateTimeZone3.getShortName(10800099L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "95) test0261(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "87) test0261(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "69) test0261(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35999952L + "'", long12 == 35999952L);
// flaky "56) test0261(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.052" + "'", str14, "+00:00:00.052");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        int int70 = dateTimeZone3.getStandardOffset(25200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "96) test0262(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "88) test0262(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
// flaky "70) test0262(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
// flaky "57) test0262(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
// flaky "42) test0262(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
// flaky "33) test0262(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:00" + "'", str18, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
// flaky "26) test0262(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+10:00" + "'", str27, "+10:00");
// flaky "20) test0262(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+10:00" + "'", str30, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 97L + "'", long36 == 97L);
// flaky "12) test0262(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 36000000 + "'", int38 == 36000000);
        org.junit.Assert.assertNotNull(timeZone39);
// flaky "9) test0262(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "GMT+10:00");
// flaky "6) test0262(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+10:00" + "'", str42, "+10:00");
// flaky "1) test0262(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+10:00" + "'", str43, "+10:00");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 97L + "'", long51 == 97L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
// flaky "1) test0262(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+10:00" + "'", str53, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
// flaky "1) test0262(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 36000000 + "'", int56 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 33L + "'", long63 == 33L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 5700032L + "'", long65 == 5700032L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 36000001L + "'", long67 == 36000001L);
// flaky "1) test0262(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int70 + "' != '" + 36000000 + "'", int70 == 36000000);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(36060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 36060000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((-25199946L), true, 99L);
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        java.lang.String str6 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-25199946L) + "'", long4 == (-25199946L));
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
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
        java.lang.String str68 = dateTimeZone20.toString();
        java.lang.String str69 = dateTimeZone20.getID();
        java.lang.String str71 = dateTimeZone20.getNameKey((-30299900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "97) test0266(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "89) test0266(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
// flaky "71) test0266(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
// flaky "58) test0266(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
// flaky "43) test0266(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
// flaky "34) test0266(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:00" + "'", str18, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
// flaky "27) test0266(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+10:00" + "'", str27, "+10:00");
// flaky "21) test0266(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+10:00" + "'", str30, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 97L + "'", long36 == 97L);
// flaky "13) test0266(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 36000000 + "'", int38 == 36000000);
        org.junit.Assert.assertNotNull(timeZone39);
// flaky "10) test0266(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "GMT+10:00");
// flaky "7) test0266(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+10:00" + "'", str42, "+10:00");
// flaky "2) test0266(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+10:00" + "'", str43, "+10:00");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 97L + "'", long51 == 97L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
// flaky "2) test0266(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+10:00" + "'", str53, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
// flaky "2) test0266(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 36000000 + "'", int56 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 33L + "'", long63 == 33L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 5700032L + "'", long65 == 5700032L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 36000001L + "'", long67 == 36000001L);
// flaky "2) test0266(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "+10:00" + "'", str68, "+10:00");
// flaky "1) test0266(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "+10:00" + "'", str69, "+10:00");
// flaky "1) test0266(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset(3600003L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "98) test0267(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36000000 + "'", int2 == 36000000);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 1);
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) dateTimeZone7);
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        long long22 = dateTimeZone3.nextTransition((-9299949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "99) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "90) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
// flaky "72) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
// flaky "59) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
// flaky "44) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky "35) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-9299949L) + "'", long22 == (-9299949L));
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
        boolean boolean7 = dateTimeZone1.isStandardOffset((-25200000L));
        long long10 = dateTimeZone1.adjustOffset(100L, true);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getOffset(25200001L);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (-25199999L));
        java.lang.String str17 = dateTimeZone11.getName(99L);
        long long19 = dateTimeZone11.nextTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky "100) test0270(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36000000 + "'", int13 == 36000000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-25199999L) + "'", long15 == (-25199999L));
// flaky "91) test0270(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(35, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getName(33L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long12 = dateTimeZone1.adjustOffset((long) (short) 10, true);
        long long15 = dateTimeZone1.adjustOffset((long) ' ', true);
        int int17 = dateTimeZone1.getOffsetFromLocal((-50399950L));
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName((-30900001L), locale19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "101) test0273(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
// flaky "92) test0273(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky "73) test0273(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        long long6 = dateTimeZone1.nextTransition((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 10L);
        long long12 = dateTimeZone1.previousTransition(25200100L);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "102) test0274(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "93) test0274(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky "74) test0274(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9L + "'", long10 == 9L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 25200100L + "'", long12 == 25200100L);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky "60) test0274(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone3.nextTransition((long) (short) 100);
        java.lang.String str6 = dateTimeZone3.toString();
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 53L);
        int int10 = dateTimeZone3.getStandardOffset((-1570060799999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky "103) test0275(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
// flaky "94) test0275(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600054L + "'", long8 == 3600054L);
// flaky "75) test0275(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        long long9 = dateTimeZone1.nextTransition(35L);
        java.lang.Object obj10 = null;
        boolean boolean11 = dateTimeZone1.equals(obj10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName((long) 5700000, locale13);
        boolean boolean16 = dateTimeZone1.isStandardOffset((-61199946L));
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone1.isLocalDateTimeGap(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "104) test0276(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "95) test0276(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "76) test0276(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36060000, 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 36060000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long5 = dateTimeZone1.nextTransition((-50399948L));
        int int7 = dateTimeZone1.getOffsetFromLocal(52L);
        int int9 = dateTimeZone1.getOffset((-5699990L));
        long long11 = dateTimeZone1.previousTransition(36000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-50399948L) + "'", long5 == (-50399948L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 36000000L + "'", long11 == 36000000L);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str11 = dateTimeZone10.toString();
        long long15 = dateTimeZone10.convertLocalToUTC((-61199895L), false, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-61199895L) + "'", long15 == (-61199895L));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.lang.Object obj9 = dateTimeZone3.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        long long12 = dateTimeZone3.getMillisKeepLocal(dateTimeZone10, (long) (short) 0);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        long long16 = dateTimeZone14.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone14.getOffset(readableInstant17);
        java.lang.Object obj19 = dateTimeZone14.writeReplace();
        boolean boolean20 = dateTimeZone3.equals(obj19);
        java.lang.Class<?> wildcardClass21 = obj19.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (short) 1);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        long long11 = dateTimeZone1.adjustOffset((long) 10, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((-25199946L), true, 99L);
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long9 = dateTimeZone6.adjustOffset((-50399846L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-25199946L) + "'", long4 == (-25199946L));
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-50399846L) + "'", long9 == (-50399846L));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition(97L);
        int int6 = dateTimeZone1.getOffset((long) (byte) 0);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        boolean boolean11 = dateTimeZone10.isFixed();
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, 96L);
        long long16 = dateTimeZone10.adjustOffset(31L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 61L + "'", long13 == 61L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 31L + "'", long16 == 31L);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        long long6 = dateTimeZone1.nextTransition((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 10L);
        long long12 = dateTimeZone1.previousTransition(25200100L);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 25200100L + "'", long12 == 25200100L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        long long8 = dateTimeZone1.convertLocalToUTC((-1L), true, (-25199948L));
        long long11 = dateTimeZone1.adjustOffset(10L, false);
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.adjustOffset((long) 1, false);
        long long8 = dateTimeZone1.convertLocalToUTC((-30900000L), true, (-5699948L));
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
// flaky "105) test0287(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-27300000L) + "'", long8 == (-27300000L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        java.lang.String str3 = dateTimeZone1.getNameKey(0L);
        boolean boolean5 = dateTimeZone1.isStandardOffset(32400052L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((long) '4', locale7);
        int int10 = dateTimeZone1.getOffsetFromLocal((-25199990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:00" + "'", str8, "+01:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3600000 + "'", int10 == 3600000);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        java.lang.String str8 = dateTimeZone1.getName((-30899946L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "106) test0289(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-01:00" + "'", str2, "-01:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "96) test0289(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-01:00" + "'", str8, "-01:00");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        int int6 = dateTimeZone1.getOffset((long) 10);
        java.lang.String str8 = dateTimeZone1.getShortName(2L);
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) '#');
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        long long15 = dateTimeZone1.adjustOffset((long) 3600000, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3600000L + "'", long15 == 3600000L);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.lang.String str3 = dateTimeZone1.getName(25200010L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.052" + "'", str3, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone5.getMillisKeepLocal(dateTimeZone7, (long) 'a');
        int int11 = dateTimeZone7.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone12 = dateTimeZone7.toTimeZone();
        int int14 = dateTimeZone7.getOffset((long) (short) 1);
        java.lang.String str16 = dateTimeZone7.getShortName(53L);
        long long18 = dateTimeZone7.previousTransition((long) '#');
        boolean boolean19 = dateTimeZone1.equals((java.lang.Object) long18);
        java.lang.String str20 = dateTimeZone1.toString();
        java.lang.Object obj21 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
// flaky "107) test0292(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3600000) + "'", int11 == (-3600000));
        org.junit.Assert.assertNotNull(timeZone12);
// flaky "97) test0292(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT-01:00");
// flaky "77) test0292(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3600000) + "'", int14 == (-3600000));
// flaky "61) test0292(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-01:00" + "'", str16, "-01:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+01:00" + "'", str20, "+01:00");
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        java.lang.String str11 = dateTimeZone1.getNameKey((-25199988L));
        java.lang.String str12 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "108) test0293(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-01:00" + "'", str2, "-01:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "98) test0293(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600010L + "'", long7 == 3600010L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "78) test0293(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str11);
// flaky "62) test0293(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Asia/Bangkok");
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone3.getMillisKeepLocal(dateTimeZone5, (long) 'a');
        boolean boolean8 = dateTimeZone3.isFixed();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) '4', locale10);
        java.lang.String str12 = dateTimeZone3.toString();
        java.lang.String str14 = dateTimeZone3.getShortName(25200100L);
        boolean boolean16 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long19 = dateTimeZone3.adjustOffset((long) (short) 100, true);
        long long21 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 0);
        java.util.TimeZone timeZone22 = dateTimeZone1.toTimeZone();
        java.lang.String str24 = dateTimeZone1.getNameKey((-5700001L));
        java.lang.Class<?> wildcardClass25 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "109) test0294(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-01:00" + "'", str11, "-01:00");
// flaky "99) test0294(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
// flaky "79) test0294(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-01:00" + "'", str14, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
// flaky "63) test0294(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 28800000L + "'", long21 == 28800000L);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ICT" + "'", str24, "ICT");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 35);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) ' ', locale6);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (short) 100, true, (-49L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5700000 + "'", int4 == 5700000);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:35" + "'", str7, "+01:35");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-5699900L) + "'", long11 == (-5699900L));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long3 = dateTimeZone1.previousTransition((long) 3660000);
        long long7 = dateTimeZone1.convertLocalToUTC((long) 36060000, false, 36000010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3660000L + "'", long3 == 3660000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 36059999L + "'", long7 == 36059999L);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 5700000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
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
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getOffset((long) 100);
        long long11 = dateTimeZone1.convertLocalToUTC((-25199899L), false);
        long long13 = dateTimeZone1.nextTransition((-1570084924001L));
        long long15 = dateTimeZone1.convertUTCToLocal(5700036L);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone1.getOffset(readableInstant16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "110) test0299(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
// flaky "100) test0299(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-21599899L) + "'", long11 == (-21599899L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570084924001L) + "'", long13 == (-1570084924001L));
// flaky "80) test0299(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2100036L + "'", long15 == 2100036L);
// flaky "64) test0299(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3600000) + "'", int17 == (-3600000));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-00:00:00.001");
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getStandardOffset(34L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.lang.String str9 = dateTimeZone1.getNameKey(3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "111) test0301(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5700000 + "'", int5 == 5700000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "101) test0301(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        long long13 = dateTimeZone0.convertUTCToLocal(60001L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone0.getOffset(readableInstant14);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(nameProvider1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60001L + "'", long13 == 60001L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName(11L, locale10);
        long long15 = dateTimeZone1.convertLocalToUTC(96L, true, (-9299949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "112) test0304(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "102) test0304(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "81) test0304(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long6 = dateTimeZone1.adjustOffset(9L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "113) test0305(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9L + "'", long6 == 9L);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long7 = dateTimeZone1.adjustOffset(0L, false);
        java.lang.String str9 = dateTimeZone1.getNameKey((-25199948L));
        long long11 = dateTimeZone1.convertUTCToLocal(97L);
        java.lang.String str12 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "114) test0306(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
// flaky "103) test0306(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str9);
// flaky "82) test0306(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 96L + "'", long11 == 96L);
// flaky "65) test0306(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        int int36 = dateTimeZone1.getOffset((-50399845L));
        java.lang.Object obj37 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "115) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "104) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
// flaky "83) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(timeZone20);
// flaky "66) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
// flaky "45) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
// flaky "36) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
// flaky "28) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-00:00:00.001" + "'", str29, "-00:00:00.001");
// flaky "22) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-00:00:00.001" + "'", str30, "-00:00:00.001");
// flaky "14) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 5700036L + "'", long34 == 5700036L);
// flaky "11) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider1 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        java.lang.Class<?> wildcardClass4 = nameProvider1.getClass();
        boolean boolean5 = dateTimeZone0.equals((java.lang.Object) nameProvider1);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        java.lang.String str7 = dateTimeZone0.toString();
        org.joda.time.tz.Provider provider8 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider8);
        org.joda.time.DateTimeZone.setProvider(provider8);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) provider8);
        java.lang.Object obj12 = dateTimeZone0.writeReplace();
        java.lang.Class<?> wildcardClass13 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(nameProvider1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(provider8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        java.util.TimeZone timeZone21 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 34L + "'", long8 == 34L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-2L) + "'", long12 == (-2L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        int int14 = dateTimeZone10.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone15 = dateTimeZone10.toTimeZone();
        java.util.TimeZone timeZone16 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        boolean boolean18 = dateTimeZone1.equals((java.lang.Object) dateTimeZone17);
        java.lang.String str19 = dateTimeZone17.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "116) test0310(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36060000 + "'", int5 == 36060000);
// flaky "105) test0310(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:01" + "'", str6, "+10:01");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
// flaky "84) test0310(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36060000 + "'", int14 == 36060000);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky "67) test0310(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+10:01");
        org.junit.Assert.assertNotNull(timeZone16);
// flaky "46) test0310(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+10:01");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky "37) test0310(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+10:01" + "'", str19, "+10:01");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.toString();
        boolean boolean5 = dateTimeZone1.isStandardOffset((-25199998L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition(97L);
        int int6 = dateTimeZone1.getOffset((long) (byte) 0);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) '4');
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((-2099947L), locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "117) test0312(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:01" + "'", str2, "+10:01");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
// flaky "106) test0312(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36060000 + "'", int6 == 36060000);
// flaky "85) test0312(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str8);
// flaky "68) test0312(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:01" + "'", str11, "+10:01");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.lang.Object obj5 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long3 = dateTimeZone1.previousTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal((long) 25200000);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider1 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        java.lang.Class<?> wildcardClass4 = nameProvider1.getClass();
        boolean boolean5 = dateTimeZone0.equals((java.lang.Object) nameProvider1);
        int int7 = dateTimeZone0.getOffsetFromLocal((-2L));
        java.lang.String str9 = dateTimeZone0.getShortName((-3599947L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(nameProvider1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        int int7 = dateTimeZone1.getOffset((long) (short) 100);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) (byte) 10);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.getID();
        long long15 = dateTimeZone12.previousTransition((-1L));
        long long18 = dateTimeZone12.convertLocalToUTC((long) 10, true);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.lang.String str21 = dateTimeZone20.toString();
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone20.getOffset(readableInstant22);
        long long25 = dateTimeZone12.getMillisKeepLocal(dateTimeZone20, (long) 0);
        long long29 = dateTimeZone20.convertLocalToUTC((-25199948L), false, (long) (byte) 0);
        java.lang.String str30 = dateTimeZone20.toString();
        boolean boolean31 = dateTimeZone20.isFixed();
        int int33 = dateTimeZone20.getOffsetFromLocal((-35999966L));
        boolean boolean34 = dateTimeZone1.equals((java.lang.Object) int33);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-25199948L) + "'", long29 == (-25199948L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((-25199990L));
        long long5 = dateTimeZone1.previousTransition(52L);
        boolean boolean6 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        boolean boolean9 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-25199990L) + "'", long3 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(97L);
        int int10 = dateTimeZone1.getStandardOffset((long) 'a');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName((-3600098L), locale12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone3.getShortName(0L, locale25);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25200000L + "'", long15 == 25200000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 53L + "'", long20 == 53L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        long long28 = dateTimeZone18.previousTransition((long) (byte) -1);
        long long30 = dateTimeZone18.convertUTCToLocal((-3599948L));
        long long32 = dateTimeZone18.nextTransition(3L);
        boolean boolean33 = dateTimeZone18.isFixed();
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone18.isLocalDateTimeGap(localDateTime34);
        long long37 = dateTimeZone18.nextTransition(25200010L);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-3599948L) + "'", long30 == (-3599948L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 3L + "'", long32 == 3L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 25200010L + "'", long37 == 25200010L);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long3 = dateTimeZone1.convertUTCToLocal(2L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        java.lang.String str3 = dateTimeZone1.getShortName((-49L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int6 = dateTimeZone1.getOffsetFromLocal((-25199899L));
        java.lang.Class<?> wildcardClass7 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:00" + "'", str3, "+10:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36000000 + "'", int6 == 36000000);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00");
        long long4 = dateTimeZone1.adjustOffset((-32400000L), false);
        boolean boolean5 = dateTimeZone1.isFixed();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName(3600010L, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-32400000L) + "'", long4 == (-32400000L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getShortName((-35999903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Asia/Bangkok");
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone3.getMillisKeepLocal(dateTimeZone5, (long) 'a');
        boolean boolean8 = dateTimeZone3.isFixed();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) '4', locale10);
        java.lang.String str12 = dateTimeZone3.toString();
        java.lang.String str14 = dateTimeZone3.getShortName(25200100L);
        boolean boolean16 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long19 = dateTimeZone3.adjustOffset((long) (short) 100, true);
        long long21 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 0);
        java.util.TimeZone timeZone22 = dateTimeZone1.toTimeZone();
        org.joda.time.LocalDateTime localDateTime23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = dateTimeZone1.isLocalDateTimeGap(localDateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-01:00" + "'", str11, "-01:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-01:00" + "'", str14, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 28800000L + "'", long21 == 28800000L);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        java.lang.String str9 = dateTimeZone1.getName((-25200000L));
        java.lang.String str11 = dateTimeZone1.getNameKey((-50399948L));
        long long15 = dateTimeZone1.convertLocalToUTC(36000032L, false, (-35999965L));
        int int17 = dateTimeZone1.getOffset(36000032L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-01:00" + "'", str2, "-01:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600010L + "'", long7 == 3600010L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-01:00" + "'", str9, "-01:00");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 39600032L + "'", long15 == 39600032L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3600000) + "'", int17 == (-3600000));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str5 = dateTimeZone1.getShortName((long) (-1));
        int int7 = dateTimeZone1.getStandardOffset((long) (short) -1);
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-01:00" + "'", str2, "-01:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3600000) + "'", int7 == (-3600000));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        int int7 = dateTimeZone1.getOffset(2100052L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName(96L, locale9);
        int int12 = dateTimeZone1.getStandardOffset(25200101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3600000) + "'", int5 == (-3600000));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3600000) + "'", int7 == (-3600000));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-01:00" + "'", str10, "-01:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3600000) + "'", int12 == (-3600000));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        long long6 = dateTimeZone1.adjustOffset((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        int int10 = dateTimeZone1.getOffsetFromLocal(3600032L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-3600000) + "'", int10 == (-3600000));
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        int int12 = dateTimeZone10.getOffsetFromLocal(32400033L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3600000) + "'", int7 == (-3600000));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3600000) + "'", int12 == (-3600000));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        long long37 = dateTimeZone20.convertLocalToUTC(0L, true, (-1570060800000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-01:00" + "'", str7, "-01:00");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-21599947L) + "'", long16 == (-21599947L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 36000000L + "'", long18 == 36000000L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-49L) + "'", long28 == (-49L));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 21600002L + "'", long31 == 21600002L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((-3599948L), locale7);
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-01:00" + "'", str8, "-01:00");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT-01:00");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getName(33L);
        long long11 = dateTimeZone1.adjustOffset((-3599896L), true);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName((-25199997L), locale13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3599896L) + "'", long11 == (-3599896L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getName((long) 10);
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        long long14 = dateTimeZone1.nextTransition(35L);
        long long17 = dateTimeZone1.convertLocalToUTC((-61199947L), false);
        java.lang.String str18 = dateTimeZone1.toString();
        int int20 = dateTimeZone1.getOffset(29400000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-01:00" + "'", str8, "-01:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-01:00" + "'", str11, "-01:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-57599947L) + "'", long17 == (-57599947L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-01:00" + "'", str18, "-01:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3600000) + "'", int20 == (-3600000));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        long long17 = dateTimeZone5.adjustOffset((-59699848L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-21599900L) + "'", long14 == (-21599900L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-59699848L) + "'", long17 == (-59699848L));
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        java.lang.String str12 = dateTimeZone3.getShortName(53L);
        long long14 = dateTimeZone3.previousTransition((long) '#');
        long long16 = dateTimeZone3.convertUTCToLocal((-3599948L));
        java.lang.String str18 = dateTimeZone3.getShortName((-1570084924001L));
        long long21 = dateTimeZone3.convertLocalToUTC(3600001L, false);
        boolean boolean23 = dateTimeZone3.isStandardOffset(10L);
        java.lang.String str25 = dateTimeZone3.getNameKey((-30899946L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "118) test0338(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "107) test0338(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "86) test0338(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
// flaky "69) test0338(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
// flaky "47) test0338(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599949L) + "'", long16 == (-3599949L));
// flaky "38) test0338(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
// flaky "29) test0338(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3600002L + "'", long21 == 3600002L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        int int21 = dateTimeZone3.getOffset((-66900000L));
        java.lang.Class<?> wildcardClass22 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "119) test0339(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "108) test0339(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "87) test0339(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "70) test0339(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "48) test0339(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
// flaky "39) test0339(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
// flaky "30) test0339(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
// flaky "23) test0339(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone5.getShortName(25200100L, locale16);
        java.lang.String str19 = dateTimeZone5.getName((-90L));
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        int int23 = dateTimeZone21.getStandardOffset((long) ' ');
        java.lang.String str24 = dateTimeZone21.toString();
        java.lang.String str25 = dateTimeZone21.toString();
        java.util.TimeZone timeZone26 = dateTimeZone21.toTimeZone();
        java.lang.Object obj27 = dateTimeZone21.writeReplace();
        boolean boolean28 = dateTimeZone5.equals((java.lang.Object) dateTimeZone21);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "120) test0340(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
// flaky "109) test0340(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-25199899L) + "'", long14 == (-25199899L));
// flaky "88) test0340(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
// flaky "71) test0340(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj27);
// flaky "49) test0340(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.adjustOffset((long) 1, false);
        long long8 = dateTimeZone1.convertLocalToUTC((-30900000L), true, (-5699948L));
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
// flaky "121) test0341(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-30899999L) + "'", long8 == (-30899999L));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        java.lang.String str3 = dateTimeZone1.getNameKey(0L);
        boolean boolean5 = dateTimeZone1.isStandardOffset(32400052L);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long8 = dateTimeZone1.convertUTCToLocal((long) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3599999L + "'", long8 == 3599999L);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        long long3 = dateTimeZone1.convertUTCToLocal((-25199989L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 0L);
        long long9 = dateTimeZone1.nextTransition((long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-25199989L) + "'", long3 == (-25199989L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-100L) + "'", long7 == (-100L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone1.isLocalDateTimeGap(localDateTime16);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "122) test0344(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "110) test0344(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11L + "'", long7 == 11L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky "89) test0344(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
// flaky "72) test0344(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky "50) test0344(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((-3599948L), locale7);
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long13 = dateTimeZone11.previousTransition((long) (short) 100);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        long long19 = dateTimeZone15.getMillisKeepLocal(dateTimeZone17, (long) 'a');
        boolean boolean21 = dateTimeZone15.isStandardOffset((-25200000L));
        java.lang.String str22 = dateTimeZone15.toString();
        long long24 = dateTimeZone11.getMillisKeepLocal(dateTimeZone15, (-25199900L));
        java.lang.String str26 = dateTimeZone11.getNameKey((-25199899L));
        boolean boolean27 = dateTimeZone1.equals((java.lang.Object) dateTimeZone11);
        java.lang.String str29 = dateTimeZone11.getNameKey((-50399844L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "123) test0345(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky "111) test0345(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
// flaky "90) test0345(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-25199899L) + "'", long24 == (-25199899L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        long long70 = dateTimeZone20.adjustOffset((-46799951L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "124) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "112) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "91) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "73) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "51) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
// flaky "40) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
// flaky "31) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
// flaky "24) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-00:00:00.001" + "'", str30, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 97L + "'", long36 == 97L);
// flaky "15) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(timeZone39);
// flaky "12) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "GMT+00:00");
// flaky "8) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-00:00:00.001" + "'", str42, "-00:00:00.001");
// flaky "3) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-00:00:00.001" + "'", str43, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 97L + "'", long51 == 97L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
// flaky "3) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "-00:00:00.001" + "'", str53, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
// flaky "3) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 33L + "'", long63 == 33L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 5700032L + "'", long65 == 5700032L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 36000001L + "'", long67 == 36000001L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-46799951L) + "'", long70 == (-46799951L));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (byte) 10);
        java.lang.String str3 = dateTimeZone2.toString();
        boolean boolean4 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:10" + "'", str3, "+10:10");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long3 = dateTimeZone1.previousTransition((long) (short) 100);
        long long5 = dateTimeZone1.convertUTCToLocal(32L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        int int9 = dateTimeZone7.getOffsetFromLocal((-25199989L));
        int int11 = dateTimeZone7.getOffset((long) (short) 1);
        boolean boolean13 = dateTimeZone7.isStandardOffset((-32399999L));
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, 3659999L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3600000 + "'", int9 == 3600000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3600000 + "'", int11 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 59999L + "'", long15 == 59999L);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        boolean boolean8 = dateTimeZone3.isFixed();
        int int10 = dateTimeZone3.getOffsetFromLocal((long) 100);
        java.lang.String str12 = dateTimeZone3.getName((long) 1);
        long long16 = dateTimeZone3.convertLocalToUTC((-50399847L), false, (-1570060800001L));
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone3.isLocalDateTimeGap(localDateTime17);
        java.lang.String str20 = dateTimeZone3.getName((-41699903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3600000 + "'", int10 == 3600000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:00" + "'", str12, "+01:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-53999847L) + "'", long16 == (-53999847L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+01:00" + "'", str20, "+01:00");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) -1, locale8);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        boolean boolean12 = dateTimeZone1.equals((java.lang.Object) 2100052L);
        boolean boolean14 = dateTimeZone1.isStandardOffset(0L);
        java.lang.String str16 = dateTimeZone1.getShortName((long) (-1));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+01:00" + "'", str9, "+01:00");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+01:00" + "'", str16, "+01:00");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getName((long) 10);
        int int13 = dateTimeZone1.getOffsetFromLocal(0L);
        long long17 = dateTimeZone1.convertLocalToUTC(11875999L, true, 96L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:00" + "'", str8, "+01:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:00" + "'", str11, "+01:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3600000 + "'", int13 == 3600000);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 8275999L + "'", long17 == 8275999L);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getOffset((-25199899L));
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.lang.String str8 = dateTimeZone1.getID();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName(36000033L, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName(99L, locale13);
        long long16 = dateTimeZone1.previousTransition((long) '4');
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone1.getShortName((-50399848L), locale18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone1.getShortName((-52499950L), locale21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str11 = dateTimeZone10.toString();
        java.util.TimeZone timeZone12 = dateTimeZone10.toTimeZone();
        java.lang.Class<?> wildcardClass13 = timeZone12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:00" + "'", str11, "+01:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(97L);
        int int10 = dateTimeZone1.getStandardOffset((long) 'a');
        long long13 = dateTimeZone1.convertLocalToUTC((-50399948L), false);
        long long16 = dateTimeZone1.adjustOffset((-2L), false);
        java.util.TimeZone timeZone17 = dateTimeZone1.toTimeZone();
        boolean boolean19 = dateTimeZone1.isStandardOffset((-5699902L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-50399947L) + "'", long13 == (-50399947L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-2L) + "'", long16 == (-2L));
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
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
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone21.getOffset(readableInstant34);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3600000 + "'", int10 == 3600000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:00" + "'", str12, "+01:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-3599965L) + "'", long19 == (-3599965L));
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+01:00" + "'", str22, "+01:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-3599990L) + "'", long27 == (-3599990L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3600000 + "'", int29 == 3600000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3600000 + "'", int31 == 3600000);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 36000000L + "'", long33 == 36000000L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3600000 + "'", int35 == 3600000);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone3.getMillisKeepLocal(dateTimeZone5, (long) 'a');
        boolean boolean8 = dateTimeZone3.isFixed();
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 11L);
        int int12 = dateTimeZone1.getOffset(25200002L);
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3599989L) + "'", long10 == (-3599989L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        boolean boolean28 = dateTimeZone3.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long32 = dateTimeZone3.getMillisKeepLocal(dateTimeZone30, 52L);
        long long34 = dateTimeZone30.nextTransition((-50399846L));
        long long37 = dateTimeZone30.convertLocalToUTC((-25199898L), false);
        long long39 = dateTimeZone30.previousTransition(5700010L);
        org.joda.time.ReadableInstant readableInstant40 = null;
        int int41 = dateTimeZone30.getOffset(readableInstant40);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:00" + "'", str11, "+01:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:00" + "'", str14, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3600000 + "'", int22 == 3600000);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 3599952L + "'", long32 == 3599952L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-50399846L) + "'", long34 == (-50399846L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-25199998L) + "'", long37 == (-25199998L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 5700010L + "'", long39 == 5700010L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getName((long) 10);
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        long long14 = dateTimeZone1.nextTransition(35L);
        long long17 = dateTimeZone1.convertLocalToUTC((-61199947L), false);
        java.lang.String str18 = dateTimeZone1.toString();
        long long22 = dateTimeZone1.convertLocalToUTC(5700000L, true, 36060000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:00" + "'", str8, "+01:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:00" + "'", str11, "+01:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-64799947L) + "'", long17 == (-64799947L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+01:00" + "'", str18, "+01:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2100000L + "'", long22 == 2100000L);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        long long14 = dateTimeZone3.previousTransition((-46799949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:00" + "'", str11, "+01:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:00" + "'", str12, "+01:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-46799949L) + "'", long14 == (-46799949L));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getOffsetFromLocal((-30299900L));
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(3660000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 3660000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone5.adjustOffset((long) '4', true);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone5.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-5700000L));
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone5.isLocalDateTimeGap(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-5700001L) + "'", long12 == (-5700001L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(3600000);
        long long25 = dateTimeZone3.getMillisKeepLocal(dateTimeZone23, 0L);
        java.lang.String str26 = dateTimeZone3.toString();
        java.lang.Class<?> wildcardClass27 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "125) test0366(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "113) test0366(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "92) test0366(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "74) test0366(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
// flaky "52) test0366(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25200000L + "'", long15 == 25200000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 53L + "'", long20 == 53L);
// flaky "41) test0366(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone23);
// flaky "32) test0366(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-3600000L) + "'", long25 == (-3600000L));
// flaky "25) test0366(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        java.lang.String str9 = dateTimeZone1.getName((-25200000L));
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        long long16 = dateTimeZone12.getMillisKeepLocal(dateTimeZone14, (long) 'a');
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone12.getName((long) (short) 1, locale18);
        java.lang.String str20 = dateTimeZone12.getID();
        java.lang.String str22 = dateTimeZone12.getNameKey((-30899900L));
        boolean boolean23 = dateTimeZone1.equals((java.lang.Object) str22);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "126) test0368(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "114) test0368(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
// flaky "93) test0368(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone10);
// flaky "75) test0368(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
// flaky "53) test0368(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
// flaky "42) test0368(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.lang.String str6 = dateTimeZone5.getID();
        long long8 = dateTimeZone5.previousTransition((-1L));
        long long11 = dateTimeZone5.convertLocalToUTC((long) 10, true);
        java.lang.String str13 = dateTimeZone5.getName((-25200000L));
        java.lang.String str15 = dateTimeZone5.getNameKey((-50399948L));
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-50399948L));
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName(35999952L, locale19);
        long long22 = dateTimeZone1.convertUTCToLocal((-50399947L));
        long long25 = dateTimeZone1.convertLocalToUTC((-3599948L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky "127) test0369(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
// flaky "115) test0369(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9L + "'", long11 == 9L);
// flaky "94) test0369(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertNull(str15);
// flaky "76) test0369(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-50399849L) + "'", long17 == (-50399849L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-50399847L) + "'", long22 == (-50399847L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-3600048L) + "'", long25 == (-3600048L));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) '4', locale8);
        java.lang.String str10 = dateTimeZone1.toString();
        long long13 = dateTimeZone1.convertLocalToUTC((long) '4', false);
        long long17 = dateTimeZone1.convertLocalToUTC((long) 25200000, false, (-1570060800001L));
        java.lang.String str19 = dateTimeZone1.getNameKey(50L);
        long long22 = dateTimeZone1.adjustOffset((-5699904L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "128) test0370(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
// flaky "116) test0370(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
// flaky "95) test0370(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 51L + "'", long13 == 51L);
// flaky "77) test0370(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 25199999L + "'", long17 == 25199999L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-5699904L) + "'", long22 == (-5699904L));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str5 = dateTimeZone1.getShortName((long) (-1));
        long long9 = dateTimeZone1.convertLocalToUTC(0L, true, (-25199948L));
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) 25199900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "129) test0371(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
// flaky "117) test0371(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
// flaky "96) test0371(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
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
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone1.getName((-25199947L), locale31);
        boolean boolean34 = dateTimeZone1.isStandardOffset(3600003L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "130) test0372(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
// flaky "118) test0372(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
// flaky "97) test0372(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky "78) test0372(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
// flaky "54) test0372(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.001" + "'", str23, "+00:00:00.001");
// flaky "43) test0372(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
// flaky "33) test0372(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.001" + "'", str29, "+00:00:00.001");
// flaky "26) test0372(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.001" + "'", str32, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Asia/Bangkok");
        long long3 = dateTimeZone1.nextTransition((long) 25200000);
        org.joda.time.LocalDateTime localDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25200000L + "'", long3 == 25200000L);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((-25199990L));
        long long5 = dateTimeZone1.previousTransition((-3599948L));
        int int7 = dateTimeZone1.getStandardOffset(96L);
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        int int10 = dateTimeZone1.getStandardOffset(0L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-25199990L) + "'", long3 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3599948L) + "'", long5 == (-3599948L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3600000 + "'", int10 == 3600000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3600000 + "'", int12 == 3600000);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        java.lang.String str13 = dateTimeZone3.getShortName((-1570084924002L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone3.getOffset(readableInstant15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(6720000, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(97L);
        int int10 = dateTimeZone1.getStandardOffset((long) (short) 100);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        long long15 = dateTimeZone1.convertLocalToUTC((-1570064400000L), true, (-2099947L));
        java.lang.String str17 = dateTimeZone1.getShortName((-1570084924001L));
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getShortName((-21599989L), locale19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570064399999L) + "'", long15 == (-1570064399999L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long3 = dateTimeZone1.convertUTCToLocal((-9299903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-9299803L) + "'", long3 == (-9299803L));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        java.lang.String str12 = dateTimeZone3.getShortName(53L);
        java.lang.String str14 = dateTimeZone3.getNameKey(1L);
        int int16 = dateTimeZone3.getOffset(25200001L);
        long long18 = dateTimeZone3.convertUTCToLocal(3600001L);
        int int20 = dateTimeZone3.getOffset((-61199998L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "131) test0379(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "119) test0379(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "98) test0379(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
// flaky "79) test0379(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
// flaky "55) test0379(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str14);
// flaky "44) test0379(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
// flaky "34) test0379(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3600000L + "'", long18 == 3600000L);
// flaky "27) test0379(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        java.lang.String str10 = dateTimeZone1.getNameKey((long) (byte) -1);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) (byte) 10);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        long long15 = dateTimeZone1.convertUTCToLocal((long) (short) 1);
        java.lang.String str17 = dateTimeZone1.getName(3599999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        int int3 = dateTimeZone1.getOffsetFromLocal((-25199989L));
        boolean boolean5 = dateTimeZone1.isStandardOffset(36000010L);
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
        java.lang.String str23 = dateTimeZone9.getName((long) (short) -1);
        long long25 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (-50399950L));
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone1.getName((-66899947L), locale27);
        java.lang.Class<?> wildcardClass29 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600000 + "'", int3 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
// flaky "132) test0381(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(timeZone14);
// flaky "120) test0381(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
// flaky "99) test0381(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
// flaky "80) test0381(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
// flaky "56) test0381(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
// flaky "45) test0381(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
// flaky "35) test0381(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-46799949L) + "'", long25 == (-46799949L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+01:00" + "'", str28, "+01:00");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long7 = dateTimeZone1.convertLocalToUTC((-25200000L), true, (-3599948L));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        long long13 = dateTimeZone1.convertLocalToUTC(37L, true, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "133) test0382(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "121) test0382(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-25199999L) + "'", long7 == (-25199999L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "100) test0382(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 38L + "'", long13 == 38L);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "134) test0383(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
// flaky "122) test0383(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider1 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        java.lang.Class<?> wildcardClass4 = nameProvider1.getClass();
        boolean boolean5 = dateTimeZone0.equals((java.lang.Object) nameProvider1);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        java.lang.String str7 = dateTimeZone0.toString();
        org.joda.time.tz.Provider provider8 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider8);
        org.joda.time.DateTimeZone.setProvider(provider8);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) provider8);
        java.lang.String str13 = dateTimeZone0.getName((long) (byte) 1);
        long long16 = dateTimeZone0.convertLocalToUTC(36000000L, false);
        long long18 = dateTimeZone0.nextTransition(3660000L);
        java.lang.String str19 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(nameProvider1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(provider8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 36000000L + "'", long16 == 36000000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3660000L + "'", long18 == 3660000L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(53L, locale4);
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
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        long long26 = dateTimeZone22.getMillisKeepLocal(dateTimeZone24, (long) 'a');
        int int28 = dateTimeZone24.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone29 = dateTimeZone24.toTimeZone();
        int int31 = dateTimeZone24.getOffset((long) (short) 1);
        java.lang.String str33 = dateTimeZone24.getShortName(53L);
        java.lang.String str35 = dateTimeZone24.getNameKey(1L);
        long long37 = dateTimeZone9.getMillisKeepLocal(dateTimeZone24, (-61199947L));
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = dateTimeZone24.getOffset(readableInstant38);
        boolean boolean40 = dateTimeZone2.equals((java.lang.Object) readableInstant38);
        boolean boolean42 = dateTimeZone2.isStandardOffset((-50399844L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:01" + "'", str5, "+10:01");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
// flaky "135) test0385(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(timeZone14);
// flaky "123) test0385(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
// flaky "101) test0385(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
// flaky "81) test0385(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
// flaky "57) test0385(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(timeZone29);
// flaky "46) test0385(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
// flaky "36) test0385(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
// flaky "28) test0385(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-00:00:00.001" + "'", str33, "-00:00:00.001");
// flaky "16) test0385(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-61199947L) + "'", long37 == (-61199947L));
// flaky "13) test0385(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        java.lang.Class<?> wildcardClass20 = dateTimeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "136) test0386(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "124) test0386(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11L + "'", long7 == 11L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky "102) test0386(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
// flaky "82) test0386(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky "58) test0386(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-25199947L) + "'", long18 == (-25199947L));
        org.junit.Assert.assertNotNull(wildcardClass20);
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
        boolean boolean28 = dateTimeZone3.isStandardOffset((long) (byte) 0);
        long long30 = dateTimeZone3.nextTransition(10L);
        java.lang.Object obj31 = dateTimeZone3.writeReplace();
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = dateTimeZone3.getOffset(readableInstant32);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long37 = dateTimeZone35.previousTransition((-25199990L));
        long long39 = dateTimeZone35.previousTransition(52L);
        long long41 = dateTimeZone35.nextTransition(11L);
        long long43 = dateTimeZone3.getMillisKeepLocal(dateTimeZone35, (-5699948L));
        java.lang.String str44 = dateTimeZone35.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "137) test0387(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "125) test0387(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "103) test0387(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "83) test0387(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky "59) test0387(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "47) test0387(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone24);
// flaky "37) test0387(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(obj31);
// flaky "29) test0387(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-25199990L) + "'", long37 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 52L + "'", long39 == 52L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 11L + "'", long41 == 11L);
// flaky "17) test0387(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-9299949L) + "'", long43 == (-9299949L));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+01:00" + "'", str44, "+01:00");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        java.util.TimeZone timeZone16 = dateTimeZone3.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
// flaky "138) test0388(org.joda.time.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "126) test0388(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "104) test0388(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "84) test0388(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "60) test0388(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
// flaky "48) test0388(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone16);
// flaky "38) test0388(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        boolean boolean10 = dateTimeZone3.isStandardOffset((-25199990L));
        int int12 = dateTimeZone3.getOffset((long) (-3600000));
        java.lang.Class<?> wildcardClass13 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "139) test0389(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "127) test0389(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "105) test0389(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        java.lang.String str21 = dateTimeZone1.getShortName(25200000L);
        long long24 = dateTimeZone1.adjustOffset(51L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "140) test0390(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
// flaky "128) test0390(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924000L) + "'", long10 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-25199947L) + "'", long12 == (-25199947L));
// flaky "106) test0390(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
// flaky "85) test0390(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
// flaky "61) test0390(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
// flaky "49) test0390(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 51L + "'", long24 == 51L);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        java.lang.Class<?> wildcardClass26 = dateTimeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "141) test0391(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "129) test0391(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11L + "'", long7 == 11L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky "107) test0391(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
// flaky "86) test0391(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky "62) test0391(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-25199947L) + "'", long18 == (-25199947L));
// flaky "50) test0391(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        long long5 = dateTimeZone1.convertLocalToUTC((-3599948L), true, (-25199989L));
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-35999966L), locale9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3599948L) + "'", long5 == (-3599948L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone1.getOffsetFromLocal(53L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((-25199898L), locale9);
        boolean boolean12 = dateTimeZone1.equals((java.lang.Object) (-82799950L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "142) test0393(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
// flaky "130) test0393(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:35" + "'", str10, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        long long28 = dateTimeZone18.previousTransition((long) (byte) -1);
        long long30 = dateTimeZone18.convertUTCToLocal((-3599948L));
        boolean boolean31 = dateTimeZone18.isFixed();
        java.lang.Class<?> wildcardClass32 = dateTimeZone18.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "143) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "131) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:35");
// flaky "108) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:35" + "'", str11, "+01:35");
// flaky "87) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:35" + "'", str14, "+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky "63) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5700000 + "'", int22 == 5700000);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "51) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertNotNull(timeZone24);
// flaky "39) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+01:35");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
// flaky "30) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2100052L + "'", long30 == 2100052L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 1);
        int int4 = dateTimeZone2.getOffset((-50399847L));
        java.lang.String str5 = dateTimeZone2.toString();
        boolean boolean6 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36060000 + "'", int4 == 36060000);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:01" + "'", str5, "+10:01");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        int int3 = dateTimeZone1.getStandardOffset((long) ' ');
        java.lang.String str4 = dateTimeZone1.toString();
        java.lang.String str5 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass7 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass7);
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
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) '4', locale8);
        java.lang.String str10 = dateTimeZone1.toString();
        long long13 = dateTimeZone1.convertLocalToUTC((long) '4', false);
        long long17 = dateTimeZone1.convertLocalToUTC((long) 25200000, false, (-1570060800001L));
        java.lang.String str19 = dateTimeZone1.getNameKey((long) 0);
        long long22 = dateTimeZone1.adjustOffset((-25199989L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "144) test0398(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
// flaky "132) test0398(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
// flaky "109) test0398(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-48L) + "'", long13 == (-48L));
// flaky "88) test0398(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 25199900L + "'", long17 == 25199900L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-25199989L) + "'", long22 == (-25199989L));
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
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        long long27 = dateTimeZone23.getMillisKeepLocal(dateTimeZone25, (long) 'a');
        int int29 = dateTimeZone25.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone30 = dateTimeZone25.toTimeZone();
        java.lang.Object obj31 = dateTimeZone25.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        long long34 = dateTimeZone25.getMillisKeepLocal(dateTimeZone32, (long) (short) 0);
        long long36 = dateTimeZone3.getMillisKeepLocal(dateTimeZone32, 25199999L);
        org.joda.time.LocalDateTime localDateTime37 = null;
        boolean boolean38 = dateTimeZone3.isLocalDateTimeGap(localDateTime37);
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
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 25199999L + "'", long36 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone18.getOffset(readableInstant33);
        java.lang.Class<?> wildcardClass35 = dateTimeZone18.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "145) test0401(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "133) test0401(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:00");
// flaky "110) test0401(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:00" + "'", str11, "+01:00");
// flaky "89) test0401(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:00" + "'", str14, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky "64) test0401(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3600000 + "'", int22 == 3600000);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "52) test0401(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+01:00");
// flaky "40) test0401(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3600000 + "'", int25 == 3600000);
// flaky "31) test0401(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+01:00" + "'", str27, "+01:00");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-61199947L) + "'", long31 == (-61199947L));
// flaky "18) test0401(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+01:00" + "'", str32, "+01:00");
// flaky "14) test0401(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3600000 + "'", int34 == 3600000);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        long long9 = dateTimeZone1.nextTransition(35L);
        long long12 = dateTimeZone1.convertLocalToUTC((-25199997L), false);
        boolean boolean13 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "146) test0402(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:00" + "'", str2, "+01:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "134) test0402(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3599990L) + "'", long7 == (-3599990L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
// flaky "111) test0402(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-28799997L) + "'", long12 == (-28799997L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        long long6 = dateTimeZone1.nextTransition((-25199900L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.toString();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str12 = dateTimeZone11.getID();
        long long14 = dateTimeZone11.previousTransition((-1L));
        long long17 = dateTimeZone11.convertLocalToUTC((long) 10, true);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        boolean boolean20 = dateTimeZone19.isFixed();
        boolean boolean21 = dateTimeZone11.equals((java.lang.Object) dateTimeZone19);
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 35999999L);
        long long25 = dateTimeZone11.nextTransition((-35940001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199900L) + "'", long6 == (-25199900L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 11L + "'", long17 == 11L);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35999999L + "'", long23 == 35999999L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-35940001L) + "'", long25 == (-35940001L));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str6 = dateTimeZone4.getNameKey(1L);
        java.util.TimeZone timeZone7 = dateTimeZone4.toTimeZone();
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) timeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long3 = dateTimeZone1.previousTransition((long) (short) 100);
        java.lang.Object obj4 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider1 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        java.lang.Class<?> wildcardClass4 = nameProvider1.getClass();
        boolean boolean5 = dateTimeZone0.equals((java.lang.Object) nameProvider1);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        java.lang.String str8 = dateTimeZone0.getNameKey((-35999965L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str11 = dateTimeZone0.getName((-61199998L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(nameProvider1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Asia/Bangkok");
        long long3 = dateTimeZone1.nextTransition((long) 25200000);
        java.lang.String str4 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25200000L + "'", long3 == 25200000L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Asia/Bangkok" + "'", str4, "Asia/Bangkok");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        long long7 = dateTimeZone1.adjustOffset((long) (short) 10, true);
        long long10 = dateTimeZone1.adjustOffset((long) 5700000, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5700000L + "'", long10 == 5700000L);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition(97L);
        int int6 = dateTimeZone1.getOffset((long) (byte) 0);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        boolean boolean11 = dateTimeZone10.isFixed();
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, 96L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName(10800011L, locale15);
        long long18 = dateTimeZone1.nextTransition((-28799900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 61L + "'", long13 == 61L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-28799900L) + "'", long18 == (-28799900L));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        java.lang.String str34 = dateTimeZone3.toString();
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone3.getName((-53999845L), locale36);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599948L) + "'", long16 == (-3599948L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 36000000L + "'", long33 == 36000000L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        boolean boolean10 = dateTimeZone9.isFixed();
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone9.getShortName(5700033L, locale13);
        long long17 = dateTimeZone9.convertLocalToUTC(0L, true);
        java.lang.String str18 = dateTimeZone9.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        boolean boolean14 = dateTimeZone3.isStandardOffset(0L);
        java.lang.String str15 = dateTimeZone3.getID();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long20 = dateTimeZone17.convertLocalToUTC((-1570084924001L), false);
        int int22 = dateTimeZone17.getOffsetFromLocal((-1570084924000L));
        int int24 = dateTimeZone17.getOffset(97L);
        int int26 = dateTimeZone17.getStandardOffset((long) 'a');
        long long29 = dateTimeZone17.convertLocalToUTC((-50399948L), false);
        long long31 = dateTimeZone3.getMillisKeepLocal(dateTimeZone17, (-1570060800001L));
        java.lang.String str33 = dateTimeZone17.getShortName(31L);
        long long36 = dateTimeZone17.convertLocalToUTC(0L, true);
        java.lang.String str38 = dateTimeZone17.getNameKey((-21599898L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570084924000L) + "'", long20 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-50399947L) + "'", long29 == (-50399947L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1570060800000L) + "'", long31 == (-1570060800000L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-00:00:00.001" + "'", str33, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), 6720000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        long long30 = dateTimeZone1.previousTransition((-49L));
        long long33 = dateTimeZone1.convertLocalToUTC((long) 36000000, true);
        long long35 = dateTimeZone1.previousTransition(53L);
        java.lang.Class<?> wildcardClass36 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 11L + "'", long28 == 11L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-49L) + "'", long30 == (-49L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 36000000L + "'", long33 == 36000000L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 53L + "'", long35 == 53L);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone3.getName((-46799950L), locale19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3600000 + "'", int14 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        long long8 = dateTimeZone1.convertLocalToUTC((long) '#', false, (-25200000L));
        java.lang.String str10 = dateTimeZone1.getNameKey((-25199901L));
        long long13 = dateTimeZone1.adjustOffset(3600100L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 34L + "'", long8 == 34L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600100L + "'", long13 == 3600100L);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        long long8 = dateTimeZone1.convertLocalToUTC((long) '#', false, (-25200000L));
        long long12 = dateTimeZone1.convertLocalToUTC((long) (short) -1, true, 25200000L);
        int int14 = dateTimeZone1.getOffsetFromLocal((-1L));
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        long long20 = dateTimeZone1.convertLocalToUTC((-25199998L), true, (long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long24 = dateTimeZone1.adjustOffset((long) (-3600000), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 34L + "'", long8 == 34L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-2L) + "'", long12 == (-2L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-25199999L) + "'", long20 == (-25199999L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3600000L) + "'", long24 == (-3600000L));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        long long3 = dateTimeZone1.convertUTCToLocal((-25199989L));
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.getID();
        long long9 = dateTimeZone1.adjustOffset(9L, false);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-25199989L) + "'", long3 == (-25199989L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9L + "'", long9 == 9L);
        org.junit.Assert.assertNotNull(wildcardClass10);
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long12 = dateTimeZone1.adjustOffset((long) (short) 10, true);
        java.lang.Object obj13 = dateTimeZone1.writeReplace();
        int int15 = dateTimeZone1.getStandardOffset((long) (-1));
        int int17 = dateTimeZone1.getStandardOffset((-1570084924000L));
        long long21 = dateTimeZone1.convertLocalToUTC(0L, false, (long) 10);
        boolean boolean23 = dateTimeZone1.equals((java.lang.Object) (byte) -1);
        boolean boolean24 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone25 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.adjustOffset((long) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(60000L);
        java.lang.String str8 = dateTimeZone1.getShortName(100L);
        long long10 = dateTimeZone1.previousTransition((-3599896L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3599896L) + "'", long10 == (-3599896L));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((-3599948L), locale7);
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        java.lang.String str11 = dateTimeZone1.getNameKey(5700000L);
        long long15 = dateTimeZone1.convertLocalToUTC((-1570084924000L), false, 25200100L);
        java.lang.Class<?> wildcardClass16 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "147) test0424(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(str11);
// flaky "135) test0424(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570090624000L) + "'", long15 == (-1570090624000L));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long6 = dateTimeZone4.previousTransition((long) (short) 100);
        java.util.TimeZone timeZone7 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        boolean boolean9 = dateTimeZone2.equals((java.lang.Object) dateTimeZone8);
        java.lang.String str11 = dateTimeZone2.getName(35999999L);
        java.util.TimeZone timeZone12 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((-3599948L), locale7);
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str12 = dateTimeZone11.toString();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone11.getOffset(readableInstant13);
        long long16 = dateTimeZone11.nextTransition((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long20 = dateTimeZone11.getMillisKeepLocal(dateTimeZone18, 10L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (-25200000L));
        java.lang.String str24 = dateTimeZone11.getNameKey(8275999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "148) test0426(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky "136) test0426(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:35" + "'", str12, "+01:35");
// flaky "112) test0426(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5700000 + "'", int14 == 5700000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky "90) test0426(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5700010L + "'", long20 == 5700010L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-25200000L) + "'", long22 == (-25200000L));
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long12 = dateTimeZone1.adjustOffset((long) (short) 10, true);
        long long15 = dateTimeZone1.adjustOffset((long) ' ', true);
        int int17 = dateTimeZone1.getOffsetFromLocal((-50399950L));
        int int19 = dateTimeZone1.getOffsetFromLocal(34L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "149) test0427(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
// flaky "137) test0427(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5700000 + "'", int17 == 5700000);
// flaky "113) test0427(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5700000 + "'", int19 == 5700000);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        int int3 = dateTimeZone1.getOffsetFromLocal((-25199989L));
        boolean boolean5 = dateTimeZone1.isStandardOffset(36000010L);
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
        java.lang.String str23 = dateTimeZone9.getName((long) (short) -1);
        long long25 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (-50399950L));
        boolean boolean27 = dateTimeZone9.isStandardOffset(0L);
        java.lang.String str28 = dateTimeZone9.getID();
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = dateTimeZone9.isLocalDateTimeGap(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600000 + "'", int3 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
// flaky "150) test0428(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5700000 + "'", int13 == 5700000);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky "138) test0428(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+01:35");
// flaky "114) test0428(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+01:35" + "'", str17, "+01:35");
// flaky "91) test0428(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+01:35" + "'", str20, "+01:35");
// flaky "65) test0428(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+01:35" + "'", str21, "+01:35");
// flaky "53) test0428(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+01:35" + "'", str23, "+01:35");
// flaky "41) test0428(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-52499950L) + "'", long25 == (-52499950L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky "32) test0428(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+01:35" + "'", str28, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        boolean boolean8 = dateTimeZone3.isFixed();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getName((-1L), locale10);
        java.lang.String str12 = dateTimeZone3.getID();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone3.getName((-3599948L), locale14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "151) test0429(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "139) test0429(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:35" + "'", str11, "+01:35");
// flaky "115) test0429(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:35" + "'", str12, "+01:35");
// flaky "92) test0429(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+01:35" + "'", str15, "+01:35");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 1);
        java.lang.String str4 = dateTimeZone2.getShortName((-61199999L));
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone2.getOffset(readableInstant5);
        java.util.TimeZone timeZone7 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:01" + "'", str4, "+01:01");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3660000 + "'", int6 == 3660000);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+01:01");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        java.lang.String str23 = dateTimeZone3.toString();
        long long27 = dateTimeZone3.convertLocalToUTC((long) 36060000, false, 25200002L);
        boolean boolean29 = dateTimeZone3.isStandardOffset(10800011L);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone3.getName(3600010L, locale31);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.001" + "'", str23, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 36059999L + "'", long27 == 36059999L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.001" + "'", str32, "+00:00:00.001");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider1 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider1);
        java.lang.Class<?> wildcardClass4 = nameProvider1.getClass();
        boolean boolean5 = dateTimeZone0.equals((java.lang.Object) nameProvider1);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        java.lang.String str7 = dateTimeZone0.toString();
        org.joda.time.tz.Provider provider8 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider8);
        org.joda.time.DateTimeZone.setProvider(provider8);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) provider8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone13.getOffset(readableInstant14);
        java.lang.String str16 = dateTimeZone13.getID();
        long long18 = dateTimeZone0.getMillisKeepLocal(dateTimeZone13, (-32400000L));
        java.lang.Object obj19 = dateTimeZone0.writeReplace();
        long long21 = dateTimeZone0.previousTransition((long) (short) 1);
        java.util.TimeZone timeZone22 = dateTimeZone0.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(nameProvider1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(provider8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-32399999L) + "'", long18 == (-32399999L));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        long long20 = dateTimeZone3.convertLocalToUTC((long) (byte) 1, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        long long24 = dateTimeZone20.getMillisKeepLocal(dateTimeZone22, (long) 'a');
        int int26 = dateTimeZone22.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone27 = dateTimeZone22.toTimeZone();
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone22.getShortName((long) (byte) 100, locale29);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone22.getShortName((long) (short) 0, locale32);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        long long39 = dateTimeZone35.getMillisKeepLocal(dateTimeZone37, (long) 'a');
        int int41 = dateTimeZone37.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone42 = dateTimeZone37.toTimeZone();
        java.util.TimeZone timeZone43 = dateTimeZone37.toTimeZone();
        long long45 = dateTimeZone22.getMillisKeepLocal(dateTimeZone37, (long) (short) 10);
        boolean boolean47 = dateTimeZone22.isStandardOffset((long) (byte) 0);
        long long49 = dateTimeZone10.getMillisKeepLocal(dateTimeZone22, 33L);
        boolean boolean51 = dateTimeZone22.isStandardOffset(161L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "152) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
// flaky "140) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
// flaky "116) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36000000 + "'", int16 == 36000000);
// flaky "93) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-49L) + "'", long18 == (-49L));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
// flaky "66) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 36000000 + "'", int26 == 36000000);
        org.junit.Assert.assertNotNull(timeZone27);
// flaky "54) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+10:00");
// flaky "42) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+10:00" + "'", str30, "+10:00");
// flaky "33) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+10:00" + "'", str33, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 97L + "'", long39 == 97L);
// flaky "19) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 36000000 + "'", int41 == 36000000);
        org.junit.Assert.assertNotNull(timeZone42);
// flaky "15) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone43);
// flaky "9) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 33L + "'", long49 == 33L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
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
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.lang.String str13 = dateTimeZone3.getName(0L);
        long long16 = dateTimeZone3.convertLocalToUTC(51L, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "153) test0435(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "141) test0435(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
// flaky "117) test0435(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
// flaky "94) test0435(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
// flaky "67) test0435(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-35999949L) + "'", long16 == (-35999949L));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone18.getName(28799999L, locale35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "154) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "142) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
// flaky "118) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
// flaky "95) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky "68) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36000000 + "'", int22 == 36000000);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "55) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+10:00");
// flaky "43) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 36000000 + "'", int25 == 36000000);
// flaky "34) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+10:00" + "'", str27, "+10:00");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-61199947L) + "'", long31 == (-61199947L));
// flaky "20) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+10:00" + "'", str32, "+10:00");
        org.junit.Assert.assertNotNull(timeZone33);
// flaky "16) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "GMT+10:00");
// flaky "10) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+10:00" + "'", str36, "+10:00");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        boolean boolean6 = dateTimeZone1.isStandardOffset((-25199990L));
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.lang.String str6 = dateTimeZone5.getID();
        long long8 = dateTimeZone5.previousTransition((-1L));
        long long11 = dateTimeZone5.convertLocalToUTC((long) 10, true);
        java.lang.String str13 = dateTimeZone5.getName((-25200000L));
        java.lang.String str15 = dateTimeZone5.getNameKey((-50399948L));
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-50399948L));
        java.lang.String str18 = dateTimeZone1.getID();
        java.util.TimeZone timeZone19 = dateTimeZone1.toTimeZone();
        int int21 = dateTimeZone1.getOffsetFromLocal(2100052L);
        long long23 = dateTimeZone1.previousTransition((-92159849L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky "155) test0439(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
// flaky "143) test0439(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-35999990L) + "'", long11 == (-35999990L));
// flaky "119) test0439(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertNull(str15);
// flaky "96) test0439(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-86399848L) + "'", long17 == (-86399848L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-92159849L) + "'", long23 == (-92159849L));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        java.lang.String str4 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        boolean boolean7 = dateTimeZone6.isFixed();
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) boolean7);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        boolean boolean11 = dateTimeZone1.isStandardOffset(0L);
        java.lang.String str13 = dateTimeZone1.getNameKey((long) (byte) 1);
        int int15 = dateTimeZone1.getOffsetFromLocal(60100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "156) test0440(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "144) test0440(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
// flaky "120) test0440(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36000000 + "'", int15 == 36000000);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        boolean boolean28 = dateTimeZone3.isStandardOffset((long) (byte) 0);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone3.getName(32L, locale30);
        long long33 = dateTimeZone3.nextTransition(53L);
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone3.isLocalDateTimeGap(localDateTime34);
        java.lang.Object obj36 = dateTimeZone3.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "157) test0441(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "145) test0441(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
// flaky "121) test0441(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
// flaky "97) test0441(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky "69) test0441(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36000000 + "'", int22 == 36000000);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "56) test0441(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone24);
// flaky "44) test0441(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky "35) test0441(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+10:00" + "'", str31, "+10:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 53L + "'", long33 == 53L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-45299803L), locale4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "158) test0442(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
// flaky "146) test0442(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getStandardOffset(34L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.lang.String str9 = dateTimeZone1.getName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "159) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "147) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        int int18 = dateTimeZone3.getOffsetFromLocal(25199999L);
        java.lang.String str19 = dateTimeZone3.getID();
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone3.isLocalDateTimeGap(localDateTime20);
        long long23 = dateTimeZone3.convertUTCToLocal(33L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "160) test0444(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "148) test0444(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
// flaky "122) test0444(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
// flaky "98) test0444(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
// flaky "70) test0444(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32400052L + "'", long16 == 32400052L);
// flaky "57) test0444(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36000000 + "'", int18 == 36000000);
// flaky "45) test0444(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+10:00" + "'", str19, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "36) test0444(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 36000033L + "'", long23 == 36000033L);
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        boolean boolean12 = dateTimeZone3.isStandardOffset((long) 1);
        long long14 = dateTimeZone3.convertUTCToLocal((long) ' ');
        java.lang.String str15 = dateTimeZone3.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "161) test0445(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "149) test0445(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
// flaky "123) test0445(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "99) test0445(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 36000032L + "'", long14 == 36000032L);
// flaky "71) test0445(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+10:00" + "'", str15, "+10:00");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 1);
        java.lang.String str4 = dateTimeZone2.getShortName((-61199999L));
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone2.getOffset(readableInstant5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        boolean boolean13 = dateTimeZone8.isFixed();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone8.getShortName((long) '4', locale15);
        java.lang.String str17 = dateTimeZone8.toString();
        java.lang.String str19 = dateTimeZone8.getName((long) (byte) -1);
        int int21 = dateTimeZone8.getStandardOffset((long) (-1));
        long long23 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, (-30899947L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:01" + "'", str4, "+01:01");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3660000 + "'", int6 == 3660000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "162) test0446(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
// flaky "150) test0446(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
// flaky "124) test0446(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+10:00" + "'", str19, "+10:00");
// flaky "100) test0446(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36000000 + "'", int21 == 36000000);
// flaky "72) test0446(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-63239947L) + "'", long23 == (-63239947L));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        boolean boolean4 = dateTimeZone1.isFixed();
        int int6 = dateTimeZone1.getStandardOffset((long) (-1));
        long long8 = dateTimeZone1.previousTransition((-35999965L));
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-35999965L) + "'", long8 == (-35999965L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getName((long) 10);
        int int13 = dateTimeZone1.getOffsetFromLocal(0L);
        long long16 = dateTimeZone1.adjustOffset((-40199941L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "163) test0448(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
// flaky "151) test0448(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
// flaky "125) test0448(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36000000 + "'", int13 == 36000000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-40199941L) + "'", long16 == (-40199941L));
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
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.toString();
        java.lang.String str9 = dateTimeZone1.getShortName((-25199899L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long14 = dateTimeZone1.convertLocalToUTC(4200037L, false, (-57599947L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 4200036L + "'", long14 == 4200036L);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        long long11 = dateTimeZone1.convertLocalToUTC((-61199999L), false, 0L);
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "164) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "152) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11L + "'", long7 == 11L);
// flaky "126) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-61199998L) + "'", long11 == (-61199998L));
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        long long6 = dateTimeZone1.nextTransition((long) (byte) 100);
        long long9 = dateTimeZone1.adjustOffset((long) ' ', true);
        boolean boolean11 = dateTimeZone1.isStandardOffset(100L);
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "165) test0451(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "153) test0451(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
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
        boolean boolean28 = dateTimeZone3.isStandardOffset((long) (byte) 0);
        long long30 = dateTimeZone3.nextTransition(10L);
        java.lang.Object obj31 = dateTimeZone3.writeReplace();
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = dateTimeZone3.getOffset(readableInstant32);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long37 = dateTimeZone35.previousTransition((-25199990L));
        long long39 = dateTimeZone35.previousTransition(52L);
        long long41 = dateTimeZone35.nextTransition(11L);
        long long43 = dateTimeZone3.getMillisKeepLocal(dateTimeZone35, (-5699948L));
        boolean boolean44 = dateTimeZone35.isFixed();
        java.lang.String str46 = dateTimeZone35.getShortName((-61199946L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "166) test0452(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "154) test0452(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "127) test0452(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky "101) test0452(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(obj31);
// flaky "73) test0452(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-25199990L) + "'", long37 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 52L + "'", long39 == 52L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 11L + "'", long41 == 11L);
// flaky "58) test0452(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-9299949L) + "'", long43 == (-9299949L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+01:00" + "'", str46, "+01:00");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        java.lang.String str16 = dateTimeZone1.getNameKey((long) (-1));
        int int18 = dateTimeZone1.getOffset((-148L));
        java.lang.Object obj19 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "167) test0453(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
// flaky "155) test0453(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
// flaky "128) test0453(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
// flaky "102) test0453(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone18.getName(8275999L, locale20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "168) test0454(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
// flaky "156) test0454(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-25199899L) + "'", long14 == (-25199899L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        long long3 = dateTimeZone1.convertUTCToLocal((-25199989L));
        long long5 = dateTimeZone1.nextTransition((-61199947L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-25199989L) + "'", long3 == (-25199989L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-61199947L) + "'", long5 == (-61199947L));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        boolean boolean28 = dateTimeZone3.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long32 = dateTimeZone3.getMillisKeepLocal(dateTimeZone30, 52L);
        org.joda.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = dateTimeZone30.isLocalDateTimeGap(localDateTime33);
        long long37 = dateTimeZone30.convertLocalToUTC(61200002L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "169) test0457(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "157) test0457(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "129) test0457(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky "103) test0457(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTimeZone30);
// flaky "74) test0457(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-49L) + "'", long32 == (-49L));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 61199902L + "'", long37 == 61199902L);
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
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.toString();
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        boolean boolean9 = dateTimeZone1.isFixed();
        long long11 = dateTimeZone1.nextTransition(0L);
        int int13 = dateTimeZone1.getOffsetFromLocal((-32400000L));
        java.lang.String str14 = dateTimeZone1.getID();
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) 5700034L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "170) test0458(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
// flaky "158) test0458(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky "130) test0458(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        long long18 = dateTimeZone16.previousTransition(12L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "171) test0459(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
// flaky "159) test0459(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-25199899L) + "'", long14 == (-25199899L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 12L + "'", long18 == 12L);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str5 = dateTimeZone1.getShortName((long) (-1));
        long long9 = dateTimeZone1.convertLocalToUTC(0L, true, (-25199948L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "172) test0460(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "160) test0460(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "131) test0460(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
// flaky "104) test0460(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        long long20 = dateTimeZone1.convertUTCToLocal((long) 3660000);
        long long22 = dateTimeZone1.nextTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "173) test0461(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
// flaky "161) test0461(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
// flaky "132) test0461(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25199946L) + "'", long16 == (-25199946L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 36000000L + "'", long18 == 36000000L);
// flaky "105) test0461(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3659999L + "'", long20 == 3659999L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        boolean boolean7 = dateTimeZone1.isStandardOffset((-25200000L));
        java.lang.String str8 = dateTimeZone1.toString();
        java.lang.String str10 = dateTimeZone1.getName((long) 25200000);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "174) test0463(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "162) test0463(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long5 = dateTimeZone1.nextTransition((-50399948L));
        int int7 = dateTimeZone1.getOffsetFromLocal(52L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-50399847L), locale9);
        boolean boolean11 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-50399948L) + "'", long5 == (-50399948L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        long long5 = dateTimeZone1.previousTransition(25200100L);
        java.lang.String str7 = dateTimeZone1.getName((long) '#');
        java.lang.String str8 = dateTimeZone1.toString();
        long long11 = dateTimeZone1.convertLocalToUTC((-25199899L), true);
        int int13 = dateTimeZone1.getOffsetFromLocal(36000100L);
        java.lang.String str15 = dateTimeZone1.getNameKey(3600100L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getName((-5699899L), locale17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25200100L + "'", long5 == 25200100L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-25199898L) + "'", long11 == (-25199898L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        int int28 = dateTimeZone1.getOffsetFromLocal((-47L));
        int int30 = dateTimeZone1.getStandardOffset((-25199945L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "175) test0466(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "163) test0466(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
// flaky "133) test0466(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
// flaky "106) test0466(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
// flaky "75) test0466(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
// flaky "59) test0466(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
// flaky "46) test0466(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str5 = dateTimeZone1.getShortName((long) (-1));
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        long long9 = dateTimeZone1.adjustOffset((-35999948L), true);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone11.getName((long) (short) 1, locale17);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        long long22 = dateTimeZone11.adjustOffset((long) (short) 10, true);
        java.lang.Object obj23 = dateTimeZone11.writeReplace();
        int int25 = dateTimeZone11.getStandardOffset((long) (-1));
        int int27 = dateTimeZone11.getStandardOffset((-1570084924000L));
        long long31 = dateTimeZone11.convertLocalToUTC(0L, false, (long) 10);
        java.lang.String str32 = dateTimeZone11.toString();
        long long34 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (-10800000L));
        java.lang.Object obj35 = dateTimeZone11.writeReplace();
        java.lang.Class<?> wildcardClass36 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "176) test0467(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "164) test0467(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-35999948L) + "'", long9 == (-35999948L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "134) test0467(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(obj23);
// flaky "107) test0467(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
// flaky "76) test0467(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
// flaky "60) test0467(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
// flaky "47) test0467(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-10800000L) + "'", long34 == (-10800000L));
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((-3599948L), locale7);
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long13 = dateTimeZone11.previousTransition((long) (short) 100);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        long long19 = dateTimeZone15.getMillisKeepLocal(dateTimeZone17, (long) 'a');
        boolean boolean21 = dateTimeZone15.isStandardOffset((-25200000L));
        java.lang.String str22 = dateTimeZone15.toString();
        long long24 = dateTimeZone11.getMillisKeepLocal(dateTimeZone15, (-25199900L));
        java.lang.String str26 = dateTimeZone11.getNameKey((-25199899L));
        boolean boolean27 = dateTimeZone1.equals((java.lang.Object) dateTimeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "177) test0468(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky "165) test0468(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
// flaky "135) test0468(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-25199899L) + "'", long24 == (-25199899L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(6720000, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (byte) 10);
        java.lang.String str3 = dateTimeZone2.toString();
        long long5 = dateTimeZone2.convertUTCToLocal((-25199998L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:10" + "'", str3, "+10:10");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11400002L + "'", long5 == 11400002L);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long3 = dateTimeZone1.previousTransition((long) (short) 100);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        long long8 = dateTimeZone1.convertLocalToUTC(100L, true, (long) (byte) 0);
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        long long5 = dateTimeZone1.convertLocalToUTC((-3599948L), true, (-25199989L));
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        long long9 = dateTimeZone1.nextTransition((-48L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3599948L) + "'", long5 == (-3599948L));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-48L) + "'", long9 == (-48L));
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.lang.String str12 = dateTimeZone3.toString();
        boolean boolean14 = dateTimeZone3.isStandardOffset(0L);
        long long18 = dateTimeZone3.convertLocalToUTC((long) ' ', true, (long) 25200000);
        long long20 = dateTimeZone3.nextTransition(0L);
        int int22 = dateTimeZone3.getOffsetFromLocal(5100000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "178) test0474(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "166) test0474(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "136) test0474(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
// flaky "108) test0474(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "77) test0474(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 31L + "'", long18 == 31L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
// flaky "61) test0474(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long3 = dateTimeZone1.previousTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal((long) 25200000);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((-28799997L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str5 = dateTimeZone1.getShortName((long) (-1));
        int int7 = dateTimeZone1.getOffsetFromLocal((-61199947L));
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "179) test0476(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
// flaky "167) test0476(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
// flaky "137) test0476(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition(97L);
        long long6 = dateTimeZone1.convertUTCToLocal(32L);
        java.lang.String str7 = dateTimeZone1.getID();
        int int9 = dateTimeZone1.getOffsetFromLocal(7200053L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "180) test0477(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
// flaky "168) test0477(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 33L + "'", long6 == 33L);
// flaky "138) test0477(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
// flaky "109) test0477(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition(97L);
        int int6 = dateTimeZone1.getOffset((long) (byte) 0);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        boolean boolean11 = dateTimeZone10.isFixed();
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, 96L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName(10800011L, locale15);
        long long20 = dateTimeZone1.convertLocalToUTC(35999950L, true, 10800011L);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone1.getOffset(readableInstant21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "181) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
// flaky "169) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
// flaky "139) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "110) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 62L + "'", long13 == 62L);
// flaky "78) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
// flaky "62) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35999949L + "'", long20 == 35999949L);
// flaky "48) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) '4', locale8);
        java.lang.String str10 = dateTimeZone1.toString();
        long long13 = dateTimeZone1.convertLocalToUTC((long) '4', false);
        long long17 = dateTimeZone1.convertLocalToUTC((long) 25200000, false, (-1570060800001L));
        java.lang.String str19 = dateTimeZone1.getNameKey((long) 0);
        long long21 = dateTimeZone1.nextTransition(5700000L);
        java.lang.String str23 = dateTimeZone1.getShortName((-102900000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "182) test0481(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
// flaky "170) test0481(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
// flaky "140) test0481(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 51L + "'", long13 == 51L);
// flaky "111) test0481(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 25199999L + "'", long17 == 25199999L);
// flaky "79) test0481(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5700000L + "'", long21 == 5700000L);
// flaky "63) test0481(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.001" + "'", str23, "+00:00:00.001");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        java.lang.Class<?> wildcardClass7 = nameProvider4.getClass();
        boolean boolean8 = dateTimeZone3.equals((java.lang.Object) nameProvider4);
        java.lang.Object obj9 = dateTimeZone3.writeReplace();
        java.lang.String str10 = dateTimeZone3.toString();
        org.joda.time.tz.Provider provider11 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider11);
        org.joda.time.DateTimeZone.setProvider(provider11);
        boolean boolean14 = dateTimeZone3.equals((java.lang.Object) provider11);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone16.getOffset(readableInstant17);
        java.lang.String str19 = dateTimeZone16.getID();
        long long21 = dateTimeZone3.getMillisKeepLocal(dateTimeZone16, (-32400000L));
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) (-32400000L));
        java.util.TimeZone timeZone23 = dateTimeZone1.toTimeZone();
        int int25 = dateTimeZone1.getOffsetFromLocal((-61199947L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-32399999L) + "'", long21 == (-32399999L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getOffset((-25199899L));
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.lang.String str8 = dateTimeZone1.getID();
        int int10 = dateTimeZone1.getStandardOffset((long) (byte) 1);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(3600000);
        long long25 = dateTimeZone3.getMillisKeepLocal(dateTimeZone23, 0L);
        java.lang.String str26 = dateTimeZone3.toString();
        java.lang.Object obj27 = dateTimeZone3.writeReplace();
        java.lang.String str29 = dateTimeZone3.getShortName((-14399949L));
        long long32 = dateTimeZone3.adjustOffset(5700010L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "183) test0484(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "171) test0484(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "141) test0484(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky "112) test0484(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
// flaky "80) test0484(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25199999L + "'", long15 == 25199999L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 53L + "'", long20 == 53L);
// flaky "64) test0484(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.001" + "'", str21, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone23);
// flaky "49) test0484(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-3599999L) + "'", long25 == (-3599999L));
// flaky "37) test0484(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.001" + "'", str26, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj27);
// flaky "21) test0484(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.001" + "'", str29, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5700010L + "'", long32 == 5700010L);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone3.nextTransition((long) (short) 100);
        java.lang.String str6 = dateTimeZone3.toString();
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 53L);
        long long10 = dateTimeZone3.nextTransition((-5700000L));
        java.lang.Class<?> wildcardClass11 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky "184) test0485(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
// flaky "172) test0485(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600052L + "'", long8 == 3600052L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-5700000L) + "'", long10 == (-5700000L));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        java.util.TimeZone timeZone30 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
// flaky "185) test0486(org.joda.time.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "173) test0486(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
// flaky "142) test0486(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
// flaky "113) test0486(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky "81) test0486(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
// flaky "65) test0486(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.001" + "'", str23, "+00:00:00.001");
// flaky "50) test0486(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 11L + "'", long28 == 11L);
        org.junit.Assert.assertNotNull(timeZone30);
// flaky "38) test0486(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone3.getMillisKeepLocal(dateTimeZone5, (long) 'a');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone3.getShortName((-3599948L), locale9);
        java.lang.Object obj11 = dateTimeZone3.writeReplace();
        boolean boolean12 = dateTimeZone0.equals(obj11);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
// flaky "186) test0487(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        long long6 = dateTimeZone1.nextTransition((-25199900L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int11 = dateTimeZone1.getStandardOffset((long) (byte) -1);
        java.lang.String str13 = dateTimeZone1.getName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199900L) + "'", long6 == (-25199900L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        java.lang.String str3 = dateTimeZone1.getShortName((-49L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int6 = dateTimeZone1.getOffsetFromLocal((-25199899L));
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        long long10 = dateTimeZone1.nextTransition((-61199895L));
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:00" + "'", str3, "+10:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36000000 + "'", int6 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-61199895L) + "'", long10 == (-61199895L));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        boolean boolean7 = dateTimeZone1.isFixed();
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) (short) 1);
        int int11 = dateTimeZone1.getStandardOffset(36L);
        java.lang.String str13 = dateTimeZone1.getNameKey(25200010L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName((-5699902L), locale15);
        long long18 = dateTimeZone1.previousTransition((long) 35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36000000 + "'", int11 == 36000000);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
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
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long32 = dateTimeZone28.getMillisKeepLocal(dateTimeZone30, (long) 'a');
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone28.getName((long) (short) 1, locale34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        java.lang.String str38 = dateTimeZone28.getName((long) 10);
        boolean boolean39 = dateTimeZone18.equals((java.lang.Object) str38);
        long long41 = dateTimeZone18.convertUTCToLocal((long) ' ');
        boolean boolean43 = dateTimeZone18.isStandardOffset(11875999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36000000 + "'", int22 == 36000000);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+10:00" + "'", str35, "+10:00");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+10:00" + "'", str38, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 36000032L + "'", long41 == 36000032L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((-3599948L), locale7);
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str12 = dateTimeZone11.toString();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone11.getOffset(readableInstant13);
        long long16 = dateTimeZone11.nextTransition((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long20 = dateTimeZone11.getMillisKeepLocal(dateTimeZone18, 10L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (-25200000L));
        boolean boolean23 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36000000 + "'", int14 == 36000000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 36000010L + "'", long20 == 36000010L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-25200000L) + "'", long22 == (-25200000L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.lang.String str6 = dateTimeZone5.getID();
        long long8 = dateTimeZone5.previousTransition((-1L));
        long long11 = dateTimeZone5.convertLocalToUTC((long) 10, true);
        java.lang.String str13 = dateTimeZone5.getName((-25200000L));
        java.lang.String str15 = dateTimeZone5.getNameKey((-50399948L));
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-50399948L));
        java.lang.String str18 = dateTimeZone1.getID();
        long long20 = dateTimeZone1.convertUTCToLocal((long) (-1));
        java.util.TimeZone timeZone21 = dateTimeZone1.toTimeZone();
        java.lang.String str23 = dateTimeZone1.getName((-1570060800001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-35999990L) + "'", long11 == (-35999990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-86399848L) + "'", long17 == (-86399848L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 99L + "'", long20 == 99L);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.convertUTCToLocal(33L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName(62L, locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
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
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((-3599948L), locale7);
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str12 = dateTimeZone11.toString();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone11.getOffset(readableInstant13);
        long long16 = dateTimeZone11.nextTransition((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long20 = dateTimeZone11.getMillisKeepLocal(dateTimeZone18, 10L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (-25200000L));
        java.lang.String str23 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36000000 + "'", int14 == 36000000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 36000010L + "'", long20 == 36000010L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-25200000L) + "'", long22 == (-25200000L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+10:00" + "'", str23, "+10:00");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long7 = dateTimeZone4.convertLocalToUTC((-1570084924001L), false);
        int int9 = dateTimeZone4.getOffsetFromLocal((-1570084924000L));
        java.lang.String str11 = dateTimeZone4.getShortName((long) (short) 1);
        int int13 = dateTimeZone4.getOffsetFromLocal((long) (byte) 100);
        int int15 = dateTimeZone4.getOffset((long) (-1));
        long long17 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (-25199900L));
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.tz.NameProvider nameProvider19 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider19);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider19);
        java.lang.Class<?> wildcardClass22 = nameProvider19.getClass();
        boolean boolean23 = dateTimeZone18.equals((java.lang.Object) nameProvider19);
        java.lang.Object obj24 = dateTimeZone18.writeReplace();
        java.lang.String str25 = dateTimeZone18.toString();
        int int27 = dateTimeZone18.getOffsetFromLocal((-2L));
        boolean boolean28 = dateTimeZone18.isFixed();
        boolean boolean29 = dateTimeZone4.equals((java.lang.Object) dateTimeZone18);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone4.getName(16500099L, locale31);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570084924000L) + "'", long7 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-21599899L) + "'", long17 == (-21599899L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(nameProvider19);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone20.getOffset(readableInstant34);
        java.lang.Object obj36 = dateTimeZone20.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+10:00" + "'", str7, "+10:00");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-61199947L) + "'", long16 == (-61199947L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 36000000L + "'", long18 == 36000000L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-49L) + "'", long28 == (-49L));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 61200002L + "'", long31 == 61200002L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        long long28 = dateTimeZone18.previousTransition((long) (byte) -1);
        long long30 = dateTimeZone18.convertUTCToLocal((-3599948L));
        boolean boolean31 = dateTimeZone18.isFixed();
        java.lang.String str32 = dateTimeZone18.toString();
        java.lang.String str33 = dateTimeZone18.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36000000 + "'", int22 == 36000000);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32400052L + "'", long30 == 32400052L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+10:00" + "'", str32, "+10:00");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+10:00" + "'", str33, "+10:00");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        int int3 = dateTimeZone1.getStandardOffset((-50399948L));
        java.lang.Object obj4 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName((long) (short) 1, locale12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        java.lang.String str16 = dateTimeZone6.getName((long) 10);
        java.lang.String str17 = dateTimeZone6.toString();
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (-25199998L));
        long long23 = dateTimeZone1.convertLocalToUTC(51L, false, (long) 5700000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-61199998L) + "'", long19 == (-61199998L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 51L + "'", long23 == 51L);
    }
}
