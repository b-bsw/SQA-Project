package org.apache.commons.lang.time;

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
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (-1), false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 10, "P0Y000DT00000.0101", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0101" + "'", str5, "P0Y000DT00000.0101");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) 0, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (short) 0, "0 seconds");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0econ00" + "'", str3, "0 0econ00");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.lang.String str1 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO((long) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.097S" + "'", str1, "P0Y0M0DT0H0M0.097S");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 97, (long) ' ', "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str5, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        java.lang.String str4 = token2.toString();
        java.lang.String str5 = token2.toString();
        java.lang.String str6 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        int int9 = token8.getCount();
        java.lang.Class<?> wildcardClass10 = token8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 98, (long) 2, "P0Y000DT00000.99-2", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.99-2" + "'", str5, "P0Y000DT00000.99-2");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, 0L, "P0Y000DT00000.99-2", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.99-2" + "'", str5, "P0Y000DT00000.99-2");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 1, "P0Y0M0DT0H0M0.090S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.090-9" + "'", str5, "P0Y000DT00000.090-9");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "0 seconds");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 0econ00" + "'", str2, "0 0econ00");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str3, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "0:00:00.001", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.001" + "'", str3, "0:00:00.001");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) 10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str3, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        token4.increment();
        java.lang.String str6 = token4.toString();
        boolean boolean8 = token4.equals((java.lang.Object) 0.0f);
        int int9 = token4.getCount();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "####################################################################################################################################################################################################" + "'", str6, "####################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        java.lang.String str3 = token2.toString();
        int int4 = token2.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0M0DT0H0M0.022S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0220" + "'", str3, "P0Y000DT00000.0220");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 97, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y0M0DT0H0M0.097S" + "'", str5, "P0000Y0M0DT0H0M0.097S");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 4, "P0Y000DT00000.032-1", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.032-1" + "'", str5, "P0Y000DT00000.032-1");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 97, (long) 0, "P0Y000DT00000.99-2", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.99-2" + "'", str5, "P0Y000DT00000.99-2");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) 32, " ", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) 0, "P0Y0M0DT0H0M0.022S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.022-35" + "'", str3, "P0Y000DT00000.022-35");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0L);
        boolean boolean7 = token2.equals((java.lang.Object) token6);
        token6.increment();
        token6.increment();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 33, (long) '#', "P0Y0M0DT0H0M0.003S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0032" + "'", str5, "P0Y000DT00000.0032");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) ' ', false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj12 = token11.getValue();
        int int13 = token11.getCount();
        boolean boolean14 = token8.equals((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11, (int) (byte) 10);
        token11.increment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.lang.String str1 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO((long) 4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.004S" + "'", str1, "P0Y0M0DT0H0M0.004S");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (byte) -1, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "0:00:00.004");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.004" + "'", str2, "0:00:00.004");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 98, "0:00:00.000", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 97, "P0Y000DT00000.684");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.684" + "'", str2, "P0Y000DT00000.684");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 0, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "0:00:00.002", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.002" + "'", str3, "0:00:00.002");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (-1L), "#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        java.lang.String str3 = token2.toString();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 2);
        java.lang.Class<?> wildcardClass7 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str2, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        token2.increment();
        java.lang.String str4 = token2.toString();
        token2.increment();
        boolean boolean7 = token2.equals((java.lang.Object) "P0Y0M0DT0H0M0.098S");
        int int8 = token2.getCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11" + "'", str4, "11");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 33, "P0Y000DT00000.0032", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0032" + "'", str5, "P0Y000DT00000.0032");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.03490");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03490" + "'", str2, "P0Y000DT00000.03490");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 33, "P0000Y000DT00000.000-90", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.000-90" + "'", str3, "P0000Y000DT00000.000-90");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        boolean boolean6 = token2.equals((java.lang.Object) (byte) 100);
        int int7 = token2.getCount();
        java.lang.Object obj8 = token2.getValue();
        java.lang.String str9 = token2.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "4", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.02598", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02598" + "'", str3, "P0Y000DT00000.02598");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 97, "P0Y0M0DT0H0M0.035S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03565" + "'", str5, "P0Y000DT00000.03565");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0000Y0M0DT0H0M0.097S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.09710" + "'", str2, "P0000Y000DT00000.09710");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        java.lang.String str3 = token2.toString();
        java.lang.String str4 = token2.toString();
        java.lang.Object obj5 = token2.getValue();
        java.lang.Class<?> wildcardClass6 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.7510", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.7510" + "'", str3, "P0Y000DT00000.7510");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = token2.getValue();
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        boolean boolean9 = token7.equals((java.lang.Object) "P0Y000DT00000.6734");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 33, "P0Y000DT00000.090-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.090-1" + "'", str3, "P0Y000DT00000.090-1");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 10, "P0Y000DT00000.0311");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0311" + "'", str3, "P0Y000DT00000.0311");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 0L, "1010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1010" + "'", str3, "1010");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        int int9 = token8.getCount();
        java.lang.String str10 = token8.toString();
        java.lang.String str11 = token8.toString();
        java.lang.Class<?> wildcardClass12 = token8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str10, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str11, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj12 = token11.getValue();
        int int13 = token11.getCount();
        boolean boolean14 = token8.equals((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        boolean boolean5 = token1.equals((java.lang.Object) "P0Y000DT00000.7510");
        java.lang.String str6 = token1.toString();
        java.lang.Object obj7 = token1.getValue();
        java.lang.Class<?> wildcardClass8 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass8);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass8, (int) '4');
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "###" + "'", str6, "###");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.100-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.100-1" + "'", str2, "P0Y000DT00000.100-1");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y0M0DT0H0M0.99S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.99100" + "'", str3, "P0Y000DT00000.99100");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 2, 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.098S" + "'", str2, "P0Y0M0DT0H0M0.098S");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 34, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 34, 10L, "P0Y0M0DT0H0M0.90S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.90-24" + "'", str5, "P0Y000DT00000.90-24");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 4, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        java.lang.String str5 = token2.toString();
        boolean boolean7 = token2.equals((java.lang.Object) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = token8.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 32, "P0Y000DT00000.0035");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0035" + "'", str2, "P0Y000DT00000.0035");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj12 = token11.getValue();
        int int13 = token11.getCount();
        boolean boolean14 = token8.equals((java.lang.Object) token11);
        java.lang.Object obj15 = token8.getValue();
        java.lang.Class<?> wildcardClass16 = token8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "-1" + "'", obj15, "-1");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 'a', "P0Y000DT00000.02598");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02598" + "'", str3, "P0Y000DT00000.02598");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(1L, 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.009S" + "'", str2, "P0Y0M0DT0H0M0.009S");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 97, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.0032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0032" + "'", str2, "P0Y000DT00000.0032");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        int int4 = token2.getCount();
        int int5 = token2.getCount();
        java.lang.String str6 = token2.toString();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str6, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 10, "100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.0022", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0022" + "'", str3, "P0Y000DT00000.0022");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        boolean boolean5 = token1.equals((java.lang.Object) "P0Y000DT00000.7510");
        java.lang.String str6 = token1.toString();
        java.lang.Object obj7 = token1.getValue();
        java.lang.Class<?> wildcardClass8 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass8);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass8, (int) '4');
        java.lang.Object obj12 = token11.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "###" + "'", str6, "###");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.0090", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0090" + "'", str3, "P0Y000DT00000.0090");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils0 = new org.apache.commons.lang.time.DurationFormatUtils();
        java.lang.Class<?> wildcardClass1 = durationFormatUtils0.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) durationFormatUtils0, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) durationFormatUtils0, (int) (short) 0);
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils6 = new org.apache.commons.lang.time.DurationFormatUtils();
        boolean boolean7 = token5.equals((java.lang.Object) durationFormatUtils6);
        java.lang.String str8 = token5.toString();
        java.lang.Object obj9 = token5.getValue();
        java.lang.Class<?> wildcardClass10 = token5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.lang.String str1 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO((long) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.032S" + "'", str1, "P0Y0M0DT0H0M0.032S");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.05211");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.05211" + "'", str2, "P0Y000DT00000.05211");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (short) 0, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) 4, "P0Y000DT00000.902");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.902" + "'", str3, "P0Y000DT00000.902");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (-1), "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        int int8 = token7.getCount();
        boolean boolean9 = token4.equals((java.lang.Object) token7);
        java.lang.Class<?> wildcardClass10 = token4.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 34, 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.66S" + "'", str2, "P0Y0M0DT0H0M0.66S");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.09010", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09010" + "'", str3, "P0Y000DT00000.09010");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) '#', "0:00:00.001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.001" + "'", str3, "0:00:00.001");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        java.lang.String str5 = token2.toString();
        boolean boolean7 = token2.equals((java.lang.Object) (short) 10);
        java.lang.Object obj8 = token2.getValue();
        boolean boolean10 = token2.equals((java.lang.Object) "0 0a00");
        token2.increment();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.03565");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (short) 0, "false");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fal0e" + "'", str3, "fal0e");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 33, "P0Y0M0DT0H0M0.10S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1034" + "'", str3, "P0Y000DT00000.1034");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (short) -1, "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 4, (long) (short) 0, "P0Y000DT00000.9910");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9910" + "'", str3, "P0Y000DT00000.9910");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean6 = token4.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str7 = token4.toString();
        int int8 = token4.getCount();
        java.lang.String str9 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str9, (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj15 = token14.getValue();
        int int16 = token14.getCount();
        boolean boolean17 = token11.equals((java.lang.Object) token14);
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14, (int) (byte) 10);
        boolean boolean20 = token2.equals((java.lang.Object) token19);
        java.lang.Object obj21 = token19.getValue();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        int int8 = token7.getCount();
        boolean boolean9 = token4.equals((java.lang.Object) token7);
        java.lang.Object obj10 = token4.getValue();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "##");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "##");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (byte) -1, "s", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 33, "P0Y0M0DT0H0M0.098S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09833" + "'", str3, "P0Y000DT00000.09833");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 100, "P0000Y0M0DT0H0M0.000S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.0000" + "'", str3, "P0000Y000DT00000.0000");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 33, (long) '#', "P0Y0M0DT0H0M0.098S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0982" + "'", str5, "P0Y000DT00000.0982");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "1010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1010" + "'", str2, "1010");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str3 = token2.toString();
        java.lang.Class<?> wildcardClass4 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj7 = token6.getValue();
        token6.increment();
        java.lang.String str9 = token6.toString();
        java.lang.String str10 = token6.toString();
        boolean boolean11 = token1.equals((java.lang.Object) str10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean11);
        java.lang.Class<?> wildcardClass13 = token12.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str9, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 4);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean11 = token9.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str12 = token9.toString();
        int int13 = token9.getCount();
        java.lang.String str14 = token9.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str14, (int) 'a');
        int int17 = token16.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int17);
        token18.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18, 32);
        boolean boolean22 = token2.equals((java.lang.Object) 32);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 3, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 32, (long) '#', "P0Y0M0DT0H0M0.00S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.003" + "'", str5, "P0Y000DT00000.003");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0L);
        boolean boolean7 = token2.equals((java.lang.Object) token6);
        int int8 = token6.getCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 4, "4", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (short) 0, "###", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "###" + "'", str5, "###");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.068S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0680" + "'", str3, "P0Y000DT00000.0680");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.981", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.981" + "'", str3, "P0Y000DT00000.981");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y0M0DT0H0M0.67S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.67-1" + "'", str2, "P0Y000DT00000.67-1");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str5 = token2.toString();
        java.lang.Object obj6 = token2.getValue();
        int int7 = token2.getCount();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', 1);
        java.lang.Class<?> wildcardClass3 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 32, "P0Y000DT00000.002", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.002" + "'", str5, "P0Y000DT00000.002");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) 33, "P0Y0M0DT0H0M0.033S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03332" + "'", str5, "P0Y000DT00000.03332");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) -1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "0:00:00.098");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.098" + "'", str2, "0:00:00.098");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (byte) 0, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 3, (-1L), "P0Y000DT00000.9910");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9910" + "'", str3, "P0Y000DT00000.9910");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.098-6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.098-6" + "'", str2, "P0Y000DT00000.098-6");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 10, "H", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 2, "P0000Y000DT00000.010-98");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.010-98" + "'", str2, "P0000Y000DT00000.010-98");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.09833", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09833" + "'", str3, "P0Y000DT00000.09833");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 3, (long) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.96S" + "'", str2, "P0Y0M0DT0H0M0.96S");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 97, (long) ' ', "P0Y0M0DT0H0M0.36S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.36-65" + "'", str5, "P0Y000DT00000.36-65");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 2, (long) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.lang.String str1 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO((long) 2);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", str1, "P0Y0M0DT0H0M0.002S");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str3, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 100, 32);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, 10L, "P0Y000DT00000.1034");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1034" + "'", str3, "P0Y000DT00000.1034");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 33, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(100L, (long) 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.03S" + "'", str2, "P0Y0M0DT0H0M0.03S");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.098");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (short) 100, "M");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) 10, "P0Y0M0DT0H0M0.010S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.010-25" + "'", str3, "P0Y000DT00000.010-25");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.03565", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03565" + "'", str3, "P0Y000DT00000.03565");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 32, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 0, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "d", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.031-10", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.031-10" + "'", str3, "P0Y000DT00000.031-10");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 2);
        java.lang.Class<?> wildcardClass5 = token2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (byte) 10, "P0Y000DT00000.09833", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09833" + "'", str5, "P0Y000DT00000.09833");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 3, 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.97S" + "'", str2, "P0Y0M0DT0H0M0.97S");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 32, "P0Y000DT00000.003", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.003" + "'", str5, "P0Y000DT00000.003");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2, "P0Y0M0DT0H0M0.101S");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        token2.increment();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Class<?> wildcardClass6 = token5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 100, "P0Y000DT00000.990", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.990" + "'", str5, "P0Y000DT00000.990");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) '#', "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "0:00:00.032", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.032" + "'", str3, "0:00:00.032");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.91S" + "'", str2, "P0Y0M0DT0H0M0.91S");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) 98, "P0Y000DT00000.09010", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09010" + "'", str5, "P0Y000DT00000.09010");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = token2.getValue();
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 10);
        int int10 = token9.getCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) 10, "P0Y000DT00000.0032");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0032" + "'", str3, "P0Y000DT00000.0032");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj12 = token11.getValue();
        int int13 = token11.getCount();
        boolean boolean14 = token8.equals((java.lang.Object) token11);
        token8.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        java.lang.Class<?> wildcardClass17 = token8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = token2.getValue();
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.Class<?> wildcardClass9 = token8.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "0 0a00", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a00" + "'", str3, "0 0a00");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.033S" + "'", str2, "P0Y0M0DT0H0M0.033S");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str5 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, (-1));
        token4.increment();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 4, (long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.096S" + "'", str2, "P0Y0M0DT0H0M0.096S");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 100L, "####################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################################################################################################################################################" + "'", str3, "####################################################################################################################################################################################################");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 32, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        token2.increment();
        int int6 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj10 = token9.getValue();
        token9.increment();
        java.lang.String str12 = token9.toString();
        java.lang.String str13 = token9.toString();
        token9.increment();
        boolean boolean15 = token2.equals((java.lang.Object) token9);
        int int16 = token9.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str12, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str13, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.92S" + "'", str2, "P0Y0M0DT0H0M0.92S");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int2 = token1.getCount();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3);
        token4.increment();
        int int6 = token4.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int6, 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 97, (long) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.04S" + "'", str2, "P0Y0M0DT0H0M0.04S");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.990", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.990" + "'", str3, "P0Y000DT00000.990");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, 100L, "P0Y000DT00000.1033");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1033" + "'", str3, "P0Y000DT00000.1033");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (byte) 100, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "-1-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1-1" + "'", str2, "-1-1");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.09833", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09833" + "'", str3, "P0Y000DT00000.09833");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.75S", (int) (short) 1);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 10, "P0Y000DT00000.0035", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0035" + "'", str5, "P0Y000DT00000.0035");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "0:00:00.034");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.034" + "'", str2, "0:00:00.034");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (byte) 0, "", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 2, (long) (byte) -1, "P0Y0M0DT0H0M0.096S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.096-3" + "'", str3, "P0Y000DT00000.096-3");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.031S", 34);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj10 = token9.getValue();
        token9.increment();
        token9.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9, 1);
        boolean boolean15 = token6.equals((java.lang.Object) token9);
        java.lang.Object obj16 = token9.getValue();
        boolean boolean17 = token2.equals(obj16);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 33, "P0Y0M0DT0H0M0.02S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0233" + "'", str2, "P0Y000DT00000.0233");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 32, (long) 32, "P0Y000DT00000.1033");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1033" + "'", str3, "P0Y000DT00000.1033");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', 0L, "P0Y000DT00000.0531", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0531" + "'", str5, "P0Y000DT00000.0531");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0M0DT0H0M0.101S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.101100" + "'", str3, "P0Y000DT00000.101100");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.67S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.670" + "'", str2, "P0Y000DT00000.670");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) 0, "P0Y000DT00000.99-2", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.99-2" + "'", str5, "P0Y000DT00000.99-2");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.003S" + "'", str2, "P0Y0M0DT0H0M0.003S");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 98, "P0Y000DT00000.681");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.681" + "'", str2, "P0Y000DT00000.681");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass2 = token1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) 100, "0:00:00.034");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.034" + "'", str3, "0:00:00.034");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) ' ', false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.052S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05252" + "'", str3, "P0Y000DT00000.05252");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str5 = token2.toString();
        java.lang.String str6 = token2.toString();
        java.lang.Class<?> wildcardClass7 = token2.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str6, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 4, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2, "P0Y0M0DT0H0M0.011S");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (short) 0, "P0Y000DT00000.9910");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9910" + "'", str3, "P0Y000DT00000.9910");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 0, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 2, (long) ' ', "P0Y0M0DT0H0M0.053S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05330" + "'", str3, "P0Y000DT00000.05330");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj7 = token6.getValue();
        token6.increment();
        java.lang.String str9 = token6.toString();
        java.lang.String str10 = token6.toString();
        boolean boolean11 = token1.equals((java.lang.Object) str10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean11);
        java.lang.Class<?> wildcardClass14 = token13.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str9, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S");
        java.lang.Object obj2 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj2, 34);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "P0000Y0M0DT0H0M0.000S" + "'", obj2, "P0000Y0M0DT0H0M0.000S");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (-1), "P0Y000DT00000.00210");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00210" + "'", str3, "P0Y000DT00000.00210");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.0521");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0521" + "'", str2, "P0Y000DT00000.0521");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) (short) 100, "fal0e", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fal0e" + "'", str5, "fal0e");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 4, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6);
        java.lang.Object obj8 = token7.getValue();
        java.lang.Class<?> wildcardClass9 = token7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "-1" + "'", obj8, "-1");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 97, "-1-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1-1" + "'", str2, "-1-1");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 34, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 1L, "P0Y0M0DT0H0M0.68S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.68-9" + "'", str3, "P0Y000DT00000.68-9");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 0, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "##", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##" + "'", str3, "##");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100", 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 1);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y0M0DT0H0M0.00S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00100" + "'", str2, "P0Y000DT00000.00100");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.7510", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.7510" + "'", str3, "P0Y000DT00000.7510");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 34, (long) '4', "P0Y000DT00000.052-101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.052-101" + "'", str3, "P0Y000DT00000.052-101");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 32, "P0Y0M0DT0H0M0.031S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03131" + "'", str3, "P0Y000DT00000.03131");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 2, "P0Y000DT00000.67-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.67-1" + "'", str3, "P0Y000DT00000.67-1");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.022-35");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.022-35" + "'", str2, "P0Y000DT00000.022-35");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.087S" + "'", str2, "P0Y0M0DT0H0M0.087S");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 1.0f);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) 1, "P0Y000DT00000.990", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.990" + "'", str5, "P0Y000DT00000.990");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1), (int) (byte) 10);
        token2.increment();
        int int4 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.0032", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0032" + "'", str3, "P0Y000DT00000.0032");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.025S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.02510" + "'", str2, "P0Y000DT00000.02510");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.051S" + "'", str2, "P0Y0M0DT0H0M0.051S");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.002");
        java.lang.Class<?> wildcardClass2 = token1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        java.lang.Object obj3 = token2.getValue();
        java.lang.Object obj4 = token2.getValue();
        java.lang.Object obj5 = token2.getValue();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj4, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj5, "P0Y0M0DT0H0M0.002S");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 1.0d, (-1));
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 0, "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) "0:00:00.001");
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 10);
        java.lang.Class<?> wildcardClass8 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 100, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 2);
        java.lang.Class<?> wildcardClass5 = token4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.05265");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.05265" + "'", str2, "P0Y000DT00000.05265");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils0 = new org.apache.commons.lang.time.DurationFormatUtils();
        java.lang.Class<?> wildcardClass1 = durationFormatUtils0.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) durationFormatUtils0, (int) (byte) 10);
        java.lang.String str4 = token3.toString();
        boolean boolean6 = token3.equals((java.lang.Object) "P0Y000DT00000.90-24");
        boolean boolean8 = token3.equals((java.lang.Object) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 100, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.090-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.090-1" + "'", str3, "P0Y000DT00000.090-1");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) "10");
        int int6 = token2.getCount();
        int int7 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token9.increment();
        int int11 = token9.getCount();
        token9.increment();
        boolean boolean13 = token2.equals((java.lang.Object) token9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean17 = token15.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str18 = token15.toString();
        int int19 = token15.getCount();
        boolean boolean20 = token9.equals((java.lang.Object) int19);
        java.lang.String str21 = token9.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass24 = token23.getClass();
        boolean boolean25 = token9.equals((java.lang.Object) token23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1" + "'", str18, "-1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "###" + "'", str21, "###");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y0M0DT0H0M0.100S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10032" + "'", str3, "P0Y000DT00000.10032");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 100, "P0Y000DT00000.05211", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.05211" + "'", str5, "P0Y000DT00000.05211");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 32, "P0Y0M0DT0H0M0.034S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0340" + "'", str5, "P0Y000DT00000.0340");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y0M0DT0H0M0.66S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.661" + "'", str2, "P0Y000DT00000.661");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (byte) -1, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        java.lang.String str2 = token1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 0econ00" + "'", str2, "0 0econ00");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = token2.getValue();
        int int6 = token2.getCount();
        java.lang.Class<?> wildcardClass7 = token2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1);
        java.lang.Object obj2 = token1.getValue();
        java.lang.Object obj3 = token1.getValue();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (short) 1 + "'", obj2, (short) 1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 1 + "'", obj3, (short) 1);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 4, "4", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 33, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00233" + "'", str2, "P0Y000DT00000.00233");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 33, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        token1.increment();
        int int5 = token1.getCount();
        java.lang.Object obj6 = token1.getValue();
        java.lang.Object obj7 = token1.getValue();
        java.lang.String str8 = token1.toString();
        java.lang.Object obj9 = token1.getValue();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "####" + "'", str8, "####");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '#' + "'", obj9, '#');
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 10, "P0Y0M0DT0H0M0.101S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.101-90" + "'", str3, "P0Y000DT00000.101-90");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100", 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int6 = token5.getCount();
        java.lang.Class<?> wildcardClass7 = token5.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass7);
        java.lang.String str9 = token8.toString();
        boolean boolean10 = token3.equals((java.lang.Object) token8);
        java.lang.Class<?> wildcardClass11 = token8.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class org.apache.commons.lang.time.DurationFormatUtils$Token" + "'", str9, "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.09810", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09810" + "'", str3, "P0Y000DT00000.09810");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 34, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 98, "P0Y000DT00000.09810", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09810" + "'", str3, "P0Y000DT00000.09810");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (byte) -1, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "fal0e");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fal0e" + "'", str2, "fal0e");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.032S" + "'", str2, "P0Y0M0DT0H0M0.032S");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 2, (long) (byte) 100, "P0Y000DT00000.1034");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1034" + "'", str3, "P0Y000DT00000.1034");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 3, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0M0DT0H0M0.03S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0335" + "'", str2, "P0Y000DT00000.0335");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "0:00:00.032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.032" + "'", str2, "0:00:00.032");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.35S" + "'", str2, "P0Y0M0DT0H0M0.35S");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) '4', "P0Y0M0DT0H0M0.03S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0342" + "'", str3, "P0Y000DT00000.0342");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        java.lang.String str4 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int8 = token7.getCount();
        java.lang.String str9 = token7.toString();
        java.lang.String str10 = token7.toString();
        java.lang.String str11 = token7.toString();
        java.lang.Object obj12 = token7.getValue();
        boolean boolean13 = token2.equals((java.lang.Object) token7);
        java.lang.Object obj14 = token2.getValue();
        token2.increment();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 1 + "'", obj14, (short) 1);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        java.lang.Object obj3 = token2.getValue();
        java.lang.Object obj4 = token2.getValue();
        token2.increment();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj4, "P0Y0M0DT0H0M0.002S");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(10L, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        int int9 = token8.getCount();
        java.lang.Object obj10 = token8.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, 100);
        boolean boolean14 = token8.equals((java.lang.Object) token13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "-1" + "'", obj10, "-1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 97, (long) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.55S" + "'", str2, "P0Y0M0DT0H0M0.55S");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (short) 0, "P0Y000DT00000.003");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.003" + "'", str3, "P0Y000DT00000.003");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) 34, "P0Y0M0DT0H0M0.098S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09835" + "'", str3, "P0Y000DT00000.09835");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.003", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.003" + "'", str3, "P0Y000DT00000.003");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 32, (long) ' ', "P0Y000DT00000.09810", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09810" + "'", str5, "P0Y000DT00000.09810");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 33, "P0Y000DT00000.0035");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0035" + "'", str2, "P0Y000DT00000.0035");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 98, (long) 34, "P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.090-64" + "'", str3, "P0Y000DT00000.090-64");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) 33, "P0Y000DT00000.0000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0000" + "'", str3, "P0Y000DT00000.0000");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) ' ', true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 11, (long) 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.91S" + "'", str2, "P0Y0M0DT0H0M0.91S");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) 100, "P0Y0M0DT0H0M0.000S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00065" + "'", str5, "P0Y000DT00000.00065");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 33, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, 100L, "d");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) 1, "P0Y0M0DT0H0M0.048S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.048-9" + "'", str3, "P0Y000DT00000.048-9");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 32, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.05252");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.05252" + "'", str2, "P0Y000DT00000.05252");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 34, 0L, "P0Y000DT00000.00065");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00065" + "'", str3, "P0Y000DT00000.00065");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0M0DT0H0M0.022S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0220" + "'", str3, "P0Y000DT00000.0220");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        token4.increment();
        java.lang.String str6 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        int int10 = token9.getCount();
        boolean boolean11 = token4.equals((java.lang.Object) token9);
        token9.increment();
        token9.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        java.lang.Class<?> wildcardClass15 = token14.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "####################################################################################################################################################################################################" + "'", str6, "####################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.lang.String str1 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS((long) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.097" + "'", str1, "0:00:00.097");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, 0L, "P0Y000DT00000.03310");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03310" + "'", str3, "P0Y000DT00000.03310");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        token2.increment();
        int int4 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, 0L, "0:00:00.097", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.097" + "'", str5, "0:00:00.097");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 10, " ", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, (long) 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.003S" + "'", str2, "P0Y0M0DT0H0M0.003S");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 98, (long) (short) 0, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str3, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 34, 10L, "P0Y000DT00000.0020");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0020" + "'", str3, "P0Y000DT00000.0020");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 32, (long) (short) -1, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str5, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10);
        int int4 = token3.getCount();
        boolean boolean6 = token3.equals((java.lang.Object) "P0Y000DT00000.0101");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        token2.increment();
        int int6 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        token8.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        boolean boolean11 = token2.equals((java.lang.Object) token10);
        java.lang.String str12 = token10.toString();
        java.lang.Class<?> wildcardClass13 = token10.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1-1" + "'", str12, "-1-1");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (short) 0, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj12 = token11.getValue();
        int int13 = token11.getCount();
        boolean boolean14 = token8.equals((java.lang.Object) token11);
        java.lang.Object obj15 = token8.getValue();
        int int16 = token8.getCount();
        java.lang.String str17 = token8.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "-1" + "'", obj15, "-1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str17, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.lang.String str1 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS((long) 11);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.011" + "'", str1, "0:00:00.011");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0M0DT0H0M0.32S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.32100" + "'", str2, "P0Y000DT00000.32100");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 97, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 97);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj7 = token6.getValue();
        token6.increment();
        java.lang.String str9 = token6.toString();
        java.lang.String str10 = token6.toString();
        boolean boolean12 = token6.equals((java.lang.Object) "0 days");
        java.lang.Class<?> wildcardClass13 = token6.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        boolean boolean15 = token3.equals((java.lang.Object) token14);
        java.lang.Class<?> wildcardClass16 = token3.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str9, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 97, (long) 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj4 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        int int7 = token6.getCount();
        boolean boolean8 = token1.equals((java.lang.Object) token6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, (-1));
        java.lang.Object obj11 = token6.getValue();
        java.lang.Class<?> wildcardClass12 = token6.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '4' + "'", obj11, '4');
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "s", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y0M0DT0H0M0.32S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.3210" + "'", str3, "P0Y000DT00000.3210");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) "10");
        int int6 = token2.getCount();
        int int7 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token9.increment();
        int int11 = token9.getCount();
        token9.increment();
        boolean boolean13 = token2.equals((java.lang.Object) token9);
        java.lang.Class<?> wildcardClass14 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y0M0DT0H0M0.98S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.9897" + "'", str2, "P0Y000DT00000.9897");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100", 1);
        token3.increment();
        java.lang.Class<?> wildcardClass5 = token3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0000Y0M0DT0H0M0.000S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.00097" + "'", str3, "P0000Y000DT00000.00097");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) -1, "P0Y0M0DT0H0M0.051S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0510" + "'", str3, "P0Y000DT00000.0510");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.02598", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02598" + "'", str3, "P0Y000DT00000.02598");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 34, "P0Y000DT00000.03310", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03310" + "'", str3, "P0Y000DT00000.03310");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 98, (long) 4, "P0Y000DT00000.03131", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03131" + "'", str5, "P0Y000DT00000.03131");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        token4.increment();
        java.lang.String str6 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        int int10 = token9.getCount();
        boolean boolean11 = token4.equals((java.lang.Object) token9);
        token9.increment();
        token9.increment();
        java.lang.Class<?> wildcardClass14 = token9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "####################################################################################################################################################################################################" + "'", str6, "####################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 97, "P0Y0M0DT0H0M0.64S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6497" + "'", str3, "P0Y000DT00000.6497");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) '4', 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.048S" + "'", str2, "P0Y0M0DT0H0M0.048S");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 4, "P0000Y000DT00000.00097", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.00097" + "'", str3, "P0000Y000DT00000.00097");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 3, (long) 10, "P0Y000DT00000.0340", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0340" + "'", str5, "P0Y000DT00000.0340");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 98, "P0Y0M0DT0H0M0.04S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0498" + "'", str2, "P0Y000DT00000.0498");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = token2.getValue();
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        int int9 = token7.getCount();
        java.lang.Class<?> wildcardClass10 = token7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 1, "0", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 32, (long) (-1), "s", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj12 = token11.getValue();
        int int13 = token11.getCount();
        boolean boolean14 = token8.equals((java.lang.Object) token11);
        java.lang.Object obj15 = token11.getValue();
        boolean boolean17 = token11.equals((java.lang.Object) "0 0econ00");
        token11.increment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.10S" + "'", str2, "P0Y0M0DT0H0M0.10S");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.64S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6410" + "'", str3, "P0Y000DT00000.6410");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 4, (long) 32, "P0Y000DT00000.03332", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03332" + "'", str5, "P0Y000DT00000.03332");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 4, (long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.006S" + "'", str2, "P0Y0M0DT0H0M0.006S");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.05265", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05265" + "'", str3, "P0Y000DT00000.05265");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.98S" + "'", str2, "P0Y0M0DT0H0M0.98S");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0M0DT0H0M0.004S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00435" + "'", str2, "P0Y000DT00000.00435");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) "10");
        java.lang.Object obj6 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) -1 + "'", obj6, (short) -1);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        java.lang.Object obj4 = token3.getValue();
        java.lang.Class<?> wildcardClass5 = token3.getClass();
        boolean boolean6 = token1.equals((java.lang.Object) wildcardClass5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Object obj8 = token1.getValue();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '#' + "'", obj4, '#');
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6);
        java.lang.String str8 = token7.toString();
        java.lang.Object obj9 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str14 = token13.toString();
        int int15 = token13.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        int int17 = token16.getCount();
        boolean boolean18 = token10.equals((java.lang.Object) int17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "-1" + "'", obj9, "-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 5, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 34, "P0Y000DT00000.0340", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0340" + "'", str3, "P0Y000DT00000.0340");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.0233", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0233" + "'", str3, "P0Y000DT00000.0233");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 1, (int) (short) 100);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) '4');
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int2 = token1.getCount();
        token1.increment();
        boolean boolean5 = token1.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6);
        java.lang.String str8 = token7.toString();
        java.lang.Object obj9 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.String str11 = token10.toString();
        token10.increment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "-1" + "'", obj9, "-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = token2.getValue();
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        int int8 = token2.getCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.lang.String str1 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS((long) 5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.005" + "'", str1, "0:00:00.005");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean6 = token4.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj7 = token4.getValue();
        boolean boolean8 = token2.equals((java.lang.Object) token4);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 97, "P0Y000DT00000.09835");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09835" + "'", str2, "P0Y000DT00000.09835");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 33, "0:00:00.034");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.034" + "'", str2, "0:00:00.034");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 0, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        token4.increment();
        java.lang.String str6 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        int int10 = token9.getCount();
        boolean boolean11 = token4.equals((java.lang.Object) token9);
        token9.increment();
        token9.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9, 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "####################################################################################################################################################################################################" + "'", str6, "####################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.lang.String str1 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO((long) 11);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str1, "P0Y0M0DT0H0M0.011S");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S", (int) (short) -1);
        token2.increment();
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.99100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.99100" + "'", str2, "P0Y000DT00000.99100");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str3 = token1.toString();
        java.lang.String str4 = token1.toString();
        java.lang.String str5 = token1.toString();
        java.lang.Object obj6 = token1.getValue();
        java.lang.Object obj7 = token1.getValue();
        java.lang.Class<?> wildcardClass8 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + ' ' + "'", obj6, ' ');
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + ' ' + "'", obj7, ' ');
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 4, "P0Y0M0DT0H0M0.001S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0014" + "'", str3, "P0Y000DT00000.0014");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) -1, "P0Y000DT00000.00210");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00210" + "'", str3, "P0Y000DT00000.00210");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(100L, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 100, "", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 5, "P0Y000DT00000.0498", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0498" + "'", str3, "P0Y000DT00000.0498");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.02510", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02510" + "'", str3, "P0Y000DT00000.02510");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 4, (long) (short) -1, "P0Y000DT00000.03565");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03565" + "'", str3, "P0Y000DT00000.03565");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.69S" + "'", str2, "P0Y0M0DT0H0M0.69S");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 98, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 34, (long) (byte) 1, "P0Y000DT00000.00233", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00233" + "'", str5, "P0Y000DT00000.00233");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str5 = token2.toString();
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean10 = token8.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str11 = token8.toString();
        int int12 = token8.getCount();
        java.lang.String str13 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str13, (int) 'a');
        int int16 = token15.getCount();
        java.lang.String str17 = token15.toString();
        java.lang.String str18 = token15.toString();
        boolean boolean19 = token2.equals((java.lang.Object) token15);
        java.lang.Object obj20 = token15.getValue();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str17, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str18, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "-1" + "'", obj20, "-1");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.00-31");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00-31" + "'", str2, "P0Y000DT00000.00-31");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (byte) 100, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1), (int) (byte) 10);
        token2.increment();
        java.lang.Class<?> wildcardClass4 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        int int9 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int9);
        token10.increment();
        java.lang.Class<?> wildcardClass12 = token10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 11, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.lang.String str1 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS((long) 3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.003" + "'", str1, "0:00:00.003");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 32, (long) (byte) -1, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y0M0DT0H0M0.67S" + "'", str3, "P0000Y0M0DT0H0M0.67S");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj4 = token1.getValue();
        java.lang.String str5 = token1.toString();
        int int6 = token1.getCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) '#', "class org.apache.commons.lang.time.DurationFormatUtils$Token", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cla0 org.apache.co0on0.lang.ti0e.DurationForatUtil0$Token" + "'", str5, "cla0 org.apache.co0on0.lang.ti0e.DurationForatUtil0$Token");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 'a', "P0Y0M0DT0H0M0.02S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0298" + "'", str3, "P0Y000DT00000.0298");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.9910");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.9910" + "'", str2, "P0Y000DT00000.9910");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.0335", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0335" + "'", str3, "P0Y000DT00000.0335");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (-1L), "P0Y000DT00000.90-24", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.90-24" + "'", str5, "P0Y000DT00000.90-24");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "false", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fal0e" + "'", str3, "fal0e");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, 0L, "P0Y000DT00000.6410");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6410" + "'", str3, "P0Y000DT00000.6410");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (byte) 1, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 11, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        java.lang.Object obj5 = token4.getValue();
        int int6 = token4.getCount();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "##");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "##");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.lang.String str1 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO((long) 5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.005S" + "'", str1, "P0Y0M0DT0H0M0.005S");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 100, 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.00S" + "'", str2, "P0Y0M0DT0H0M0.00S");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        java.lang.String str3 = token2.toString();
        java.lang.String str4 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.47S" + "'", str2, "P0Y0M0DT0H0M0.47S");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2, "P0Y0M0DT0H0M0.101S");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) 1, "P0Y0M0DT0H0M0.052S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.052-99" + "'", str5, "P0Y000DT00000.052-99");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        int int6 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str3 = token2.toString();
        int int4 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj6 = token5.getValue();
        java.lang.Class<?> wildcardClass7 = token5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "10");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.03332");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03332" + "'", str2, "P0Y000DT00000.03332");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 33, (long) (byte) 1, "P0Y000DT00000.0090");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0090" + "'", str3, "P0Y000DT00000.0090");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(1L, (long) 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.031S" + "'", str2, "P0Y0M0DT0H0M0.031S");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) -1, "0:00:00.99");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.99" + "'", str3, "0:00:00.99");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (byte) 1, "P0Y000DT00000.750");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.750" + "'", str3, "P0Y000DT00000.750");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) 33, "S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-67" + "'", str5, "-67");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 33, "0:00:00.011");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.011" + "'", str3, "0:00:00.011");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) 98, "P0Y000DT00000.00210", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00210" + "'", str5, "P0Y000DT00000.00210");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.00-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00-1" + "'", str3, "P0Y000DT00000.00-1");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1);
        int int2 = token1.getCount();
        java.lang.String str3 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 11, (long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.089S" + "'", str2, "P0Y0M0DT0H0M0.089S");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (byte) -1, "P0Y0M0DT0H0M0.101S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.1010" + "'", str5, "P0Y000DT00000.1010");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(10L, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 11, "P0000Y000DT00000.000-90");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.000-90" + "'", str2, "P0000Y000DT00000.000-90");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.990", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.990" + "'", str3, "P0Y000DT00000.990");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils0 = new org.apache.commons.lang.time.DurationFormatUtils();
        java.lang.Class<?> wildcardClass1 = durationFormatUtils0.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) durationFormatUtils0, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) durationFormatUtils0, (int) (short) 0);
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils6 = new org.apache.commons.lang.time.DurationFormatUtils();
        boolean boolean7 = token5.equals((java.lang.Object) durationFormatUtils6);
        java.lang.String str8 = token5.toString();
        java.lang.Object obj9 = token5.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj9);
        token10.increment();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 3, (-1L), "P0Y000DT00000.090-9");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.090-9" + "'", str3, "P0Y000DT00000.090-9");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "0 0econ00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 0econ00" + "'", str2, "0 0econ00");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.lang.String str1 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO((long) 3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.003S" + "'", str1, "P0Y0M0DT0H0M0.003S");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.750");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.750" + "'", str2, "P0Y000DT00000.750");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.022-35", 0);
        java.lang.Object obj3 = token2.getValue();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y000DT00000.022-35" + "'", obj3, "P0Y000DT00000.022-35");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.72S" + "'", str2, "P0Y0M0DT0H0M0.72S");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 10, "P0Y0M0DT0H0M0.089S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0899" + "'", str5, "P0Y000DT00000.0899");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 4, (long) 98, "P0Y0M0DT0H0M0.32S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.3294" + "'", str5, "P0Y000DT00000.3294");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj8 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.String str10 = token7.toString();
        boolean boolean11 = token2.equals((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Class<?> wildcardClass13 = token2.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        java.lang.String str4 = token2.toString();
        java.lang.String str5 = token2.toString();
        java.lang.Object obj6 = token2.getValue();
        int int7 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 32, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 98, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 34, (long) 33, "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.01S" + "'", str2, "P0Y0M0DT0H0M0.01S");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "0:00:00.032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.032" + "'", str2, "0:00:00.032");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 10, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', 10L, "P0Y0M0DT0H0M0.089S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.089-87" + "'", str5, "P0Y000DT00000.089-87");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', 1);
        int int3 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "0:00:00.99", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.99" + "'", str3, "0:00:00.99");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = token2.getValue();
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        int int8 = token7.getCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 34, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) "0:00:00.001");
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 10);
        java.lang.String str8 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 32, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean13 = token11.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14);
        boolean boolean16 = token8.equals((java.lang.Object) token15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 11, 100L, "#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.0000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0000" + "'", str2, "P0Y000DT00000.0000");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "0:00:00.001", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.001" + "'", str3, "0:00:00.001");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "0:00:00.033");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.033" + "'", str2, "0:00:00.033");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 97, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 3, "P0Y000DT00000.05330", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05330" + "'", str3, "P0Y000DT00000.05330");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.0335");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0335" + "'", str2, "P0Y000DT00000.0335");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 2, "P0Y000DT00000.75100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.75100" + "'", str3, "P0Y000DT00000.75100");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.04S" + "'", str2, "P0Y0M0DT0H0M0.04S");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        token1.increment();
        int int5 = token1.getCount();
        java.lang.Object obj6 = token1.getValue();
        java.lang.Object obj7 = token1.getValue();
        java.lang.String str8 = token1.toString();
        int int9 = token1.getCount();
        java.lang.Class<?> wildcardClass10 = token1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "####" + "'", str8, "####");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int6 = token5.getCount();
        java.lang.String str7 = token5.toString();
        java.lang.String str8 = token5.toString();
        java.lang.String str9 = token5.toString();
        boolean boolean10 = token2.equals((java.lang.Object) token5);
        java.lang.String str11 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        boolean boolean16 = token14.equals((java.lang.Object) (-1.0d));
        int int17 = token14.getCount();
        java.lang.Class<?> wildcardClass18 = token14.getClass();
        boolean boolean19 = token2.equals((java.lang.Object) wildcardClass18);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str11, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        token2.increment();
        java.lang.String str4 = token2.toString();
        token2.increment();
        boolean boolean7 = token2.equals((java.lang.Object) "P0Y0M0DT0H0M0.098S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int10 = token9.getCount();
        java.lang.Class<?> wildcardClass11 = token9.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass11);
        boolean boolean14 = token2.equals((java.lang.Object) token13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11" + "'", str4, "11");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 34, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) 2, "P0Y0M0DT0H0M0.01S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.013" + "'", str5, "P0Y000DT00000.013");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass2 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "11");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11" + "'", str2, "11");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.05330", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05330" + "'", str3, "P0Y000DT00000.05330");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100", 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100", 2);
        token5.increment();
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 5, "P0Y000DT00000.00435");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00435" + "'", str2, "P0Y000DT00000.00435");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 33, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 97);
        java.lang.Object obj4 = token3.getValue();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 97 + "'", obj4, 97);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.09833");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09833" + "'", str2, "P0Y000DT00000.09833");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        int int9 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int9);
        token10.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10, 32);
        java.lang.Object obj14 = token10.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 97 + "'", obj14, 97);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 11, (long) (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.88S" + "'", str2, "P0Y0M0DT0H0M0.88S");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str4 = token3.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 33);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str4, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 5, (long) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.092S" + "'", str2, "P0Y0M0DT0H0M0.092S");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.0531", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0531" + "'", str3, "P0Y000DT00000.0531");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        java.lang.Object obj4 = token3.getValue();
        java.lang.Class<?> wildcardClass5 = token3.getClass();
        boolean boolean6 = token1.equals((java.lang.Object) wildcardClass5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        token7.increment();
        token7.increment();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '#' + "'", obj4, '#');
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "m");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj4 = token1.getValue();
        boolean boolean6 = token1.equals((java.lang.Object) "-1");
        token1.increment();
        java.lang.Object obj8 = token1.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, 0L, "####################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################################################################################################################################################" + "'", str3, "####################################################################################################################################################################################################");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 33, "P0Y0M0DT0H0M0.100S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.10033" + "'", str5, "P0Y000DT00000.10033");
    }
}

