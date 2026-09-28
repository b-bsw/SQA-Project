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
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ICT" + "'", str5, "ICT");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((long) 10, locale4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str4 = dateTimeZone2.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider5 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider5);
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) nameProvider5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology8 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ICT" + "'", str4, "ICT");
        org.junit.Assert.assertNotNull(nameProvider5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        java.lang.String str7 = dateTimeZone0.toString();
        java.lang.Class<?> wildcardClass8 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = org.joda.time.field.LenientDateTimeField.getInstance(dateTimeField0, chronology1);
        org.junit.Assert.assertNull(dateTimeField2);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology9 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone1.getID();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-25200001L), locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology11 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology2 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology5 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass10 = timeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "1) test0016(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "1) test0016(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "1) test0016(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str6 = dateTimeZone4.getNameKey(10L);
        long long8 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (long) 1);
        java.lang.Object obj9 = dateTimeZone4.writeReplace();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology10 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky "2) test0017(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) "");
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName(10L, locale4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone0.isLocalDateTimeGap(localDateTime6);
        java.lang.String str8 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
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
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(1L, locale3);
        java.lang.Class<?> wildcardClass5 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "3) test0021(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "2) test0021(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
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
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone0.getShortName((long) (-1), locale17);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
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
        java.lang.Class<?> wildcardClass14 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "4) test0025(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "3) test0025(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str4 = dateTimeZone2.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider5 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider5);
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) nameProvider5);
        long long10 = dateTimeZone2.convertLocalToUTC((-1L), true);
        java.lang.String str11 = dateTimeZone2.getID();
        java.lang.String str12 = dateTimeZone2.getID();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky "5) test0026(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(nameProvider5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "4) test0026(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
// flaky "2) test0026(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
// flaky "1) test0026(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
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
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((long) (byte) -1, locale10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology14 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
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
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.nextTransition((long) 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3600000L + "'", long12 == 3600000L);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        java.lang.Class<?> wildcardClass7 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str4 = dateTimeZone2.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider5 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider5);
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) nameProvider5);
        long long10 = dateTimeZone2.convertLocalToUTC((-1L), true);
        java.lang.String str12 = dateTimeZone2.getNameKey((-25200001L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
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
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) 'a', locale7);
        java.lang.Class<?> wildcardClass9 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone2.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone2.isLocalDateTimeGap(localDateTime5);
        java.util.TimeZone timeZone7 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology9 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 25199999L + "'", long4 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone5.previousTransition((long) ' ');
        java.lang.String str8 = dateTimeZone5.getID();
        java.lang.Object obj9 = dateTimeZone5.writeReplace();
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.lang.String str12 = dateTimeZone5.getName(97L);
        int int14 = dateTimeZone5.getStandardOffset((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology15 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.lang.String str6 = dateTimeZone2.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        long long10 = dateTimeZone7.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone11.previousTransition((long) ' ');
        java.lang.String str14 = dateTimeZone11.getID();
        java.lang.Object obj15 = dateTimeZone11.writeReplace();
        boolean boolean16 = dateTimeZone7.equals((java.lang.Object) dateTimeZone11);
        boolean boolean17 = dateTimeZone2.equals((java.lang.Object) dateTimeZone11);
        long long19 = dateTimeZone2.convertUTCToLocal(25200010L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology20 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25200010L + "'", long19 == 25200010L);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 10, false);
        boolean boolean10 = dateTimeZone0.equals((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass11 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
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
        boolean boolean18 = dateTimeZone1.isStandardOffset((-1L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        int int11 = dateTimeZone1.getOffset(25200010L);
        boolean boolean13 = dateTimeZone1.isStandardOffset((long) (byte) 1);
        java.lang.Class<?> wildcardClass14 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "6) test0040(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
// flaky "5) test0040(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:10" + "'", str9, "+00:10");
// flaky "3) test0040(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 600000 + "'", int11 == 600000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone4.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone4.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone9.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone13.previousTransition((long) ' ');
        java.lang.String str16 = dateTimeZone13.getID();
        java.lang.Object obj17 = dateTimeZone13.writeReplace();
        boolean boolean18 = dateTimeZone9.equals((java.lang.Object) dateTimeZone13);
        boolean boolean19 = dateTimeZone4.equals((java.lang.Object) dateTimeZone13);
        long long21 = dateTimeZone4.convertUTCToLocal(25200010L);
        long long23 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology24 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 25200010L + "'", long21 == 25200010L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.Object obj4 = dateTimeZone0.writeReplace();
        int int6 = dateTimeZone0.getStandardOffset((long) 1);
        java.lang.Class<?> wildcardClass7 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        long long6 = dateTimeZone3.previousTransition((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology7 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(1L);
        java.lang.Class<?> wildcardClass7 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) 'a', locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology10 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
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
        java.lang.Class<?> wildcardClass22 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:10" + "'", str9, "+00:10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:10" + "'", str12, "+00:10");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 24600010L + "'", long15 == 24600010L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 600000 + "'", int17 == 600000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 600000 + "'", int19 == 600000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 600000 + "'", int21 == 600000);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        boolean boolean8 = dateTimeZone0.equals((java.lang.Object) 'a');
        long long10 = dateTimeZone0.convertUTCToLocal((long) '4');
        java.lang.String str11 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
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
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        int int6 = dateTimeZone2.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone7 = dateTimeZone2.toTimeZone();
        long long9 = dateTimeZone2.nextTransition((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology10 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky "7) test0050(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "6) test0050(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky "4) test0050(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
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
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long7 = dateTimeZone0.previousTransition((long) (short) -1);
        java.lang.String str8 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.nextTransition(25199999L);
        java.lang.Class<?> wildcardClass13 = dateTimeZone10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 25199999L + "'", long12 == 25199999L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(362100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("ICT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'ICT' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology2 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 362100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 362100000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone5.previousTransition((long) ' ');
        java.lang.String str8 = dateTimeZone5.getID();
        java.lang.Object obj9 = dateTimeZone5.writeReplace();
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName(100L, locale12);
        int int15 = dateTimeZone1.getOffsetFromLocal(32L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology16 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone1.getID();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology8 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str4 = dateTimeZone2.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider5 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider5);
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) nameProvider5);
        long long10 = dateTimeZone2.convertLocalToUTC((-1L), true);
        int int12 = dateTimeZone2.getOffset((long) (short) 100);
        int int14 = dateTimeZone2.getOffsetFromLocal(600035L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology15 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(nameProvider5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.nextTransition((long) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology10 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 3600000");
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
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.Class<?> wildcardClass4 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str4 = dateTimeZone2.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider5 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider5);
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) nameProvider5);
        long long10 = dateTimeZone2.convertLocalToUTC((-1L), true);
        java.lang.String str11 = dateTimeZone2.getID();
        boolean boolean13 = dateTimeZone2.isStandardOffset((long) 1);
        java.lang.String str15 = dateTimeZone2.getShortName(52L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology16 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(nameProvider5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) "");
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName(10L, locale4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone0.isLocalDateTimeGap(localDateTime6);
        long long10 = dateTimeZone0.convertLocalToUTC((long) (-3600000), false);
        java.lang.Object obj11 = dateTimeZone0.writeReplace();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3600000L) + "'", long10 == (-3600000L));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+100:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+100:00\" is malformed at \"0:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        java.lang.String str11 = dateTimeZone4.getName(25200035L);
        long long13 = dateTimeZone4.nextTransition(25200035L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 25200035L + "'", long13 == 25200035L);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone4.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone4.getShortName(24600010L, locale8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        java.lang.Class<?> wildcardClass1 = provider0.getClass();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        java.lang.String str4 = dateTimeZone0.getID();
        java.lang.Class<?> wildcardClass5 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        java.lang.String str7 = dateTimeZone0.toString();
        long long9 = dateTimeZone0.convertUTCToLocal(25200035L);
        java.lang.Class<?> wildcardClass10 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 25200035L + "'", long9 == 25200035L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) 'a', locale8);
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) 25200000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(52L, locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+35:00" + "'", str4, "+35:00");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long7 = dateTimeZone0.previousTransition((long) (short) -1);
        int int9 = dateTimeZone0.getStandardOffset((long) 0);
        java.lang.Class<?> wildcardClass10 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 100, true);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) 1, locale10);
        int int13 = dateTimeZone0.getStandardOffset(10L);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone0.isLocalDateTimeGap(localDateTime14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.lang.String str21 = dateTimeZone19.getNameKey(10L);
        long long23 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 1);
        java.util.TimeZone timeZone24 = dateTimeZone17.toTimeZone();
        java.util.TimeZone timeZone25 = dateTimeZone17.toTimeZone();
        java.lang.String str27 = dateTimeZone17.getName((long) 0);
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = dateTimeZone17.getOffset(readableInstant28);
        boolean boolean30 = dateTimeZone0.equals((java.lang.Object) readableInstant28);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str6 = dateTimeZone4.getNameKey(10L);
        long long8 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (long) 1);
        long long10 = dateTimeZone2.convertUTCToLocal(10L);
        long long12 = dateTimeZone2.previousTransition(115260100L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115260100L + "'", long12 == 115260100L);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone4.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone4.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone9.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone13.previousTransition((long) ' ');
        java.lang.String str16 = dateTimeZone13.getID();
        java.lang.Object obj17 = dateTimeZone13.writeReplace();
        boolean boolean18 = dateTimeZone9.equals((java.lang.Object) dateTimeZone13);
        boolean boolean19 = dateTimeZone4.equals((java.lang.Object) dateTimeZone13);
        long long21 = dateTimeZone4.convertUTCToLocal(25200010L);
        long long23 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (long) (-1));
        java.lang.String str25 = dateTimeZone2.getNameKey((-25200001L));
        int int27 = dateTimeZone2.getOffsetFromLocal(25199999L);
        int int29 = dateTimeZone2.getOffset(387300010L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology30 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 25200010L + "'", long21 == 25200010L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        java.lang.Class<?> wildcardClass25 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        java.lang.String str10 = dateTimeZone1.getID();
        boolean boolean11 = dateTimeZone1.isFixed();
        java.lang.String str12 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        java.lang.Class<?> wildcardClass10 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+07:00");
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.lang.Class<?> wildcardClass2 = provider0.getClass();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone1.getID();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-25200001L), locale9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str13 = dateTimeZone1.getName(0L);
        int int15 = dateTimeZone1.getStandardOffset(35L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology16 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str6 = dateTimeZone4.getNameKey(10L);
        long long8 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (long) 1);
        long long10 = dateTimeZone2.nextTransition(10L);
        java.lang.String str12 = dateTimeZone2.getNameKey(3L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str3 = dateTimeZone1.getShortName(25199999L);
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        boolean boolean5 = dateTimeZone0.isStandardOffset((long) (byte) 1);
        java.lang.Class<?> wildcardClass6 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long5 = dateTimeZone3.nextTransition((long) '4');
        java.lang.String str6 = dateTimeZone3.toString();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone3.getName((long) (byte) 0, locale8);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str13 = dateTimeZone11.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider14 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider14);
        boolean boolean16 = dateTimeZone11.equals((java.lang.Object) nameProvider14);
        long long19 = dateTimeZone11.convertLocalToUTC((-1L), true);
        java.lang.String str20 = dateTimeZone11.getID();
        boolean boolean22 = dateTimeZone11.isStandardOffset((long) 1);
        boolean boolean23 = dateTimeZone3.equals((java.lang.Object) boolean22);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        long long26 = dateTimeZone24.previousTransition((long) ' ');
        java.lang.String str27 = dateTimeZone24.getID();
        java.lang.String str29 = dateTimeZone24.getShortName((long) (short) 0);
        long long31 = dateTimeZone24.previousTransition((long) (short) -1);
        int int33 = dateTimeZone24.getStandardOffset((long) 0);
        long long35 = dateTimeZone24.convertUTCToLocal((long) ' ');
        java.lang.String str37 = dateTimeZone24.getName((long) 600000);
        long long39 = dateTimeZone3.getMillisKeepLocal(dateTimeZone24, 3L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology40 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+01:00" + "'", str6, "+01:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+01:00" + "'", str9, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(nameProvider14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 3600003L + "'", long39 == 3600003L);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        java.lang.String str4 = dateTimeZone0.getID();
        long long6 = dateTimeZone0.previousTransition(25200000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25200000L + "'", long6 == 25200000L);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.String str3 = dateTimeZone1.getShortName((long) (byte) 100);
        java.lang.String str4 = dateTimeZone1.toString();
        long long6 = dateTimeZone1.convertUTCToLocal(25200035L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25200036L + "'", long6 == 25200036L);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
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
        java.lang.String str20 = dateTimeZone10.getName(25200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "8) test0095(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3600000) + "'", int3 == (-3600000));
// flaky "7) test0095(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "5) test0095(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        boolean boolean3 = dateTimeZone1.isStandardOffset((-35L));
        long long5 = dateTimeZone1.previousTransition(35L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) "");
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName(10L, locale4);
        long long7 = dateTimeZone0.previousTransition((long) (-1));
        java.lang.String str9 = dateTimeZone0.getNameKey(3599999L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass5 = timeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long5 = dateTimeZone2.previousTransition((long) (byte) 100);
        java.lang.String str7 = dateTimeZone2.getShortName((-1L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:10" + "'", str7, "+00:10");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        int int6 = dateTimeZone2.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone7 = dateTimeZone2.toTimeZone();
        long long9 = dateTimeZone2.nextTransition((long) '4');
        long long12 = dateTimeZone2.convertLocalToUTC(3540000L, false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky "9) test0101(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "8) test0101(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky "6) test0101(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
// flaky "2) test0101(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3540000L + "'", long12 == 3540000L);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str6 = dateTimeZone4.getNameKey(10L);
        long long8 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (long) 1);
        long long10 = dateTimeZone2.nextTransition(10L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone11.previousTransition((long) ' ');
        java.lang.String str14 = dateTimeZone11.getID();
        java.lang.String str16 = dateTimeZone11.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone11.getOffset(readableInstant17);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone11.getName((long) (byte) -1, locale20);
        int int23 = dateTimeZone11.getOffsetFromLocal((long) (byte) 100);
        long long26 = dateTimeZone11.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str28 = dateTimeZone11.getName(600035L);
        boolean boolean29 = dateTimeZone2.equals((java.lang.Object) str28);
        int int31 = dateTimeZone2.getOffsetFromLocal(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology32 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky "10) test0102(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky "9) test0102(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str6 = dateTimeZone0.getID();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName((-25200001L), locale8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getName(28800010L, locale11);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.lang.Class<?> wildcardClass7 = provider0.getClass();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        java.lang.Class<?> wildcardClass25 = dateTimeZone0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
        java.lang.String str14 = dateTimeZone1.getName(0L);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(100);
        long long4 = dateTimeZone2.previousTransition((long) (byte) 100);
        java.lang.String str6 = dateTimeZone2.getShortName(1L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology7 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+100:00" + "'", str6, "+100:00");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str4 = dateTimeZone2.getNameKey(10L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone5.previousTransition((long) ' ');
        java.lang.String str8 = dateTimeZone5.getID();
        java.lang.String str10 = dateTimeZone5.getShortName((long) (short) 0);
        long long13 = dateTimeZone5.convertLocalToUTC((long) (byte) 100, true);
        java.lang.Object obj14 = dateTimeZone5.writeReplace();
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long19 = dateTimeZone2.getMillisKeepLocal(dateTimeZone17, 0L);
        java.util.TimeZone timeZone20 = dateTimeZone2.toTimeZone();
        java.lang.String str22 = dateTimeZone2.getShortName((long) (-3600000));
        int int24 = dateTimeZone2.getOffsetFromLocal(25199999L);
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
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-35L) + "'", long19 == (-35L));
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        java.lang.Class<?> wildcardClass31 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 362100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 362100000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition(25199999L);
        int int5 = dateTimeZone1.getStandardOffset(1L);
        java.lang.String str7 = dateTimeZone1.getName(0L);
        long long10 = dateTimeZone1.convertLocalToUTC(1L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25199999L + "'", long3 == 25199999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone1.getID();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-25200001L), locale9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str13 = dateTimeZone1.getName(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology14 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        java.lang.Class<?> wildcardClass22 = dateTimeZone0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str6 = dateTimeZone4.getNameKey(10L);
        long long8 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (long) 1);
        java.lang.String str10 = dateTimeZone2.getName((long) 0);
        int int12 = dateTimeZone2.getOffset(25200010L);
        java.lang.String str14 = dateTimeZone2.getShortName((-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology15 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(362100000, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        long long5 = dateTimeZone1.previousTransition((long) (byte) -1);
        java.lang.String str6 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.nextTransition(3600000L);
        int int7 = dateTimeZone1.getStandardOffset(24600010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600000L + "'", long5 == 3600000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        java.lang.String str4 = dateTimeZone1.getID();
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName(32L, locale6);
        java.lang.String str9 = dateTimeZone1.getNameKey(362100000L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology10 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        int int3 = dateTimeZone1.getStandardOffset(0L);
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName((-2L), locale6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str6 = dateTimeZone0.getID();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName((-25200001L), locale8);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) 'a', locale7);
        int int10 = dateTimeZone0.getStandardOffset((long) (short) 1);
        java.lang.String str12 = dateTimeZone0.getNameKey((long) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        java.lang.String str4 = dateTimeZone1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology5 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(10);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(3600003L, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) 25200000, locale6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+10:00" + "'", str7, "+10:00");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        java.lang.String str10 = dateTimeZone4.getID();
        java.lang.Object obj11 = dateTimeZone4.writeReplace();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone4.getShortName(25800011L, locale13);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, 362100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 362100000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        int int17 = dateTimeZone0.getStandardOffset(600000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4199965L + "'", long15 == 4199965L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        java.lang.String str4 = dateTimeZone2.getName((long) 25200000);
        long long6 = dateTimeZone2.previousTransition((long) '4');
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long7 = dateTimeZone0.previousTransition((long) (short) -1);
        int int9 = dateTimeZone0.getStandardOffset((long) 0);
        long long11 = dateTimeZone0.convertUTCToLocal((long) ' ');
        java.lang.Class<?> wildcardClass12 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone5.previousTransition((long) ' ');
        java.lang.String str8 = dateTimeZone5.getID();
        java.lang.Object obj9 = dateTimeZone5.writeReplace();
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName(100L, locale12);
        long long16 = dateTimeZone1.convertLocalToUTC((long) (short) 10, false);
        java.util.TimeZone timeZone17 = dateTimeZone1.toTimeZone();
        long long19 = dateTimeZone1.nextTransition(100L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology20 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        long long9 = dateTimeZone3.convertUTCToLocal((long) (-1));
        long long11 = dateTimeZone3.nextTransition((long) (byte) 10);
        int int13 = dateTimeZone3.getOffset((long) (short) 0);
        java.lang.Class<?> wildcardClass14 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        int int6 = dateTimeZone2.getOffsetFromLocal(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology7 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str6 = dateTimeZone4.getNameKey(10L);
        long long8 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (long) 1);
        java.lang.String str10 = dateTimeZone2.getName((long) 0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getName(25200035L, locale12);
        long long16 = dateTimeZone2.convertLocalToUTC(25200010L, true);
        int int18 = dateTimeZone2.getStandardOffset((-1L));
        long long20 = dateTimeZone2.convertUTCToLocal(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200010L + "'", long16 == 25200010L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((long) '4', locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(60000, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.Class<?> wildcardClass12 = timeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        long long45 = dateTimeZone30.nextTransition(3600003L);
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
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 3600003L + "'", long45 == 3600003L);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str6 = dateTimeZone4.getNameKey(10L);
        long long8 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (long) 1);
        long long10 = dateTimeZone2.nextTransition(10L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology11 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        java.lang.String str23 = dateTimeZone1.toString();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        java.lang.String str21 = dateTimeZone1.toString();
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25200010L + "'", long18 == 25200010L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        long long9 = dateTimeZone1.convertUTCToLocal(10L);
        long long11 = dateTimeZone1.previousTransition(115260100L);
        java.lang.String str13 = dateTimeZone1.getNameKey(25200010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115260100L + "'", long11 == 115260100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        boolean boolean28 = dateTimeZone1.isFixed();
        java.lang.Class<?> wildcardClass29 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName((long) (short) 0);
        long long8 = dateTimeZone1.nextTransition((long) (byte) 10);
        long long10 = dateTimeZone1.convertUTCToLocal((long) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        boolean boolean13 = dateTimeZone11.equals((java.lang.Object) "");
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone11.getName(10L, locale15);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long20 = dateTimeZone11.getMillisKeepLocal(dateTimeZone18, (long) (short) 0);
        int int22 = dateTimeZone18.getStandardOffset(100L);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone18, (long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology25 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3600000L + "'", long20 == 3600000L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-3600000) + "'", int22 == (-3600000));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3599999L + "'", long24 == 3599999L);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        int int29 = dateTimeZone16.getStandardOffset((long) 100);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName((long) (short) 0);
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        java.lang.String str8 = dateTimeZone1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology9 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone3.getOffset(readableInstant4);
        long long7 = dateTimeZone3.nextTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        java.lang.String str4 = dateTimeZone0.getID();
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        java.lang.String str7 = dateTimeZone0.getName(599965L);
        long long9 = dateTimeZone0.convertUTCToLocal(362100000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 362100000L + "'", long9 == 362100000L);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        long long9 = dateTimeZone3.convertUTCToLocal((long) (-1));
        long long11 = dateTimeZone3.nextTransition((long) (byte) 10);
        java.util.TimeZone timeZone12 = dateTimeZone3.toTimeZone();
        boolean boolean14 = dateTimeZone3.isStandardOffset((long) 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 100, true);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) 1, locale10);
        int int13 = dateTimeZone0.getStandardOffset(10L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        boolean boolean6 = dateTimeZone0.equals((java.lang.Object) timeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        boolean boolean22 = dateTimeZone1.isFixed();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        java.lang.String str2 = dateTimeZone1.getID();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) ' ', locale4);
        boolean boolean6 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.010" + "'", str2, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.010" + "'", str5, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        int int6 = dateTimeZone2.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone7 = dateTimeZone2.toTimeZone();
        java.lang.Object obj8 = null;
        boolean boolean9 = dateTimeZone2.equals(obj8);
        boolean boolean11 = dateTimeZone2.isStandardOffset((long) 362100000);
        boolean boolean12 = dateTimeZone2.isFixed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Class<?> wildcardClass4 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.lang.String str8 = dateTimeZone1.getName((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone12.previousTransition((long) ' ');
        boolean boolean15 = dateTimeZone12.isFixed();
        long long17 = dateTimeZone11.getMillisKeepLocal(dateTimeZone12, (long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology19 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getStandardOffset((long) 25200000);
        boolean boolean7 = dateTimeZone1.equals((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        long long8 = dateTimeZone1.nextTransition((long) '4');
        long long10 = dateTimeZone1.convertUTCToLocal((long) (short) -1);
        java.lang.String str12 = dateTimeZone1.getNameKey(0L);
        long long15 = dateTimeZone1.convertLocalToUTC((long) 360000000, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 360000000L + "'", long15 == 360000000L);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = dateTimeZone1.getOffset(readableInstant32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology34 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str4 = dateTimeZone2.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider5 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider5);
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) nameProvider5);
        long long10 = dateTimeZone2.convertLocalToUTC((-1L), true);
        java.lang.String str12 = dateTimeZone2.getNameKey((-25200001L));
        int int14 = dateTimeZone2.getOffset((long) (short) 0);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone16.getOffset(readableInstant17);
        int int20 = dateTimeZone16.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone21 = dateTimeZone16.toTimeZone();
        java.lang.Object obj22 = null;
        boolean boolean23 = dateTimeZone16.equals(obj22);
        long long25 = dateTimeZone2.getMillisKeepLocal(dateTimeZone16, 359999967L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology26 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 359999967L + "'", long25 == 359999967L);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName((long) (short) 0);
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        java.lang.String str8 = dateTimeZone1.toString();
        long long10 = dateTimeZone1.convertUTCToLocal(25200035L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology11 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200035L + "'", long10 == 25200035L);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName((long) (byte) -1, locale9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone12 = dateTimeZone0.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Asia/Bangkok");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(32L, locale3);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone6.getOffset(readableInstant7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+07:00" + "'", str4, "+07:00");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25200000 + "'", int8 == 25200000);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        int int20 = dateTimeZone0.getOffsetFromLocal(600000L);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone1.getName((-337499990L), locale24);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        boolean boolean3 = dateTimeZone1.isStandardOffset((-35L));
        java.lang.String str5 = dateTimeZone1.getName((long) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+100:00" + "'", str5, "+100:00");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone2.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone2.isLocalDateTimeGap(localDateTime5);
        java.lang.Object obj7 = dateTimeZone2.writeReplace();
        int int9 = dateTimeZone2.getOffsetFromLocal((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology10 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 25199999L + "'", long4 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+35:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+35:00\" is malformed at \"35:00\"");
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
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        long long9 = dateTimeZone3.convertUTCToLocal((long) (-1));
        long long11 = dateTimeZone3.previousTransition((long) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long7 = dateTimeZone0.nextTransition((long) (byte) 10);
        java.lang.String str9 = dateTimeZone0.getNameKey(387300010L);
        long long11 = dateTimeZone0.previousTransition((long) '#');
        int int13 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone0.isLocalDateTimeGap(localDateTime14);
        boolean boolean16 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        int int7 = dateTimeZone0.getOffset((long) (short) 0);
        boolean boolean8 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone1.getID();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName(115260100L, locale9);
        java.lang.String str11 = dateTimeZone1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        java.lang.String str10 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
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
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        int int6 = dateTimeZone2.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone7 = dateTimeZone2.toTimeZone();
        long long9 = dateTimeZone2.nextTransition((long) '4');
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone2.getShortName((-337499990L), locale11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        java.lang.String str43 = dateTimeZone23.getID();
        int int45 = dateTimeZone23.getOffsetFromLocal(32L);
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTC" + "'", str43, "UTC");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) 'a', locale7);
        long long10 = dateTimeZone0.convertUTCToLocal(10L);
        java.lang.String str12 = dateTimeZone0.getShortName(50400010L);
        int int14 = dateTimeZone0.getStandardOffset(25800012L);
        long long16 = dateTimeZone0.previousTransition((-2L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-2L) + "'", long16 == (-2L));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        int int9 = dateTimeZone3.getOffsetFromLocal(0L);
        long long11 = dateTimeZone3.nextTransition(3540001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3540001L + "'", long11 == 3540001L);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long8 = dateTimeZone6.previousTransition((long) ' ');
        boolean boolean9 = dateTimeZone6.isFixed();
        long long11 = dateTimeZone6.nextTransition((long) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone6.getName((long) 'a', locale13);
        boolean boolean16 = dateTimeZone6.equals((java.lang.Object) 25200000);
        boolean boolean17 = dateTimeZone0.equals((java.lang.Object) 25200000);
        long long20 = dateTimeZone0.convertLocalToUTC((long) 'a', false);
        boolean boolean22 = dateTimeZone0.isStandardOffset(28800010L);
        boolean boolean24 = dateTimeZone0.isStandardOffset(600010L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        java.lang.String str10 = dateTimeZone1.getID();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName((-600000L), locale12);
        java.lang.String str15 = dateTimeZone1.getName((long) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone5.previousTransition((long) ' ');
        java.lang.String str8 = dateTimeZone5.getID();
        java.lang.Object obj9 = dateTimeZone5.writeReplace();
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName(100L, locale12);
        int int15 = dateTimeZone1.getOffsetFromLocal(32L);
        long long17 = dateTimeZone1.convertUTCToLocal((long) (byte) 100);
        long long19 = dateTimeZone1.nextTransition((long) 0);
        java.util.TimeZone timeZone20 = dateTimeZone1.toTimeZone();
        boolean boolean21 = dateTimeZone1.isFixed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology22 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+100:35");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+100:35\" is malformed at \"0:35\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        java.lang.Class<?> wildcardClass10 = nameProvider4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset((long) (short) 10);
        long long6 = dateTimeZone1.convertUTCToLocal(2L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone7.previousTransition((long) ' ');
        boolean boolean10 = dateTimeZone7.isFixed();
        long long12 = dateTimeZone7.nextTransition((long) 1);
        java.lang.String str14 = dateTimeZone7.getName((long) ' ');
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone7.getShortName(25200035L, locale16);
        java.lang.String str18 = dateTimeZone7.toString();
        long long21 = dateTimeZone7.convertLocalToUTC(115260100L, true);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone23.getOffset(readableInstant24);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        long long28 = dateTimeZone26.previousTransition((long) ' ');
        java.lang.String str29 = dateTimeZone26.getID();
        java.lang.String str31 = dateTimeZone26.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = dateTimeZone26.getOffset(readableInstant32);
        long long35 = dateTimeZone23.getMillisKeepLocal(dateTimeZone26, (long) '#');
        long long37 = dateTimeZone7.getMillisKeepLocal(dateTimeZone26, 3600000L);
        long long39 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (-1));
        java.lang.String str41 = dateTimeZone1.getShortName((long) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 115260100L + "'", long21 == 115260100L);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 35L + "'", long35 == 35L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 3600000L + "'", long37 == 3600000L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.001" + "'", str41, "+00:00:00.001");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 10, false);
        java.lang.Object obj9 = dateTimeZone0.writeReplace();
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone0.isLocalDateTimeGap(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((long) '4', locale5);
        long long8 = dateTimeZone0.convertUTCToLocal((long) 25200000);
        java.lang.Object obj9 = dateTimeZone0.writeReplace();
        long long11 = dateTimeZone0.previousTransition(25200035L);
        long long13 = dateTimeZone0.nextTransition(10L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25200000L + "'", long8 == 25200000L);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 25200035L + "'", long11 == 25200035L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 10, locale3);
        java.lang.Class<?> wildcardClass5 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        java.lang.String str27 = dateTimeZone0.getID();
        int int29 = dateTimeZone0.getStandardOffset((-48L));
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName(32L, locale5);
        long long9 = dateTimeZone0.convertLocalToUTC(10L, false);
        java.lang.String str11 = dateTimeZone0.getNameKey(36600000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getShortName(25200035L, locale9);
        boolean boolean12 = dateTimeZone0.isStandardOffset((long) '#');
        java.lang.String str14 = dateTimeZone0.getShortName((-25200001L));
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone0.getOffset(readableInstant15);
        java.lang.Class<?> wildcardClass17 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Asia/Bangkok");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(32L, locale3);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.lang.String str8 = dateTimeZone6.getNameKey((-2L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+07:00" + "'", str4, "+07:00");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ICT" + "'", str8, "ICT");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        java.lang.String str4 = dateTimeZone0.getID();
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        java.lang.Class<?> wildcardClass6 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        long long22 = dateTimeZone0.nextTransition((long) 25200000);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 25200000L + "'", long22 == 25200000L);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int4 = dateTimeZone1.getOffset((long) '4');
        java.lang.Class<?> wildcardClass5 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 100, true);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) 1, locale10);
        int int13 = dateTimeZone0.getStandardOffset(10L);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone0.isLocalDateTimeGap(localDateTime14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.lang.String str19 = dateTimeZone17.getNameKey(10L);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        long long22 = dateTimeZone20.previousTransition((long) ' ');
        java.lang.String str23 = dateTimeZone20.getID();
        java.lang.String str25 = dateTimeZone20.getShortName((long) (short) 0);
        long long28 = dateTimeZone20.convertLocalToUTC((long) (byte) 100, true);
        java.lang.Object obj29 = dateTimeZone20.writeReplace();
        boolean boolean30 = dateTimeZone17.equals((java.lang.Object) dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long34 = dateTimeZone17.getMillisKeepLocal(dateTimeZone32, 0L);
        long long36 = dateTimeZone0.getMillisKeepLocal(dateTimeZone32, 0L);
        java.lang.String str38 = dateTimeZone0.getName((long) (byte) 100);
        java.lang.Class<?> wildcardClass39 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-34L) + "'", long34 == (-34L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-35L) + "'", long36 == (-35L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.Object obj8 = dateTimeZone3.writeReplace();
        java.lang.String str10 = dateTimeZone3.getShortName((long) '4');
        java.lang.String str12 = dateTimeZone3.getShortName(3600000L);
        int int14 = dateTimeZone3.getOffset(25200107L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "11) test0213(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(obj8);
// flaky "10) test0213(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
// flaky "7) test0213(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
// flaky "3) test0213(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition(25199999L);
        int int5 = dateTimeZone1.getStandardOffset(1L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25199999L + "'", long3 == 25199999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        long long21 = dateTimeZone19.previousTransition((long) ' ');
        java.lang.String str22 = dateTimeZone19.getID();
        java.lang.String str24 = dateTimeZone19.getShortName((long) (short) 0);
        long long27 = dateTimeZone19.convertLocalToUTC((long) (byte) 100, true);
        java.lang.Object obj28 = dateTimeZone19.writeReplace();
        boolean boolean29 = dateTimeZone12.equals((java.lang.Object) dateTimeZone19);
        java.lang.Class<?> wildcardClass30 = dateTimeZone19.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "12) test0215(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
// flaky "11) test0215(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
// flaky "8) test0215(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((long) '4', locale5);
        long long8 = dateTimeZone0.convertUTCToLocal((long) 25200000);
        java.lang.Object obj9 = dateTimeZone0.writeReplace();
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (-3600000));
        java.lang.String str13 = dateTimeZone0.getShortName(362099999L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25200000L + "'", long8 == 25200000L);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone5.previousTransition((long) ' ');
        java.lang.String str8 = dateTimeZone5.getID();
        java.lang.Object obj9 = dateTimeZone5.writeReplace();
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        boolean boolean12 = dateTimeZone1.isStandardOffset(25200035L);
        int int14 = dateTimeZone1.getOffsetFromLocal((long) (byte) 10);
        long long17 = dateTimeZone1.convertLocalToUTC((long) 'a', false);
        long long20 = dateTimeZone1.convertLocalToUTC(3L, false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        java.lang.String str10 = dateTimeZone1.getID();
        boolean boolean12 = dateTimeZone1.isStandardOffset((long) 1);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        java.lang.String str15 = dateTimeZone1.getNameKey(0L);
        java.lang.Class<?> wildcardClass16 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "13) test0218(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "12) test0218(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
// flaky "9) test0218(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky "4) test0218(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "1) test0218(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone1.getID();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-25200001L), locale9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str6 = dateTimeZone4.getNameKey(10L);
        long long8 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (long) 1);
        long long10 = dateTimeZone2.nextTransition(10L);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str14 = dateTimeZone12.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider15 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider15);
        boolean boolean17 = dateTimeZone12.equals((java.lang.Object) nameProvider15);
        boolean boolean18 = dateTimeZone2.equals((java.lang.Object) dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology19 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky "14) test0220(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky "13) test0220(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(nameProvider15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.nextTransition((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology7 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long4 = dateTimeZone2.nextTransition((long) '4');
        java.lang.String str5 = dateTimeZone2.toString();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getName((long) (byte) 0, locale7);
        java.lang.String str9 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:00" + "'", str5, "+01:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:00" + "'", str8, "+01:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+01:00" + "'", str9, "+01:00");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        long long9 = dateTimeZone1.convertLocalToUTC(3600000L, true);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        long long12 = dateTimeZone1.nextTransition(52L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "15) test0223(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "14) test0223(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky "10) test0223(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "5) test0223(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky "2) test0223(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        long long21 = dateTimeZone19.previousTransition((long) ' ');
        java.lang.String str22 = dateTimeZone19.getID();
        java.lang.String str24 = dateTimeZone19.getShortName((long) (short) 0);
        long long27 = dateTimeZone19.convertLocalToUTC((long) (byte) 100, true);
        java.lang.Object obj28 = dateTimeZone19.writeReplace();
        boolean boolean29 = dateTimeZone12.equals((java.lang.Object) dateTimeZone19);
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone19.getOffset(readableInstant30);
        java.lang.String str33 = dateTimeZone19.getNameKey(3599899L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "16) test0224(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
// flaky "15) test0224(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
// flaky "11) test0224(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str6 = dateTimeZone0.getID();
        java.lang.String str7 = dateTimeZone0.toString();
        java.lang.String str9 = dateTimeZone0.getShortName((long) (short) 10);
        java.util.TimeZone timeZone10 = dateTimeZone0.toTimeZone();
        java.lang.Class<?> wildcardClass11 = timeZone10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
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
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.lang.String str3 = dateTimeZone1.getShortName(7200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str9 = dateTimeZone0.getShortName((long) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone10.previousTransition((long) ' ');
        java.lang.String str13 = dateTimeZone10.getID();
        java.lang.String str15 = dateTimeZone10.getShortName((long) (short) 0);
        long long17 = dateTimeZone10.nextTransition((long) (byte) 10);
        long long19 = dateTimeZone10.convertUTCToLocal((long) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        boolean boolean22 = dateTimeZone20.equals((java.lang.Object) "");
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone20.getName(10L, locale24);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long29 = dateTimeZone20.getMillisKeepLocal(dateTimeZone27, (long) (short) 0);
        int int31 = dateTimeZone27.getStandardOffset(100L);
        long long33 = dateTimeZone10.getMillisKeepLocal(dateTimeZone27, (long) (-1));
        boolean boolean35 = dateTimeZone10.isStandardOffset((long) 'a');
        java.lang.Class<?> wildcardClass36 = dateTimeZone10.getClass();
        boolean boolean37 = dateTimeZone0.equals((java.lang.Object) dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 3600000L + "'", long29 == 3600000L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-3600000) + "'", int31 == (-3600000));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 3599999L + "'", long33 == 3599999L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(97, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) "");
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName(10L, locale4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone0.getMillisKeepLocal(dateTimeZone7, (long) (short) 0);
        int int11 = dateTimeZone7.getStandardOffset(100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3600000) + "'", int11 == (-3600000));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        int int11 = dateTimeZone1.getOffset(25200010L);
        java.lang.String str13 = dateTimeZone1.getShortName((long) 25200000);
        java.lang.Class<?> wildcardClass14 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "17) test0231(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
// flaky "16) test0231(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
// flaky "12) test0231(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "6) test0231(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        java.lang.String str14 = dateTimeZone9.toString();
        java.lang.Class<?> wildcardClass15 = dateTimeZone9.getClass();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        boolean boolean7 = dateTimeZone4.isFixed();
        long long9 = dateTimeZone4.nextTransition((long) 1);
        long long12 = dateTimeZone4.convertLocalToUTC((long) (byte) 10, false);
        java.lang.Object obj13 = dateTimeZone4.writeReplace();
        long long15 = dateTimeZone3.getMillisKeepLocal(dateTimeZone4, (long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology16 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115260100L + "'", long15 == 115260100L);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        int int20 = dateTimeZone10.getOffsetFromLocal((long) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition(25199999L);
        int int5 = dateTimeZone1.getStandardOffset(1L);
        java.lang.String str7 = dateTimeZone1.getName(0L);
        boolean boolean8 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25199999L + "'", long3 == 25199999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) "");
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName(10L, locale4);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        java.lang.String str7 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        boolean boolean8 = dateTimeZone0.equals((java.lang.Object) 'a');
        long long10 = dateTimeZone0.convertUTCToLocal((long) '4');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getName(101L, locale12);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone0.getShortName((-60034L), locale15);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        java.util.TimeZone timeZone22 = dateTimeZone1.toTimeZone();
        boolean boolean24 = dateTimeZone1.isStandardOffset((-3600035L));
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone1.getName(3600000L, locale26);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25200010L + "'", long18 == 25200010L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        java.lang.String str15 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-25200001L) + "'", long14 == (-25200001L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 1);
        int int4 = dateTimeZone2.getStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str3 = dateTimeZone1.getShortName(25199999L);
        long long6 = dateTimeZone1.convertLocalToUTC(25200035L, false);
        int int8 = dateTimeZone1.getOffset((-337499990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25200034L + "'", long6 == 25200034L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone1.getID();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-25200001L), locale9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName((long) (-3600000), locale13);
        long long16 = dateTimeZone1.nextTransition(4199965L);
        long long18 = dateTimeZone1.convertUTCToLocal(25200011L);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long22 = dateTimeZone20.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone20.isLocalDateTimeGap(localDateTime23);
        java.lang.Object obj25 = dateTimeZone20.writeReplace();
        int int27 = dateTimeZone20.getOffsetFromLocal((long) '#');
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone20, (long) 97);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology30 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 4199965L + "'", long16 == 4199965L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25200011L + "'", long18 == 25200011L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 25199999L + "'", long22 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 96L + "'", long29 == 96L);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone1.getID();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName(115260100L, locale9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName(3540000L, locale12);
        java.lang.Object obj14 = dateTimeZone1.writeReplace();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology15 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.lang.String str5 = dateTimeZone1.getShortName((long) 1);
        int int7 = dateTimeZone1.getStandardOffset((long) (byte) 0);
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Class<?> wildcardClass1 = strSet0.getClass();
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        java.lang.Class<?> wildcardClass48 = dateTimeZone25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        java.lang.Object obj8 = dateTimeZone0.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset((long) (short) 10);
        long long6 = dateTimeZone1.convertUTCToLocal(2L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone7.previousTransition((long) ' ');
        boolean boolean10 = dateTimeZone7.isFixed();
        long long12 = dateTimeZone7.nextTransition((long) 1);
        java.lang.String str14 = dateTimeZone7.getName((long) ' ');
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone7.getShortName(25200035L, locale16);
        java.lang.String str18 = dateTimeZone7.toString();
        long long21 = dateTimeZone7.convertLocalToUTC(115260100L, true);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone23.getOffset(readableInstant24);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        long long28 = dateTimeZone26.previousTransition((long) ' ');
        java.lang.String str29 = dateTimeZone26.getID();
        java.lang.String str31 = dateTimeZone26.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = dateTimeZone26.getOffset(readableInstant32);
        long long35 = dateTimeZone23.getMillisKeepLocal(dateTimeZone26, (long) '#');
        long long37 = dateTimeZone7.getMillisKeepLocal(dateTimeZone26, 3600000L);
        long long39 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (-1));
        java.lang.String str41 = dateTimeZone7.getNameKey(3600010L);
        java.lang.Class<?> wildcardClass42 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 115260100L + "'", long21 == 115260100L);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 35L + "'", long35 == 35L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 3600000L + "'", long37 == 3600000L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTC" + "'", str41, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long13 = dateTimeZone10.convertLocalToUTC(97L, false);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone10.getShortName((long) (short) 10, locale15);
        int int18 = dateTimeZone10.getStandardOffset((long) 600000);
        long long20 = dateTimeZone10.previousTransition(7199899L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 7199899L + "'", long20 == 7199899L);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone2.getShortName(362100000L, locale5);
        java.lang.Class<?> wildcardClass7 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+100:35" + "'", str6, "+100:35");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getNameKey((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forID("UTC");
        java.lang.String str9 = dateTimeZone7.getShortName(3600000L);
        long long11 = dateTimeZone0.getMillisKeepLocal(dateTimeZone7, (-600000L));
        long long13 = dateTimeZone0.previousTransition(359999966L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-600000L) + "'", long11 == (-600000L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 359999966L + "'", long13 == 359999966L);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone4.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone4.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone9.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone13.previousTransition((long) ' ');
        java.lang.String str16 = dateTimeZone13.getID();
        java.lang.Object obj17 = dateTimeZone13.writeReplace();
        boolean boolean18 = dateTimeZone9.equals((java.lang.Object) dateTimeZone13);
        boolean boolean19 = dateTimeZone4.equals((java.lang.Object) dateTimeZone13);
        long long21 = dateTimeZone4.convertUTCToLocal(25200010L);
        long long23 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (long) (-1));
        boolean boolean25 = dateTimeZone4.isStandardOffset((long) 'a');
        java.lang.Object obj26 = dateTimeZone4.writeReplace();
        java.lang.String str28 = dateTimeZone4.getName((long) (short) 0);
        boolean boolean30 = dateTimeZone4.isStandardOffset((long) (byte) 0);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone4.getShortName((long) (byte) 10, locale32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology34 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky "18) test0254(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "17) test0254(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky "13) test0254(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky "7) test0254(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 25200010L + "'", long21 == 25200010L);
// flaky "3) test0254(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj26);
// flaky "1) test0254(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
// flaky "1) test0254(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        java.lang.String str19 = dateTimeZone4.getShortName(360599966L, locale18);
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
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone2.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone2.isLocalDateTimeGap(localDateTime5);
        java.util.TimeZone timeZone7 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 25199999L + "'", long4 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 100, true);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) 1, locale10);
        int int13 = dateTimeZone0.getStandardOffset(10L);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone0.isLocalDateTimeGap(localDateTime14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.lang.String str19 = dateTimeZone17.getNameKey(10L);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        long long22 = dateTimeZone20.previousTransition((long) ' ');
        java.lang.String str23 = dateTimeZone20.getID();
        java.lang.String str25 = dateTimeZone20.getShortName((long) (short) 0);
        long long28 = dateTimeZone20.convertLocalToUTC((long) (byte) 100, true);
        java.lang.Object obj29 = dateTimeZone20.writeReplace();
        boolean boolean30 = dateTimeZone17.equals((java.lang.Object) dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long34 = dateTimeZone17.getMillisKeepLocal(dateTimeZone32, 0L);
        long long36 = dateTimeZone0.getMillisKeepLocal(dateTimeZone32, 0L);
        java.lang.String str37 = dateTimeZone0.getID();
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = dateTimeZone0.getOffset(readableInstant38);
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone0.getShortName((-362100000L), locale41);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky "19) test0257(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertNotNull(obj29);
// flaky "18) test0257(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTimeZone32);
// flaky "14) test0257(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-35L) + "'", long34 == (-35L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-35L) + "'", long36 == (-35L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(10);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(3600003L, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone8.getOffset(readableInstant9);
        int int12 = dateTimeZone8.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone13 = dateTimeZone8.toTimeZone();
        long long15 = dateTimeZone8.nextTransition((long) '4');
        long long17 = dateTimeZone8.convertUTCToLocal((long) (short) -1);
        long long19 = dateTimeZone8.nextTransition((long) 25200000);
        long long21 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 0L);
        long long23 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.Class<?> wildcardClass24 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36000000 + "'", int6 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky "20) test0258(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "19) test0258(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky "15) test0258(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
// flaky "8) test0258(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25200000L + "'", long19 == 25200000L);
// flaky "4) test0258(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 36000000L + "'", long21 == 36000000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 36000000L + "'", long23 == 36000000L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        boolean boolean25 = dateTimeZone0.isStandardOffset((long) 'a');
        java.lang.String str26 = dateTimeZone0.toString();
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone0.getOffset(readableInstant27);
        int int30 = dateTimeZone0.getStandardOffset((-3600035L));
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        long long16 = dateTimeZone1.convertLocalToUTC((long) (byte) 1, false);
        boolean boolean17 = dateTimeZone1.isFixed();
        boolean boolean18 = dateTimeZone1.isFixed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology19 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) "");
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName(10L, locale4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone0.isLocalDateTimeGap(localDateTime6);
        long long10 = dateTimeZone0.convertLocalToUTC((long) (-3600000), false);
        int int12 = dateTimeZone0.getStandardOffset(3L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3600000L) + "'", long10 == (-3600000L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone15.getName(600035L, locale19);
        java.lang.Class<?> wildcardClass21 = dateTimeZone15.getClass();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:00" + "'", str2, "+01:00");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 10, false);
        java.lang.Object obj9 = dateTimeZone0.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(100);
        boolean boolean13 = dateTimeZone11.isStandardOffset((-35L));
        long long15 = dateTimeZone11.nextTransition((-3600000L));
        java.lang.String str17 = dateTimeZone11.getShortName(600010L);
        boolean boolean18 = dateTimeZone0.equals((java.lang.Object) 600010L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3600000L) + "'", long15 == (-3600000L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+100:00" + "'", str17, "+100:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone1.getID();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-25200001L), locale9);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        java.lang.String str12 = dateTimeZone1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        java.lang.String str22 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "21) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "20) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
// flaky "16) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "9) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
// flaky "5) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
// flaky "2) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3599999L + "'", long19 == 3599999L);
// flaky "2) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
// flaky "1) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        java.lang.Class<?> wildcardClass14 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.Object obj8 = dateTimeZone3.writeReplace();
        java.lang.String str10 = dateTimeZone3.getShortName(0L);
        java.lang.String str11 = dateTimeZone3.getID();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone3.getOffset(readableInstant12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "22) test0271(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(obj8);
// flaky "21) test0271(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
// flaky "17) test0271(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
// flaky "10) test0271(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition(25199999L);
        int int5 = dateTimeZone1.getStandardOffset(1L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25199999L + "'", long3 == 25199999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str8 = dateTimeZone0.getID();
        int int10 = dateTimeZone0.getOffset(115260100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName(50400010L, locale4);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) 'a');
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long12 = dateTimeZone10.nextTransition(360000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25199999L + "'", long3 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 360000000L + "'", long12 == 360000000L);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+01:00");
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str6 = dateTimeZone4.getNameKey(10L);
        long long8 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (long) 1);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        java.util.TimeZone timeZone10 = dateTimeZone2.toTimeZone();
        java.lang.String str12 = dateTimeZone2.getName((long) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone13.previousTransition((long) ' ');
        boolean boolean16 = dateTimeZone13.isFixed();
        long long18 = dateTimeZone13.nextTransition((long) 1);
        java.lang.String str19 = dateTimeZone13.getID();
        java.lang.String str20 = dateTimeZone13.toString();
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone13.getName(0L, locale22);
        java.lang.String str24 = dateTimeZone13.toString();
        boolean boolean26 = dateTimeZone13.isStandardOffset((long) (-1));
        long long28 = dateTimeZone2.getMillisKeepLocal(dateTimeZone13, 360000001L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology29 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 360000001L + "'", long28 == 360000001L);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        long long8 = dateTimeZone1.nextTransition((long) '4');
        long long10 = dateTimeZone1.convertUTCToLocal((long) (short) -1);
        long long12 = dateTimeZone1.previousTransition((-600000L));
        int int14 = dateTimeZone1.getOffsetFromLocal((long) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-600000L) + "'", long12 == (-600000L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone4.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone4.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone9.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone13.previousTransition((long) ' ');
        java.lang.String str16 = dateTimeZone13.getID();
        java.lang.Object obj17 = dateTimeZone13.writeReplace();
        boolean boolean18 = dateTimeZone9.equals((java.lang.Object) dateTimeZone13);
        boolean boolean19 = dateTimeZone4.equals((java.lang.Object) dateTimeZone13);
        long long21 = dateTimeZone4.convertUTCToLocal(25200010L);
        long long23 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (long) (-1));
        boolean boolean25 = dateTimeZone4.isStandardOffset((long) 'a');
        java.lang.Object obj26 = dateTimeZone4.writeReplace();
        java.lang.String str28 = dateTimeZone4.getName((long) (short) 0);
        boolean boolean30 = dateTimeZone4.isStandardOffset((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology31 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 25200010L + "'", long21 == 25200010L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        java.lang.Object obj7 = null;
        boolean boolean8 = dateTimeZone1.equals(obj7);
        boolean boolean10 = dateTimeZone1.isStandardOffset(25200000L);
        java.lang.String str12 = dateTimeZone1.getName((-362100000L));
        long long14 = dateTimeZone1.previousTransition((long) 600000);
        java.lang.String str16 = dateTimeZone1.getNameKey(25200009L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone5.previousTransition((long) ' ');
        java.lang.String str8 = dateTimeZone5.getID();
        java.lang.Object obj9 = dateTimeZone5.writeReplace();
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.lang.String str11 = dateTimeZone5.getID();
        int int13 = dateTimeZone5.getOffsetFromLocal((long) (short) 100);
        int int15 = dateTimeZone5.getOffsetFromLocal(599965L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology16 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forID("Asia/Bangkok");
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(32L, locale4);
        java.util.TimeZone timeZone6 = dateTimeZone2.toTimeZone();
        java.lang.String str7 = dateTimeZone2.getID();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology8 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+07:00" + "'", str5, "+07:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Asia/Bangkok" + "'", str7, "Asia/Bangkok");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long4 = dateTimeZone2.nextTransition((long) '4');
        java.lang.String str5 = dateTimeZone2.toString();
        long long8 = dateTimeZone2.convertLocalToUTC(0L, false);
        java.lang.Object obj9 = null;
        boolean boolean10 = dateTimeZone2.equals(obj9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone2.isLocalDateTimeGap(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:00" + "'", str5, "+01:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3600000L) + "'", long8 == (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
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
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        boolean boolean15 = dateTimeZone13.equals((java.lang.Object) "");
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone13.getName(10L, locale17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long22 = dateTimeZone13.getMillisKeepLocal(dateTimeZone20, (long) (short) 0);
        long long24 = dateTimeZone11.getMillisKeepLocal(dateTimeZone20, 3600000L);
        java.lang.Class<?> wildcardClass25 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3600000L + "'", long22 == 3600000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 7200000L + "'", long24 == 7200000L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone3.previousTransition((long) ' ');
        boolean boolean6 = dateTimeZone3.isFixed();
        long long8 = dateTimeZone3.nextTransition((long) 1);
        long long11 = dateTimeZone3.convertLocalToUTC((long) (byte) 10, false);
        java.lang.Object obj12 = dateTimeZone3.writeReplace();
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone3, (long) (byte) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115260100L + "'", long14 == 115260100L);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone4.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone4.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone9.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone13.previousTransition((long) ' ');
        java.lang.String str16 = dateTimeZone13.getID();
        java.lang.Object obj17 = dateTimeZone13.writeReplace();
        boolean boolean18 = dateTimeZone9.equals((java.lang.Object) dateTimeZone13);
        boolean boolean19 = dateTimeZone4.equals((java.lang.Object) dateTimeZone13);
        long long21 = dateTimeZone4.convertUTCToLocal(25200010L);
        long long23 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (long) (-1));
        long long25 = dateTimeZone4.previousTransition((-35L));
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone4.getShortName(0L, locale27);
        java.lang.String str29 = dateTimeZone4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology30 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115260000 + "'", int6 == 115260000);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 140460010L + "'", long21 == 140460010L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-115260000L) + "'", long23 == (-115260000L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-35L) + "'", long25 == (-35L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:01" + "'", str28, "+32:01");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:01" + "'", str29, "+32:01");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str6 = dateTimeZone0.getID();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName(115260100L, locale8);
        java.lang.Class<?> wildcardClass10 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.lang.String str23 = dateTimeZone21.getNameKey(10L);
        long long25 = dateTimeZone19.getMillisKeepLocal(dateTimeZone21, (long) 1);
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone21, (-337499990L));
        long long29 = dateTimeZone1.nextTransition((-3600001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:01" + "'", str9, "+32:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115260000 + "'", int11 == 115260000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:01" + "'", str13, "+32:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:01" + "'", str16, "+32:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:01" + "'", str17, "+32:01");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-337499990L) + "'", long27 == (-337499990L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-3600001L) + "'", long29 == (-3600001L));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName(32L, locale5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str10 = dateTimeZone8.getNameKey(10L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone11.previousTransition((long) ' ');
        java.lang.String str14 = dateTimeZone11.getID();
        java.lang.String str16 = dateTimeZone11.getShortName((long) (short) 0);
        long long19 = dateTimeZone11.convertLocalToUTC((long) (byte) 100, true);
        java.lang.Object obj20 = dateTimeZone11.writeReplace();
        boolean boolean21 = dateTimeZone8.equals((java.lang.Object) dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long25 = dateTimeZone8.getMillisKeepLocal(dateTimeZone23, 0L);
        java.util.TimeZone timeZone26 = dateTimeZone8.toTimeZone();
        java.lang.String str28 = dateTimeZone8.getShortName((long) (-3600000));
        boolean boolean29 = dateTimeZone0.equals((java.lang.Object) (-3600000));
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone0.isLocalDateTimeGap(localDateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky "23) test0291(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(obj20);
// flaky "22) test0291(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeZone23);
// flaky "18) test0291(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-35L) + "'", long25 == (-35L));
        org.junit.Assert.assertNotNull(timeZone26);
// flaky "11) test0291(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "6) test0291(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        long long29 = dateTimeZone1.convertLocalToUTC((long) (short) 1, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "24) test0292(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "23) test0292(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "19) test0292(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky "12) test0292(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200010L + "'", long20 == 25200010L);
// flaky "7) test0292(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        int int4 = dateTimeZone2.getOffsetFromLocal(1L);
        int int6 = dateTimeZone2.getOffsetFromLocal((long) 600000);
        java.lang.String str7 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3600000 + "'", int4 == 3600000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3600000 + "'", int6 == 3600000);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:00" + "'", str7, "+01:00");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        java.lang.String str7 = dateTimeZone0.toString();
        long long9 = dateTimeZone0.convertUTCToLocal(25200035L);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        boolean boolean12 = dateTimeZone0.isStandardOffset(600035L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone16.getOffset(readableInstant17);
        java.lang.String str20 = dateTimeZone16.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        long long24 = dateTimeZone21.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        long long27 = dateTimeZone25.previousTransition((long) ' ');
        java.lang.String str28 = dateTimeZone25.getID();
        java.lang.Object obj29 = dateTimeZone25.writeReplace();
        boolean boolean30 = dateTimeZone21.equals((java.lang.Object) dateTimeZone25);
        boolean boolean31 = dateTimeZone16.equals((java.lang.Object) dateTimeZone25);
        long long33 = dateTimeZone16.convertUTCToLocal(25200010L);
        long long35 = dateTimeZone14.getMillisKeepLocal(dateTimeZone16, (long) (-1));
        java.lang.String str37 = dateTimeZone14.getNameKey((-25200001L));
        java.lang.String str39 = dateTimeZone14.getNameKey((long) (short) 10);
        long long41 = dateTimeZone14.convertUTCToLocal(25800011L);
        long long43 = dateTimeZone0.getMillisKeepLocal(dateTimeZone14, 358499999L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 25200035L + "'", long9 == 25200035L);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
// flaky "25) test0294(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
// flaky "24) test0294(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
// flaky "20) test0294(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky "13) test0294(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 25200010L + "'", long33 == 25200010L);
// flaky "8) test0294(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 25800012L + "'", long41 == 25800012L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 358499998L + "'", long43 == 358499998L);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        long long42 = dateTimeZone23.previousTransition((-365700000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:00" + "'", str5, "+01:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:00" + "'", str8, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "26) test0295(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(nameProvider13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "25) test0295(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
// flaky "21) test0295(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
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
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-365700000L) + "'", long42 == (-365700000L));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone5.previousTransition((long) ' ');
        java.lang.String str8 = dateTimeZone5.getID();
        java.lang.Object obj9 = dateTimeZone5.writeReplace();
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName(100L, locale12);
        long long16 = dateTimeZone1.convertLocalToUTC((long) (short) 10, false);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone1.getOffset(readableInstant17);
        long long21 = dateTimeZone1.convertLocalToUTC(3L, false);
        java.lang.String str22 = dateTimeZone1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology23 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3L + "'", long21 == 3L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        int int28 = dateTimeZone1.getOffset(387300010L);
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone1.getOffset(readableInstant29);
        int int32 = dateTimeZone1.getStandardOffset((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "27) test0298(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "26) test0298(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "22) test0298(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky "14) test0298(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200010L + "'", long20 == 25200010L);
// flaky "9) test0298(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        long long8 = dateTimeZone1.nextTransition((long) '4');
        long long10 = dateTimeZone1.convertUTCToLocal((long) (short) -1);
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "28) test0299(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "27) test0299(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky "23) test0299(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
// flaky "15) test0299(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, 362100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 362100000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        long long30 = dateTimeZone28.previousTransition((long) ' ');
        java.lang.String str31 = dateTimeZone28.getID();
        java.lang.String str33 = dateTimeZone28.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone28.getOffset(readableInstant34);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone28.getName((long) (byte) -1, locale37);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        long long41 = dateTimeZone28.previousTransition((long) (short) 10);
        long long43 = dateTimeZone16.getMillisKeepLocal(dateTimeZone28, 362100000L);
        java.lang.Class<?> wildcardClass44 = dateTimeZone16.getClass();
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
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 362100000L + "'", long43 == 362100000L);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.Class<?> wildcardClass12 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115200000");
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
        boolean boolean29 = dateTimeZone1.isStandardOffset(96L);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(3600003L, locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        java.lang.String str3 = dateTimeZone2.getID();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.010" + "'", str3, "+00:00:00.010");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        java.lang.Object obj17 = dateTimeZone0.writeReplace();
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
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 100, true);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) 1, locale10);
        int int13 = dateTimeZone0.getStandardOffset(10L);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone0.isLocalDateTimeGap(localDateTime14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.lang.String str19 = dateTimeZone17.getNameKey(10L);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        long long22 = dateTimeZone20.previousTransition((long) ' ');
        java.lang.String str23 = dateTimeZone20.getID();
        java.lang.String str25 = dateTimeZone20.getShortName((long) (short) 0);
        long long28 = dateTimeZone20.convertLocalToUTC((long) (byte) 100, true);
        java.lang.Object obj29 = dateTimeZone20.writeReplace();
        boolean boolean30 = dateTimeZone17.equals((java.lang.Object) dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long34 = dateTimeZone17.getMillisKeepLocal(dateTimeZone32, 0L);
        long long36 = dateTimeZone0.getMillisKeepLocal(dateTimeZone32, 0L);
        java.lang.String str37 = dateTimeZone0.getID();
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = dateTimeZone0.getOffset(readableInstant38);
        org.joda.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = dateTimeZone0.isLocalDateTimeGap(localDateTime40);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-35L) + "'", long34 == (-35L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-35L) + "'", long36 == (-35L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.Class<?> wildcardClass6 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName((long) (short) 0);
        long long9 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, true);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        boolean boolean11 = dateTimeZone1.isFixed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) 'a', locale7);
        long long10 = dateTimeZone0.convertUTCToLocal(10L);
        java.lang.String str11 = dateTimeZone0.toString();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName(24600010L, locale13);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        boolean boolean11 = dateTimeZone0.isStandardOffset(25200035L);
        long long13 = dateTimeZone0.convertUTCToLocal(0L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone0.getName((long) 0, locale15);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) "");
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName(10L, locale4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone0.isLocalDateTimeGap(localDateTime6);
        long long10 = dateTimeZone0.convertLocalToUTC((long) (-3600000), false);
        int int12 = dateTimeZone0.getStandardOffset(3L);
        int int14 = dateTimeZone0.getOffset(387300010L);
        java.lang.String str16 = dateTimeZone0.getName(359999967L);
        int int18 = dateTimeZone0.getOffset((-3600035L));
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        long long21 = dateTimeZone19.previousTransition((long) ' ');
        boolean boolean22 = dateTimeZone19.isFixed();
        long long24 = dateTimeZone19.nextTransition((long) 1);
        int int26 = dateTimeZone19.getOffset((long) (short) 0);
        long long28 = dateTimeZone19.previousTransition((-362100000L));
        long long30 = dateTimeZone0.getMillisKeepLocal(dateTimeZone19, 600010L);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone0.getShortName(21600010L, locale32);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3600000L) + "'", long10 == (-3600000L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-362100000L) + "'", long28 == (-362100000L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 600010L + "'", long30 == 600010L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone2.getName(50400010L, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone2.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology8 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 100, true);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) 1, locale10);
        int int13 = dateTimeZone0.getStandardOffset(10L);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone0.isLocalDateTimeGap(localDateTime14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.lang.String str19 = dateTimeZone17.getNameKey(10L);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        long long22 = dateTimeZone20.previousTransition((long) ' ');
        java.lang.String str23 = dateTimeZone20.getID();
        java.lang.String str25 = dateTimeZone20.getShortName((long) (short) 0);
        long long28 = dateTimeZone20.convertLocalToUTC((long) (byte) 100, true);
        java.lang.Object obj29 = dateTimeZone20.writeReplace();
        boolean boolean30 = dateTimeZone17.equals((java.lang.Object) dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long34 = dateTimeZone17.getMillisKeepLocal(dateTimeZone32, 0L);
        long long36 = dateTimeZone0.getMillisKeepLocal(dateTimeZone32, 0L);
        java.lang.String str37 = dateTimeZone0.getID();
        java.lang.Class<?> wildcardClass38 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-35L) + "'", long34 == (-35L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-35L) + "'", long36 == (-35L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long4 = dateTimeZone2.nextTransition((long) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long9 = dateTimeZone7.nextTransition((long) '4');
        java.lang.String str10 = dateTimeZone7.toString();
        long long12 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, 387300010L);
        java.lang.String str14 = dateTimeZone7.getNameKey(35L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone7.getName(388800010L, locale16);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:00" + "'", str10, "+01:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 387300010L + "'", long12 == 387300010L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+01:00" + "'", str17, "+01:00");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        long long9 = dateTimeZone1.convertUTCToLocal(10L);
        long long11 = dateTimeZone1.previousTransition(115260100L);
        long long14 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        long long16 = dateTimeZone1.previousTransition(25200036L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115260100L + "'", long11 == 115260100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200036L + "'", long16 == 25200036L);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        boolean boolean3 = dateTimeZone2.isFixed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone0.isLocalDateTimeGap(localDateTime10);
        java.util.TimeZone timeZone12 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone2.getShortName(362100000L, locale5);
        int int8 = dateTimeZone2.getOffsetFromLocal(25200001L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+100:35" + "'", str6, "+100:35");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 362100000 + "'", int8 == 362100000);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(600000, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        java.lang.String str4 = dateTimeZone0.getID();
        long long6 = dateTimeZone0.previousTransition(25200000L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getName((long) (byte) 0, locale8);
        boolean boolean10 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25200000L + "'", long6 == 25200000L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        boolean boolean11 = dateTimeZone0.isStandardOffset(25200035L);
        long long13 = dateTimeZone0.convertUTCToLocal(0L);
        java.lang.Class<?> wildcardClass14 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(1L, locale4);
        java.lang.String str7 = dateTimeZone2.getNameKey((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology8 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        java.lang.String str4 = dateTimeZone1.getID();
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName(32L, locale6);
        long long10 = dateTimeZone1.convertLocalToUTC(362100000L, false);
        boolean boolean12 = dateTimeZone1.isStandardOffset(360000052L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 362100000L + "'", long10 == 362100000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        long long21 = dateTimeZone19.previousTransition((long) ' ');
        boolean boolean22 = dateTimeZone19.isFixed();
        long long24 = dateTimeZone19.nextTransition((long) 1);
        java.lang.String str26 = dateTimeZone19.getName((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        java.util.TimeZone timeZone28 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        long long32 = dateTimeZone30.previousTransition((long) ' ');
        boolean boolean33 = dateTimeZone30.isFixed();
        long long35 = dateTimeZone29.getMillisKeepLocal(dateTimeZone30, (long) ' ');
        long long37 = dateTimeZone0.getMillisKeepLocal(dateTimeZone30, (long) (short) -1);
        java.lang.Class<?> wildcardClass38 = dateTimeZone0.getClass();
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
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        java.lang.String str18 = dateTimeZone0.getName((long) '4');
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone0.getShortName(599965L, locale20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone0.getName((-3600035L), locale23);
        boolean boolean26 = dateTimeZone0.isStandardOffset(115260100L);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        java.lang.Class<?> wildcardClass6 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        int int6 = dateTimeZone2.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone7 = dateTimeZone2.toTimeZone();
        java.lang.Object obj8 = null;
        boolean boolean9 = dateTimeZone2.equals(obj8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology10 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long7 = dateTimeZone0.previousTransition((long) (short) -1);
        int int9 = dateTimeZone0.getStandardOffset((long) 0);
        long long11 = dateTimeZone0.convertUTCToLocal((long) ' ');
        java.lang.String str13 = dateTimeZone0.getName((long) 600000);
        int int15 = dateTimeZone0.getOffset((long) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long4 = dateTimeZone2.convertUTCToLocal((long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 60032L + "'", long4 == 60032L);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+32:01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+32:01\" is malformed at \"32:01\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        int int11 = dateTimeZone1.getOffset(25200010L);
        java.lang.String str13 = dateTimeZone1.getShortName((long) 25200000);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName((long) 100, locale15);
        java.lang.Class<?> wildcardClass17 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        long long10 = dateTimeZone7.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone11.previousTransition((long) ' ');
        java.lang.String str14 = dateTimeZone11.getID();
        java.lang.Object obj15 = dateTimeZone11.writeReplace();
        boolean boolean16 = dateTimeZone7.equals((java.lang.Object) dateTimeZone11);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone7.getName(100L, locale18);
        long long22 = dateTimeZone7.convertLocalToUTC((long) (short) 10, false);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-362100000L));
        boolean boolean26 = dateTimeZone7.isStandardOffset(3599999L);
        int int28 = dateTimeZone7.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-362100000L) + "'", long24 == (-362100000L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360000000);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) '4');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        int int28 = dateTimeZone1.getOffset(387300010L);
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone1.getOffset(readableInstant29);
        long long32 = dateTimeZone1.nextTransition((long) (byte) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        java.lang.String str23 = dateTimeZone1.getShortName((-3600035L));
        java.lang.Class<?> wildcardClass24 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-2L) + "'", long9 == (-2L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3599998L + "'", long19 == 3599998L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.001" + "'", str21, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.001" + "'", str23, "+00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+35:35");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+35:35\" is malformed at \"35:35\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        java.lang.Class<?> wildcardClass29 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "29) test0350(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
// flaky "28) test0350(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
// flaky "24) test0350(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
// flaky "16) test0350(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25200010L + "'", long15 == 25200010L);
// flaky "10) test0350(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky "3) test0350(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky "3) test0350(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
// flaky "2) test0350(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky "1) test0350(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-337499990L) + "'", long27 == (-337499990L));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName((long) (short) 0);
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition((long) ' ');
        boolean boolean12 = dateTimeZone9.isFixed();
        long long14 = dateTimeZone9.nextTransition((long) 1);
        java.lang.String str16 = dateTimeZone9.getName((long) ' ');
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone9.getShortName(25200035L, locale18);
        java.lang.String str20 = dateTimeZone9.toString();
        long long23 = dateTimeZone9.convertLocalToUTC(115260100L, true);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone25.getOffset(readableInstant26);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        long long30 = dateTimeZone28.previousTransition((long) ' ');
        java.lang.String str31 = dateTimeZone28.getID();
        java.lang.String str33 = dateTimeZone28.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone28.getOffset(readableInstant34);
        long long37 = dateTimeZone25.getMillisKeepLocal(dateTimeZone28, (long) '#');
        long long39 = dateTimeZone9.getMillisKeepLocal(dateTimeZone28, 3600000L);
        boolean boolean40 = dateTimeZone1.equals((java.lang.Object) long39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology41 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 115260100L + "'", long23 == 115260100L);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 35L + "'", long37 == 35L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 3600000L + "'", long39 == 3600000L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(362100000, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((long) '4', locale5);
        long long8 = dateTimeZone0.convertUTCToLocal((long) 25200000);
        java.lang.Object obj9 = dateTimeZone0.writeReplace();
        boolean boolean11 = dateTimeZone0.isStandardOffset(32L);
        int int13 = dateTimeZone0.getStandardOffset(362100000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25200000L + "'", long8 == 25200000L);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName((long) (byte) -1, locale9);
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (byte) 100);
        int int14 = dateTimeZone0.getOffset(36000000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true);
        java.lang.Object obj5 = dateTimeZone1.writeReplace();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str6 = dateTimeZone0.getID();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName((-25200001L), locale8);
        java.lang.Object obj10 = dateTimeZone0.writeReplace();
        java.lang.String str11 = dateTimeZone0.toString();
        java.lang.String str13 = dateTimeZone0.getName(7199998L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        long long9 = dateTimeZone1.nextTransition(10L);
        boolean boolean11 = dateTimeZone1.isStandardOffset((long) (-1));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        java.util.TimeZone timeZone22 = dateTimeZone1.toTimeZone();
        boolean boolean24 = dateTimeZone1.isStandardOffset((-3600035L));
        java.lang.Class<?> wildcardClass25 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25200010L + "'", long18 == 25200010L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        long long26 = dateTimeZone1.convertLocalToUTC(50400010L, false);
        java.lang.Object obj27 = dateTimeZone1.writeReplace();
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone1.getName(0L, locale29);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        long long33 = dateTimeZone31.previousTransition((long) ' ');
        java.lang.String str34 = dateTimeZone31.getID();
        java.lang.String str36 = dateTimeZone31.getShortName((long) (short) 0);
        long long38 = dateTimeZone31.previousTransition((long) (short) -1);
        int int40 = dateTimeZone31.getStandardOffset((long) 0);
        long long42 = dateTimeZone31.convertUTCToLocal((long) ' ');
        boolean boolean43 = dateTimeZone1.equals((java.lang.Object) dateTimeZone31);
        java.lang.Object obj44 = dateTimeZone31.writeReplace();
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 50400010L + "'", long26 == 50400010L);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 32L + "'", long42 == 32L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        boolean boolean24 = dateTimeZone2.isStandardOffset((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone2.getOffset(readableInstant25);
        long long29 = dateTimeZone2.convertLocalToUTC((long) 3600000, false);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3600000 + "'", int26 == 3600000);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.lang.String str23 = dateTimeZone21.getNameKey(10L);
        long long25 = dateTimeZone19.getMillisKeepLocal(dateTimeZone21, (long) 1);
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone21, (-337499990L));
        java.lang.String str29 = dateTimeZone1.getShortName((-25200001L));
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
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-337499990L) + "'", long27 == (-337499990L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.lang.Class<?> wildcardClass22 = timeZone19.getClass();
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
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.lang.String str5 = dateTimeZone1.getShortName((long) 1);
        int int7 = dateTimeZone1.getStandardOffset((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36000000 + "'", int9 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        long long18 = dateTimeZone0.convertUTCToLocal(600000L);
        java.lang.String str20 = dateTimeZone0.getShortName(360000000L);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone2.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone2.isLocalDateTimeGap(localDateTime5);
        java.lang.Object obj7 = dateTimeZone2.writeReplace();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone2.getName(25200010L, locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology11 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 25199999L + "'", long4 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(1L, locale3);
        java.lang.String str6 = dateTimeZone1.getNameKey((long) ' ');
        java.lang.Class<?> wildcardClass7 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(10);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(3600003L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone2.getOffset(readableInstant6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        int int13 = dateTimeZone9.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone14 = dateTimeZone9.toTimeZone();
        long long16 = dateTimeZone9.nextTransition((long) '4');
        long long18 = dateTimeZone9.convertUTCToLocal((long) (short) -1);
        long long20 = dateTimeZone9.nextTransition((long) 25200000);
        long long22 = dateTimeZone2.getMillisKeepLocal(dateTimeZone9, 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology23 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200000L + "'", long20 == 25200000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 36000000L + "'", long22 == 36000000L);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 1);
        long long4 = dateTimeZone2.previousTransition(25800011L);
        java.lang.Class<?> wildcardClass5 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 25800011L + "'", long4 == 25800011L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        long long10 = dateTimeZone7.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone11.previousTransition((long) ' ');
        java.lang.String str14 = dateTimeZone11.getID();
        java.lang.Object obj15 = dateTimeZone11.writeReplace();
        boolean boolean16 = dateTimeZone7.equals((java.lang.Object) dateTimeZone11);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone7.getName(100L, locale18);
        long long22 = dateTimeZone7.convertLocalToUTC((long) (short) 10, false);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-362100000L));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        long long27 = dateTimeZone25.previousTransition((long) ' ');
        java.lang.String str28 = dateTimeZone25.getID();
        java.lang.String str30 = dateTimeZone25.getShortName((long) (short) 0);
        long long32 = dateTimeZone25.nextTransition((long) (byte) 10);
        long long34 = dateTimeZone25.convertUTCToLocal((long) 100);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        boolean boolean37 = dateTimeZone35.equals((java.lang.Object) "");
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone35.getName(10L, locale39);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long44 = dateTimeZone35.getMillisKeepLocal(dateTimeZone42, (long) (short) 0);
        int int46 = dateTimeZone42.getStandardOffset(100L);
        long long48 = dateTimeZone25.getMillisKeepLocal(dateTimeZone42, (long) (-1));
        long long50 = dateTimeZone25.previousTransition(600035L);
        long long52 = dateTimeZone1.getMillisKeepLocal(dateTimeZone25, (long) 600000);
        java.lang.Object obj53 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-362100000L) + "'", long24 == (-362100000L));
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 3600000L + "'", long44 == 3600000L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-3600000) + "'", int46 == (-3600000));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 3599999L + "'", long48 == 3599999L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 600035L + "'", long50 == 600035L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 600000L + "'", long52 == 600000L);
        org.junit.Assert.assertNotNull(obj53);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 10, false);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName(599965L, locale10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        boolean boolean15 = dateTimeZone0.equals((java.lang.Object) timeZone14);
        java.util.TimeZone timeZone16 = dateTimeZone0.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        long long7 = dateTimeZone4.getMillisKeepLocal(dateTimeZone5, (long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) "");
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName(10L, locale5);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        long long11 = dateTimeZone1.convertLocalToUTC((long) (-3600000), false);
        int int13 = dateTimeZone1.getStandardOffset(3L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName(52L, locale15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology17 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3600000L) + "'", long11 == (-3600000L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        boolean boolean27 = dateTimeZone1.isFixed();
        long long30 = dateTimeZone1.convertLocalToUTC(21600010L, true);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 21600009L + "'", long30 == 21600009L);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((long) 10, locale4);
        long long7 = dateTimeZone2.convertUTCToLocal(1L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology8 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getName(100L, locale11);
        java.lang.String str13 = dateTimeZone0.toString();
        boolean boolean15 = dateTimeZone0.isStandardOffset((long) (byte) 0);
        java.lang.Object obj16 = dateTimeZone0.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long7 = dateTimeZone0.previousTransition((long) (short) -1);
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        long long16 = dateTimeZone1.convertLocalToUTC((long) (byte) 1, false);
        long long18 = dateTimeZone1.nextTransition(28800010L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology19 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 28800010L + "'", long18 == 28800010L);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 0);
        java.lang.String str4 = dateTimeZone2.getName((-362100000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        long long9 = dateTimeZone3.convertUTCToLocal((long) (-1));
        long long11 = dateTimeZone3.nextTransition((long) (byte) 10);
        int int13 = dateTimeZone3.getOffset((long) (short) 0);
        long long15 = dateTimeZone3.previousTransition(25200010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25200010L + "'", long15 == 25200010L);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone0.isLocalDateTimeGap(localDateTime7);
        java.lang.Class<?> wildcardClass9 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.lang.String str6 = dateTimeZone2.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        long long10 = dateTimeZone7.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone11.previousTransition((long) ' ');
        java.lang.String str14 = dateTimeZone11.getID();
        java.lang.Object obj15 = dateTimeZone11.writeReplace();
        boolean boolean16 = dateTimeZone7.equals((java.lang.Object) dateTimeZone11);
        boolean boolean17 = dateTimeZone2.equals((java.lang.Object) dateTimeZone11);
        boolean boolean19 = dateTimeZone2.isStandardOffset(3599999L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology20 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset(25200036L);
        java.lang.String str11 = dateTimeZone7.getName((-326100000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25199999L + "'", long3 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        boolean boolean5 = dateTimeZone1.isFixed();
        long long8 = dateTimeZone1.convertLocalToUTC(360000000L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 324000000L + "'", long8 == 324000000L);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        long long10 = dateTimeZone7.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone11.previousTransition((long) ' ');
        java.lang.String str14 = dateTimeZone11.getID();
        java.lang.Object obj15 = dateTimeZone11.writeReplace();
        boolean boolean16 = dateTimeZone7.equals((java.lang.Object) dateTimeZone11);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone7.getName(100L, locale18);
        long long22 = dateTimeZone7.convertLocalToUTC((long) (short) 10, false);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-362100000L));
        boolean boolean26 = dateTimeZone7.isStandardOffset(3599999L);
        java.lang.String str28 = dateTimeZone7.getNameKey(0L);
        long long31 = dateTimeZone7.convertLocalToUTC(0L, true);
        java.lang.Class<?> wildcardClass32 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-362100000L) + "'", long24 == (-362100000L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        long long25 = dateTimeZone1.previousTransition(25200010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "30) test0387(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 600000 + "'", int3 == 600000);
// flaky "29) test0387(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "25) test0387(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "17) test0387(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25800010L + "'", long18 == 25800010L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "11) test0387(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:10" + "'", str23, "+00:10");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 25200010L + "'", long25 == 25200010L);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        boolean boolean27 = dateTimeZone1.isFixed();
        long long30 = dateTimeZone1.convertLocalToUTC((-97L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "31) test0388(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 600000 + "'", int5 == 600000);
// flaky "30) test0388(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "26) test0388(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "18) test0388(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25800010L + "'", long20 == 25800010L);
// flaky "12) test0388(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-600000L) + "'", long22 == (-600000L));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 52L + "'", long26 == 52L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-98L) + "'", long30 == (-98L));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forID("UTC");
        java.lang.String str21 = dateTimeZone19.getNameKey((long) (short) 100);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.lang.String str27 = dateTimeZone25.getNameKey(10L);
        long long29 = dateTimeZone23.getMillisKeepLocal(dateTimeZone25, (long) 1);
        java.lang.String str31 = dateTimeZone23.getName((long) 0);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone23.getName(25200035L, locale33);
        long long37 = dateTimeZone23.convertLocalToUTC(25200010L, true);
        int int39 = dateTimeZone23.getStandardOffset((-1L));
        int int41 = dateTimeZone23.getOffset((long) '4');
        long long44 = dateTimeZone23.convertLocalToUTC(0L, false);
        int int46 = dateTimeZone23.getOffset((-2L));
        java.util.Locale locale48 = null;
        java.lang.String str49 = dateTimeZone23.getName(362099999L, locale48);
        long long51 = dateTimeZone19.getMillisKeepLocal(dateTimeZone23, (-96L));
        long long53 = dateTimeZone0.getMillisKeepLocal(dateTimeZone19, (-97L));
        java.lang.Class<?> wildcardClass54 = dateTimeZone19.getClass();
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
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
// flaky "32) test0389(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
// flaky "31) test0389(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:10" + "'", str31, "+00:10");
// flaky "27) test0389(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:10" + "'", str34, "+00:10");
// flaky "19) test0389(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 24600010L + "'", long37 == 24600010L);
// flaky "13) test0389(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 600000 + "'", int39 == 600000);
// flaky "4) test0389(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 600000 + "'", int41 == 600000);
// flaky "4) test0389(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-600000L) + "'", long44 == (-600000L));
// flaky "3) test0389(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 600000 + "'", int46 == 600000);
// flaky "2) test0389(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:10" + "'", str49, "+00:10");
// flaky "1) test0389(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-600096L) + "'", long51 == (-600096L));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-97L) + "'", long53 == (-97L));
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        java.lang.Class<?> wildcardClass17 = dateTimeZone0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(10);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(3600003L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone2.getOffset(readableInstant6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        int int13 = dateTimeZone9.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone14 = dateTimeZone9.toTimeZone();
        long long16 = dateTimeZone9.nextTransition((long) '4');
        long long18 = dateTimeZone9.convertUTCToLocal((long) (short) -1);
        long long20 = dateTimeZone9.nextTransition((long) 25200000);
        long long22 = dateTimeZone2.getMillisKeepLocal(dateTimeZone9, 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology23 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky "33) test0391(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 126000000 + "'", int11 == 126000000);
// flaky "32) test0391(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 126000000 + "'", int13 == 126000000);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky "28) test0391(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
// flaky "20) test0391(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 125999999L + "'", long18 == 125999999L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200000L + "'", long20 == 25200000L);
// flaky "14) test0391(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-90000000L) + "'", long22 == (-90000000L));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        java.lang.String str4 = dateTimeZone1.getID();
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName(32L, locale6);
        java.lang.String str9 = dateTimeZone1.getNameKey(362100000L);
        boolean boolean11 = dateTimeZone1.isStandardOffset(21600010L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long7 = dateTimeZone0.nextTransition((long) (byte) 10);
        java.lang.String str9 = dateTimeZone0.getNameKey(387300010L);
        long long11 = dateTimeZone0.previousTransition((long) '#');
        int int13 = dateTimeZone0.getStandardOffset((long) 100);
        int int15 = dateTimeZone0.getStandardOffset((long) 0);
        java.lang.Class<?> wildcardClass16 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        boolean boolean32 = dateTimeZone19.isStandardOffset((long) 100);
        java.lang.Class<?> wildcardClass33 = dateTimeZone19.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115260100L + "'", long14 == 115260100L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
// flaky "34) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 126000000 + "'", int18 == 126000000);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
// flaky "33) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 126000035L + "'", long28 == 126000035L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3600000L + "'", long30 == 3600000L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        int int28 = dateTimeZone1.getOffset(387300010L);
        long long30 = dateTimeZone1.nextTransition(0L);
        boolean boolean32 = dateTimeZone1.isStandardOffset(25800111L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "35) test0395(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 126000000 + "'", int5 == 126000000);
// flaky "34) test0395(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "29) test0395(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "21) test0395(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 151200010L + "'", long20 == 151200010L);
// flaky "15) test0395(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-126000000L) + "'", long22 == (-126000000L));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = dateTimeZone16.isLocalDateTimeGap(localDateTime28);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        boolean boolean32 = dateTimeZone16.isStandardOffset((-34L));
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        boolean boolean11 = dateTimeZone0.isStandardOffset(25200035L);
        int int13 = dateTimeZone0.getOffsetFromLocal((long) (byte) 10);
        long long16 = dateTimeZone0.convertLocalToUTC((long) 'a', false);
        long long19 = dateTimeZone0.convertLocalToUTC(3L, false);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone23.getOffset(readableInstant24);
        java.lang.String str27 = dateTimeZone23.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        long long31 = dateTimeZone28.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone32.previousTransition((long) ' ');
        java.lang.String str35 = dateTimeZone32.getID();
        java.lang.Object obj36 = dateTimeZone32.writeReplace();
        boolean boolean37 = dateTimeZone28.equals((java.lang.Object) dateTimeZone32);
        boolean boolean38 = dateTimeZone23.equals((java.lang.Object) dateTimeZone32);
        long long40 = dateTimeZone23.convertUTCToLocal(25200010L);
        long long42 = dateTimeZone21.getMillisKeepLocal(dateTimeZone23, (long) (-1));
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        int int46 = dateTimeZone44.getOffset(readableInstant45);
        java.lang.String str48 = dateTimeZone44.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        long long52 = dateTimeZone49.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.UTC;
        long long55 = dateTimeZone53.previousTransition((long) ' ');
        java.lang.String str56 = dateTimeZone53.getID();
        java.lang.Object obj57 = dateTimeZone53.writeReplace();
        boolean boolean58 = dateTimeZone49.equals((java.lang.Object) dateTimeZone53);
        boolean boolean59 = dateTimeZone44.equals((java.lang.Object) dateTimeZone53);
        java.lang.String str60 = dateTimeZone53.toString();
        long long62 = dateTimeZone23.getMillisKeepLocal(dateTimeZone53, (long) (short) 100);
        long long64 = dateTimeZone23.previousTransition(3540000L);
        boolean boolean65 = dateTimeZone0.equals((java.lang.Object) long64);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3L + "'", long19 == 3L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 25200010L + "'", long40 == 25200010L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "UTC" + "'", str48, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 32L + "'", long55 == 32L);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "UTC" + "'", str56, "UTC");
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "UTC" + "'", str60, "UTC");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 100L + "'", long62 == 100L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 3540000L + "'", long64 == 3540000L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+10:00");
        boolean boolean2 = dateTimeZone1.isFixed();
        boolean boolean3 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        java.lang.String str16 = dateTimeZone0.getShortName((-362100001L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
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
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        int int11 = dateTimeZone1.getOffset(25200010L);
        java.lang.String str13 = dateTimeZone1.getShortName((-1L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName(115260100L, locale15);
        java.lang.String str17 = dateTimeZone1.getID();
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.lang.String str23 = dateTimeZone21.getNameKey(10L);
        long long25 = dateTimeZone19.getMillisKeepLocal(dateTimeZone21, (long) 1);
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone21, (-337499990L));
        int int29 = dateTimeZone21.getStandardOffset((-2L));
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone21.getOffset(readableInstant30);
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
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-337499990L) + "'", long27 == (-337499990L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115200000, 115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        boolean boolean50 = dateTimeZone25.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:00" + "'", str7, "+01:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:00" + "'", str10, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky "36) test0403(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(nameProvider15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "35) test0403(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-362100001L) + "'", long20 == (-362100001L));
// flaky "30) test0403(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+100:35" + "'", str21, "+100:35");
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        long long48 = dateTimeZone1.previousTransition((long) '4');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+01:00" + "'", str9, "+01:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:00" + "'", str12, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky "37) test0404(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(nameProvider17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky "36) test0404(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-362100001L) + "'", long22 == (-362100001L));
// flaky "31) test0404(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+100:35" + "'", str23, "+100:35");
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
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 52L + "'", long48 == 52L);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone0.getName(362099999L, locale33);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone1.getID();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-25200001L), locale9);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        java.lang.String str12 = dateTimeZone1.toString();
        long long14 = dateTimeZone1.nextTransition((long) (-1));
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        int int18 = dateTimeZone16.getOffsetFromLocal((-25200001L));
        boolean boolean20 = dateTimeZone16.isStandardOffset(24000010L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        int int28 = dateTimeZone3.getOffsetFromLocal(362100000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "38) test0407(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 600000 + "'", int5 == 600000);
// flaky "37) test0407(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "32) test0407(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "22) test0407(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25800010L + "'", long20 == 25800010L);
// flaky "16) test0407(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-600000L) + "'", long22 == (-600000L));
// flaky "5) test0407(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 600000 + "'", int24 == 600000);
// flaky "5) test0407(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:10" + "'", str26, "+00:10");
// flaky "4) test0407(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 600000 + "'", int28 == 600000);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.getID();
        java.lang.Class<?> wildcardClass11 = dateTimeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "39) test0408(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "38) test0408(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:10");
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky "33) test0408(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:10" + "'", str10, "+00:10");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) "");
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName(10L, locale4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone0.isLocalDateTimeGap(localDateTime6);
        long long10 = dateTimeZone0.convertLocalToUTC((long) (-3600000), false);
        long long12 = dateTimeZone0.previousTransition((-600001L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3600000L) + "'", long10 == (-3600000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-600001L) + "'", long12 == (-600001L));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        int int6 = dateTimeZone2.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone7 = dateTimeZone2.toTimeZone();
        java.lang.Object obj8 = null;
        boolean boolean9 = dateTimeZone2.equals(obj8);
        boolean boolean11 = dateTimeZone2.isStandardOffset(25200000L);
        java.lang.String str13 = dateTimeZone2.getName((-362100000L));
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str17 = dateTimeZone15.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider18 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider18);
        boolean boolean20 = dateTimeZone15.equals((java.lang.Object) nameProvider18);
        long long23 = dateTimeZone15.convertLocalToUTC((-1L), true);
        java.lang.String str24 = dateTimeZone15.getID();
        boolean boolean25 = dateTimeZone15.isFixed();
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone15.getName(1L, locale27);
        java.lang.String str30 = dateTimeZone15.getNameKey((long) (short) -1);
        boolean boolean31 = dateTimeZone2.equals((java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology32 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky "40) test0410(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 600000 + "'", int4 == 600000);
// flaky "39) test0410(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 600000 + "'", int6 == 600000);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky "34) test0410(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:10");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "23) test0410(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:10" + "'", str13, "+00:10");
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky "17) test0410(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(nameProvider18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "6) test0410(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-600001L) + "'", long23 == (-600001L));
// flaky "6) test0410(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:10" + "'", str24, "+00:10");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky "5) test0410(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:10" + "'", str28, "+00:10");
// flaky "3) test0410(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        int int11 = dateTimeZone1.getOffset((long) (short) 100);
        boolean boolean12 = dateTimeZone1.isFixed();
        java.lang.String str13 = dateTimeZone1.getID();
        java.lang.String str15 = dateTimeZone1.getNameKey(25200011L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "41) test0411(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "40) test0411(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-600001L) + "'", long9 == (-600001L));
// flaky "35) test0411(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 600000 + "'", int11 == 600000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "24) test0411(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:10" + "'", str13, "+00:10");
// flaky "18) test0411(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 10, false);
        boolean boolean10 = dateTimeZone0.equals((java.lang.Object) '#');
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone0.getOffset(readableInstant11);
        java.lang.String str13 = dateTimeZone0.getID();
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone0.getOffset(readableInstant14);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        long long37 = dateTimeZone12.previousTransition((long) (-1));
        java.lang.Class<?> wildcardClass38 = dateTimeZone12.getClass();
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
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        java.lang.Object obj7 = null;
        boolean boolean8 = dateTimeZone1.equals(obj7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) 362100000);
        boolean boolean11 = dateTimeZone1.isFixed();
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) "");
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName(10L, locale4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone0.getMillisKeepLocal(dateTimeZone7, (long) (short) 0);
        int int11 = dateTimeZone7.getStandardOffset(100L);
        long long13 = dateTimeZone7.nextTransition((long) 0);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone7.isLocalDateTimeGap(localDateTime14);
        java.lang.String str17 = dateTimeZone7.getNameKey((-600000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3600000) + "'", int11 == (-3600000));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long4 = dateTimeZone2.nextTransition((long) '4');
        java.lang.String str5 = dateTimeZone2.toString();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getName((long) (byte) 0, locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone2.isLocalDateTimeGap(localDateTime9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getShortName(3600000L, locale12);
        java.lang.String str14 = dateTimeZone2.toString();
        int int16 = dateTimeZone2.getOffsetFromLocal((long) 97);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:00" + "'", str5, "+01:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:00" + "'", str8, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:00" + "'", str13, "+01:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:00" + "'", str14, "+01:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3600000 + "'", int16 == 3600000);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone30.getName((long) 3660000, locale45);
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
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.Object obj4 = dateTimeZone0.writeReplace();
        int int6 = dateTimeZone0.getStandardOffset((long) 1);
        int int8 = dateTimeZone0.getStandardOffset((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition((long) ' ');
        boolean boolean12 = dateTimeZone9.isFixed();
        long long14 = dateTimeZone9.nextTransition((long) 1);
        java.lang.String str15 = dateTimeZone9.getID();
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone9.getShortName((-25200001L), locale17);
        java.lang.Object obj19 = dateTimeZone9.writeReplace();
        boolean boolean20 = dateTimeZone0.equals((java.lang.Object) dateTimeZone9);
        long long22 = dateTimeZone9.nextTransition((long) (-1));
        long long24 = dateTimeZone9.previousTransition(0L);
        boolean boolean25 = dateTimeZone9.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((long) 10, locale4);
        long long7 = dateTimeZone2.convertUTCToLocal(1L);
        java.lang.String str9 = dateTimeZone2.getNameKey((long) '4');
        java.lang.String str10 = dateTimeZone2.getID();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology11 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 2100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 2100000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.lang.String str5 = dateTimeZone1.getShortName((long) 1);
        int int7 = dateTimeZone1.getStandardOffset((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        long long11 = dateTimeZone1.previousTransition(358499999L);
        long long13 = dateTimeZone1.previousTransition(126000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36000000 + "'", int9 == 36000000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 358499999L + "'", long11 == 358499999L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 126000000L + "'", long13 == 126000000L);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        java.lang.String str30 = dateTimeZone27.getShortName(3600000L);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        long long5 = dateTimeZone1.convertLocalToUTC(24600010L, true);
        java.lang.String str6 = dateTimeZone1.toString();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str10 = dateTimeZone8.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider11 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider11);
        boolean boolean13 = dateTimeZone8.equals((java.lang.Object) nameProvider11);
        long long16 = dateTimeZone8.convertLocalToUTC((-1L), true);
        java.lang.String str17 = dateTimeZone8.getID();
        boolean boolean19 = dateTimeZone8.isStandardOffset((long) 1);
        java.util.TimeZone timeZone20 = dateTimeZone8.toTimeZone();
        boolean boolean21 = dateTimeZone1.equals((java.lang.Object) dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 24600010L + "'", long5 == 24600010L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(nameProvider11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 2100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 2100000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.035");
        int int3 = dateTimeZone1.getOffset(360599966L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName(3540000L, locale4);
        java.lang.String str7 = dateTimeZone0.getName(4199965L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone4.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone4.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone9.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone13.previousTransition((long) ' ');
        java.lang.String str16 = dateTimeZone13.getID();
        java.lang.Object obj17 = dateTimeZone13.writeReplace();
        boolean boolean18 = dateTimeZone9.equals((java.lang.Object) dateTimeZone13);
        boolean boolean19 = dateTimeZone4.equals((java.lang.Object) dateTimeZone13);
        long long21 = dateTimeZone4.convertUTCToLocal(25200010L);
        long long23 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (long) (-1));
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
        java.lang.String str41 = dateTimeZone34.toString();
        long long43 = dateTimeZone4.getMillisKeepLocal(dateTimeZone34, (long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology44 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky "42) test0427(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36000000 + "'", int6 == 36000000);
// flaky "41) test0427(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky "36) test0427(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky "25) test0427(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 61200010L + "'", long21 == 61200010L);
// flaky "19) test0427(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-36000000L) + "'", long23 == (-36000000L));
        org.junit.Assert.assertNotNull(dateTimeZone25);
// flaky "7) test0427(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36000000 + "'", int27 == 36000000);
// flaky "7) test0427(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
// flaky "6) test0427(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTC" + "'", str41, "UTC");
// flaky "4) test0427(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 36000100L + "'", long43 == 36000100L);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone0.getName((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone13.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str3 = dateTimeZone1.getShortName((long) (-3600000));
        java.lang.String str5 = dateTimeZone1.getNameKey((long) (byte) 100);
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:00" + "'", str3, "+10:00");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+10:00" + "'", str7, "+10:00");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        int int22 = dateTimeZone0.getOffsetFromLocal(387300010L);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forID("+10:00");
        int int4 = dateTimeZone2.getOffsetFromLocal((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology5 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str20 = dateTimeZone18.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider21 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider21);
        boolean boolean23 = dateTimeZone18.equals((java.lang.Object) nameProvider21);
        long long26 = dateTimeZone18.convertLocalToUTC((-1L), true);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone18.isLocalDateTimeGap(localDateTime27);
        boolean boolean29 = dateTimeZone4.equals((java.lang.Object) dateTimeZone18);
        java.lang.String str30 = dateTimeZone18.toString();
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
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertNotNull(nameProvider21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        int int28 = dateTimeZone1.getOffset(387300010L);
        int int30 = dateTimeZone1.getOffset((long) 25200000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str33 = dateTimeZone1.getName((-36000000L));
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.001" + "'", str33, "+00:00:00.001");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        long long8 = dateTimeZone0.previousTransition(60032L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60032L + "'", long8 == 60032L);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        boolean boolean10 = dateTimeZone9.isFixed();
        java.lang.String str12 = dateTimeZone9.getName((long) 126000000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25199999L + "'", long3 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 2100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 2100000");
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
        java.lang.Object obj24 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
// flaky "43) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+100:35" + "'", str9, "+100:35");
// flaky "42) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+100:35" + "'", str12, "+100:35");
// flaky "37) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-336899990L) + "'", long15 == (-336899990L));
// flaky "26) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 362100000 + "'", int17 == 362100000);
// flaky "20) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 362100000 + "'", int19 == 362100000);
// flaky "8) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 362100000 + "'", int21 == 362100000);
// flaky "8) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 362100000 + "'", int23 == 362100000);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) 'a', locale8);
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) 25200000);
        boolean boolean12 = dateTimeZone1.isFixed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        long long8 = dateTimeZone1.nextTransition((long) '4');
        long long10 = dateTimeZone1.convertUTCToLocal((long) (short) -1);
        java.lang.String str12 = dateTimeZone1.getNameKey(0L);
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "44) test0440(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 362100000 + "'", int3 == 362100000);
// flaky "43) test0440(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 362100000 + "'", int5 == 362100000);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky "38) test0440(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+:0:35");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
// flaky "27) test0440(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 362099999L + "'", long10 == 362099999L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        java.lang.Object obj25 = null;
        boolean boolean26 = dateTimeZone1.equals(obj25);
        java.lang.Class<?> wildcardClass27 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "45) test0441(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 362100000 + "'", int5 == 362100000);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "44) test0441(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 387300010L + "'", long20 == 387300010L);
// flaky "39) test0441(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-362100000L) + "'", long22 == (-362100000L));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.Object obj4 = dateTimeZone0.writeReplace();
        int int6 = dateTimeZone0.getStandardOffset((long) 1);
        java.lang.String str7 = dateTimeZone0.getID();
        java.lang.String str9 = dateTimeZone0.getName((long) 360000000);
        long long11 = dateTimeZone0.nextTransition(599965L);
        java.lang.Object obj12 = dateTimeZone0.writeReplace();
        long long14 = dateTimeZone0.convertUTCToLocal((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 599965L + "'", long11 == 599965L);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        long long24 = dateTimeZone22.previousTransition((long) ' ');
        java.lang.String str25 = dateTimeZone22.getID();
        java.lang.String str27 = dateTimeZone22.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = dateTimeZone22.getOffset(readableInstant28);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone22.getName((long) (byte) -1, locale31);
        int int34 = dateTimeZone22.getOffsetFromLocal((long) (byte) 100);
        long long37 = dateTimeZone22.convertLocalToUTC((long) (byte) 1, false);
        boolean boolean38 = dateTimeZone22.isFixed();
        boolean boolean39 = dateTimeZone22.isFixed();
        boolean boolean40 = dateTimeZone0.equals((java.lang.Object) boolean39);
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
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 115260000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115260000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 10, false);
        boolean boolean10 = dateTimeZone0.equals((java.lang.Object) '#');
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone12.isLocalDateTimeGap(localDateTime13);
        boolean boolean15 = dateTimeZone0.equals((java.lang.Object) localDateTime13);
        java.lang.String str17 = dateTimeZone0.getShortName(25200010L);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone0.isLocalDateTimeGap(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone2.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone2.isLocalDateTimeGap(localDateTime5);
        java.util.TimeZone timeZone7 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        boolean boolean11 = dateTimeZone10.isFixed();
        int int13 = dateTimeZone10.getOffset((-600000L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology14 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 25199999L + "'", long4 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        long long5 = dateTimeZone0.convertUTCToLocal(401700035L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 401700035L + "'", long5 == 401700035L);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long4 = dateTimeZone2.nextTransition((long) '4');
        java.lang.String str5 = dateTimeZone2.toString();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getName((long) (byte) 0, locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone2.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone2.convertUTCToLocal((-1L));
        boolean boolean13 = dateTimeZone2.isFixed();
        java.lang.String str15 = dateTimeZone2.getShortName((long) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:00" + "'", str5, "+01:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:00" + "'", str8, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3599999L + "'", long12 == 3599999L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+01:00" + "'", str15, "+01:00");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 100, true);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) 1, locale10);
        java.lang.String str13 = dateTimeZone0.getName(387300010L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        long long16 = dateTimeZone14.previousTransition((long) ' ');
        boolean boolean17 = dateTimeZone14.isFixed();
        long long19 = dateTimeZone14.nextTransition((long) 1);
        java.lang.String str21 = dateTimeZone14.getName((long) ' ');
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone14.getShortName(25200035L, locale23);
        java.lang.String str25 = dateTimeZone14.toString();
        long long28 = dateTimeZone14.convertLocalToUTC(115260100L, true);
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
        long long44 = dateTimeZone14.getMillisKeepLocal(dateTimeZone33, 3600000L);
        java.lang.String str46 = dateTimeZone14.getShortName(52L);
        org.joda.time.LocalDateTime localDateTime47 = null;
        boolean boolean48 = dateTimeZone14.isLocalDateTimeGap(localDateTime47);
        long long50 = dateTimeZone14.nextTransition((long) 3600000);
        boolean boolean51 = dateTimeZone0.equals((java.lang.Object) dateTimeZone14);
        int int53 = dateTimeZone0.getOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 115260100L + "'", long28 == 115260100L);
        org.junit.Assert.assertNotNull(dateTimeZone30);
// flaky "46) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
// flaky "45) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 35L + "'", long42 == 35L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 3600000L + "'", long44 == 3600000L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 3600000L + "'", long50 == 3600000L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(10);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(3600003L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone2.getOffset(readableInstant6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        int int13 = dateTimeZone9.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone14 = dateTimeZone9.toTimeZone();
        long long16 = dateTimeZone9.nextTransition((long) '4');
        long long18 = dateTimeZone9.convertUTCToLocal((long) (short) -1);
        long long20 = dateTimeZone9.nextTransition((long) 25200000);
        long long22 = dateTimeZone2.getMillisKeepLocal(dateTimeZone9, 0L);
        long long24 = dateTimeZone2.convertUTCToLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        boolean boolean27 = dateTimeZone25.equals((java.lang.Object) "");
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone25.getName(10L, locale29);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long34 = dateTimeZone25.getMillisKeepLocal(dateTimeZone32, (long) (short) 0);
        int int36 = dateTimeZone32.getStandardOffset(100L);
        long long38 = dateTimeZone32.convertUTCToLocal((-362100000L));
        long long40 = dateTimeZone2.getMillisKeepLocal(dateTimeZone32, 362100035L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology41 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky "47) test0451(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "46) test0451(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky "40) test0451(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
// flaky "28) test0451(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200000L + "'", long20 == 25200000L);
// flaky "21) test0451(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 36000000L + "'", long22 == 36000000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 36000000L + "'", long24 == 36000000L);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 3600000L + "'", long34 == 3600000L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-3600000) + "'", int36 == (-3600000));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-365700000L) + "'", long38 == (-365700000L));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 401700035L + "'", long40 == 401700035L);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        long long26 = dateTimeZone1.convertLocalToUTC(50400010L, false);
        java.lang.Object obj27 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "48) test0452(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
// flaky "47) test0452(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
// flaky "41) test0452(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
// flaky "29) test0452(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25200010L + "'", long15 == 25200010L);
// flaky "22) test0452(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky "9) test0452(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky "9) test0452(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
// flaky "7) test0452(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky "5) test0452(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 50400010L + "'", long26 == 50400010L);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition(25199999L);
        int int5 = dateTimeZone1.getStandardOffset(1L);
        java.lang.String str7 = dateTimeZone1.getNameKey(25800010L);
        long long10 = dateTimeZone1.convertLocalToUTC(115260100L, false);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25199999L + "'", long3 == 25199999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115260099L + "'", long10 == 115260099L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+10:00");
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass3 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone10.getShortName((-600000L), locale19);
        long long22 = dateTimeZone10.convertUTCToLocal(24540010L);
        java.lang.Object obj23 = dateTimeZone10.writeReplace();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 24540010L + "'", long22 == 24540010L);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long3 = dateTimeZone1.nextTransition((long) 'a');
        java.lang.Object obj4 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone5.previousTransition((long) ' ');
        java.lang.String str8 = dateTimeZone5.getID();
        java.lang.String str10 = dateTimeZone5.getShortName((long) (short) 0);
        long long13 = dateTimeZone5.convertLocalToUTC((long) (byte) 100, true);
        java.lang.String str14 = dateTimeZone5.getID();
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-34L));
        java.lang.Class<?> wildcardClass17 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 359999966L + "'", long16 == 359999966L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone5.previousTransition((long) ' ');
        java.lang.String str8 = dateTimeZone5.getID();
        java.lang.Object obj9 = dateTimeZone5.writeReplace();
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName(100L, locale12);
        long long16 = dateTimeZone1.convertLocalToUTC((long) (short) 10, false);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone1.getOffset(readableInstant17);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str20 = dateTimeZone1.toString();
        java.lang.String str22 = dateTimeZone1.getShortName((long) (byte) 1);
        long long25 = dateTimeZone1.convertLocalToUTC(25200035L, false);
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone1.isLocalDateTimeGap(localDateTime26);
        long long29 = dateTimeZone1.convertUTCToLocal(10L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology30 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 25200035L + "'", long25 == 25200035L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone14.isLocalDateTimeGap(localDateTime15);
        java.lang.String str17 = dateTimeZone14.toString();
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
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 362100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 362100000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.097");
        boolean boolean3 = dateTimeZone1.isStandardOffset(96L);
        java.lang.String str5 = dateTimeZone1.getShortName(599965L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.097" + "'", str5, "+00:00:00.097");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getStandardOffset((long) 25200000);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        long long10 = dateTimeZone7.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone11.previousTransition((long) ' ');
        java.lang.String str14 = dateTimeZone11.getID();
        java.lang.Object obj15 = dateTimeZone11.writeReplace();
        boolean boolean16 = dateTimeZone7.equals((java.lang.Object) dateTimeZone11);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone7.getName(100L, locale18);
        long long22 = dateTimeZone7.convertLocalToUTC((long) (short) 10, false);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-362100000L));
        boolean boolean26 = dateTimeZone7.isStandardOffset(3599999L);
        java.lang.Class<?> wildcardClass27 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-362100000L) + "'", long24 == (-362100000L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(3660000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone3.previousTransition((long) ' ');
        boolean boolean6 = dateTimeZone3.isFixed();
        long long8 = dateTimeZone3.nextTransition((long) 1);
        long long11 = dateTimeZone3.convertLocalToUTC((long) (byte) 10, false);
        java.lang.Object obj12 = dateTimeZone3.writeReplace();
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone3, (long) (byte) 100);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone3.getShortName(3540001L, locale16);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115260100L + "'", long14 == 115260100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.Object obj8 = dateTimeZone4.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone4);
        boolean boolean11 = dateTimeZone0.isStandardOffset(25200035L);
        int int13 = dateTimeZone0.getOffsetFromLocal((long) (byte) 10);
        java.lang.String str14 = dateTimeZone0.toString();
        boolean boolean16 = dateTimeZone0.equals((java.lang.Object) (byte) 1);
        long long18 = dateTimeZone0.previousTransition(21600009L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 21600009L + "'", long18 == 21600009L);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.Chronology chronology0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str4 = dateTimeZone2.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider5 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider5);
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) nameProvider5);
        long long10 = dateTimeZone2.convertLocalToUTC((-1L), true);
        java.lang.String str11 = dateTimeZone2.getID();
        boolean boolean13 = dateTimeZone2.isStandardOffset((long) 1);
        long long15 = dateTimeZone2.previousTransition((-3600035L));
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.lang.String str21 = dateTimeZone19.getNameKey(10L);
        long long23 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 1);
        long long25 = dateTimeZone17.nextTransition(10L);
        java.lang.String str27 = dateTimeZone17.getName(0L);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        long long31 = dateTimeZone28.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = dateTimeZone28.isLocalDateTimeGap(localDateTime32);
        long long35 = dateTimeZone17.getMillisKeepLocal(dateTimeZone28, 3599899L);
        long long37 = dateTimeZone2.getMillisKeepLocal(dateTimeZone17, 360000001L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology38 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(nameProvider5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3600035L) + "'", long15 == (-3600035L));
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 3599899L + "'", long35 == 3599899L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 360000001L + "'", long37 == 360000001L);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName((long) (byte) -1, locale9);
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (byte) 100);
        long long14 = dateTimeZone0.convertUTCToLocal(360599966L);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone0.getOffset(readableInstant15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone0.getShortName((-600000L), locale18);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 360599966L + "'", long14 == 360599966L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        java.lang.String str16 = dateTimeZone15.getID();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        long long26 = dateTimeZone1.convertLocalToUTC(50400010L, false);
        java.lang.Object obj27 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        long long30 = dateTimeZone28.previousTransition((long) ' ');
        java.lang.String str31 = dateTimeZone28.getID();
        java.lang.String str33 = dateTimeZone28.getShortName((long) (short) 0);
        long long35 = dateTimeZone28.previousTransition((long) (short) -1);
        java.util.TimeZone timeZone36 = dateTimeZone28.toTimeZone();
        java.lang.String str38 = dateTimeZone28.getShortName(100L);
        java.lang.String str39 = dateTimeZone28.toString();
        long long41 = dateTimeZone28.nextTransition((long) (short) 1);
        boolean boolean42 = dateTimeZone1.equals((java.lang.Object) (short) 1);
        java.lang.String str44 = dateTimeZone1.getShortName(151200010L);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 50400010L + "'", long26 == 50400010L);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UTC" + "'", str39, "UTC");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00" + "'", str44, "+00:00");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.Object obj4 = dateTimeZone0.writeReplace();
        int int6 = dateTimeZone0.getStandardOffset((long) 1);
        int int8 = dateTimeZone0.getStandardOffset((long) (short) -1);
        int int10 = dateTimeZone0.getOffset((long) (byte) 10);
        java.lang.String str12 = dateTimeZone0.getNameKey(97L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.nextTransition((long) 1);
        java.lang.String str7 = dateTimeZone1.getID();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-25200001L), locale9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName((long) (-3600000), locale13);
        int int16 = dateTimeZone1.getOffset(387300010L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology17 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition(25199999L);
        int int5 = dateTimeZone1.getStandardOffset(1L);
        java.lang.String str7 = dateTimeZone1.getNameKey(25800010L);
        java.lang.String str9 = dateTimeZone1.getShortName(28800010L);
        long long11 = dateTimeZone1.convertUTCToLocal((long) 360000000);
        java.lang.String str13 = dateTimeZone1.getShortName(0L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        long long16 = dateTimeZone14.previousTransition((long) ' ');
        java.lang.String str17 = dateTimeZone14.getID();
        java.lang.String str19 = dateTimeZone14.getShortName((long) (short) 0);
        boolean boolean20 = dateTimeZone1.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25199999L + "'", long3 == 25199999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 360000001L + "'", long11 == 360000001L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone22.getName((long) (byte) 0, locale26);
        long long29 = dateTimeZone22.nextTransition(388800010L);
        boolean boolean30 = dateTimeZone22.isFixed();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 388800010L + "'", long29 == 388800010L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 362100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 362100000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        int int18 = dateTimeZone1.getStandardOffset(25200009L);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.lang.String str24 = dateTimeZone22.getNameKey(10L);
        long long26 = dateTimeZone20.getMillisKeepLocal(dateTimeZone22, (long) 1);
        java.lang.String str28 = dateTimeZone20.getName((long) 0);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone20.getName(25200035L, locale30);
        long long34 = dateTimeZone20.convertLocalToUTC(25200010L, true);
        java.lang.String str35 = dateTimeZone20.toString();
        long long37 = dateTimeZone1.getMillisKeepLocal(dateTimeZone20, (-3600035L));
        java.lang.String str38 = dateTimeZone1.toString();
        long long40 = dateTimeZone1.previousTransition(362099999L);
        long long42 = dateTimeZone1.convertUTCToLocal(362100035L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 25200010L + "'", long34 == 25200010L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-3600035L) + "'", long37 == (-3600035L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UTC" + "'", str38, "UTC");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 362099999L + "'", long40 == 362099999L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 362100035L + "'", long42 == 362100035L);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        long long3 = dateTimeZone1.previousTransition((long) ' ');
        java.lang.Object obj4 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey(10L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 1);
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(25200035L, locale11);
        boolean boolean13 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName((long) (-1), locale15);
        java.lang.Class<?> wildcardClass17 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        int int31 = dateTimeZone1.getOffset(28200010L);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 0);
        long long8 = dateTimeZone0.convertLocalToUTC((long) (byte) 100, true);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) 1, locale10);
        int int13 = dateTimeZone0.getStandardOffset(10L);
        boolean boolean14 = dateTimeZone0.isFixed();
        java.lang.String str16 = dateTimeZone0.getShortName((long) '4');
        java.lang.String str17 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone4.getOffset(readableInstant5);
        java.lang.Object obj7 = dateTimeZone4.writeReplace();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology8 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
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
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        long long16 = dateTimeZone1.convertUTCToLocal((-3600035L));
        java.lang.String str17 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3600035L) + "'", long16 == (-3600035L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        long long4 = dateTimeZone2.nextTransition((long) '4');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName(3L, locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset(3600010L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:00" + "'", str7, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        boolean boolean20 = dateTimeZone0.isStandardOffset((-362100000L));
        java.lang.Class<?> wildcardClass21 = dateTimeZone0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3660000);
        java.lang.String str3 = dateTimeZone1.getName(401700035L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+01:01" + "'", str3, "+01:01");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), 600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        java.lang.String str5 = dateTimeZone3.getName(7199999L);
        long long7 = dateTimeZone3.convertUTCToLocal(395999966L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology8 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 431999966L + "'", long7 == 431999966L);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName(50400010L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        java.util.TimeZone timeZone26 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
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
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition(25199999L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        boolean boolean8 = dateTimeZone7.isFixed();
        java.lang.String str10 = dateTimeZone7.getName(3599899L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25199999L + "'", long3 == 25199999L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName((long) '4', locale6);
        long long9 = dateTimeZone1.convertUTCToLocal((long) 25200000);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        int int12 = dateTimeZone1.getOffsetFromLocal((long) (-3600000));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 25200000L + "'", long9 == 25200000L);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        java.lang.String str10 = dateTimeZone1.getID();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName((-600000L), locale12);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        boolean boolean24 = dateTimeZone2.isStandardOffset(25200035L);
        int int26 = dateTimeZone2.getOffset(25200010L);
        java.lang.Class<?> wildcardClass27 = dateTimeZone2.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3600000 + "'", int26 == 3600000);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long3 = dateTimeZone1.nextTransition((long) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long9 = dateTimeZone1.convertLocalToUTC((-1L), true);
        java.lang.String str10 = dateTimeZone1.getID();
        boolean boolean12 = dateTimeZone1.isStandardOffset((long) 1);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass14 = timeZone13.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) ' ');
        boolean boolean3 = dateTimeZone0.isFixed();
        long long5 = dateTimeZone0.nextTransition((long) 1);
        int int7 = dateTimeZone0.getOffset((long) (short) 0);
        long long10 = dateTimeZone0.convertLocalToUTC((-2L), true);
        java.lang.Class<?> wildcardClass11 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }
}
