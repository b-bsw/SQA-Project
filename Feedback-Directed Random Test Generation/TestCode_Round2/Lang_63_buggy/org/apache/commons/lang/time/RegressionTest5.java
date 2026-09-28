package org.apache.commons.lang.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, 0L, "P0Y000DT00000.031-10", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.031-10" + "'", str5, "P0Y000DT00000.031-10");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        java.lang.String str4 = token2.toString();
        java.lang.String str5 = token2.toString();
        java.lang.String str6 = token2.toString();
        token2.increment();
        java.lang.String str8 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 4);
        token2.increment();
        java.lang.String str12 = token2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11" + "'", str8, "11");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "111" + "'", str12, "111");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str7 = token6.toString();
        boolean boolean8 = token2.equals((java.lang.Object) str7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 98);
        token2.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (-1));
        token4.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean9 = token7.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str10 = token7.toString();
        int int11 = token7.getCount();
        java.lang.String str12 = token7.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str12);
        int int14 = token13.getCount();
        java.lang.String str15 = token13.toString();
        boolean boolean16 = token4.equals((java.lang.Object) token13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1" + "'", str15, "-1");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
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
        int int15 = token8.getCount();
        java.lang.Object obj16 = token8.getValue();
        token8.increment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "-1" + "'", obj16, "-1");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ');
        int int4 = token3.getCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 11, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 4, (long) 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.028S" + "'", str2, "P0Y0M0DT0H0M0.028S");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.0097", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0097" + "'", str3, "P0Y000DT00000.0097");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        java.lang.String str17 = token9.toString();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str12, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str13, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str17, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str4 = token1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#" + "'", str4, "#");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.011S", 3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ', (int) (short) -1);
        int int6 = token5.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int6);
        boolean boolean8 = token2.equals((java.lang.Object) token7);
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 10);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        java.lang.String str16 = token15.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str20 = token19.toString();
        boolean boolean21 = token15.equals((java.lang.Object) str20);
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean25 = token23.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        boolean boolean26 = token15.equals((java.lang.Object) token23);
        java.lang.Object obj27 = token23.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token28 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token23);
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token28);
        java.lang.Class<?> wildcardClass30 = token28.getClass();
        boolean boolean31 = token2.equals((java.lang.Object) token28);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011S" + "'", str9, "P0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011S");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10" + "'", str20, "10");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 34, (long) 4, "P0Y000DT00000.03310");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03310" + "'", str3, "P0Y000DT00000.03310");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.011S", 3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        java.lang.String str7 = token6.toString();
        boolean boolean8 = token2.equals((java.lang.Object) token6);
        token2.increment();
        java.lang.Object obj10 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str7, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", obj10, "P0Y0M0DT0H0M0.011S");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int6 = token5.getCount();
        java.lang.String str7 = token5.toString();
        java.lang.String str8 = token5.toString();
        java.lang.String str9 = token5.toString();
        boolean boolean10 = token2.equals((java.lang.Object) token5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean14 = token12.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj15 = token12.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        int int18 = token17.getCount();
        boolean boolean19 = token12.equals((java.lang.Object) token17);
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token17, (-1));
        boolean boolean22 = token2.equals((java.lang.Object) token17);
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj24 = token23.getValue();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S");
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S", (int) (short) -1);
        boolean boolean6 = token1.equals((java.lang.Object) (short) -1);
        token1.increment();
        java.lang.String str8 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str8, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = token10.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0000Y0M0DT0H0M0.000SP0000Y0M0DT0H0M0.000SP0000Y0M0DT0H0M0.000S" + "'", str8, "P0000Y0M0DT0H0M0.000SP0000Y0M0DT0H0M0.000SP0000Y0M0DT0H0M0.000S");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (-1.0d));
        int int5 = token2.getCount();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token8.increment();
        token8.increment();
        boolean boolean12 = token8.equals((java.lang.Object) "P0Y000DT00000.7510");
        java.lang.String str13 = token8.toString();
        java.lang.Class<?> wildcardClass14 = token8.getClass();
        boolean boolean15 = token2.equals((java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = token2.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "###" + "'", str13, "###");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '#' + "'", obj16, '#');
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        token1.increment();
        java.lang.String str3 = token1.toString();
        java.lang.String str4 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token6.increment();
        int int8 = token6.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        token6.increment();
        boolean boolean11 = token1.equals((java.lang.Object) token6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-1" + "'", str3, "-1-1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1-1" + "'", str4, "-1-1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj5 = token4.getValue();
        java.lang.String str6 = token4.toString();
        int int7 = token4.getCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.75S" + "'", obj5, "P0Y0M0DT0H0M0.75S");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0Y0M0DT0H0M0.75S" + "'", str6, "P0Y0M0DT0H0M0.75S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str5 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        java.lang.String str9 = token8.toString();
        java.lang.Class<?> wildcardClass10 = token8.getClass();
        boolean boolean11 = token2.equals((java.lang.Object) token8);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str9, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.088S" + "'", str2, "P0Y0M0DT0H0M0.088S");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.String str9 = token7.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, (int) (short) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        boolean boolean13 = token5.equals((java.lang.Object) token12);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 100, 0);
        int int3 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        int int5 = token2.getCount();
        java.lang.Object obj6 = token2.getValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) 1, "", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str3 = token2.toString();
        token2.increment();
        java.lang.String str5 = token2.toString();
        java.lang.String str6 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1010" + "'", str5, "1010");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1010" + "'", str6, "1010");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) -1, "P0Y000DT00000.90-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.90-1" + "'", str3, "P0Y000DT00000.90-1");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str5 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ');
        java.lang.Object obj9 = token8.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj9, 11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj9, 35);
        token13.increment();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.Class<?> wildcardClass2 = token1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        int int9 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, 0);
        java.lang.Class<?> wildcardClass12 = token8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, 100L, "P0Y000DT00000.05097", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.05097" + "'", str5, "P0Y000DT00000.05097");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 97, "H", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), 0L, "P0Y0M0DT0H0M0.008S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0081" + "'", str3, "P0Y000DT00000.0081");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, (int) 'a');
        token6.increment();
        boolean boolean8 = token1.equals((java.lang.Object) token6);
        java.lang.Object obj9 = token6.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj9, (int) (short) -1);
        java.lang.String str12 = token11.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "##");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "##");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.10032", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10032" + "'", str3, "P0Y000DT00000.10032");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 1, (int) 'a');
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.011S", 3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10);
        java.lang.String str12 = token11.toString();
        boolean boolean13 = token7.equals((java.lang.Object) token11);
        boolean boolean14 = token3.equals((java.lang.Object) token11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str12, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        java.lang.Class<?> wildcardClass10 = token9.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 98, 100L, "P0Y000DT00000.08752", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.08752" + "'", str5, "P0Y000DT00000.08752");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj5 = token4.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        java.lang.String str7 = token4.toString();
        boolean boolean8 = token1.equals((java.lang.Object) token4);
        int int9 = token4.getCount();
        java.lang.Object obj10 = token4.getValue();
        token4.increment();
        java.lang.Object obj12 = token4.getValue();
        token4.increment();
        int int14 = token4.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int14);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str7, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 35, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10L);
        java.lang.Object obj19 = token18.getValue();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass20, (int) (short) -1);
        boolean boolean23 = token8.equals((java.lang.Object) token22);
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        java.lang.Object obj28 = token27.getValue();
        java.lang.Class<?> wildcardClass29 = token27.getClass();
        boolean boolean30 = token25.equals((java.lang.Object) wildcardClass29);
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token25);
        java.lang.Object obj32 = token31.getValue();
        boolean boolean33 = token22.equals((java.lang.Object) token31);
        token22.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token22);
        org.apache.commons.lang.time.DurationFormatUtils.Token token37 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token35, 0);
        java.lang.Object obj38 = token37.getValue();
        java.lang.Class<?> wildcardClass39 = token37.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10L + "'", obj19, 10L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "100");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        token2.increment();
        int int4 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int4, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str3 = token2.toString();
        int int4 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Class<?> wildcardClass6 = token5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, (int) (byte) -1);
        token3.increment();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str9, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        int int5 = token4.getCount();
        token4.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, (int) (byte) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 0, 32);
        java.lang.String str11 = token10.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00000000000000000000000000000000" + "'", str11, "00000000000000000000000000000000");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, 35);
        token8.increment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 98, (long) '4', "P0Y000DT00000.1010", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.1010" + "'", str5, "P0Y000DT00000.1010");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 11, (long) '#', "P0Y000DT00000.09834");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09834" + "'", str3, "P0Y000DT00000.09834");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 0);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (-1));
        java.lang.Object obj5 = token1.getValue();
        java.lang.Class<?> wildcardClass6 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "0 0econ00" + "'", obj5, "0 0econ00");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 35, (long) (byte) 10, "P0Y000DT00000.041");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.041" + "'", str3, "P0Y000DT00000.041");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str5 = token2.toString();
        int int6 = token2.getCount();
        java.lang.String str7 = token2.toString();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str7, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(1L, (long) 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.004S" + "'", str2, "P0Y0M0DT0H0M0.004S");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "false", 34);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 34, (int) '4');
        token4.increment();
        int int6 = token4.getCount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681" + "'", str2, "P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681P0Y000DT00000.0681");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        int int14 = token10.getCount();
        java.lang.Object obj15 = token10.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 97 + "'", obj15, 97);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.09833");
        java.lang.Class<?> wildcardClass2 = token1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 4, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        java.lang.Object obj4 = token3.getValue();
        java.lang.Class<?> wildcardClass5 = token3.getClass();
        boolean boolean6 = token1.equals((java.lang.Object) wildcardClass5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Object obj8 = token1.getValue();
        boolean boolean10 = token1.equals((java.lang.Object) 10.0d);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 0);
        java.lang.Object obj13 = token12.getValue();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '#' + "'", obj4, '#');
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "100");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 53, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 97, (long) (short) 100, "100.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100.0" + "'", str3, "100.0");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 33, "P0Y0M0DT0H0M0.75SP0Y0M0DT0H0M0.75S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.7533P0Y000DT00000.7533" + "'", str2, "P0Y000DT00000.7533P0Y000DT00000.7533");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 52, "P0Y000DT00000.10032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.10032" + "'", str2, "P0Y000DT00000.10032");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int5 = token4.getCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 32, (long) (byte) 100, "P0Y000DT00000.3294");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.3294" + "'", str3, "P0Y000DT00000.3294");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.67-1", (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1.0d));
        int int5 = token4.getCount();
        boolean boolean6 = token2.equals((java.lang.Object) int5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        token1.increment();
        java.lang.String str5 = token1.toString();
        int int6 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int6);
        java.lang.String str8 = token7.toString();
        boolean boolean10 = token7.equals((java.lang.Object) "0:00:00.032");
        java.lang.Class<?> wildcardClass11 = token7.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "####" + "'", str5, "####");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4" + "'", str8, "4");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 98, "1111111111", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111111" + "'", str3, "1111111111");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 11, (long) 98, "P0Y0M0DT0H0M0.02S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0287" + "'", str3, "P0Y000DT00000.0287");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, 10);
        int int10 = token9.getCount();
        java.lang.String str11 = token9.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1-1-1-1-1-1-1-1-1-1" + "'", str11, "-1-1-1-1-1-1-1-1-1-1");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        boolean boolean11 = token7.equals((java.lang.Object) (byte) 100);
        int int12 = token7.getCount();
        boolean boolean14 = token7.equals((java.lang.Object) "d");
        boolean boolean15 = token2.equals((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.Class<?> wildcardClass17 = token7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 10, (int) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 0);
        token4.increment();
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.031S", 34);
        java.lang.Object obj3 = null;
        boolean boolean4 = token2.equals(obj3);
        java.lang.Object obj5 = token2.getValue();
        int int6 = token2.getCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.031S" + "'", obj5, "P0Y0M0DT0H0M0.031S");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) '#', "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y0M0DT0H0M0.036S" + "'", str5, "P0000Y0M0DT0H0M0.036S");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 2);
        token2.increment();
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) 3, "P0Y0M0DT0H0M0.75S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.753" + "'", str3, "P0Y000DT00000.753");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str3 = token1.toString();
        java.lang.String str4 = token1.toString();
        java.lang.String str5 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 4, 100L, "P0Y000DT00000.10032");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10032" + "'", str3, "P0Y000DT00000.10032");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 1, (int) (short) 100);
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        int int5 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) '4');
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 1 + "'", obj3, (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 52, (long) (short) 10, "P0Y000DT00000.0001P0Y000DT00000.0001", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0001P0Y000DT00000.0001" + "'", str5, "P0Y000DT00000.0001P0Y000DT00000.0001");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.02351");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.02351" + "'", str2, "P0Y000DT00000.02351");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 97, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        java.lang.Object obj2 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean9 = token7.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0L);
        boolean boolean12 = token7.equals((java.lang.Object) token11);
        java.lang.Class<?> wildcardClass13 = token7.getClass();
        boolean boolean14 = token1.equals((java.lang.Object) wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + '4' + "'", obj2, '4');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0M0DT0H0M0.12S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.120" + "'", str3, "P0Y000DT00000.120");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        java.lang.String str9 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        token15.increment();
        java.lang.String str17 = token15.toString();
        token15.increment();
        boolean boolean19 = token12.equals((java.lang.Object) token15);
        java.lang.String str20 = token12.toString();
        java.lang.String str21 = token12.toString();
        boolean boolean22 = token8.equals((java.lang.Object) token12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str9, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "11" + "'", str17, "11");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10" + "'", str20, "10");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10" + "'", str21, "10");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (-1));
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token7.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, (int) 'a');
        token10.increment();
        java.lang.String str12 = token10.toString();
        boolean boolean14 = token10.equals((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass15 = token10.getClass();
        boolean boolean16 = token1.equals((java.lang.Object) wildcardClass15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "0 0econ00" + "'", obj5, "0 0econ00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "####################################################################################################################################################################################################" + "'", str12, "####################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 52, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 53, "0:00:00.003");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.003" + "'", str2, "0:00:00.003");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (byte) 10, "P0Y0M0DT0H0M0.032S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0329" + "'", str5, "P0Y000DT00000.0329");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), 100L, "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 2, "P0Y000DT00000.0641");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0641" + "'", str2, "P0Y000DT00000.0641");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        java.lang.String str5 = token2.toString();
        java.lang.String str6 = token2.toString();
        boolean boolean8 = token2.equals((java.lang.Object) "0 days");
        java.lang.Class<?> wildcardClass9 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token10.increment();
        java.lang.Object obj12 = token10.getValue();
        java.lang.Class<?> wildcardClass13 = token10.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str6, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.38S" + "'", str2, "P0Y0M0DT0H0M0.38S");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.35S" + "'", str2, "P0Y0M0DT0H0M0.35S");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.051", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.051" + "'", str3, "P0Y000DT00000.051");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str7 = token6.toString();
        boolean boolean8 = token2.equals((java.lang.Object) str7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean12 = token10.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        boolean boolean13 = token2.equals((java.lang.Object) token10);
        java.lang.Object obj14 = token10.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15);
        java.lang.String str17 = token16.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        java.lang.String str16 = token2.toString();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str12, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str13, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str16, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.0220", 5);
        int int3 = token2.getCount();
        token2.increment();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Class<?> wildcardClass5 = token4.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 97, (long) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.13S" + "'", str2, "P0Y0M0DT0H0M0.13S");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        java.lang.String str5 = token4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str5, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int2 = token1.getCount();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, (int) (byte) 1);
        token4.increment();
        int int8 = token4.getCount();
        java.lang.Object obj9 = token4.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str7 = token6.toString();
        boolean boolean8 = token2.equals((java.lang.Object) str7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean12 = token10.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        boolean boolean13 = token2.equals((java.lang.Object) token10);
        java.lang.Object obj14 = token10.getValue();
        token10.increment();
        java.lang.Object obj16 = token10.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.068S", (int) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int5 = token4.getCount();
        java.lang.Class<?> wildcardClass6 = token4.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass6, 0);
        boolean boolean10 = token2.equals((java.lang.Object) 0);
        java.lang.String str11 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean16 = token14.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = token14.getValue();
        java.lang.Object obj18 = token14.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token19);
        int int21 = token19.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token19);
        boolean boolean23 = token2.equals((java.lang.Object) token19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068S" + "'", str11, "P0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068SP0Y0M0DT0H0M0.068S");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 1 + "'", obj18, (short) 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 4, "0:00:00.005");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.005" + "'", str2, "0:00:00.005");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.01S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0152" + "'", str2, "P0Y000DT00000.0152");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        token5.increment();
        java.lang.String str7 = token5.toString();
        token5.increment();
        boolean boolean9 = token2.equals((java.lang.Object) token5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5, 32);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.01011", 97);
        boolean boolean15 = token5.equals((java.lang.Object) 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11" + "'", str7, "11");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 2, "10101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010" + "'", str3, "10101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        java.lang.Object obj2 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int4 = token1.getCount();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + '4' + "'", obj2, '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 10, (int) '#');
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 32);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 5, "P0Y000DT00000.0287");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0287" + "'", str2, "P0Y000DT00000.0287");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 11, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S");
        java.lang.Object obj2 = token1.getValue();
        java.lang.Object obj3 = token1.getValue();
        token1.increment();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "P0000Y0M0DT0H0M0.000S" + "'", obj2, "P0000Y0M0DT0H0M0.000S");
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0000Y0M0DT0H0M0.000S" + "'", obj3, "P0000Y0M0DT0H0M0.000S");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        java.lang.String str1 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS((long) 53);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.053" + "'", str1, "0:00:00.053");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0M0DT0H0M0.031S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0310" + "'", str3, "P0Y000DT00000.0310");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) -1, "P0Y000DT00000.03310", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03310" + "'", str5, "P0Y000DT00000.03310");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        token1.increment();
        boolean boolean4 = token1.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = token1.getValue();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) '#');
        java.lang.Object obj10 = token1.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "0 0econ00" + "'", obj5, "0 0econ00");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "0 0econ00" + "'", obj10, "0 0econ00");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str3 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5, 11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 32, "P0Y0M0DT0H0M0.003S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00332" + "'", str3, "P0Y000DT00000.00332");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str6 = token1.toString();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "####" + "'", str6, "####");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 97, (long) (short) 1, "P0Y000DT00000.097-99");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.097-99" + "'", str3, "P0Y000DT00000.097-99");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 4);
        java.lang.String str8 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 33);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str8, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        java.lang.Object obj8 = token7.getValue();
        java.lang.Class<?> wildcardClass9 = token7.getClass();
        boolean boolean10 = token5.equals((java.lang.Object) wildcardClass9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        java.lang.Object obj12 = token11.getValue();
        token11.increment();
        boolean boolean14 = token1.equals((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Object obj16 = token1.getValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + '#' + "'", obj8, '#');
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "0 0econ00" + "'", obj16, "0 0econ00");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 52, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int6 = token5.getCount();
        java.lang.String str7 = token5.toString();
        java.lang.String str8 = token5.toString();
        java.lang.String str9 = token5.toString();
        boolean boolean10 = token2.equals((java.lang.Object) token5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean14 = token12.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj15 = token12.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        int int18 = token17.getCount();
        boolean boolean19 = token12.equals((java.lang.Object) token17);
        java.lang.Class<?> wildcardClass20 = token17.getClass();
        boolean boolean21 = token2.equals((java.lang.Object) token17);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 35, "P0Y000DT00000.0298", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0298" + "'", str3, "P0Y000DT00000.0298");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.98S" + "'", str2, "P0Y0M0DT0H0M0.98S");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 35, (long) 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.062S" + "'", str2, "P0Y0M0DT0H0M0.062S");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 53, "P0Y000DT00000.00065", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00065" + "'", str3, "P0Y000DT00000.00065");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 53, "P0Y000DT00000.0340", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0340" + "'", str3, "P0Y000DT00000.0340");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj4 = token1.getValue();
        boolean boolean6 = token1.equals((java.lang.Object) "-1");
        java.lang.Class<?> wildcardClass7 = token1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        java.lang.String str4 = token2.toString();
        java.lang.String str5 = token2.toString();
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        token9.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9, (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1, 5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14, (int) (byte) 1);
        int int17 = token16.getCount();
        boolean boolean18 = token2.equals((java.lang.Object) token16);
        java.lang.Class<?> wildcardClass19 = token16.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0L);
        boolean boolean7 = token2.equals((java.lang.Object) token6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean7, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        token4.increment();
        java.lang.String str6 = token4.toString();
        boolean boolean8 = token4.equals((java.lang.Object) 0.0f);
        java.lang.Object obj9 = token4.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S");
        token11.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S", (int) (short) -1);
        boolean boolean16 = token11.equals((java.lang.Object) (short) -1);
        token11.increment();
        java.lang.String str18 = token11.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str18, (int) (byte) 1);
        boolean boolean21 = token4.equals((java.lang.Object) token20);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "####################################################################################################################################################################################################" + "'", str6, "####################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "##");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "##");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "P0000Y0M0DT0H0M0.000SP0000Y0M0DT0H0M0.000SP0000Y0M0DT0H0M0.000S" + "'", str18, "P0000Y0M0DT0H0M0.000SP0000Y0M0DT0H0M0.000SP0000Y0M0DT0H0M0.000S");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = token3.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str9, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 3, (long) (short) 1, "P0Y000DT00000.0298");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0298" + "'", str3, "P0Y000DT00000.0298");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj8 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.String str10 = token7.toString();
        boolean boolean11 = token2.equals((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token13.increment();
        token13.increment();
        token13.increment();
        int int17 = token13.getCount();
        int int18 = token13.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        java.lang.String str20 = token19.toString();
        boolean boolean21 = token7.equals((java.lang.Object) token19);
        int int22 = token7.getCount();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "####" + "'", str20, "####");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        java.lang.Object obj4 = token2.getValue();
        java.lang.Object obj5 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token7.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, (int) 'a');
        int int11 = token10.getCount();
        boolean boolean12 = token2.equals((java.lang.Object) token10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 1 + "'", obj4, (short) 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) 3, "0 0a00", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 0a00" + "'", str5, "0 0a00");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y000DT00000.10132", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.10132" + "'", str5, "P0Y000DT00000.10132");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.090S", (int) (short) 1);
        int int3 = token2.getCount();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        token4.increment();
        java.lang.String str6 = token4.toString();
        java.lang.String str7 = token4.toString();
        java.lang.Class<?> wildcardClass8 = token4.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, 97);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 97, 11);
        java.lang.String str13 = token12.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "####################################################################################################################################################################################################" + "'", str6, "####################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "####################################################################################################################################################################################################" + "'", str7, "####################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "9797979797979797979797" + "'", str13, "9797979797979797979797");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        token1.increment();
        int int5 = token1.getCount();
        java.lang.Object obj6 = token1.getValue();
        java.lang.Object obj7 = token1.getValue();
        java.lang.String str8 = token1.toString();
        boolean boolean10 = token1.equals((java.lang.Object) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        java.lang.Object obj11 = token1.getValue();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "####" + "'", str8, "####");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str21);
        java.lang.String str23 = token22.toString();
        java.lang.Class<?> wildcardClass24 = token22.getClass();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "###" + "'", str23, "###");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2, "P0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) "0:00:00.001");
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 10);
        token7.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, 33);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.99-2", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.99-2" + "'", str3, "P0Y000DT00000.99-2");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.006S" + "'", str2, "P0Y0M0DT0H0M0.006S");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 32, (long) (short) 0, "0:00:00.098");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.098" + "'", str3, "0:00:00.098");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 53, (long) 98, "P0Y0M0DT0H0M0.81S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.8145" + "'", str5, "P0Y000DT00000.8145");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 2, 1L, "P0Y0M0DT0H0M0.032S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.032-1" + "'", str5, "P0Y000DT00000.032-1");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 2, "P0Y000DT00000.0311");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0311" + "'", str2, "P0Y000DT00000.0311");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) 32, "P0Y000DT00000.0014", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0014" + "'", str5, "P0Y000DT00000.0014");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 35, "P0Y000DT00000.6734", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6734" + "'", str3, "P0Y000DT00000.6734");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj5 = token4.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        java.lang.String str7 = token4.toString();
        boolean boolean8 = token1.equals((java.lang.Object) token4);
        int int9 = token4.getCount();
        java.lang.Object obj10 = token4.getValue();
        java.lang.String str11 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str7, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str11, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 97, "P0Y0M0DT0H0M0.009S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00997" + "'", str2, "P0Y000DT00000.00997");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 32, "0 seconds");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 0econ00" + "'", str2, "0 0econ00");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = token2.getValue();
        int int6 = token2.getCount();
        java.lang.String str7 = token2.toString();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj10 = token2.getValue();
        java.lang.Object obj11 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj15 = token14.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14);
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token19);
        java.lang.String str21 = token20.toString();
        boolean boolean22 = token16.equals((java.lang.Object) token20);
        boolean boolean23 = token2.equals((java.lang.Object) boolean22);
        token2.increment();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 1 + "'", obj10, (short) 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str21, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        java.lang.Object obj21 = token9.getValue();
        int int22 = token9.getCount();
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
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y0M0DT0H0M0.048S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0481" + "'", str3, "P0Y000DT00000.0481");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 2, "P0Y000DT00000.01-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.01-1" + "'", str2, "P0Y000DT00000.01-1");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100", 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int6 = token5.getCount();
        java.lang.Class<?> wildcardClass7 = token5.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass7);
        java.lang.String str9 = token8.toString();
        boolean boolean10 = token3.equals((java.lang.Object) token8);
        token8.increment();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class org.apache.commons.lang.time.DurationFormatUtils$Token" + "'", str9, "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.066S" + "'", str2, "P0Y0M0DT0H0M0.066S");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        int int5 = token4.getCount();
        java.lang.Object obj6 = token4.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "##");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "##");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 35, "P0Y000DT00000.356");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.356" + "'", str3, "P0Y000DT00000.356");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        token2.increment();
        int int6 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        token8.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        boolean boolean11 = token2.equals((java.lang.Object) token10);
        java.lang.String str12 = token2.toString();
        java.lang.Class<?> wildcardClass13 = token2.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str12, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 4, "P0Y000DT00000.068100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.068100" + "'", str2, "P0Y000DT00000.068100");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 35, 33);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 11, (long) 10, "m");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils0 = new org.apache.commons.lang.time.DurationFormatUtils();
        java.lang.Class<?> wildcardClass1 = durationFormatUtils0.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) durationFormatUtils0, (int) (byte) 10);
        java.lang.String str4 = token3.toString();
        int int5 = token3.getCount();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6);
        java.lang.Object obj8 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        int int10 = token7.getCount();
        java.lang.Class<?> wildcardClass11 = token7.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass11, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "-1" + "'", obj8, "-1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.090S", (int) (short) 1);
        int int5 = token4.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, (-1));
        boolean boolean8 = token1.equals((java.lang.Object) token7);
        int int9 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int9, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.0231", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0231" + "'", str3, "P0Y000DT00000.0231");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 98, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        java.lang.String str5 = token2.toString();
        java.lang.String str6 = token2.toString();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) 1L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10, 33);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str6, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        java.lang.Object obj3 = token2.getValue();
        java.lang.Object obj4 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Class<?> wildcardClass6 = token5.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5, 10);
        java.lang.Class<?> wildcardClass9 = token8.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj4, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str7 = token6.toString();
        boolean boolean8 = token2.equals((java.lang.Object) str7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean12 = token10.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        boolean boolean13 = token2.equals((java.lang.Object) token10);
        java.lang.Object obj14 = token10.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10);
        int int16 = token15.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int16);
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int16, 11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        boolean boolean5 = token1.equals((java.lang.Object) "P0Y000DT00000.7510");
        java.lang.String str6 = token1.toString();
        java.lang.String str7 = token1.toString();
        java.lang.String str8 = token1.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "###" + "'", str6, "###");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "###" + "'", str7, "###");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "###" + "'", str8, "###");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        token2.increment();
        java.lang.Object obj6 = token2.getValue();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.035S" + "'", str2, "P0Y0M0DT0H0M0.035S");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
        java.lang.String str16 = token3.toString();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str9, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97" + "'", str16, "97");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00", (int) '#');
        java.lang.Object obj4 = token3.getValue();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "0 0econ00" + "'", obj4, "0 0econ00");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str6 = token1.toString();
        token1.increment();
        int int8 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean12 = token10.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str13 = token10.toString();
        int int14 = token10.getCount();
        java.lang.String str15 = token10.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str15, (int) 'a');
        int int18 = token17.getCount();
        java.lang.String str19 = token17.toString();
        boolean boolean20 = token1.equals((java.lang.Object) token17);
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "4");
        boolean boolean23 = token17.equals((java.lang.Object) "4");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "####" + "'", str6, "####");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1" + "'", str15, "-1");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str19, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        int int9 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int9);
        token10.increment();
        token10.increment();
        int int13 = token10.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean8 = token6.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj9 = token6.getValue();
        java.lang.Object obj10 = token6.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, (int) (byte) 10);
        int int14 = token6.getCount();
        boolean boolean15 = token1.equals((java.lang.Object) int14);
        token1.increment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 1 + "'", obj10, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 53, "P0Y000DT00000.002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.002" + "'", str2, "P0Y000DT00000.002");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, (int) 'a');
        token6.increment();
        boolean boolean8 = token1.equals((java.lang.Object) token6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        java.lang.Object obj13 = token12.getValue();
        java.lang.Class<?> wildcardClass14 = token12.getClass();
        boolean boolean15 = token10.equals((java.lang.Object) wildcardClass14);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10);
        java.lang.Object obj17 = token10.getValue();
        boolean boolean19 = token10.equals((java.lang.Object) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.Object obj20 = token10.getValue();
        boolean boolean21 = token1.equals((java.lang.Object) token10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100L + "'", obj17, 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100L + "'", obj20, 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.67-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.67-1" + "'", str2, "P0Y000DT00000.67-1");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) (-1), "P0Y0M0DT0H0M0.095S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.095-11" + "'", str3, "P0Y000DT00000.095-11");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 35, "P0Y000DT00000.48-88");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.48-88" + "'", str3, "P0Y000DT00000.48-88");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.003");
        int int2 = token1.getCount();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10L);
        java.lang.Object obj2 = token1.getValue();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3, (int) (short) -1);
        token5.increment();
        java.lang.String str7 = token5.toString();
        java.lang.Object obj8 = token5.getValue();
        int int9 = token5.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S");
        token11.increment();
        boolean boolean13 = token5.equals((java.lang.Object) token11);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10L + "'", obj2, 10L);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Long");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Long");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Long");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) -1);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = token2.getValue();
        int int6 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        java.lang.Object obj11 = token10.getValue();
        java.lang.Class<?> wildcardClass12 = token10.getClass();
        boolean boolean13 = token8.equals((java.lang.Object) wildcardClass12);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        java.lang.Object obj15 = token8.getValue();
        boolean boolean17 = token8.equals((java.lang.Object) 10.0d);
        java.lang.Object obj18 = null;
        boolean boolean19 = token8.equals(obj18);
        boolean boolean20 = token2.equals((java.lang.Object) token8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100L + "'", obj15, 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 4, "P0Y0M0DT0H0M0.006S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0064" + "'", str2, "P0Y000DT00000.0064");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10L);
        java.lang.Object obj19 = token18.getValue();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass20, (int) (short) -1);
        boolean boolean23 = token8.equals((java.lang.Object) token22);
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        java.lang.Object obj28 = token27.getValue();
        java.lang.Class<?> wildcardClass29 = token27.getClass();
        boolean boolean30 = token25.equals((java.lang.Object) wildcardClass29);
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token25);
        java.lang.Object obj32 = token31.getValue();
        boolean boolean33 = token22.equals((java.lang.Object) token31);
        token22.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token22);
        java.lang.Object obj36 = token35.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10L + "'", obj19, 10L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "100");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 10, (int) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 0);
        int int5 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        int int9 = token8.getCount();
        java.lang.Object obj10 = null;
        boolean boolean11 = token8.equals(obj10);
        token8.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        int int14 = token8.getCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 33, "P0Y000DT00000.01032", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.01032" + "'", str5, "P0Y000DT00000.01032");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.90S" + "'", str2, "P0Y0M0DT0H0M0.90S");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        java.lang.Object obj9 = token8.getValue();
        int int10 = token8.getCount();
        int int11 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int11, 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "-1" + "'", obj9, "-1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 100, "P0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.01168P0Y000DT00000.01168P0Y000DT00000.01168" + "'", str5, "P0Y000DT00000.01168P0Y000DT00000.01168P0Y000DT00000.01168");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.05330", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05330" + "'", str3, "P0Y000DT00000.05330");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.011S", 3);
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100");
        int int6 = token5.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5, 33);
        boolean boolean9 = token2.equals((java.lang.Object) token8);
        java.lang.Class<?> wildcardClass10 = token2.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", obj3, "P0Y0M0DT0H0M0.011S");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.05235", (int) (byte) 1);
        token2.increment();
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 11, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 35, (long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str2, "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "##################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################################################################################################################################################################################" + "'", str2, "##################################################################################################################################################################################################");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
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
        boolean boolean17 = token11.equals((java.lang.Object) "P0Y0M0DT0H0M0.067S");
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
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        java.lang.String str4 = token2.toString();
        java.lang.Object obj5 = token2.getValue();
        java.lang.Object obj6 = token2.getValue();
        java.lang.String str7 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean11 = token9.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str12 = token9.toString();
        int int13 = token9.getCount();
        java.lang.String str14 = token9.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str14, (int) 'a');
        java.lang.Object obj17 = token16.getValue();
        int int18 = token16.getCount();
        int int19 = token16.getCount();
        boolean boolean20 = token2.equals((java.lang.Object) int19);
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "-1" + "'", obj17, "-1");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        java.lang.String str3 = token2.toString();
        java.lang.Object obj4 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '#' + "'", obj4, '#');
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        token1.increment();
        java.lang.Class<?> wildcardClass5 = token1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S", (int) (short) -1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 1);
        token2.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6);
        java.lang.String str8 = token7.toString();
        java.lang.Object obj9 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10);
        boolean boolean13 = token11.equals((java.lang.Object) "P0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011S");
        int int14 = token11.getCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "-1" + "'", obj9, "-1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, (long) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100", 1);
        java.lang.String str4 = token3.toString();
        java.lang.String str5 = token3.toString();
        int int6 = token3.getCount();
        java.lang.Object obj7 = null;
        boolean boolean8 = token3.equals(obj7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.100" + "'", str4, "0:00:00.100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.100" + "'", str5, "0:00:00.100");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1);
        boolean boolean9 = token5.equals((java.lang.Object) token8);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = token8.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 53, "0:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.100" + "'", str3, "0:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.1000:00:00.100");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        boolean boolean6 = token2.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj7 = token2.getValue();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        java.lang.String str17 = token8.toString();
        java.lang.String str18 = token8.toString();
        java.lang.Object obj19 = token8.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str17, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str18, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "-1" + "'", obj19, "-1");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0.0d);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 53, "cla0 org.apache.co0on0.lang.ti0e.DurationForatUtil0$Token");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cla0 org.apache.co0on0.lang.ti0e.DurationForatUtil0$Token" + "'", str2, "cla0 org.apache.co0on0.lang.ti0e.DurationForatUtil0$Token");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        token1.increment();
        java.lang.String str5 = token1.toString();
        int int6 = token1.getCount();
        java.lang.Object obj7 = token1.getValue();
        java.lang.String str8 = token1.toString();
        token1.increment();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "####" + "'", str5, "####");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "####" + "'", str8, "####");
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, 35);
        int int11 = token10.getCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str3 = token1.toString();
        java.lang.String str4 = token1.toString();
        java.lang.String str5 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        token1.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        java.lang.String str4 = token2.toString();
        java.lang.String str5 = token2.toString();
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        token9.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9, (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1, 5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14, (int) (byte) 1);
        int int17 = token16.getCount();
        boolean boolean18 = token2.equals((java.lang.Object) token16);
        java.lang.Object obj19 = token16.getValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "-1-1-1-1-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "-1-1-1-1-1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "-1-1-1-1-1");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        int int6 = token1.getCount();
        java.lang.Object obj7 = token1.getValue();
        java.lang.Object obj8 = token1.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) 33, "P0Y000DT00000.10033", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.10033" + "'", str5, "P0Y000DT00000.10033");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 97);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0L);
        boolean boolean6 = token3.equals((java.lang.Object) token5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 100, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "0:00:00.001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.001" + "'", str2, "0:00:00.001");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int2 = token1.getCount();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3);
        token4.increment();
        int int6 = token4.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int9 = token8.getCount();
        java.lang.Class<?> wildcardClass10 = token8.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11, (int) (byte) 1);
        token11.increment();
        int int15 = token11.getCount();
        boolean boolean16 = token4.equals((java.lang.Object) token11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        token1.increment();
        java.lang.String str3 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token6.increment();
        int int8 = token6.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        token6.increment();
        token6.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token13.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, (int) 'a');
        java.lang.Object obj17 = token16.getValue();
        boolean boolean18 = token6.equals((java.lang.Object) token16);
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        boolean boolean21 = token1.equals((java.lang.Object) token6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-1" + "'", str3, "-1-1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "##");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "##");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10L);
        java.lang.Object obj2 = token1.getValue();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, 34);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10L + "'", obj2, 10L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 100);
        java.lang.Object obj7 = token2.getValue();
        int int8 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 100);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "10" + "'", obj7, "10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        token1.increment();
        int int5 = token1.getCount();
        int int6 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 98, "####", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####" + "'", str3, "####");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        token4.increment();
        java.lang.String str6 = token4.toString();
        java.lang.String str7 = token4.toString();
        java.lang.Class<?> wildcardClass8 = token4.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, 97);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 97, 11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "####################################################################################################################################################################################################" + "'", str6, "####################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "####################################################################################################################################################################################################" + "'", str7, "####################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        int int5 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 1);
        int int8 = token2.getCount();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token5.increment();
        token5.increment();
        boolean boolean9 = token5.equals((java.lang.Object) "P0Y000DT00000.7510");
        java.lang.String str10 = token5.toString();
        java.lang.Object obj11 = token5.getValue();
        java.lang.Class<?> wildcardClass12 = token5.getClass();
        boolean boolean13 = token2.equals((java.lang.Object) token5);
        java.lang.Class<?> wildcardClass14 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 98);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) -1 + "'", obj3, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "###" + "'", str10, "###");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) ' ', "P0Y000DT00000.0680", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0680" + "'", str5, "P0Y000DT00000.0680");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 3, (long) 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.095S" + "'", str2, "P0Y0M0DT0H0M0.095S");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.002-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.002-1" + "'", str3, "P0Y000DT00000.002-1");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 53, "P0Y000DT00000.990");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.990" + "'", str2, "P0Y000DT00000.990");
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.66S");
        int int2 = token1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0L);
        boolean boolean7 = token2.equals((java.lang.Object) token6);
        java.lang.Object obj8 = token6.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0L + "'", obj8, 0L);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.00452");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00452" + "'", str2, "P0Y000DT00000.00452");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.14S", 98);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.011S", 3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        java.lang.String str7 = token6.toString();
        boolean boolean8 = token2.equals((java.lang.Object) token6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) ' ');
        token10.increment();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str7, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 32, "P0Y0M0DT0H0M0.023S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02332" + "'", str3, "P0Y000DT00000.02332");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 52, "P0Y000DT00000.03452", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03452" + "'", str3, "P0Y000DT00000.03452");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 100, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 52, "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (short) 1, "P0Y000DT00000.01032", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.01032" + "'", str5, "P0Y000DT00000.01032");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 3, (long) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.007S" + "'", str2, "P0Y0M0DT0H0M0.007S");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 53, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Class<?> wildcardClass7 = token6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        boolean boolean6 = token4.equals((java.lang.Object) "P0Y000DT00000.05265");
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        token8.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, 52);
        boolean boolean12 = token4.equals((java.lang.Object) token11);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 2, (long) 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.032S" + "'", str2, "P0Y0M0DT0H0M0.032S");
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 33, (long) 32, "P0Y000DT00000.09922");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09922" + "'", str3, "P0Y000DT00000.09922");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        boolean boolean6 = token2.equals((java.lang.Object) (byte) 100);
        token2.increment();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y0M0DT0H0M0.68S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.681" + "'", str2, "P0Y000DT00000.681");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.011S", 3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean6 = token4.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str7 = token4.toString();
        int int8 = token4.getCount();
        java.lang.String str9 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str9, (int) 'a');
        int int12 = token11.getCount();
        java.lang.Object obj13 = token11.getValue();
        boolean boolean14 = token2.equals(obj13);
        int int15 = token2.getCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "-1" + "'", obj13, "-1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 97, "P0Y000DT00000.671");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.671" + "'", str2, "P0Y000DT00000.671");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj5 = token4.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        java.lang.String str7 = token4.toString();
        boolean boolean8 = token1.equals((java.lang.Object) token4);
        int int9 = token4.getCount();
        java.lang.Object obj10 = token4.getValue();
        token4.increment();
        int int12 = token4.getCount();
        java.lang.Object obj13 = token4.getValue();
        int int14 = token4.getCount();
        token4.increment();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str7, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 33 + "'", int14 == 33);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "0 0econ00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 0econ00" + "'", str2, "0 0econ00");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 5, "P0Y0M0DT0H0M0.009S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0095" + "'", str2, "P0Y000DT00000.0095");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int2 = token1.getCount();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 11);
        token5.increment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj4 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        int int7 = token6.getCount();
        boolean boolean8 = token1.equals((java.lang.Object) token6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, (-1));
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1), (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1));
        java.lang.Object obj14 = token13.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1) + "'", obj14, (-1));
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int2 = token1.getCount();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5, 11);
        java.lang.String str8 = token5.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class org.apache.commons.lang.time.DurationFormatUtils$Token" + "'", str8, "class org.apache.commons.lang.time.DurationFormatUtils$Token");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str4, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 0, (int) (byte) 10);
        java.lang.Object obj3 = token2.getValue();
        int int4 = token2.getCount();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 1, (int) (short) 100);
        java.lang.Object obj7 = token6.getValue();
        boolean boolean8 = token2.equals(obj7);
        int int9 = token2.getCount();
        int int10 = token2.getCount();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) -1 + "'", obj3, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 53, "P0Y000DT00000.0001P0Y000DT00000.0001", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0001P0Y000DT00000.0001" + "'", str3, "P0Y000DT00000.0001P0Y000DT00000.0001");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 53, (long) 4, "P0Y000DT00000.97-100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.97-100" + "'", str3, "P0Y000DT00000.97-100");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S");
        int int2 = token1.getCount();
        java.lang.Object obj3 = token1.getValue();
        int int4 = token1.getCount();
        java.lang.Class<?> wildcardClass5 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        boolean boolean9 = token7.equals((java.lang.Object) "100.0");
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0000Y0M0DT0H0M0.000S" + "'", obj3, "P0000Y0M0DT0H0M0.000S");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) 4, "P0Y000DT00000.99-2");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.99-2" + "'", str3, "P0Y000DT00000.99-2");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 5);
        token1.increment();
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
        token15.increment();
        java.lang.Object obj21 = null;
        boolean boolean22 = token15.equals(obj21);
        java.lang.Class<?> wildcardClass23 = token15.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.7510", (int) (byte) 10);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int6 = token5.getCount();
        java.lang.String str7 = token5.toString();
        java.lang.String str8 = token5.toString();
        java.lang.String str9 = token5.toString();
        boolean boolean10 = token2.equals((java.lang.Object) token5);
        java.lang.String str11 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str11, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S");
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S", (int) (short) -1);
        boolean boolean6 = token1.equals((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass7 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass7, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 97, (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.02S" + "'", str2, "P0Y0M0DT0H0M0.02S");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y000DT00000.67-31", 0);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, 1L, "P0Y000DT00000.08797");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.08797" + "'", str3, "P0Y000DT00000.08797");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) '4', true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
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
        java.lang.Object obj14 = token7.getValue();
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
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.3210", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.3210" + "'", str3, "P0Y000DT00000.3210");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) 53, "P0Y0M0DT0H0M0.066S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06654" + "'", str3, "P0Y000DT00000.06654");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.0311");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 0);
        java.lang.Class<?> wildcardClass4 = token1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj5 = token4.getValue();
        java.lang.Object obj6 = token4.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.75S" + "'", obj5, "P0Y0M0DT0H0M0.75S");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "P0Y0M0DT0H0M0.75S" + "'", obj6, "P0Y0M0DT0H0M0.75S");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
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
        java.lang.String str15 = token8.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str15, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        java.lang.String str3 = token2.toString();
        token2.increment();
        int int5 = token2.getCount();
        int int6 = token2.getCount();
        java.lang.Object obj7 = token2.getValue();
        java.lang.Object obj8 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "10" + "'", obj7, "10");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "10" + "'", obj8, "10");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token5.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5, (int) 'a');
        token8.increment();
        java.lang.String str10 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        int int14 = token13.getCount();
        boolean boolean15 = token8.equals((java.lang.Object) token13);
        boolean boolean16 = token2.equals((java.lang.Object) boolean15);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "####################################################################################################################################################################################################" + "'", str10, "####################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 0, "P0Y000DT00000.03490", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03490" + "'", str5, "P0Y000DT00000.03490");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 5, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj5 = token4.getValue();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.75S" + "'", obj5, "P0Y0M0DT0H0M0.75S");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, 0L, "P0Y000DT00000.910", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.910" + "'", str5, "P0Y000DT00000.910");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        java.lang.String str8 = token7.toString();
        token7.increment();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010" + "'", str8, "10101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        int int4 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int4);
        java.lang.Object obj6 = token5.getValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 100, 0);
        int int3 = token2.getCount();
        java.lang.Object obj4 = token2.getValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.String str9 = token7.toString();
        token7.increment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str3 = token1.toString();
        java.lang.String str4 = token1.toString();
        java.lang.String str5 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.092-100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.092-100" + "'", str2, "P0Y000DT00000.092-100");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        int int4 = token2.getCount();
        int int5 = token2.getCount();
        token2.increment();
        java.lang.Object obj7 = token2.getValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 1 + "'", obj7, (short) 1);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 'a', "P0Y000DT00000.095-11");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.095-11" + "'", str3, "P0Y000DT00000.095-11");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) (-1), "P0Y000DT00000.00-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00-1" + "'", str3, "P0Y000DT00000.00-1");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2, "P0Y0M0DT0H0M0.011S");
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S", (int) (short) -1);
        java.lang.String str3 = token2.toString();
        token2.increment();
        boolean boolean6 = token2.equals((java.lang.Object) "P0Y000DT00000.356");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj8 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.String str10 = token7.toString();
        boolean boolean11 = token2.equals((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj13 = token12.getValue();
        token12.increment();
        java.lang.Class<?> wildcardClass15 = token12.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        java.lang.String str4 = token2.toString();
        java.lang.String str5 = token2.toString();
        java.lang.String str6 = token2.toString();
        java.lang.String str7 = token2.toString();
        int int8 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        boolean boolean5 = token1.equals((java.lang.Object) "P0Y000DT00000.7510");
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj9 = token8.getValue();
        token8.increment();
        java.lang.String str11 = token8.toString();
        java.lang.String str12 = token8.toString();
        token8.increment();
        boolean boolean15 = token8.equals((java.lang.Object) 1L);
        boolean boolean16 = token1.equals((java.lang.Object) 1L);
        java.lang.String str17 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Object obj19 = token1.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str11, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str12, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "###" + "'", str17, "###");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '#' + "'", obj19, '#');
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 34);
        java.lang.Class<?> wildcardClass4 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = token5.getValue();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 100, 0);
        java.lang.String str3 = token2.toString();
        int int4 = token2.getCount();
        java.lang.Object obj5 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int2 = token1.getCount();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3);
        java.lang.String str5 = token4.toString();
        int int6 = token4.getCount();
        java.lang.Object obj7 = token4.getValue();
        java.lang.Class<?> wildcardClass8 = token4.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class org.apache.commons.lang.time.DurationFormatUtils$Token" + "'", str5, "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.090S", (int) (short) 1);
        int int5 = token4.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, (-1));
        boolean boolean8 = token1.equals((java.lang.Object) token7);
        int int9 = token1.getCount();
        java.lang.Class<?> wildcardClass10 = token1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        java.lang.String str8 = token7.toString();
        java.lang.Class<?> wildcardClass9 = token7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010" + "'", str8, "10101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj7 = token6.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        java.lang.String str9 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, (int) ' ');
        boolean boolean12 = token2.equals((java.lang.Object) token8);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str9, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S");
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S", (int) (short) -1);
        boolean boolean6 = token1.equals((java.lang.Object) (short) -1);
        int int7 = token1.getCount();
        token1.increment();
        java.lang.Object obj9 = token1.getValue();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "P0000Y0M0DT0H0M0.000S" + "'", obj9, "P0000Y0M0DT0H0M0.000S");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.00452", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00452" + "'", str3, "P0Y000DT00000.00452");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 35, (long) 52, "P0Y000DT00000.09034", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09034" + "'", str5, "P0Y000DT00000.09034");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 5, 100L, "P0Y000DT00000.355");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.355" + "'", str3, "P0Y000DT00000.355");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0");
        java.lang.Object obj2 = token1.getValue();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "0" + "'", obj2, "0");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        int int3 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        token1.increment();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token8.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, (int) 'a');
        java.lang.Object obj12 = token11.getValue();
        boolean boolean13 = token1.equals((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str15 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str19 = token18.toString();
        java.lang.Class<?> wildcardClass20 = token18.getClass();
        boolean boolean21 = token1.equals((java.lang.Object) token18);
        int int22 = token1.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "##");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "##");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "####" + "'", str15, "####");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ', (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = token21.getClass();
        boolean boolean23 = token18.equals((java.lang.Object) wildcardClass22);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str9, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.02S" + "'", str2, "P0Y0M0DT0H0M0.02S");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 33, (long) 3, "0 seconds", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 0econ00" + "'", str5, "0 0econ00");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) '4', "P0Y0M0DT0H0M0.042S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.042-48" + "'", str3, "P0Y000DT00000.042-48");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "#", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj7 = token6.getValue();
        token6.increment();
        java.lang.String str9 = token6.toString();
        java.lang.String str10 = token6.toString();
        boolean boolean11 = token1.equals((java.lang.Object) str10);
        int int12 = token1.getCount();
        token1.increment();
        java.lang.Object obj14 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        java.lang.String str19 = token18.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18);
        boolean boolean21 = token15.equals((java.lang.Object) token18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str9, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1" + "'", str19, "1");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        boolean boolean6 = token2.equals((java.lang.Object) (byte) 100);
        java.lang.String str7 = token2.toString();
        java.lang.Object obj8 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 100, "P0Y0M0DT0H0M0.028S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.028100" + "'", str3, "P0Y000DT00000.028100");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11, 0);
        java.lang.String str18 = token11.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str18, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
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
        java.lang.Object obj21 = token2.getValue();
        int int22 = token2.getCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = token2.getValue();
        int int6 = token2.getCount();
        java.lang.String str7 = token2.toString();
        token2.increment();
        int int9 = token2.getCount();
        java.lang.Class<?> wildcardClass10 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 10);
        int int2 = token1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.02S");
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Class<?> wildcardClass5 = token1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj5 = token4.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        java.lang.String str7 = token4.toString();
        boolean boolean8 = token1.equals((java.lang.Object) token4);
        int int9 = token4.getCount();
        java.lang.Object obj10 = token4.getValue();
        java.lang.String str11 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, (int) (short) -1);
        int int14 = token13.getCount();
        java.lang.String str15 = token13.toString();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str7, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str11, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.002");
        java.lang.String str2 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token4.increment();
        token4.increment();
        token4.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        java.lang.String str9 = token4.toString();
        token4.increment();
        int int11 = token4.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean15 = token13.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str16 = token13.toString();
        int int17 = token13.getCount();
        java.lang.String str18 = token13.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str18, (int) 'a');
        int int21 = token20.getCount();
        java.lang.String str22 = token20.toString();
        boolean boolean23 = token4.equals((java.lang.Object) token20);
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00", (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token27, 0);
        boolean boolean30 = token4.equals((java.lang.Object) token27);
        boolean boolean31 = token1.equals((java.lang.Object) token4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.002" + "'", str2, "0:00:00.002");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "####" + "'", str9, "####");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1" + "'", str16, "-1");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1" + "'", str18, "-1");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str22, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        java.lang.String str10 = token8.toString();
        java.lang.String str11 = token8.toString();
        int int12 = token8.getCount();
        boolean boolean13 = token2.equals((java.lang.Object) int12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 5, (long) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.005S" + "'", str2, "P0Y0M0DT0H0M0.005S");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.00065");
        java.lang.Object obj2 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.009S", (int) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5, 100);
        boolean boolean8 = token1.equals((java.lang.Object) token5);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "P0Y000DT00000.00065" + "'", obj2, "P0Y000DT00000.00065");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "111");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj5 = token4.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        java.lang.Class<?> wildcardClass7 = token4.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = token8.getClass();
        boolean boolean10 = token1.equals((java.lang.Object) wildcardClass9);
        int int11 = token1.getCount();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1);
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        java.lang.String str4 = token1.toString();
        boolean boolean6 = token1.equals((java.lang.Object) "P0Y000DT00000.03565");
        java.lang.Object obj7 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S", (int) (short) -1);
        java.lang.String str11 = token10.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10, 1);
        boolean boolean14 = token1.equals((java.lang.Object) token10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 1 + "'", obj7, (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 33, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 97, (long) '#', "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str5, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj8 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.String str10 = token7.toString();
        boolean boolean11 = token2.equals((java.lang.Object) token7);
        token2.increment();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str3, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        token5.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0001" + "'", str2, "P0Y000DT00000.0001");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        java.lang.String str3 = token2.toString();
        java.lang.String str4 = token2.toString();
        java.lang.String str5 = token2.toString();
        java.lang.Object obj6 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0M0DT0H0M0.004S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.004100" + "'", str2, "P0Y000DT00000.004100");
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) ' ', true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 32, "P0Y000DT00000.356", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.356" + "'", str5, "P0Y000DT00000.356");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S", (int) (short) -1);
        boolean boolean8 = token1.equals((java.lang.Object) (short) -1);
        int int9 = token1.getCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 1, (int) (short) 100);
        java.lang.Object obj7 = token6.getValue();
        boolean boolean8 = token2.equals(obj7);
        int int9 = token2.getCount();
        java.lang.Object obj10 = token2.getValue();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) -1 + "'", obj3, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) -1 + "'", obj10, (short) -1);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.48-88");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        int int9 = token8.getCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", str2, "P0Y0M0DT0H0M0.002S");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str3 = token1.toString();
        java.lang.String str4 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (-1L), "P0Y0M0DT0H0M0.001S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.001-1" + "'", str5, "P0Y000DT00000.001-1");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100", 1);
        java.lang.String str4 = token3.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.100" + "'", str4, "0:00:00.100");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        token4.increment();
        java.lang.String str6 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        int int10 = token9.getCount();
        boolean boolean11 = token4.equals((java.lang.Object) token9);
        java.lang.String str12 = token4.toString();
        java.lang.String str13 = token4.toString();
        java.lang.String str14 = token4.toString();
        token4.increment();
        java.lang.String str16 = token4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "####################################################################################################################################################################################################" + "'", str6, "####################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "####################################################################################################################################################################################################" + "'", str12, "####################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "####################################################################################################################################################################################################" + "'", str13, "####################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "####################################################################################################################################################################################################" + "'", str14, "####################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "######################################################################################################################################################################################################" + "'", str16, "######################################################################################################################################################################################################");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, 2);
        boolean boolean9 = token2.equals((java.lang.Object) token6);
        token2.increment();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) 52, "", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj8 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.String str10 = token7.toString();
        boolean boolean11 = token2.equals((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token12.increment();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 4, (long) 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.031S" + "'", str2, "P0Y0M0DT0H0M0.031S");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str7 = token6.toString();
        boolean boolean8 = token2.equals((java.lang.Object) str7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean12 = token10.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        boolean boolean13 = token2.equals((java.lang.Object) token10);
        java.lang.Object obj14 = token10.getValue();
        token10.increment();
        int int16 = token10.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 1, (int) 'a');
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        boolean boolean9 = token3.equals((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean20, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, 10L, "P0Y000DT00000.0233");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0233" + "'", str3, "P0Y000DT00000.0233");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj8 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.String str10 = token7.toString();
        boolean boolean11 = token2.equals((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token13.increment();
        token13.increment();
        token13.increment();
        int int17 = token13.getCount();
        int int18 = token13.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        java.lang.String str20 = token19.toString();
        boolean boolean21 = token7.equals((java.lang.Object) token19);
        boolean boolean23 = token7.equals((java.lang.Object) "P0Y000DT00000.101");
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "####" + "'", str20, "####");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 33, "P0000Y0M0DT0H0M0.036S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.03633" + "'", str5, "P0000Y000DT00000.03633");
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        java.lang.Object obj2 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj6 = token5.getValue();
        token5.increment();
        token5.increment();
        int int9 = token5.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        token11.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        boolean boolean14 = token5.equals((java.lang.Object) token13);
        int int15 = token13.getCount();
        boolean boolean16 = token1.equals((java.lang.Object) token13);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, 3);
        java.lang.Class<?> wildcardClass19 = token13.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", obj2, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj5 = token4.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        java.lang.String str7 = token4.toString();
        boolean boolean8 = token1.equals((java.lang.Object) token4);
        int int9 = token4.getCount();
        java.lang.Object obj10 = token4.getValue();
        java.lang.Object obj11 = token4.getValue();
        int int12 = token4.getCount();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str7, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str3 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) -1);
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, 11);
        int int9 = token8.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        int int3 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Class<?> wildcardClass5 = token2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 52, (long) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.49S" + "'", str2, "P0Y0M0DT0H0M0.49S");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.004S" + "'", str2, "P0Y0M0DT0H0M0.004S");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        java.lang.String str5 = token2.toString();
        boolean boolean7 = token2.equals((java.lang.Object) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean12 = token10.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj13 = token10.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        int int16 = token15.getCount();
        boolean boolean17 = token10.equals((java.lang.Object) token15);
        boolean boolean18 = token8.equals((java.lang.Object) boolean17);
        java.lang.Object obj19 = token8.getValue();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        token1.increment();
        java.lang.String str5 = token1.toString();
        int int6 = token1.getCount();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        java.lang.Object obj12 = token11.getValue();
        java.lang.Class<?> wildcardClass13 = token11.getClass();
        boolean boolean14 = token9.equals((java.lang.Object) wildcardClass13);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        java.lang.String str16 = token9.toString();
        boolean boolean17 = token1.equals((java.lang.Object) str16);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "####" + "'", str5, "####");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100" + "'", str16, "100");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token5.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5, (int) 'a');
        token8.increment();
        java.lang.String str10 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        int int14 = token13.getCount();
        boolean boolean15 = token8.equals((java.lang.Object) token13);
        boolean boolean16 = token2.equals((java.lang.Object) boolean15);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj19 = token2.getValue();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "####################################################################################################################################################################################################" + "'", str10, "####################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj19, "P0Y0M0DT0H0M0.002S");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 100, 0);
        int int3 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        int int5 = token2.getCount();
        int int6 = token2.getCount();
        int int7 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        java.lang.String str4 = token2.toString();
        java.lang.String str5 = token2.toString();
        java.lang.String str6 = token2.toString();
        token2.increment();
        java.lang.String str8 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 4);
        java.lang.String str11 = token10.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11" + "'", str8, "11");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11111111" + "'", str11, "11111111");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "false", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fal0e" + "'", str3, "fal0e");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        java.lang.Object obj9 = token8.getValue();
        int int10 = token8.getCount();
        int int11 = token8.getCount();
        java.lang.String str12 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        token14.increment();
        java.lang.String str16 = token14.toString();
        java.lang.String str17 = token14.toString();
        boolean boolean18 = token8.equals((java.lang.Object) token14);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token20.increment();
        int int22 = token20.getCount();
        int int23 = token20.getCount();
        boolean boolean24 = token14.equals((java.lang.Object) token20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "-1" + "'", obj9, "-1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str12, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1-1" + "'", str16, "-1-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1-1" + "'", str17, "-1-1");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        java.lang.Object obj3 = token2.getValue();
        boolean boolean5 = token2.equals((java.lang.Object) 1L);
        token2.increment();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "10" + "'", obj3, "10");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "false", 34);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str4 = token3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "falsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalse" + "'", str4, "falsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalse");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        token1.increment();
        int int5 = token1.getCount();
        java.lang.Object obj6 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 0, (int) (byte) 10);
        boolean boolean10 = token1.equals((java.lang.Object) token9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        java.lang.String str14 = token13.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        boolean boolean16 = token1.equals((java.lang.Object) token15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10L);
        java.lang.Object obj2 = token1.getValue();
        token1.increment();
        java.lang.Object obj4 = token1.getValue();
        java.lang.Object obj5 = token1.getValue();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10L + "'", obj2, 10L);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10L + "'", obj4, 10L);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10L + "'", obj5, 10L);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 4, "P0Y000DT00000.05100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05100" + "'", str3, "P0Y000DT00000.05100");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 1, (int) 'a');
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        java.lang.Object obj6 = token3.getValue();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.089-6", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.089-6" + "'", str3, "P0Y000DT00000.089-6");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean11 = token9.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0L);
        boolean boolean14 = token9.equals((java.lang.Object) token13);
        java.lang.Class<?> wildcardClass15 = token9.getClass();
        boolean boolean16 = token1.equals((java.lang.Object) token9);
        java.lang.Object obj17 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.031S", 34);
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj24 = token23.getValue();
        token23.increment();
        token23.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token28 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token23, 1);
        boolean boolean29 = token20.equals((java.lang.Object) token23);
        java.lang.Object obj30 = token23.getValue();
        java.lang.Object obj31 = token23.getValue();
        java.lang.Object obj32 = token23.getValue();
        boolean boolean33 = token1.equals(obj32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0f + "'", obj30, 100.0f);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0f + "'", obj31, 100.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.String str9 = token7.toString();
        java.lang.String str10 = token7.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 10, (int) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 0);
        token2.increment();
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 3, 1L, "P0000Y0M0DT0H0M0.010S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.010-2" + "'", str3, "P0000Y000DT00000.010-2");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.670", (int) (short) 1);
        java.lang.String str3 = token2.toString();
        java.lang.String str4 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.670" + "'", str3, "P0Y000DT00000.670");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y000DT00000.670" + "'", str4, "P0Y000DT00000.670");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
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
        java.lang.String str14 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (-1.0d));
        int int5 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils6 = new org.apache.commons.lang.time.DurationFormatUtils();
        java.lang.Class<?> wildcardClass7 = durationFormatUtils6.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) durationFormatUtils6, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) durationFormatUtils6, (int) (short) 0);
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils12 = new org.apache.commons.lang.time.DurationFormatUtils();
        boolean boolean13 = token11.equals((java.lang.Object) durationFormatUtils12);
        java.lang.Class<?> wildcardClass14 = durationFormatUtils12.getClass();
        boolean boolean15 = token2.equals((java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = token2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 11, "P0Y0M0DT0H0M0.96S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9611" + "'", str3, "P0Y000DT00000.9611");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int2 = token1.getCount();
        token1.increment();
        java.lang.Object obj4 = token1.getValue();
        java.lang.String str5 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100L + "'", obj4, 100L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100100" + "'", str5, "100100");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
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
        token11.increment();
        int int17 = token11.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 52, "P0Y000DT00000.051");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.051" + "'", str3, "P0Y000DT00000.051");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj7 = token6.getValue();
        token6.increment();
        java.lang.String str9 = token6.toString();
        java.lang.String str10 = token6.toString();
        boolean boolean11 = token1.equals((java.lang.Object) str10);
        token1.increment();
        java.lang.String str13 = token1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str9, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1-1" + "'", str13, "-1-1");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        boolean boolean6 = token2.equals((java.lang.Object) (byte) 100);
        int int7 = token2.getCount();
        java.lang.Class<?> wildcardClass8 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass8, 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        java.lang.String str5 = token2.toString();
        boolean boolean7 = token2.equals((java.lang.Object) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj9 = null;
        boolean boolean10 = token8.equals(obj9);
        java.lang.Object obj11 = token8.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token15.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15, (int) 'a');
        token18.increment();
        boolean boolean20 = token13.equals((java.lang.Object) token18);
        boolean boolean21 = token8.equals((java.lang.Object) token13);
        java.lang.String str22 = token8.toString();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str22, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.00332");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str7 = token2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str3 = token2.toString();
        int int4 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int4);
        java.lang.Class<?> wildcardClass6 = token5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) 0, "P0Y000DT00000.0101", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0101" + "'", str5, "P0Y000DT00000.0101");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        java.lang.String str3 = token2.toString();
        token2.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str3 = token2.toString();
        int int4 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int4);
        java.lang.String str6 = token5.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.090S", (int) (short) 1);
        int int10 = token9.getCount();
        token9.increment();
        boolean boolean12 = token5.equals((java.lang.Object) token9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0000Y0M0DT0H0M0.036S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.03632" + "'", str3, "P0000Y000DT00000.03632");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj4 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        int int7 = token6.getCount();
        boolean boolean8 = token1.equals((java.lang.Object) token6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        token10.increment();
        java.lang.String str12 = token10.toString();
        java.lang.Class<?> wildcardClass13 = token10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1-1" + "'", str12, "-1-1");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 32, (long) 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.003S" + "'", str2, "P0Y0M0DT0H0M0.003S");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str5 = token4.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y0M0DT0H0M0.75S" + "'", str5, "P0Y0M0DT0H0M0.75S");
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        token3.increment();
        java.lang.Object obj8 = token3.getValue();
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10L);
        java.lang.Object obj19 = token18.getValue();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass20, (int) (short) -1);
        boolean boolean23 = token8.equals((java.lang.Object) token22);
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        java.lang.Object obj28 = token27.getValue();
        java.lang.Class<?> wildcardClass29 = token27.getClass();
        boolean boolean30 = token25.equals((java.lang.Object) wildcardClass29);
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token25);
        java.lang.Object obj32 = token31.getValue();
        boolean boolean33 = token22.equals((java.lang.Object) token31);
        token22.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token22);
        org.apache.commons.lang.time.DurationFormatUtils.Token token37 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token35, 0);
        java.lang.Class<?> wildcardClass38 = token35.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10L + "'", obj19, 10L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "100");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean12 = token10.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str13 = token10.toString();
        int int14 = token10.getCount();
        java.lang.String str15 = token10.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str15, (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj21 = token20.getValue();
        int int22 = token20.getCount();
        boolean boolean23 = token17.equals((java.lang.Object) token20);
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token20, (int) (byte) 10);
        boolean boolean26 = token8.equals((java.lang.Object) token25);
        boolean boolean27 = token1.equals((java.lang.Object) token8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1" + "'", str15, "-1");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        java.lang.String str5 = token1.toString();
        token1.increment();
        java.lang.Object obj7 = token1.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 2, (long) (short) 1, "P0Y000DT00000.0480");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0480" + "'", str3, "P0Y000DT00000.0480");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        int int7 = token5.getCount();
        token5.increment();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 0L, "class java.lang.Long");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cla00 java.lang.Long" + "'", str3, "cla00 java.lang.Long");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int6 = token5.getCount();
        java.lang.String str7 = token5.toString();
        java.lang.String str8 = token5.toString();
        java.lang.String str9 = token5.toString();
        boolean boolean10 = token2.equals((java.lang.Object) token5);
        boolean boolean12 = token2.equals((java.lang.Object) "P0Y000DT00000.1034");
        java.lang.String str13 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str13, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.068S", (int) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int5 = token4.getCount();
        java.lang.Class<?> wildcardClass6 = token4.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass6, 0);
        boolean boolean10 = token2.equals((java.lang.Object) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0, 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int6 = token5.getCount();
        java.lang.String str7 = token5.toString();
        java.lang.String str8 = token5.toString();
        java.lang.String str9 = token5.toString();
        boolean boolean10 = token2.equals((java.lang.Object) token5);
        java.lang.String str11 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj13 = token12.getValue();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str11, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj4 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        int int7 = token6.getCount();
        boolean boolean8 = token1.equals((java.lang.Object) token6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, (-1));
        java.lang.Object obj11 = token10.getValue();
        token10.increment();
        token10.increment();
        token10.increment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "4");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "4");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y0M0DT0H0M0.12S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1210" + "'", str3, "P0Y000DT00000.1210");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj4 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        int int7 = token6.getCount();
        boolean boolean8 = token1.equals((java.lang.Object) token6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean8);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean8, 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 98, (long) 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.07S" + "'", str2, "P0Y0M0DT0H0M0.07S");
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0111P0Y000DT00000.0111P0Y000DT00000.0111P0Y000DT00000.0111" + "'", str3, "P0Y000DT00000.0111P0Y000DT00000.0111P0Y000DT00000.0111P0Y000DT00000.0111");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 2);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        token2.increment();
        boolean boolean5 = token2.equals((java.lang.Object) "0:00:00.034");
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, (int) (byte) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.090S", (int) (short) 1);
        int int3 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (-1));
        java.lang.Object obj6 = token5.getValue();
        boolean boolean8 = token5.equals((java.lang.Object) "P0Y0M0DT0H0M0.003S");
        java.lang.Object obj9 = token5.getValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "P0Y0M0DT0H0M0.090S");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10L);
        java.lang.Object obj2 = token1.getValue();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3, (int) (short) -1);
        token5.increment();
        java.lang.String str7 = token5.toString();
        java.lang.Object obj8 = token5.getValue();
        token5.increment();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10L + "'", obj2, 10L);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Long");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Long");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Long");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, 1L, "P0Y0M0DT0H0M0.55S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.550" + "'", str5, "P0Y000DT00000.550");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "M", (int) ' ');
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.String str9 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str9);
        token10.increment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) -1, "P0Y0M0DT0H0M0.89S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.89-1" + "'", str5, "P0Y000DT00000.89-1");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str3 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S");
        int int9 = token8.getCount();
        boolean boolean10 = token6.equals((java.lang.Object) token8);
        java.lang.Object obj11 = token8.getValue();
        token8.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "P0000Y0M0DT0H0M0.000S" + "'", obj11, "P0000Y0M0DT0H0M0.000S");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 33, "P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09033" + "'", str2, "P0Y000DT00000.09033");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, 0L, "P0Y000DT00000.052-101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.052-101" + "'", str3, "P0Y000DT00000.052-101");
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 97, "P0Y000DT00000.042-48");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.042-48" + "'", str3, "P0Y000DT00000.042-48");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 4, "P0Y0M0DT0H0M0.096S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0964" + "'", str3, "P0Y000DT00000.0964");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 0L, "P0Y000DT00000.4832", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.4832" + "'", str5, "P0Y000DT00000.4832");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.00098");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00098" + "'", str2, "P0Y000DT00000.00098");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S");
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S", (int) (short) -1);
        boolean boolean6 = token1.equals((java.lang.Object) (short) -1);
        int int7 = token1.getCount();
        token1.increment();
        token1.increment();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        int int5 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token9.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9, (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        int int16 = token15.getCount();
        boolean boolean17 = token12.equals((java.lang.Object) token15);
        boolean boolean18 = token2.equals((java.lang.Object) token12);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12, 33);
        java.lang.Object obj21 = token12.getValue();
        int int22 = token12.getCount();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "##");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "##");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6);
        java.lang.String str8 = token7.toString();
        java.lang.Object obj9 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.String str11 = token7.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "-1" + "'", obj9, "-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (-1), "P0Y000DT00000.02332");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02332" + "'", str3, "P0Y000DT00000.02332");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.0100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0100" + "'", str2, "P0Y000DT00000.0100");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str3 = token2.toString();
        token2.increment();
        java.lang.String str5 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token7.increment();
        int int9 = token7.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        token7.increment();
        token7.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token14.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14, (int) 'a');
        java.lang.Object obj18 = token17.getValue();
        boolean boolean19 = token7.equals((java.lang.Object) token17);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        int int22 = token21.getCount();
        boolean boolean23 = token2.equals((java.lang.Object) token21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1010" + "'", str5, "1010");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "##");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "##");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10L);
        java.lang.Object obj19 = token18.getValue();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass20, (int) (short) -1);
        boolean boolean23 = token8.equals((java.lang.Object) token22);
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        java.lang.Object obj28 = token27.getValue();
        java.lang.Class<?> wildcardClass29 = token27.getClass();
        boolean boolean30 = token25.equals((java.lang.Object) wildcardClass29);
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token25);
        java.lang.Object obj32 = token31.getValue();
        boolean boolean33 = token22.equals((java.lang.Object) token31);
        token22.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token22);
        int int36 = token35.getCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10L + "'", obj19, 10L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "100");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 97, "P0Y0M0DT0H0M0.051S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.05197" + "'", str2, "P0Y000DT00000.05197");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(1L, 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2, "P0Y0M0DT0H0M0.099S");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = token2.getValue();
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        int int9 = token7.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        java.lang.String str14 = token13.toString();
        java.lang.String str15 = token13.toString();
        java.lang.Object obj16 = token13.getValue();
        boolean boolean17 = token7.equals(obj16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 1 + "'", obj16, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 3, (long) 101, "P0Y000DT00000.09698");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09698" + "'", str3, "P0Y000DT00000.09698");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 34, (long) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.98S" + "'", str2, "P0Y0M0DT0H0M0.98S");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 'a', "P0Y000DT00000.780", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.780" + "'", str5, "P0Y000DT00000.780");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, 100L, "P0Y000DT00000.0335");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0335" + "'", str3, "P0Y000DT00000.0335");
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        int int9 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "0:00:00.053");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.053" + "'", str2, "0:00:00.053");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10L);
        java.lang.Object obj19 = token18.getValue();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass20, (int) (short) -1);
        boolean boolean23 = token8.equals((java.lang.Object) token22);
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        java.lang.Object obj28 = token27.getValue();
        java.lang.Class<?> wildcardClass29 = token27.getClass();
        boolean boolean30 = token25.equals((java.lang.Object) wildcardClass29);
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token25);
        java.lang.Object obj32 = token31.getValue();
        boolean boolean33 = token22.equals((java.lang.Object) token31);
        java.lang.String str34 = token31.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10L + "'", obj19, 10L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "100");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "100" + "'", str34, "100");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.902", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.902" + "'", str3, "P0Y000DT00000.902");
    }
}

