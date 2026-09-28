package org.apache.commons.lang.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        java.lang.String str3 = token2.toString();
        java.lang.Class<?> wildcardClass4 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj8 = token7.getValue();
        token7.increment();
        java.lang.Object obj10 = token7.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "11");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "11");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "11");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "11");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "11");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "11");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 32, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        int int3 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Object obj5 = token4.getValue();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "##");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "##");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        java.lang.Object obj4 = token1.getValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '4' + "'", obj4, '4');
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 10, "S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11" + "'", str3, "11");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 32, 1);
        java.lang.Class<?> wildcardClass16 = token15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 4, "###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###" + "'", str3, "###");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = token2.equals(obj14);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) -1 + "'", obj3, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "###" + "'", str10, "###");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) '#', true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 'a', "P0Y000DT00000.002");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.002" + "'", str3, "P0Y000DT00000.002");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 34, (long) (byte) 100, "P0Y000DT00000.0110", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0110" + "'", str5, "P0Y000DT00000.0110");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 1);
        java.lang.Object obj8 = token7.getValue();
        java.lang.Object obj9 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj9, 3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int15 = token14.getCount();
        java.lang.String str16 = token14.toString();
        java.lang.Object obj17 = token14.getValue();
        java.lang.Object obj18 = token14.getValue();
        java.lang.String str19 = token14.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean23 = token21.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str24 = token21.toString();
        int int25 = token21.getCount();
        java.lang.String str26 = token21.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token28 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str26, (int) 'a');
        java.lang.Object obj29 = token28.getValue();
        int int30 = token28.getCount();
        int int31 = token28.getCount();
        boolean boolean32 = token14.equals((java.lang.Object) int31);
        int int33 = token14.getCount();
        boolean boolean34 = token11.equals((java.lang.Object) int33);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 1 + "'", obj18, (short) 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1" + "'", str19, "1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1" + "'", str24, "-1");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1" + "'", str26, "-1");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "-1" + "'", obj29, "-1");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        java.lang.String str3 = token2.toString();
        token2.increment();
        int int5 = token2.getCount();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(1L, (long) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        java.lang.String str17 = token16.toString();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str9, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97" + "'", str17, "97");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) ' ', "P0Y000DT00000.36-65", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.36-65" + "'", str5, "P0Y000DT00000.36-65");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 4, 1L, "P0Y000DT00000.05211");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05211" + "'", str3, "P0Y000DT00000.05211");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.087S" + "'", str2, "P0Y0M0DT0H0M0.087S");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.068S", (int) '#');
        java.lang.Class<?> wildcardClass3 = token2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = token2.getValue();
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 10);
        java.lang.String str10 = token2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 32, (long) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.69S" + "'", str2, "P0Y0M0DT0H0M0.69S");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        boolean boolean5 = token1.equals((java.lang.Object) "P0Y000DT00000.7510");
        java.lang.String str6 = token1.toString();
        java.lang.Object obj7 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj11 = token10.getValue();
        token10.increment();
        java.lang.String str13 = token10.toString();
        java.lang.String str14 = token10.toString();
        token10.increment();
        boolean boolean17 = token10.equals((java.lang.Object) 1L);
        boolean boolean18 = token1.equals((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass19 = token1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "###" + "'", str6, "###");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str13, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str14, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils0 = new org.apache.commons.lang.time.DurationFormatUtils();
        java.lang.Class<?> wildcardClass1 = durationFormatUtils0.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) durationFormatUtils0, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 10, 5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 10);
        java.lang.Object obj7 = token6.getValue();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str3 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        int int7 = token6.getCount();
        java.lang.Class<?> wildcardClass8 = token6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        token4.increment();
        java.lang.String str6 = token4.toString();
        java.lang.String str7 = token4.toString();
        java.lang.Class<?> wildcardClass8 = token4.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, 97);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 97, 11);
        boolean boolean14 = token12.equals((java.lang.Object) "P0Y0M0DT0H0M0.052S");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "####################################################################################################################################################################################################" + "'", str6, "####################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "####################################################################################################################################################################################################" + "'", str7, "####################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) 98, "P0Y000DT00000.0032");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0032" + "'", str3, "P0Y000DT00000.0032");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 1);
        token2.increment();
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj7 = token6.getValue();
        token6.increment();
        java.lang.String str9 = token6.toString();
        boolean boolean11 = token6.equals((java.lang.Object) (short) 10);
        java.lang.String str12 = token6.toString();
        boolean boolean13 = token2.equals((java.lang.Object) token6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str9, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str12, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Class<?> wildcardClass4 = token3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 2, "P0Y000DT00000.101", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.101" + "'", str3, "P0Y000DT00000.101");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 98, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) 35, "P0Y000DT00000.0030", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0030" + "'", str5, "P0Y000DT00000.0030");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        int int3 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        token4.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        int int8 = token7.getCount();
        int int9 = token7.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean14 = token12.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = token12.getValue();
        java.lang.Object obj16 = token12.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12);
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12, (int) (byte) 10);
        int int20 = token12.getCount();
        boolean boolean21 = token7.equals((java.lang.Object) int20);
        boolean boolean22 = token4.equals((java.lang.Object) token7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 1 + "'", obj15, (short) 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 1 + "'", obj16, (short) 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        java.lang.String str3 = token2.toString();
        java.lang.String str4 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str4, 97);
        int int7 = token6.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.10132");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.10132" + "'", str2, "P0Y000DT00000.10132");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 11, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(10L, 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.90S" + "'", str2, "P0Y0M0DT0H0M0.90S");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        java.lang.Object obj4 = token2.getValue();
        java.lang.Object obj5 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token7.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, (int) 'a');
        int int11 = token10.getCount();
        boolean boolean12 = token2.equals((java.lang.Object) token10);
        token2.increment();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 1 + "'", obj4, (short) 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 3, (long) 98, "P0000Y000DT00000.0973");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.0973" + "'", str3, "P0000Y000DT00000.0973");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Class<?> wildcardClass4 = token3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y0M0DT0H0M0.035S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.035100" + "'", str3, "P0Y000DT00000.035100");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y0M0DT0H0M0.04S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.041" + "'", str3, "P0Y000DT00000.041");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        boolean boolean11 = token7.equals((java.lang.Object) (byte) 100);
        int int12 = token7.getCount();
        boolean boolean14 = token7.equals((java.lang.Object) "d");
        boolean boolean15 = token2.equals((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token16, 98);
        java.lang.Class<?> wildcardClass19 = token16.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 33, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.67-1", (int) (byte) -1);
        int int3 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        boolean boolean5 = token1.equals((java.lang.Object) "P0Y000DT00000.7510");
        java.lang.String str6 = token1.toString();
        java.lang.Object obj7 = token1.getValue();
        java.lang.Class<?> wildcardClass8 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass8);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass8, (int) '4');
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str15 = token14.toString();
        int int16 = token14.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int16, (int) '4');
        java.lang.Class<?> wildcardClass19 = token18.getClass();
        boolean boolean20 = token11.equals((java.lang.Object) token18);
        java.lang.Object obj21 = token18.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "###" + "'", str6, "###");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        token1.increment();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3, (int) (short) -1);
        java.lang.Class<?> wildcardClass6 = token5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 35, "100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Class<?> wildcardClass4 = token3.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100", 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int7 = token6.getCount();
        java.lang.String str8 = token6.toString();
        boolean boolean9 = token3.equals((java.lang.Object) str8);
        int int10 = token3.getCount();
        java.lang.String str11 = token3.toString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.100" + "'", str11, "0:00:00.100");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "11", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11" + "'", str3, "11");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 33, "P0Y0M0DT0H0M0.046S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.04633" + "'", str2, "P0Y000DT00000.04633");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 97, "0:00:00.032");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.032" + "'", str3, "0:00:00.032");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10L);
        java.lang.Object obj2 = token1.getValue();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj2, (int) (short) 0);
        int int6 = token5.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int6, 100);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10L + "'", obj2, 10L);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S");
        int int2 = token1.getCount();
        java.lang.Object obj3 = token1.getValue();
        int int4 = token1.getCount();
        token1.increment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0000Y0M0DT0H0M0.000S" + "'", obj3, "P0000Y0M0DT0H0M0.000S");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 1 + "'", obj10, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 1, (int) (short) 100);
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        java.lang.String str6 = token4.toString();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 1 + "'", obj3, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str6, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str3, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 2, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str3, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) '4', "P0Y0M0DT0H0M0.000SP0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000-48P0Y000DT00000.000-48" + "'", str3, "P0Y000DT00000.000-48P0Y000DT00000.000-48");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S");
        int int2 = token1.getCount();
        java.lang.Object obj3 = token1.getValue();
        int int4 = token1.getCount();
        java.lang.Class<?> wildcardClass5 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean11 = token9.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str12 = token9.toString();
        int int13 = token9.getCount();
        java.lang.String str14 = token9.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str14, (int) 'a');
        boolean boolean17 = token7.equals((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0000Y0M0DT0H0M0.000S" + "'", obj3, "P0000Y0M0DT0H0M0.000S");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        java.lang.Object obj4 = token3.getValue();
        java.lang.Class<?> wildcardClass5 = token3.getClass();
        boolean boolean6 = token1.equals((java.lang.Object) wildcardClass5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Object obj8 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, 100);
        java.lang.Class<?> wildcardClass11 = token10.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '#' + "'", obj4, '#');
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "100");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1);
        boolean boolean9 = token5.equals((java.lang.Object) token8);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = token11.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) '#', "P0000Y000DT00000.010-98", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.010-98" + "'", str5, "P0000Y000DT00000.010-98");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 32, (long) 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.066S" + "'", str2, "P0Y0M0DT0H0M0.066S");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S");
        java.lang.String str2 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean7 = token5.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj8 = token5.getValue();
        int int9 = token5.getCount();
        java.lang.String str10 = token5.toString();
        boolean boolean11 = token1.equals((java.lang.Object) token5);
        token5.increment();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y0M0DT0H0M0.000S" + "'", str2, "P0000Y0M0DT0H0M0.000S");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 35, (long) '#', "P0Y000DT00000.9887");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9887" + "'", str3, "P0Y000DT00000.9887");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 52, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str3, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        int int3 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str5 = token1.toString();
        int int6 = token1.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "##" + "'", str5, "##");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 0, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 10);
        java.lang.Class<?> wildcardClass5 = token4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) ' ', "P0Y0M0DT0H0M0.92S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9231" + "'", str3, "P0Y000DT00000.9231");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 4, (long) 34, "P0Y0M0DT0H0M0.002S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00230" + "'", str5, "P0Y000DT00000.00230");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        token2.increment();
        java.lang.Object obj4 = token2.getValue();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "0 0econ00" + "'", obj4, "0 0econ00");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 33);
        token4.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.6497", (int) '4');
        java.lang.Class<?> wildcardClass3 = token2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token5.increment();
        token5.increment();
        token5.increment();
        int int9 = token5.getCount();
        java.lang.Object obj10 = token5.getValue();
        java.lang.Object obj11 = token5.getValue();
        boolean boolean12 = token1.equals((java.lang.Object) token5);
        java.lang.Object obj13 = token5.getValue();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + '#' + "'", obj10, '#');
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 2, (long) 10, "P0Y000DT00000.100-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.100-1" + "'", str5, "P0Y000DT00000.100-1");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int2, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.0020", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0020" + "'", str3, "P0Y000DT00000.0020");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 52, 0L, "P0Y000DT00000.098-6", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.098-6" + "'", str5, "P0Y000DT00000.098-6");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        int int14 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.355");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.025S" + "'", str2, "P0Y0M0DT0H0M0.025S");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100", 1);
        java.lang.String str4 = token3.toString();
        int int5 = token3.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int5, (int) (short) 1);
        java.lang.String str8 = token7.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.100" + "'", str4, "0:00:00.100");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj4 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        int int7 = token6.getCount();
        boolean boolean8 = token1.equals((java.lang.Object) token6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, (-1));
        token6.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        int int14 = token13.getCount();
        java.lang.Class<?> wildcardClass15 = token13.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        boolean boolean17 = token6.equals((java.lang.Object) token13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        token1.increment();
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 5, (long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.96S" + "'", str2, "P0Y0M0DT0H0M0.96S");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.0020", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0020" + "'", str3, "P0Y000DT00000.0020");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        java.lang.String str3 = token2.toString();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 2);
        token6.increment();
        token6.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        int int10 = token6.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 5, (long) (short) 10, "P0Y000DT00000.0422");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0422" + "'", str3, "P0Y000DT00000.0422");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, (long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 33, "P0Y0M0DT0H0M0.000SP0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000-67P0Y000DT00000.000-67" + "'", str3, "P0Y000DT00000.000-67P0Y000DT00000.000-67");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 97, "P0Y0M0DT0H0M0.050S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.05097" + "'", str5, "P0Y000DT00000.05097");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', 0L, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 5, "P0Y000DT00000.3232");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.3232" + "'", str3, "P0Y000DT00000.3232");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 98, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y0M0DT0H0M0.04S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0497" + "'", str2, "P0Y000DT00000.0497");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        token2.increment();
        int int6 = token2.getCount();
        token2.increment();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) 52, "0 days");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a00" + "'", str3, "0 0a00");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.901", (int) 'a');
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 5, "P0Y000DT00000.36-65");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.36-65" + "'", str3, "P0Y000DT00000.36-65");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        token5.increment();
        java.lang.String str7 = token5.toString();
        token5.increment();
        boolean boolean9 = token2.equals((java.lang.Object) token5);
        java.lang.Object obj10 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11" + "'", str7, "11");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "10" + "'", obj10, "10");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int2 = token1.getCount();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3, 0);
        int int7 = token6.getCount();
        java.lang.Class<?> wildcardClass8 = token6.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "100");
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token4.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, (int) 'a');
        int int8 = token7.getCount();
        token7.increment();
        java.lang.Object obj10 = token7.getValue();
        boolean boolean11 = token1.equals(obj10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "##");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "##");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        java.lang.String str4 = token2.toString();
        java.lang.String str5 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str5, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 11, "P0Y000DT00000.10132");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.10132" + "'", str2, "P0Y000DT00000.10132");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean23 = token21.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj24 = token21.getValue();
        boolean boolean25 = token19.equals((java.lang.Object) token21);
        boolean boolean26 = token16.equals((java.lang.Object) token21);
        int int27 = token16.getCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int15 = token14.getCount();
        java.lang.String str16 = token14.toString();
        java.lang.String str17 = token14.toString();
        java.lang.String str18 = token14.toString();
        boolean boolean19 = token11.equals((java.lang.Object) token14);
        java.lang.String str20 = token11.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        boolean boolean25 = token23.equals((java.lang.Object) (-1.0d));
        int int26 = token23.getCount();
        java.lang.Class<?> wildcardClass27 = token23.getClass();
        boolean boolean28 = token11.equals((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = token11.getValue();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        boolean boolean31 = token8.equals((java.lang.Object) wildcardClass30);
        token8.increment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str20, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '4' + "'", obj29, '4');
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 98, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 2, "false", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fal0e" + "'", str3, "fal0e");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 1.0d, (int) (byte) -1);
        java.lang.Object obj3 = token2.getValue();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 1.0d + "'", obj3, 1.0d);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        java.lang.Object obj3 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj3);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 5, (long) (short) 0, "0 0a00", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 0a00" + "'", str5, "0 0a00");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) 1, "P0Y000DT00000.092-100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.092-100" + "'", str3, "P0Y000DT00000.092-100");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.000SP0Y0M0DT0H0M0.000S", 0);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((-1L), (long) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2, "P0Y0M0DT0H0M0.011S");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) 1, "P0Y000DT00000.022-35");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.022-35" + "'", str3, "P0Y000DT00000.022-35");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        java.lang.Object obj4 = token3.getValue();
        java.lang.Class<?> wildcardClass5 = token3.getClass();
        boolean boolean6 = token1.equals((java.lang.Object) wildcardClass5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Object obj8 = token1.getValue();
        boolean boolean10 = token1.equals((java.lang.Object) 10.0d);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 0);
        java.lang.String str13 = token1.toString();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '#' + "'", obj4, '#');
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100" + "'", str13, "100");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        java.lang.String str2 = token1.toString();
        java.lang.String str3 = token1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "-1" + "'", obj9, "-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        token2.increment();
        java.lang.String str4 = token2.toString();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean9 = token7.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj10 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        int int13 = token12.getCount();
        boolean boolean14 = token7.equals((java.lang.Object) token12);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean14);
        java.lang.String str16 = token15.toString();
        java.lang.Object obj17 = token15.getValue();
        boolean boolean18 = token2.equals((java.lang.Object) token15);
        java.lang.Object obj19 = token2.getValue();
        java.lang.Object obj20 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11" + "'", str4, "11");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "false" + "'", str16, "false");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 1 + "'", obj19, (short) 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 1 + "'", obj20, (short) 1);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.7510");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.7510" + "'", str2, "P0Y000DT00000.7510");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "0:00:00.001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.001" + "'", str2, "0:00:00.001");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        java.lang.String str5 = token2.toString();
        boolean boolean7 = token2.equals((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass8 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 98, (long) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.03S" + "'", str2, "P0Y0M0DT0H0M0.03S");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 5, "P0Y000DT00000.661");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.661" + "'", str2, "P0Y000DT00000.661");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int2 = token1.getCount();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = token5.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        int int16 = token1.getCount();
        token1.increment();
        java.lang.Object obj18 = token1.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str9, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) (-1), "P0Y000DT00000.9897");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9897" + "'", str3, "P0Y000DT00000.9897");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int2 = token1.getCount();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3);
        token4.increment();
        java.lang.Object obj6 = token4.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        java.lang.String str5 = token2.toString();
        java.lang.String str6 = token2.toString();
        java.lang.String str7 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        java.lang.String str11 = token10.toString();
        boolean boolean13 = token10.equals((java.lang.Object) "10");
        int int14 = token10.getCount();
        int int15 = token10.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token17.increment();
        int int19 = token17.getCount();
        token17.increment();
        boolean boolean21 = token10.equals((java.lang.Object) token17);
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean25 = token23.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str26 = token23.toString();
        int int27 = token23.getCount();
        boolean boolean28 = token17.equals((java.lang.Object) int27);
        java.lang.Object obj29 = token17.getValue();
        boolean boolean30 = token2.equals(obj29);
        int int31 = token2.getCount();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str6, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str7, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1" + "'", str26, "-1");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '#' + "'", obj29, '#');
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 33 + "'", int31 == 33);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) -1, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.78S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.780" + "'", str3, "P0Y000DT00000.780");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', 0L, "P0Y000DT00000.0982");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0982" + "'", str3, "P0Y000DT00000.0982");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 5, (long) 98, "P0Y0M0DT0H0M0.064S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06493" + "'", str3, "P0Y000DT00000.06493");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) -1, "P0Y000DT00000.0311");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0311" + "'", str3, "P0Y000DT00000.0311");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        int int2 = token1.getCount();
        token1.increment();
        token1.increment();
        token1.increment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.0342", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0342" + "'", str3, "P0Y000DT00000.0342");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.03565", 5);
        int int3 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100");
        int int6 = token5.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        int int8 = token5.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        boolean boolean10 = token2.equals((java.lang.Object) token9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) 2, "P0Y0M0DT0H0M0.011S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0113" + "'", str5, "P0Y000DT00000.0113");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 1, "P0Y000DT00000.4735");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.4735" + "'", str3, "P0Y000DT00000.4735");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 33, "P0Y000DT00000.089-87", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.089-87" + "'", str5, "P0Y000DT00000.089-87");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y0M0DT0H0M0.05S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.051" + "'", str3, "P0Y000DT00000.051");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (-1));
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj5, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "0 0econ00" + "'", obj5, "0 0econ00");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.String str9 = token8.toString();
        boolean boolean10 = token4.equals((java.lang.Object) token8);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str9, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, 2);
        boolean boolean9 = token1.equals((java.lang.Object) 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.00210");
        token1.increment();
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 2, "H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, 0L, "P0Y000DT00000.09698", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09698" + "'", str5, "P0Y000DT00000.09698");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 11, "d");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.011S", 3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        java.lang.String str7 = token6.toString();
        boolean boolean8 = token2.equals((java.lang.Object) token6);
        java.lang.String str9 = token6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str7, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str9, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((-1L), (long) 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.012S" + "'", str2, "P0Y0M0DT0H0M0.012S");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        boolean boolean9 = token5.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj10 = token5.getValue();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = token2.equals(obj10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean16 = token14.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str17 = token14.toString();
        int int18 = token14.getCount();
        java.lang.String str19 = token14.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str19, (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj25 = token24.getValue();
        int int26 = token24.getCount();
        boolean boolean27 = token21.equals((java.lang.Object) token24);
        java.lang.Object obj28 = token24.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token30 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token24, 0);
        int int31 = token30.getCount();
        boolean boolean32 = token2.equals((java.lang.Object) token30);
        java.lang.String str33 = token2.toString();
        java.lang.Class<?> wildcardClass34 = token2.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) -1 + "'", obj10, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1" + "'", str19, "-1");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0f + "'", obj28, 100.0f);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " " + "'", str33, " ");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y0M0DT0H0M0.099S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.099100" + "'", str3, "P0Y000DT00000.099100");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.023S" + "'", str2, "P0Y0M0DT0H0M0.023S");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1);
        boolean boolean9 = token5.equals((java.lang.Object) token8);
        java.lang.Object obj10 = token5.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5, 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean16 = token14.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj18 = token17.getValue();
        int int19 = token17.getCount();
        token17.increment();
        java.lang.String str21 = token17.toString();
        boolean boolean22 = token12.equals((java.lang.Object) token17);
        java.lang.Object obj23 = token17.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "1");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "P0Y0M0DT0H0M0.75S" + "'", obj18, "P0Y0M0DT0H0M0.75S");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "P0Y0M0DT0H0M0.75SP0Y0M0DT0H0M0.75S" + "'", str21, "P0Y0M0DT0H0M0.75SP0Y0M0DT0H0M0.75S");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "P0Y0M0DT0H0M0.75S" + "'", obj23, "P0Y0M0DT0H0M0.75S");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 1, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.0480");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0480" + "'", str2, "P0Y000DT00000.0480");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        java.lang.String str20 = token15.toString();
        java.lang.String str21 = token15.toString();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str20, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str21, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 100);
        java.lang.Object obj7 = token2.getValue();
        int int8 = token2.getCount();
        token2.increment();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "10" + "'", obj7, "10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.101-90");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.101-90" + "'", str2, "P0Y000DT00000.101-90");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 33, (long) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.77S" + "'", str2, "P0Y0M0DT0H0M0.77S");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 5, "34", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "34" + "'", str3, "34");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 32, (-1L), "-1-1", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1-1" + "'", str5, "-1-1");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 33, "P0Y000DT00000.990");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.990" + "'", str2, "P0Y000DT00000.990");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100", 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int7 = token6.getCount();
        java.lang.String str8 = token6.toString();
        boolean boolean9 = token3.equals((java.lang.Object) str8);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean9, 3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 3, (int) 'a');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj8 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.String str10 = token7.toString();
        boolean boolean11 = token2.equals((java.lang.Object) token7);
        java.lang.Object obj12 = token7.getValue();
        java.lang.Object obj13 = token7.getValue();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        java.lang.Object obj20 = token2.getValue();
        token2.increment();
        java.lang.Object obj22 = token2.getValue();
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
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '4' + "'", obj20, '4');
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '4' + "'", obj22, '4');
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "52" + "'", str3, "52");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        java.lang.Object obj4 = token2.getValue();
        java.lang.Object obj5 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token7.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, (int) 'a');
        int int11 = token10.getCount();
        boolean boolean12 = token2.equals((java.lang.Object) token10);
        java.lang.String str13 = token2.toString();
        java.lang.Object obj14 = token2.getValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 1 + "'", obj4, (short) 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 1 + "'", obj14, (short) 1);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj17 = token16.getValue();
        token16.increment();
        token16.increment();
        int int20 = token16.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        token22.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token22);
        boolean boolean25 = token16.equals((java.lang.Object) token24);
        boolean boolean26 = token11.equals((java.lang.Object) token16);
        java.lang.Class<?> wildcardClass27 = token11.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "##");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "##");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 34 + "'", int20 == 34);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (short) 10, "P0Y000DT00000.097-99", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.097-99" + "'", str5, "P0Y000DT00000.097-99");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, 2);
        boolean boolean9 = token2.equals((java.lang.Object) token6);
        java.lang.Class<?> wildcardClass10 = token6.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 52, (long) 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.046S" + "'", str2, "P0Y0M0DT0H0M0.046S");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y0M0DT0H0M0.029S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0291" + "'", str2, "P0Y000DT00000.0291");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) '4', "P0Y000DT00000.99100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.99100" + "'", str3, "P0Y000DT00000.99100");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils0 = new org.apache.commons.lang.time.DurationFormatUtils();
        java.lang.Class<?> wildcardClass1 = durationFormatUtils0.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) durationFormatUtils0, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) durationFormatUtils0, (int) (short) 0);
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils6 = new org.apache.commons.lang.time.DurationFormatUtils();
        boolean boolean7 = token5.equals((java.lang.Object) durationFormatUtils6);
        java.lang.String str8 = token5.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        int int3 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, (int) (short) 1);
        java.lang.Object obj7 = token4.getValue();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass8, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "##");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "##");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 10, "P0Y000DT00000.041");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.041" + "'", str3, "P0Y000DT00000.041");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 34, (long) 3, "P0Y000DT00000.02510");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02510" + "'", str3, "P0Y000DT00000.02510");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 3, "###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###" + "'", str2, "###");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 2, (long) 11, "P0Y000DT00000.068100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.068100" + "'", str3, "P0Y000DT00000.068100");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.67-10");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 34, "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", str2, "P0Y0M0DT0H0M0.002S");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (short) 100, "100100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100100" + "'", str5, "100100");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 10);
        token2.increment();
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 0, "P0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.011-35P0Y000DT00000.011-35P0Y000DT00000.011-35" + "'", str5, "P0Y000DT00000.011-35P0Y000DT00000.011-35P0Y000DT00000.011-35");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 97, "P0000Y0M0DT0H0M0.000S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.00096" + "'", str5, "P0000Y000DT00000.00096");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.0001P0Y000DT00000.0001", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0001P0Y000DT00000.0001" + "'", str3, "P0Y000DT00000.0001P0Y000DT00000.0001");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.9634", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9634" + "'", str3, "P0Y000DT00000.9634");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        int int15 = token1.getCount();
        int int16 = token1.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "##");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "##");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 98, 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.02S" + "'", str2, "P0Y0M0DT0H0M0.02S");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.9897", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9897" + "'", str3, "P0Y000DT00000.9897");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.03511");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03511" + "'", str2, "P0Y000DT00000.03511");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 100, "P0Y0M0DT0H0M0.69S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.69100" + "'", str5, "P0Y000DT00000.69100");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010", 10);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, (long) 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.005S" + "'", str2, "P0Y0M0DT0H0M0.005S");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.011S", 3);
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100");
        int int6 = token5.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5, 33);
        boolean boolean9 = token2.equals((java.lang.Object) token8);
        java.lang.Class<?> wildcardClass10 = token8.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", obj3, "P0Y0M0DT0H0M0.011S");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y0M0DT0H0M0.66S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.6610" + "'", str2, "P0Y000DT00000.6610");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str3 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) 34, "P0Y000DT00000.00-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00-31" + "'", str3, "P0Y000DT00000.00-31");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.36-65", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.36-65" + "'", str3, "P0Y000DT00000.36-65");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 4, (long) 98, "P0Y000DT00000.013", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.013" + "'", str5, "P0Y000DT00000.013");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ', (int) (short) -1);
        java.lang.String str3 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str5 = token2.toString();
        java.lang.Class<?> wildcardClass6 = token2.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.0030", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0030" + "'", str3, "P0Y000DT00000.0030");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        token1.increment();
        int int3 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) ' ');
        java.lang.String str6 = token5.toString();
        java.lang.Object obj7 = token5.getValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str6, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "-1-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "-1-1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "-1-1");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str3 = token2.toString();
        token2.increment();
        java.lang.String str5 = token2.toString();
        java.lang.Object obj6 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1010" + "'", str5, "1010");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10 + "'", obj6, 10);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 4, 10L, "P0Y000DT00000.921");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.921" + "'", str3, "P0Y000DT00000.921");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 33);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        token1.increment();
        int int5 = token1.getCount();
        java.lang.Object obj6 = token1.getValue();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj6, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 35, "P0Y000DT00000.0510");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0510" + "'", str2, "P0Y000DT00000.0510");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 11, "P0Y000DT00000.087-33");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.087-33" + "'", str2, "P0Y000DT00000.087-33");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 35, (long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.66S" + "'", str2, "P0Y0M0DT0H0M0.66S");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        boolean boolean6 = token2.equals((java.lang.Object) (byte) 100);
        boolean boolean8 = token2.equals((java.lang.Object) "P0Y0M0DT0H0M0.91S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        token10.increment();
        java.lang.Class<?> wildcardClass12 = token10.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass12, (int) (short) -1);
        java.lang.Object obj15 = token14.getValue();
        boolean boolean16 = token2.equals((java.lang.Object) token14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S", (int) (short) -1);
        boolean boolean8 = token1.equals((java.lang.Object) (short) -1);
        java.lang.String str9 = token1.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "####" + "'", str9, "####");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 1, "P0Y000DT00000.031-10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.031-10" + "'", str3, "P0Y000DT00000.031-10");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "0:00:00.010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.010" + "'", str2, "0:00:00.010");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) 2, "P0Y000DT00000.05265", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.05265" + "'", str5, "P0Y000DT00000.05265");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 34);
        int int4 = token1.getCount();
        int int5 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj9 = token8.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        java.lang.String str11 = token8.toString();
        java.lang.Object obj12 = token8.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean16 = token14.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str17 = token14.toString();
        int int18 = token14.getCount();
        java.lang.String str19 = token14.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str19, (int) 'a');
        int int22 = token21.getCount();
        java.lang.String str23 = token21.toString();
        java.lang.String str24 = token21.toString();
        boolean boolean25 = token8.equals((java.lang.Object) token21);
        java.lang.String str26 = token21.toString();
        boolean boolean27 = token1.equals((java.lang.Object) str26);
        token1.increment();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str11, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1" + "'", str19, "-1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str23, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str24, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str26, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 100, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 100, "P0Y0M0DT0H0M0.05S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05100" + "'", str3, "P0Y000DT00000.05100");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 100, "P0Y000DT00000.99-2");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.99-2" + "'", str3, "P0Y000DT00000.99-2");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 34);
        int int7 = token6.getCount();
        java.lang.Class<?> wildcardClass8 = token6.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.10132");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        java.lang.String str5 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str9 = token8.toString();
        boolean boolean10 = token4.equals((java.lang.Object) str9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean14 = token12.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        boolean boolean15 = token4.equals((java.lang.Object) token12);
        boolean boolean16 = token1.equals((java.lang.Object) boolean15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) '4');
        java.lang.Object obj5 = token2.getValue();
        java.lang.String str6 = token2.toString();
        java.lang.String str7 = token2.toString();
        java.lang.Class<?> wildcardClass8 = token2.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "#");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "#");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#" + "'", str6, "#");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#" + "'", str7, "#");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.97S" + "'", str2, "P0Y0M0DT0H0M0.97S");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.003");
        java.lang.String str2 = token1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.003" + "'", str2, "0:00:00.003");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.32S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.32S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.32S");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 10, 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.91S" + "'", str2, "P0Y0M0DT0H0M0.91S");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 11, "P0Y000DT00000.0001P0Y000DT00000.0001", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0001P0Y000DT00000.0001" + "'", str3, "P0Y000DT00000.0001P0Y000DT00000.0001");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.089-87");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.068S", (int) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int5 = token4.getCount();
        java.lang.Class<?> wildcardClass6 = token4.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass6, 0);
        boolean boolean10 = token2.equals((java.lang.Object) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token12.increment();
        token12.increment();
        boolean boolean16 = token12.equals((java.lang.Object) "P0Y000DT00000.7510");
        java.lang.String str17 = token12.toString();
        java.lang.Object obj18 = token12.getValue();
        boolean boolean19 = token2.equals((java.lang.Object) token12);
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils20 = new org.apache.commons.lang.time.DurationFormatUtils();
        java.lang.Class<?> wildcardClass21 = durationFormatUtils20.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) durationFormatUtils20, (int) (byte) 10);
        java.lang.String str24 = token23.toString();
        java.lang.String str25 = token23.toString();
        boolean boolean26 = token2.equals((java.lang.Object) str25);
        java.lang.Object obj27 = token2.getValue();
        int int28 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "###" + "'", str17, "###");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '#' + "'", obj18, '#');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "P0Y0M0DT0H0M0.068S" + "'", obj27, "P0Y0M0DT0H0M0.068S");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int12);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str7, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.671");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.671" + "'", str2, "P0Y000DT00000.671");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj17 = token16.getValue();
        token16.increment();
        token16.increment();
        int int20 = token16.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        token22.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token22);
        boolean boolean25 = token16.equals((java.lang.Object) token24);
        boolean boolean26 = token11.equals((java.lang.Object) token16);
        org.apache.commons.lang.time.DurationFormatUtils.Token token28 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "##");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "##");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 34 + "'", int20 == 34);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str5 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ');
        java.lang.Object obj9 = token8.getValue();
        java.lang.Class<?> wildcardClass10 = token8.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.0000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0000" + "'", str2, "P0Y000DT00000.0000");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 97, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.97S" + "'", str2, "P0Y0M0DT0H0M0.97S");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
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
        int int15 = token14.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "##");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "##");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.35S");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10);
        int int4 = token3.getCount();
        java.lang.Class<?> wildcardClass5 = token3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.099100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.099100" + "'", str3, "P0Y000DT00000.099100");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, (long) 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.033S" + "'", str2, "P0Y0M0DT0H0M0.033S");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.013");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.013" + "'", str2, "P0Y000DT00000.013");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y0M0DT0H0M0.098S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.098100" + "'", str3, "P0Y000DT00000.098100");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.3210");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.3210" + "'", str2, "P0Y000DT00000.3210");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 34, "P0Y000DT00000.09810");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09810" + "'", str2, "P0Y000DT00000.09810");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        int int14 = token5.getCount();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) -1 + "'", obj3, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "###" + "'", str10, "###");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (short) 1, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) '#', "P0Y000DT00000.0335", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0335" + "'", str5, "P0Y000DT00000.0335");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str5 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ');
        java.lang.Object obj9 = token8.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str7 = token6.toString();
        boolean boolean8 = token2.equals((java.lang.Object) str7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean12 = token10.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        boolean boolean13 = token2.equals((java.lang.Object) token10);
        java.lang.Object obj14 = token10.getValue();
        java.lang.String str15 = token10.toString();
        java.lang.String str16 = token10.toString();
        java.lang.String str17 = token10.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1" + "'", str15, "-1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1" + "'", str16, "-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 11, "0 days 0 hours 0 minutes 0 seconds", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str5, "0 0a000 0 hour 0 0inute00 0 econ00");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.91S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.910" + "'", str2, "P0Y000DT00000.910");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.102", (int) (byte) -1);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 0, (int) (byte) 10);
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        java.lang.Class<?> wildcardClass5 = token2.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1);
        boolean boolean9 = token5.equals((java.lang.Object) token8);
        java.lang.String str10 = token8.toString();
        int int11 = token8.getCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Object obj6 = token5.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj6);
        int int8 = token7.getCount();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "##");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "##");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 32, (long) 98, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 5, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.01S" + "'", str2, "P0Y0M0DT0H0M0.01S");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5, (int) (short) -1);
        java.lang.Object obj9 = token5.getValue();
        java.lang.Class<?> wildcardClass10 = token5.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        java.lang.Class<?> wildcardClass12 = token5.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "1");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str3, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5, 0);
        java.lang.Object obj8 = token5.getValue();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "1" + "'", obj8, "1");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass2 = token1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        java.lang.String str4 = token2.toString();
        java.lang.String str5 = token2.toString();
        java.lang.String str6 = token2.toString();
        token2.increment();
        java.lang.String str8 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 4);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj14 = token13.getValue();
        token13.increment();
        token13.increment();
        int int17 = token13.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int17, (int) (short) -1);
        boolean boolean20 = token2.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11" + "'", str8, "11");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 34 + "'", int17 == 34);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        java.lang.Object obj4 = token2.getValue();
        java.lang.Object obj5 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token7.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, (int) 'a');
        int int11 = token10.getCount();
        boolean boolean12 = token2.equals((java.lang.Object) token10);
        java.lang.String str13 = token2.toString();
        int int14 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 1 + "'", obj4, (short) 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int2 = token1.getCount();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3);
        token4.increment();
        int int6 = token4.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        token9.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9, 5);
        boolean boolean13 = token4.equals((java.lang.Object) token9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 2, "4", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        java.lang.String str4 = token2.toString();
        java.lang.String str5 = token2.toString();
        java.lang.String str6 = token2.toString();
        int int7 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11, (int) '4');
        boolean boolean14 = token8.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.002-88", 100);
        token2.increment();
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str2, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) 35, "P0Y0M0DT0H0M0.00S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0025" + "'", str5, "P0Y000DT00000.0025");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean10 = token8.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str11 = token8.toString();
        int int12 = token8.getCount();
        java.lang.String str13 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str13, (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str13, (-1));
        boolean boolean18 = token2.equals((java.lang.Object) token17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str5 = token2.toString();
        java.lang.String str6 = token2.toString();
        java.lang.String str7 = token2.toString();
        boolean boolean9 = token2.equals((java.lang.Object) "11");
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean9);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str6, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str7, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) (short) 1, "P0Y000DT00000.0498");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0498" + "'", str3, "P0Y000DT00000.0498");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 10, " ", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.10132");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.10132" + "'", str2, "P0Y000DT00000.10132");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y0M0DT0H0M0.64S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.641" + "'", str3, "P0Y000DT00000.641");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str3 = token2.toString();
        int int4 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj6 = token5.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int10 = token9.getCount();
        java.lang.String str11 = token9.toString();
        java.lang.String str12 = token9.toString();
        java.lang.String str13 = token9.toString();
        int int14 = token9.getCount();
        boolean boolean15 = token5.equals((java.lang.Object) int14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str7, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str5 = token2.toString();
        token2.increment();
        int int7 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int7, 97);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int7);
        java.lang.Object obj11 = token10.getValue();
        java.lang.String str12 = token10.toString();
        token10.increment();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 33 + "'", obj11, 33);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "33" + "'", str12, "33");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 4, (long) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.096S" + "'", str2, "P0Y0M0DT0H0M0.096S");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean6 = token4.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj7 = token4.getValue();
        boolean boolean8 = token2.equals((java.lang.Object) token4);
        java.lang.String str9 = token2.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str9, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 0, "P0Y000DT00000.0350", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0350" + "'", str5, "P0Y000DT00000.0350");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        int int9 = token8.getCount();
        java.lang.String str10 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, (int) ' ');
        java.lang.Class<?> wildcardClass13 = token12.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str10, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y000DT00000.002-88");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.002-88" + "'", str3, "P0Y000DT00000.002-88");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
        java.lang.Object obj19 = token18.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str11, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str12, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "###" + "'", str17, "###");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "###");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "###");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y000DT00000.00034", (int) (byte) 1);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.011S", 3);
        token2.increment();
        java.lang.String str4 = token2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011S" + "'", str4, "P0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011S");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        java.lang.Object obj9 = token8.getValue();
        java.lang.String str10 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "-1" + "'", obj9, "-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str10, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 97, 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.03S" + "'", str2, "P0Y0M0DT0H0M0.03S");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        token9.increment();
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
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 4, (long) (byte) 10, "P0Y000DT00000.900", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.900" + "'", str5, "P0Y000DT00000.900");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y0M0DT0H0M0.48S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.4832" + "'", str3, "P0Y000DT00000.4832");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.921", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.921" + "'", str3, "P0Y000DT00000.921");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 98, "P0Y000DT00000.6899", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6899" + "'", str3, "P0Y000DT00000.6899");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 3, "P0Y000DT00000.97-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.97-1" + "'", str3, "P0Y000DT00000.97-1");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "cla0 org.apache.co0on0.lang.ti0e.DurationForatUtil0$Token");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cla0 org.apache.co0on0.lang.ti0e.DurationForatUtil0$Token" + "'", str2, "cla0 org.apache.co0on0.lang.ti0e.DurationForatUtil0$Token");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str3, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj10 = token9.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        java.lang.String str12 = token9.toString();
        token9.increment();
        int int14 = token9.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int14, 97);
        java.lang.Object obj17 = token16.getValue();
        java.lang.String str18 = token16.toString();
        boolean boolean19 = token6.equals((java.lang.Object) str18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str12, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 33 + "'", int14 == 33);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 33 + "'", obj17, 33);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "33333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333" + "'", str18, "33333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 5, (long) 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.030S" + "'", str2, "P0Y0M0DT0H0M0.030S");
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        java.lang.Object obj4 = token3.getValue();
        java.lang.Class<?> wildcardClass5 = token3.getClass();
        boolean boolean6 = token1.equals((java.lang.Object) wildcardClass5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Object obj8 = token1.getValue();
        java.lang.String str9 = token1.toString();
        java.lang.Object obj10 = token1.getValue();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '#' + "'", obj4, '#');
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100" + "'", str9, "100");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.097", 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.097");
        java.lang.String str4 = token3.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        java.lang.String str8 = token7.toString();
        int int9 = token7.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        java.lang.Object obj14 = token13.getValue();
        int int15 = token13.getCount();
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils16 = new org.apache.commons.lang.time.DurationFormatUtils();
        java.lang.Class<?> wildcardClass17 = durationFormatUtils16.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) durationFormatUtils16, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) durationFormatUtils16, (int) (short) 0);
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils22 = new org.apache.commons.lang.time.DurationFormatUtils();
        boolean boolean23 = token21.equals((java.lang.Object) durationFormatUtils22);
        boolean boolean24 = token13.equals((java.lang.Object) token21);
        boolean boolean25 = token10.equals((java.lang.Object) token13);
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean25, (int) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token28 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean25);
        boolean boolean29 = token3.equals((java.lang.Object) boolean25);
        java.lang.Class<?> wildcardClass30 = token3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.097" + "'", str4, "0:00:00.097");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj14, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 4, "P0Y000DT00000.99-2", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.99-2" + "'", str3, "P0Y000DT00000.99-2");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (short) 100, "S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "90" + "'", str5, "90");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) "10");
        int int6 = token2.getCount();
        int int7 = token2.getCount();
        token2.increment();
        java.lang.Object obj9 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0000Y000DT00000.6710", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.6710" + "'", str3, "P0000Y000DT00000.6710");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.052-99", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.052-99" + "'", str3, "P0Y000DT00000.052-99");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "m", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 98, (long) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.02S" + "'", str2, "P0Y0M0DT0H0M0.02S");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 34, (long) (short) 0, "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        token2.increment();
        java.lang.String str4 = token2.toString();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean9 = token7.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj10 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        int int13 = token12.getCount();
        boolean boolean14 = token7.equals((java.lang.Object) token12);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean14);
        java.lang.String str16 = token15.toString();
        java.lang.Object obj17 = token15.getValue();
        boolean boolean18 = token2.equals((java.lang.Object) token15);
        token2.increment();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11" + "'", str4, "11");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "false" + "'", str16, "false");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.67-10");
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        java.lang.String str9 = token8.toString();
        java.lang.Object obj10 = token8.getValue();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str9, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "-1" + "'", obj10, "-1");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y0M0DT0H0M0.032S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.032100" + "'", str2, "P0Y000DT00000.032100");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 35, (long) 10, "P0Y0M0DT0H0M0.75S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.75-25" + "'", str3, "P0Y000DT00000.75-25");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token22, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token28 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj29 = token28.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token30 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token28);
        org.apache.commons.lang.time.DurationFormatUtils.Token token33 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token34 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token33);
        java.lang.String str35 = token34.toString();
        boolean boolean36 = token30.equals((java.lang.Object) token34);
        boolean boolean37 = token25.equals((java.lang.Object) token30);
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
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str35, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 98);
        java.lang.Class<?> wildcardClass6 = token3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        int int4 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int4);
        token5.increment();
        token5.increment();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 98, "P0Y000DT00000.009-30", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.009-30" + "'", str5, "P0Y000DT00000.009-30");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        token2.increment();
        java.lang.String str4 = token2.toString();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean9 = token7.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj10 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        int int13 = token12.getCount();
        boolean boolean14 = token7.equals((java.lang.Object) token12);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean14);
        java.lang.String str16 = token15.toString();
        java.lang.Object obj17 = token15.getValue();
        boolean boolean18 = token2.equals((java.lang.Object) token15);
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean18);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11" + "'", str4, "11");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "false" + "'", str16, "false");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, (long) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean6 = token4.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str7 = token4.toString();
        int int8 = token4.getCount();
        java.lang.String str9 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str9, (int) 'a');
        int int12 = token11.getCount();
        java.lang.Object obj13 = null;
        boolean boolean14 = token11.equals(obj13);
        token11.increment();
        boolean boolean16 = token2.equals((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        int int19 = token18.getCount();
        java.lang.Class<?> wildcardClass20 = token18.getClass();
        boolean boolean21 = token2.equals((java.lang.Object) token18);
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y0M0DT0H0M0.72S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.7210" + "'", str2, "P0Y000DT00000.7210");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ', (int) (short) -1);
        int int3 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.002-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.002-1" + "'", str2, "P0Y000DT00000.002-1");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497" + "'", str2, "P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497P0Y000DT00000.6497");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
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
        token11.increment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str5 = token2.toString();
        java.lang.Object obj6 = token2.getValue();
        java.lang.String str7 = token2.toString();
        java.lang.Object obj8 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj14 = token13.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        java.lang.String str16 = token13.toString();
        boolean boolean17 = token10.equals((java.lang.Object) token13);
        int int18 = token13.getCount();
        java.lang.Object obj19 = token13.getValue();
        java.lang.String str20 = token13.toString();
        int int21 = token13.getCount();
        boolean boolean22 = token2.equals((java.lang.Object) int21);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str7, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str16, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str20, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj8 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.String str10 = token7.toString();
        boolean boolean11 = token2.equals((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Class<?> wildcardClass14 = token2.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10L);
        java.lang.Object obj2 = token1.getValue();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean8 = token6.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str9 = token6.toString();
        int int10 = token6.getCount();
        java.lang.String str11 = token6.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str11, (int) 'a');
        int int14 = token13.getCount();
        java.lang.String str15 = token13.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, (int) ' ');
        boolean boolean18 = token4.equals((java.lang.Object) ' ');
        java.lang.String str19 = token4.toString();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10L + "'", obj2, 10L);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str15, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "class java.lang.Long" + "'", str19, "class java.lang.Long");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 2);
        java.lang.String str5 = token4.toString();
        java.lang.Object obj6 = token4.getValue();
        token4.increment();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1010" + "'", str5, "1010");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "10");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.000S");
        token1.increment();
        java.lang.String str3 = token1.toString();
        int int4 = token1.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.000SP0Y0M0DT0H0M0.000S" + "'", str3, "P0Y0M0DT0H0M0.000SP0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str3, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 100, (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
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
        java.lang.Object obj19 = null;
        boolean boolean20 = token18.equals(obj19);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str9, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str10, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        int int9 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int9);
        java.lang.String str11 = token10.toString();
        int int12 = token10.getCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97" + "'", str11, "97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 0, "P0Y000DT00000.0097");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0097" + "'", str3, "P0Y000DT00000.0097");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) 2, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.000S");
        int int2 = token1.getCount();
        java.lang.Object obj3 = token1.getValue();
        int int4 = token1.getCount();
        java.lang.Class<?> wildcardClass5 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        boolean boolean9 = token7.equals((java.lang.Object) "100.0");
        java.lang.String str10 = token7.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0000Y0M0DT0H0M0.000S" + "'", obj3, "P0000Y0M0DT0H0M0.000S");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P0000Y0M0DT0H0M0.000S" + "'", str10, "P0000Y0M0DT0H0M0.000S");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        token4.increment();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str7, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        token4.increment();
        java.lang.String str6 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        int int10 = token9.getCount();
        boolean boolean11 = token4.equals((java.lang.Object) token9);
        token9.increment();
        int int13 = token9.getCount();
        java.lang.Class<?> wildcardClass14 = token9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "####################################################################################################################################################################################################" + "'", str6, "####################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) 52, "cla0 org.apache.co0on0.lang.ti0e.DurationForatUtil0$Token");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cla0 org.apache.co0on0.lang.ti0e.DurationForatUtil0$Token" + "'", str3, "cla0 org.apache.co0on0.lang.ti0e.DurationForatUtil0$Token");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        token5.increment();
        java.lang.String str7 = token5.toString();
        token5.increment();
        boolean boolean9 = token2.equals((java.lang.Object) token5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5, 32);
        int int12 = token11.getCount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11" + "'", str7, "11");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        java.lang.Object obj4 = token3.getValue();
        java.lang.Class<?> wildcardClass5 = token3.getClass();
        boolean boolean6 = token1.equals((java.lang.Object) wildcardClass5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Object obj8 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, 100);
        token7.increment();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '#' + "'", obj4, '#');
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "100");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        int int9 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int9);
        java.lang.Class<?> wildcardClass11 = token10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 35, "P0Y000DT00000.32100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.32100" + "'", str2, "P0Y000DT00000.32100");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 97, (long) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.003S" + "'", str2, "P0Y0M0DT0H0M0.003S");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        int int8 = token6.getCount();
        token6.increment();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 1);
        java.lang.Object obj5 = token2.getValue();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        java.lang.Object obj9 = token8.getValue();
        java.lang.String str10 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.011S", 3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 3);
        boolean boolean17 = token8.equals((java.lang.Object) 3);
        token8.increment();
        int int19 = token8.getCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "-1" + "'", obj9, "-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str10, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10L);
        java.lang.Object obj2 = token1.getValue();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        int int7 = token5.getCount();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10L + "'", obj2, 10L);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) '4');
        java.lang.Object obj6 = token5.getValue();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "-1-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "-1-1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "-1-1");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 3, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 1, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0000Y000DT00000.010-98", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.010-98" + "'", str3, "P0000Y000DT00000.010-98");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.780");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.780" + "'", str2, "P0Y000DT00000.780");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', 0L, "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cla00 org.apache.co00on0.lang.ti00e.DurationForatUtil0$Token" + "'", str3, "cla00 org.apache.co00on0.lang.ti00e.DurationForatUtil0$Token");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int6 = token5.getCount();
        java.lang.String str7 = token5.toString();
        java.lang.String str8 = token5.toString();
        java.lang.String str9 = token5.toString();
        boolean boolean10 = token2.equals((java.lang.Object) token5);
        java.lang.String str11 = token2.toString();
        java.lang.String str12 = token2.toString();
        java.lang.Class<?> wildcardClass13 = token2.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str11, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str12, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        int int3 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        token4.increment();
        token4.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, (int) (short) 1);
        int int9 = token8.getCount();
        token8.increment();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str3, (int) (byte) 10);
        java.lang.String str6 = token5.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        java.lang.Object obj10 = token9.getValue();
        java.lang.Object obj11 = token9.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean15 = token13.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str16 = token13.toString();
        int int17 = token13.getCount();
        java.lang.String str18 = token13.toString();
        java.lang.String str19 = token13.toString();
        java.lang.String str20 = token13.toString();
        boolean boolean21 = token9.equals((java.lang.Object) token13);
        boolean boolean22 = token5.equals((java.lang.Object) token13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj10, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj11, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1" + "'", str16, "-1");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1" + "'", str18, "-1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1" + "'", str19, "-1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1" + "'", str20, "-1");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.035S" + "'", str2, "P0Y0M0DT0H0M0.035S");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        token1.increment();
        java.lang.String str5 = token1.toString();
        int int6 = token1.getCount();
        token1.increment();
        java.lang.Class<?> wildcardClass8 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "####" + "'", str5, "####");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.087S" + "'", str2, "P0Y0M0DT0H0M0.087S");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 10, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 35, (long) 1, "P0Y000DT00000.097-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.097-1" + "'", str3, "P0Y000DT00000.097-1");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", str2, "P0Y0M0DT0H0M0.002S");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
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
        java.lang.String str15 = token2.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "-1" + "'", obj13, "-1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011S" + "'", str15, "P0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011SP0Y0M0DT0H0M0.011S");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "0:00:00.004", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.004" + "'", str3, "0:00:00.004");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.67S" + "'", str2, "P0Y0M0DT0H0M0.67S");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 97, "P0Y000DT00000.0899", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0899" + "'", str5, "P0Y000DT00000.0899");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        token1.increment();
        int int5 = token1.getCount();
        java.lang.Object obj6 = token1.getValue();
        java.lang.Object obj7 = token1.getValue();
        java.lang.String str8 = token1.toString();
        boolean boolean10 = token1.equals((java.lang.Object) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        token1.increment();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "####" + "'", str8, "####");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        token2.increment();
        java.lang.String str4 = token2.toString();
        int int5 = token2.getCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11" + "'", str4, "11");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = token2.getValue();
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        int int9 = token7.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, 98);
        int int13 = token12.getCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        token2.increment();
        java.lang.String str5 = token2.toString();
        boolean boolean7 = token2.equals((java.lang.Object) (short) 10);
        java.lang.Object obj8 = token2.getValue();
        boolean boolean10 = token2.equals((java.lang.Object) "0 0a00");
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean14 = token12.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str15 = token12.toString();
        int int16 = token12.getCount();
        java.lang.String str17 = token12.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str17, (int) 'a');
        int int20 = token19.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int20);
        java.lang.Object obj22 = token21.getValue();
        boolean boolean23 = token2.equals(obj22);
        java.lang.String str24 = token2.toString();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1" + "'", str15, "-1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 97 + "'", obj22, 97);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str24, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) '4');
        java.lang.Object obj5 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj5);
        int int7 = token6.getCount();
        java.lang.String str8 = token6.toString();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "#");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "#");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int2 = token1.getCount();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        java.lang.Object obj4 = token2.getValue();
        java.lang.Object obj5 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token7.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, (int) 'a');
        int int11 = token10.getCount();
        boolean boolean12 = token2.equals((java.lang.Object) token10);
        java.lang.String str13 = token2.toString();
        java.lang.String str14 = token2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 1 + "'", obj4, (short) 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 10, "P0Y000DT00000.0020");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0020" + "'", str3, "P0Y000DT00000.0020");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        token4.increment();
        java.lang.Class<?> wildcardClass6 = token4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) 98, "P0Y000DT00000.002-88");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.002-88" + "'", str3, "P0Y000DT00000.002-88");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.009-30", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.009-30" + "'", str3, "P0Y000DT00000.009-30");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int19 = token18.getCount();
        java.lang.String str20 = token18.toString();
        java.lang.String str21 = token18.toString();
        java.lang.String str22 = token18.toString();
        token18.increment();
        java.lang.String str24 = token18.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token26 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18, 4);
        int int27 = token26.getCount();
        boolean boolean28 = token11.equals((java.lang.Object) token26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1" + "'", str20, "1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "11" + "'", str24, "11");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (byte) -1, "P0Y000DT00000.661");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.661" + "'", str3, "P0Y000DT00000.661");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.32S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.32S");
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
        int int18 = token14.getCount();
        java.lang.Class<?> wildcardClass19 = token14.getClass();
        boolean boolean20 = token2.equals((java.lang.Object) wildcardClass19);
        token2.increment();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "M", 98);
        java.lang.Class<?> wildcardClass3 = token2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 5, 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.96S" + "'", str2, "P0Y0M0DT0H0M0.96S");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "10", (int) (short) 1);
        java.lang.String str3 = token2.toString();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 2);
        token6.increment();
        token6.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 2, (long) 2, "P0Y0M0DT0H0M0.36S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.360" + "'", str5, "P0Y000DT00000.360");
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.0014");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0014" + "'", str2, "P0Y000DT00000.0014");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "0:00:00.010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.010" + "'", str2, "0:00:00.010");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 4, (long) (-1), "", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 35, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 11, "0 days 0 hours 0 minutes 0 seconds");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str2, "0 0a000 0 hour 0 0inute00 0 econ00");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 11, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 34, (long) 100, "P0Y0M0DT0H0M0.64S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6466" + "'", str3, "P0Y000DT00000.6466");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 1, "####");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####" + "'", str3, "####");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        int int4 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int4, (int) (short) 100);
        boolean boolean8 = token6.equals((java.lang.Object) "P0Y000DT00000.100-1");
        token6.increment();
        java.lang.String str10 = token6.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str10, "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 4, "P0Y000DT00000.66-53");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.66-53" + "'", str2, "P0Y000DT00000.66-53");
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, 10);
        int int10 = token7.getCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 10, "P0Y000DT00000.002");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.002" + "'", str3, "P0Y000DT00000.002");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 34, (long) 98, "P0Y000DT00000.052-99", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.052-99" + "'", str5, "P0Y000DT00000.052-99");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 10, "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 32, "P0Y000DT00000.05235");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05235" + "'", str3, "P0Y000DT00000.05235");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) 0, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        boolean boolean11 = token7.equals((java.lang.Object) (byte) 100);
        int int12 = token7.getCount();
        boolean boolean14 = token7.equals((java.lang.Object) "d");
        boolean boolean15 = token2.equals((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.Class<?> wildcardClass17 = token16.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 1, (int) (short) 100);
        java.lang.Object obj3 = token2.getValue();
        java.lang.Object obj4 = token2.getValue();
        java.lang.String str5 = token2.toString();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 1 + "'", obj3, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 1 + "'", obj4, (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str5, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int6 = token5.getCount();
        java.lang.String str7 = token5.toString();
        java.lang.String str8 = token5.toString();
        java.lang.String str9 = token5.toString();
        boolean boolean10 = token2.equals((java.lang.Object) token5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 52, (long) (-1), "P0Y000DT00000.087-33", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.087-33" + "'", str5, "P0Y000DT00000.087-33");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.010S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0100" + "'", str3, "P0Y000DT00000.0100");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        java.lang.Object obj3 = token2.getValue();
        java.lang.Object obj4 = token2.getValue();
        token2.increment();
        int int6 = token2.getCount();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) -1 + "'", obj3, (short) -1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1);
        boolean boolean9 = token5.equals((java.lang.Object) token8);
        java.lang.Object obj10 = token5.getValue();
        java.lang.Object obj11 = token5.getValue();
        java.lang.Class<?> wildcardClass12 = token5.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        java.lang.String str14 = token13.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "1");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "1");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean3 = token1.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str6, (int) 'a');
        int int9 = token8.getCount();
        java.lang.String str10 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean17 = token15.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15);
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18);
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1);
        boolean boolean22 = token18.equals((java.lang.Object) token21);
        boolean boolean23 = token12.equals((java.lang.Object) token18);
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100", 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        int int30 = token29.getCount();
        java.lang.Class<?> wildcardClass31 = token29.getClass();
        boolean boolean32 = token27.equals((java.lang.Object) token29);
        boolean boolean33 = token12.equals((java.lang.Object) token29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str10, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (-1));
        token4.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        java.lang.Object obj7 = token6.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10L);
        java.lang.Object obj2 = token1.getValue();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass3);
        java.lang.Object obj6 = token5.getValue();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10L + "'", obj2, 10L);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.Long");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.Long");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.Long");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        token1.increment();
        boolean boolean4 = token1.equals((java.lang.Object) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        java.lang.String str4 = token2.toString();
        java.lang.String str5 = token2.toString();
        java.lang.String str6 = token2.toString();
        int int7 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        int int10 = token9.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 2, (long) 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.033S" + "'", str2, "P0Y0M0DT0H0M0.033S");
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 2, (long) 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.003S" + "'", str2, "P0Y0M0DT0H0M0.003S");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 4, (long) 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.98S" + "'", str2, "P0Y0M0DT0H0M0.98S");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 98, "0:00:00.004");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.004" + "'", str3, "0:00:00.004");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15);
        java.lang.Class<?> wildcardClass17 = token15.getClass();
        boolean boolean18 = token13.equals((java.lang.Object) wildcardClass17);
        token13.increment();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str7, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str11, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "0 days 0 hours 0 minutes 0 seconds", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str3, "0 0a000 0 hour 0 0inute00 0 econ00");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = token2.getValue();
        int int6 = token2.getCount();
        java.lang.String str7 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        boolean boolean12 = token10.equals((java.lang.Object) (-1.0d));
        int int13 = token10.getCount();
        token10.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token16.increment();
        token16.increment();
        boolean boolean20 = token16.equals((java.lang.Object) "P0Y000DT00000.7510");
        java.lang.String str21 = token16.toString();
        java.lang.Class<?> wildcardClass22 = token16.getClass();
        boolean boolean23 = token10.equals((java.lang.Object) wildcardClass22);
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass22);
        boolean boolean25 = token2.equals((java.lang.Object) token24);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "###" + "'", str21, "###");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        java.lang.Class<?> wildcardClass6 = token3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 34, "-2", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2" + "'", str3, "-2");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10, (int) (byte) 1);
        int int8 = token7.getCount();
        boolean boolean9 = token4.equals((java.lang.Object) token7);
        java.lang.Object obj10 = token4.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, 11);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "##");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "##");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.031S" + "'", str2, "P0Y0M0DT0H0M0.031S");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str2, "P0Y0M0DT0H0M0.034S");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.004S" + "'", str2, "P0Y0M0DT0H0M0.004S");
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        java.lang.String str3 = token2.toString();
        java.lang.String str4 = token2.toString();
        java.lang.Object obj5 = token2.getValue();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj8 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.0025", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0025" + "'", str3, "P0Y000DT00000.0025");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.011S", 3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        java.lang.String str7 = token6.toString();
        boolean boolean8 = token2.equals((java.lang.Object) token6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str7, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        java.lang.Object obj2 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        java.lang.String str7 = token6.toString();
        boolean boolean9 = token6.equals((java.lang.Object) "10");
        boolean boolean10 = token1.equals((java.lang.Object) boolean9);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + '4' + "'", obj2, '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (-1));
        token4.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        java.lang.Object obj7 = token6.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean11 = token9.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj15 = token14.getValue();
        token14.increment();
        java.lang.String str17 = token14.toString();
        java.lang.String str18 = token14.toString();
        boolean boolean19 = token9.equals((java.lang.Object) str18);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean19);
        boolean boolean21 = token6.equals((java.lang.Object) boolean19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str17, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str18, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 3, (long) (byte) 10, "P0Y000DT00000.660", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.660" + "'", str5, "P0Y000DT00000.660");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        int int2 = token1.getCount();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 11);
        boolean boolean7 = token1.equals((java.lang.Object) "d");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 32, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 52, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 10);
        java.lang.Object obj5 = token2.getValue();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + '#' + "'", obj5, '#');
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, (int) ' ');
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str5 = token4.toString();
        int int6 = token4.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, (int) (short) 0);
        java.lang.Class<?> wildcardClass9 = token8.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str5, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
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
        token11.increment();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "##");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "##");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', (int) (byte) 100);
        boolean boolean6 = token2.equals((java.lang.Object) (byte) 100);
        java.lang.String str7 = token2.toString();
        java.lang.Object obj8 = token2.getValue();
        int int9 = token2.getCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 1);
        int int3 = token2.getCount();
        java.lang.String str4 = token2.toString();
        java.lang.String str5 = token2.toString();
        int int6 = token2.getCount();
        token2.increment();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.97S");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '#');
        token1.increment();
        token1.increment();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str6 = token1.toString();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        token8.increment();
        java.lang.Object obj10 = token8.getValue();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "####" + "'", str6, "####");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "#####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "#####");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "#####");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 11, "P0Y000DT00000.780");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.780" + "'", str3, "P0Y000DT00000.780");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.7210");
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (byte) 100, "P0Y000DT00000.88-9", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.88-9" + "'", str5, "P0Y000DT00000.88-9");
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        java.lang.Object obj0 = new java.lang.Object();
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) -1);
        boolean boolean5 = token3.equals((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        java.lang.Object obj6 = token3.getValue();
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        boolean boolean9 = token1.equals((java.lang.Object) token3);
        int int10 = token1.getCount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (-1));
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) "10");
        int int6 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.042S" + "'", str2, "P0Y0M0DT0H0M0.042S");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.95S" + "'", str2, "P0Y0M0DT0H0M0.95S");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), 0L, "P0Y0M0DT0H0M0.023S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0231" + "'", str5, "P0Y000DT00000.0231");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 'a', "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str3, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.9231", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9231" + "'", str3, "P0Y000DT00000.9231");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 2, (long) (-1), "1010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1010" + "'", str3, "1010");
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, 1L, "P0Y000DT00000.521");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.521" + "'", str3, "P0Y000DT00000.521");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.087-33", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.087-33" + "'", str3, "P0Y000DT00000.087-33");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.10033");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.10033" + "'", str2, "P0Y000DT00000.10033");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 2, (long) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.98S" + "'", str2, "P0Y0M0DT0H0M0.98S");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "10101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010" + "'", str3, "10101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S", 97);
        java.lang.Object obj3 = token2.getValue();
        java.lang.Object obj4 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Class<?> wildcardClass6 = token5.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj4, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 2, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.011S", 3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 3);
        token3.increment();
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y0M0DT0H0M0.064S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0641" + "'", str2, "P0Y000DT00000.0641");
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, 1L, "P0Y000DT00000.090-64", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.090-64" + "'", str5, "P0Y000DT00000.090-64");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 3, (long) 5, "P0Y000DT00000.521", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.521" + "'", str5, "P0Y000DT00000.521");
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4', 35);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(100L, (long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0econ00");
        token1.increment();
        boolean boolean4 = token1.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = token1.getValue();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int8 = token1.getCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "0 0econ00" + "'", obj5, "0 0econ00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }
}

