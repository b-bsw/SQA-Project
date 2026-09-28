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
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone0.getName(100L, locale6);
        java.lang.Class<?> wildcardClass8 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
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
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.lang.String str9 = dateTimeZone0.getName((long) (byte) 10);
        int int11 = dateTimeZone0.getStandardOffset(0L);
        java.lang.Class<?> wildcardClass12 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        java.lang.Class<?> wildcardClass1 = provider0.getClass();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
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
        java.lang.Class<?> wildcardClass19 = dateTimeZone0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone0.getShortName((long) (short) -1, locale3);
        java.lang.Class<?> wildcardClass5 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        long long10 = dateTimeZone0.nextTransition((-3600000L));
        long long12 = dateTimeZone0.previousTransition((long) (short) 1);
        java.lang.Class<?> wildcardClass13 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3600000L) + "'", long10 == (-3600000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((long) (short) -1, locale7);
        int int10 = dateTimeZone0.getOffset((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((long) 100);
        java.lang.String str4 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertUTCToLocal(10L);
        long long8 = dateTimeZone1.nextTransition((long) (-3600000));
        boolean boolean9 = dateTimeZone1.isFixed();
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3600010L + "'", long6 == 3600010L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3600000L) + "'", long8 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+32:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+32:00\" is malformed at \"32:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        long long12 = dateTimeZone0.previousTransition(10L);
        int int14 = dateTimeZone0.getOffsetFromLocal(10L);
        java.lang.Class<?> wildcardClass15 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115200000, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
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
        int int29 = dateTimeZone4.getStandardOffset(1L);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
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
        java.lang.Class<?> wildcardClass23 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone10 = dateTimeZone7.toTimeZone();
        long long12 = dateTimeZone7.convertUTCToLocal((long) ' ');
        java.lang.Class<?> wildcardClass13 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
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
        java.lang.Class<?> wildcardClass19 = dateTimeZone0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        int int7 = dateTimeZone0.getStandardOffset(0L);
        boolean boolean9 = dateTimeZone0.isStandardOffset((long) (short) 100);
        java.lang.Class<?> wildcardClass10 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (byte) 10);
        java.lang.Object obj4 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        int int9 = dateTimeZone1.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean12 = dateTimeZone1.isStandardOffset((long) (-1));
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) ' ');
        java.lang.String str16 = dateTimeZone0.getName((long) (byte) 1);
        long long19 = dateTimeZone0.convertLocalToUTC((long) 100, true);
        long long21 = dateTimeZone0.previousTransition((-1L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        int int9 = dateTimeZone1.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean12 = dateTimeZone1.isStandardOffset((long) (-1));
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) ' ');
        boolean boolean15 = dateTimeZone0.isFixed();
        long long18 = dateTimeZone0.convertLocalToUTC((long) 0, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        long long10 = dateTimeZone0.convertUTCToLocal(1L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
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
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((long) 100);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getNameKey((long) 10);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:00" + "'", str5, "+01:00");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone10 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long13 = dateTimeZone11.previousTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        int int17 = dateTimeZone15.getStandardOffset((long) 115200000);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        long long24 = dateTimeZone20.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone20.getName(100L, locale26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = dateTimeZone20.getOffset(readableInstant28);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        long long32 = dateTimeZone19.getMillisKeepLocal(dateTimeZone20, (long) 100);
        boolean boolean33 = dateTimeZone15.equals((java.lang.Object) dateTimeZone20);
        long long35 = dateTimeZone11.getMillisKeepLocal(dateTimeZone20, (long) (short) 100);
        int int37 = dateTimeZone20.getOffset(100L);
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
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3600000 + "'", int17 == 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        java.lang.String str11 = dateTimeZone0.getShortName((long) (short) 10);
        int int13 = dateTimeZone0.getStandardOffset((-3599900L));
        java.lang.Class<?> wildcardClass14 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.lang.String str3 = dateTimeZone1.getShortName((long) (byte) 100);
        long long6 = dateTimeZone1.convertLocalToUTC((long) '4', true);
        java.lang.String str7 = dateTimeZone1.toString();
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.010" + "'", str3, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 42L + "'", long6 == 42L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.010" + "'", str7, "+00:00:00.010");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone10 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long16 = dateTimeZone12.convertLocalToUTC(3600000L, true, (long) (-1));
        java.lang.String str17 = dateTimeZone12.toString();
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
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3600000L + "'", long16 == 3600000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long12 = dateTimeZone0.convertLocalToUTC(0L, false);
        java.lang.String str14 = dateTimeZone0.getName((long) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        boolean boolean8 = dateTimeZone0.isStandardOffset(0L);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        java.lang.String str11 = dateTimeZone0.getShortName((long) '4');
        java.lang.String str12 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((long) 100);
        java.lang.String str4 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertUTCToLocal(10L);
        long long8 = dateTimeZone1.nextTransition((long) (-3600000));
        boolean boolean9 = dateTimeZone1.isFixed();
        java.lang.String str11 = dateTimeZone1.getNameKey((long) 1);
        boolean boolean12 = dateTimeZone1.isFixed();
        java.lang.String str13 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3600010L + "'", long6 == 3600010L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3600000L) + "'", long8 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:00" + "'", str13, "+01:00");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        java.lang.String str11 = dateTimeZone0.getShortName((long) (short) 10);
        int int13 = dateTimeZone0.getStandardOffset((-3599900L));
        long long15 = dateTimeZone0.convertUTCToLocal((long) (short) 0);
        java.lang.Class<?> wildcardClass16 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.Class<?> wildcardClass10 = timeZone8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone0.getShortName((long) (short) -1, locale3);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone0.isLocalDateTimeGap(localDateTime5);
        java.lang.String str8 = dateTimeZone0.getName(111600000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
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
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone3.getName(1L, locale19);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.String str8 = dateTimeZone7.toString();
        java.lang.Class<?> wildcardClass9 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        long long7 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, 10L);
        boolean boolean9 = dateTimeZone0.isStandardOffset(1L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((long) 100);
        java.lang.String str4 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertUTCToLocal(10L);
        long long8 = dateTimeZone1.nextTransition((long) (-3600000));
        boolean boolean9 = dateTimeZone1.isFixed();
        java.lang.String str11 = dateTimeZone1.getNameKey((long) 1);
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3600010L + "'", long6 == 3600010L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3600000L) + "'", long8 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = dateTimeZone0.writeReplace();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffsetFromLocal((long) (short) 0);
        boolean boolean10 = dateTimeZone7.isFixed();
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone7.getOffset(readableInstant11);
        java.lang.Class<?> wildcardClass13 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((long) (short) -1, locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName(35L, locale10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
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
        long long19 = dateTimeZone16.convertLocalToUTC((long) (-3600000), true);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-3600000L) + "'", long19 == (-3600000L));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115200000, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        long long10 = dateTimeZone0.nextTransition((-3600000L));
        int int12 = dateTimeZone0.getOffset((long) (byte) 1);
        boolean boolean14 = dateTimeZone0.isStandardOffset(0L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone0.getShortName((long) (byte) 1, locale16);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3600000L) + "'", long10 == (-3600000L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(187200000);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        long long10 = dateTimeZone0.previousTransition((long) 100);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getShortName(35L, locale12);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone0.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187200000, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        long long4 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, (long) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 36000001L + "'", long4 == 36000001L);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
        boolean boolean34 = dateTimeZone6.isFixed();
        int int36 = dateTimeZone6.getStandardOffset((long) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((long) (short) -1, locale7);
        long long11 = dateTimeZone0.convertLocalToUTC((long) (byte) 10, false);
        int int13 = dateTimeZone0.getOffsetFromLocal(3599999L);
        java.lang.Object obj14 = dateTimeZone0.writeReplace();
        int int16 = dateTimeZone0.getOffset(36060000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.convertUTCToLocal((long) 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:00" + "'", str2, "+32:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 230400000L + "'", long4 == 230400000L);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) 1);
        long long4 = dateTimeZone2.previousTransition((long) '#');
        java.lang.String str6 = dateTimeZone2.getNameKey((long) (byte) -1);
        long long8 = dateTimeZone2.nextTransition((long) 0);
        long long10 = dateTimeZone2.nextTransition((long) (short) 100);
        int int12 = dateTimeZone2.getOffsetFromLocal(0L);
        java.lang.Class<?> wildcardClass13 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36060000 + "'", int12 == 36060000);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        long long12 = dateTimeZone0.previousTransition(10L);
        int int14 = dateTimeZone0.getStandardOffset((long) (short) 100);
        long long16 = dateTimeZone0.convertUTCToLocal((-3599890L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599890L) + "'", long16 == (-3599890L));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((long) 100);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getNameKey((long) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) 1);
        java.lang.String str12 = dateTimeZone10.getNameKey((long) (short) 0);
        java.util.TimeZone timeZone13 = dateTimeZone10.toTimeZone();
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (long) '4');
        java.lang.Class<?> wildcardClass16 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffset(1L);
        int int11 = dateTimeZone7.getStandardOffset(3600010L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long10 = dateTimeZone6.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean11 = dateTimeZone6.isFixed();
        java.util.TimeZone timeZone12 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone13, (long) (byte) 10);
        java.lang.Class<?> wildcardClass16 = dateTimeZone13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone5.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean10 = dateTimeZone5.isFixed();
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        java.lang.Object obj12 = dateTimeZone5.writeReplace();
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.lang.String str14 = dateTimeZone1.toString();
        java.lang.String str15 = dateTimeZone1.toString();
        java.lang.Class<?> wildcardClass16 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-01:00" + "'", str14, "-01:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-01:00" + "'", str15, "-01:00");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        long long17 = dateTimeZone0.convertUTCToLocal((long) (byte) 10);
        int int19 = dateTimeZone0.getStandardOffset((long) 3600000);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean7 = dateTimeZone0.isStandardOffset((long) (byte) 1);
        long long10 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        long long16 = dateTimeZone0.convertLocalToUTC(100L, false, 3600010L);
        java.lang.Class<?> wildcardClass17 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115200000, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long4 = dateTimeZone0.convertLocalToUTC(0L, true);
        long long6 = dateTimeZone0.previousTransition((long) 0);
        java.lang.Class<?> wildcardClass7 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone6.getOffset(readableInstant34);
        java.lang.String str36 = dateTimeZone6.getID();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) 1);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        int int6 = dateTimeZone2.getStandardOffset((long) (byte) 1);
        int int8 = dateTimeZone2.getOffsetFromLocal(33000000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36060000 + "'", int6 == 36060000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36060000 + "'", int8 == 36060000);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36060000, 36600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        java.lang.String str14 = dateTimeZone0.getShortName((long) (byte) -1);
        long long16 = dateTimeZone0.nextTransition(52L);
        long long20 = dateTimeZone0.convertLocalToUTC((long) (-1), false, (-3599965L));
        long long22 = dateTimeZone0.nextTransition((long) (byte) 100);
        boolean boolean24 = dateTimeZone0.isStandardOffset((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone10 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long16 = dateTimeZone12.convertLocalToUTC(3600000L, true, (long) (-1));
        long long19 = dateTimeZone12.convertLocalToUTC((-2999965L), false);
        long long23 = dateTimeZone12.convertLocalToUTC((long) 360000000, true, (long) 'a');
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
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3600000L + "'", long16 == 3600000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-2999965L) + "'", long19 == (-2999965L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 360000000L + "'", long23 == 360000000L);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.lang.String str9 = dateTimeZone0.getName((long) (byte) 10);
        int int11 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str12 = dateTimeZone0.toString();
        java.lang.String str13 = dateTimeZone0.toString();
        int int15 = dateTimeZone0.getStandardOffset((long) 100);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        java.lang.String str11 = dateTimeZone0.getShortName((long) (short) 10);
        int int13 = dateTimeZone0.getStandardOffset((-3599900L));
        java.lang.Object obj14 = dateTimeZone0.writeReplace();
        java.lang.String str16 = dateTimeZone0.getNameKey(230400000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        long long21 = dateTimeZone0.convertUTCToLocal(0L);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone0.isLocalDateTimeGap(localDateTime22);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffsetFromLocal((long) (short) 0);
        java.lang.String str11 = dateTimeZone7.getShortName((long) (byte) 10);
        java.lang.String str12 = dateTimeZone7.getID();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long17 = dateTimeZone13.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        boolean boolean20 = dateTimeZone13.isStandardOffset((long) (byte) 1);
        long long23 = dateTimeZone13.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone13.isLocalDateTimeGap(localDateTime24);
        boolean boolean26 = dateTimeZone7.equals((java.lang.Object) dateTimeZone13);
        java.lang.Class<?> wildcardClass27 = dateTimeZone13.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffsetFromLocal((long) (short) 0);
        java.lang.String str11 = dateTimeZone7.getShortName((long) 0);
        int int13 = dateTimeZone7.getOffset(187800001L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
        int int39 = dateTimeZone23.getStandardOffset((long) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36060000, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffset(1L);
        long long11 = dateTimeZone7.previousTransition((long) (byte) 1);
        java.lang.String str13 = dateTimeZone7.getName(1L);
        java.lang.Class<?> wildcardClass14 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (-1));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName((long) (short) -1, locale13);
        int int16 = dateTimeZone0.getStandardOffset((-3599900L));
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone0.getName((long) (byte) 1, locale18);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone5.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean10 = dateTimeZone5.isFixed();
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        java.lang.Object obj12 = dateTimeZone5.writeReplace();
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.lang.String str14 = dateTimeZone1.toString();
        long long18 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, false, 32L);
        int int20 = dateTimeZone1.getOffsetFromLocal((long) 10);
        long long22 = dateTimeZone1.previousTransition(148200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-01:00" + "'", str14, "-01:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3599999L + "'", long18 == 3599999L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3600000) + "'", int20 == (-3600000));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 148200000L + "'", long22 == 148200000L);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str4 = dateTimeZone1.getNameKey(0L);
        long long6 = dateTimeZone1.nextTransition(3600035L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:00" + "'", str2, "+32:00");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3600035L + "'", long6 == 3600035L);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((-115200001L), locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115200000, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone10 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone12.isLocalDateTimeGap(localDateTime13);
        java.lang.String str16 = dateTimeZone12.getName((long) (short) 1);
        java.lang.String str18 = dateTimeZone12.getNameKey(32400001L);
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
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((long) 100);
        java.lang.String str4 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertUTCToLocal(10L);
        long long8 = dateTimeZone1.nextTransition((long) (-3600000));
        boolean boolean9 = dateTimeZone1.isFixed();
        java.lang.String str11 = dateTimeZone1.getNameKey((long) 1);
        boolean boolean12 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3600010L + "'", long6 == 3600010L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3600000L) + "'", long8 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone1.isLocalDateTimeGap(localDateTime20);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone7.nextTransition(1L);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone7.getName(111600000L, locale11);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone10 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        long long14 = dateTimeZone11.nextTransition(3599935L);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3599935L + "'", long14 == 3599935L);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getShortName(0L, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName((long) 3600000, locale13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.lang.String str18 = dateTimeZone16.getShortName((long) (byte) 100);
        long long21 = dateTimeZone16.convertLocalToUTC((long) '4', true);
        java.lang.String str22 = dateTimeZone16.toString();
        boolean boolean23 = dateTimeZone0.equals((java.lang.Object) str22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone0.getShortName(3599935L, locale25);
        long long28 = dateTimeZone0.convertUTCToLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 42L + "'", long21 == 42L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.010" + "'", str22, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        int int9 = dateTimeZone1.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean12 = dateTimeZone1.isStandardOffset((long) (-1));
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) ' ');
        boolean boolean15 = dateTimeZone0.isFixed();
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone0.getName((long) (short) 10, locale17);
        long long20 = dateTimeZone0.previousTransition((-3599999L));
        int int22 = dateTimeZone0.getOffsetFromLocal(111600000L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        long long27 = dateTimeZone23.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean28 = dateTimeZone23.isFixed();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        long long33 = dateTimeZone29.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean34 = dateTimeZone29.isFixed();
        java.util.TimeZone timeZone35 = dateTimeZone29.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        long long38 = dateTimeZone23.getMillisKeepLocal(dateTimeZone36, (long) (byte) 10);
        java.lang.String str39 = dateTimeZone23.getID();
        boolean boolean41 = dateTimeZone23.isStandardOffset((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant42 = null;
        int int43 = dateTimeZone23.getOffset(readableInstant42);
        boolean boolean44 = dateTimeZone0.equals((java.lang.Object) dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-3599999L) + "'", long20 == (-3599999L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UTC" + "'", str39, "UTC");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((long) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal((long) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long3 = dateTimeZone1.previousTransition(10L);
        java.lang.String str5 = dateTimeZone1.getName(32L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName(3599935L, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) 1);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.lang.String str5 = dateTimeZone2.toString();
        int int7 = dateTimeZone2.getStandardOffset(35L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:01" + "'", str5, "+10:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36060000 + "'", int7 == 36060000);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        long long6 = dateTimeZone1.nextTransition((long) 1);
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) 36600000);
        long long10 = dateTimeZone1.convertUTCToLocal(36060100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 39660100L + "'", long10 == 39660100L);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str2 = dateTimeZone0.getID();
        int int4 = dateTimeZone0.getOffset((long) (short) -1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName(100L, locale5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone5.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean10 = dateTimeZone5.isFixed();
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        java.lang.Object obj12 = dateTimeZone5.writeReplace();
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.lang.String str14 = dateTimeZone1.toString();
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        int int18 = dateTimeZone1.getStandardOffset(42L);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone1.getOffset(readableInstant19);
        long long22 = dateTimeZone1.convertUTCToLocal((long) '4');
        java.lang.String str24 = dateTimeZone1.getShortName(230400000L);
        long long26 = dateTimeZone1.convertUTCToLocal(3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-01:00" + "'", str14, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3600000) + "'", int18 == (-3600000));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3600000) + "'", int20 == (-3600000));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3599948L) + "'", long22 == (-3599948L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-01:00" + "'", str24, "-01:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean3 = dateTimeZone0.equals((java.lang.Object) 10L);
        boolean boolean5 = dateTimeZone0.isStandardOffset((long) ' ');
        java.lang.String str7 = dateTimeZone0.getNameKey(0L);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone8.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean13 = dateTimeZone8.isFixed();
        java.util.TimeZone timeZone14 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        int int17 = dateTimeZone15.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone18 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        boolean boolean21 = dateTimeZone0.equals((java.lang.Object) dateTimeZone20);
        java.lang.Class<?> wildcardClass22 = dateTimeZone20.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, false);
        int int6 = dateTimeZone1.getOffsetFromLocal(3600000L);
        java.lang.Object obj7 = null;
        boolean boolean8 = dateTimeZone1.equals(obj7);
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3600000) + "'", int6 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        java.util.TimeZone timeZone28 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.lang.Class<?> wildcardClass30 = dateTimeZone29.getClass();
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
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffset(1L);
        long long11 = dateTimeZone7.previousTransition((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long16 = dateTimeZone12.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        long long18 = dateTimeZone7.getMillisKeepLocal(dateTimeZone12, (-32459948L));
        java.lang.Class<?> wildcardClass19 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-32459948L) + "'", long18 == (-32459948L));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(36600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        java.lang.Class<?> wildcardClass24 = dateTimeZone7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone5.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean10 = dateTimeZone5.isFixed();
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        java.lang.Object obj12 = dateTimeZone5.writeReplace();
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.lang.String str14 = dateTimeZone1.toString();
        java.lang.String str15 = dateTimeZone1.toString();
        java.util.TimeZone timeZone16 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone17 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass18 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-01:00" + "'", str14, "-01:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-01:00" + "'", str15, "-01:00");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        long long24 = dateTimeZone0.nextTransition(100L);
        long long28 = dateTimeZone0.convertLocalToUTC((long) (-1), false, (-36599999L));
        long long30 = dateTimeZone0.previousTransition(7200010L);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 7200010L + "'", long30 == 7200010L);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone10 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone12.isLocalDateTimeGap(localDateTime13);
        long long18 = dateTimeZone12.convertLocalToUTC((long) (byte) -1, true, 0L);
        java.lang.String str19 = dateTimeZone12.getID();
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
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        long long6 = dateTimeZone1.nextTransition((long) 1);
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) 36600000);
        java.lang.Object obj9 = null;
        boolean boolean10 = dateTimeZone1.equals(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115200000, 115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.String str5 = dateTimeZone1.getShortName(97L);
        boolean boolean6 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) '4');
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3600000L) + "'", long3 == (-3600000L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        long long12 = dateTimeZone0.previousTransition(10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone0.getOffset(readableInstant13);
        boolean boolean16 = dateTimeZone0.isStandardOffset(36600000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str6 = dateTimeZone0.toString();
        java.lang.Class<?> wildcardClass7 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
        java.util.TimeZone timeZone16 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
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
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        long long39 = dateTimeZone10.nextTransition(35L);
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone10.getShortName(234000000L, locale41);
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
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 35L + "'", long39 == 35L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.lang.String str9 = dateTimeZone0.getName((long) (byte) 10);
        int int11 = dateTimeZone0.getStandardOffset(0L);
        long long15 = dateTimeZone0.convertLocalToUTC(0L, false, (long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone16.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean21 = dateTimeZone16.isFixed();
        java.lang.String str22 = dateTimeZone16.toString();
        long long24 = dateTimeZone0.getMillisKeepLocal(dateTimeZone16, (long) (byte) 0);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone0.getName((long) 'a', locale26);
        long long31 = dateTimeZone0.convertLocalToUTC((-39599999L), false, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-39599999L) + "'", long31 == (-39599999L));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone2.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone2.getName(100L, locale8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone2.getOffset(readableInstant10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, (long) 100);
        long long16 = dateTimeZone1.nextTransition((-187200000L));
        long long19 = dateTimeZone1.convertLocalToUTC(36060000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-187200000L) + "'", long16 == (-187200000L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 36060000L + "'", long19 == 36060000L);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getShortName(0L, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName((long) 3600000, locale13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.lang.String str18 = dateTimeZone16.getShortName((long) (byte) 100);
        long long21 = dateTimeZone16.convertLocalToUTC((long) '4', true);
        java.lang.String str22 = dateTimeZone16.toString();
        boolean boolean23 = dateTimeZone0.equals((java.lang.Object) str22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone0.getShortName(3599935L, locale25);
        long long29 = dateTimeZone0.convertLocalToUTC((long) 'a', true);
        java.lang.String str31 = dateTimeZone0.getName(39660100L);
        java.lang.Class<?> wildcardClass32 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 42L + "'", long21 == 42L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.010" + "'", str22, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone10 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long13 = dateTimeZone11.previousTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        int int17 = dateTimeZone15.getStandardOffset((long) 115200000);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        long long24 = dateTimeZone20.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone20.getName(100L, locale26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = dateTimeZone20.getOffset(readableInstant28);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        long long32 = dateTimeZone19.getMillisKeepLocal(dateTimeZone20, (long) 100);
        boolean boolean33 = dateTimeZone15.equals((java.lang.Object) dateTimeZone20);
        long long35 = dateTimeZone11.getMillisKeepLocal(dateTimeZone20, (long) (short) 100);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone20.getShortName((long) (short) -1, locale37);
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
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3600000 + "'", int17 == 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.String str5 = dateTimeZone1.getShortName(97L);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long8 = dateTimeZone1.convertUTCToLocal(7200010L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) -1);
        java.lang.String str12 = dateTimeZone1.getName(100L);
        long long14 = dateTimeZone1.convertUTCToLocal((long) 1);
        java.lang.String str16 = dateTimeZone1.getName((long) 187200000);
        boolean boolean17 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3600000L) + "'", long3 == (-3600000L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600010L + "'", long8 == 3600010L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3599999L) + "'", long14 == (-3599999L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-01:00" + "'", str16, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone10 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long16 = dateTimeZone12.convertLocalToUTC(3600000L, true, (long) (-1));
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone12.getOffset(readableInstant17);
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
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3600000L + "'", long16 == 3600000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        int int3 = dateTimeZone1.getStandardOffset((long) 115200000);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long10 = dateTimeZone6.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName(100L, locale12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone6.getOffset(readableInstant14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        long long18 = dateTimeZone5.getMillisKeepLocal(dateTimeZone6, (long) 100);
        boolean boolean19 = dateTimeZone1.equals((java.lang.Object) dateTimeZone6);
        long long21 = dateTimeZone6.previousTransition(1L);
        java.util.TimeZone timeZone22 = dateTimeZone6.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600000 + "'", int3 == 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(37920000);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        boolean boolean8 = dateTimeZone0.isStandardOffset(0L);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getNameKey(184200001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 37920000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 37920000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        java.util.TimeZone timeZone34 = dateTimeZone23.toTimeZone();
        java.lang.String str35 = dateTimeZone23.toString();
        long long37 = dateTimeZone23.previousTransition(36060100L);
        java.lang.String str39 = dateTimeZone23.getName(32400001L);
        java.lang.String str41 = dateTimeZone23.getShortName((long) (byte) 1);
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
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 36060100L + "'", long37 == 36060100L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00" + "'", str39, "+00:00");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        boolean boolean3 = dateTimeZone1.isStandardOffset((-36060000L));
        int int5 = dateTimeZone1.getOffset((-39599999L));
        int int7 = dateTimeZone1.getOffset((long) 187200000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) 1);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        int int6 = dateTimeZone2.getStandardOffset((long) (byte) 1);
        java.lang.Class<?> wildcardClass7 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36060000 + "'", int6 == 36060000);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 36600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 10);
        java.lang.String str4 = dateTimeZone2.getShortName((-1L));
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) 1, false);
        java.lang.Object obj8 = dateTimeZone2.writeReplace();
        long long10 = dateTimeZone2.convertUTCToLocal(111600000L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long14 = dateTimeZone12.previousTransition((long) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        long long19 = dateTimeZone15.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean20 = dateTimeZone15.isFixed();
        java.util.TimeZone timeZone21 = dateTimeZone15.toTimeZone();
        int int23 = dateTimeZone15.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        boolean boolean26 = dateTimeZone15.isStandardOffset((long) (-1));
        long long28 = dateTimeZone15.convertUTCToLocal(100L);
        long long30 = dateTimeZone12.getMillisKeepLocal(dateTimeZone15, 10L);
        long long32 = dateTimeZone2.getMillisKeepLocal(dateTimeZone15, (long) 100);
        java.lang.Class<?> wildcardClass33 = dateTimeZone15.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:10" + "'", str4, "+10:10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-36599999L) + "'", long7 == (-36599999L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 148200000L + "'", long10 == 148200000L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3600010L + "'", long30 == 3600010L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 36600100L + "'", long32 == 36600100L);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone0.getShortName((long) (short) -1, locale3);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone0.isLocalDateTimeGap(localDateTime5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName((long) 36060000, locale8);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (-1));
        long long13 = dateTimeZone0.previousTransition((long) (short) 10);
        java.lang.String str15 = dateTimeZone0.getShortName((long) 115200000);
        int int17 = dateTimeZone0.getStandardOffset((long) (short) 10);
        int int19 = dateTimeZone0.getOffset((long) ' ');
        java.lang.Object obj20 = dateTimeZone0.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        int int3 = dateTimeZone1.getStandardOffset((long) 115200000);
        java.lang.String str5 = dateTimeZone1.getShortName((-118319968L));
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600000 + "'", int3 == 3600000);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:00" + "'", str5, "+01:00");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone10 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone12.isLocalDateTimeGap(localDateTime13);
        java.lang.Object obj15 = dateTimeZone12.writeReplace();
        java.lang.Class<?> wildcardClass16 = dateTimeZone12.getClass();
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
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long3 = dateTimeZone1.previousTransition(10L);
        int int5 = dateTimeZone1.getOffset((long) (short) 0);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 36060000, locale8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115200000, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(37920000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        java.lang.String str18 = dateTimeZone0.getShortName(0L, locale17);
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
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone7.nextTransition(1L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone7.isLocalDateTimeGap(localDateTime10);
        int int13 = dateTimeZone7.getStandardOffset((-3599948L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        java.lang.String str14 = dateTimeZone0.getShortName((long) (byte) -1);
        long long16 = dateTimeZone0.nextTransition(52L);
        long long20 = dateTimeZone0.convertLocalToUTC((long) (-1), false, (-3599965L));
        long long22 = dateTimeZone0.nextTransition((long) (byte) 100);
        java.lang.String str24 = dateTimeZone0.getNameKey(0L);
        int int26 = dateTimeZone0.getOffset(10L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (-1));
        long long13 = dateTimeZone0.previousTransition((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone0.getOffset(readableInstant14);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone0.getName((-3599890L), locale17);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        boolean boolean8 = dateTimeZone0.isStandardOffset(0L);
        long long10 = dateTimeZone0.convertUTCToLocal((long) ' ');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getShortName((-39599999L), locale12);
        java.lang.Class<?> wildcardClass14 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(3600010L, locale3);
        java.lang.Object obj5 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (-1));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName((long) (short) -1, locale13);
        int int16 = dateTimeZone0.getStandardOffset((-3599900L));
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone0.getOffset(readableInstant17);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean7 = dateTimeZone0.isStandardOffset((long) (byte) 1);
        long long10 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        long long16 = dateTimeZone0.convertLocalToUTC(100L, false, 3600010L);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone0.isLocalDateTimeGap(localDateTime17);
        int int20 = dateTimeZone0.getStandardOffset(36600100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115200000, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 10);
        java.lang.String str4 = dateTimeZone2.getShortName((-1L));
        long long8 = dateTimeZone2.convertLocalToUTC((-223200000L), false, 52L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:10" + "'", str4, "+10:10");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-259800000L) + "'", long8 == (-259800000L));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (short) 100);
        int int9 = dateTimeZone0.getOffset((-2999965L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        boolean boolean8 = dateTimeZone0.isStandardOffset(0L);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        long long11 = dateTimeZone0.nextTransition((-1L));
        java.lang.String str12 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int15 = dateTimeZone0.getOffsetFromLocal(187200097L);
        boolean boolean16 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) 1);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long3 = dateTimeZone1.previousTransition(10L);
        java.lang.String str4 = dateTimeZone1.getID();
        boolean boolean6 = dateTimeZone1.isStandardOffset(36000001L);
        java.lang.Class<?> wildcardClass7 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        java.lang.String str14 = dateTimeZone0.getShortName((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone0.getOffset(readableInstant15);
        int int18 = dateTimeZone0.getOffset((long) 600000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        long long7 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, 10L);
        long long11 = dateTimeZone0.convertLocalToUTC(0L, true, (long) 100);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName(0L, locale13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.010");
        long long3 = dateTimeZone1.nextTransition((long) 10);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.lang.String str7 = dateTimeZone1.getShortName(39119999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.010" + "'", str7, "+00:00:00.010");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115200000);
        java.lang.String str3 = dateTimeZone1.getShortName((-37920000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:00" + "'", str3, "+32:00");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        java.util.TimeZone timeZone34 = dateTimeZone23.toTimeZone();
        java.lang.String str35 = dateTimeZone23.toString();
        java.util.TimeZone timeZone36 = dateTimeZone23.toTimeZone();
        java.lang.Class<?> wildcardClass37 = dateTimeZone23.getClass();
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
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        int int3 = dateTimeZone1.getStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 360000000 + "'", int3 == 360000000);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long11 = dateTimeZone0.convertLocalToUTC(3600010L, false);
        java.lang.String str13 = dateTimeZone0.getNameKey((long) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600010L + "'", long11 == 3600010L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
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
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, false);
        int int6 = dateTimeZone1.getOffsetFromLocal(3600000L);
        long long9 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        java.lang.String str10 = dateTimeZone1.toString();
        java.lang.String str12 = dateTimeZone1.getNameKey(40200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3600000) + "'", int6 == (-3600000));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600010L + "'", long9 == 3600010L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-01:00" + "'", str10, "-01:00");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str2 = dateTimeZone0.getID();
        long long5 = dateTimeZone0.convertLocalToUTC((long) 600000, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone5.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean10 = dateTimeZone5.isFixed();
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        java.lang.Object obj12 = dateTimeZone5.writeReplace();
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.lang.String str14 = dateTimeZone1.toString();
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass16 = timeZone15.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-01:00" + "'", str14, "-01:00");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        java.lang.String str9 = dateTimeZone0.toString();
        int int11 = dateTimeZone0.getStandardOffset((long) (short) -1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName((long) 100, locale13);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        long long19 = dateTimeZone15.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone15.getShortName((long) (short) -1, locale22);
        long long26 = dateTimeZone15.convertLocalToUTC((long) (byte) 10, false);
        int int28 = dateTimeZone15.getOffsetFromLocal(3599999L);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone15.getName(0L, locale30);
        boolean boolean32 = dateTimeZone0.equals((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffsetFromLocal((long) (short) 0);
        java.lang.String str11 = dateTimeZone7.getShortName((long) (byte) 10);
        java.lang.String str12 = dateTimeZone7.getID();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long17 = dateTimeZone13.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        boolean boolean20 = dateTimeZone13.isStandardOffset((long) (byte) 1);
        long long23 = dateTimeZone13.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone13.isLocalDateTimeGap(localDateTime24);
        boolean boolean26 = dateTimeZone7.equals((java.lang.Object) dateTimeZone13);
        long long30 = dateTimeZone7.convertLocalToUTC(3600000L, false, (-3599999L));
        boolean boolean31 = dateTimeZone7.isFixed();
        java.lang.String str32 = dateTimeZone7.toString();
        boolean boolean34 = dateTimeZone7.isStandardOffset(36060100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3600000L + "'", long30 == 3600000L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) (byte) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName((-187199999L), locale4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:01" + "'", str5, "-01:01");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) 1, true, (long) 10);
        boolean boolean11 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3599999L) + "'", long10 == (-3599999L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        int int8 = dateTimeZone1.getOffsetFromLocal((long) 1);
        java.lang.String str10 = dateTimeZone1.getNameKey((long) '4');
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3600000 + "'", int8 == 3600000);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3600000 + "'", int12 == 3600000);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+100:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+100:00\" is malformed at \"0:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone0.getName((long) 36060000, locale6);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        java.lang.Object obj7 = dateTimeZone0.writeReplace();
        long long11 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, false, 115200010L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long4 = dateTimeZone1.convertUTCToLocal((long) (byte) 100);
        java.lang.Class<?> wildcardClass5 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long8 = dateTimeZone4.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone4.getName(100L, locale10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone4.getOffset(readableInstant12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        long long16 = dateTimeZone3.getMillisKeepLocal(dateTimeZone4, (long) 100);
        boolean boolean17 = dateTimeZone1.equals((java.lang.Object) dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone5.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean10 = dateTimeZone5.isFixed();
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        java.lang.Object obj12 = dateTimeZone5.writeReplace();
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.lang.String str14 = dateTimeZone1.toString();
        long long18 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, false, 32L);
        long long20 = dateTimeZone1.nextTransition((long) (byte) -1);
        java.lang.String str21 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-01:00" + "'", str14, "-01:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3599999L + "'", long18 == 3599999L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-01:00" + "'", str21, "-01:00");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((-39599999L), locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone2.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone2.getName(100L, locale8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone2.getOffset(readableInstant10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, (long) 100);
        long long16 = dateTimeZone1.nextTransition((-187200000L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-187200000L) + "'", long16 == (-187200000L));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (byte) 10);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        long long8 = dateTimeZone1.convertLocalToUTC(3600035L, false);
        int int10 = dateTimeZone1.getStandardOffset(226800000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3600000 + "'", int10 == 3600000);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        boolean boolean12 = dateTimeZone0.equals((java.lang.Object) (-3599900L));
        java.lang.String str14 = dateTimeZone0.getShortName((-3599965L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone16.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean21 = dateTimeZone16.isFixed();
        java.util.TimeZone timeZone22 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        int int25 = dateTimeZone23.getOffset(1L);
        long long27 = dateTimeZone23.previousTransition((long) (byte) 1);
        java.lang.String str29 = dateTimeZone23.getName(1L);
        java.lang.String str30 = dateTimeZone23.toString();
        boolean boolean31 = dateTimeZone0.equals((java.lang.Object) dateTimeZone23);
        long long33 = dateTimeZone23.convertUTCToLocal(112140000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 112140000L + "'", long33 == 112140000L);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        java.util.TimeZone timeZone19 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        boolean boolean23 = dateTimeZone20.isStandardOffset((-32999999L));
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone20.isLocalDateTimeGap(localDateTime24);
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
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        long long39 = dateTimeZone10.nextTransition(35L);
        org.joda.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = dateTimeZone10.isLocalDateTimeGap(localDateTime40);
        java.lang.String str43 = dateTimeZone10.getNameKey(360000000L);
        java.lang.Class<?> wildcardClass44 = dateTimeZone10.getClass();
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
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 35L + "'", long39 == 35L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTC" + "'", str43, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        long long19 = dateTimeZone0.previousTransition((-39660000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-39660000L) + "'", long19 == (-39660000L));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (-3600000), true, (long) 0);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone7.nextTransition((-223200000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3600000L) + "'", long5 == (-3600000L));
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-223200000L) + "'", long9 == (-223200000L));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        java.lang.String str24 = dateTimeZone0.getShortName((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long29 = dateTimeZone26.convertLocalToUTC(0L, true);
        boolean boolean30 = dateTimeZone26.isFixed();
        int int32 = dateTimeZone26.getOffsetFromLocal((long) (short) 1);
        int int34 = dateTimeZone26.getStandardOffset(0L);
        java.lang.String str36 = dateTimeZone26.getShortName(36060000L);
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone26.getName((long) 36600000, locale38);
        boolean boolean40 = dateTimeZone0.equals((java.lang.Object) 36600000);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-3600000L) + "'", long29 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3600000 + "'", int32 == 3600000);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3600000 + "'", int34 == 3600000);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+01:00" + "'", str36, "+01:00");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+01:00" + "'", str39, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long12 = dateTimeZone0.previousTransition(1L);
        java.lang.Object obj13 = dateTimeZone0.writeReplace();
        long long17 = dateTimeZone0.convertLocalToUTC(97L, true, 3599935L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        java.lang.String str34 = dateTimeZone23.getID();
        java.lang.String str35 = dateTimeZone23.getID();
        boolean boolean37 = dateTimeZone23.isStandardOffset(3600010L);
        java.lang.Class<?> wildcardClass38 = dateTimeZone23.getClass();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.String str5 = dateTimeZone1.getShortName(97L);
        int int7 = dateTimeZone1.getOffset((long) (short) 100);
        boolean boolean8 = dateTimeZone1.isFixed();
        java.lang.String str10 = dateTimeZone1.getShortName((long) (short) 100);
        int int12 = dateTimeZone1.getStandardOffset(1L);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3600000L) + "'", long3 == (-3600000L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3600000) + "'", int7 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-01:00" + "'", str10, "-01:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3600000) + "'", int12 == (-3600000));
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT-01:00");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        int int5 = dateTimeZone2.getOffset(3600035L);
        int int7 = dateTimeZone2.getOffset((-3599999L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36600000 + "'", int5 == 36600000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36600000 + "'", int7 == 36600000);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (short) 0);
        long long4 = dateTimeZone2.nextTransition((long) 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200000L + "'", long4 == 115200000L);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.String str5 = dateTimeZone1.getShortName(97L);
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3600000L) + "'", long3 == (-3600000L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str3 = dateTimeZone0.getNameKey(32400001L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str6 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.String str5 = dateTimeZone1.getShortName(97L);
        int int7 = dateTimeZone1.getOffset((long) (short) 100);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((long) 187200000, locale9);
        java.lang.String str11 = dateTimeZone1.toString();
        java.lang.String str12 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3600000L) + "'", long3 == (-3600000L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3600000) + "'", int7 == (-3600000));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-01:00" + "'", str10, "-01:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-01:00" + "'", str11, "-01:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long3 = dateTimeZone1.nextTransition(144600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 144600000L + "'", long3 == 144600000L);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (-1));
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone0.isLocalDateTimeGap(localDateTime12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 10);
        java.lang.String str18 = dateTimeZone16.getShortName((-1L));
        long long21 = dateTimeZone16.convertLocalToUTC((long) (short) 1, false);
        boolean boolean22 = dateTimeZone0.equals((java.lang.Object) false);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone0.getName(187200010L, locale24);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:10" + "'", str18, "+10:10");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-36599999L) + "'", long21 == (-36599999L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone5.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean10 = dateTimeZone5.isFixed();
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        java.lang.Object obj12 = dateTimeZone5.writeReplace();
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.lang.String str14 = dateTimeZone1.toString();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getShortName(97L, locale16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long22 = dateTimeZone19.convertLocalToUTC(0L, true);
        boolean boolean23 = dateTimeZone19.isFixed();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        long long28 = dateTimeZone24.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean29 = dateTimeZone24.isFixed();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone30.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean35 = dateTimeZone30.isFixed();
        java.util.TimeZone timeZone36 = dateTimeZone30.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        long long39 = dateTimeZone24.getMillisKeepLocal(dateTimeZone37, (long) (byte) 10);
        boolean boolean40 = dateTimeZone19.equals((java.lang.Object) dateTimeZone24);
        boolean boolean41 = dateTimeZone1.equals((java.lang.Object) boolean40);
        java.util.TimeZone timeZone42 = dateTimeZone1.toTimeZone();
        long long44 = dateTimeZone1.nextTransition((long) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-01:00" + "'", str14, "-01:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-01:00" + "'", str17, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3600000L) + "'", long22 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 100);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), 36060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36060000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 36060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36060000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        long long12 = dateTimeZone0.previousTransition(10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone0.getOffset(readableInstant13);
        java.lang.String str16 = dateTimeZone0.getShortName((long) (short) 10);
        java.lang.Class<?> wildcardClass17 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = dateTimeZone23.getOffset(readableInstant38);
        int int41 = dateTimeZone23.getStandardOffset((-3599965L));
        boolean boolean42 = dateTimeZone23.isFixed();
        org.joda.time.ReadableInstant readableInstant43 = null;
        int int44 = dateTimeZone23.getOffset(readableInstant43);
        java.lang.String str46 = dateTimeZone23.getNameKey(36000010L);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UTC" + "'", str46, "UTC");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.lang.String str9 = dateTimeZone0.getName((long) (byte) 10);
        int int11 = dateTimeZone0.getStandardOffset(0L);
        long long15 = dateTimeZone0.convertLocalToUTC(0L, false, (long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone16.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean21 = dateTimeZone16.isFixed();
        java.lang.String str22 = dateTimeZone16.toString();
        long long24 = dateTimeZone0.getMillisKeepLocal(dateTimeZone16, (long) (byte) 0);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone0.getName((long) 'a', locale26);
        int int29 = dateTimeZone0.getOffsetFromLocal((long) 0);
        boolean boolean31 = dateTimeZone0.isStandardOffset((long) 187200000);
        java.lang.String str32 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        long long33 = dateTimeZone12.previousTransition(0L);
        boolean boolean34 = dateTimeZone12.isFixed();
        long long36 = dateTimeZone12.convertUTCToLocal(0L);
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone10 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long13 = dateTimeZone11.previousTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        int int17 = dateTimeZone15.getStandardOffset((long) 115200000);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        long long24 = dateTimeZone20.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone20.getName(100L, locale26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = dateTimeZone20.getOffset(readableInstant28);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        long long32 = dateTimeZone19.getMillisKeepLocal(dateTimeZone20, (long) 100);
        boolean boolean33 = dateTimeZone15.equals((java.lang.Object) dateTimeZone20);
        long long35 = dateTimeZone11.getMillisKeepLocal(dateTimeZone20, (long) (short) 100);
        long long37 = dateTimeZone20.previousTransition((long) (short) 100);
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone20.getName((long) (byte) -1, locale39);
        java.lang.String str42 = dateTimeZone20.getName((long) (byte) 10);
        long long45 = dateTimeZone20.convertLocalToUTC((-3599965L), true);
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
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3600000 + "'", int17 == 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-3599965L) + "'", long45 == (-3599965L));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        long long23 = dateTimeZone19.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean24 = dateTimeZone19.isFixed();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        long long29 = dateTimeZone25.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean30 = dateTimeZone25.isFixed();
        java.util.TimeZone timeZone31 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        long long34 = dateTimeZone19.getMillisKeepLocal(dateTimeZone32, (long) (byte) 10);
        long long36 = dateTimeZone0.getMillisKeepLocal(dateTimeZone32, 42L);
        boolean boolean38 = dateTimeZone0.isStandardOffset((long) (short) -1);
        long long40 = dateTimeZone0.previousTransition((long) (byte) 1);
        java.lang.String str41 = dateTimeZone0.toString();
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
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 42L + "'", long36 == 42L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTC" + "'", str41, "UTC");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((long) 100);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (short) 100, true);
        boolean boolean8 = dateTimeZone1.isStandardOffset(36000042L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3599900L) + "'", long6 == (-3599900L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        java.lang.String str11 = dateTimeZone0.getShortName((long) (short) 10);
        int int13 = dateTimeZone0.getStandardOffset((-3599900L));
        long long16 = dateTimeZone0.convertLocalToUTC((-7199968L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-7199968L) + "'", long16 == (-7199968L));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone6.getOffset(readableInstant34);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone36);
        boolean boolean39 = dateTimeZone36.equals((java.lang.Object) 10L);
        long long41 = dateTimeZone6.getMillisKeepLocal(dateTimeZone36, (-3599900L));
        java.lang.String str42 = dateTimeZone36.toString();
        long long46 = dateTimeZone36.convertLocalToUTC(230400000L, false, 187200010L);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-3599900L) + "'", long41 == (-3599900L));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 230400000L + "'", long46 == 230400000L);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone10 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        long long14 = dateTimeZone11.nextTransition((-3599890L));
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3599890L) + "'", long14 == (-3599890L));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone0.getShortName((long) (short) -1, locale3);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone0.isLocalDateTimeGap(localDateTime5);
        int int8 = dateTimeZone0.getOffset((-3600000L));
        java.lang.String str10 = dateTimeZone0.getName((long) (byte) -1);
        long long13 = dateTimeZone0.convertLocalToUTC(187200000L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 187200000L + "'", long13 == 187200000L);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        boolean boolean8 = dateTimeZone0.isStandardOffset(0L);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.convertUTCToLocal((long) (byte) 1);
        java.lang.Object obj13 = dateTimeZone10.writeReplace();
        java.lang.String str15 = dateTimeZone10.getShortName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long3 = dateTimeZone1.previousTransition(10L);
        java.lang.String str4 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) 1);
        java.lang.String str9 = dateTimeZone1.getShortName(7200010L);
        long long11 = dateTimeZone1.previousTransition((long) 115200000);
        boolean boolean13 = dateTimeZone1.isStandardOffset(230400000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115200000L + "'", long11 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((long) 100);
        java.lang.String str4 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertUTCToLocal(10L);
        long long8 = dateTimeZone1.nextTransition((long) (-3600000));
        boolean boolean9 = dateTimeZone1.isFixed();
        long long11 = dateTimeZone1.convertUTCToLocal((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long15 = dateTimeZone13.previousTransition(10L);
        java.lang.String str16 = dateTimeZone13.getID();
        boolean boolean18 = dateTimeZone13.isStandardOffset(36000001L);
        boolean boolean19 = dateTimeZone1.equals((java.lang.Object) 36000001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3600010L + "'", long6 == 3600010L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3600000L) + "'", long8 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3599999L + "'", long11 == 3599999L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        long long12 = dateTimeZone0.previousTransition(10L);
        int int14 = dateTimeZone0.getStandardOffset((long) (short) 100);
        long long16 = dateTimeZone0.previousTransition((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        long long21 = dateTimeZone17.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean22 = dateTimeZone17.isFixed();
        java.lang.String str24 = dateTimeZone17.getShortName((-1L));
        java.lang.String str26 = dateTimeZone17.getName((long) (byte) 10);
        int int28 = dateTimeZone17.getStandardOffset(0L);
        long long32 = dateTimeZone17.convertLocalToUTC(0L, false, (long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        long long37 = dateTimeZone33.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean38 = dateTimeZone33.isFixed();
        java.lang.String str39 = dateTimeZone33.toString();
        long long41 = dateTimeZone17.getMillisKeepLocal(dateTimeZone33, (long) (byte) 0);
        int int43 = dateTimeZone17.getOffsetFromLocal((-39660000L));
        long long45 = dateTimeZone0.getMillisKeepLocal(dateTimeZone17, 0L);
        long long47 = dateTimeZone17.previousTransition((long) 36060000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UTC" + "'", str39, "UTC");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 36060000L + "'", long47 == 36060000L);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        int int9 = dateTimeZone1.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean12 = dateTimeZone1.isStandardOffset((long) (-1));
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) ' ');
        boolean boolean15 = dateTimeZone0.isFixed();
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone0.getName((long) (short) 10, locale17);
        long long20 = dateTimeZone0.previousTransition((-3599999L));
        java.lang.String str21 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-3599999L) + "'", long20 == (-3599999L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        long long24 = dateTimeZone0.nextTransition(100L);
        long long28 = dateTimeZone0.convertLocalToUTC((long) (-1), false, (-36599999L));
        long long30 = dateTimeZone0.previousTransition(36060000L);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 36060000L + "'", long30 == 36060000L);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = dateTimeZone0.getOffset(readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone0.getOffset(readableInstant30);
        java.lang.String str32 = dateTimeZone0.toString();
        int int34 = dateTimeZone0.getOffsetFromLocal((-39599999L));
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(600000, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36600000, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.Object obj8 = dateTimeZone7.writeReplace();
        java.lang.String str9 = dateTimeZone7.toString();
        java.lang.String str10 = dateTimeZone7.toString();
        long long12 = dateTimeZone7.nextTransition((-2999965L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-2999965L) + "'", long12 == (-2999965L));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone10 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        long long14 = dateTimeZone11.nextTransition(7200010L);
        long long16 = dateTimeZone11.convertUTCToLocal(36000010L);
        java.lang.String str18 = dateTimeZone11.getNameKey((-3599965L));
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 7200010L + "'", long14 == 7200010L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 36000010L + "'", long16 == 36000010L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        java.lang.String str12 = dateTimeZone0.getNameKey((long) 0);
        java.lang.String str13 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long16 = dateTimeZone0.convertUTCToLocal(187200097L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 187200097L + "'", long16 == 187200097L);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffsetFromLocal((long) (short) 0);
        boolean boolean10 = dateTimeZone7.isFixed();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone7.getShortName((long) '4', locale12);
        java.util.TimeZone timeZone14 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        java.lang.Class<?> wildcardClass7 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36600000, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        int int3 = dateTimeZone1.getOffsetFromLocal(36060000L);
        java.lang.String str4 = dateTimeZone1.toString();
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600000 + "'", int3 == 3600000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        long long10 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, false, 3600010L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffset(1L);
        long long11 = dateTimeZone7.previousTransition((long) (byte) 1);
        java.lang.String str13 = dateTimeZone7.getName(1L);
        java.lang.String str14 = dateTimeZone7.toString();
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone7.getOffset(readableInstant15);
        long long19 = dateTimeZone7.convertLocalToUTC(79140000L, true);
        int int21 = dateTimeZone7.getOffset(3600011L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 79140000L + "'", long19 == 79140000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone23.getName(112140000L, locale39);
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        long long19 = dateTimeZone0.convertLocalToUTC((long) '#', false);
        long long21 = dateTimeZone0.nextTransition(111600000L);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        long long26 = dateTimeZone22.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean27 = dateTimeZone22.isFixed();
        java.lang.String str29 = dateTimeZone22.getShortName((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        long long33 = dateTimeZone22.convertLocalToUTC(3600010L, false);
        java.lang.String str35 = dateTimeZone22.getNameKey((long) 10);
        int int37 = dateTimeZone22.getOffsetFromLocal(52L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        long long40 = dateTimeZone0.getMillisKeepLocal(dateTimeZone22, 0L);
        java.lang.String str41 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 111600000L + "'", long21 == 111600000L);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 3600010L + "'", long33 == 3600010L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTC" + "'", str41, "UTC");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        boolean boolean8 = dateTimeZone0.isStandardOffset(0L);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        java.lang.String str11 = dateTimeZone0.getShortName((long) '4');
        int int13 = dateTimeZone0.getStandardOffset((-3600000L));
        int int15 = dateTimeZone0.getStandardOffset((-259800000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str3 = dateTimeZone1.getName(3599935L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:00" + "'", str3, "+10:00");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.lang.String str9 = dateTimeZone0.getName((long) (byte) 10);
        int int11 = dateTimeZone0.getStandardOffset(0L);
        long long15 = dateTimeZone0.convertLocalToUTC(0L, false, (long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone16.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean21 = dateTimeZone16.isFixed();
        java.lang.String str22 = dateTimeZone16.toString();
        long long24 = dateTimeZone0.getMillisKeepLocal(dateTimeZone16, (long) (byte) 0);
        int int26 = dateTimeZone0.getOffsetFromLocal(187200097L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) 1);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        boolean boolean6 = dateTimeZone2.isStandardOffset(42L);
        int int8 = dateTimeZone2.getStandardOffset(100L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36060000 + "'", int8 == 36060000);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        boolean boolean8 = dateTimeZone0.isStandardOffset(0L);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        long long11 = dateTimeZone0.nextTransition((-1L));
        boolean boolean13 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.Object obj14 = null;
        boolean boolean15 = dateTimeZone0.equals(obj14);
        java.lang.Object obj16 = dateTimeZone0.writeReplace();
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone0.getShortName((-223200000L), locale18);
        int int21 = dateTimeZone0.getOffset(187800001L);
        long long24 = dateTimeZone0.convertLocalToUTC(226800000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 226800000L + "'", long24 == 226800000L);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long7 = dateTimeZone1.convertLocalToUTC((long) 100, false, 100L);
        long long9 = dateTimeZone1.convertUTCToLocal((-352799990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-352799990L) + "'", long9 == (-352799990L));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        java.util.TimeZone timeZone19 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.lang.Object obj21 = dateTimeZone20.writeReplace();
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
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getShortName((long) 'a');
        long long5 = dateTimeZone1.previousTransition((long) 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115200000L + "'", long5 == 115200000L);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        java.lang.Object obj7 = dateTimeZone0.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone8.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean13 = dateTimeZone8.isFixed();
        java.lang.Class<?> wildcardClass14 = dateTimeZone8.getClass();
        boolean boolean15 = dateTimeZone0.equals((java.lang.Object) wildcardClass14);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone0.getName((long) 10, locale17);
        java.lang.String str19 = dateTimeZone0.getID();
        java.lang.String str21 = dateTimeZone0.getNameKey(187200000L);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        long long26 = dateTimeZone22.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean27 = dateTimeZone22.isFixed();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        long long32 = dateTimeZone28.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean33 = dateTimeZone28.isFixed();
        java.util.TimeZone timeZone34 = dateTimeZone28.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        long long37 = dateTimeZone22.getMillisKeepLocal(dateTimeZone35, (long) (byte) 10);
        java.lang.String str38 = dateTimeZone22.getID();
        boolean boolean40 = dateTimeZone22.isStandardOffset((long) (short) 1);
        boolean boolean42 = dateTimeZone22.isStandardOffset((long) 3600000);
        long long44 = dateTimeZone22.previousTransition((long) '4');
        boolean boolean45 = dateTimeZone0.equals((java.lang.Object) '4');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UTC" + "'", str38, "UTC");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 52L + "'", long44 == 52L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        long long39 = dateTimeZone10.nextTransition(35L);
        org.joda.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = dateTimeZone10.isLocalDateTimeGap(localDateTime40);
        boolean boolean42 = dateTimeZone10.isFixed();
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
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 35L + "'", long39 == 35L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str11 = dateTimeZone9.getShortName((long) '4');
        int int13 = dateTimeZone9.getOffsetFromLocal(37920000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        boolean boolean35 = dateTimeZone23.isFixed();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone10 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        boolean boolean13 = dateTimeZone11.isFixed();
        java.lang.String str15 = dateTimeZone11.getShortName((long) 10);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+52:10");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+52:10\" is malformed at \"52:10\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffsetFromLocal((long) (short) 0);
        java.lang.String str11 = dateTimeZone7.getShortName((long) (byte) 10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone7.getShortName(97L, locale13);
        boolean boolean15 = dateTimeZone7.isFixed();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone16.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean21 = dateTimeZone16.isFixed();
        java.lang.String str23 = dateTimeZone16.getShortName((-1L));
        java.util.TimeZone timeZone24 = dateTimeZone16.toTimeZone();
        java.lang.Object obj25 = dateTimeZone16.writeReplace();
        java.lang.String str26 = dateTimeZone16.toString();
        java.lang.String str27 = dateTimeZone16.getID();
        java.lang.String str28 = dateTimeZone16.toString();
        long long30 = dateTimeZone7.getMillisKeepLocal(dateTimeZone16, (-39660000L));
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone16.getShortName(32400001L, locale32);
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
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-39660000L) + "'", long30 == (-39660000L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.util.TimeZone timeZone4 = dateTimeZone2.toTimeZone();
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) '#', locale6);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+10:10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+10:10" + "'", str7, "+10:10");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone24.isLocalDateTimeGap(localDateTime27);
        int int30 = dateTimeZone24.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        long long36 = dateTimeZone24.getMillisKeepLocal(dateTimeZone32, (long) 'a');
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone24.getName(37920000L, locale38);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 187200000 + "'", int30 == 187200000);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 187200097L + "'", long36 == 187200097L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+52:00" + "'", str39, "+52:00");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(600000, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        int int24 = dateTimeZone0.getStandardOffset((-3599965L));
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 2100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 2100000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long3 = dateTimeZone1.previousTransition(10L);
        java.lang.String str4 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal(3600035L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        boolean boolean22 = dateTimeZone7.isStandardOffset((-39660000L));
        int int24 = dateTimeZone7.getStandardOffset(0L);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        long long7 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, 10L);
        long long9 = dateTimeZone0.nextTransition((-3599903L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3599903L) + "'", long9 == (-3599903L));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        java.lang.Object obj7 = dateTimeZone0.writeReplace();
        long long9 = dateTimeZone0.convertUTCToLocal((long) 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        long long31 = dateTimeZone27.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean32 = dateTimeZone27.isFixed();
        java.lang.String str34 = dateTimeZone27.getShortName((-1L));
        org.joda.time.ReadableInstant readableInstant35 = null;
        int int36 = dateTimeZone27.getOffset(readableInstant35);
        long long38 = dateTimeZone27.previousTransition((long) (byte) 1);
        long long40 = dateTimeZone27.previousTransition(3599999L);
        long long42 = dateTimeZone0.getMillisKeepLocal(dateTimeZone27, 52L);
        long long44 = dateTimeZone0.nextTransition((long) (short) 1);
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
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 3599999L + "'", long40 == 3599999L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 52L + "'", long42 == 52L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        int int7 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str9 = dateTimeZone0.getNameKey((long) (byte) 1);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) 1);
        long long15 = dateTimeZone13.previousTransition((long) '#');
        long long17 = dateTimeZone0.getMillisKeepLocal(dateTimeZone13, 0L);
        java.lang.String str18 = dateTimeZone13.getID();
        boolean boolean19 = dateTimeZone13.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-36060000L) + "'", long17 == (-36060000L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:01" + "'", str18, "+10:01");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone5.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean10 = dateTimeZone5.isFixed();
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        java.lang.Object obj12 = dateTimeZone5.writeReplace();
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.lang.String str14 = dateTimeZone1.toString();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getShortName(97L, locale16);
        int int19 = dateTimeZone1.getStandardOffset((long) 0);
        java.lang.Object obj20 = dateTimeZone1.writeReplace();
        long long23 = dateTimeZone1.convertLocalToUTC((long) 36600000, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-01:00" + "'", str14, "-01:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-01:00" + "'", str17, "-01:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-3600000) + "'", int19 == (-3600000));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 40200000L + "'", long23 == 40200000L);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int11 = dateTimeZone0.getOffset((-32459948L));
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone0.isLocalDateTimeGap(localDateTime12);
        java.lang.String str14 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(0L);
        long long6 = dateTimeZone1.convertLocalToUTC((long) 10, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3600000L) + "'", long3 == (-3600000L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3600010L + "'", long6 == 3600010L);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        java.lang.String str12 = dateTimeZone0.getNameKey((long) 0);
        java.lang.String str13 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj15 = dateTimeZone0.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffsetFromLocal((long) (short) 0);
        boolean boolean10 = dateTimeZone7.isFixed();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone7.getShortName((long) '4', locale12);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone7.isLocalDateTimeGap(localDateTime14);
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone7.isLocalDateTimeGap(localDateTime16);
        long long19 = dateTimeZone7.nextTransition((long) 1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long3 = dateTimeZone1.previousTransition(10L);
        java.lang.String str5 = dateTimeZone1.getName(32L);
        long long7 = dateTimeZone1.nextTransition(154320000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 154320000L + "'", long7 == 154320000L);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) 1);
        java.lang.String str4 = dateTimeZone2.getNameKey((long) (short) 0);
        long long7 = dateTimeZone2.convertLocalToUTC((long) 97, false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-36059903L) + "'", long7 == (-36059903L));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        boolean boolean20 = dateTimeZone0.isFixed();
        int int22 = dateTimeZone0.getStandardOffset((-187200000L));
        java.lang.String str23 = dateTimeZone0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str2 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        java.lang.String str14 = dateTimeZone0.getShortName((long) (byte) -1);
        long long16 = dateTimeZone0.nextTransition(52L);
        long long20 = dateTimeZone0.convertLocalToUTC((long) (-1), false, (-3599965L));
        long long22 = dateTimeZone0.nextTransition((long) (byte) 100);
        java.lang.String str24 = dateTimeZone0.getNameKey(0L);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone0.getShortName(1L, locale26);
        long long29 = dateTimeZone0.nextTransition((-363659999L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-363659999L) + "'", long29 == (-363659999L));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.Object obj8 = dateTimeZone7.writeReplace();
        java.lang.String str9 = dateTimeZone7.toString();
        long long12 = dateTimeZone7.convertLocalToUTC((-187199968L), true);
        java.lang.String str14 = dateTimeZone7.getShortName((-36060010L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187199968L) + "'", long12 == (-187199968L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone10 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long16 = dateTimeZone12.convertLocalToUTC(3600000L, true, (long) (-1));
        long long19 = dateTimeZone12.convertLocalToUTC((-2999965L), false);
        long long23 = dateTimeZone12.convertLocalToUTC((long) ' ', true, (-65L));
        long long25 = dateTimeZone12.convertUTCToLocal((-187200000L));
        boolean boolean26 = dateTimeZone12.isFixed();
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
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3600000L + "'", long16 == 3600000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-2999965L) + "'", long19 == (-2999965L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-187200000L) + "'", long25 == (-187200000L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone7.nextTransition(1L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone7.isLocalDateTimeGap(localDateTime10);
        java.util.TimeZone timeZone12 = dateTimeZone7.toTimeZone();
        java.lang.Class<?> wildcardClass13 = timeZone12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long3 = dateTimeZone1.previousTransition(10L);
        java.lang.String str5 = dateTimeZone1.getName(32L);
        long long7 = dateTimeZone1.convertUTCToLocal(115200000L);
        int int9 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 115200000L + "'", long7 == 115200000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone5.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean10 = dateTimeZone5.isFixed();
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        java.lang.Object obj12 = dateTimeZone5.writeReplace();
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.lang.String str14 = dateTimeZone1.toString();
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        int int18 = dateTimeZone1.getStandardOffset(42L);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone1.getOffset(readableInstant19);
        long long22 = dateTimeZone1.convertUTCToLocal((long) '4');
        java.lang.String str24 = dateTimeZone1.getShortName(230400000L);
        long long26 = dateTimeZone1.convertUTCToLocal(184200001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-01:00" + "'", str14, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3600000) + "'", int18 == (-3600000));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3600000) + "'", int20 == (-3600000));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3599948L) + "'", long22 == (-3599948L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-01:00" + "'", str24, "-01:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 180600001L + "'", long26 == 180600001L);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+52:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+52:00\" is malformed at \"52:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        boolean boolean3 = dateTimeZone1.isStandardOffset((-7200065L));
        int int5 = dateTimeZone1.getStandardOffset(600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        long long10 = dateTimeZone0.nextTransition((-3600000L));
        int int12 = dateTimeZone0.getOffsetFromLocal(0L);
        boolean boolean13 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone14 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3600000L) + "'", long10 == (-3600000L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 37920000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 37920000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.lang.String str9 = dateTimeZone0.getName((long) (byte) 10);
        int int11 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str12 = dateTimeZone0.toString();
        java.lang.String str13 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        long long10 = dateTimeZone0.previousTransition((long) 100);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getShortName(35L, locale12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean19 = dateTimeZone14.isFixed();
        java.util.TimeZone timeZone20 = dateTimeZone14.toTimeZone();
        int int22 = dateTimeZone14.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        java.lang.Object obj24 = dateTimeZone14.writeReplace();
        boolean boolean26 = dateTimeZone14.isStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        long long31 = dateTimeZone27.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean32 = dateTimeZone27.isFixed();
        java.util.TimeZone timeZone33 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        int int36 = dateTimeZone34.getOffsetFromLocal((long) (short) 0);
        java.lang.String str38 = dateTimeZone34.getShortName((long) (byte) 10);
        long long40 = dateTimeZone14.getMillisKeepLocal(dateTimeZone34, 0L);
        org.joda.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = dateTimeZone34.isLocalDateTimeGap(localDateTime41);
        java.lang.String str43 = dateTimeZone34.getID();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj45 = dateTimeZone44.writeReplace();
        boolean boolean46 = dateTimeZone34.equals((java.lang.Object) dateTimeZone44);
        long long48 = dateTimeZone0.getMillisKeepLocal(dateTimeZone44, (-32459948L));
        java.lang.String str50 = dateTimeZone44.getShortName(148200000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTC" + "'", str43, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-32459948L) + "'", long48 == (-32459948L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00" + "'", str50, "+00:00");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long10 = dateTimeZone6.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean11 = dateTimeZone6.isFixed();
        java.util.TimeZone timeZone12 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone13, (long) (byte) 10);
        long long19 = dateTimeZone13.convertLocalToUTC((-65L), false, 7200010L);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-65L) + "'", long19 == (-65L));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, 36600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (-1));
        java.lang.String str12 = dateTimeZone0.toString();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone0.getName(32L, locale14);
        long long17 = dateTimeZone0.nextTransition((long) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        int int21 = dateTimeZone19.getOffsetFromLocal((long) 1);
        long long24 = dateTimeZone19.convertLocalToUTC((long) (byte) 1, true);
        boolean boolean25 = dateTimeZone19.isFixed();
        long long27 = dateTimeZone0.getMillisKeepLocal(dateTimeZone19, (-115200001L));
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = dateTimeZone19.isLocalDateTimeGap(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3600000 + "'", int21 == 3600000);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3599999L) + "'", long24 == (-3599999L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-118800001L) + "'", long27 == (-118800001L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str10 = dateTimeZone0.toString();
        int int12 = dateTimeZone0.getOffsetFromLocal((long) 'a');
        boolean boolean14 = dateTimeZone0.isStandardOffset((long) (byte) 100);
        int int16 = dateTimeZone0.getOffset(100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        int int9 = dateTimeZone0.getOffset((long) 1);
        boolean boolean11 = dateTimeZone0.isStandardOffset(10L);
        java.lang.String str13 = dateTimeZone0.getNameKey((long) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) 1);
        long long4 = dateTimeZone2.previousTransition((long) '#');
        java.lang.String str6 = dateTimeZone2.getNameKey((long) (byte) -1);
        long long8 = dateTimeZone2.nextTransition((long) 0);
        long long10 = dateTimeZone2.nextTransition((long) (short) 100);
        long long12 = dateTimeZone2.previousTransition((-3599948L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3599948L) + "'", long12 == (-3599948L));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.lang.String str9 = dateTimeZone0.getName((long) (byte) 10);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getShortName(100L, locale11);
        java.lang.String str14 = dateTimeZone0.getShortName(115200000L);
        java.lang.String str16 = dateTimeZone0.getNameKey(32400001L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        java.lang.String str34 = dateTimeZone23.getID();
        java.lang.String str35 = dateTimeZone23.getID();
        boolean boolean37 = dateTimeZone23.isStandardOffset(3600010L);
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = dateTimeZone23.getOffset(readableInstant38);
        java.lang.String str41 = dateTimeZone23.getShortName((-3599965L));
        java.lang.String str42 = dateTimeZone23.getID();
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone23.getShortName((-7200065L), locale44);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00" + "'", str45, "+00:00");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        java.lang.String str34 = dateTimeZone23.getID();
        java.lang.String str35 = dateTimeZone23.getID();
        boolean boolean37 = dateTimeZone23.isStandardOffset(3600010L);
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = dateTimeZone23.getOffset(readableInstant38);
        java.lang.String str41 = dateTimeZone23.getShortName((-3599965L));
        long long43 = dateTimeZone23.previousTransition(32400001L);
        java.lang.Object obj44 = dateTimeZone23.writeReplace();
        java.lang.String str45 = dateTimeZone23.toString();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 32400001L + "'", long43 == 32400001L);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UTC" + "'", str45, "UTC");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getShortName(0L, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName((long) 3600000, locale13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.lang.String str18 = dateTimeZone16.getShortName((long) (byte) 100);
        long long21 = dateTimeZone16.convertLocalToUTC((long) '4', true);
        java.lang.String str22 = dateTimeZone16.toString();
        boolean boolean23 = dateTimeZone0.equals((java.lang.Object) str22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone0.getShortName(3599935L, locale25);
        long long28 = dateTimeZone0.convertUTCToLocal((long) 'a');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 42L + "'", long21 == 42L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.010" + "'", str22, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 97L + "'", long28 == 97L);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.String str5 = dateTimeZone1.getShortName(97L);
        int int7 = dateTimeZone1.getOffset((long) (short) 100);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((long) 187200000, locale9);
        int int12 = dateTimeZone1.getOffset(33000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3600000L) + "'", long3 == (-3600000L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3600000) + "'", int7 == (-3600000));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-01:00" + "'", str10, "-01:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3600000) + "'", int12 == (-3600000));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long3 = dateTimeZone1.previousTransition(10L);
        int int5 = dateTimeZone1.getOffset((long) (short) 0);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        long long8 = dateTimeZone1.convertUTCToLocal((long) 0);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean7 = dateTimeZone0.isStandardOffset((long) (byte) 1);
        long long10 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        long long16 = dateTimeZone0.convertLocalToUTC(100L, false, 3600010L);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone0.isLocalDateTimeGap(localDateTime17);
        boolean boolean20 = dateTimeZone0.isStandardOffset((-34320000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) 10);
        long long4 = dateTimeZone2.previousTransition((-32459948L));
        java.lang.Object obj5 = dateTimeZone2.writeReplace();
        long long7 = dateTimeZone2.nextTransition(187200000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-32459948L) + "'", long4 == (-32459948L));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 187200000L + "'", long7 == 187200000L);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        int int10 = dateTimeZone0.getOffsetFromLocal((long) '4');
        long long13 = dateTimeZone0.convertLocalToUTC(157920000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 157920000L + "'", long13 == 157920000L);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        int int32 = dateTimeZone0.getOffsetFromLocal((-3599965L));
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        long long37 = dateTimeZone33.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean38 = dateTimeZone33.isFixed();
        java.util.TimeZone timeZone39 = dateTimeZone33.toTimeZone();
        int int41 = dateTimeZone33.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        java.lang.Object obj43 = dateTimeZone33.writeReplace();
        org.joda.time.LocalDateTime localDateTime44 = null;
        boolean boolean45 = dateTimeZone33.isLocalDateTimeGap(localDateTime44);
        java.lang.String str47 = dateTimeZone33.getShortName((long) (byte) -1);
        long long49 = dateTimeZone33.nextTransition(52L);
        long long53 = dateTimeZone33.convertLocalToUTC((long) (-1), false, (-3599965L));
        long long56 = dateTimeZone33.convertLocalToUTC((long) (short) 10, false);
        java.lang.String str58 = dateTimeZone33.getShortName(226800000L);
        long long60 = dateTimeZone0.getMillisKeepLocal(dateTimeZone33, 0L);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00" + "'", str47, "+00:00");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 52L + "'", long49 == 52L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 10L + "'", long56 == 10L);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+00:00" + "'", str58, "+00:00");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (-1));
        java.lang.String str12 = dateTimeZone0.toString();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone0.getName(32L, locale14);
        long long17 = dateTimeZone0.nextTransition((long) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        int int21 = dateTimeZone19.getOffsetFromLocal((long) 1);
        long long24 = dateTimeZone19.convertLocalToUTC((long) (byte) 1, true);
        boolean boolean25 = dateTimeZone19.isFixed();
        long long27 = dateTimeZone0.getMillisKeepLocal(dateTimeZone19, (-115200001L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3600000 + "'", int21 == 3600000);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3599999L) + "'", long24 == (-3599999L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-118800001L) + "'", long27 == (-118800001L));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        long long11 = dateTimeZone0.previousTransition((long) (byte) 1);
        long long13 = dateTimeZone0.previousTransition(3599999L);
        int int15 = dateTimeZone0.getStandardOffset(35L);
        int int17 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone0.getName((-65L), locale19);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3599999L + "'", long13 == 3599999L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        int int9 = dateTimeZone1.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean12 = dateTimeZone1.isStandardOffset((long) (-1));
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) ' ');
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        int int18 = dateTimeZone1.getOffset((-3599890L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        boolean boolean21 = dateTimeZone17.isFixed();
        java.lang.String str23 = dateTimeZone17.getShortName((long) 1);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffsetFromLocal((long) (short) 0);
        boolean boolean10 = dateTimeZone7.isFixed();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone7.getShortName((long) '4', locale12);
        java.util.TimeZone timeZone14 = dateTimeZone7.toTimeZone();
        int int16 = dateTimeZone7.getStandardOffset(184200001L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36600000, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.util.TimeZone timeZone4 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+10:10");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36600000 + "'", int7 == 36600000);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        int int31 = dateTimeZone4.getStandardOffset((long) 10);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.010");
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        long long32 = dateTimeZone28.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean33 = dateTimeZone28.isFixed();
        java.util.TimeZone timeZone34 = dateTimeZone28.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        int int37 = dateTimeZone35.getOffsetFromLocal((long) (short) 0);
        java.lang.String str39 = dateTimeZone35.getShortName((long) 0);
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone35.getShortName(0L, locale41);
        boolean boolean43 = dateTimeZone35.isFixed();
        long long45 = dateTimeZone35.previousTransition((long) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone35);
        boolean boolean48 = dateTimeZone35.isStandardOffset((long) 36060000);
        boolean boolean49 = dateTimeZone20.equals((java.lang.Object) boolean48);
        long long52 = dateTimeZone20.convertLocalToUTC((long) '4', true);
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
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00" + "'", str39, "+00:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 52L + "'", long52 == 52L);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.String str5 = dateTimeZone1.getShortName(97L);
        java.lang.String str6 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName(32460000L, locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3600000L) + "'", long3 == (-3600000L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-01:00" + "'", str11, "-01:00");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        long long10 = dateTimeZone0.nextTransition((-3600000L));
        int int12 = dateTimeZone0.getOffset((long) (byte) 1);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone0.getShortName(36000010L, locale14);
        boolean boolean17 = dateTimeZone0.isStandardOffset(32999935L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3600000L) + "'", long10 == (-3600000L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.lang.String str9 = dateTimeZone0.getName((long) (byte) 10);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getName((-3599965L), locale11);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((long) (short) -1, locale7);
        long long11 = dateTimeZone0.convertLocalToUTC((long) (byte) 10, false);
        int int13 = dateTimeZone0.getOffsetFromLocal(3599999L);
        int int15 = dateTimeZone0.getOffset(187200000L);
        boolean boolean16 = dateTimeZone0.isFixed();
        java.lang.String str17 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 36060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36060000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        java.lang.String str9 = dateTimeZone0.toString();
        long long11 = dateTimeZone0.previousTransition((-3599948L));
        int int13 = dateTimeZone0.getOffsetFromLocal(32460000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3599948L) + "'", long11 == (-3599948L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) 10);
        long long4 = dateTimeZone2.previousTransition((-32459948L));
        java.lang.Object obj5 = dateTimeZone2.writeReplace();
        int int7 = dateTimeZone2.getStandardOffset(3600097L);
        long long11 = dateTimeZone2.convertLocalToUTC((long) 600000, false, 3600000L);
        java.lang.Class<?> wildcardClass12 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-32459948L) + "'", long4 == (-32459948L));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36600000 + "'", int7 == 36600000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-36000000L) + "'", long11 == (-36000000L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        long long12 = dateTimeZone0.previousTransition(10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone0.getOffset(readableInstant13);
        java.lang.String str16 = dateTimeZone0.getShortName((long) (short) 10);
        java.lang.String str17 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone7.getShortName((long) 2100000, locale17);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone0.getShortName(0L, locale22);
        java.lang.Object obj24 = dateTimeZone0.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        long long29 = dateTimeZone25.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean30 = dateTimeZone25.isFixed();
        java.util.TimeZone timeZone31 = dateTimeZone25.toTimeZone();
        int int33 = dateTimeZone25.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        java.lang.Object obj35 = dateTimeZone25.writeReplace();
        boolean boolean37 = dateTimeZone25.isStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        long long42 = dateTimeZone38.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean43 = dateTimeZone38.isFixed();
        java.util.TimeZone timeZone44 = dateTimeZone38.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        int int47 = dateTimeZone45.getOffsetFromLocal((long) (short) 0);
        java.lang.String str49 = dateTimeZone45.getShortName((long) (byte) 10);
        long long51 = dateTimeZone25.getMillisKeepLocal(dateTimeZone45, 0L);
        org.joda.time.LocalDateTime localDateTime52 = null;
        boolean boolean53 = dateTimeZone45.isLocalDateTimeGap(localDateTime52);
        java.lang.String str54 = dateTimeZone45.getID();
        boolean boolean55 = dateTimeZone0.equals((java.lang.Object) str54);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00" + "'", str49, "+00:00");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "UTC" + "'", str54, "UTC");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        java.lang.String str28 = dateTimeZone0.getNameKey((long) 1);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone0.getName((-36060010L), locale30);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        java.lang.String str11 = dateTimeZone0.getShortName((long) (short) 10);
        long long13 = dateTimeZone0.nextTransition((long) 1);
        long long15 = dateTimeZone0.convertUTCToLocal(36600000L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone0.getShortName((long) 36600000, locale17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        long long24 = dateTimeZone20.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean25 = dateTimeZone20.isFixed();
        java.util.TimeZone timeZone26 = dateTimeZone20.toTimeZone();
        int int28 = dateTimeZone20.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        boolean boolean31 = dateTimeZone20.isStandardOffset((long) (-1));
        long long33 = dateTimeZone19.getMillisKeepLocal(dateTimeZone20, (long) ' ');
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone20.isLocalDateTimeGap(localDateTime34);
        long long37 = dateTimeZone0.getMillisKeepLocal(dateTimeZone20, 43140000L);
        java.lang.Class<?> wildcardClass38 = dateTimeZone20.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 36600000L + "'", long15 == 36600000L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 43140000L + "'", long37 == 43140000L);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        int int9 = dateTimeZone1.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean12 = dateTimeZone1.isStandardOffset((long) (-1));
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) ' ');
        java.lang.String str16 = dateTimeZone0.getName((long) (byte) 1);
        long long18 = dateTimeZone0.nextTransition((long) (short) 1);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone0.getShortName(100L, locale20);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        long long26 = dateTimeZone22.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean27 = dateTimeZone22.isFixed();
        java.util.TimeZone timeZone28 = dateTimeZone22.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        int int31 = dateTimeZone29.getOffset(1L);
        long long33 = dateTimeZone29.previousTransition((long) (byte) 1);
        long long35 = dateTimeZone29.convertUTCToLocal((long) 1);
        long long37 = dateTimeZone0.getMillisKeepLocal(dateTimeZone29, (long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        long long42 = dateTimeZone38.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean43 = dateTimeZone38.isFixed();
        java.lang.String str45 = dateTimeZone38.getShortName((-1L));
        java.util.TimeZone timeZone46 = dateTimeZone38.toTimeZone();
        long long48 = dateTimeZone38.nextTransition((-3600000L));
        int int50 = dateTimeZone38.getOffset((long) (byte) 1);
        java.lang.String str51 = dateTimeZone38.getID();
        java.lang.String str52 = dateTimeZone38.getID();
        boolean boolean53 = dateTimeZone0.equals((java.lang.Object) str52);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00" + "'", str45, "+00:00");
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-3600000L) + "'", long48 == (-3600000L));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "UTC" + "'", str51, "UTC");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "UTC" + "'", str52, "UTC");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        java.lang.String str9 = dateTimeZone0.toString();
        int int11 = dateTimeZone0.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone12 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
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
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.Object obj8 = dateTimeZone7.writeReplace();
        java.lang.String str9 = dateTimeZone7.toString();
        long long11 = dateTimeZone7.previousTransition((long) 0);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone7.isLocalDateTimeGap(localDateTime12);
        java.lang.String str15 = dateTimeZone7.getShortName(7200035L);
        java.lang.String str17 = dateTimeZone7.getName(35L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, false);
        java.lang.String str6 = dateTimeZone1.getName((-36060000L));
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2100000, 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffsetFromLocal((long) (short) 0);
        boolean boolean10 = dateTimeZone7.isFixed();
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone7.getOffset(readableInstant11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long17 = dateTimeZone13.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean18 = dateTimeZone13.isFixed();
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        int int22 = dateTimeZone20.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone23 = dateTimeZone20.toTimeZone();
        long long25 = dateTimeZone20.convertUTCToLocal((long) ' ');
        boolean boolean26 = dateTimeZone7.equals((java.lang.Object) ' ');
        boolean boolean28 = dateTimeZone7.isStandardOffset(32400001L);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone7.getName((-187199968L), locale30);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        int int9 = dateTimeZone1.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean12 = dateTimeZone1.isStandardOffset((long) (-1));
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) ' ');
        boolean boolean15 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 10);
        boolean boolean19 = dateTimeZone0.equals((java.lang.Object) 10);
        java.lang.String str20 = dateTimeZone0.toString();
        boolean boolean22 = dateTimeZone0.isStandardOffset(237600000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((long) (short) -1, locale7);
        long long11 = dateTimeZone0.convertLocalToUTC((long) (byte) 10, false);
        int int13 = dateTimeZone0.getOffsetFromLocal(3599999L);
        int int15 = dateTimeZone0.getOffset(187200000L);
        int int17 = dateTimeZone0.getOffset((long) 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        java.lang.Object obj7 = dateTimeZone0.writeReplace();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) '4');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        java.util.TimeZone timeZone34 = dateTimeZone23.toTimeZone();
        java.lang.String str35 = dateTimeZone23.toString();
        java.util.TimeZone timeZone36 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
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
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        java.util.TimeZone timeZone19 = dateTimeZone0.toTimeZone();
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone0.isLocalDateTimeGap(localDateTime20);
        long long25 = dateTimeZone0.convertLocalToUTC((long) 0, true, 32460000L);
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
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = dateTimeZone20.getOffset(readableInstant32);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        long long38 = dateTimeZone34.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean39 = dateTimeZone34.isFixed();
        java.util.TimeZone timeZone40 = dateTimeZone34.toTimeZone();
        int int42 = dateTimeZone34.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone34);
        long long47 = dateTimeZone34.convertLocalToUTC((long) 10, false, 10L);
        long long49 = dateTimeZone34.convertUTCToLocal((long) (byte) -1);
        long long51 = dateTimeZone20.getMillisKeepLocal(dateTimeZone34, (long) (byte) -1);
        java.util.Locale locale53 = null;
        java.lang.String str54 = dateTimeZone20.getName((long) 1, locale53);
        java.lang.Class<?> wildcardClass55 = dateTimeZone20.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L + "'", long47 == 10L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00" + "'", str54, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) 1);
        long long4 = dateTimeZone2.previousTransition((long) '#');
        java.lang.String str6 = dateTimeZone2.getNameKey((long) (byte) -1);
        long long8 = dateTimeZone2.nextTransition((long) 0);
        java.lang.String str10 = dateTimeZone2.getNameKey(100L);
        long long13 = dateTimeZone2.convertLocalToUTC(183600097L, false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 147540097L + "'", long13 == 147540097L);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        int int7 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str9 = dateTimeZone0.getNameKey((long) (byte) 1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getName((long) '4', locale11);
        long long14 = dateTimeZone0.convertUTCToLocal((long) 36600000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 36600000L + "'", long14 == 36600000L);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.String str5 = dateTimeZone1.getShortName(97L);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long8 = dateTimeZone1.convertUTCToLocal(7200010L);
        java.lang.String str9 = dateTimeZone1.toString();
        boolean boolean10 = dateTimeZone1.isFixed();
        long long13 = dateTimeZone1.convertLocalToUTC(226800000L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3600000L) + "'", long3 == (-3600000L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600010L + "'", long8 == 3600010L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-01:00" + "'", str9, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 230400000L + "'", long13 == 230400000L);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        int int7 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str9 = dateTimeZone0.getNameKey((long) (byte) 1);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        java.lang.Class<?> wildcardClass11 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.lang.String str3 = dateTimeZone1.getShortName((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long8 = dateTimeZone4.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean9 = dateTimeZone4.isFixed();
        java.lang.String str11 = dateTimeZone4.getShortName((-1L));
        java.util.TimeZone timeZone12 = dateTimeZone4.toTimeZone();
        long long14 = dateTimeZone4.previousTransition((long) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        long long19 = dateTimeZone15.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean20 = dateTimeZone15.isFixed();
        java.util.TimeZone timeZone21 = dateTimeZone15.toTimeZone();
        int int23 = dateTimeZone15.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        boolean boolean26 = dateTimeZone15.isStandardOffset((long) (-1));
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone15.getName((long) (short) -1, locale28);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone15.isLocalDateTimeGap(localDateTime30);
        long long34 = dateTimeZone15.convertLocalToUTC((long) '#', false);
        long long36 = dateTimeZone4.getMillisKeepLocal(dateTimeZone15, 42L);
        long long38 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, (-3599900L));
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone15.getShortName((long) (short) 100, locale40);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.010" + "'", str3, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 35L + "'", long34 == 35L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 42L + "'", long36 == 42L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-3599890L) + "'", long38 == (-3599890L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.String str9 = dateTimeZone7.getShortName((long) 1);
        boolean boolean10 = dateTimeZone7.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone0.getShortName((long) (byte) 10, locale3);
        java.lang.Object obj5 = dateTimeZone0.writeReplace();
        long long8 = dateTimeZone0.convertLocalToUTC((-32459948L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-32459948L) + "'", long8 == (-32459948L));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        boolean boolean8 = dateTimeZone0.isStandardOffset(0L);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        long long11 = dateTimeZone0.nextTransition((-1L));
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone0.getOffset(readableInstant12);
        int int15 = dateTimeZone0.getOffset(32999935L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
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
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((long) 100);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getNameKey((long) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) 1);
        java.lang.String str12 = dateTimeZone10.getNameKey((long) (short) 0);
        java.util.TimeZone timeZone13 = dateTimeZone10.toTimeZone();
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (long) '4');
        boolean boolean17 = dateTimeZone1.isStandardOffset(10L);
        long long19 = dateTimeZone1.nextTransition((long) (-1));
        long long21 = dateTimeZone1.previousTransition(36000010L);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 36000010L + "'", long21 == 36000010L);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffsetFromLocal((long) (short) 0);
        java.lang.String str11 = dateTimeZone7.getShortName((long) 0);
        long long13 = dateTimeZone7.previousTransition(3599999L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone7.getShortName(4200000L, locale15);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3599999L + "'", long13 == 3599999L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (short) -1);
        java.lang.String str4 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.010" + "'", str4, "+00:00:00.010");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        int int8 = dateTimeZone1.getOffsetFromLocal((long) 1);
        long long10 = dateTimeZone1.nextTransition(111600000L);
        java.lang.String str11 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3600000 + "'", int8 == 3600000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 111600000L + "'", long10 == 111600000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:00" + "'", str11, "+01:00");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+35:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+35:00\" is malformed at \"35:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        long long12 = dateTimeZone0.previousTransition(10L);
        java.util.TimeZone timeZone13 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.Class<?> wildcardClass15 = timeZone13.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone24.isLocalDateTimeGap(localDateTime27);
        long long30 = dateTimeZone24.previousTransition((-3000000L));
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-3000000L) + "'", long30 == (-3000000L));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        java.lang.String str14 = dateTimeZone0.getShortName((long) (byte) -1);
        long long16 = dateTimeZone0.nextTransition(52L);
        long long20 = dateTimeZone0.convertLocalToUTC((long) (-1), false, (-3599965L));
        long long22 = dateTimeZone0.nextTransition((long) (byte) 100);
        java.lang.String str24 = dateTimeZone0.getNameKey(0L);
        java.lang.Class<?> wildcardClass25 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((long) 100);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getNameKey((long) 10);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone9.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean14 = dateTimeZone9.isFixed();
        java.lang.String str16 = dateTimeZone9.getShortName((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (-3600000L));
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone1.getShortName((-7199968L), locale21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long27 = dateTimeZone24.convertLocalToUTC(0L, true);
        long long29 = dateTimeZone24.nextTransition((long) 1);
        long long31 = dateTimeZone1.getMillisKeepLocal(dateTimeZone24, (long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long36 = dateTimeZone32.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone32.getName(100L, locale38);
        long long41 = dateTimeZone32.previousTransition((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        long long46 = dateTimeZone42.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean47 = dateTimeZone42.isFixed();
        java.lang.String str49 = dateTimeZone42.getShortName((-1L));
        java.util.TimeZone timeZone50 = dateTimeZone42.toTimeZone();
        java.util.Locale locale52 = null;
        java.lang.String str53 = dateTimeZone42.getShortName(0L, locale52);
        boolean boolean54 = dateTimeZone32.equals((java.lang.Object) str53);
        long long56 = dateTimeZone32.nextTransition(100L);
        long long59 = dateTimeZone32.convertLocalToUTC(111600000L, true);
        long long61 = dateTimeZone32.nextTransition(3600000L);
        boolean boolean62 = dateTimeZone1.equals((java.lang.Object) long61);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:00" + "'", str5, "+01:00");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+01:00" + "'", str22, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-3600000L) + "'", long27 == (-3600000L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00" + "'", str39, "+00:00");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00" + "'", str49, "+00:00");
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+00:00" + "'", str53, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 100L + "'", long56 == 100L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 111600000L + "'", long59 == 111600000L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 3600000L + "'", long61 == 3600000L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.lang.String str3 = dateTimeZone1.getShortName((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long8 = dateTimeZone4.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean9 = dateTimeZone4.isFixed();
        java.lang.String str11 = dateTimeZone4.getShortName((-1L));
        java.util.TimeZone timeZone12 = dateTimeZone4.toTimeZone();
        long long14 = dateTimeZone4.previousTransition((long) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        long long19 = dateTimeZone15.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean20 = dateTimeZone15.isFixed();
        java.util.TimeZone timeZone21 = dateTimeZone15.toTimeZone();
        int int23 = dateTimeZone15.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        boolean boolean26 = dateTimeZone15.isStandardOffset((long) (-1));
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone15.getName((long) (short) -1, locale28);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone15.isLocalDateTimeGap(localDateTime30);
        long long34 = dateTimeZone15.convertLocalToUTC((long) '#', false);
        long long36 = dateTimeZone4.getMillisKeepLocal(dateTimeZone15, 42L);
        long long38 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, (-3599900L));
        java.lang.String str40 = dateTimeZone1.getShortName((-3600000L));
        java.lang.String str42 = dateTimeZone1.getNameKey(52L);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        long long47 = dateTimeZone43.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean48 = dateTimeZone43.isFixed();
        java.util.TimeZone timeZone49 = dateTimeZone43.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        int int52 = dateTimeZone50.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone53 = dateTimeZone50.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        java.lang.Class<?> wildcardClass55 = dateTimeZone54.getClass();
        boolean boolean56 = dateTimeZone1.equals((java.lang.Object) wildcardClass55);
        long long58 = dateTimeZone1.previousTransition(600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.010" + "'", str3, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 35L + "'", long34 == 35L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 42L + "'", long36 == 42L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-3599890L) + "'", long38 == (-3599890L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.010" + "'", str40, "+00:00:00.010");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 600000L + "'", long58 == 600000L);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone6.getOffset(readableInstant34);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone36);
        boolean boolean39 = dateTimeZone36.equals((java.lang.Object) 10L);
        long long41 = dateTimeZone6.getMillisKeepLocal(dateTimeZone36, (-3599900L));
        java.lang.String str43 = dateTimeZone36.getNameKey(52L);
        long long47 = dateTimeZone36.convertLocalToUTC(79140010L, true, (-3599890L));
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-3599900L) + "'", long41 == (-3599900L));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTC" + "'", str43, "UTC");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 79140010L + "'", long47 == 79140010L);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((-36060010L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        java.lang.String str34 = dateTimeZone23.getID();
        java.lang.String str35 = dateTimeZone23.getID();
        boolean boolean37 = dateTimeZone23.isStandardOffset(3600010L);
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = dateTimeZone23.getOffset(readableInstant38);
        java.lang.String str41 = dateTimeZone23.getShortName((-3599965L));
        java.lang.String str42 = dateTimeZone23.getID();
        boolean boolean44 = dateTimeZone23.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone8.isLocalDateTimeGap(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.Object obj8 = dateTimeZone7.writeReplace();
        java.lang.String str9 = dateTimeZone7.toString();
        long long13 = dateTimeZone7.convertLocalToUTC((long) (short) 1, false, 3599935L);
        java.lang.Class<?> wildcardClass14 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        java.lang.String str8 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:00" + "'", str8, "+01:00");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str6 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone7.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean12 = dateTimeZone7.isFixed();
        java.util.TimeZone timeZone13 = dateTimeZone7.toTimeZone();
        boolean boolean15 = dateTimeZone7.isStandardOffset(0L);
        java.util.TimeZone timeZone16 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        long long21 = dateTimeZone0.getMillisKeepLocal(dateTimeZone19, 36000010L);
        java.lang.Class<?> wildcardClass22 = dateTimeZone19.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 36000010L + "'", long21 == 36000010L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone5.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean10 = dateTimeZone5.isFixed();
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        java.lang.Object obj12 = dateTimeZone5.writeReplace();
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.lang.String str14 = dateTimeZone1.toString();
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone16.getOffset(readableInstant17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-01:00" + "'", str14, "-01:00");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3600000) + "'", int18 == (-3600000));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 100);
        java.lang.String str2 = dateTimeZone1.toString();
        int int4 = dateTimeZone1.getOffsetFromLocal(360000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long6 = dateTimeZone3.convertLocalToUTC(0L, true);
        boolean boolean7 = dateTimeZone3.isFixed();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone8.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean13 = dateTimeZone8.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean19 = dateTimeZone14.isFixed();
        java.util.TimeZone timeZone20 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        long long23 = dateTimeZone8.getMillisKeepLocal(dateTimeZone21, (long) (byte) 10);
        boolean boolean24 = dateTimeZone3.equals((java.lang.Object) dateTimeZone8);
        long long26 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (short) 1);
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone1.getOffset(readableInstant27);
        long long30 = dateTimeZone1.previousTransition((-223200000L));
        int int32 = dateTimeZone1.getOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3600000L) + "'", long6 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-3599999L) + "'", long26 == (-3599999L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-223200000L) + "'", long30 == (-223200000L));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        long long19 = dateTimeZone0.convertLocalToUTC((long) '#', false);
        long long21 = dateTimeZone0.nextTransition(111600000L);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        long long26 = dateTimeZone22.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean27 = dateTimeZone22.isFixed();
        java.lang.String str29 = dateTimeZone22.getShortName((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        long long33 = dateTimeZone22.convertLocalToUTC(3600010L, false);
        java.lang.String str35 = dateTimeZone22.getNameKey((long) 10);
        int int37 = dateTimeZone22.getOffsetFromLocal(52L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        long long40 = dateTimeZone0.getMillisKeepLocal(dateTimeZone22, 0L);
        java.lang.Object obj41 = dateTimeZone22.writeReplace();
        java.lang.String str43 = dateTimeZone22.getNameKey((-352799990L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 111600000L + "'", long21 == 111600000L);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 3600010L + "'", long33 == 3600010L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTC" + "'", str43, "UTC");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long13 = dateTimeZone0.convertLocalToUTC((long) 10, false, 10L);
        long long15 = dateTimeZone0.convertUTCToLocal((long) 3600000);
        long long19 = dateTimeZone0.convertLocalToUTC((long) 1, false, (long) (byte) 0);
        long long22 = dateTimeZone0.convertLocalToUTC(226800000L, false);
        long long26 = dateTimeZone0.convertLocalToUTC(7200035L, false, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3600000L + "'", long15 == 3600000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 226800000L + "'", long22 == 226800000L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 7200035L + "'", long26 == 7200035L);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str5 = dateTimeZone1.toString();
        java.lang.String str7 = dateTimeZone1.getNameKey((-187199968L));
        java.lang.String str9 = dateTimeZone1.getNameKey((long) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:00" + "'", str5, "+01:00");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 97, locale8);
        int int11 = dateTimeZone1.getStandardOffset(154320000L);
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+01:00" + "'", str9, "+01:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3600000 + "'", int11 == 3600000);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+01:00");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) 1);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        long long10 = dateTimeZone1.convertUTCToLocal((-65L));
        long long13 = dateTimeZone1.convertLocalToUTC(187800001L, false);
        long long15 = dateTimeZone1.convertUTCToLocal(157920000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3599935L + "'", long10 == 3599935L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 184200001L + "'", long13 == 184200001L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 161520000L + "'", long15 == 161520000L);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getStandardOffset((-118319968L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187200000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long3 = dateTimeZone1.previousTransition(10L);
        java.lang.String str5 = dateTimeZone1.getShortName((-39660000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        int int30 = dateTimeZone20.getOffset((long) (short) 1);
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = dateTimeZone20.isLocalDateTimeGap(localDateTime31);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        long long37 = dateTimeZone33.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean38 = dateTimeZone33.isFixed();
        java.util.TimeZone timeZone39 = dateTimeZone33.toTimeZone();
        int int41 = dateTimeZone33.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        java.lang.String str43 = dateTimeZone33.toString();
        int int45 = dateTimeZone33.getOffsetFromLocal((long) 'a');
        boolean boolean46 = dateTimeZone20.equals((java.lang.Object) int45);
        java.lang.Class<?> wildcardClass47 = dateTimeZone20.getClass();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTC" + "'", str43, "UTC");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) '#');
        java.lang.String str3 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((long) 100);
        java.lang.String str4 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertUTCToLocal(10L);
        long long8 = dateTimeZone1.nextTransition((long) (-1));
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3600010L + "'", long6 == 3600010L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long3 = dateTimeZone1.previousTransition(10L);
        java.lang.String str5 = dateTimeZone1.getName(32L);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getStandardOffset((-39599999L));
        int int10 = dateTimeZone1.getOffset(3599999L);
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        int int3 = dateTimeZone1.getOffsetFromLocal(36060000L);
        java.lang.String str4 = dateTimeZone1.toString();
        long long6 = dateTimeZone1.nextTransition((long) 'a');
        int int8 = dateTimeZone1.getStandardOffset(115200000L);
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600000 + "'", int3 == 3600000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3600000 + "'", int8 == 3600000);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        java.util.TimeZone timeZone19 = dateTimeZone0.toTimeZone();
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone0.isLocalDateTimeGap(localDateTime20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone0.getOffset(readableInstant22);
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
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) 1);
        long long4 = dateTimeZone2.previousTransition((long) '#');
        java.lang.String str6 = dateTimeZone2.getNameKey((long) (byte) -1);
        long long8 = dateTimeZone2.nextTransition((long) 0);
        java.lang.String str10 = dateTimeZone2.getNameKey(100L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone11.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean16 = dateTimeZone11.isFixed();
        java.lang.String str18 = dateTimeZone11.getShortName((-1L));
        java.util.TimeZone timeZone19 = dateTimeZone11.toTimeZone();
        long long21 = dateTimeZone11.nextTransition((-3600000L));
        int int23 = dateTimeZone11.getOffset((long) (byte) 1);
        java.lang.String str24 = dateTimeZone11.getID();
        java.lang.String str25 = dateTimeZone11.getID();
        java.util.TimeZone timeZone26 = dateTimeZone11.toTimeZone();
        int int28 = dateTimeZone11.getStandardOffset((-3599968L));
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone11.getOffset(readableInstant29);
        long long32 = dateTimeZone2.getMillisKeepLocal(dateTimeZone11, (long) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-3600000L) + "'", long21 == (-3600000L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 36059999L + "'", long32 == 36059999L);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.lang.String str9 = dateTimeZone0.getName((long) (byte) 10);
        int int11 = dateTimeZone0.getStandardOffset(0L);
        long long15 = dateTimeZone0.convertLocalToUTC(0L, false, (long) (short) -1);
        long long17 = dateTimeZone0.previousTransition((long) (-1));
        long long19 = dateTimeZone0.previousTransition((-34320000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-34320000L) + "'", long19 == (-34320000L));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, false);
        int int6 = dateTimeZone1.getOffsetFromLocal(3600000L);
        long long9 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.tz.NameProvider nameProvider13 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider13);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider13);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider13);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider13);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider13);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider13);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider13);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider13);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider13);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider13);
        boolean boolean24 = dateTimeZone12.equals((java.lang.Object) nameProvider13);
        java.lang.Class<?> wildcardClass25 = dateTimeZone12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3600000) + "'", int6 == (-3600000));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600010L + "'", long9 == 3600010L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(nameProvider13);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        java.lang.String str5 = dateTimeZone1.getShortName((long) 0);
        int int7 = dateTimeZone1.getOffset((-3600000L));
        java.lang.String str9 = dateTimeZone1.getNameKey(144600000L);
        long long12 = dateTimeZone1.convertLocalToUTC((long) (-3600000), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-118800000L) + "'", long12 == (-118800000L));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        long long19 = dateTimeZone0.convertLocalToUTC((long) '#', false);
        long long21 = dateTimeZone0.nextTransition(111600000L);
        java.util.TimeZone timeZone22 = dateTimeZone0.toTimeZone();
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone0.getShortName(32999935L, locale24);
        java.lang.String str27 = dateTimeZone0.getNameKey(3600011L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 111600000L + "'", long21 == 111600000L);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone5.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean10 = dateTimeZone5.isFixed();
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        java.lang.Object obj12 = dateTimeZone5.writeReplace();
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean19 = dateTimeZone14.isFixed();
        java.lang.String str21 = dateTimeZone14.getShortName((-1L));
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, (long) '#');
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone1.isLocalDateTimeGap(localDateTime24);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone1.isLocalDateTimeGap(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-3599965L) + "'", long23 == (-3599965L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) 1);
        int int9 = dateTimeZone1.getStandardOffset(0L);
        java.lang.String str11 = dateTimeZone1.getShortName(36060000L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName((long) 36600000, locale13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3600000 + "'", int9 == 3600000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:00" + "'", str11, "+01:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:00" + "'", str14, "+01:00");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36600000, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long11 = dateTimeZone0.convertLocalToUTC(3600010L, false);
        java.lang.String str13 = dateTimeZone0.getNameKey((long) 360000000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str16 = dateTimeZone0.getShortName(37920000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600010L + "'", long11 == 3600010L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        boolean boolean12 = dateTimeZone0.equals((java.lang.Object) (-3599900L));
        long long14 = dateTimeZone0.previousTransition(52L);
        java.lang.String str16 = dateTimeZone0.getShortName(42L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone0.getName(0L, locale22);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        long long28 = dateTimeZone24.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean29 = dateTimeZone24.isFixed();
        java.util.TimeZone timeZone30 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        int int33 = dateTimeZone31.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone34 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone35);
        long long38 = dateTimeZone35.nextTransition(7200010L);
        long long40 = dateTimeZone35.convertUTCToLocal(36000010L);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        long long45 = dateTimeZone41.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean46 = dateTimeZone41.isFixed();
        java.util.TimeZone timeZone47 = dateTimeZone41.toTimeZone();
        boolean boolean49 = dateTimeZone41.isStandardOffset(0L);
        java.util.TimeZone timeZone50 = dateTimeZone41.toTimeZone();
        long long52 = dateTimeZone41.nextTransition((-1L));
        boolean boolean54 = dateTimeZone41.isStandardOffset((long) 10);
        java.lang.Object obj55 = null;
        boolean boolean56 = dateTimeZone41.equals(obj55);
        java.lang.Object obj57 = dateTimeZone41.writeReplace();
        java.lang.String str59 = dateTimeZone41.getName((-1L));
        long long61 = dateTimeZone35.getMillisKeepLocal(dateTimeZone41, (long) 100);
        boolean boolean62 = dateTimeZone0.equals((java.lang.Object) long61);
        long long66 = dateTimeZone0.convertLocalToUTC((long) 100, false, (-352799989L));
        boolean boolean68 = dateTimeZone0.isStandardOffset((-3599900L));
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 7200010L + "'", long38 == 7200010L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 36000010L + "'", long40 == 36000010L);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+00:00" + "'", str59, "+00:00");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 100L + "'", long61 == 100L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 100L + "'", long66 == 100L);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        long long10 = dateTimeZone0.previousTransition((long) 100);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getShortName(35L, locale12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean19 = dateTimeZone14.isFixed();
        java.util.TimeZone timeZone20 = dateTimeZone14.toTimeZone();
        int int22 = dateTimeZone14.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        java.lang.Object obj24 = dateTimeZone14.writeReplace();
        boolean boolean26 = dateTimeZone14.isStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        long long31 = dateTimeZone27.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean32 = dateTimeZone27.isFixed();
        java.util.TimeZone timeZone33 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        int int36 = dateTimeZone34.getOffsetFromLocal((long) (short) 0);
        java.lang.String str38 = dateTimeZone34.getShortName((long) (byte) 10);
        long long40 = dateTimeZone14.getMillisKeepLocal(dateTimeZone34, 0L);
        org.joda.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = dateTimeZone34.isLocalDateTimeGap(localDateTime41);
        java.lang.String str43 = dateTimeZone34.getID();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj45 = dateTimeZone44.writeReplace();
        boolean boolean46 = dateTimeZone34.equals((java.lang.Object) dateTimeZone44);
        long long48 = dateTimeZone0.getMillisKeepLocal(dateTimeZone44, (-32459948L));
        java.lang.String str50 = dateTimeZone0.getNameKey(154320000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTC" + "'", str43, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-32459948L) + "'", long48 == (-32459948L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "UTC" + "'", str50, "UTC");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        boolean boolean8 = dateTimeZone0.isStandardOffset(0L);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long13 = dateTimeZone11.convertUTCToLocal(360000000L);
        java.lang.String str15 = dateTimeZone11.getNameKey(32460000L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone11.getName(79140010L, locale17);
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 360000000L + "'", long13 == 360000000L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        java.lang.Class<?> wildcardClass18 = timeZone15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        boolean boolean8 = dateTimeZone0.isStandardOffset(0L);
        long long10 = dateTimeZone0.convertUTCToLocal((long) ' ');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getShortName((-39599999L), locale12);
        int int15 = dateTimeZone0.getStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean3 = dateTimeZone0.equals((java.lang.Object) 10L);
        java.lang.String str5 = dateTimeZone0.getName(100L);
        java.lang.Class<?> wildcardClass6 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        java.lang.String str19 = dateTimeZone0.getNameKey((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) (byte) 1);
        long long24 = dateTimeZone0.getMillisKeepLocal(dateTimeZone22, (-3599999L));
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone0.getShortName((long) 600000, locale26);
        java.lang.Object obj28 = dateTimeZone0.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-363659999L) + "'", long24 == (-363659999L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        int int30 = dateTimeZone20.getOffset((long) (short) 1);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone20.getName(111600000L, locale32);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone20.getShortName((-118800001L), locale35);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        long long22 = dateTimeZone0.convertUTCToLocal(32999935L);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32999935L + "'", long22 == 32999935L);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        boolean boolean9 = dateTimeZone8.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffsetFromLocal((long) (short) 0);
        int int11 = dateTimeZone7.getOffsetFromLocal((long) (short) 10);
        java.lang.Object obj12 = dateTimeZone7.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        long long23 = dateTimeZone19.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean24 = dateTimeZone19.isFixed();
        java.lang.String str26 = dateTimeZone19.getShortName((-1L));
        java.util.TimeZone timeZone27 = dateTimeZone19.toTimeZone();
        long long29 = dateTimeZone19.nextTransition((-3600000L));
        int int31 = dateTimeZone19.getOffset((long) (byte) 1);
        java.lang.Class<?> wildcardClass32 = dateTimeZone19.getClass();
        boolean boolean33 = dateTimeZone0.equals((java.lang.Object) wildcardClass32);
        boolean boolean35 = dateTimeZone0.isStandardOffset((-32459948L));
        java.lang.String str37 = dateTimeZone0.getName(3600011L);
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
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-3600000L) + "'", long29 == (-3600000L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((long) (short) -1, locale7);
        long long11 = dateTimeZone0.convertLocalToUTC((long) (byte) 10, false);
        long long13 = dateTimeZone0.convertUTCToLocal(32L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 10);
        java.lang.String str18 = dateTimeZone16.getShortName((-1L));
        long long20 = dateTimeZone0.getMillisKeepLocal(dateTimeZone16, 1L);
        java.lang.String str22 = dateTimeZone0.getNameKey((long) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:10" + "'", str18, "+10:10");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-36599999L) + "'", long20 == (-36599999L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.String str5 = dateTimeZone1.getShortName(97L);
        int int7 = dateTimeZone1.getOffset((long) (short) 100);
        boolean boolean8 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        long long14 = dateTimeZone1.convertLocalToUTC(230400000L, true, (long) (-3600000));
        long long16 = dateTimeZone1.convertUTCToLocal((-118319968L));
        java.util.TimeZone timeZone17 = dateTimeZone1.toTimeZone();
        boolean boolean19 = dateTimeZone1.isStandardOffset(42L);
        java.lang.Class<?> wildcardClass20 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3600000L) + "'", long3 == (-3600000L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3600000) + "'", int7 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-3600000) + "'", int10 == (-3600000));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 234000000L + "'", long14 == 234000000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-121919968L) + "'", long16 == (-121919968L));
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffset(1L);
        long long11 = dateTimeZone7.previousTransition((long) (byte) 1);
        long long13 = dateTimeZone7.convertUTCToLocal((long) 1);
        java.lang.String str14 = dateTimeZone7.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        int int3 = dateTimeZone1.getOffsetFromLocal(36060000L);
        java.lang.Object obj4 = dateTimeZone1.writeReplace();
        long long8 = dateTimeZone1.convertLocalToUTC((-219600000L), true, 100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600000 + "'", int3 == 3600000);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-223200000L) + "'", long8 == (-223200000L));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        long long10 = dateTimeZone0.previousTransition((long) 100);
        java.lang.String str12 = dateTimeZone0.getNameKey((-1L));
        java.lang.String str13 = dateTimeZone0.getID();
        java.lang.Class<?> wildcardClass14 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        java.lang.String str30 = dateTimeZone20.getName((-3599999L));
        long long32 = dateTimeZone20.previousTransition((-187200000L));
        long long36 = dateTimeZone20.convertLocalToUTC(234000000L, true, 184200001L);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        long long41 = dateTimeZone37.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        java.util.Locale locale43 = null;
        java.lang.String str44 = dateTimeZone37.getName(100L, locale43);
        long long46 = dateTimeZone37.previousTransition((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        long long51 = dateTimeZone47.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean52 = dateTimeZone47.isFixed();
        java.lang.String str54 = dateTimeZone47.getShortName((-1L));
        java.util.TimeZone timeZone55 = dateTimeZone47.toTimeZone();
        java.util.Locale locale57 = null;
        java.lang.String str58 = dateTimeZone47.getShortName(0L, locale57);
        boolean boolean59 = dateTimeZone37.equals((java.lang.Object) str58);
        long long61 = dateTimeZone37.nextTransition(100L);
        org.joda.time.ReadableInstant readableInstant62 = null;
        int int63 = dateTimeZone37.getOffset(readableInstant62);
        long long65 = dateTimeZone37.previousTransition(148200000L);
        long long67 = dateTimeZone20.getMillisKeepLocal(dateTimeZone37, (long) 600000);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-187200000L) + "'", long32 == (-187200000L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 234000000L + "'", long36 == 234000000L);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00" + "'", str44, "+00:00");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00" + "'", str54, "+00:00");
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+00:00" + "'", str58, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 100L + "'", long61 == 100L);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 148200000L + "'", long65 == 148200000L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 600000L + "'", long67 == 600000L);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((long) 100);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getNameKey((long) 10);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:00" + "'", str5, "+01:00");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone2.getShortName((long) (short) -1, locale5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone7.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean12 = dateTimeZone7.isFixed();
        java.util.TimeZone timeZone13 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.String str15 = dateTimeZone14.toString();
        long long17 = dateTimeZone2.getMillisKeepLocal(dateTimeZone14, (long) 100);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone2.getOffset(readableInstant18);
        long long23 = dateTimeZone2.convertLocalToUTC(0L, true, 230400000L);
        long long26 = dateTimeZone2.convertLocalToUTC((long) (byte) 0, false);
        long long28 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, 3600010L);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone0.getShortName((-3599890L), locale30);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3600010L + "'", long28 == 3600010L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        boolean boolean9 = dateTimeZone8.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        long long17 = dateTimeZone7.nextTransition((-3599999L));
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        long long22 = dateTimeZone18.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean23 = dateTimeZone18.isFixed();
        java.util.TimeZone timeZone24 = dateTimeZone18.toTimeZone();
        int int26 = dateTimeZone18.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        boolean boolean29 = dateTimeZone18.isStandardOffset((long) (-1));
        java.lang.String str30 = dateTimeZone18.toString();
        java.util.TimeZone timeZone31 = dateTimeZone18.toTimeZone();
        boolean boolean33 = dateTimeZone18.isStandardOffset((-3599900L));
        boolean boolean34 = dateTimeZone7.equals((java.lang.Object) boolean33);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3599999L) + "'", long17 == (-3599999L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:00");
        int int3 = dateTimeZone1.getStandardOffset(3599935L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3600000) + "'", int3 == (-3600000));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long11 = dateTimeZone0.convertLocalToUTC(3600010L, false);
        java.util.TimeZone timeZone12 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str15 = dateTimeZone13.getShortName((long) 36060000);
        java.lang.String str16 = dateTimeZone13.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600010L + "'", long11 == 3600010L);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffsetFromLocal((long) (short) 0);
        java.lang.String str11 = dateTimeZone7.getShortName((long) 0);
        java.lang.Class<?> wildcardClass12 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', 600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36600000, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        java.lang.String str14 = dateTimeZone0.getShortName((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        long long19 = dateTimeZone15.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean20 = dateTimeZone15.isFixed();
        java.util.TimeZone timeZone21 = dateTimeZone15.toTimeZone();
        int int23 = dateTimeZone15.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone15.isLocalDateTimeGap(localDateTime25);
        long long28 = dateTimeZone0.getMillisKeepLocal(dateTimeZone15, (long) (-1));
        boolean boolean29 = dateTimeZone0.isFixed();
        java.lang.String str31 = dateTimeZone0.getNameKey((long) 187200000);
        java.lang.String str33 = dateTimeZone0.getShortName(35519999L);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone0.getName((long) 10, locale35);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.getShortName((-1L));
        int int9 = dateTimeZone0.getOffsetFromLocal(0L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone0.isLocalDateTimeGap(localDateTime10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long16 = dateTimeZone12.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean17 = dateTimeZone12.isFixed();
        java.lang.String str19 = dateTimeZone12.getShortName((-1L));
        java.util.TimeZone timeZone20 = dateTimeZone12.toTimeZone();
        long long22 = dateTimeZone12.previousTransition((long) 100);
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone12.getOffset(readableInstant23);
        int int26 = dateTimeZone12.getStandardOffset((long) 100);
        long long28 = dateTimeZone0.getMillisKeepLocal(dateTimeZone12, (-118800001L));
        long long32 = dateTimeZone12.convertLocalToUTC(3600011L, false, (long) (-3600000));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-118800001L) + "'", long28 == (-118800001L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 3600011L + "'", long32 == 3600011L);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-00:00:00.001");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (short) 100, locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        long long17 = dateTimeZone7.nextTransition((-3599999L));
        int int19 = dateTimeZone7.getOffsetFromLocal(3600035L);
        java.lang.Object obj20 = dateTimeZone7.writeReplace();
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3599999L) + "'", long17 == (-3599999L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        int int7 = dateTimeZone0.getStandardOffset(0L);
        java.lang.Object obj8 = dateTimeZone0.writeReplace();
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Class<?> wildcardClass11 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.010");
        long long3 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.String str4 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.010" + "'", str4, "+00:00:00.010");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (short) 100);
        java.lang.String str8 = dateTimeZone0.toString();
        int int10 = dateTimeZone0.getOffset((long) (short) 1);
        int int12 = dateTimeZone0.getOffsetFromLocal(79140000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2100000, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        long long29 = dateTimeZone21.previousTransition((-3599948L));
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-3599948L) + "'", long29 == (-3599948L));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getOffsetFromLocal((long) (short) 0);
        java.lang.String str11 = dateTimeZone7.getShortName((long) (byte) 10);
        java.lang.String str12 = dateTimeZone7.getID();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long17 = dateTimeZone13.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        boolean boolean20 = dateTimeZone13.isStandardOffset((long) (byte) 1);
        long long23 = dateTimeZone13.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone13.isLocalDateTimeGap(localDateTime24);
        boolean boolean26 = dateTimeZone7.equals((java.lang.Object) dateTimeZone13);
        long long30 = dateTimeZone7.convertLocalToUTC(3600000L, false, (-3599999L));
        boolean boolean31 = dateTimeZone7.isFixed();
        int int33 = dateTimeZone7.getOffset(187800000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3600000L + "'", long30 == 3600000L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) 1);
        int int9 = dateTimeZone1.getStandardOffset(0L);
        long long11 = dateTimeZone1.previousTransition((-187200000L));
        java.lang.String str13 = dateTimeZone1.getShortName(35519999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600000L) + "'", long4 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3600000 + "'", int9 == 3600000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-187200000L) + "'", long11 == (-187200000L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:00" + "'", str13, "+01:00");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        java.lang.String str29 = dateTimeZone21.getShortName((long) '#');
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+01:00" + "'", str29, "+01:00");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (-1));
        long long13 = dateTimeZone0.previousTransition((long) (short) 10);
        boolean boolean15 = dateTimeZone0.isStandardOffset(115200000L);
        long long17 = dateTimeZone0.previousTransition(4200000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 4200000L + "'", long17 == 4200000L);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone10 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        boolean boolean13 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone11.getName(112140000L, locale16);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long20 = dateTimeZone18.previousTransition((long) 100);
        java.lang.String str21 = dateTimeZone18.getID();
        long long23 = dateTimeZone18.convertUTCToLocal(10L);
        long long25 = dateTimeZone18.nextTransition((long) (-3600000));
        boolean boolean26 = dateTimeZone18.isFixed();
        java.lang.String str28 = dateTimeZone18.getNameKey((long) 1);
        boolean boolean29 = dateTimeZone18.isFixed();
        boolean boolean30 = dateTimeZone16.equals((java.lang.Object) boolean29);
        int int32 = dateTimeZone16.getOffset(36000001L);
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
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+01:00" + "'", str21, "+01:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3600010L + "'", long23 == 3600010L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-3600000L) + "'", long25 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        int int7 = dateTimeZone0.getStandardOffset(0L);
        java.lang.Object obj8 = dateTimeZone0.writeReplace();
        int int10 = dateTimeZone0.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((long) (short) -1, locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) (-1));
        int int12 = dateTimeZone0.getStandardOffset(32L);
        long long15 = dateTimeZone0.convertLocalToUTC(7200010L, false);
        long long17 = dateTimeZone0.previousTransition((long) 36600000);
        int int19 = dateTimeZone0.getOffset(226800000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 7200010L + "'", long15 == 7200010L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 36600000L + "'", long17 == 36600000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        long long24 = dateTimeZone0.nextTransition(100L);
        long long28 = dateTimeZone0.convertLocalToUTC(32999935L, true, (-43260000L));
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32999935L + "'", long28 == 32999935L);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        java.lang.String str14 = dateTimeZone0.getShortName((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        long long19 = dateTimeZone15.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean20 = dateTimeZone15.isFixed();
        java.util.TimeZone timeZone21 = dateTimeZone15.toTimeZone();
        int int23 = dateTimeZone15.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone15.isLocalDateTimeGap(localDateTime25);
        long long28 = dateTimeZone0.getMillisKeepLocal(dateTimeZone15, (long) (-1));
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone0.getOffset(readableInstant29);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) 1);
        long long4 = dateTimeZone2.nextTransition((-39660000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-39660000L) + "'", long4 == (-39660000L));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone2.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone2.getName(100L, locale8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone2.getOffset(readableInstant10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, (long) 100);
        java.lang.String str16 = dateTimeZone2.getName((long) '4');
        java.lang.String str17 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 10);
        java.lang.String str3 = dateTimeZone2.getID();
        int int5 = dateTimeZone2.getOffsetFromLocal((-259260000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:10" + "'", str3, "+00:10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 600000 + "'", int5 == 600000);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        int int9 = dateTimeZone1.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean12 = dateTimeZone1.isStandardOffset((long) (-1));
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) ' ');
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        java.lang.String str18 = dateTimeZone1.getName(187200097L);
        boolean boolean19 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone0.isLocalDateTimeGap(localDateTime10);
        int int13 = dateTimeZone0.getStandardOffset((long) (byte) 10);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone0.getShortName(72600010L, locale15);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        java.util.TimeZone timeZone23 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.lang.String str26 = dateTimeZone24.getName((-352800041L));
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
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+01:00" + "'", str26, "+01:00");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = dateTimeZone0.getOffset(readableInstant28);
        int int31 = dateTimeZone0.getOffsetFromLocal(3600000L);
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = dateTimeZone0.getOffset(readableInstant32);
        int int35 = dateTimeZone0.getOffsetFromLocal((long) 100);
        java.lang.Class<?> wildcardClass36 = dateTimeZone0.getClass();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        int int22 = dateTimeZone0.getStandardOffset((long) 'a');
        java.lang.String str24 = dateTimeZone0.getNameKey(36000010L);
        int int26 = dateTimeZone0.getStandardOffset(161520000L);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, false);
        int int6 = dateTimeZone1.getOffsetFromLocal(3600000L);
        java.lang.Object obj7 = null;
        boolean boolean8 = dateTimeZone1.equals(obj7);
        java.lang.String str10 = dateTimeZone1.getShortName(43799903L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3600000) + "'", int6 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-01:00" + "'", str10, "-01:00");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) 0, false, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((long) (short) -1, locale7);
        long long11 = dateTimeZone0.convertLocalToUTC((long) (byte) 10, false);
        int int13 = dateTimeZone0.getOffsetFromLocal(3599999L);
        long long15 = dateTimeZone0.nextTransition((long) (byte) -1);
        java.lang.String str17 = dateTimeZone0.getShortName((long) (short) 1);
        long long19 = dateTimeZone0.previousTransition(7199935L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 7199935L + "'", long19 == 7199935L);
    }
}

